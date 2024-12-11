/**
 */
package script.script.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import script.script.OperationType;
import script.script.scriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link script.script.impl.OperationTypeImpl#getNbOperands <em>Nb Operands</em>}</li>
 *   <li>{@link script.script.impl.OperationTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationTypeImpl extends OperationTypeElementImpl implements OperationType {
	/**
	 * The default value of the '{@link #getNbOperands() <em>Nb Operands</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOperands()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_OPERANDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbOperands() <em>Nb Operands</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbOperands()
	 * @generated
	 * @ordered
	 */
	protected int nbOperands = NB_OPERANDS_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scriptPackage.Literals.OPERATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbOperands() {
		return nbOperands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbOperands(int newNbOperands) {
		int oldNbOperands = nbOperands;
		nbOperands = newNbOperands;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scriptPackage.OPERATION_TYPE__NB_OPERANDS, oldNbOperands, nbOperands));
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
			eNotify(new ENotificationImpl(this, Notification.SET, scriptPackage.OPERATION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case scriptPackage.OPERATION_TYPE__NB_OPERANDS:
				return getNbOperands();
			case scriptPackage.OPERATION_TYPE__NAME:
				return getName();
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
			case scriptPackage.OPERATION_TYPE__NB_OPERANDS:
				setNbOperands((Integer)newValue);
				return;
			case scriptPackage.OPERATION_TYPE__NAME:
				setName((String)newValue);
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
			case scriptPackage.OPERATION_TYPE__NB_OPERANDS:
				setNbOperands(NB_OPERANDS_EDEFAULT);
				return;
			case scriptPackage.OPERATION_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case scriptPackage.OPERATION_TYPE__NB_OPERANDS:
				return nbOperands != NB_OPERANDS_EDEFAULT;
			case scriptPackage.OPERATION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (nbOperands: ");
		result.append(nbOperands);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OperationTypeImpl
