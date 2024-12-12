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
 *   <li>{@link script.script.Operation#getArity <em>Arity</em>}</li>
 *   <li>{@link script.script.Operation#isInfix <em>Infix</em>}</li>
 *   <li>{@link script.script.Operation#getInputs <em>Inputs</em>}</li>
 *   <li>{@link script.script.Operation#getOutput <em>Output</em>}</li>
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
	 * Returns the value of the '<em><b>Arity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arity</em>' attribute.
	 * @see #setArity(int)
	 * @see script.script.scriptPackage#getOperation_Arity()
	 * @model required="true"
	 * @generated
	 */
	int getArity();

	/**
	 * Sets the value of the '{@link script.script.Operation#getArity <em>Arity</em>}' attribute.
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
	 * @see script.script.scriptPackage#getOperation_Infix()
	 * @model required="true"
	 * @generated
	 */
	boolean isInfix();

	/**
	 * Sets the value of the '{@link script.script.Operation#isInfix <em>Infix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infix</em>' attribute.
	 * @see #isInfix()
	 * @generated
	 */
	void setInfix(boolean value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link script.script.InternalInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see script.script.scriptPackage#getOperation_Inputs()
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
	 * @see script.script.scriptPackage#getOperation_Output()
	 * @model required="true"
	 * @generated
	 */
	InternalOutput getOutput();

	/**
	 * Sets the value of the '{@link script.script.Operation#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(InternalOutput value);

} // Operation
