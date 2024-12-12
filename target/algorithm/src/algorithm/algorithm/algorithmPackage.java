/**
 */
package algorithm.algorithm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see algorithm.algorithm.algorithmFactory
 * @model kind="package"
 * @generated
 */
public interface algorithmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "algorithm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.meta_excel.org/algorithm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "algorithm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	algorithmPackage eINSTANCE = algorithm.algorithm.impl.algorithmPackageImpl.init();

	/**
	 * The meta object id for the '{@link algorithm.algorithm.impl.AlgorithmImpl <em>Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithm.algorithm.impl.AlgorithmImpl
	 * @see algorithm.algorithm.impl.algorithmPackageImpl#getAlgorithm()
	 * @generated
	 */
	int ALGORITHM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__INPUTS = 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__OUTPUT = 2;

	/**
	 * The number of structural features of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link algorithm.algorithm.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithm.algorithm.impl.InputImpl
	 * @see algorithm.algorithm.impl.algorithmPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 1;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ALGORITHM = 1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__SCRIPT = 2;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link algorithm.algorithm.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see algorithm.algorithm.impl.OutputImpl
	 * @see algorithm.algorithm.impl.algorithmPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 2;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ALGORITHM = 1;

	/**
	 * The feature id for the '<em><b>Script</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__SCRIPT = 2;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link algorithm.algorithm.Algorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm</em>'.
	 * @see algorithm.algorithm.Algorithm
	 * @generated
	 */
	EClass getAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link algorithm.algorithm.Algorithm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see algorithm.algorithm.Algorithm#getName()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EAttribute getAlgorithm_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link algorithm.algorithm.Algorithm#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see algorithm.algorithm.Algorithm#getInputs()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EReference getAlgorithm_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link algorithm.algorithm.Algorithm#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see algorithm.algorithm.Algorithm#getOutput()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EReference getAlgorithm_Output();

	/**
	 * Returns the meta object for class '{@link algorithm.algorithm.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see algorithm.algorithm.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the reference list '{@link algorithm.algorithm.Input#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Column</em>'.
	 * @see algorithm.algorithm.Input#getColumn()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Column();

	/**
	 * Returns the meta object for the container reference '{@link algorithm.algorithm.Input#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Algorithm</em>'.
	 * @see algorithm.algorithm.Input#getAlgorithm()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Algorithm();

	/**
	 * Returns the meta object for the reference list '{@link algorithm.algorithm.Input#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Script</em>'.
	 * @see algorithm.algorithm.Input#getScript()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Script();

	/**
	 * Returns the meta object for class '{@link algorithm.algorithm.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see algorithm.algorithm.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the reference list '{@link algorithm.algorithm.Output#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Column</em>'.
	 * @see algorithm.algorithm.Output#getColumn()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Column();

	/**
	 * Returns the meta object for the container reference '{@link algorithm.algorithm.Output#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Algorithm</em>'.
	 * @see algorithm.algorithm.Output#getAlgorithm()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Algorithm();

	/**
	 * Returns the meta object for the reference list '{@link algorithm.algorithm.Output#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Script</em>'.
	 * @see algorithm.algorithm.Output#getScript()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Script();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	algorithmFactory getalgorithmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link algorithm.algorithm.impl.AlgorithmImpl <em>Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithm.algorithm.impl.AlgorithmImpl
		 * @see algorithm.algorithm.impl.algorithmPackageImpl#getAlgorithm()
		 * @generated
		 */
		EClass ALGORITHM = eINSTANCE.getAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHM__NAME = eINSTANCE.getAlgorithm_Name();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM__INPUTS = eINSTANCE.getAlgorithm_Inputs();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALGORITHM__OUTPUT = eINSTANCE.getAlgorithm_Output();

		/**
		 * The meta object literal for the '{@link algorithm.algorithm.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithm.algorithm.impl.InputImpl
		 * @see algorithm.algorithm.impl.algorithmPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__COLUMN = eINSTANCE.getInput_Column();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__ALGORITHM = eINSTANCE.getInput_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__SCRIPT = eINSTANCE.getInput_Script();

		/**
		 * The meta object literal for the '{@link algorithm.algorithm.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see algorithm.algorithm.impl.OutputImpl
		 * @see algorithm.algorithm.impl.algorithmPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__COLUMN = eINSTANCE.getOutput_Column();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__ALGORITHM = eINSTANCE.getOutput_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Script</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__SCRIPT = eINSTANCE.getOutput_Script();

	}

} //algorithmPackage
