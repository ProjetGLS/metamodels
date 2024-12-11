/**
 */
package table.table.impl;

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
import table.table.Typr;
import table.table.tablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link table.table.impl.ColumnImpl#getIndice <em>Indice</em>}</li>
 *   <li>{@link table.table.impl.ColumnImpl#getTable <em>Table</em>}</li>
 *   <li>{@link table.table.impl.ColumnImpl#getContraintes <em>Contraintes</em>}</li>
 *   <li>{@link table.table.impl.ColumnImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColumnImpl extends EObjectImpl implements Column {
	/**
	 * The default value of the '{@link #getIndice() <em>Indice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndice()
	 * @generated
	 * @ordered
	 */
	protected static final int INDICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndice() <em>Indice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndice()
	 * @generated
	 * @ordered
	 */
	protected int indice = INDICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContraintes() <em>Contraintes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraintes()
	 * @generated
	 * @ordered
	 */
	protected EList<Boolean> contraintes;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Typr TYPE_EDEFAULT = Typr.INTEGER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Typr type = TYPE_EDEFAULT;

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
	public int getIndice() {
		return indice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndice(int newIndice) {
		int oldIndice = indice;
		indice = newIndice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tablePackage.COLUMN__INDICE, oldIndice, indice));
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
	public EList<Boolean> getContraintes() {
		if (contraintes == null) {
			contraintes = new EDataTypeUniqueEList<Boolean>(Boolean.class, this, tablePackage.COLUMN__CONTRAINTES);
		}
		return contraintes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Typr getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Typr newType) {
		Typr oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, tablePackage.COLUMN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column Column() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case tablePackage.COLUMN__INDICE:
				return getIndice();
			case tablePackage.COLUMN__TABLE:
				return getTable();
			case tablePackage.COLUMN__CONTRAINTES:
				return getContraintes();
			case tablePackage.COLUMN__TYPE:
				return getType();
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
			case tablePackage.COLUMN__INDICE:
				setIndice((Integer)newValue);
				return;
			case tablePackage.COLUMN__TABLE:
				setTable((Table)newValue);
				return;
			case tablePackage.COLUMN__CONTRAINTES:
				getContraintes().clear();
				getContraintes().addAll((Collection<? extends Boolean>)newValue);
				return;
			case tablePackage.COLUMN__TYPE:
				setType((Typr)newValue);
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
			case tablePackage.COLUMN__INDICE:
				setIndice(INDICE_EDEFAULT);
				return;
			case tablePackage.COLUMN__TABLE:
				setTable((Table)null);
				return;
			case tablePackage.COLUMN__CONTRAINTES:
				getContraintes().clear();
				return;
			case tablePackage.COLUMN__TYPE:
				setType(TYPE_EDEFAULT);
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
			case tablePackage.COLUMN__INDICE:
				return indice != INDICE_EDEFAULT;
			case tablePackage.COLUMN__TABLE:
				return getTable() != null;
			case tablePackage.COLUMN__CONTRAINTES:
				return contraintes != null && !contraintes.isEmpty();
			case tablePackage.COLUMN__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (indice: ");
		result.append(indice);
		result.append(", contraintes: ");
		result.append(contraintes);
		result.append(", Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ColumnImpl
