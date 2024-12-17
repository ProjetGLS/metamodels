/**
 */
package src.library;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link src.library.ColumnData#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link src.library.ColumnData#getIdentValues <em>Ident Values</em>}</li>
 *   <li>{@link src.library.ColumnData#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see src.library.libraryPackage#getColumnData()
 * @model
 * @generated
 */
public interface ColumnData extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute list.
	 * @see src.library.libraryPackage#getColumnData_Constraints()
	 * @model
	 * @generated
	 */
	EList<String> getConstraints();

	/**
	 * Returns the value of the '<em><b>Ident Values</b></em>' containment reference list.
	 * The list contents are of type {@link src.library.IdentValue}.
	 * It is bidirectional and its opposite is '{@link src.library.IdentValue#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ident Values</em>' containment reference list.
	 * @see src.library.libraryPackage#getColumnData_IdentValues()
	 * @see src.library.IdentValue#getData
	 * @model opposite="data" containment="true" required="true"
	 * @generated
	 */
	EList<IdentValue> getIdentValues();

	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link src.library.Value}.
	 * It is bidirectional and its opposite is '{@link src.library.Value#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see src.library.libraryPackage#getColumnData_Values()
	 * @see src.library.Value#getData
	 * @model opposite="data" containment="true"
	 * @generated
	 */
	EList<Value> getValues();

} // ColumnData
