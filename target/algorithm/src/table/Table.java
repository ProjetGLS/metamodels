/**
 */
package table;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link table.Table#getName <em>Name</em>}</li>
 *   <li>{@link table.Table#getColumn <em>Column</em>}</li>
 *   <li>{@link table.Table#getIdentColumn <em>Ident Column</em>}</li>
 * </ul>
 *
 * @see table.TablePackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see table.TablePackage#getTable_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link table.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link table.Column}.
	 * It is bidirectional and its opposite is '{@link table.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see table.TablePackage#getTable_Column()
	 * @see table.Column#getTable
	 * @model opposite="table" containment="true"
	 * @generated
	 */
	EList<Column> getColumn();

	/**
	 * Returns the value of the '<em><b>Ident Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ident Column</em>' reference.
	 * @see #setIdentColumn(IdentColumn)
	 * @see table.TablePackage#getTable_IdentColumn()
	 * @model required="true"
	 * @generated
	 */
	IdentColumn getIdentColumn();

	/**
	 * Sets the value of the '{@link table.Table#getIdentColumn <em>Ident Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ident Column</em>' reference.
	 * @see #getIdentColumn()
	 * @generated
	 */
	void setIdentColumn(IdentColumn value);

} // Table
