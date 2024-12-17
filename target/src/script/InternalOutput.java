/**
 */
package src.script;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link src.script.InternalOutput#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see src.script.scriptPackage#getInternalOutput()
 * @model
 * @generated
 */
public interface InternalOutput extends Variable {

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link src.script.Operation#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' container reference.
	 * @see #setOperation(Operation)
	 * @see src.script.scriptPackage#getInternalOutput_Operation()
	 * @see src.script.Operation#getOutput
	 * @model opposite="output" required="true" transient="false"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link src.script.InternalOutput#getOperation <em>Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' container reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);
} // InternalOutput
