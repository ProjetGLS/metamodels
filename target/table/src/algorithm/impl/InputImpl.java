/**
 */
package algorithm.impl;

import algorithm.Algorithm;
import algorithm.AlgorithmPackage;
import algorithm.Input;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import table.table.Column;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithm.impl.InputImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link algorithm.impl.InputImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link algorithm.impl.InputImpl#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends EObjectImpl implements Input {
	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected Column column;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected script.script.Input script;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AlgorithmPackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getColumn() {
		if (column != null && column.eIsProxy()) {
			InternalEObject oldColumn = (InternalEObject)column;
			column = (Column)eResolveProxy(oldColumn);
			if (column != oldColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmPackage.INPUT__COLUMN, oldColumn, column));
			}
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(Column newColumn) {
		Column oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmPackage.INPUT__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Algorithm getAlgorithm() {
		if (eContainerFeatureID() != AlgorithmPackage.INPUT__ALGORITHM) return null;
		return (Algorithm)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgorithm(Algorithm newAlgorithm, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAlgorithm, AlgorithmPackage.INPUT__ALGORITHM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm(Algorithm newAlgorithm) {
		if (newAlgorithm != eInternalContainer() || (eContainerFeatureID() != AlgorithmPackage.INPUT__ALGORITHM && newAlgorithm != null)) {
			if (EcoreUtil.isAncestor(this, newAlgorithm))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAlgorithm != null)
				msgs = ((InternalEObject)newAlgorithm).eInverseAdd(this, AlgorithmPackage.ALGORITHM__INPUTS, Algorithm.class, msgs);
			msgs = basicSetAlgorithm(newAlgorithm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmPackage.INPUT__ALGORITHM, newAlgorithm, newAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public script.script.Input getScript() {
		if (script != null && script.eIsProxy()) {
			InternalEObject oldScript = (InternalEObject)script;
			script = (script.script.Input)eResolveProxy(oldScript);
			if (script != oldScript) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlgorithmPackage.INPUT__SCRIPT, oldScript, script));
			}
		}
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public script.script.Input basicGetScript() {
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(script.script.Input newScript) {
		script.script.Input oldScript = script;
		script = newScript;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AlgorithmPackage.INPUT__SCRIPT, oldScript, script));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AlgorithmPackage.INPUT__ALGORITHM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAlgorithm((Algorithm)otherEnd, msgs);
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
			case AlgorithmPackage.INPUT__ALGORITHM:
				return basicSetAlgorithm(null, msgs);
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
			case AlgorithmPackage.INPUT__ALGORITHM:
				return eInternalContainer().eInverseRemove(this, AlgorithmPackage.ALGORITHM__INPUTS, Algorithm.class, msgs);
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
			case AlgorithmPackage.INPUT__COLUMN:
				if (resolve) return getColumn();
				return basicGetColumn();
			case AlgorithmPackage.INPUT__ALGORITHM:
				return getAlgorithm();
			case AlgorithmPackage.INPUT__SCRIPT:
				if (resolve) return getScript();
				return basicGetScript();
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
			case AlgorithmPackage.INPUT__COLUMN:
				setColumn((Column)newValue);
				return;
			case AlgorithmPackage.INPUT__ALGORITHM:
				setAlgorithm((Algorithm)newValue);
				return;
			case AlgorithmPackage.INPUT__SCRIPT:
				setScript((script.script.Input)newValue);
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
			case AlgorithmPackage.INPUT__COLUMN:
				setColumn((Column)null);
				return;
			case AlgorithmPackage.INPUT__ALGORITHM:
				setAlgorithm((Algorithm)null);
				return;
			case AlgorithmPackage.INPUT__SCRIPT:
				setScript((script.script.Input)null);
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
			case AlgorithmPackage.INPUT__COLUMN:
				return column != null;
			case AlgorithmPackage.INPUT__ALGORITHM:
				return getAlgorithm() != null;
			case AlgorithmPackage.INPUT__SCRIPT:
				return script != null;
		}
		return super.eIsSet(featureID);
	}

} //InputImpl
