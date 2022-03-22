/**
 */
package org.mdse.minisql.query;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>From Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.FromClause#getTableReference <em>Table Reference</em>}</li>
 * </ul>
 *
 * @see org.mdse.minisql.query.QueryPackage#getFromClause()
 * @model
 * @generated
 */
public interface FromClause extends EObject {
	/**
	 * Returns the value of the '<em><b>Table Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Reference</em>' containment reference.
	 * @see #setTableReference(TableReference)
	 * @see org.mdse.minisql.query.QueryPackage#getFromClause_TableReference()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TableReference getTableReference();

	/**
	 * Sets the value of the '{@link org.mdse.minisql.query.FromClause#getTableReference <em>Table Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Reference</em>' containment reference.
	 * @see #getTableReference()
	 * @generated
	 */
	void setTableReference(TableReference value);

} // FromClause
