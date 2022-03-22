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
import org.mdse.minisql.query.QueryPackage;
import org.mdse.minisql.query.TableReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>From Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.impl.FromClauseImpl#getTableReference <em>Table Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FromClauseImpl extends MinimalEObjectImpl.Container implements FromClause {
	/**
	 * The cached value of the '{@link #getTableReference() <em>Table Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableReference()
	 * @generated
	 * @ordered
	 */
	protected TableReference tableReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FromClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.FROM_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TableReference getTableReference() {
		return tableReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableReference(TableReference newTableReference, NotificationChain msgs) {
		TableReference oldTableReference = tableReference;
		tableReference = newTableReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.FROM_CLAUSE__TABLE_REFERENCE, oldTableReference, newTableReference);
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
	public void setTableReference(TableReference newTableReference) {
		if (newTableReference != tableReference) {
			NotificationChain msgs = null;
			if (tableReference != null)
				msgs = ((InternalEObject)tableReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FROM_CLAUSE__TABLE_REFERENCE, null, msgs);
			if (newTableReference != null)
				msgs = ((InternalEObject)newTableReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.FROM_CLAUSE__TABLE_REFERENCE, null, msgs);
			msgs = basicSetTableReference(newTableReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.FROM_CLAUSE__TABLE_REFERENCE, newTableReference, newTableReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.FROM_CLAUSE__TABLE_REFERENCE:
				return basicSetTableReference(null, msgs);
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
			case QueryPackage.FROM_CLAUSE__TABLE_REFERENCE:
				return getTableReference();
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
			case QueryPackage.FROM_CLAUSE__TABLE_REFERENCE:
				setTableReference((TableReference)newValue);
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
			case QueryPackage.FROM_CLAUSE__TABLE_REFERENCE:
				setTableReference((TableReference)null);
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
			case QueryPackage.FROM_CLAUSE__TABLE_REFERENCE:
				return tableReference != null;
		}
		return super.eIsSet(featureID);
	}

} //FromClauseImpl
