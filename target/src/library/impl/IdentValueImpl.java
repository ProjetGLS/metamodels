/**
 */
package src.library.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import src.library.ColumnData;
import src.library.IdentValue;
import src.library.libraryPackage;

import src.table.IdentColumn;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ident Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link src.library.impl.IdentValueImpl#getData <em>Data</em>}</li>
 *   <li>{@link src.library.impl.IdentValueImpl#getIdentColumn <em>Ident Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentValueImpl extends EObjectImpl implements IdentValue {
	/**
	 * The cached value of the '{@link #getIdentColumn() <em>Ident Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentColumn()
	 * @generated
	 * @ordered
	 */
	protected IdentColumn identColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return libraryPackage.Literals.IDENT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnData getData() {
		if (eContainerFeatureID() != libraryPackage.IDENT_VALUE__DATA) return null;
		return (ColumnData)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(ColumnData newData, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newData, libraryPackage.IDENT_VALUE__DATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(ColumnData newData) {
		if (newData != eInternalContainer() || (eContainerFeatureID() != libraryPackage.IDENT_VALUE__DATA && newData != null)) {
			if (EcoreUtil.isAncestor(this, newData))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newData != null)
				msgs = ((InternalEObject)newData).eInverseAdd(this, libraryPackage.COLUMN_DATA__IDENT_VALUES, ColumnData.class, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, libraryPackage.IDENT_VALUE__DATA, newData, newData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentColumn getIdentColumn() {
		if (identColumn != null && identColumn.eIsProxy()) {
			InternalEObject oldIdentColumn = (InternalEObject)identColumn;
			identColumn = (IdentColumn)eResolveProxy(oldIdentColumn);
			if (identColumn != oldIdentColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, libraryPackage.IDENT_VALUE__IDENT_COLUMN, oldIdentColumn, identColumn));
			}
		}
		return identColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentColumn basicGetIdentColumn() {
		return identColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentColumn(IdentColumn newIdentColumn) {
		IdentColumn oldIdentColumn = identColumn;
		identColumn = newIdentColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, libraryPackage.IDENT_VALUE__IDENT_COLUMN, oldIdentColumn, identColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case libraryPackage.IDENT_VALUE__DATA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetData((ColumnData)otherEnd, msgs);
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
			case libraryPackage.IDENT_VALUE__DATA:
				return basicSetData(null, msgs);
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
			case libraryPackage.IDENT_VALUE__DATA:
				return eInternalContainer().eInverseRemove(this, libraryPackage.COLUMN_DATA__IDENT_VALUES, ColumnData.class, msgs);
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
			case libraryPackage.IDENT_VALUE__DATA:
				return getData();
			case libraryPackage.IDENT_VALUE__IDENT_COLUMN:
				if (resolve) return getIdentColumn();
				return basicGetIdentColumn();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case libraryPackage.IDENT_VALUE__DATA:
				setData((ColumnData)newValue);
				return;
			case libraryPackage.IDENT_VALUE__IDENT_COLUMN:
				setIdentColumn((IdentColumn)newValue);
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
			case libraryPackage.IDENT_VALUE__DATA:
				setData((ColumnData)null);
				return;
			case libraryPackage.IDENT_VALUE__IDENT_COLUMN:
				setIdentColumn((IdentColumn)null);
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
			case libraryPackage.IDENT_VALUE__DATA:
				return getData() != null;
			case libraryPackage.IDENT_VALUE__IDENT_COLUMN:
				return identColumn != null;
		}
		return super.eIsSet(featureID);
	}

} //IdentValueImpl
