/**
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.xDrone.impl;

import ic.ac.uk.xdrone.xDrone.Drone;
import ic.ac.uk.xdrone.xDrone.Environment;
import ic.ac.uk.xdrone.xDrone.Walls;
import ic.ac.uk.xdrone.xDrone.XDronePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ic.ac.uk.xdrone.xDrone.impl.EnvironmentImpl#getDrone <em>Drone</em>}</li>
 *   <li>{@link ic.ac.uk.xdrone.xDrone.impl.EnvironmentImpl#getWalls <em>Walls</em>}</li>
 *   <li>{@link ic.ac.uk.xdrone.xDrone.impl.EnvironmentImpl#getObjects <em>Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentImpl extends MinimalEObjectImpl.Container implements Environment
{
  /**
   * The cached value of the '{@link #getDrone() <em>Drone</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDrone()
   * @generated
   * @ordered
   */
  protected EList<Drone> drone;

  /**
   * The cached value of the '{@link #getWalls() <em>Walls</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWalls()
   * @generated
   * @ordered
   */
  protected EList<Walls> walls;

  /**
   * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjects()
   * @generated
   * @ordered
   */
  protected EList<ic.ac.uk.xdrone.xDrone.Object> objects;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnvironmentImpl()
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
    return XDronePackage.Literals.ENVIRONMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Drone> getDrone()
  {
    if (drone == null)
    {
      drone = new EObjectContainmentEList<Drone>(Drone.class, this, XDronePackage.ENVIRONMENT__DRONE);
    }
    return drone;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Walls> getWalls()
  {
    if (walls == null)
    {
      walls = new EObjectContainmentEList<Walls>(Walls.class, this, XDronePackage.ENVIRONMENT__WALLS);
    }
    return walls;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ic.ac.uk.xdrone.xDrone.Object> getObjects()
  {
    if (objects == null)
    {
      objects = new EObjectContainmentEList<ic.ac.uk.xdrone.xDrone.Object>(ic.ac.uk.xdrone.xDrone.Object.class, this, XDronePackage.ENVIRONMENT__OBJECTS);
    }
    return objects;
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
      case XDronePackage.ENVIRONMENT__DRONE:
        return ((InternalEList<?>)getDrone()).basicRemove(otherEnd, msgs);
      case XDronePackage.ENVIRONMENT__WALLS:
        return ((InternalEList<?>)getWalls()).basicRemove(otherEnd, msgs);
      case XDronePackage.ENVIRONMENT__OBJECTS:
        return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
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
      case XDronePackage.ENVIRONMENT__DRONE:
        return getDrone();
      case XDronePackage.ENVIRONMENT__WALLS:
        return getWalls();
      case XDronePackage.ENVIRONMENT__OBJECTS:
        return getObjects();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XDronePackage.ENVIRONMENT__DRONE:
        getDrone().clear();
        getDrone().addAll((Collection<? extends Drone>)newValue);
        return;
      case XDronePackage.ENVIRONMENT__WALLS:
        getWalls().clear();
        getWalls().addAll((Collection<? extends Walls>)newValue);
        return;
      case XDronePackage.ENVIRONMENT__OBJECTS:
        getObjects().clear();
        getObjects().addAll((Collection<? extends ic.ac.uk.xdrone.xDrone.Object>)newValue);
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
      case XDronePackage.ENVIRONMENT__DRONE:
        getDrone().clear();
        return;
      case XDronePackage.ENVIRONMENT__WALLS:
        getWalls().clear();
        return;
      case XDronePackage.ENVIRONMENT__OBJECTS:
        getObjects().clear();
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
      case XDronePackage.ENVIRONMENT__DRONE:
        return drone != null && !drone.isEmpty();
      case XDronePackage.ENVIRONMENT__WALLS:
        return walls != null && !walls.isEmpty();
      case XDronePackage.ENVIRONMENT__OBJECTS:
        return objects != null && !objects.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EnvironmentImpl
