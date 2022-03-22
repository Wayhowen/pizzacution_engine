/**
 */
package org.mdse.minisql.query;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.SelectQuery#getWhatClause <em>What Clause</em>}</li>
 *   <li>{@link org.mdse.minisql.query.SelectQuery#getFromClause <em>From Clause</em>}</li>
 *   <li>{@link org.mdse.minisql.query.SelectQuery#getWhereClause <em>Where Clause</em>}</li>
 *   <li>{@link org.mdse.minisql.query.SelectQuery#getOrderByClause <em>Order By Clause</em>}</li>
 * </ul>
 *
 * @see org.mdse.minisql.query.QueryPackage#getSelectQuery()
 * @model
 * @generated
 */
public interface SelectQuery extends EObject {
	/**
	 * Returns the value of the '<em><b>What Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>What Clause</em>' containment reference.
	 * @see #setWhatClause(WhatClause)
	 * @see org.mdse.minisql.query.QueryPackage#getSelectQuery_WhatClause()
	 * @model containment="true" required="true"
	 * @generated
	 */
	WhatClause getWhatClause();

	/**
	 * Sets the value of the '{@link org.mdse.minisql.query.SelectQuery#getWhatClause <em>What Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>What Clause</em>' containment reference.
	 * @see #getWhatClause()
	 * @generated
	 */
	void setWhatClause(WhatClause value);

	/**
	 * Returns the value of the '<em><b>From Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Clause</em>' containment reference.
	 * @see #setFromClause(FromClause)
	 * @see org.mdse.minisql.query.QueryPackage#getSelectQuery_FromClause()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FromClause getFromClause();

	/**
	 * Sets the value of the '{@link org.mdse.minisql.query.SelectQuery#getFromClause <em>From Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Clause</em>' containment reference.
	 * @see #getFromClause()
	 * @generated
	 */
	void setFromClause(FromClause value);

	/**
	 * Returns the value of the '<em><b>Where Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where Clause</em>' containment reference.
	 * @see #setWhereClause(WhereClause)
	 * @see org.mdse.minisql.query.QueryPackage#getSelectQuery_WhereClause()
	 * @model containment="true"
	 * @generated
	 */
	WhereClause getWhereClause();

	/**
	 * Sets the value of the '{@link org.mdse.minisql.query.SelectQuery#getWhereClause <em>Where Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where Clause</em>' containment reference.
	 * @see #getWhereClause()
	 * @generated
	 */
	void setWhereClause(WhereClause value);

	/**
	 * Returns the value of the '<em><b>Order By Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order By Clause</em>' containment reference.
	 * @see #setOrderByClause(OrderByClause)
	 * @see org.mdse.minisql.query.QueryPackage#getSelectQuery_OrderByClause()
	 * @model containment="true"
	 * @generated
	 */
	OrderByClause getOrderByClause();

	/**
	 * Sets the value of the '{@link org.mdse.minisql.query.SelectQuery#getOrderByClause <em>Order By Clause</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order By Clause</em>' containment reference.
	 * @see #getOrderByClause()
	 * @generated
	 */
	void setOrderByClause(OrderByClause value);

} // SelectQuery
