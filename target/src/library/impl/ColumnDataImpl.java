/**
 */
package src.library.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import src.library.ColumnData;
import src.library.IdentValue;
import src.library.Value;
import src.library.libraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link src.library.impl.ColumnDataImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link src.library.impl.ColumnDataImpl#getIdentValues <em>Ident Values</em>}</li>
 *   <li>{@link src.library.impl.ColumnDataImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnDataImpl extends EObjectImpl implements ColumnData {
	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> constraints;

	/**
	 * The cached value of the '{@link #getIdentValues() <em>Ident Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentValues()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentValue> identValues;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return libraryPackage.Literals.COLUMN_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConstraints() {
		if (constraints == null) {
			constraints = new EDataTypeUniqueEList<String>(String.class, this, libraryPackage.COLUMN_DATA__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentValue> getIdentValues() {
		if (identValues == null) {
			identValues = new EObjectContainmentWithInverseEList<IdentValue>(IdentValue.class, this, libraryPackage.COLUMN_DATA__IDENT_VALUES, libraryPackage.IDENT_VALUE__DATA);
		}
		return identValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getValues() {
		if (values == null) {
			values = new EObjectContainmentWithInverseEList<Value>(Value.class, this, libraryPackage.COLUMN_DATA__VALUES, libraryPackage.VALUE__DATA);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case libraryPackage.COLUMN_DATA__IDENT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIdentValues()).basicAdd(otherEnd, msgs);
			case libraryPackage.COLUMN_DATA__VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValues()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case libraryPackage.COLUMN_DATA__IDENT_VALUES:
				return ((InternalEList<?>)getIdentValues()).basicRemove(otherEnd, msgs);
			case libraryPackage.COLUMN_DATA__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case libraryPackage.COLUMN_DATA__CONSTRAINTS:
				return getConstraints();
			case libraryPackage.COLUMN_DATA__IDENT_VALUES:
				return getIdentValues();
			case libraryPackage.COLUMN_DATA__VALUES:
				return getValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case libraryPackage.COLUMN_DATA__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends String>)newValue);
				return;
			case libraryPackage.COLUMN_DATA__IDENT_VALUES:
				getIdentValues().clear();
				getIdentValues().addAll((Collection<? extends IdentValue>)newValue);
				return;
			case libraryPackage.COLUMN_DATA__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends Value>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case libraryPackage.COLUMN_DATA__CONSTRAINTS:
				getConstraints().clear();
				return;
			case libraryPackage.COLUMN_DATA__IDENT_VALUES:
				getIdentValues().clear();
				return;
			case libraryPackage.COLUMN_DATA__VALUES:
				getValues().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case libraryPackage.COLUMN_DATA__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case libraryPackage.COLUMN_DATA__IDENT_VALUES:
				return identValues != null && !identValues.isEmpty();
			case libraryPackage.COLUMN_DATA__VALUES:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (constraints: ");
		result.append(constraints);
		result.append(')');
		return result.toString();
	}

} //ColumnDataImpl
