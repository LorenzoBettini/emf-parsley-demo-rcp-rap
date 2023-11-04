/*******************************************************************************
 * Copyright (c) 2013 RCP Vision (http://www.rcp-vision.com) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Lorenzo Bettini - initial API and implementation
 *******************************************************************************/
package emf.parsley.demo.mail.views;

import org.eclipse.emf.parsley.views.OnSelectionReadOnlyFormView;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

import emf.parsley.demo.mail.model.mail.MailPackage;

public class MessageView extends OnSelectionReadOnlyFormView {

	public static final String ID = "emf.parsley.demo.mail.views.MessageView";

	@Override
	protected void updateOnSelection(IWorkbenchPart sourcepart,
			ISelection selection) {
		// we want to display only Mail elements
		if (!MailPackage.Literals.MAIL
				.isInstance(getFirstSelectedEObject(selection))) {
			resetFormComposite();
			return;
		}

		super.updateOnSelection(sourcepart, selection);
	}
}
