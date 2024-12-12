/**
 */
package algorithm;

import org.eclipse.emf.common.util.EList;

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
	 * Returns the value of the '<em><b>Column</b></em>' reference list.
	 * The list contents are of type {@link table.table.Column}.
	 * It is bidirectional and its opposite is '{@link table.table.Column#getDerivateFrom <em>Derivate From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference list.
	 * @see algorithm.AlgorithmPackage#getOutput_Column()
	 * @see table.table.Column#getDerivateFrom
	 * @model opposite="derivateFrom" required="true"
	 * @generated
	 */
	EList<Column> getColumn();

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
	 * Returns the value of the '<em><b>Script</b></em>' reference list.
	 * The list contents are of type {@link script.script.Output}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' reference list.
	 * @see algorithm.AlgorithmPackage#getOutput_Script()
	 * @model required="true"
	 * @generated
	 */
	EList<script.script.Output> getScript();

} // Output
