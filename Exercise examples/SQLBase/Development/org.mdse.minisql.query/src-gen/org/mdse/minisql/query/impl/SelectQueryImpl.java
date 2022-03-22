/**
 */
package org.mdse.minisql.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mdse.minisql.query.FromClause;
import org.mdse.minisql.query.OrderByClause;
import org.mdse.minisql.query.QueryPackage;
import org.mdse.minisql.query.SelectQuery;
import org.mdse.minisql.query.WhatClause;
import org.mdse.minisql.query.WhereClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.impl.SelectQueryImpl#getWhatClause <em>What Clause</em>}</li>
 *   <li>{@link org.mdse.minisql.query.impl.SelectQueryImpl#getFromClause <em>From Clause</em>}</li>
 *   <li>{@link org.mdse.minisql.query.impl.SelectQueryImpl#getWhereClause <em>Where Clause</em>}</li>
 *   <li>{@link org.mdse.minisql.query.impl.SelectQueryImpl#getOrderByClause <em>Order By Clause</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectQueryImpl extends MinimalEObjectImpl.Container implements SelectQuery {
	/**
	 * The cached value of the '{@link #getWhatClause() <em>What Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhatClause()
	 * @generated
	 * @ordered
	 */
	protected WhatClause whatClause;

	/**
	 * The cached value of the '{@link #getFromClause() <em>From Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromClause()
	 * @generated
	 * @ordered
	 */
	protected FromClause fromClause;

	/**
	 * The cached value of the '{@link #getWhereClause() <em>Where Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhereClause()
	 * @generated
	 * @ordered
	 */
	protected WhereClause whereClause;

	/**
	 * The cached value of the '{@link #getOrderByClause() <em>Order By Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderByClause()
	 * @generated
	 * @ordered
	 */
	protected OrderByClause orderByClause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.SELECT_QUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhatClause getWhatClause() {
		return whatClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhatClause(WhatClause newWhatClause, NotificationChain msgs) {
		WhatClause oldWhatClause = whatClause;
		whatClause = newWhatClause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SELECT_QUERY__WHAT_CLAUSE, oldWhatClause, newWhatClause);
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
	public void setWhatClause(WhatClause newWhatClause) {
		if (newWhatClause != whatClause) {
			NotificationChain msgs = null;
			if (whatClause != null)
				msgs = ((InternalEObject)whatClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SELECT_QUERY__WHAT_CLAUSE, null, msgs);
			if (newWhatClause != null)
				msgs = ((InternalEObject)newWhatClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SELECT_QUERY__WHAT_CLAUSE, null, msgs);
			msgs = basicSetWhatClause(newWhatClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SELECT_QUERY__WHAT_CLAUSE, newWhatClause, newWhatClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FromClause getFromClause() {
		return fromClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromClause(FromClause newFromClause, NotificationChain msgs) {
		FromClause oldFromClause = fromClause;
		fromClause = newFromClause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SELECT_QUERY__FROM_CLAUSE, oldFromClause, newFromClause);
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
	public void setFromClause(FromClause newFromClause) {
		if (newFromClause != fromClause) {
			NotificationChain msgs = null;
			if (fromClause != null)
				msgs = ((InternalEObject)fromClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SELECT_QUERY__FROM_CLAUSE, null, msgs);
			if (newFromClause != null)
				msgs = ((InternalEObject)newFromClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SELECT_QUERY__FROM_CLAUSE, null, msgs);
			msgs = basicSetFromClause(newFromClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SELECT_QUERY__FROM_CLAUSE, newFromClause, newFromClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WhereClause getWhereClause() {
		return whereClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhereClause(WhereClause newWhereClause, NotificationChain msgs) {
		WhereClause oldWhereClause = whereClause;
		whereClause = newWhereClause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SELECT_QUERY__WHERE_CLAUSE, oldWhereClause, newWhereClause);
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
	public void setWhereClause(WhereClause newWhereClause) {
		if (newWhereClause != whereClause) {
			NotificationChain msgs = null;
			if (whereClause != null)
				msgs = ((InternalEObject)whereClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SELECT_QUERY__WHERE_CLAUSE, null, msgs);
			if (newWhereClause != null)
				msgs = ((InternalEObject)newWhereClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SELECT_QUERY__WHERE_CLAUSE, null, msgs);
			msgs = basicSetWhereClause(newWhereClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SELECT_QUERY__WHERE_CLAUSE, newWhereClause, newWhereClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderByClause getOrderByClause() {
		return orderByClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderByClause(OrderByClause newOrderByClause, NotificationChain msgs) {
		OrderByClause oldOrderByClause = orderByClause;
		orderByClause = newOrderByClause;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SELECT_QUERY__ORDER_BY_CLAUSE, oldOrderByClause, newOrderByClause);
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
	public void setOrderByClause(OrderByClause newOrderByClause) {
		if (newOrderByClause != orderByClause) {
			NotificationChain msgs = null;
			if (orderByClause != null)
				msgs = ((InternalEObject)orderByClause).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SELECT_QUERY__ORDER_BY_CLAUSE, null, msgs);
			if (newOrderByClause != null)
				msgs = ((InternalEObject)newOrderByClause).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SELECT_QUERY__ORDER_BY_CLAUSE, null, msgs);
			msgs = basicSetOrderByClause(newOrderByClause, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SELECT_QUERY__ORDER_BY_CLAUSE, newOrderByClause, newOrderByClause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.SELECT_QUERY__WHAT_CLAUSE:
				return basicSetWhatClause(null, msgs);
			case QueryPackage.SELECT_QUERY__FROM_CLAUSE:
				return basicSetFromClause(null, msgs);
			case QueryPackage.SELECT_QUERY__WHERE_CLAUSE:
				return basicSetWhereClause(null, msgs);
			case QueryPackage.SELECT_QUERY__ORDER_BY_CLAUSE:
				return basicSetOrderByClause(null, msgs);
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
			case QueryPackage.SELECT_QUERY__WHAT_CLAUSE:
				return getWhatClause();
			case QueryPackage.SELECT_QUERY__FROM_CLAUSE:
				return getFromClause();
			case QueryPackage.SELECT_QUERY__WHERE_CLAUSE:
				return getWhereClause();
			case QueryPackage.SELECT_QUERY__ORDER_BY_CLAUSE:
				return getOrderByClause();
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
			case QueryPackage.SELECT_QUERY__WHAT_CLAUSE:
				setWhatClause((WhatClause)newValue);
				return;
			case QueryPackage.SELECT_QUERY__FROM_CLAUSE:
				setFromClause((FromClause)newValue);
				return;
			case QueryPackage.SELECT_QUERY__WHERE_CLAUSE:
				setWhereClause((WhereClause)newValue);
				return;
			case QueryPackage.SELECT_QUERY__ORDER_BY_CLAUSE:
				setOrderByClause((OrderByClause)newValue);
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
			case QueryPackage.SELECT_QUERY__WHAT_CLAUSE:
				setWhatClause((WhatClause)null);
				return;
			case QueryPackage.SELECT_QUERY__FROM_CLAUSE:
				setFromClause((FromClause)null);
				return;
			case QueryPackage.SELECT_QUERY__WHERE_CLAUSE:
				setWhereClause((WhereClause)null);
				return;
			case QueryPackage.SELECT_QUERY__ORDER_BY_CLAUSE:
				setOrderByClause((OrderByClause)null);
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
			case QueryPackage.SELECT_QUERY__WHAT_CLAUSE:
				return whatClause != null;
			case QueryPackage.SELECT_QUERY__FROM_CLAUSE:
				return fromClause != null;
			case QueryPackage.SELECT_QUERY__WHERE_CLAUSE:
				return whereClause != null;
			case QueryPackage.SELECT_QUERY__ORDER_BY_CLAUSE:
				return orderByClause != null;
		}
		return super.eIsSet(featureID);
	}

} //SelectQueryImpl
