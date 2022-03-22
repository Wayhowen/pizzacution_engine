/**
 */
package org.mdse.minisql.query;

import org.mdse.minisql.types.Type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logical Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.LogicalExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.mdse.minisql.query.QueryPackage#getLogicalExpression()
 * @model abstract="true"
 * @generated
 */
public interface LogicalExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mdse.minisql.query.LogicalOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.mdse.minisql.query.LogicalOperator
	 * @see #setOperator(LogicalOperator)
	 * @see org.mdse.minisql.query.QueryPackage#getLogicalExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	LogicalOperator getOperator();

	/**
	 * Sets the value of the '{@link org.mdse.minisql.query.LogicalExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.mdse.minisql.query.LogicalOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LogicalOperator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Type getType();

} // LogicalExpression
