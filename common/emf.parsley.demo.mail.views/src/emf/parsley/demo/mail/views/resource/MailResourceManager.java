package emf.parsley.demo.mail.views.resource;

import org.eclipse.emf.parsley.resource.ResourceManager;

import emf.parsley.demo.mail.model.mail.Account;
import emf.parsley.demo.mail.model.mail.Folder;
import emf.parsley.demo.mail.model.mail.Mail;
import emf.parsley.demo.mail.model.mail.MailFactory;

/**
 * This will be used as the base class for the resourceManager specified in the
 * parsley file; this class contains some utility methods.
 */
public class MailResourceManager extends ResourceManager {

	int counter = 0;

	protected Account createAccount(String name, String email) {
		Account account = MailFactory.eINSTANCE.createAccount();
		account.setName(name);
		account.setEmail(email);
		return account;
	}

	protected void createDefaultFolders(Account account) {
		Folder folder = createFolder(account, "Inbox");
		createMail(folder);
		createMail(folder);

		createFolder(account, "Sent");
		createFolder(account, "Trash");

		createFolder(account, "myfolder");
		folder = createFolder(account, "myfolder2");
		createSubFolder(folder, "sub1");
		createSubFolder(folder, "sub2");
	}

	protected Folder createFolder(Account account, String name) {
		Folder folder = MailFactory.eINSTANCE.createFolder();
		folder.setName(name);
		account.getFolders().add(folder);
		return folder;
	}

	protected Folder createSubFolder(Folder parent, String name) {
		Folder folder = MailFactory.eINSTANCE.createFolder();
		folder.setName(name);
		parent.getSubfolders().add(folder);
		return folder;
	}

	protected void createMail(Folder folder) {
		Mail mail = MailFactory.eINSTANCE.createMail();
		mail.setFrom("foo@foobar");
		mail.setSubject("Test subject " + (++counter));
		mail.getRecipients().add("dest@foobar");
		mail.setMessage("This is a test message."
				+ "\nNumber " + counter
				+ "\nCheers!");
		folder.getMails().add(mail);
	}
}
