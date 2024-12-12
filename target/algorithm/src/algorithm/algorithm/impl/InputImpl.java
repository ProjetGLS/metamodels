/**
 */
package algorithm.algorithm.impl;

import algorithm.algorithm.Algorithm;
import algorithm.algorithm.Input;
import algorithm.algorithm.algorithmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import table.Column;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithm.algorithm.impl.InputImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link algorithm.algorithm.impl.InputImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link algorithm.algorithm.impl.InputImpl#getScript <em>Script</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends EObjectImpl implements Input {
	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> column;

	/**
	 * The cached value of the '{@link #getScript() <em>Script</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected EList<script.Input> script;

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
		return algorithmPackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumn() {
		if (column == null) {
			column = new EObjectResolvingEList<Column>(Column.class, this, algorithmPackage.INPUT__COLUMN);
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Algorithm getAlgorithm() {
		if (eContainerFeatureID() != algorithmPackage.INPUT__ALGORITHM) return null;
		return (Algorithm)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgorithm(Algorithm newAlgorithm, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAlgorithm, algorithmPackage.INPUT__ALGORITHM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlgorithm(Algorithm newAlgorithm) {
		if (newAlgorithm != eInternalContainer() || (eContainerFeatureID() != algorithmPackage.INPUT__ALGORITHM && newAlgorithm != null)) {
			if (EcoreUtil.isAncestor(this, newAlgorithm))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAlgorithm != null)
				msgs = ((InternalEObject)newAlgorithm).eInverseAdd(this, algorithmPackage.ALGORITHM__INPUTS, Algorithm.class, msgs);
			msgs = basicSetAlgorithm(newAlgorithm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, algorithmPackage.INPUT__ALGORITHM, newAlgorithm, newAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<script.Input> getScript() {
		if (script == null) {
			script = new EObjectResolvingEList<script.Input>(script.Input.class, this, algorithmPackage.INPUT__SCRIPT);
		}
		return script;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case algorithmPackage.INPUT__ALGORITHM:
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
			case algorithmPackage.INPUT__ALGORITHM:
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
			case algorithmPackage.INPUT__ALGORITHM:
				return eInternalContainer().eInverseRemove(this, algorithmPackage.ALGORITHM__INPUTS, Algorithm.class, msgs);
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
			case algorithmPackage.INPUT__COLUMN:
				return getColumn();
			case algorithmPackage.INPUT__ALGORITHM:
				return getAlgorithm();
			case algorithmPackage.INPUT__SCRIPT:
				return getScript();
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
			case algorithmPackage.INPUT__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends Column>)newValue);
				return;
			case algorithmPackage.INPUT__ALGORITHM:
				setAlgorithm((Algorithm)newValue);
				return;
			case algorithmPackage.INPUT__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends script.Input>)newValue);
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
			case algorithmPackage.INPUT__COLUMN:
				getColumn().clear();
				return;
			case algorithmPackage.INPUT__ALGORITHM:
				setAlgorithm((Algorithm)null);
				return;
			case algorithmPackage.INPUT__SCRIPT:
				getScript().clear();
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
			case algorithmPackage.INPUT__COLUMN:
				return column != null && !column.isEmpty();
			case algorithmPackage.INPUT__ALGORITHM:
				return getAlgorithm() != null;
			case algorithmPackage.INPUT__SCRIPT:
				return script != null && !script.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InputImpl
