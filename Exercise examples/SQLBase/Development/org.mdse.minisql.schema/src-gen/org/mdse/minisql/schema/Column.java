/**
 */
package org.mdse.minisql.schema;

import org.mdse.minisql.types.Type;
import org.mdse.minisql.types.TypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mdse.minisql.schema.Column#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.mdse.minisql.schema.SchemaPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends NamedElement, TypedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(Type)
	 * @see org.mdse.minisql.schema.SchemaPackage#getColumn_Type()
	 * @model containment="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.mdse.minisql.schema.Column#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Column
