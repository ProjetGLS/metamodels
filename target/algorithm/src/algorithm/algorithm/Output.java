/**
 */
package algorithm.algorithm;

import org.eclipse.emf.ecore.EObject;

import table.Column;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithm.algorithm.Output#getColumn <em>Column</em>}</li>
 *   <li>{@link algorithm.algorithm.Output#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link algorithm.algorithm.Output#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see algorithm.algorithm.algorithmPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends EObject {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link table.Column#getDerivateFrom <em>Derivate From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference.
	 * @see #setColumn(Column)
	 * @see algorithm.algorithm.algorithmPackage#getOutput_Column()
	 * @see table.Column#getDerivateFrom
	 * @model opposite="derivateFrom" required="true"
	 * @generated
	 */
	Column getColumn();

	/**
	 * Sets the value of the '{@link algorithm.algorithm.Output#getColumn <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Column value);

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link algorithm.algorithm.Algorithm#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' container reference.
	 * @see #setAlgorithm(Algorithm)
	 * @see algorithm.algorithm.algorithmPackage#getOutput_Algorithm()
	 * @see algorithm.algorithm.Algorithm#getOutput
	 * @model opposite="output" required="true" transient="false"
	 * @generated
	 */
	Algorithm getAlgorithm();

	/**
	 * Sets the value of the '{@link algorithm.algorithm.Output#getAlgorithm <em>Algorithm</em>}' container reference.
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
	 * @see #setScript(script.Output)
	 * @see algorithm.algorithm.algorithmPackage#getOutput_Script()
	 * @model required="true"
	 * @generated
	 */
	script.Output getScript();

	/**
	 * Sets the value of the '{@link algorithm.algorithm.Output#getScript <em>Script</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(script.Output value);

} // Output
