/**
 */
package org.mdse.minisql.query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mdse.minisql.query.OrderByClause;
import org.mdse.minisql.query.OrderDirective;
import org.mdse.minisql.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order By Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.impl.OrderByClauseImpl#getOrderDirectives <em>Order Directives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderByClauseImpl extends MinimalEObjectImpl.Container implements OrderByClause {
	/**
	 * The cached value of the '{@link #getOrderDirectives() <em>Order Directives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderDirectives()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderDirective> orderDirectives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderByClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.ORDER_BY_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrderDirective> getOrderDirectives() {
		if (orderDirectives == null) {
			orderDirectives = new EObjectContainmentEList<OrderDirective>(OrderDirective.class, this, QueryPackage.ORDER_BY_CLAUSE__ORDER_DIRECTIVES);
		}
		return orderDirectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.ORDER_BY_CLAUSE__ORDER_DIRECTIVES:
				return ((InternalEList<?>)getOrderDirectives()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.ORDER_BY_CLAUSE__ORDER_DIRECTIVES:
				return getOrderDirectives();
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
			case QueryPackage.ORDER_BY_CLAUSE__ORDER_DIRECTIVES:
				getOrderDirectives().clear();
				getOrderDirectives().addAll((Collection<? extends OrderDirective>)newValue);
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
			case QueryPackage.ORDER_BY_CLAUSE__ORDER_DIRECTIVES:
				getOrderDirectives().clear();
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
			case QueryPackage.ORDER_BY_CLAUSE__ORDER_DIRECTIVES:
				return orderDirectives != null && !orderDirectives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrderByClauseImpl
