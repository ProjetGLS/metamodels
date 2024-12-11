/**
 */
package script.script;

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
 * @see script.script.scriptFactory
 * @model kind="package"
 * @generated
 */
public interface scriptPackage extends EPackage {
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
	scriptPackage eINSTANCE = script.script.impl.scriptPackageImpl.init();

	/**
	 * The meta object id for the '{@link script.script.impl.ScriptImpl <em>Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.script.impl.ScriptImpl
	 * @see script.script.impl.scriptPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 0;

	/**
	 * The feature id for the '<em><b>Script Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__SCRIPT_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Operation Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT__OPERATION_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link script.script.impl.ScriptElementImpl <em>Script Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.script.impl.ScriptElementImpl
	 * @see script.script.impl.scriptPackageImpl#getScriptElement()
	 * @generated
	 */
	int SCRIPT_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Script Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCRIPT_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link script.script.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.script.impl.InputImpl
	 * @see script.script.impl.scriptPackageImpl#getInput()
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
	int INPUT__NAME = SCRIPT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = SCRIPT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link script.script.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.script.impl.OutputImpl
	 * @see script.script.impl.scriptPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 3;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = SCRIPT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link script.script.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.script.impl.OperationImpl
	 * @see script.script.impl.scriptPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OPERAND = SCRIPT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Op Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OP_TYPE = SCRIPT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = SCRIPT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = SCRIPT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link script.script.impl.ConstanteImpl <em>Constante</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.script.impl.ConstanteImpl
	 * @see script.script.impl.scriptPackageImpl#getConstante()
	 * @generated
	 */
	int CONSTANTE = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE__VALUE = SCRIPT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constante</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTE_FEATURE_COUNT = SCRIPT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link script.script.impl.OperationTypeElementImpl <em>Operation Type Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.script.impl.OperationTypeElementImpl
	 * @see script.script.impl.scriptPackageImpl#getOperationTypeElement()
	 * @generated
	 */
	int OPERATION_TYPE_ELEMENT = 6;

	/**
	 * The number of structural features of the '<em>Operation Type Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link script.script.impl.OperationTypeImpl <em>Operation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see script.script.impl.OperationTypeImpl
	 * @see script.script.impl.scriptPackageImpl#getOperationType()
	 * @generated
	 */
	int OPERATION_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Nb Operands</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE__NB_OPERANDS = OPERATION_TYPE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE__NAME = OPERATION_TYPE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_TYPE_FEATURE_COUNT = OPERATION_TYPE_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link script.script.Script <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script</em>'.
	 * @see script.script.Script
	 * @generated
	 */
	EClass getScript();

	/**
	 * Returns the meta object for the containment reference list '{@link script.script.Script#getScriptElement <em>Script Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Script Element</em>'.
	 * @see script.script.Script#getScriptElement()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_ScriptElement();

	/**
	 * Returns the meta object for the containment reference list '{@link script.script.Script#getOperationElement <em>Operation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Element</em>'.
	 * @see script.script.Script#getOperationElement()
	 * @see #getScript()
	 * @generated
	 */
	EReference getScript_OperationElement();

	/**
	 * Returns the meta object for class '{@link script.script.ScriptElement <em>Script Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Script Element</em>'.
	 * @see script.script.ScriptElement
	 * @generated
	 */
	EClass getScriptElement();

	/**
	 * Returns the meta object for class '{@link script.script.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see script.script.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link script.script.Input#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see script.script.Input#getName()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Name();

	/**
	 * Returns the meta object for class '{@link script.script.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see script.script.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for class '{@link script.script.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see script.script.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference list '{@link script.script.Operation#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Operand</em>'.
	 * @see script.script.Operation#getOperand()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Operand();

	/**
	 * Returns the meta object for the reference '{@link script.script.Operation#getOpType <em>Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Op Type</em>'.
	 * @see script.script.Operation#getOpType()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_OpType();

	/**
	 * Returns the meta object for the attribute '{@link script.script.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see script.script.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for class '{@link script.script.Constante <em>Constante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constante</em>'.
	 * @see script.script.Constante
	 * @generated
	 */
	EClass getConstante();

