/**
 */
package script.script.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import script.script.InternalInput;
import script.script.InternalOutput;
import script.script.Operation;
import script.script.scriptPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link script.script.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link script.script.impl.OperationImpl#getArity <em>Arity</em>}</li>
 *   <li>{@link script.script.impl.OperationImpl#isInfix <em>Infix</em>}</li>
 *   <li>{@link script.script.impl.OperationImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link script.script.impl.OperationImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends EObjectImpl implements Operation {
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
	 * The default value of the '{@link #getArity() <em>Arity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArity()
	 * @generated
	 * @ordered
	 */
	protected static final int ARITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getArity() <em>Arity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArity()
	 * @generated
	 * @ordered
	 */
	protected int arity = ARITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isInfix() <em>Infix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInfix()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INFIX_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInfix() <em>Infix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInfix()
	 * @generated
	 * @ordered
	 */
	protected boolean infix = INFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<InternalInput> inputs;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected InternalOutput output;

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
	public int getArity() {
		return arity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArity(int newArity) {
		int oldArity = arity;
		arity = newArity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scriptPackage.OPERATION__ARITY, oldArity, arity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInfix() {
		return infix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfix(boolean newInfix) {
		boolean oldInfix = infix;
		infix = newInfix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scriptPackage.OPERATION__INFIX, oldInfix, infix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InternalInput> getInputs() {
		if (inputs == null) {
			inputs = new EObjectResolvingEList<InternalInput>(InternalInput.class, this, scriptPackage.OPERATION__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalOutput getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject)output;
			output = (InternalOutput)eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, scriptPackage.OPERATION__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalOutput basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(InternalOutput newOutput) {
		InternalOutput oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, scriptPackage.OPERATION__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case scriptPackage.OPERATION__NAME:
				return getName();
			case scriptPackage.OPERATION__ARITY:
				return getArity();
			case scriptPackage.OPERATION__INFIX:
				return isInfix();
			case scriptPackage.OPERATION__INPUTS:
				return getInputs();
			case scriptPackage.OPERATION__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
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
			case scriptPackage.OPERATION__NAME:
				setName((String)newValue);
				return;
			case scriptPackage.OPERATION__ARITY:
				setArity((Integer)newValue);
				return;
			case scriptPackage.OPERATION__INFIX:
				setInfix((Boolean)newValue);
				return;
			case scriptPackage.OPERATION__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends InternalInput>)newValue);
				return;
			case scriptPackage.OPERATION__OUTPUT:
				setOutput((InternalOutput)newValue);
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
			case scriptPackage.OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case scriptPackage.OPERATION__ARITY:
				setArity(ARITY_EDEFAULT);
				return;
			case scriptPackage.OPERATION__INFIX:
				setInfix(INFIX_EDEFAULT);
				return;
			case scriptPackage.OPERATION__INPUTS:
				getInputs().clear();
				return;
			case scriptPackage.OPERATION__OUTPUT:
				setOutput((InternalOutput)null);
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
			case scriptPackage.OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case scriptPackage.OPERATION__ARITY:
				return arity != ARITY_EDEFAULT;
			case scriptPackage.OPERATION__INFIX:
				return infix != INFIX_EDEFAULT;
			case scriptPackage.OPERATION__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case scriptPackage.OPERATION__OUTPUT:
				return output != null;
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
		result.append(", arity: ");
		result.append(arity);
		result.append(", infix: ");
		result.append(infix);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
