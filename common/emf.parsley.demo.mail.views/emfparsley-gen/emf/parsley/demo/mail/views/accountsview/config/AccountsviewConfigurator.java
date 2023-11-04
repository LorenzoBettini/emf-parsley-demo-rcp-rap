package emf.parsley.demo.mail.views.accountsview.config;

import emf.parsley.demo.mail.views.AccountsView;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.parsley.config.Configurator;

@SuppressWarnings("all")
public class AccountsviewConfigurator extends Configurator {
  private final URI mailModelURI = URI.createFileURI(
    (System.getProperty("user.home") + "/examples/mail/My.mail"));

  public URI getMailModelURI() {
    return this.mailModelURI;
  }

  public URI resourceURI(final AccountsView it) {
    return this.mailModelURI;
  }
}
