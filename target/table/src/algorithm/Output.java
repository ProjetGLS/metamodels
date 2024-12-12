/**
 */
package algorithm;

import org.eclipse.emf.ecore.EObject;

import table.table.Column;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithm.Output#getColumn <em>Column</em>}</li>
 *   <li>{@link algorithm.Output#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link algorithm.Output#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see algorithm.AlgorithmPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends EObject {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link table.table.Column#getDerivateFrom <em>Derivate From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference.
	 * @see #setColumn(Column)
	 * @see algorithm.AlgorithmPackage#getOutput_Column()
	 * @see table.table.Column#getDerivateFrom
	 * @model opposite="derivateFrom" required="true"
	 * @generated
	 */
	Column getColumn();

	/**
	 * Sets the value of the '{@link algorithm.Output#getColumn <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Column value);

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link algorithm.Algorithm#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' container reference.
	 * @see #setAlgorithm(Algorithm)
	 * @see algorithm.AlgorithmPackage#getOutput_Algorithm()
	 * @see algorithm.Algorithm#getOutput
	 * @model opposite="output" required="true" transient="false"
	 * @generated
	 */
	Algorithm getAlgorithm();

	/**
	 * Sets the value of the '{@link algorithm.Output#getAlgorithm <em>Algorithm</em>}' container reference.
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
	 * @see #setScript(script.script.Output)
	 * @see algorithm.AlgorithmPackage#getOutput_Script()
	 * @model required="true"
	 * @generated
	 */
	script.script.Output getScript();

	/**
	 * Sets the value of the '{@link algorithm.Output#getScript <em>Script</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(script.script.Output value);

} // Output
