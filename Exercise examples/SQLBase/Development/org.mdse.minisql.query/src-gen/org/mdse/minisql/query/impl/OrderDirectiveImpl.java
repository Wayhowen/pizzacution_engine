/**
 */
package org.mdse.minisql.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mdse.minisql.query.ColumnReference;
import org.mdse.minisql.query.OrderDirection;
import org.mdse.minisql.query.OrderDirective;
import org.mdse.minisql.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.impl.OrderDirectiveImpl#getColumnReference <em>Column Reference</em>}</li>
 *   <li>{@link org.mdse.minisql.query.impl.OrderDirectiveImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderDirectiveImpl extends MinimalEObjectImpl.Container implements OrderDirective {
	/**
	 * The cached value of the '{@link #getColumnReference() <em>Column Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnReference()
	 * @generated
	 * @ordered
	 */
	protected ColumnReference columnReference;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final OrderDirection DIRECTION_EDEFAULT = OrderDirection.ASCENDING;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected OrderDirection direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderDirectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.ORDER_DIRECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColumnReference getColumnReference() {
		return columnReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumnReference(ColumnReference newColumnReference, NotificationChain msgs) {
		ColumnReference oldColumnReference = columnReference;
		columnReference = newColumnReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.ORDER_DIRECTIVE__COLUMN_REFERENCE, oldColumnReference, newColumnReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumnReference(ColumnReference newColumnReference) {
		if (newColumnReference != columnReference) {
			NotificationChain msgs = null;
			if (columnReference != null)
				msgs = ((InternalEObject)columnReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ORDER_DIRECTIVE__COLUMN_REFERENCE, null, msgs);
			if (newColumnReference != null)
				msgs = ((InternalEObject)newColumnReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.ORDER_DIRECTIVE__COLUMN_REFERENCE, null, msgs);
			msgs = basicSetColumnReference(newColumnReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ORDER_DIRECTIVE__COLUMN_REFERENCE, newColumnReference, newColumnReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(OrderDirection newDirection) {
		OrderDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.ORDER_DIRECTIVE__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.ORDER_DIRECTIVE__COLUMN_REFERENCE:
				return basicSetColumnReference(null, msgs);
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
			case QueryPackage.ORDER_DIRECTIVE__COLUMN_REFERENCE:
				return getColumnReference();
			case QueryPackage.ORDER_DIRECTIVE__DIRECTION:
				return getDirection();
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
			case QueryPackage.ORDER_DIRECTIVE__COLUMN_REFERENCE:
				setColumnReference((ColumnReference)newValue);
				return;
			case QueryPackage.ORDER_DIRECTIVE__DIRECTION:
				setDirection((OrderDirection)newValue);
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
			case QueryPackage.ORDER_DIRECTIVE__COLUMN_REFERENCE:
				setColumnReference((ColumnReference)null);
				return;
			case QueryPackage.ORDER_DIRECTIVE__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
			case QueryPackage.ORDER_DIRECTIVE__COLUMN_REFERENCE:
				return columnReference != null;
			case QueryPackage.ORDER_DIRECTIVE__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //OrderDirectiveImpl
