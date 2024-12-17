/**
 */
package src.library;

import org.eclipse.emf.ecore.EObject;

import src.table.Column;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link src.library.Value#getData <em>Data</em>}</li>
 *   <li>{@link src.library.Value#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see src.library.libraryPackage#getValue()
 * @model
 * @generated
 */
public interface Value extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link src.library.ColumnData#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' container reference.
	 * @see #setData(ColumnData)
	 * @see src.library.libraryPackage#getValue_Data()
	 * @see src.library.ColumnData#getValues
	 * @model opposite="values" required="true" transient="false"
	 * @generated
	 */
	ColumnData getData();

	/**
	 * Sets the value of the '{@link src.library.Value#getData <em>Data</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' container reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(ColumnData value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference.
	 * @see #setColumn(Column)
	 * @see src.library.libraryPackage#getValue_Column()
	 * @model required="true"
	 * @generated
	 */
	Column getColumn();

	/**
	 * Sets the value of the '{@link src.library.Value#getColumn <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Column value);

} // Value
