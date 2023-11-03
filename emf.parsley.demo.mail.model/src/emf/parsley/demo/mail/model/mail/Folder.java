/**
 */
package emf.parsley.demo.mail.model.mail;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emf.parsley.demo.mail.model.mail.Folder#getSubfolders <em>Subfolders</em>}</li>
 *   <li>{@link emf.parsley.demo.mail.model.mail.Folder#getName <em>Name</em>}</li>
 *   <li>{@link emf.parsley.demo.mail.model.mail.Folder#getMails <em>Mails</em>}</li>
 * </ul>
 *
 * @see emf.parsley.demo.mail.model.mail.MailPackage#getFolder()
 * @model
 * @generated
 */
public interface Folder extends FolderContent {
	/**
	 * Returns the value of the '<em><b>Subfolders</b></em>' containment reference list.
	 * The list contents are of type {@link emf.parsley.demo.mail.model.mail.Folder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subfolders</em>' containment reference list.
	 * @see emf.parsley.demo.mail.model.mail.MailPackage#getFolder_Subfolders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Folder> getSubfolders();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see emf.parsley.demo.mail.model.mail.MailPackage#getFolder_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link emf.parsley.demo.mail.model.mail.Folder#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mails</b></em>' containment reference list.
	 * The list contents are of type {@link emf.parsley.demo.mail.model.mail.Mail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mails</em>' containment reference list.
	 * @see emf.parsley.demo.mail.model.mail.MailPackage#getFolder_Mails()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mail> getMails();

} // Folder
