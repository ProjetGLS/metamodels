/**
 */
package script.script.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import script.script.OperationTypeElement;
import script.script.Script;
import script.script.ScriptElement;
import script.script.scriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link script.script.impl.ScriptImpl#getScriptElement <em>Script Element</em>}</li>
 *   <li>{@link script.script.impl.ScriptImpl#getOperationElement <em>Operation Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptImpl extends EObjectImpl implements Script {
	/**
	 * The cached value of the '{@link #getScriptElement() <em>Script Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ScriptElement> scriptElement;

	/**
	 * The cached value of the '{@link #getOperationElement() <em>Operation Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationElement()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationTypeElement> operationElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return scriptPackage.Literals.SCRIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScriptElement> getScriptElement() {
		if (scriptElement == null) {
			scriptElement = new EObjectContainmentEList<ScriptElement>(ScriptElement.class, this, scriptPackage.SCRIPT__SCRIPT_ELEMENT);
		}
		return scriptElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationTypeElement> getOperationElement() {
		if (operationElement == null) {
			operationElement = new EObjectContainmentEList<OperationTypeElement>(OperationTypeElement.class, this, scriptPackage.SCRIPT__OPERATION_ELEMENT);
		}
		return operationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case scriptPackage.SCRIPT__SCRIPT_ELEMENT:
				return ((InternalEList<?>)getScriptElement()).basicRemove(otherEnd, msgs);
			case scriptPackage.SCRIPT__OPERATION_ELEMENT:
				return ((InternalEList<?>)getOperationElement()).basicRemove(otherEnd, msgs);
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
			case scriptPackage.SCRIPT__SCRIPT_ELEMENT:
				return getScriptElement();
			case scriptPackage.SCRIPT__OPERATION_ELEMENT:
				return getOperationElement();
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
			case scriptPackage.SCRIPT__SCRIPT_ELEMENT:
				getScriptElement().clear();
				getScriptElement().addAll((Collection<? extends ScriptElement>)newValue);
				return;
			case scriptPackage.SCRIPT__OPERATION_ELEMENT:
				getOperationElement().clear();
				getOperationElement().addAll((Collection<? extends OperationTypeElement>)newValue);
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
			case scriptPackage.SCRIPT__SCRIPT_ELEMENT:
				getScriptElement().clear();
				return;
			case scriptPackage.SCRIPT__OPERATION_ELEMENT:
				getOperationElement().clear();
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
			case scriptPackage.SCRIPT__SCRIPT_ELEMENT:
				return scriptElement != null && !scriptElement.isEmpty();
			case scriptPackage.SCRIPT__OPERATION_ELEMENT:
				return operationElement != null && !operationElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScriptImpl
