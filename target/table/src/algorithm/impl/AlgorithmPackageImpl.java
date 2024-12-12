/**
 */
package algorithm.impl;

import algorithm.Algorithm;
import algorithm.AlgorithmFactory;
import algorithm.AlgorithmPackage;
import algorithm.Input;
import algorithm.Output;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import script.script.scriptPackage;

import table.table.impl.tablePackageImpl;

import table.table.tablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlgorithmPackageImpl extends EPackageImpl implements AlgorithmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see algorithm.AlgorithmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AlgorithmPackageImpl() {
		super(eNS_URI, AlgorithmFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AlgorithmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AlgorithmPackage init() {
		if (isInited) return (AlgorithmPackage)EPackage.Registry.INSTANCE.getEPackage(AlgorithmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAlgorithmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AlgorithmPackageImpl theAlgorithmPackage = registeredAlgorithmPackage instanceof AlgorithmPackageImpl ? (AlgorithmPackageImpl)registeredAlgorithmPackage : new AlgorithmPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		scriptPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(tablePackage.eNS_URI);
		tablePackageImpl thetablePackage = (tablePackageImpl)(registeredPackage instanceof tablePackageImpl ? registeredPackage : tablePackage.eINSTANCE);

		// Create package meta-data objects
		theAlgorithmPackage.createPackageContents();
		thetablePackage.createPackageContents();

		// Initialize created meta-data
		theAlgorithmPackage.initializePackageContents();
		thetablePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAlgorithmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AlgorithmPackage.eNS_URI, theAlgorithmPackage);
		return theAlgorithmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlgorithm() {
		return algorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlgorithm_Name() {
		return (EAttribute)algorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithm_Inputs() {
		return (EReference)algorithmEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlgorithm_Output() {
		return (EReference)algorithmEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_Column() {
		return (EReference)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_Algorithm() {
		return (EReference)inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_Script() {
		return (EReference)inputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutput_Column() {
		return (EReference)outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutput_Algorithm() {
		return (EReference)outputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutput_Script() {
		return (EReference)outputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlgorithmFactory getAlgorithmFactory() {
		return (AlgorithmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		algorithmEClass = createEClass(ALGORITHM);
		createEAttribute(algorithmEClass, ALGORITHM__NAME);
		createEReference(algorithmEClass, ALGORITHM__INPUTS);
		createEReference(algorithmEClass, ALGORITHM__OUTPUT);

		inputEClass = createEClass(INPUT);
		createEReference(inputEClass, INPUT__COLUMN);
		createEReference(inputEClass, INPUT__ALGORITHM);
		createEReference(inputEClass, INPUT__SCRIPT);

		outputEClass = createEClass(OUTPUT);
		createEReference(outputEClass, OUTPUT__COLUMN);
		createEReference(outputEClass, OUTPUT__ALGORITHM);
		createEReference(outputEClass, OUTPUT__SCRIPT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		tablePackage thetablePackage = (tablePackage)EPackage.Registry.INSTANCE.getEPackage(tablePackage.eNS_URI);
		scriptPackage thescriptPackage = (scriptPackage)EPackage.Registry.INSTANCE.getEPackage(scriptPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(algorithmEClass, Algorithm.class, "Algorithm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlgorithm_Name(), ecorePackage.getEString(), "name", null, 1, 1, Algorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgorithm_Inputs(), this.getInput(), this.getInput_Algorithm(), "inputs", null, 1, -1, Algorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlgorithm_Output(), this.getOutput(), this.getOutput_Algorithm(), "output", null, 1, 1, Algorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_Column(), thetablePackage.getColumn(), null, "column", null, 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_Algorithm(), this.getAlgorithm(), this.getAlgorithm_Inputs(), "algorithm", null, 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_Script(), thescriptPackage.getInput(), null, "script", null, 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutput_Column(), thetablePackage.getColumn(), thetablePackage.getColumn_DerivateFrom(), "column", null, 1, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_Algorithm(), this.getAlgorithm(), this.getAlgorithm_Output(), "algorithm", null, 1, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_Script(), thescriptPackage.getOutput(), null, "script", null, 1, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AlgorithmPackageImpl
