/**
 * generated by Xtext 2.10.0
 */
package org.xtext.asomemodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.asomemodel.AsomemodelPackage;
import org.xtext.asomemodel.DataPort;
import org.xtext.asomemodel.RepositoryService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.asomemodel.impl.RepositoryServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.asomemodel.impl.RepositoryServiceImpl#getDataport <em>Dataport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryServiceImpl extends MinimalEObjectImpl.Container implements RepositoryService
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getDataport() <em>Dataport</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataport()
   * @generated
   * @ordered
   */
  protected DataPort dataport;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RepositoryServiceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AsomemodelPackage.Literals.REPOSITORY_SERVICE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsomemodelPackage.REPOSITORY_SERVICE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataPort getDataport()
  {
    return dataport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataport(DataPort newDataport, NotificationChain msgs)
  {
    DataPort oldDataport = dataport;
    dataport = newDataport;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AsomemodelPackage.REPOSITORY_SERVICE__DATAPORT, oldDataport, newDataport);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataport(DataPort newDataport)
  {
    if (newDataport != dataport)
    {
      NotificationChain msgs = null;
      if (dataport != null)
        msgs = ((InternalEObject)dataport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AsomemodelPackage.REPOSITORY_SERVICE__DATAPORT, null, msgs);
      if (newDataport != null)
        msgs = ((InternalEObject)newDataport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AsomemodelPackage.REPOSITORY_SERVICE__DATAPORT, null, msgs);
      msgs = basicSetDataport(newDataport, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AsomemodelPackage.REPOSITORY_SERVICE__DATAPORT, newDataport, newDataport));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AsomemodelPackage.REPOSITORY_SERVICE__DATAPORT:
        return basicSetDataport(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AsomemodelPackage.REPOSITORY_SERVICE__NAME:
        return getName();
      case AsomemodelPackage.REPOSITORY_SERVICE__DATAPORT:
        return getDataport();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AsomemodelPackage.REPOSITORY_SERVICE__NAME:
        setName((String)newValue);
        return;
      case AsomemodelPackage.REPOSITORY_SERVICE__DATAPORT:
        setDataport((DataPort)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AsomemodelPackage.REPOSITORY_SERVICE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AsomemodelPackage.REPOSITORY_SERVICE__DATAPORT:
        setDataport((DataPort)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AsomemodelPackage.REPOSITORY_SERVICE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AsomemodelPackage.REPOSITORY_SERVICE__DATAPORT:
        return dataport != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //RepositoryServiceImpl
