/**
 */
package script.script.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import script.script.Operation;
import script.script.OperationTypeElement;
import script.script.ScriptElement;
import script.script.scriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link script.script.impl.OperationImpl#getOperand <em>Operand</em>}</li>
 *   <li>{@link script.script.impl.OperationImpl#getOpType <em>Op Type</em>}</li>
 *   <li>{@link script.script.impl.OperationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends ScriptElementImpl implements Operation {
	/**
	 * The cached value of the '{@link #getOperand() <em>Operand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected EList<ScriptElement> operand;

	/**
	 * The cached value of the '{@link #getOpType() <em>Op Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpType()
	 * @generated
	 * @ordered
	 */
	protected OperationTypeElement opType;

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
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scriptPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScriptElement> getOperand() {
		if (operand == null) {
			operand = new EObjectResolvingEList<ScriptElement>(ScriptElement.class, this, scriptPackage.OPERATION__OPERAND);
		}
		return operand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationTypeElement getOpType() {
		if (opType != null && opType.eIsProxy()) {
			InternalEObject oldOpType = (InternalEObject)opType;
			opType = (OperationTypeElement)eResolveProxy(oldOpType);
			if (opType != oldOpType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scriptPackage.OPERATION__OP_TYPE, oldOpType, opType));
			}
		}
		return opType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationTypeElement basicGetOpType() {
		return opType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpType(OperationTypeElement newOpType) {
		OperationTypeElement oldOpType = opType;
		opType = newOpType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scriptPackage.OPERATION__OP_TYPE, oldOpType, opType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, scriptPackage.OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case scriptPackage.OPERATION__OPERAND:
				return getOperand();
			case scriptPackage.OPERATION__OP_TYPE:
				if (resolve) return getOpType();
				return basicGetOpType();
			case scriptPackage.OPERATION__NAME:
				return getName();
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
			case scriptPackage.OPERATION__OPERAND:
				getOperand().clear();
				getOperand().addAll((Collection<? extends ScriptElement>)newValue);
				return;
			case scriptPackage.OPERATION__OP_TYPE:
				setOpType((OperationTypeElement)newValue);
				return;
			case scriptPackage.OPERATION__NAME:
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
			case scriptPackage.OPERATION__OPERAND:
				getOperand().clear();
				return;
			case scriptPackage.OPERATION__OP_TYPE:
				setOpType((OperationTypeElement)null);
				return;
			case scriptPackage.OPERATION__NAME:
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
			case scriptPackage.OPERATION__OPERAND:
				return operand != null && !operand.isEmpty();
			case scriptPackage.OPERATION__OP_TYPE:
				return opType != null;
			case scriptPackage.OPERATION__NAME:
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
		result.append(" (Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
