package emf.parsley.demo.mail.views;

import java.io.IOException;

import org.eclipse.emf.common.command.Command;

public class AccountsView extends org.eclipse.emf.parsley.views.SaveableTreeView {
	/**
	 * Instead of letting the view become dirty, we immediately save the
	 * EMF resource.
	 */
	@Override
	public void mostRecentCommandAffectsResource(Command mostRecentCommand) {
		super.mostRecentCommandAffectsResource(mostRecentCommand);
		try {
			saveResourceAndUpdateDirtyState();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
