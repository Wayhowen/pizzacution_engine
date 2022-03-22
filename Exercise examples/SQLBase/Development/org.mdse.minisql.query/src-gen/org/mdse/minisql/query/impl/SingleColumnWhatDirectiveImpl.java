/**
 */
package org.mdse.minisql.query.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mdse.minisql.query.ColumnReference;
import org.mdse.minisql.query.QueryPackage;
import org.mdse.minisql.query.SingleColumnWhatDirective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Column What Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.impl.SingleColumnWhatDirectiveImpl#getColumnReference <em>Column Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleColumnWhatDirectiveImpl extends WhatDirectiveImpl implements SingleColumnWhatDirective {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleColumnWhatDirectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.SINGLE_COLUMN_WHAT_DIRECTIVE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.SINGLE_COLUMN_WHAT_DIRECTIVE__COLUMN_REFERENCE, oldColumnReference, newColumnReference);
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
				msgs = ((InternalEObject)columnReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SINGLE_COLUMN_WHAT_DIRECTIVE__COLUMN_REFERENCE, null, msgs);
			if (newColumnReference != null)
				msgs = ((InternalEObject)newColumnReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.SINGLE_COLUMN_WHAT_DIRECTIVE__COLUMN_REFERENCE, null, msgs);
			msgs = basicSetColumnReference(newColumnReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.SINGLE_COLUMN_WHAT_DIRECTIVE__COLUMN_REFERENCE, newColumnReference, newColumnReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.SINGLE_COLUMN_WHAT_DIRECTIVE__COLUMN_REFERENCE:
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
			case QueryPackage.SINGLE_COLUMN_WHAT_DIRECTIVE__COLUMN_REFERENCE:
				return getColumnReference();
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
			case QueryPackage.SINGLE_COLUMN_WHAT_DIRECTIVE__COLUMN_REFERENCE:
				setColumnReference((ColumnReference)newValue);
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
			case QueryPackage.SINGLE_COLUMN_WHAT_DIRECTIVE__COLUMN_REFERENCE:
				setColumnReference((ColumnReference)null);
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
			case QueryPackage.SINGLE_COLUMN_WHAT_DIRECTIVE__COLUMN_REFERENCE:
				return columnReference != null;
		}
		return super.eIsSet(featureID);
	}

} //SingleColumnWhatDirectiveImpl
