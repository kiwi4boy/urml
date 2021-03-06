/**
 */
package ca.queensu.cs.mase.urml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capsule Inst</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.queensu.cs.mase.urml.CapsuleInst#getName <em>Name</em>}</li>
 *   <li>{@link ca.queensu.cs.mase.urml.CapsuleInst#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.queensu.cs.mase.urml.UrmlPackage#getCapsuleInst()
 * @model
 * @generated
 */
public interface CapsuleInst extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ca.queensu.cs.mase.urml.UrmlPackage#getCapsuleInst_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ca.queensu.cs.mase.urml.CapsuleInst#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(Capsule)
   * @see ca.queensu.cs.mase.urml.UrmlPackage#getCapsuleInst_Type()
   * @model
   * @generated
   */
  Capsule getType();

  /**
   * Sets the value of the '{@link ca.queensu.cs.mase.urml.CapsuleInst#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(Capsule value);

} // CapsuleInst
