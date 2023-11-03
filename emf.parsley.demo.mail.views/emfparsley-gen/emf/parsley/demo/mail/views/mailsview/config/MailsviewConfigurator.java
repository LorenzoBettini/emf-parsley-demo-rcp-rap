package emf.parsley.demo.mail.views.mailsview.config;

import emf.parsley.demo.mail.model.mail.MailPackage;
import emf.parsley.demo.mail.views.MailsView;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.parsley.config.Configurator;

@SuppressWarnings("all")
public class MailsviewConfigurator extends Configurator {
  public EClass eClass(final MailsView it) {
    return MailPackage.Literals.MAIL;
  }
}
