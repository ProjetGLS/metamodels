/**
 */
package script.script;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.script.OperationType#getNbOperands <em>Nb Operands</em>}</li>
 *   <li>{@link script.script.OperationType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see script.script.scriptPackage#getOperationType()
 * @model
 * @generated
 */
public interface OperationType extends OperationTypeElement {
	/**
	 * Returns the value of the '<em><b>Nb Operands</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nb Operands</em>' attribute.
	 * @see #setNbOperands(int)
	 * @see script.script.scriptPackage#getOperationType_NbOperands()
	 * @model required="true"
	 * @generated
	 */
	int getNbOperands();

	/**
	 * Sets the value of the '{@link script.script.OperationType#getNbOperands <em>Nb Operands</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Operands</em>' attribute.
	 * @see #getNbOperands()
	 * @generated
	 */
	void setNbOperands(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see script.script.scriptPackage#getOperationType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link script.script.OperationType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // OperationType
