/**
 */
package table.table.impl;

import algorithm.AlgorithmPackage;
import algorithm.Output;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import table.table.Column;
import table.table.Table;
import table.table.tablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link table.table.impl.ColumnImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link table.table.impl.ColumnImpl#getTable <em>Table</em>}</li>
 *   <li>{@link table.table.impl.ColumnImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link table.table.impl.ColumnImpl#getReferences <em>References</em>}</li>
 *   <li>{@link table.table.impl.ColumnImpl#getDerivateFrom <em>Derivate From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnImpl extends EObjectImpl implements Column {
	/**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final String UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected String uid = UID_EDEFAULT;

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
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected Column references;

	/**
	 * The cached value of the '{@link #getDerivateFrom() <em>Derivate From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivateFrom()
	 * @generated
	 * @ordered
	 */
	protected Output derivateFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return tablePackage.Literals.COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(String newUid) {
		String oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tablePackage.COLUMN__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getTable() {
		if (eContainerFeatureID() != tablePackage.COLUMN__TABLE) return null;
		return (Table)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTable(Table newTable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTable, tablePackage.COLUMN__TABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(Table newTable) {
		if (newTable != eInternalContainer() || (eContainerFeatureID() != tablePackage.COLUMN__TABLE && newTable != null)) {
			if (EcoreUtil.isAncestor(this, newTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTable != null)
				msgs = ((InternalEObject)newTable).eInverseAdd(this, tablePackage.TABLE__COLUMN, Table.class, msgs);
			msgs = basicSetTable(newTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tablePackage.COLUMN__TABLE, newTable, newTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConstraints() {
		if (constraints == null) {
			constraints = new EDataTypeUniqueEList<String>(String.class, this, tablePackage.COLUMN__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getReferences() {
		if (references != null && references.eIsProxy()) {
			InternalEObject oldReferences = (InternalEObject)references;
			references = (Column)eResolveProxy(oldReferences);
			if (references != oldReferences) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tablePackage.COLUMN__REFERENCES, oldReferences, references));
			}
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetReferences() {
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferences(Column newReferences) {
		Column oldReferences = references;
		references = newReferences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tablePackage.COLUMN__REFERENCES, oldReferences, references));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output getDerivateFrom() {
		if (derivateFrom != null && derivateFrom.eIsProxy()) {
			InternalEObject oldDerivateFrom = (InternalEObject)derivateFrom;
			derivateFrom = (Output)eResolveProxy(oldDerivateFrom);
			if (derivateFrom != oldDerivateFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, tablePackage.COLUMN__DERIVATE_FROM, oldDerivateFrom, derivateFrom));
			}
		}
		return derivateFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output basicGetDerivateFrom() {
		return derivateFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivateFrom(Output newDerivateFrom, NotificationChain msgs) {
		Output oldDerivateFrom = derivateFrom;
		derivateFrom = newDerivateFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, tablePackage.COLUMN__DERIVATE_FROM, oldDerivateFrom, newDerivateFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivateFrom(Output newDerivateFrom) {
		if (newDerivateFrom != derivateFrom) {
			NotificationChain msgs = null;
			if (derivateFrom != null)
				msgs = ((InternalEObject)derivateFrom).eInverseRemove(this, AlgorithmPackage.OUTPUT__COLUMN, Output.class, msgs);
			if (newDerivateFrom != null)
				msgs = ((InternalEObject)newDerivateFrom).eInverseAdd(this, AlgorithmPackage.OUTPUT__COLUMN, Output.class, msgs);
			msgs = basicSetDerivateFrom(newDerivateFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tablePackage.COLUMN__DERIVATE_FROM, newDerivateFrom, newDerivateFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case tablePackage.COLUMN__TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTable((Table)otherEnd, msgs);
			case tablePackage.COLUMN__DERIVATE_FROM:
				if (derivateFrom != null)
					msgs = ((InternalEObject)derivateFrom).eInverseRemove(this, AlgorithmPackage.OUTPUT__COLUMN, Output.class, msgs);
				return basicSetDerivateFrom((Output)otherEnd, msgs);
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
			case tablePackage.COLUMN__TABLE:
				return basicSetTable(null, msgs);
			case tablePackage.COLUMN__DERIVATE_FROM:
				return basicSetDerivateFrom(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case tablePackage.COLUMN__TABLE:
				return eInternalContainer().eInverseRemove(this, tablePackage.TABLE__COLUMN, Table.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case tablePackage.COLUMN__UID:
				return getUid();
			case tablePackage.COLUMN__TABLE:
				return getTable();
			case tablePackage.COLUMN__CONSTRAINTS:
				return getConstraints();
			case tablePackage.COLUMN__REFERENCES:
				if (resolve) return getReferences();
				return basicGetReferences();
			case tablePackage.COLUMN__DERIVATE_FROM:
				if (resolve) return getDerivateFrom();
				return basicGetDerivateFrom();
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
			case tablePackage.COLUMN__UID:
				setUid((String)newValue);
				return;
			case tablePackage.COLUMN__TABLE:
				setTable((Table)newValue);
				return;
			case tablePackage.COLUMN__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends String>)newValue);
				return;
			case tablePackage.COLUMN__REFERENCES:
				setReferences((Column)newValue);
				return;
			case tablePackage.COLUMN__DERIVATE_FROM:
				setDerivateFrom((Output)newValue);
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
			case tablePackage.COLUMN__UID:
				setUid(UID_EDEFAULT);
				return;
			case tablePackage.COLUMN__TABLE:
				setTable((Table)null);
				return;
			case tablePackage.COLUMN__CONSTRAINTS:
				getConstraints().clear();
				return;
			case tablePackage.COLUMN__REFERENCES:
				setReferences((Column)null);
				return;
			case tablePackage.COLUMN__DERIVATE_FROM:
				setDerivateFrom((Output)null);
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
			case tablePackage.COLUMN__UID:
				return UID_EDEFAULT == null ? uid != null : !UID_EDEFAULT.equals(uid);
			case tablePackage.COLUMN__TABLE:
				return getTable() != null;
			case tablePackage.COLUMN__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case tablePackage.COLUMN__REFERENCES:
				return references != null;
			case tablePackage.COLUMN__DERIVATE_FROM:
				return derivateFrom != null;
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
		result.append(" (uid: ");
		result.append(uid);
		result.append(", constraints: ");
		result.append(constraints);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
