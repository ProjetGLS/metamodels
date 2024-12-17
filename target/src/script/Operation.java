/**
 */
package src.script;

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
 *   <li>{@link src.script.Operation#getName <em>Name</em>}</li>
 *   <li>{@link src.script.Operation#getArity <em>Arity</em>}</li>
 *   <li>{@link src.script.Operation#isInfix <em>Infix</em>}</li>
 *   <li>{@link src.script.Operation#getInputs <em>Inputs</em>}</li>
 *   <li>{@link src.script.Operation#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see src.script.scriptPackage#getOperation()
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
	 * @see src.script.scriptPackage#getOperation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link src.script.Operation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Arity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arity</em>' attribute.
	 * @see #setArity(int)
	 * @see src.script.scriptPackage#getOperation_Arity()
	 * @model required="true"
	 * @generated
	 */
	int getArity();

	/**
	 * Sets the value of the '{@link src.script.Operation#getArity <em>Arity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arity</em>' attribute.
	 * @see #getArity()
	 * @generated
	 */
	void setArity(int value);

	/**
	 * Returns the value of the '<em><b>Infix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infix</em>' attribute.
	 * @see #setInfix(boolean)
	 * @see src.script.scriptPackage#getOperation_Infix()
	 * @model required="true"
	 * @generated
	 */
	boolean isInfix();

	/**
	 * Sets the value of the '{@link src.script.Operation#isInfix <em>Infix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infix</em>' attribute.
	 * @see #isInfix()
	 * @generated
	 */
	void setInfix(boolean value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link src.script.InternalInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see src.script.scriptPackage#getOperation_Inputs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<InternalInput> getInputs();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link src.script.InternalOutput#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(InternalOutput)
	 * @see src.script.scriptPackage#getOperation_Output()
	 * @see src.script.InternalOutput#getOperation
	 * @model opposite="operation" containment="true" required="true"
	 * @generated
	 */
	InternalOutput getOutput();

	/**
	 * Sets the value of the '{@link src.script.Operation#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(InternalOutput value);

} // Operation
