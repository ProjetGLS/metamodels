/**
 */
package table.table;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link table.table.Column#getIndice <em>Indice</em>}</li>
 *   <li>{@link table.table.Column#getTable <em>Table</em>}</li>
 *   <li>{@link table.table.Column#getContraintes <em>Contraintes</em>}</li>
 *   <li>{@link table.table.Column#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see table.table.tablePackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Indice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indice</em>' attribute.
	 * @see #setIndice(int)
	 * @see table.table.tablePackage#getColumn_Indice()
	 * @model required="true"
	 * @generated
	 */
	int getIndice();

	/**
	 * Sets the value of the '{@link table.table.Column#getIndice <em>Indice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indice</em>' attribute.
	 * @see #getIndice()
	 * @generated
	 */
	void setIndice(int value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link table.table.Table#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(Table)
	 * @see table.table.tablePackage#getColumn_Table()
	 * @see table.table.Table#getColumn
	 * @model opposite="column" required="true" transient="false"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link table.table.Column#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

	/**
	 * Returns the value of the '<em><b>Contraintes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Boolean}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contraintes</em>' attribute list.
	 * @see table.table.tablePackage#getColumn_Contraintes()
	 * @model
	 * @generated
	 */
	EList<Boolean> getContraintes();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link table.table.Typr}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see table.table.Typr
	 * @see #setType(Typr)
	 * @see table.table.tablePackage#getColumn_Type()
	 * @model required="true"
	 * @generated
	 */
	Typr getType();

	/**
	 * Sets the value of the '{@link table.table.Column#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see table.table.Typr
	 * @see #getType()
	 * @generated
	 */
	void setType(Typr value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	Column Column();

} // Column
