/**
 */
package script;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.InternalInput#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see script.ScriptPackage#getInternalInput()
 * @model
 * @generated
 */
public interface InternalInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see script.ScriptPackage#getInternalInput_Variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link script.InternalInput#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

} // InternalInput
