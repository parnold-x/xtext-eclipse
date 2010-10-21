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

import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.emf.ecore.EObject;

/**
 * The railroad diagram figure. A railroad diagram consists of {@link RailroadTrack}s
 * 
 * @author Jan Koehnlein - Initial contribution and API
 */
public class RailroadDiagram extends AbstractSegmentFigure {

	public RailroadDiagram(EObject eObject, List<ISegmentFigure> children) {
		super(eObject);
		setOpaque(true);
		setBackgroundColor(ColorConstants.white);
		for (ISegmentFigure child : children) 
			add(child);
	}

	@Override
	protected LayoutManager createLayoutManager() {
		ToolbarLayout layout = new ToolbarLayout();
		layout.setSpacing(ILayoutConstants.VSPACE_BETWEEN_TRACKS);
		return layout;
	}
	
	@Override
	protected boolean useLocalCoordinates() {
		return false;
	}
	
}
