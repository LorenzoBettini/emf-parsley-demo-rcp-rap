package emf.parsley.demo.mail.app.rap;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.WorkbenchAdvisor;

import emf.parsley.demo.mail.app.common.ApplicationWorkbenchAdvisor;

/**
 * This class controls all aspects of the application's execution
 */
public class MailApplication implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		Display display = PlatformUI.createDisplay();
		WorkbenchAdvisor advisor = new ApplicationWorkbenchAdvisor();
		return PlatformUI.createAndRunWorkbench(display, advisor);
	}

	@Override
	public void stop() {
		// Do nothing
	}
}
