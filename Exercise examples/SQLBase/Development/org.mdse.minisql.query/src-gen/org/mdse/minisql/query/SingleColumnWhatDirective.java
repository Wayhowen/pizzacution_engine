/**
 */
package org.mdse.minisql.query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Column What Directive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.SingleColumnWhatDirective#getColumnReference <em>Column Reference</em>}</li>
 * </ul>
 *
 * @see org.mdse.minisql.query.QueryPackage#getSingleColumnWhatDirective()
 * @model
 * @generated
 */
public interface SingleColumnWhatDirective extends WhatDirective {
	/**
	 * Returns the value of the '<em><b>Column Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Reference</em>' containment reference.
	 * @see #setColumnReference(ColumnReference)
	 * @see org.mdse.minisql.query.QueryPackage#getSingleColumnWhatDirective_ColumnReference()
	 * @model containment="true"
	 * @generated
	 */
	ColumnReference getColumnReference();

	/**
	 * Sets the value of the '{@link org.mdse.minisql.query.SingleColumnWhatDirective#getColumnReference <em>Column Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Reference</em>' containment reference.
	 * @see #getColumnReference()
	 * @generated
	 */
	void setColumnReference(ColumnReference value);

} // SingleColumnWhatDirective
