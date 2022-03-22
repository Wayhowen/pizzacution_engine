/**
 */
package org.mdse.minisql.query;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.mdse.minisql.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.mdse.minisql.query.QueryFactory
 * @model kind="package"
 * @generated
 */
public interface QueryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "query";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mdse.org/minisql/query";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "minisqlquery";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QueryPackage eINSTANCE = org.mdse.minisql.query.impl.QueryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.SelectQueryImpl <em>Select Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.SelectQueryImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getSelectQuery()
	 * @generated
	 */
	int SELECT_QUERY = 0;

	/**
	 * The feature id for the '<em><b>What Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_QUERY__WHAT_CLAUSE = 0;

	/**
	 * The feature id for the '<em><b>From Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_QUERY__FROM_CLAUSE = 1;

	/**
	 * The feature id for the '<em><b>Where Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_QUERY__WHERE_CLAUSE = 2;

	/**
	 * The feature id for the '<em><b>Order By Clause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_QUERY__ORDER_BY_CLAUSE = 3;

	/**
	 * The number of structural features of the '<em>Select Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_QUERY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Select Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.FromClauseImpl <em>From Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.FromClauseImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getFromClause()
	 * @generated
	 */
	int FROM_CLAUSE = 1;

	/**
	 * The feature id for the '<em><b>Table Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CLAUSE__TABLE_REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>From Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>From Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CLAUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.WhatClauseImpl <em>What Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.WhatClauseImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getWhatClause()
	 * @generated
	 */
	int WHAT_CLAUSE = 2;

	/**
	 * The feature id for the '<em><b>What Directives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_CLAUSE__WHAT_DIRECTIVES = 0;

	/**
	 * The number of structural features of the '<em>What Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>What Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_CLAUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.WhatDirectiveImpl <em>What Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.WhatDirectiveImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getWhatDirective()
	 * @generated
	 */
	int WHAT_DIRECTIVE = 3;

	/**
	 * The number of structural features of the '<em>What Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_DIRECTIVE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>What Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_DIRECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.AllColumnsWhatDirectiveImpl <em>All Columns What Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.AllColumnsWhatDirectiveImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getAllColumnsWhatDirective()
	 * @generated
	 */
	int ALL_COLUMNS_WHAT_DIRECTIVE = 4;

	/**
	 * The number of structural features of the '<em>All Columns What Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_COLUMNS_WHAT_DIRECTIVE_FEATURE_COUNT = WHAT_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>All Columns What Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_COLUMNS_WHAT_DIRECTIVE_OPERATION_COUNT = WHAT_DIRECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.SingleColumnWhatDirectiveImpl <em>Single Column What Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.SingleColumnWhatDirectiveImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getSingleColumnWhatDirective()
	 * @generated
	 */
	int SINGLE_COLUMN_WHAT_DIRECTIVE = 5;

	/**
	 * The feature id for the '<em><b>Column Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_COLUMN_WHAT_DIRECTIVE__COLUMN_REFERENCE = WHAT_DIRECTIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Column What Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_COLUMN_WHAT_DIRECTIVE_FEATURE_COUNT = WHAT_DIRECTIVE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Column What Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_COLUMN_WHAT_DIRECTIVE_OPERATION_COUNT = WHAT_DIRECTIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.WhereClauseImpl <em>Where Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.WhereClauseImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getWhereClause()
	 * @generated
	 */
	int WHERE_CLAUSE = 6;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_CLAUSE__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Where Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Where Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_CLAUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.OrderByClauseImpl <em>Order By Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.OrderByClauseImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getOrderByClause()
	 * @generated
	 */
	int ORDER_BY_CLAUSE = 7;

	/**
	 * The feature id for the '<em><b>Order Directives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_CLAUSE__ORDER_DIRECTIVES = 0;

	/**
	 * The number of structural features of the '<em>Order By Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Order By Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_CLAUSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.OrderDirectiveImpl <em>Order Directive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.OrderDirectiveImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getOrderDirective()
	 * @generated
	 */
	int ORDER_DIRECTIVE = 8;

	/**
	 * The feature id for the '<em><b>Column Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DIRECTIVE__COLUMN_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DIRECTIVE__DIRECTION = 1;

	/**
	 * The number of structural features of the '<em>Order Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DIRECTIVE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Order Directive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DIRECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.BinaryImpl <em>Binary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.BinaryImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getBinary()
	 * @generated
	 */
	int BINARY = 9;

	/**
	 * The feature id for the '<em><b>Expression1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__EXPRESSION1 = 0;

	/**
	 * The feature id for the '<em><b>Expression2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY__EXPRESSION2 = 1;

	/**
	 * The number of structural features of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Binary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.UnaryImpl <em>Unary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.UnaryImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getUnary()
	 * @generated
	 */
	int UNARY = 10;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY__EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Unary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.ExpressionImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 11;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = TypesPackage.TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION___GET_TYPE = TypesPackage.TYPED_ELEMENT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = TypesPackage.TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.LogicalExpressionImpl <em>Logical Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.LogicalExpressionImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getLogicalExpression()
	 * @generated
	 */
	int LOGICAL_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION___GET_TYPE = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.BinaryLogicalExpressionImpl <em>Binary Logical Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.BinaryLogicalExpressionImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getBinaryLogicalExpression()
	 * @generated
	 */
	int BINARY_LOGICAL_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Expression1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_EXPRESSION__EXPRESSION1 = BINARY__EXPRESSION1;

	/**
	 * The feature id for the '<em><b>Expression2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_EXPRESSION__EXPRESSION2 = BINARY__EXPRESSION2;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_EXPRESSION__OPERATOR = BINARY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_EXPRESSION_FEATURE_COUNT = BINARY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_EXPRESSION___GET_TYPE = BINARY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Binary Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGICAL_EXPRESSION_OPERATION_COUNT = BINARY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.UnaryLogicalExpressionImpl <em>Unary Logical Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.UnaryLogicalExpressionImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getUnaryLogicalExpression()
	 * @generated
	 */
	int UNARY_LOGICAL_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_LOGICAL_EXPRESSION__EXPRESSION = UNARY__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_LOGICAL_EXPRESSION__OPERATOR = UNARY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_LOGICAL_EXPRESSION_FEATURE_COUNT = UNARY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_LOGICAL_EXPRESSION___GET_TYPE = UNARY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_LOGICAL_EXPRESSION_OPERATION_COUNT = UNARY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.ComparativeExpressionImpl <em>Comparative Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.ComparativeExpressionImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getComparativeExpression()
	 * @generated
	 */
	int COMPARATIVE_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Expression1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_EXPRESSION__EXPRESSION1 = BINARY__EXPRESSION1;

	/**
	 * The feature id for the '<em><b>Expression2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_EXPRESSION__EXPRESSION2 = BINARY__EXPRESSION2;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_EXPRESSION__OPERATOR = BINARY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comparative Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_EXPRESSION_FEATURE_COUNT = BINARY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_EXPRESSION___GET_TYPE = BINARY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Comparative Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_EXPRESSION_OPERATION_COUNT = BINARY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.ArithmeticExpressionImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getArithmeticExpression()
	 * @generated
	 */
	int ARITHMETIC_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Expression1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__EXPRESSION1 = BINARY__EXPRESSION1;

	/**
	 * The feature id for the '<em><b>Expression2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__EXPRESSION2 = BINARY__EXPRESSION2;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION__OPERATOR = BINARY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION_FEATURE_COUNT = BINARY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION___GET_TYPE = BINARY_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION_OPERATION_COUNT = BINARY_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.TableReferenceImpl <em>Table Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.TableReferenceImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getTableReference()
	 * @generated
	 */
	int TABLE_REFERENCE = 17;

	/**
	 * The feature id for the '<em><b>Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_REFERENCE__TABLE = 0;

	/**
	 * The number of structural features of the '<em>Table Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_REFERENCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Table Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.ColumnReferenceImpl <em>Column Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.ColumnReferenceImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getColumnReference()
	 * @generated
	 */
	int COLUMN_REFERENCE = 18;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE__COLUMN = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Column Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE___GET_TYPE = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Column Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_REFERENCE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.LiteralImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 19;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL___GET_TYPE = EXPRESSION___GET_TYPE;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.StringLiteralImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL___GET_TYPE = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.IntegerLiteralImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getIntegerLiteral()
	 * @generated
	 */
	int INTEGER_LITERAL = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL___GET_TYPE = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.impl.BooleanLiteralImpl
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL___GET_VALUE = LITERAL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL___GET_TYPE = LITERAL_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_OPERATION_COUNT = LITERAL_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.OrderDirection <em>Order Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.OrderDirection
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getOrderDirection()
	 * @generated
	 */
	int ORDER_DIRECTION = 23;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.LogicalOperator <em>Logical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.LogicalOperator
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 24;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.ComparativeOperator <em>Comparative Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.ComparativeOperator
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getComparativeOperator()
	 * @generated
	 */
	int COMPARATIVE_OPERATOR = 25;

	/**
	 * The meta object id for the '{@link org.mdse.minisql.query.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mdse.minisql.query.ArithmeticOperator
	 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getArithmeticOperator()
	 * @generated
	 */
	int ARITHMETIC_OPERATOR = 26;


	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.SelectQuery <em>Select Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Query</em>'.
	 * @see org.mdse.minisql.query.SelectQuery
	 * @generated
	 */
	EClass getSelectQuery();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.minisql.query.SelectQuery#getWhatClause <em>What Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>What Clause</em>'.
	 * @see org.mdse.minisql.query.SelectQuery#getWhatClause()
	 * @see #getSelectQuery()
	 * @generated
	 */
	EReference getSelectQuery_WhatClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.minisql.query.SelectQuery#getFromClause <em>From Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From Clause</em>'.
	 * @see org.mdse.minisql.query.SelectQuery#getFromClause()
	 * @see #getSelectQuery()
	 * @generated
	 */
	EReference getSelectQuery_FromClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.minisql.query.SelectQuery#getWhereClause <em>Where Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Where Clause</em>'.
	 * @see org.mdse.minisql.query.SelectQuery#getWhereClause()
	 * @see #getSelectQuery()
	 * @generated
	 */
	EReference getSelectQuery_WhereClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.minisql.query.SelectQuery#getOrderByClause <em>Order By Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Order By Clause</em>'.
	 * @see org.mdse.minisql.query.SelectQuery#getOrderByClause()
	 * @see #getSelectQuery()
	 * @generated
	 */
	EReference getSelectQuery_OrderByClause();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.FromClause <em>From Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Clause</em>'.
	 * @see org.mdse.minisql.query.FromClause
	 * @generated
	 */
	EClass getFromClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.minisql.query.FromClause#getTableReference <em>Table Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Reference</em>'.
	 * @see org.mdse.minisql.query.FromClause#getTableReference()
	 * @see #getFromClause()
	 * @generated
	 */
	EReference getFromClause_TableReference();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.WhatClause <em>What Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>What Clause</em>'.
	 * @see org.mdse.minisql.query.WhatClause
	 * @generated
	 */
	EClass getWhatClause();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.minisql.query.WhatClause#getWhatDirectives <em>What Directives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>What Directives</em>'.
	 * @see org.mdse.minisql.query.WhatClause#getWhatDirectives()
	 * @see #getWhatClause()
	 * @generated
	 */
	EReference getWhatClause_WhatDirectives();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.WhatDirective <em>What Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>What Directive</em>'.
	 * @see org.mdse.minisql.query.WhatDirective
	 * @generated
	 */
	EClass getWhatDirective();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.AllColumnsWhatDirective <em>All Columns What Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Columns What Directive</em>'.
	 * @see org.mdse.minisql.query.AllColumnsWhatDirective
	 * @generated
	 */
	EClass getAllColumnsWhatDirective();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.SingleColumnWhatDirective <em>Single Column What Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Column What Directive</em>'.
	 * @see org.mdse.minisql.query.SingleColumnWhatDirective
	 * @generated
	 */
	EClass getSingleColumnWhatDirective();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.minisql.query.SingleColumnWhatDirective#getColumnReference <em>Column Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column Reference</em>'.
	 * @see org.mdse.minisql.query.SingleColumnWhatDirective#getColumnReference()
	 * @see #getSingleColumnWhatDirective()
	 * @generated
	 */
	EReference getSingleColumnWhatDirective_ColumnReference();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.WhereClause <em>Where Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Where Clause</em>'.
	 * @see org.mdse.minisql.query.WhereClause
	 * @generated
	 */
	EClass getWhereClause();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.minisql.query.WhereClause#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.mdse.minisql.query.WhereClause#getExpression()
	 * @see #getWhereClause()
	 * @generated
	 */
	EReference getWhereClause_Expression();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.OrderByClause <em>Order By Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order By Clause</em>'.
	 * @see org.mdse.minisql.query.OrderByClause
	 * @generated
	 */
	EClass getOrderByClause();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mdse.minisql.query.OrderByClause#getOrderDirectives <em>Order Directives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order Directives</em>'.
	 * @see org.mdse.minisql.query.OrderByClause#getOrderDirectives()
	 * @see #getOrderByClause()
	 * @generated
	 */
	EReference getOrderByClause_OrderDirectives();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.OrderDirective <em>Order Directive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Directive</em>'.
	 * @see org.mdse.minisql.query.OrderDirective
	 * @generated
	 */
	EClass getOrderDirective();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.minisql.query.OrderDirective#getColumnReference <em>Column Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column Reference</em>'.
	 * @see org.mdse.minisql.query.OrderDirective#getColumnReference()
	 * @see #getOrderDirective()
	 * @generated
	 */
	EReference getOrderDirective_ColumnReference();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.minisql.query.OrderDirective#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.mdse.minisql.query.OrderDirective#getDirection()
	 * @see #getOrderDirective()
	 * @generated
	 */
	EAttribute getOrderDirective_Direction();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary</em>'.
	 * @see org.mdse.minisql.query.Binary
	 * @generated
	 */
	EClass getBinary();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.minisql.query.Binary#getExpression1 <em>Expression1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression1</em>'.
	 * @see org.mdse.minisql.query.Binary#getExpression1()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_Expression1();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.minisql.query.Binary#getExpression2 <em>Expression2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression2</em>'.
	 * @see org.mdse.minisql.query.Binary#getExpression2()
	 * @see #getBinary()
	 * @generated
	 */
	EReference getBinary_Expression2();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.Unary <em>Unary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary</em>'.
	 * @see org.mdse.minisql.query.Unary
	 * @generated
	 */
	EClass getUnary();

	/**
	 * Returns the meta object for the containment reference '{@link org.mdse.minisql.query.Unary#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.mdse.minisql.query.Unary#getExpression()
	 * @see #getUnary()
	 * @generated
	 */
	EReference getUnary_Expression();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.mdse.minisql.query.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.LogicalExpression <em>Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Expression</em>'.
	 * @see org.mdse.minisql.query.LogicalExpression
	 * @generated
	 */
	EClass getLogicalExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.minisql.query.LogicalExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.mdse.minisql.query.LogicalExpression#getOperator()
	 * @see #getLogicalExpression()
	 * @generated
	 */
	EAttribute getLogicalExpression_Operator();

	/**
	 * Returns the meta object for the '{@link org.mdse.minisql.query.LogicalExpression#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see org.mdse.minisql.query.LogicalExpression#getType()
	 * @generated
	 */
	EOperation getLogicalExpression__GetType();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.BinaryLogicalExpression <em>Binary Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Logical Expression</em>'.
	 * @see org.mdse.minisql.query.BinaryLogicalExpression
	 * @generated
	 */
	EClass getBinaryLogicalExpression();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.UnaryLogicalExpression <em>Unary Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Logical Expression</em>'.
	 * @see org.mdse.minisql.query.UnaryLogicalExpression
	 * @generated
	 */
	EClass getUnaryLogicalExpression();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.ComparativeExpression <em>Comparative Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparative Expression</em>'.
	 * @see org.mdse.minisql.query.ComparativeExpression
	 * @generated
	 */
	EClass getComparativeExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.minisql.query.ComparativeExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.mdse.minisql.query.ComparativeExpression#getOperator()
	 * @see #getComparativeExpression()
	 * @generated
	 */
	EAttribute getComparativeExpression_Operator();

	/**
	 * Returns the meta object for the '{@link org.mdse.minisql.query.ComparativeExpression#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see org.mdse.minisql.query.ComparativeExpression#getType()
	 * @generated
	 */
	EOperation getComparativeExpression__GetType();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.ArithmeticExpression <em>Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Expression</em>'.
	 * @see org.mdse.minisql.query.ArithmeticExpression
	 * @generated
	 */
	EClass getArithmeticExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.minisql.query.ArithmeticExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.mdse.minisql.query.ArithmeticExpression#getOperator()
	 * @see #getArithmeticExpression()
	 * @generated
	 */
	EAttribute getArithmeticExpression_Operator();

	/**
	 * Returns the meta object for the '{@link org.mdse.minisql.query.ArithmeticExpression#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see org.mdse.minisql.query.ArithmeticExpression#getType()
	 * @generated
	 */
	EOperation getArithmeticExpression__GetType();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.TableReference <em>Table Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Reference</em>'.
	 * @see org.mdse.minisql.query.TableReference
	 * @generated
	 */
	EClass getTableReference();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.minisql.query.TableReference#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Table</em>'.
	 * @see org.mdse.minisql.query.TableReference#getTable()
	 * @see #getTableReference()
	 * @generated
	 */
	EReference getTableReference_Table();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.ColumnReference <em>Column Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Reference</em>'.
	 * @see org.mdse.minisql.query.ColumnReference
	 * @generated
	 */
	EClass getColumnReference();

	/**
	 * Returns the meta object for the reference '{@link org.mdse.minisql.query.ColumnReference#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see org.mdse.minisql.query.ColumnReference#getColumn()
	 * @see #getColumnReference()
	 * @generated
	 */
	EReference getColumnReference_Column();

	/**
	 * Returns the meta object for the '{@link org.mdse.minisql.query.ColumnReference#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see org.mdse.minisql.query.ColumnReference#getType()
	 * @generated
	 */
	EOperation getColumnReference__GetType();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see org.mdse.minisql.query.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see org.mdse.minisql.query.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.minisql.query.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.mdse.minisql.query.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for the '{@link org.mdse.minisql.query.StringLiteral#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see org.mdse.minisql.query.StringLiteral#getType()
	 * @generated
	 */
	EOperation getStringLiteral__GetType();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.IntegerLiteral <em>Integer Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal</em>'.
	 * @see org.mdse.minisql.query.IntegerLiteral
	 * @generated
	 */
	EClass getIntegerLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.minisql.query.IntegerLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.mdse.minisql.query.IntegerLiteral#getValue()
	 * @see #getIntegerLiteral()
	 * @generated
	 */
	EAttribute getIntegerLiteral_Value();

	/**
	 * Returns the meta object for the '{@link org.mdse.minisql.query.IntegerLiteral#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see org.mdse.minisql.query.IntegerLiteral#getType()
	 * @generated
	 */
	EOperation getIntegerLiteral__GetType();

	/**
	 * Returns the meta object for class '{@link org.mdse.minisql.query.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see org.mdse.minisql.query.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.mdse.minisql.query.BooleanLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.mdse.minisql.query.BooleanLiteral#isValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for the '{@link org.mdse.minisql.query.BooleanLiteral#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see org.mdse.minisql.query.BooleanLiteral#getValue()
	 * @generated
	 */
	EOperation getBooleanLiteral__GetValue();

	/**
	 * Returns the meta object for the '{@link org.mdse.minisql.query.BooleanLiteral#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see org.mdse.minisql.query.BooleanLiteral#getType()
	 * @generated
	 */
	EOperation getBooleanLiteral__GetType();

	/**
	 * Returns the meta object for enum '{@link org.mdse.minisql.query.OrderDirection <em>Order Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order Direction</em>'.
	 * @see org.mdse.minisql.query.OrderDirection
	 * @generated
	 */
	EEnum getOrderDirection();

	/**
	 * Returns the meta object for enum '{@link org.mdse.minisql.query.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operator</em>'.
	 * @see org.mdse.minisql.query.LogicalOperator
	 * @generated
	 */
	EEnum getLogicalOperator();

	/**
	 * Returns the meta object for enum '{@link org.mdse.minisql.query.ComparativeOperator <em>Comparative Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparative Operator</em>'.
	 * @see org.mdse.minisql.query.ComparativeOperator
	 * @generated
	 */
	EEnum getComparativeOperator();

	/**
	 * Returns the meta object for enum '{@link org.mdse.minisql.query.ArithmeticOperator <em>Arithmetic Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Arithmetic Operator</em>'.
	 * @see org.mdse.minisql.query.ArithmeticOperator
	 * @generated
	 */
	EEnum getArithmeticOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QueryFactory getQueryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.SelectQueryImpl <em>Select Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.SelectQueryImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getSelectQuery()
		 * @generated
		 */
		EClass SELECT_QUERY = eINSTANCE.getSelectQuery();

		/**
		 * The meta object literal for the '<em><b>What Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_QUERY__WHAT_CLAUSE = eINSTANCE.getSelectQuery_WhatClause();

		/**
		 * The meta object literal for the '<em><b>From Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_QUERY__FROM_CLAUSE = eINSTANCE.getSelectQuery_FromClause();

		/**
		 * The meta object literal for the '<em><b>Where Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_QUERY__WHERE_CLAUSE = eINSTANCE.getSelectQuery_WhereClause();

		/**
		 * The meta object literal for the '<em><b>Order By Clause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_QUERY__ORDER_BY_CLAUSE = eINSTANCE.getSelectQuery_OrderByClause();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.FromClauseImpl <em>From Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.FromClauseImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getFromClause()
		 * @generated
		 */
		EClass FROM_CLAUSE = eINSTANCE.getFromClause();

		/**
		 * The meta object literal for the '<em><b>Table Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_CLAUSE__TABLE_REFERENCE = eINSTANCE.getFromClause_TableReference();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.WhatClauseImpl <em>What Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.WhatClauseImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getWhatClause()
		 * @generated
		 */
		EClass WHAT_CLAUSE = eINSTANCE.getWhatClause();

		/**
		 * The meta object literal for the '<em><b>What Directives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHAT_CLAUSE__WHAT_DIRECTIVES = eINSTANCE.getWhatClause_WhatDirectives();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.WhatDirectiveImpl <em>What Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.WhatDirectiveImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getWhatDirective()
		 * @generated
		 */
		EClass WHAT_DIRECTIVE = eINSTANCE.getWhatDirective();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.AllColumnsWhatDirectiveImpl <em>All Columns What Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.AllColumnsWhatDirectiveImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getAllColumnsWhatDirective()
		 * @generated
		 */
		EClass ALL_COLUMNS_WHAT_DIRECTIVE = eINSTANCE.getAllColumnsWhatDirective();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.SingleColumnWhatDirectiveImpl <em>Single Column What Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.SingleColumnWhatDirectiveImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getSingleColumnWhatDirective()
		 * @generated
		 */
		EClass SINGLE_COLUMN_WHAT_DIRECTIVE = eINSTANCE.getSingleColumnWhatDirective();

		/**
		 * The meta object literal for the '<em><b>Column Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_COLUMN_WHAT_DIRECTIVE__COLUMN_REFERENCE = eINSTANCE.getSingleColumnWhatDirective_ColumnReference();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.WhereClauseImpl <em>Where Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.WhereClauseImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getWhereClause()
		 * @generated
		 */
		EClass WHERE_CLAUSE = eINSTANCE.getWhereClause();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHERE_CLAUSE__EXPRESSION = eINSTANCE.getWhereClause_Expression();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.OrderByClauseImpl <em>Order By Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.OrderByClauseImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getOrderByClause()
		 * @generated
		 */
		EClass ORDER_BY_CLAUSE = eINSTANCE.getOrderByClause();

		/**
		 * The meta object literal for the '<em><b>Order Directives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_BY_CLAUSE__ORDER_DIRECTIVES = eINSTANCE.getOrderByClause_OrderDirectives();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.OrderDirectiveImpl <em>Order Directive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.OrderDirectiveImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getOrderDirective()
		 * @generated
		 */
		EClass ORDER_DIRECTIVE = eINSTANCE.getOrderDirective();

		/**
		 * The meta object literal for the '<em><b>Column Reference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_DIRECTIVE__COLUMN_REFERENCE = eINSTANCE.getOrderDirective_ColumnReference();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DIRECTIVE__DIRECTION = eINSTANCE.getOrderDirective_Direction();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.BinaryImpl <em>Binary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.BinaryImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getBinary()
		 * @generated
		 */
		EClass BINARY = eINSTANCE.getBinary();

		/**
		 * The meta object literal for the '<em><b>Expression1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__EXPRESSION1 = eINSTANCE.getBinary_Expression1();

		/**
		 * The meta object literal for the '<em><b>Expression2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY__EXPRESSION2 = eINSTANCE.getBinary_Expression2();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.UnaryImpl <em>Unary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.UnaryImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getUnary()
		 * @generated
		 */
		EClass UNARY = eINSTANCE.getUnary();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY__EXPRESSION = eINSTANCE.getUnary_Expression();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.ExpressionImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.LogicalExpressionImpl <em>Logical Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.LogicalExpressionImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getLogicalExpression()
		 * @generated
		 */
		EClass LOGICAL_EXPRESSION = eINSTANCE.getLogicalExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_EXPRESSION__OPERATOR = eINSTANCE.getLogicalExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGICAL_EXPRESSION___GET_TYPE = eINSTANCE.getLogicalExpression__GetType();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.BinaryLogicalExpressionImpl <em>Binary Logical Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.BinaryLogicalExpressionImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getBinaryLogicalExpression()
		 * @generated
		 */
		EClass BINARY_LOGICAL_EXPRESSION = eINSTANCE.getBinaryLogicalExpression();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.UnaryLogicalExpressionImpl <em>Unary Logical Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.UnaryLogicalExpressionImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getUnaryLogicalExpression()
		 * @generated
		 */
		EClass UNARY_LOGICAL_EXPRESSION = eINSTANCE.getUnaryLogicalExpression();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.ComparativeExpressionImpl <em>Comparative Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.ComparativeExpressionImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getComparativeExpression()
		 * @generated
		 */
		EClass COMPARATIVE_EXPRESSION = eINSTANCE.getComparativeExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARATIVE_EXPRESSION__OPERATOR = eINSTANCE.getComparativeExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMPARATIVE_EXPRESSION___GET_TYPE = eINSTANCE.getComparativeExpression__GetType();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.ArithmeticExpressionImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getArithmeticExpression()
		 * @generated
		 */
		EClass ARITHMETIC_EXPRESSION = eINSTANCE.getArithmeticExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_EXPRESSION__OPERATOR = eINSTANCE.getArithmeticExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ARITHMETIC_EXPRESSION___GET_TYPE = eINSTANCE.getArithmeticExpression__GetType();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.TableReferenceImpl <em>Table Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.TableReferenceImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getTableReference()
		 * @generated
		 */
		EClass TABLE_REFERENCE = eINSTANCE.getTableReference();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_REFERENCE__TABLE = eINSTANCE.getTableReference_Table();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.ColumnReferenceImpl <em>Column Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.ColumnReferenceImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getColumnReference()
		 * @generated
		 */
		EClass COLUMN_REFERENCE = eINSTANCE.getColumnReference();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_REFERENCE__COLUMN = eINSTANCE.getColumnReference_Column();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLUMN_REFERENCE___GET_TYPE = eINSTANCE.getColumnReference__GetType();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.LiteralImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.StringLiteralImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRING_LITERAL___GET_TYPE = eINSTANCE.getStringLiteral__GetType();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.IntegerLiteralImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getIntegerLiteral()
		 * @generated
		 */
		EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INTEGER_LITERAL___GET_TYPE = eINSTANCE.getIntegerLiteral__GetType();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.impl.BooleanLiteralImpl
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOLEAN_LITERAL___GET_VALUE = eINSTANCE.getBooleanLiteral__GetValue();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOLEAN_LITERAL___GET_TYPE = eINSTANCE.getBooleanLiteral__GetType();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.OrderDirection <em>Order Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.OrderDirection
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getOrderDirection()
		 * @generated
		 */
		EEnum ORDER_DIRECTION = eINSTANCE.getOrderDirection();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.LogicalOperator <em>Logical Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.LogicalOperator
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getLogicalOperator()
		 * @generated
		 */
		EEnum LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.ComparativeOperator <em>Comparative Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.ComparativeOperator
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getComparativeOperator()
		 * @generated
		 */
		EEnum COMPARATIVE_OPERATOR = eINSTANCE.getComparativeOperator();

		/**
		 * The meta object literal for the '{@link org.mdse.minisql.query.ArithmeticOperator <em>Arithmetic Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mdse.minisql.query.ArithmeticOperator
		 * @see org.mdse.minisql.query.impl.QueryPackageImpl#getArithmeticOperator()
		 * @generated
		 */
		EEnum ARITHMETIC_OPERATOR = eINSTANCE.getArithmeticOperator();

	}

} //QueryPackage
