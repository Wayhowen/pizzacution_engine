package org.mdse.minisql.query.interpreter;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.mdse.minisql.query.ArithmeticExpression;
import org.mdse.minisql.query.ArithmeticOperator;
import org.mdse.minisql.query.BinaryLogicalExpression;
import org.mdse.minisql.query.BooleanLiteral;
import org.mdse.minisql.query.ColumnReference;
import org.mdse.minisql.query.ComparativeExpression;
import org.mdse.minisql.query.ComparativeOperator;
import org.mdse.minisql.query.Expression;
import org.mdse.minisql.query.FromClause;
import org.mdse.minisql.query.IntegerLiteral;
import org.mdse.minisql.query.LogicalOperator;
import org.mdse.minisql.query.OrderByClause;
import org.mdse.minisql.query.OrderDirective;
import org.mdse.minisql.query.SelectQuery;
import org.mdse.minisql.query.StringLiteral;
import org.mdse.minisql.query.TableReference;
import org.mdse.minisql.query.UnaryLogicalExpression;
import org.mdse.minisql.query.WhatClause;
import org.mdse.minisql.query.WhatDirective;
import org.mdse.minisql.query.WhereClause;
import org.mdse.minisql.schema.Column;
import org.mdse.minisql.schema.Table;

public class MSQLQueryInterpreter extends AbstractMSQLQueryInterpreter {
	private Table table;
	private List<RowData> tableData;
	
	public ResultData interpret(SelectQuery selectQuery) throws MSQLQueryInterpreterException {
		FromClause fromClause = selectQuery.getFromClause();
		WhatClause whatClause = selectQuery.getWhatClause();
		WhereClause whereClause = selectQuery.getWhereClause();
		OrderByClause orderByClause = selectQuery.getOrderByClause();
		
		//Initialize internal attributes.
		TableReference tableReference = fromClause.getTableReference();
		table = tableReference.getTable();
		
		//Load entire CSV file as table data via From clause (and CSV library)
		loadData(fromClause);
		
		//Where clause is optional.
		if (whereClause != null) {
			evaluateWhereClause(whereClause);
		}
		
		//Order by clause is optional.
		if (orderByClause != null) {
			evaluateOrderByClause(orderByClause);
		}
		
		evaluateWhatClause(whatClause);
		
		return new ResultData(tableData);
	}
	
	protected void loadData(FromClause fromClause) throws MSQLQueryInterpreterException {
		File csvFile = getCSVFile(table);
		tableData = loadCSVFile(csvFile, table);
	}
	
	private void evaluateWhatClause(WhatClause whatClause) throws MSQLQueryInterpreterException {
		//TODO: Remove unnecessary column data via What clause
		
		List<WhatDirective> whatDirectives = whatClause.getWhatDirectives();
		WhatDirective w = whatDirectives.get(0);
		
		
		//TODO Use rowData.clearColumnData(column); to remove data for a column.
	}	
	
	protected void evaluateWhereClause(WhereClause whereClause) throws MSQLQueryInterpreterException {
		Expression expression = whereClause.getExpression();
		
		Iterator<RowData> iterator = tableData.iterator();
		
		while(iterator.hasNext()) {
			RowData rowData = iterator.next();
			
			Object result = evaluateExpression(expression, rowData);
			
			//TODO: Find relevant rows via Where clause (by removing unnecessary ones)
		}
	}
	
	private Object evaluateExpression(Expression expression, RowData rowData) throws MSQLQueryInterpreterException {
		//Column reference
		if (expression instanceof ColumnReference) {
			ColumnReference columnReference = (ColumnReference) expression;
			Column column = columnReference.getColumn();
			
			return rowData.getColumnData(column);
		}
		
		//Literals
		if (expression instanceof IntegerLiteral) {
			IntegerLiteral literal = (IntegerLiteral) expression;
			return literal.getValue();
		}
		
		if (expression instanceof BooleanLiteral) {
			BooleanLiteral literal = (BooleanLiteral) expression;
			return literal.getValue();
		}
		
		if (expression instanceof StringLiteral) {
			StringLiteral literal = (StringLiteral) expression;
			return literal.getValue();
		}
		
		
		if (expression instanceof UnaryLogicalExpression) {
			UnaryLogicalExpression unaryLogicalExpression = (UnaryLogicalExpression) expression;
			LogicalOperator operator = unaryLogicalExpression.getOperator();
			Expression operand = unaryLogicalExpression.getExpression();
			Boolean operandValue = asBoolean(evaluateExpression(operand, rowData));
			
			//TODO: evaluate
		}
		
		if (expression instanceof BinaryLogicalExpression) {
			BinaryLogicalExpression binaryLogicalExpression = (BinaryLogicalExpression) expression;
			LogicalOperator operator = binaryLogicalExpression.getOperator();
			Expression operand1 = binaryLogicalExpression.getExpression1();
			Expression operand2 = binaryLogicalExpression.getExpression2();
			
			Boolean operandValue1 = asBoolean(evaluateExpression(operand1, rowData));
			Boolean operandValue2 = asBoolean(evaluateExpression(operand2, rowData));
			
			//TODO: evaluate
		}
		
		if (expression instanceof ComparativeExpression) {
			ComparativeExpression comparativeExpression = (ComparativeExpression) expression;
			
			ComparativeOperator operator = comparativeExpression.getOperator();
			Expression operand1 = comparativeExpression.getExpression1();
			Expression operand2 = comparativeExpression.getExpression2();
			
			Object operandValue1 = evaluateExpression(operand1, rowData);
			Object operandValue2 = evaluateExpression(operand2, rowData);
			
			//TODO: evaluate depending on type of operand value
			
			if (operandValue1 instanceof Integer && operandValue2 instanceof Integer) {
				Integer specificOperandValue1 = (Integer) operandValue1;
				Integer specificOperandValue2 = (Integer) operandValue2;
				
			}
			
			if (operandValue1 instanceof Boolean && operandValue2 instanceof Boolean) {
				Boolean specificOperandValue1 = (Boolean) operandValue1;
				Boolean specificOperandValue2 = (Boolean) operandValue2;
				
			}
			
			if (operandValue1 instanceof String && operandValue2 instanceof String) {
				String specificOperandValue1 = (String) operandValue1;
				String specificOperandValue2 = (String) operandValue2;
				
			}
		}
		
		if (expression instanceof ArithmeticExpression) {
			ArithmeticExpression arithmeticExpression = (ArithmeticExpression) expression;
			ArithmeticOperator operator = arithmeticExpression.getOperator();
			Expression operand1 = arithmeticExpression.getExpression1();
			Expression operand2 = arithmeticExpression.getExpression2();
			
			Integer operandValue1 = asInteger(evaluateExpression(operand1, rowData));
			Integer operandValue2 = asInteger(evaluateExpression(operand2, rowData));
			
			//TODO: evaluate
		}
		
		throw new MSQLQueryInterpreterException("Cannot interpret expression of type " + expression.eClass().getName());
	}
	
	private void evaluateOrderByClause(OrderByClause orderByClause) throws MSQLQueryInterpreterException {
		//TODO: Sort row data via Order By clause
		
		List<OrderDirective> orderDirectives = orderByClause.getOrderDirectives();
		
		//Note: Have to sort in inverse order of declaration of order directives to represent priority.
		ListIterator<OrderDirective> iterator = orderDirectives.listIterator(orderDirectives.size());
		
		while(iterator.hasPrevious()) {
			OrderDirective orderDirective = iterator.previous();
			
			//TODO: Use the RowDataComparator provided by the base class to sort!
			//tableData.sort(new RowDataComparator(column, isAscending));
		}
	}
}
