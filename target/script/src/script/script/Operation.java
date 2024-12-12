/**
 */
package script.script;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.script.Operation#getName <em>Name</em>}</li>
 *   <li>{@link script.script.Operation#getInputs <em>Inputs</em>}</li>
 *   <li>{@link script.script.Operation#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see script.script.scriptPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see script.script.scriptPackage#getOperation_Name()
	 * @model required="true"
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

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link script.script.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see script.script.scriptPackage#getOperation_Inputs()
	 * @model
	 * @generated
	 */
	EList<Variable> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link script.script.Output}.
	 * It is bidirectional and its opposite is '{@link script.script.Output#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see script.script.scriptPackage#getOperation_Outputs()
	 * @see script.script.Output#getExpression
	 * @model opposite="expression" required="true"
	 * @generated
	 */
	EList<Output> getOutputs();

} // Operation
