/**
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.xDrone.util;

import ic.ac.uk.xdrone.xDrone.Backward;
import ic.ac.uk.xdrone.xDrone.Command;
import ic.ac.uk.xdrone.xDrone.Down;
import ic.ac.uk.xdrone.xDrone.Drone;
import ic.ac.uk.xdrone.xDrone.Environment;
import ic.ac.uk.xdrone.xDrone.Fly;
import ic.ac.uk.xdrone.xDrone.Forward;
import ic.ac.uk.xdrone.xDrone.FunctionName;
import ic.ac.uk.xdrone.xDrone.Left;
import ic.ac.uk.xdrone.xDrone.Move;
import ic.ac.uk.xdrone.xDrone.Program;
import ic.ac.uk.xdrone.xDrone.Right;
import ic.ac.uk.xdrone.xDrone.RotateL;
import ic.ac.uk.xdrone.xDrone.RotateR;
import ic.ac.uk.xdrone.xDrone.SuperCommand;
import ic.ac.uk.xdrone.xDrone.Up;
import ic.ac.uk.xdrone.xDrone.UserFunction;
import ic.ac.uk.xdrone.xDrone.Wait;
import ic.ac.uk.xdrone.xDrone.XDronePackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ic.ac.uk.xdrone.xDrone.XDronePackage
 * @generated
 */
public class XDroneSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static XDronePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDroneSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = XDronePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case XDronePackage.PROGRAM:
      {
        Program program = (Program)theEObject;
        T result = caseProgram(program);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDronePackage.FLY:
      {
        Fly fly = (Fly)theEObject;
        T result = caseFly(fly);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDronePackage.ENVIRONMENT:
      {
        Environment environment = (Environment)theEObject;
        T result = caseEnvironment(environment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDronePackage.USER_FUNCTION:
      {
        UserFunction userFunction = (UserFunction)theEObject;
        T result = caseUserFunction(userFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDronePackage.SUPER_COMMAND:
      {
        SuperCommand superCommand = (SuperCommand)theEObject;
        T result = caseSuperCommand(superCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDronePackage.COMMAND:
      {
        Command command = (Command)theEObject;
        T result = caseCommand(command);
        if (result == null) result = caseSuperCommand(command);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDronePackage.UP:
      {
        Up up = (Up)theEObject;
        T result = caseUp(up);
        if (result == null) result = caseCommand(up);
        if (result == null) result = caseSuperCommand(up);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDronePackage.DOWN:
      {
        Down down = (Down)theEObject;
        T result = caseDown(down);
        if (result == null) result = caseCommand(down);
        if (result == null) result = caseSuperCommand(down);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDronePackage.LEFT:
      {
        Left left = (Left)theEObject;
        T result = caseLeft(left);
        if (result == null) result = caseCommand(left);
        if (result == null) result = caseSuperCommand(left);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDronePackage.RIGHT:
      {
        Right right = (Right)theEObject;
        T result = caseRight(right);
        if (result == null) result = caseCommand(right);
        if (result == null) result = caseSuperCommand(right);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDronePackage.FORWARD:
      {
        Forward forward = (Forward)theEObject;
        T result = caseForward(forward);
        if (result == null) result = caseCommand(forward);
        if (result == null) result = caseSuperCommand(forward);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDronePackage.BACKWARD:
      {
        Backward backward = (Backward)theEObject;
        T result = caseBackward(backward);
        if (result == null) result = caseCommand(backward);
        if (result == null) result = caseSuperCommand(backward);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDronePackage.ROTATE_L:
      {
        RotateL rotateL = (RotateL)theEObject;
        T result = caseRotateL(rotateL);
        if (result == null) result = caseCommand(rotateL);
        if (result == null) result = caseSuperCommand(rotateL);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDronePackage.ROTATE_R:
      {
        RotateR rotateR = (RotateR)theEObject;
        T result = caseRotateR(rotateR);
        if (result == null) result = caseCommand(rotateR);
        if (result == null) result = caseSuperCommand(rotateR);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDronePackage.WAIT:
      {
        Wait wait = (Wait)theEObject;
        T result = caseWait(wait);
        if (result == null) result = caseCommand(wait);
        if (result == null) result = caseSuperCommand(wait);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDronePackage.MOVE:
      {
        Move move = (Move)theEObject;
        T result = caseMove(move);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDronePackage.FUNCTION_NAME:
      {
        FunctionName functionName = (FunctionName)theEObject;
        T result = caseFunctionName(functionName);
        if (result == null) result = caseSuperCommand(functionName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDronePackage.DRONE:
      {
        Drone drone = (Drone)theEObject;
        T result = caseDrone(drone);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XDronePackage.OBJECT:
      {
        ic.ac.uk.xdrone.xDrone.Object object = (ic.ac.uk.xdrone.xDrone.Object)theEObject;
        T result = caseObject(object);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProgram(Program object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fly</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fly</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFly(Fly object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnvironment(Environment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>User Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>User Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUserFunction(UserFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Super Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Super Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSuperCommand(SuperCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommand(Command object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Up</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Up</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUp(Up object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Down</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Down</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDown(Down object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Left</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Left</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeft(Left object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Right</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Right</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRight(Right object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Forward</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Forward</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForward(Forward object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Backward</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Backward</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBackward(Backward object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rotate L</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rotate L</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRotateL(RotateL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rotate R</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rotate R</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRotateR(RotateR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wait</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wait</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWait(Wait object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Move</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Move</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMove(Move object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionName(FunctionName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Drone</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Drone</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDrone(Drone object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObject(ic.ac.uk.xdrone.xDrone.Object object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //XDroneSwitch
