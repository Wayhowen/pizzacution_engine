/**
 */
package org.mdse.minisql.query.impl;

import org.eclipse.emf.ecore.EClass;

import org.mdse.minisql.query.Literal;
import org.mdse.minisql.query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class LiteralImpl extends ExpressionImpl implements Literal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.LITERAL;
	}

} //LiteralImpl
