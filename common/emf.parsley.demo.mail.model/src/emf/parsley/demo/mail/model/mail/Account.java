/**
 */
package emf.parsley.demo.mail.model.mail;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link emf.parsley.demo.mail.model.mail.Account#getName <em>Name</em>}</li>
 *   <li>{@link emf.parsley.demo.mail.model.mail.Account#getEmail <em>Email</em>}</li>
 *   <li>{@link emf.parsley.demo.mail.model.mail.Account#getFolders <em>Folders</em>}</li>
 * </ul>
 *
 * @see emf.parsley.demo.mail.model.mail.MailPackage#getAccount()
 * @model
 * @generated
 */
public interface Account extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see emf.parsley.demo.mail.model.mail.MailPackage#getAccount_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link emf.parsley.demo.mail.model.mail.Account#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see emf.parsley.demo.mail.model.mail.MailPackage#getAccount_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link emf.parsley.demo.mail.model.mail.Account#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Folders</b></em>' containment reference list.
	 * The list contents are of type {@link emf.parsley.demo.mail.model.mail.Folder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folders</em>' containment reference list.
	 * @see emf.parsley.demo.mail.model.mail.MailPackage#getAccount_Folders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Folder> getFolders();

} // Account
