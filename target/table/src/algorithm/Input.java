/**
 */
package algorithm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import table.table.Column;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithm.Input#getColumn <em>Column</em>}</li>
 *   <li>{@link algorithm.Input#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link algorithm.Input#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @see algorithm.AlgorithmPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends EObject {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference list.
	 * The list contents are of type {@link table.table.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference list.
	 * @see algorithm.AlgorithmPackage#getInput_Column()
	 * @model
	 * @generated
	 */
	EList<Column> getColumn();

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link algorithm.Algorithm#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' container reference.
	 * @see #setAlgorithm(Algorithm)
	 * @see algorithm.AlgorithmPackage#getInput_Algorithm()
	 * @see algorithm.Algorithm#getInputs
	 * @model opposite="inputs" required="true" transient="false"
	 * @generated
	 */
	Algorithm getAlgorithm();

	/**
	 * Sets the value of the '{@link algorithm.Input#getAlgorithm <em>Algorithm</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' container reference.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(Algorithm value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' reference list.
	 * The list contents are of type {@link script.script.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' reference list.
	 * @see algorithm.AlgorithmPackage#getInput_Script()
	 * @model
	 * @generated
	 */
	EList<script.script.Input> getScript();

} // Input
