package emf.parsley.demo.mail.views.accountsview.resource;

import emf.parsley.demo.mail.model.mail.Account;
import emf.parsley.demo.mail.views.resource.MailResourceManager;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class AccountsviewResourceManager extends MailResourceManager {
  @Override
  public void initialize(final Resource it) {
    Account _createAccount = this.createAccount("Alice", "alice@foobar");
    final Procedure1<Account> _function = (Account account) -> {
      EList<EObject> _contents = it.getContents();
      _contents.add(account);
      this.createDefaultFolders(account);
    };
    ObjectExtensions.<Account>operator_doubleArrow(_createAccount, _function);
    Account _createAccount_1 = this.createAccount("Bob", "bob@foobar");
    final Procedure1<Account> _function_1 = (Account account) -> {
      EList<EObject> _contents = it.getContents();
      _contents.add(account);
      this.createDefaultFolders(account);
    };
    ObjectExtensions.<Account>operator_doubleArrow(_createAccount_1, _function_1);
    Account _createAccount_2 = this.createAccount("Carl", "carl@foobar");
    final Procedure1<Account> _function_2 = (Account account) -> {
      EList<EObject> _contents = it.getContents();
      _contents.add(account);
      this.createDefaultFolders(account);
    };
    ObjectExtensions.<Account>operator_doubleArrow(_createAccount_2, _function_2);
  }
}
