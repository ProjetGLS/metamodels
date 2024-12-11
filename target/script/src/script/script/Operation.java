/**
 */
package script.script;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.script.Operation#getOperand <em>Operand</em>}</li>
 *   <li>{@link script.script.Operation#getOpType <em>Op Type</em>}</li>
 *   <li>{@link script.script.Operation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see script.script.scriptPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends ScriptElement {
	/**
	 * Returns the value of the '<em><b>Operand</b></em>' reference list.
	 * The list contents are of type {@link script.script.ScriptElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand</em>' reference list.
	 * @see script.script.scriptPackage#getOperation_Operand()
	 * @model
	 * @generated
	 */
	EList<ScriptElement> getOperand();

	/**
	 * Returns the value of the '<em><b>Op Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Type</em>' reference.
	 * @see #setOpType(OperationTypeElement)
	 * @see script.script.scriptPackage#getOperation_OpType()
	 * @model required="true"
	 * @generated
	 */
	OperationTypeElement getOpType();

	/**
	 * Sets the value of the '{@link script.script.Operation#getOpType <em>Op Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Type</em>' reference.
	 * @see #getOpType()
	 * @generated
	 */
	void setOpType(OperationTypeElement value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see script.script.scriptPackage#getOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link script.script.Operation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Operation
