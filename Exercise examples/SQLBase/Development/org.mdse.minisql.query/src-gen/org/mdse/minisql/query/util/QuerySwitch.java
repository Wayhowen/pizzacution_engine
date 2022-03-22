/**
 */
package org.mdse.minisql.query.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.mdse.minisql.query.*;
import org.mdse.minisql.types.TypedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.mdse.minisql.query.QueryPackage
 * @generated
 */
public class QuerySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QueryPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuerySwitch() {
		if (modelPackage == null) {
			modelPackage = QueryPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case QueryPackage.SELECT_QUERY: {
				SelectQuery selectQuery = (SelectQuery)theEObject;
				T result = caseSelectQuery(selectQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.FROM_CLAUSE: {
				FromClause fromClause = (FromClause)theEObject;
				T result = caseFromClause(fromClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.WHAT_CLAUSE: {
				WhatClause whatClause = (WhatClause)theEObject;
				T result = caseWhatClause(whatClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.WHAT_DIRECTIVE: {
				WhatDirective whatDirective = (WhatDirective)theEObject;
				T result = caseWhatDirective(whatDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.ALL_COLUMNS_WHAT_DIRECTIVE: {
				AllColumnsWhatDirective allColumnsWhatDirective = (AllColumnsWhatDirective)theEObject;
				T result = caseAllColumnsWhatDirective(allColumnsWhatDirective);
				if (result == null) result = caseWhatDirective(allColumnsWhatDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.SINGLE_COLUMN_WHAT_DIRECTIVE: {
				SingleColumnWhatDirective singleColumnWhatDirective = (SingleColumnWhatDirective)theEObject;
				T result = caseSingleColumnWhatDirective(singleColumnWhatDirective);
				if (result == null) result = caseWhatDirective(singleColumnWhatDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.WHERE_CLAUSE: {
				WhereClause whereClause = (WhereClause)theEObject;
				T result = caseWhereClause(whereClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.ORDER_BY_CLAUSE: {
				OrderByClause orderByClause = (OrderByClause)theEObject;
				T result = caseOrderByClause(orderByClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.ORDER_DIRECTIVE: {
				OrderDirective orderDirective = (OrderDirective)theEObject;
				T result = caseOrderDirective(orderDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.BINARY: {
				Binary binary = (Binary)theEObject;
				T result = caseBinary(binary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.UNARY: {
				Unary unary = (Unary)theEObject;
				T result = caseUnary(unary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseTypedElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.LOGICAL_EXPRESSION: {
				LogicalExpression logicalExpression = (LogicalExpression)theEObject;
				T result = caseLogicalExpression(logicalExpression);
				if (result == null) result = caseExpression(logicalExpression);
				if (result == null) result = caseTypedElement(logicalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.BINARY_LOGICAL_EXPRESSION: {
				BinaryLogicalExpression binaryLogicalExpression = (BinaryLogicalExpression)theEObject;
				T result = caseBinaryLogicalExpression(binaryLogicalExpression);
				if (result == null) result = caseBinary(binaryLogicalExpression);
				if (result == null) result = caseLogicalExpression(binaryLogicalExpression);
				if (result == null) result = caseExpression(binaryLogicalExpression);
				if (result == null) result = caseTypedElement(binaryLogicalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.UNARY_LOGICAL_EXPRESSION: {
				UnaryLogicalExpression unaryLogicalExpression = (UnaryLogicalExpression)theEObject;
				T result = caseUnaryLogicalExpression(unaryLogicalExpression);
				if (result == null) result = caseUnary(unaryLogicalExpression);
				if (result == null) result = caseLogicalExpression(unaryLogicalExpression);
				if (result == null) result = caseExpression(unaryLogicalExpression);
				if (result == null) result = caseTypedElement(unaryLogicalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.COMPARATIVE_EXPRESSION: {
				ComparativeExpression comparativeExpression = (ComparativeExpression)theEObject;
				T result = caseComparativeExpression(comparativeExpression);
				if (result == null) result = caseBinary(comparativeExpression);
				if (result == null) result = caseExpression(comparativeExpression);
				if (result == null) result = caseTypedElement(comparativeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.ARITHMETIC_EXPRESSION: {
				ArithmeticExpression arithmeticExpression = (ArithmeticExpression)theEObject;
				T result = caseArithmeticExpression(arithmeticExpression);
				if (result == null) result = caseBinary(arithmeticExpression);
				if (result == null) result = caseExpression(arithmeticExpression);
				if (result == null) result = caseTypedElement(arithmeticExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.TABLE_REFERENCE: {
				TableReference tableReference = (TableReference)theEObject;
				T result = caseTableReference(tableReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.COLUMN_REFERENCE: {
				ColumnReference columnReference = (ColumnReference)theEObject;
				T result = caseColumnReference(columnReference);
				if (result == null) result = caseExpression(columnReference);
				if (result == null) result = caseTypedElement(columnReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseExpression(literal);
				if (result == null) result = caseTypedElement(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.STRING_LITERAL: {
				StringLiteral stringLiteral = (StringLiteral)theEObject;
				T result = caseStringLiteral(stringLiteral);
				if (result == null) result = caseLiteral(stringLiteral);
				if (result == null) result = caseExpression(stringLiteral);
				if (result == null) result = caseTypedElement(stringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.INTEGER_LITERAL: {
				IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
				T result = caseIntegerLiteral(integerLiteral);
				if (result == null) result = caseLiteral(integerLiteral);
				if (result == null) result = caseExpression(integerLiteral);
				if (result == null) result = caseTypedElement(integerLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case QueryPackage.BOOLEAN_LITERAL: {
				BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
				T result = caseBooleanLiteral(booleanLiteral);
				if (result == null) result = caseLiteral(booleanLiteral);
				if (result == null) result = caseExpression(booleanLiteral);
				if (result == null) result = caseTypedElement(booleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectQuery(SelectQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromClause(FromClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>What Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>What Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhatClause(WhatClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>What Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>What Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhatDirective(WhatDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Columns What Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Columns What Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllColumnsWhatDirective(AllColumnsWhatDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Column What Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Column What Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleColumnWhatDirective(SingleColumnWhatDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Where Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Where Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhereClause(WhereClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order By Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order By Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderByClause(OrderByClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderDirective(OrderDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinary(Binary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnary(Unary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalExpression(LogicalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Logical Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryLogicalExpression(BinaryLogicalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Logical Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryLogicalExpression(UnaryLogicalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparative Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparative Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparativeExpression(ComparativeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticExpression(ArithmeticExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableReference(TableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnReference(ColumnReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteral(StringLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerLiteral(IntegerLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanLiteral(BooleanLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //QuerySwitch
