/**
 */
package algorithm.algorithm;

import org.eclipse.emf.ecore.EObject;

import table.Column;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithm.algorithm.Input#getColumn <em>Column</em>}</li>
 *   <li>{@link algorithm.algorithm.Input#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link algorithm.algorithm.Input#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see algorithm.algorithm.algorithmPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference.
	 * @see #setColumn(Column)
	 * @see algorithm.algorithm.algorithmPackage#getInput_Column()
	 * @model required="true"
	 * @generated
	 */
	Column getColumn();

	/**
	 * Sets the value of the '{@link algorithm.algorithm.Input#getColumn <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Column value);

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link algorithm.algorithm.Algorithm#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' container reference.
	 * @see #setAlgorithm(Algorithm)
	 * @see algorithm.algorithm.algorithmPackage#getInput_Algorithm()
	 * @see algorithm.algorithm.Algorithm#getInputs
	 * @model opposite="inputs" required="true" transient="false"
	 * @generated
	 */
	Algorithm getAlgorithm();

	/**
	 * Sets the value of the '{@link algorithm.algorithm.Input#getAlgorithm <em>Algorithm</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' container reference.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(Algorithm value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' reference.
	 * @see #setScript(script.Input)
	 * @see algorithm.algorithm.algorithmPackage#getInput_Script()
	 * @model required="true"
	 * @generated
	 */
	script.Input getScript();

	/**
	 * Sets the value of the '{@link algorithm.algorithm.Input#getScript <em>Script</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(script.Input value);

} // Input
