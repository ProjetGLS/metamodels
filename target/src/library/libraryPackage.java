/**
 */
package src.library;

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
 * @see src.library.libraryFactory
 * @model kind="package"
 * @generated
 */
public interface libraryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "library";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/library";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "library";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	libraryPackage eINSTANCE = src.library.impl.libraryPackageImpl.init();

	/**
	 * The meta object id for the '{@link src.library.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see src.library.impl.LibraryImpl
	 * @see src.library.impl.libraryPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ALGORITHM = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__DATA = 2;

	/**
	 * The feature id for the '<em><b>External Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__EXTERNAL_DATA = 3;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link src.library.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see src.library.impl.ValueImpl
	 * @see src.library.impl.libraryPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__DATA = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__COLUMN = 1;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link src.library.impl.IdentValueImpl <em>Ident Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see src.library.impl.IdentValueImpl
	 * @see src.library.impl.libraryPackageImpl#getIdentValue()
	 * @generated
	 */
	int IDENT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Data</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENT_VALUE__DATA = 0;

	/**
	 * The feature id for the '<em><b>Ident Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENT_VALUE__IDENT_COLUMN = 1;

	/**
	 * The number of structural features of the '<em>Ident Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENT_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link src.library.impl.ColumnDataImpl <em>Column Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see src.library.impl.ColumnDataImpl
	 * @see src.library.impl.libraryPackageImpl#getColumnData()
	 * @generated
	 */
	int COLUMN_DATA = 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DATA__CONSTRAINTS = 0;

	/**
	 * The feature id for the '<em><b>Ident Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DATA__IDENT_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DATA__VALUES = 2;

	/**
	 * The number of structural features of the '<em>Column Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_DATA_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link src.library.impl.ExternalDataImpl <em>External Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see src.library.impl.ExternalDataImpl
	 * @see src.library.impl.libraryPackageImpl#getExternalData()
	 * @generated
	 */
	int EXTERNAL_DATA = 4;

	/**
	 * The number of structural features of the '<em>External Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link src.library.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see src.library.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the attribute '{@link src.library.Library#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see src.library.Library#getName()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Name();

	/**
	 * Returns the meta object for the reference list '{@link src.library.Library#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Algorithm</em>'.
	 * @see src.library.Library#getAlgorithm()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Algorithm();

	/**
	 * Returns the meta object for the reference list '{@link src.library.Library#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data</em>'.
	 * @see src.library.Library#getData()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Data();

	/**
	 * Returns the meta object for the reference list '{@link src.library.Library#getExternalData <em>External Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>External Data</em>'.
	 * @see src.library.Library#getExternalData()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_ExternalData();

	/**
	 * Returns the meta object for class '{@link src.library.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see src.library.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the container reference '{@link src.library.Value#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data</em>'.
	 * @see src.library.Value#getData()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_Data();

	/**
	 * Returns the meta object for the reference '{@link src.library.Value#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see src.library.Value#getColumn()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_Column();

	/**
	 * Returns the meta object for class '{@link src.library.IdentValue <em>Ident Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ident Value</em>'.
	 * @see src.library.IdentValue
	 * @generated
	 */
	EClass getIdentValue();

	/**
	 * Returns the meta object for the container reference '{@link src.library.IdentValue#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Data</em>'.
	 * @see src.library.IdentValue#getData()
	 * @see #getIdentValue()
	 * @generated
	 */
	EReference getIdentValue_Data();

	/**
	 * Returns the meta object for the reference '{@link src.library.IdentValue#getIdentColumn <em>Ident Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ident Column</em>'.
	 * @see src.library.IdentValue#getIdentColumn()
	 * @see #getIdentValue()
	 * @generated
	 */
	EReference getIdentValue_IdentColumn();

	/**
	 * Returns the meta object for class '{@link src.library.ColumnData <em>Column Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Data</em>'.
	 * @see src.library.ColumnData
	 * @generated
	 */
	EClass getColumnData();

	/**
	 * Returns the meta object for the attribute list '{@link src.library.ColumnData#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Constraints</em>'.
	 * @see src.library.ColumnData#getConstraints()
	 * @see #getColumnData()
	 * @generated
	 */
	EAttribute getColumnData_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link src.library.ColumnData#getIdentValues <em>Ident Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ident Values</em>'.
	 * @see src.library.ColumnData#getIdentValues()
	 * @see #getColumnData()
	 * @generated
	 */
	EReference getColumnData_IdentValues();

	/**
	 * Returns the meta object for the containment reference list '{@link src.library.ColumnData#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see src.library.ColumnData#getValues()
	 * @see #getColumnData()
	 * @generated
	 */
	EReference getColumnData_Values();

	/**
	 * Returns the meta object for class '{@link src.library.ExternalData <em>External Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Data</em>'.
	 * @see src.library.ExternalData
	 * @generated
	 */
	EClass getExternalData();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	libraryFactory getlibraryFactory();

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
		 * The meta object literal for the '{@link src.library.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see src.library.impl.LibraryImpl
		 * @see src.library.impl.libraryPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__NAME = eINSTANCE.getLibrary_Name();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__ALGORITHM = eINSTANCE.getLibrary_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__DATA = eINSTANCE.getLibrary_Data();

		/**
		 * The meta object literal for the '<em><b>External Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__EXTERNAL_DATA = eINSTANCE.getLibrary_ExternalData();

		/**
		 * The meta object literal for the '{@link src.library.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see src.library.impl.ValueImpl
		 * @see src.library.impl.libraryPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__DATA = eINSTANCE.getValue_Data();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__COLUMN = eINSTANCE.getValue_Column();

		/**
		 * The meta object literal for the '{@link src.library.impl.IdentValueImpl <em>Ident Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see src.library.impl.IdentValueImpl
		 * @see src.library.impl.libraryPackageImpl#getIdentValue()
		 * @generated
		 */
		EClass IDENT_VALUE = eINSTANCE.getIdentValue();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENT_VALUE__DATA = eINSTANCE.getIdentValue_Data();

		/**
		 * The meta object literal for the '<em><b>Ident Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENT_VALUE__IDENT_COLUMN = eINSTANCE.getIdentValue_IdentColumn();

		/**
		 * The meta object literal for the '{@link src.library.impl.ColumnDataImpl <em>Column Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see src.library.impl.ColumnDataImpl
		 * @see src.library.impl.libraryPackageImpl#getColumnData()
		 * @generated
		 */
		EClass COLUMN_DATA = eINSTANCE.getColumnData();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_DATA__CONSTRAINTS = eINSTANCE.getColumnData_Constraints();

		/**
		 * The meta object literal for the '<em><b>Ident Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_DATA__IDENT_VALUES = eINSTANCE.getColumnData_IdentValues();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_DATA__VALUES = eINSTANCE.getColumnData_Values();

		/**
		 * The meta object literal for the '{@link src.library.impl.ExternalDataImpl <em>External Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see src.library.impl.ExternalDataImpl
		 * @see src.library.impl.libraryPackageImpl#getExternalData()
		 * @generated
		 */
		EClass EXTERNAL_DATA = eINSTANCE.getExternalData();

	}

} //libraryPackage
