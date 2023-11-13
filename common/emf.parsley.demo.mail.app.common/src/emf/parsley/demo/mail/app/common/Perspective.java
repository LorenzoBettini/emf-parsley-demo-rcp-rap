package emf.parsley.demo.mail.app.common;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import emf.parsley.demo.mail.views.AccountsView;
import emf.parsley.demo.mail.views.MailsView;
import emf.parsley.demo.mail.views.MessageView;

public class Perspective implements IPerspectiveFactory {
	/**
	 * The ID of the perspective as specified in the extension.
	 */
	public static final String ID = "emf.parsley.demo.mail.perspective";

	@Override
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);

		IFolderLayout folder = layout.createFolder("Accounts", IPageLayout.LEFT, 0.25f, editorArea);
		folder.addView(AccountsView.ID);
		layout.getViewLayout(AccountsView.ID).setCloseable(false);

		layout.addStandaloneView(MailsView.ID, true, IPageLayout.TOP, 0.25f, editorArea);
		layout.getViewLayout(MailsView.ID).setCloseable(false);

		layout.addStandaloneView(MessageView.ID, true, IPageLayout.BOTTOM, 0.25f, editorArea);
		layout.getViewLayout(MessageView.ID).setCloseable(false);
	}
}
