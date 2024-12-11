/**
 */
package script.script;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.script.Script#getScriptElement <em>Script Element</em>}</li>
 *   <li>{@link script.script.Script#getOperationElement <em>Operation Element</em>}</li>
 * </ul>
 *
 * @see script.script.scriptPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends EObject {
	/**
	 * Returns the value of the '<em><b>Script Element</b></em>' containment reference list.
	 * The list contents are of type {@link script.script.ScriptElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Element</em>' containment reference list.
	 * @see script.script.scriptPackage#getScript_ScriptElement()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<ScriptElement> getScriptElement();

	/**
	 * Returns the value of the '<em><b>Operation Element</b></em>' containment reference list.
	 * The list contents are of type {@link script.script.OperationTypeElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Element</em>' containment reference list.
	 * @see script.script.scriptPackage#getScript_OperationElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationTypeElement> getOperationElement();

} // Script
