/**
 * generated by Xtext 2.10.0
 */
package org.xtext.asomemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asomemodel.DomainInterface#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.asomemodel.DomainInterface#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see org.xtext.asomemodel.AsomemodelPackage#getDomainInterface()
 * @model
 * @generated
 */
public interface DomainInterface extends EObject
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
   * @see org.xtext.asomemodel.AsomemodelPackage#getDomainInterface_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.asomemodel.DomainInterface#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.asomemodel.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference list.
   * @see org.xtext.asomemodel.AsomemodelPackage#getDomainInterface_Element()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElement();

} // DomainInterface
