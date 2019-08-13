/**
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.xDrone.impl;

import ic.ac.uk.xdrone.xDrone.Walls;
import ic.ac.uk.xdrone.xDrone.XDronePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Walls</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ic.ac.uk.xdrone.xDrone.impl.WallsImpl#getFront <em>Front</em>}</li>
 *   <li>{@link ic.ac.uk.xdrone.xDrone.impl.WallsImpl#getRight <em>Right</em>}</li>
 *   <li>{@link ic.ac.uk.xdrone.xDrone.impl.WallsImpl#getBack <em>Back</em>}</li>
 *   <li>{@link ic.ac.uk.xdrone.xDrone.impl.WallsImpl#getLeft <em>Left</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WallsImpl extends MinimalEObjectImpl.Container implements Walls
{
  /**
   * The default value of the '{@link #getFront() <em>Front</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFront()
   * @generated
   * @ordered
   */
  protected static final int FRONT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFront() <em>Front</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFront()
   * @generated
   * @ordered
   */
  protected int front = FRONT_EDEFAULT;

  /**
   * The default value of the '{@link #getRight() <em>Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected static final int RIGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected int right = RIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #getBack() <em>Back</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBack()
   * @generated
   * @ordered
   */
  protected static final int BACK_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBack() <em>Back</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBack()
   * @generated
   * @ordered
   */
  protected int back = BACK_EDEFAULT;

  /**
   * The default value of the '{@link #getLeft() <em>Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected static final int LEFT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected int left = LEFT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WallsImpl()
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
    return XDronePackage.Literals.WALLS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFront()
  {
    return front;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFront(int newFront)
  {
    int oldFront = front;
    front = newFront;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XDronePackage.WALLS__FRONT, oldFront, front));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(int newRight)
  {
    int oldRight = right;
    right = newRight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XDronePackage.WALLS__RIGHT, oldRight, right));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBack()
  {
    return back;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBack(int newBack)
  {
    int oldBack = back;
    back = newBack;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XDronePackage.WALLS__BACK, oldBack, back));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(int newLeft)
  {
    int oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XDronePackage.WALLS__LEFT, oldLeft, left));
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
      case XDronePackage.WALLS__FRONT:
        return getFront();
      case XDronePackage.WALLS__RIGHT:
        return getRight();
      case XDronePackage.WALLS__BACK:
        return getBack();
      case XDronePackage.WALLS__LEFT:
        return getLeft();
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
      case XDronePackage.WALLS__FRONT:
        setFront((Integer)newValue);
        return;
      case XDronePackage.WALLS__RIGHT:
        setRight((Integer)newValue);
        return;
      case XDronePackage.WALLS__BACK:
        setBack((Integer)newValue);
        return;
      case XDronePackage.WALLS__LEFT:
        setLeft((Integer)newValue);
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
      case XDronePackage.WALLS__FRONT:
        setFront(FRONT_EDEFAULT);
        return;
      case XDronePackage.WALLS__RIGHT:
        setRight(RIGHT_EDEFAULT);
        return;
      case XDronePackage.WALLS__BACK:
        setBack(BACK_EDEFAULT);
        return;
      case XDronePackage.WALLS__LEFT:
        setLeft(LEFT_EDEFAULT);
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
      case XDronePackage.WALLS__FRONT:
        return front != FRONT_EDEFAULT;
      case XDronePackage.WALLS__RIGHT:
        return right != RIGHT_EDEFAULT;
      case XDronePackage.WALLS__BACK:
        return back != BACK_EDEFAULT;
      case XDronePackage.WALLS__LEFT:
        return left != LEFT_EDEFAULT;
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
    result.append(" (front: ");
    result.append(front);
    result.append(", right: ");
    result.append(right);
    result.append(", back: ");
    result.append(back);
    result.append(", left: ");
    result.append(left);
    result.append(')');
    return result.toString();
  }

} //WallsImpl
