/**
 */
package script.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import script.InternalOutput;
import script.Output;
import script.ScriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link script.impl.OutputImpl#getInternalOutput <em>Internal Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputImpl extends EObjectImpl implements Output {
	/**
	 * The cached value of the '{@link #getInternalOutput() <em>Internal Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalOutput()
	 * @generated
	 * @ordered
	 */
	protected InternalOutput internalOutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScriptPackage.Literals.OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalOutput getInternalOutput() {
		if (internalOutput != null && internalOutput.eIsProxy()) {
			InternalEObject oldInternalOutput = (InternalEObject)internalOutput;
			internalOutput = (InternalOutput)eResolveProxy(oldInternalOutput);
			if (internalOutput != oldInternalOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScriptPackage.OUTPUT__INTERNAL_OUTPUT, oldInternalOutput, internalOutput));
			}
		}
		return internalOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalOutput basicGetInternalOutput() {
		return internalOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalOutput(InternalOutput newInternalOutput) {
		InternalOutput oldInternalOutput = internalOutput;
		internalOutput = newInternalOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScriptPackage.OUTPUT__INTERNAL_OUTPUT, oldInternalOutput, internalOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScriptPackage.OUTPUT__INTERNAL_OUTPUT:
				if (resolve) return getInternalOutput();
				return basicGetInternalOutput();
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
			case ScriptPackage.OUTPUT__INTERNAL_OUTPUT:
				setInternalOutput((InternalOutput)newValue);
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
			case ScriptPackage.OUTPUT__INTERNAL_OUTPUT:
				setInternalOutput((InternalOutput)null);
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
			case ScriptPackage.OUTPUT__INTERNAL_OUTPUT:
				return internalOutput != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputImpl
