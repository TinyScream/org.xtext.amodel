/**
 * generated by Xtext 2.10.0
 */
package org.xtext.asomemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asomemodel.DataPort#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.asomemodel.DataPort#getCrossModel <em>Cross Model</em>}</li>
 *   <li>{@link org.xtext.asomemodel.DataPort#getCrossInterface <em>Cross Interface</em>}</li>
 * </ul>
 *
 * @see org.xtext.asomemodel.AsomemodelPackage#getDataPort()
 * @model
 * @generated
 */
public interface DataPort extends EObject
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
   * @see org.xtext.asomemodel.AsomemodelPackage#getDataPort_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.asomemodel.DataPort#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Cross Model</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cross Model</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cross Model</em>' reference.
   * @see #setCrossModel(Model)
   * @see org.xtext.asomemodel.AsomemodelPackage#getDataPort_CrossModel()
   * @model
   * @generated
   */
  Model getCrossModel();

  /**
   * Sets the value of the '{@link org.xtext.asomemodel.DataPort#getCrossModel <em>Cross Model</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cross Model</em>' reference.
   * @see #getCrossModel()
   * @generated
   */
  void setCrossModel(Model value);

  /**
   * Returns the value of the '<em><b>Cross Interface</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cross Interface</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cross Interface</em>' reference.
   * @see #setCrossInterface(DomainInterface)
   * @see org.xtext.asomemodel.AsomemodelPackage#getDataPort_CrossInterface()
   * @model
   * @generated
   */
  DomainInterface getCrossInterface();

  /**
   * Sets the value of the '{@link org.xtext.asomemodel.DataPort#getCrossInterface <em>Cross Interface</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cross Interface</em>' reference.
   * @see #getCrossInterface()
   * @generated
   */
  void setCrossInterface(DomainInterface value);

} // DataPort
