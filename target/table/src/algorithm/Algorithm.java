/**
 */
package algorithm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link algorithm.Algorithm#getName <em>Name</em>}</li>
 *   <li>{@link algorithm.Algorithm#getInputs <em>Inputs</em>}</li>
 *   <li>{@link algorithm.Algorithm#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see algorithm.AlgorithmPackage#getAlgorithm()
 * @model
 * @generated
 */
public interface Algorithm extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see algorithm.AlgorithmPackage#getAlgorithm_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link algorithm.Algorithm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link algorithm.Input}.
	 * It is bidirectional and its opposite is '{@link algorithm.Input#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see algorithm.AlgorithmPackage#getAlgorithm_Inputs()
	 * @see algorithm.Input#getAlgorithm
	 * @model opposite="algorithm" containment="true" required="true"
	 * @generated
	 */
	EList<Input> getInputs();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link algorithm.Output#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' containment reference.
	 * @see #setOutput(Output)
	 * @see algorithm.AlgorithmPackage#getAlgorithm_Output()
	 * @see algorithm.Output#getAlgorithm
	 * @model opposite="algorithm" containment="true" required="true"
	 * @generated
	 */
	Output getOutput();

	/**
	 * Sets the value of the '{@link algorithm.Algorithm#getOutput <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' containment reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(Output value);

} // Algorithm
