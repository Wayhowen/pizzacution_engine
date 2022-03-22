/**
 */
package org.mdse.minisql.query;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mdse.minisql.query.QueryPackage
 * @generated
 */
public interface QueryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QueryFactory eINSTANCE = org.mdse.minisql.query.impl.QueryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Select Query</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Select Query</em>'.
	 * @generated
	 */
	SelectQuery createSelectQuery();

	/**
	 * Returns a new object of class '<em>From Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>From Clause</em>'.
	 * @generated
	 */
	FromClause createFromClause();

	/**
	 * Returns a new object of class '<em>What Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>What Clause</em>'.
	 * @generated
	 */
	WhatClause createWhatClause();

	/**
	 * Returns a new object of class '<em>All Columns What Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>All Columns What Directive</em>'.
	 * @generated
	 */
	AllColumnsWhatDirective createAllColumnsWhatDirective();

	/**
	 * Returns a new object of class '<em>Single Column What Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Column What Directive</em>'.
	 * @generated
	 */
	SingleColumnWhatDirective createSingleColumnWhatDirective();

	/**
	 * Returns a new object of class '<em>Where Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Where Clause</em>'.
	 * @generated
	 */
	WhereClause createWhereClause();

	/**
	 * Returns a new object of class '<em>Order By Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order By Clause</em>'.
	 * @generated
	 */
	OrderByClause createOrderByClause();

	/**
	 * Returns a new object of class '<em>Order Directive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Directive</em>'.
	 * @generated
	 */
	OrderDirective createOrderDirective();

	/**
	 * Returns a new object of class '<em>Binary Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Logical Expression</em>'.
	 * @generated
	 */
	BinaryLogicalExpression createBinaryLogicalExpression();

	/**
	 * Returns a new object of class '<em>Unary Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Logical Expression</em>'.
	 * @generated
	 */
	UnaryLogicalExpression createUnaryLogicalExpression();

	/**
	 * Returns a new object of class '<em>Comparative Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparative Expression</em>'.
	 * @generated
	 */
	ComparativeExpression createComparativeExpression();

	/**
	 * Returns a new object of class '<em>Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetic Expression</em>'.
	 * @generated
	 */
	ArithmeticExpression createArithmeticExpression();

	/**
	 * Returns a new object of class '<em>Table Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table Reference</em>'.
	 * @generated
	 */
	TableReference createTableReference();

	/**
	 * Returns a new object of class '<em>Column Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column Reference</em>'.
	 * @generated
	 */
	ColumnReference createColumnReference();

	/**
	 * Returns a new object of class '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Literal</em>'.
	 * @generated
	 */
	StringLiteral createStringLiteral();

	/**
	 * Returns a new object of class '<em>Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Literal</em>'.
	 * @generated
	 */
	IntegerLiteral createIntegerLiteral();

	/**
	 * Returns a new object of class '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Literal</em>'.
	 * @generated
	 */
	BooleanLiteral createBooleanLiteral();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QueryPackage getQueryPackage();

} //QueryFactory
