/**
 */
package ca.queensu.cs.mase.urml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.queensu.cs.mase.urml.Operation#isIsBool <em>Is Bool</em>}</li>
 *   <li>{@link ca.queensu.cs.mase.urml.Operation#isIsInt <em>Is Int</em>}</li>
 *   <li>{@link ca.queensu.cs.mase.urml.Operation#isIsVoid <em>Is Void</em>}</li>
 *   <li>{@link ca.queensu.cs.mase.urml.Operation#getName <em>Name</em>}</li>
 *   <li>{@link ca.queensu.cs.mase.urml.Operation#getLocalVars <em>Local Vars</em>}</li>
 *   <li>{@link ca.queensu.cs.mase.urml.Operation#getOperationCode <em>Operation Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.queensu.cs.mase.urml.UrmlPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject
{
  /**
   * Returns the value of the '<em><b>Is Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Bool</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Bool</em>' attribute.
   * @see #setIsBool(boolean)
   * @see ca.queensu.cs.mase.urml.UrmlPackage#getOperation_IsBool()
   * @model
   * @generated
   */
  boolean isIsBool();

  /**
   * Sets the value of the '{@link ca.queensu.cs.mase.urml.Operation#isIsBool <em>Is Bool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Bool</em>' attribute.
   * @see #isIsBool()
   * @generated
   */
  void setIsBool(boolean value);

  /**
   * Returns the value of the '<em><b>Is Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Int</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Int</em>' attribute.
   * @see #setIsInt(boolean)
   * @see ca.queensu.cs.mase.urml.UrmlPackage#getOperation_IsInt()
   * @model
   * @generated
   */
  boolean isIsInt();

  /**
   * Sets the value of the '{@link ca.queensu.cs.mase.urml.Operation#isIsInt <em>Is Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Int</em>' attribute.
   * @see #isIsInt()
   * @generated
   */
  void setIsInt(boolean value);

  /**
   * Returns the value of the '<em><b>Is Void</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Void</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Void</em>' attribute.
   * @see #setIsVoid(boolean)
   * @see ca.queensu.cs.mase.urml.UrmlPackage#getOperation_IsVoid()
   * @model
   * @generated
   */
  boolean isIsVoid();

  /**
   * Sets the value of the '{@link ca.queensu.cs.mase.urml.Operation#isIsVoid <em>Is Void</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Void</em>' attribute.
   * @see #isIsVoid()
   * @generated
   */
  void setIsVoid(boolean value);

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
   * @see ca.queensu.cs.mase.urml.UrmlPackage#getOperation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ca.queensu.cs.mase.urml.Operation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Local Vars</b></em>' containment reference list.
   * The list contents are of type {@link ca.queensu.cs.mase.urml.LocalVar}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Vars</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Vars</em>' containment reference list.
   * @see ca.queensu.cs.mase.urml.UrmlPackage#getOperation_LocalVars()
   * @model containment="true"
   * @generated
   */
  EList<LocalVar> getLocalVars();

  /**
   * Returns the value of the '<em><b>Operation Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation Code</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation Code</em>' containment reference.
   * @see #setOperationCode(OperationCode)
   * @see ca.queensu.cs.mase.urml.UrmlPackage#getOperation_OperationCode()
   * @model containment="true"
   * @generated
   */
  OperationCode getOperationCode();

  /**
   * Sets the value of the '{@link ca.queensu.cs.mase.urml.Operation#getOperationCode <em>Operation Code</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operation Code</em>' containment reference.
   * @see #getOperationCode()
   * @generated
   */
  void setOperationCode(OperationCode value);

} // Operation
