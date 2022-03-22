/**
 */
package org.mdse.minisql.query.impl;

import org.eclipse.emf.ecore.EClass;
import org.mdse.minisql.query.Expression;
import org.mdse.minisql.query.QueryPackage;
import org.mdse.minisql.types.impl.TypedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ExpressionImpl extends TypedElementImpl implements Expression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.EXPRESSION;
	}

} //ExpressionImpl
