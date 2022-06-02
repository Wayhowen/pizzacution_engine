package pizzacution.query.interpreter;

import pizzacution.query.ComparativeOperator;

public class Comparator {
	public Comparator() {
	}
	
	public boolean operate(ComparativeOperator co, float x1, float x2) {
		switch (co) {
			case EQUAL:
				return this.equal(x1, x2);
			case LESS_THAN:
				return this.lessThan(x1, x2);
			case LESS_THAN_EQUAL:
				return this.lessThanEqual(x1, x2);
			case GREATER_THAN:
				return this.greaterThan(x1, x2);
			case GREATER_THAN_OR_EQUAL:
				return this.greaterThanEqual(x1, x2);
			default: 
				return false;
					
		}
	}
	
	private boolean equal(float x1, float x2) {
		return x1 == x2;
	}
	
	private boolean lessThan(float x1, float x2) {
		return x1 < x2;
	}
	
	private boolean lessThanEqual(float x1, float x2) {
		return x1 <= x2;
	}
	
	private boolean greaterThan(float x1, float x2) {
		return x1 > x2;
	}
	
	private boolean greaterThanEqual(float x1, float x2) {
		return x1 >= x2;
	}
}
