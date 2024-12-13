/**
 */
package src.library;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import src.algorithm.Algorithm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link src.library.Library#getName <em>Name</em>}</li>
 *   <li>{@link src.library.Library#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link src.library.Library#getData <em>Data</em>}</li>
 *   <li>{@link src.library.Library#getExternalData <em>External Data</em>}</li>
 * </ul>
 *
 * @see src.library.libraryPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see src.library.libraryPackage#getLibrary_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link src.library.Library#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' reference list.
	 * The list contents are of type {@link src.algorithm.Algorithm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' reference list.
	 * @see src.library.libraryPackage#getLibrary_Algorithm()
	 * @model
	 * @generated
	 */
	EList<Algorithm> getAlgorithm();

	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference list.
	 * The list contents are of type {@link src.library.ColumnData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference list.
	 * @see src.library.libraryPackage#getLibrary_Data()
	 * @model
	 * @generated
	 */
	EList<ColumnData> getData();

	/**
	 * Returns the value of the '<em><b>External Data</b></em>' reference list.
	 * The list contents are of type {@link src.library.ExternalData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Data</em>' reference list.
	 * @see src.library.libraryPackage#getLibrary_ExternalData()
	 * @model
	 * @generated
	 */
	EList<ExternalData> getExternalData();

} // Library
