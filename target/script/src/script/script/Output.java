/**
 */
package script.script;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link script.script.Output#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see script.script.scriptPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends Variable {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link script.script.Operation#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' reference.
	 * @see #setExpression(Operation)
	 * @see script.script.scriptPackage#getOutput_Expression()
	 * @see script.script.Operation#getOutputs
	 * @model opposite="outputs"
	 * @generated
	 */
	Operation getExpression();

	/**
	 * Sets the value of the '{@link script.script.Output#getExpression <em>Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Operation value);

} // Output
