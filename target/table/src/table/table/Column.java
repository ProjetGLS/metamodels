/**
 */
package table.table;

import algorithm.Output;

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
 *   <li>{@link table.table.Column#getUid <em>Uid</em>}</li>
 *   <li>{@link table.table.Column#getTable <em>Table</em>}</li>
 *   <li>{@link table.table.Column#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link table.table.Column#getReferences <em>References</em>}</li>
 *   <li>{@link table.table.Column#getDerivateFrom <em>Derivate From</em>}</li>
 * </ul>
 *
 * @see table.table.tablePackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see table.table.tablePackage#getColumn_Uid()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link table.table.Column#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

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
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute list.
	 * @see table.table.tablePackage#getColumn_Constraints()
	 * @model
	 * @generated
	 */
	EList<String> getConstraints();

	/**
	 * Returns the value of the '<em><b>References</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference.
	 * @see #setReferences(Column)
	 * @see table.table.tablePackage#getColumn_References()
	 * @model
	 * @generated
	 */
	Column getReferences();

	/**
	 * Sets the value of the '{@link table.table.Column#getReferences <em>References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References</em>' reference.
	 * @see #getReferences()
	 * @generated
	 */
	void setReferences(Column value);

	/**
	 * Returns the value of the '<em><b>Derivate From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link algorithm.Output#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivate From</em>' reference.
	 * @see #setDerivateFrom(Output)
	 * @see table.table.tablePackage#getColumn_DerivateFrom()
	 * @see algorithm.Output#getColumn
	 * @model opposite="column"
	 * @generated
	 */
	Output getDerivateFrom();

	/**
	 * Sets the value of the '{@link table.table.Column#getDerivateFrom <em>Derivate From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivate From</em>' reference.
	 * @see #getDerivateFrom()
	 * @generated
	 */
	void setDerivateFrom(Output value);

} // Column
