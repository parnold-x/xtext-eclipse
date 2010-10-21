/*******************************************************************************
 * Copyright (c) 2010 itemis AG (http://www.itemis.eu)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 *   Jan Koehnlein - Initial API and implementation
 *******************************************************************************/
package org.eclipse.xtext.xtext.ui.graph.figures.primitives;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.CompoundBorder;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.Region;
import org.eclipse.swt.graphics.Font;

/** 
 * @author Jan Koehnlein - Initial contribution and API
 */
public class RectangleNode extends AbstractNode {

	public RectangleNode(EObject eObject, String text, Font font, Region textRegion) {
		super(eObject, text, font, textRegion);
		setOpaque(true);
	}

	@Override
	protected Border createBorder() {
		MarginBorder marginBorder = new MarginBorder(PADDING - 1);
		LineBorder lineBorder = new LineBorder(1);
		return new CompoundBorder(lineBorder, marginBorder);
	}

}
