/**
 */
package org.mdse.minisql.query;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order By Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.OrderByClause#getOrderDirectives <em>Order Directives</em>}</li>
 * </ul>
 *
 * @see org.mdse.minisql.query.QueryPackage#getOrderByClause()
 * @model
 * @generated
 */
public interface OrderByClause extends EObject {
	/**
	 * Returns the value of the '<em><b>Order Directives</b></em>' containment reference list.
	 * The list contents are of type {@link org.mdse.minisql.query.OrderDirective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Directives</em>' containment reference list.
	 * @see org.mdse.minisql.query.QueryPackage#getOrderByClause_OrderDirectives()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<OrderDirective> getOrderDirectives();

} // OrderByClause
