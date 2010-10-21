/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *   Jan Koehnlein - Initial API and implementation
 *******************************************************************************/
package org.eclipse.xtext.xtext.ui.graph.figures;

import org.eclipse.draw2d.LayoutManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xtext.ui.graph.figures.layouts.ParallelLayout;
import org.eclipse.xtext.xtext.ui.graph.figures.primitives.PrimitiveFigureFactory;

/**
 * A segment with an additional recursive connection from the exit to the entry of the child segment.
 * 
 * @author Jan Koehnlein - Initial contribution and API
 */
public class LoopSegment extends AbstractSegmentFigure {

	public LoopSegment(EObject eObject, ISegmentFigure child, PrimitiveFigureFactory primitiveFactory) {
		super(eObject);
		setEntry(primitiveFactory.createCrossPoint(this));
		CrossPointSegment crossPointSegment = new CrossPointSegment(eObject, primitiveFactory);
		if(ILayoutConstants.ROUTE_MULTIPLE_TOP) {
			add(crossPointSegment);
			add(child);
		} else {
			add(child);
			add(crossPointSegment);
		}
		setExit(primitiveFactory.createCrossPoint(this));
		primitiveFactory.createConnection(getExit(), crossPointSegment.getExit(), this, ILayoutConstants.CONVEX_START);
		primitiveFactory.createConnection(crossPointSegment.getEntry(), getEntry(), this, ILayoutConstants.CONVEX_END);
		primitiveFactory.createConnection(getExit(), child.getExit(), this, ILayoutConstants.CONCAVE_START);
		primitiveFactory.createConnection(child.getEntry(), getEntry(), this, ILayoutConstants.CONCAVE_END);
	}

	@Override
	protected LayoutManager createLayoutManager() {
		return new ParallelLayout(ILayoutConstants.CONNECTION_RADIUS);
	}

}
