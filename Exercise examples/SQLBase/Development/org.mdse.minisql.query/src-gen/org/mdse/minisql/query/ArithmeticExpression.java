/**
 */
package org.mdse.minisql.query;

import org.mdse.minisql.types.Type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.ArithmeticExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see org.mdse.minisql.query.QueryPackage#getArithmeticExpression()
 * @model
 * @generated
 */
public interface ArithmeticExpression extends Binary, Expression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mdse.minisql.query.ArithmeticOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.mdse.minisql.query.ArithmeticOperator
	 * @see #setOperator(ArithmeticOperator)
	 * @see org.mdse.minisql.query.QueryPackage#getArithmeticExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	ArithmeticOperator getOperator();

	/**
	 * Sets the value of the '{@link org.mdse.minisql.query.ArithmeticExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.mdse.minisql.query.ArithmeticOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ArithmeticOperator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Type getType();

} // ArithmeticExpression
