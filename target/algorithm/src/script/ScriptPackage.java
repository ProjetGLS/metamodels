/**
 */
package script;

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
 * @see script.ScriptFactory
 * @model kind="package"
 * @generated
 */
public interface ScriptPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "script";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.meta_excel.org/script";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "script";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ScriptPackage eINSTANCE = script.impl.ScriptPackageImpl.init();

	/**
	 * The meta object id for the '{@link script.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.ScriptImpl
	 * @see script.impl.ScriptPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__OPERATIONS = 2;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__CONSTANTS = 3;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link script.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.OperationImpl
	 * @see script.impl.ScriptPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Arity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ARITY = 1;

	/**
	 * The feature id for the '<em><b>Infix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INFIX = 2;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INPUTS = 3;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OUTPUT = 4;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link script.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.VariableImpl
	 * @see script.impl.ScriptPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link script.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.InputImpl
	 * @see script.impl.ScriptPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__VALUE = VARIABLE__VALUE;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.OutputImpl
	 * @see script.impl.ScriptPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Internal Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__INTERNAL_OUTPUT = 0;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link script.impl.InternalInputImpl <em>Internal Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.InternalInputImpl
	 * @see script.impl.ScriptPackageImpl#getInternalInput()
	 * @generated
	 */
	int INTERNAL_INPUT = 5;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT__VARIABLE = 0;

	/**
	 * The number of structural features of the '<em>Internal Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_INPUT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link script.impl.InternalOutputImpl <em>Internal Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.InternalOutputImpl
	 * @see script.impl.ScriptPackageImpl#getInternalOutput()
	 * @generated
	 */
	int INTERNAL_OUTPUT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT__VALUE = VARIABLE__VALUE;

	/**
	 * The number of structural features of the '<em>Internal Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_OUTPUT_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.impl.ConstantImpl
	 * @see script.impl.ScriptPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = VARIABLE__VALUE;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link script.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see script.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the containment reference list '{@link script.Script#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see script.Script#getInputs()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link script.Script#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see script.Script#getOutput()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link script.Script#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see script.Script#getOperations()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link script.Script#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constants</em>'.
	 * @see script.Script#getConstants()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_Constants();

	/**
	 * Returns the meta object for class '{@link script.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see script.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link script.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see script.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link script.Operation#getArity <em>Arity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arity</em>'.
	 * @see script.Operation#getArity()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Arity();

	/**
	 * Returns the meta object for the attribute '{@link script.Operation#isInfix <em>Infix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infix</em>'.
	 * @see script.Operation#isInfix()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Infix();

	/**
	 * Returns the meta object for the containment reference list '{@link script.Operation#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see script.Operation#getInputs()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link script.Operation#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see script.Operation#getOutput()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Output();

	/**
	 * Returns the meta object for class '{@link script.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see script.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link script.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see script.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the reference '{@link script.Output#getInternalOutput <em>Internal Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Internal Output</em>'.
	 * @see script.Output#getInternalOutput()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_InternalOutput();

	/**
	 * Returns the meta object for class '{@link script.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see script.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link script.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see script.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link script.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see script.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for class '{@link script.InternalInput <em>Internal Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Input</em>'.
	 * @see script.InternalInput
	 * @generated
	 */
	EClass getInternalInput();

	/**
	 * Returns the meta object for the reference '{@link script.InternalInput#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see script.InternalInput#getVariable()
	 * @see #getInternalInput()
	 * @generated
	 */
	EReference getInternalInput_Variable();

	/**
	 * Returns the meta object for class '{@link script.InternalOutput <em>Internal Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Output</em>'.
	 * @see script.InternalOutput
	 * @generated
	 */
	EClass getInternalOutput();

	/**
	 * Returns the meta object for class '{@link script.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see script.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScriptFactory getScriptFactory();

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
		 * The meta object literal for the '{@link script.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.ScriptImpl
		 * @see script.impl.ScriptPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__INPUTS = eINSTANCE.getScript_Inputs();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__OUTPUT = eINSTANCE.getScript_Output();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__OPERATIONS = eINSTANCE.getScript_Operations();

		/**
		 * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__CONSTANTS = eINSTANCE.getScript_Constants();

		/**
		 * The meta object literal for the '{@link script.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.OperationImpl
		 * @see script.impl.ScriptPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Arity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__ARITY = eINSTANCE.getOperation_Arity();

		/**
		 * The meta object literal for the '<em><b>Infix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__INFIX = eINSTANCE.getOperation_Infix();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__INPUTS = eINSTANCE.getOperation_Inputs();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OUTPUT = eINSTANCE.getOperation_Output();

		/**
		 * The meta object literal for the '{@link script.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.InputImpl
		 * @see script.impl.ScriptPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link script.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.OutputImpl
		 * @see script.impl.ScriptPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Internal Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__INTERNAL_OUTPUT = eINSTANCE.getOutput_InternalOutput();

		/**
		 * The meta object literal for the '{@link script.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.VariableImpl
		 * @see script.impl.ScriptPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '{@link script.impl.InternalInputImpl <em>Internal Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.InternalInputImpl
		 * @see script.impl.ScriptPackageImpl#getInternalInput()
		 * @generated
		 */
		EClass INTERNAL_INPUT = eINSTANCE.getInternalInput();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERNAL_INPUT__VARIABLE = eINSTANCE.getInternalInput_Variable();

		/**
		 * The meta object literal for the '{@link script.impl.InternalOutputImpl <em>Internal Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.InternalOutputImpl
		 * @see script.impl.ScriptPackageImpl#getInternalOutput()
		 * @generated
		 */
		EClass INTERNAL_OUTPUT = eINSTANCE.getInternalOutput();

		/**
		 * The meta object literal for the '{@link script.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.impl.ConstantImpl
		 * @see script.impl.ScriptPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

	}

} //ScriptPackage
