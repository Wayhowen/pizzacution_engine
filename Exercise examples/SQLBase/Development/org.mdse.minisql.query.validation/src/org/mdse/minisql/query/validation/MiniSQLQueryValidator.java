package org.mdse.minisql.query.validation;

import org.mdse.minisql.query.ArithmeticExpression;
import org.mdse.minisql.query.BinaryLogicalExpression;
import org.mdse.minisql.query.ComparativeExpression;
import org.mdse.minisql.query.Expression;
import org.mdse.minisql.query.UnaryLogicalExpression;
import org.mdse.minisql.query.WhereClause;
import org.mdse.minisql.types.Type;

public class MiniSQLQueryValidator extends AbstractMiniSQLQueryValidator {
	
	@Override
	protected boolean validateWhereClauseTypeCompatibility(WhereClause whereClause) {
		Expression expression = whereClause.getExpression();
		
		if (expression == null) {
			return true;
		}
		
		Type type = expression.getType();
		
		//TODO: Implement
		
//		return constraintViolated(expression, "Operand of WHERE clause must be of type Bool.");
		return true;
	}
	
	@Override
	protected boolean validateArithmeticExpressionTypeCompatibility(ArithmeticExpression arithmeticExpression) {
		Expression expression1 = arithmeticExpression.getExpression1();
		Expression expression2 = arithmeticExpression.getExpression2();

		if (expression1 == null || expression2 == null) {
			return true;
		}
		
		Type type1 = expression1.getType();
		Type type2 = expression2.getType();
		
		//TODO: Implement
		
//		return constraintViolated(arithmeticExpression, "Both operands of a calculation must be of type Int.");
		return true;
	}
	
	@Override
	protected boolean validateComparativeExpressionTypeCompatibility(ComparativeExpression comparativeExpression) {
		Expression expression1 = comparativeExpression.getExpression1();
		Expression expression2 = comparativeExpression.getExpression2();

		if (expression1 == null || expression2 == null) {
			return true;
		}
		
		Type type1 = expression1.getType();
		Type type2 = expression2.getType();
		
//		return constraintViolated(comparativeExpression, "Both operands of a comparison must be of the same type.");
		return true;
	}
	
	@Override
	protected boolean validateComparativeExpressionBooleanOperators(ComparativeExpression comparativeExpression) {
		Expression expression1 = comparativeExpression.getExpression1();
		Expression expression2 = comparativeExpression.getExpression2();

		if (expression1 == null || expression2 == null) {
			return true;
		}
		
		Type type1 = expression1.getType();
		Type type2 = expression2.getType();
		
		if (org.mdse.minisql.query.ComparativeOperator.EQUAL != comparativeExpression.getOperator()) {
			return constraintViolated(binaryLogicalExpression, "Both operands of a logical expression must be of type Bool.");
		}
		//TODO: Implement

//		return constraintViolated(comparativeExpression, "Bool operands may only be compared for equality (=) or inequality (!=).");
		return true;
	}
	
	@Override
	protected boolean validateComparativeExpressionStringOperators(ComparativeExpression comparativeExpression) {
		Expression expression1 = comparativeExpression.getExpression1();
		Expression expression2 = comparativeExpression.getExpression2();

		if (expression1 == null || expression2 == null) {
			return true;
		}
		
		Type type1 = expression1.getType();
		Type type2 = expression2.getType();
		
		
		//TODO: Implement

//		return constraintViolated(comparativeExpression, "String operands may only be compared for equality (=) or inequality (!=).");
		return true;
	}
	

	@Override
	protected boolean validateUnaryLogicalExpressionTypeCompatibility(UnaryLogicalExpression unaryLogicalExpression) {
		Expression expression = unaryLogicalExpression.getExpression();

		if (expression == null) {
			return true;
		}
		
		Type type = expression.getType();
		
		if (!(type instanceof org.mdse.minisql.types.BooleanType)) {
			return constraintViolated(unaryLogicalExpression, "Operand of a logical expression must be of type Bool.");
		}
		//TODO: Implement
		
//		return constraintViolated(unaryLogicalExpression, "Operand of a logical expression must be of type Bool.");
		return true;
	}
	
	@Override
	protected boolean validateBinaryLogicalExpressionTypeCompatibility(BinaryLogicalExpression binaryLogicalExpression) {
		Expression expression1 = binaryLogicalExpression.getExpression1();
		Expression expression2 = binaryLogicalExpression.getExpression2();

		if (expression1 == null || expression2 == null) {
			return true;
		}
		
		Type type1 = expression1.getType();
		Type type2 = expression2.getType();
		
		if (!(type1 instanceof org.mdse.minisql.types.BooleanType) || !(type2 instanceof org.mdse.minisql.types.BooleanType)) {
			return constraintViolated(binaryLogicalExpression, "Both operands of a logical expression must be of type Bool.");
		}
		//TODO: Implement
		
		//return constraintViolated(binaryLogicalExpression, "Both operands of a logical expression must be of type Bool.");
		return true;
	}
}
