/**
 */
package org.mdse.minisql.query;

import org.mdse.minisql.schema.Column;
import org.mdse.minisql.types.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.query.ColumnReference#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see org.mdse.minisql.query.QueryPackage#getColumnReference()
 * @model
 * @generated
 */
public interface ColumnReference extends Expression {
	/**
	 * Returns the value of the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' reference.
	 * @see #setColumn(Column)
	 * @see org.mdse.minisql.query.QueryPackage#getColumnReference_Column()
	 * @model required="true"
	 * @generated
	 */
	Column getColumn();

	/**
	 * Sets the value of the '{@link org.mdse.minisql.query.ColumnReference#getColumn <em>Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Column value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	Type getType();

} // ColumnReference
