/**
 */
package src.library;

import org.eclipse.emf.ecore.EObject;

import src.table.IdentColumn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ident Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link src.library.IdentValue#getData <em>Data</em>}</li>
 *   <li>{@link src.library.IdentValue#getIdentColumn <em>Ident Column</em>}</li>
 * </ul>
 *
 * @see src.library.libraryPackage#getIdentValue()
 * @model
 * @generated
 */
public interface IdentValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link src.library.ColumnData#getIdentValues <em>Ident Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' container reference.
	 * @see #setData(ColumnData)
	 * @see src.library.libraryPackage#getIdentValue_Data()
	 * @see src.library.ColumnData#getIdentValues
	 * @model opposite="identValues" required="true" transient="false"
	 * @generated
	 */
	ColumnData getData();

	/**
	 * Sets the value of the '{@link src.library.IdentValue#getData <em>Data</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' container reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(ColumnData value);

	/**
	 * Returns the value of the '<em><b>Ident Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ident Column</em>' reference.
	 * @see #setIdentColumn(IdentColumn)
	 * @see src.library.libraryPackage#getIdentValue_IdentColumn()
	 * @model required="true"
	 * @generated
	 */
	IdentColumn getIdentColumn();

	/**
	 * Sets the value of the '{@link src.library.IdentValue#getIdentColumn <em>Ident Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ident Column</em>' reference.
	 * @see #getIdentColumn()
	 * @generated
	 */
	void setIdentColumn(IdentColumn value);

} // IdentValue
