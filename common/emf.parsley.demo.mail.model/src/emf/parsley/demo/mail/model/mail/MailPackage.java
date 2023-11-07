/**
 */
package emf.parsley.demo.mail.model.mail;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see emf.parsley.demo.mail.model.mail.MailFactory
 * @model kind="package"
 * @generated
 */
public interface MailPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mail";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///org/eclipse/emf/parsley/examples/mail/mail.ecore/0.1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mail";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MailPackage eINSTANCE = emf.parsley.demo.mail.model.mail.impl.MailPackageImpl.init();

	/**
	 * The meta object id for the '{@link emf.parsley.demo.mail.model.mail.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.parsley.demo.mail.model.mail.impl.AccountImpl
	 * @see emf.parsley.demo.mail.model.mail.impl.MailPackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__FOLDERS = 2;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link emf.parsley.demo.mail.model.mail.impl.FolderImpl <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.parsley.demo.mail.model.mail.impl.FolderImpl
	 * @see emf.parsley.demo.mail.model.mail.impl.MailPackageImpl#getFolder()
	 * @generated
	 */
	int FOLDER = 1;

	/**
	 * The feature id for the '<em><b>Subfolders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__SUBFOLDERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Mails</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__MAILS = 2;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link emf.parsley.demo.mail.model.mail.impl.MailImpl <em>Mail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see emf.parsley.demo.mail.model.mail.impl.MailImpl
	 * @see emf.parsley.demo.mail.model.mail.impl.MailPackageImpl#getMail()
	 * @generated
	 */
	int MAIL = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL__FROM = 0;

	/**
	 * The feature id for the '<em><b>Recipients</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL__RECIPIENTS = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL__MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL__SUBJECT = 3;

	/**
	 * The number of structural features of the '<em>Mail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link emf.parsley.demo.mail.model.mail.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see emf.parsley.demo.mail.model.mail.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the attribute '{@link emf.parsley.demo.mail.model.mail.Account#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see emf.parsley.demo.mail.model.mail.Account#getName()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Name();

	/**
	 * Returns the meta object for the attribute '{@link emf.parsley.demo.mail.model.mail.Account#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see emf.parsley.demo.mail.model.mail.Account#getEmail()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Email();

	/**
	 * Returns the meta object for the containment reference list '{@link emf.parsley.demo.mail.model.mail.Account#getFolders <em>Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folders</em>'.
	 * @see emf.parsley.demo.mail.model.mail.Account#getFolders()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_Folders();

	/**
	 * Returns the meta object for class '{@link emf.parsley.demo.mail.model.mail.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see emf.parsley.demo.mail.model.mail.Folder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link emf.parsley.demo.mail.model.mail.Folder#getSubfolders <em>Subfolders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subfolders</em>'.
	 * @see emf.parsley.demo.mail.model.mail.Folder#getSubfolders()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Subfolders();

	/**
	 * Returns the meta object for the attribute '{@link emf.parsley.demo.mail.model.mail.Folder#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see emf.parsley.demo.mail.model.mail.Folder#getName()
	 * @see #getFolder()
	 * @generated
	 */
	EAttribute getFolder_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link emf.parsley.demo.mail.model.mail.Folder#getMails <em>Mails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mails</em>'.
	 * @see emf.parsley.demo.mail.model.mail.Folder#getMails()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Mails();

	/**
	 * Returns the meta object for class '{@link emf.parsley.demo.mail.model.mail.Mail <em>Mail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mail</em>'.
	 * @see emf.parsley.demo.mail.model.mail.Mail
	 * @generated
	 */
	EClass getMail();

	/**
	 * Returns the meta object for the attribute '{@link emf.parsley.demo.mail.model.mail.Mail#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see emf.parsley.demo.mail.model.mail.Mail#getFrom()
	 * @see #getMail()
	 * @generated
	 */
	EAttribute getMail_From();

	/**
	 * Returns the meta object for the attribute list '{@link emf.parsley.demo.mail.model.mail.Mail#getRecipients <em>Recipients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Recipients</em>'.
	 * @see emf.parsley.demo.mail.model.mail.Mail#getRecipients()
	 * @see #getMail()
	 * @generated
	 */
	EAttribute getMail_Recipients();

	/**
	 * Returns the meta object for the attribute '{@link emf.parsley.demo.mail.model.mail.Mail#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see emf.parsley.demo.mail.model.mail.Mail#getMessage()
	 * @see #getMail()
	 * @generated
	 */
	EAttribute getMail_Message();

	/**
	 * Returns the meta object for the attribute '{@link emf.parsley.demo.mail.model.mail.Mail#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject</em>'.
	 * @see emf.parsley.demo.mail.model.mail.Mail#getSubject()
	 * @see #getMail()
	 * @generated
	 */
	EAttribute getMail_Subject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MailFactory getMailFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link emf.parsley.demo.mail.model.mail.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.parsley.demo.mail.model.mail.impl.AccountImpl
		 * @see emf.parsley.demo.mail.model.mail.impl.MailPackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__NAME = eINSTANCE.getAccount_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__EMAIL = eINSTANCE.getAccount_Email();

		/**
		 * The meta object literal for the '<em><b>Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__FOLDERS = eINSTANCE.getAccount_Folders();

		/**
		 * The meta object literal for the '{@link emf.parsley.demo.mail.model.mail.impl.FolderImpl <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.parsley.demo.mail.model.mail.impl.FolderImpl
		 * @see emf.parsley.demo.mail.model.mail.impl.MailPackageImpl#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Subfolders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__SUBFOLDERS = eINSTANCE.getFolder_Subfolders();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER__NAME = eINSTANCE.getFolder_Name();

		/**
		 * The meta object literal for the '<em><b>Mails</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__MAILS = eINSTANCE.getFolder_Mails();

		/**
		 * The meta object literal for the '{@link emf.parsley.demo.mail.model.mail.impl.MailImpl <em>Mail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see emf.parsley.demo.mail.model.mail.impl.MailImpl
		 * @see emf.parsley.demo.mail.model.mail.impl.MailPackageImpl#getMail()
		 * @generated
		 */
		EClass MAIL = eINSTANCE.getMail();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIL__FROM = eINSTANCE.getMail_From();

		/**
		 * The meta object literal for the '<em><b>Recipients</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIL__RECIPIENTS = eINSTANCE.getMail_Recipients();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIL__MESSAGE = eINSTANCE.getMail_Message();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIL__SUBJECT = eINSTANCE.getMail_Subject();

	}

} //MailPackage
