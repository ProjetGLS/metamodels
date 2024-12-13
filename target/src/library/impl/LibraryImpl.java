/**
 */
package src.library.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import src.algorithm.Algorithm;

import src.library.ColumnData;
import src.library.ExternalData;
import src.library.Library;
import src.library.libraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link src.library.impl.LibraryImpl#getName <em>Name</em>}</li>
 *   <li>{@link src.library.impl.LibraryImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link src.library.impl.LibraryImpl#getData <em>Data</em>}</li>
 *   <li>{@link src.library.impl.LibraryImpl#getExternalData <em>External Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryImpl extends EObjectImpl implements Library {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected EList<Algorithm> algorithm;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<ColumnData> data;

	/**
	 * The cached value of the '{@link #getExternalData() <em>External Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalData()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalData> externalData;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return libraryPackage.Literals.LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, libraryPackage.LIBRARY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Algorithm> getAlgorithm() {
		if (algorithm == null) {
			algorithm = new EObjectResolvingEList<Algorithm>(Algorithm.class, this, libraryPackage.LIBRARY__ALGORITHM);
		}
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColumnData> getData() {
		if (data == null) {
			data = new EObjectResolvingEList<ColumnData>(ColumnData.class, this, libraryPackage.LIBRARY__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalData> getExternalData() {
		if (externalData == null) {
			externalData = new EObjectResolvingEList<ExternalData>(ExternalData.class, this, libraryPackage.LIBRARY__EXTERNAL_DATA);
		}
		return externalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case libraryPackage.LIBRARY__NAME:
				return getName();
			case libraryPackage.LIBRARY__ALGORITHM:
				return getAlgorithm();
			case libraryPackage.LIBRARY__DATA:
				return getData();
			case libraryPackage.LIBRARY__EXTERNAL_DATA:
				return getExternalData();
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
			case libraryPackage.LIBRARY__NAME:
				setName((String)newValue);
				return;
			case libraryPackage.LIBRARY__ALGORITHM:
				getAlgorithm().clear();
				getAlgorithm().addAll((Collection<? extends Algorithm>)newValue);
				return;
			case libraryPackage.LIBRARY__DATA:
				getData().clear();
				getData().addAll((Collection<? extends ColumnData>)newValue);
				return;
			case libraryPackage.LIBRARY__EXTERNAL_DATA:
				getExternalData().clear();
				getExternalData().addAll((Collection<? extends ExternalData>)newValue);
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
			case libraryPackage.LIBRARY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case libraryPackage.LIBRARY__ALGORITHM:
				getAlgorithm().clear();
				return;
			case libraryPackage.LIBRARY__DATA:
				getData().clear();
				return;
			case libraryPackage.LIBRARY__EXTERNAL_DATA:
				getExternalData().clear();
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
			case libraryPackage.LIBRARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case libraryPackage.LIBRARY__ALGORITHM:
				return algorithm != null && !algorithm.isEmpty();
			case libraryPackage.LIBRARY__DATA:
				return data != null && !data.isEmpty();
			case libraryPackage.LIBRARY__EXTERNAL_DATA:
				return externalData != null && !externalData.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LibraryImpl
