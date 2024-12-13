/**
 */
package script;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.Output#getInternalOutput <em>Internal Output</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends EObject {
	/**
	 * Returns the value of the '<em><b>Internal Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Output</em>' reference.
	 * @see #setInternalOutput(InternalOutput)
	 * @see script.ScriptPackage#getOutput_InternalOutput()
	 * @model required="true"
	 * @generated
	 */
	InternalOutput getInternalOutput();

	/**
	 * Sets the value of the '{@link script.Output#getInternalOutput <em>Internal Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Output</em>' reference.
	 * @see #getInternalOutput()
	 * @generated
	 */
	void setInternalOutput(InternalOutput value);

} // Output