	/**
	 * Returns the meta object for the attribute '{@link script.script.Constante#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see script.script.Constante#getValue()
	 * @see #getConstante()
	 * @generated
	 */
	EAttribute getConstante_Value();

	/**
	 * Returns the meta object for class '{@link script.script.OperationTypeElement <em>Operation Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Type Element</em>'.
	 * @see script.script.OperationTypeElement
	 * @generated
	 */
	EClass getOperationTypeElement();

	/**
	 * Returns the meta object for class '{@link script.script.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Type</em>'.
	 * @see script.script.OperationType
	 * @generated
	 */
	EClass getOperationType();

	/**
	 * Returns the meta object for the attribute '{@link script.script.OperationType#getNbOperands <em>Nb Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nb Operands</em>'.
	 * @see script.script.OperationType#getNbOperands()
	 * @see #getOperationType()
	 * @generated
	 */
	EAttribute getOperationType_NbOperands();

	/**
	 * Returns the meta object for the attribute '{@link script.script.OperationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see script.script.OperationType#getName()
	 * @see #getOperationType()
	 * @generated
	 */
	EAttribute getOperationType_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	scriptFactory getscriptFactory();

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
		 * The meta object literal for the '{@link script.script.impl.ScriptImpl <em>Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.script.impl.ScriptImpl
		 * @see script.script.impl.scriptPackageImpl#getScript()
		 * @generated
		 */
		EClass SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em><b>Script Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__SCRIPT_ELEMENT = eINSTANCE.getScript_ScriptElement();

		/**
		 * The meta object literal for the '<em><b>Operation Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCRIPT__OPERATION_ELEMENT = eINSTANCE.getScript_OperationElement();

		/**
		 * The meta object literal for the '{@link script.script.impl.ScriptElementImpl <em>Script Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.script.impl.ScriptElementImpl
		 * @see script.script.impl.scriptPackageImpl#getScriptElement()
		 * @generated
		 */
		EClass SCRIPT_ELEMENT = eINSTANCE.getScriptElement();

		/**
		 * The meta object literal for the '{@link script.script.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.script.impl.InputImpl
		 * @see script.script.impl.scriptPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__NAME = eINSTANCE.getInput_Name();

		/**
		 * The meta object literal for the '{@link script.script.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.script.impl.OutputImpl
		 * @see script.script.impl.scriptPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '{@link script.script.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.script.impl.OperationImpl
		 * @see script.script.impl.scriptPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OPERAND = eINSTANCE.getOperation_Operand();

		/**
		 * The meta object literal for the '<em><b>Op Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OP_TYPE = eINSTANCE.getOperation_OpType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '{@link script.script.impl.ConstanteImpl <em>Constante</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.script.impl.ConstanteImpl
		 * @see script.script.impl.scriptPackageImpl#getConstante()
		 * @generated
		 */
		EClass CONSTANTE = eINSTANCE.getConstante();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTE__VALUE = eINSTANCE.getConstante_Value();

		/**
		 * The meta object literal for the '{@link script.script.impl.OperationTypeElementImpl <em>Operation Type Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.script.impl.OperationTypeElementImpl
		 * @see script.script.impl.scriptPackageImpl#getOperationTypeElement()
		 * @generated
		 */
		EClass OPERATION_TYPE_ELEMENT = eINSTANCE.getOperationTypeElement();

		/**
		 * The meta object literal for the '{@link script.script.impl.OperationTypeImpl <em>Operation Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see script.script.impl.OperationTypeImpl
		 * @see script.script.impl.scriptPackageImpl#getOperationType()
		 * @generated
		 */
		EClass OPERATION_TYPE = eINSTANCE.getOperationType();

		/**
		 * The meta object literal for the '<em><b>Nb Operands</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_TYPE__NB_OPERANDS = eINSTANCE.getOperationType_NbOperands();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_TYPE__NAME = eINSTANCE.getOperationType_Name();

	}

} //scriptPackage
