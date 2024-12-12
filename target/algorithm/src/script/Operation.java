/**
 */
package script;

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
 *   <li>{@link script.Operation#getName <em>Name</em>}</li>
 *   <li>{@link script.Operation#getArity <em>Arity</em>}</li>
 *   <li>{@link script.Operation#isInfix <em>Infix</em>}</li>
 *   <li>{@link script.Operation#getInputs <em>Inputs</em>}</li>
 *   <li>{@link script.Operation#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getOperation()
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
	 * @see script.ScriptPackage#getOperation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link script.Operation#getName <em>Name</em>}' attribute.
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
	 * @see script.ScriptPackage#getOperation_Arity()
	 * @model required="true"
	 * @generated
	 */
	int getArity();

	/**
	 * Sets the value of the '{@link script.Operation#getArity <em>Arity</em>}' attribute.
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
	 * @see script.ScriptPackage#getOperation_Infix()
	 * @model required="true"
	 * @generated
	 */
	boolean isInfix();

	/**
	 * Sets the value of the '{@link script.Operation#isInfix <em>Infix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infix</em>' attribute.
	 * @see #isInfix()
	 * @generated
	 */
	void setInfix(boolean value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link script.InternalInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see script.ScriptPackage#getOperation_Inputs()
	 * @model required="true"
	 * @generated
	 */
	EList<InternalInput> getInputs();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(InternalOutput)
	 * @see script.ScriptPackage#getOperation_Output()
	 * @model required="true"
	 * @generated
	 */
	InternalOutput getOutput();

	/**
	 * Sets the value of the '{@link script.Operation#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(InternalOutput value);

} // Operation
