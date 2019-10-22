/**
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.xDrone.util;

import ic.ac.uk.xdrone.xDrone.BackWall;
import ic.ac.uk.xdrone.xDrone.Backward;
import ic.ac.uk.xdrone.xDrone.Color;
import ic.ac.uk.xdrone.xDrone.Command;
import ic.ac.uk.xdrone.xDrone.Down;
import ic.ac.uk.xdrone.xDrone.Drone;
import ic.ac.uk.xdrone.xDrone.Environment;
import ic.ac.uk.xdrone.xDrone.Fly;
import ic.ac.uk.xdrone.xDrone.Forward;
import ic.ac.uk.xdrone.xDrone.FrontWall;
import ic.ac.uk.xdrone.xDrone.GoTo;
import ic.ac.uk.xdrone.xDrone.Left;
import ic.ac.uk.xdrone.xDrone.LeftWall;
import ic.ac.uk.xdrone.xDrone.Main;
import ic.ac.uk.xdrone.xDrone.Origin;
import ic.ac.uk.xdrone.xDrone.Position;
import ic.ac.uk.xdrone.xDrone.Program;
import ic.ac.uk.xdrone.xDrone.Right;
import ic.ac.uk.xdrone.xDrone.RightWall;
import ic.ac.uk.xdrone.xDrone.RotateL;
import ic.ac.uk.xdrone.xDrone.RotateR;
import ic.ac.uk.xdrone.xDrone.Size;
import ic.ac.uk.xdrone.xDrone.SuperCommand;
import ic.ac.uk.xdrone.xDrone.Up;
import ic.ac.uk.xdrone.xDrone.UpWall;
import ic.ac.uk.xdrone.xDrone.Vector;
import ic.ac.uk.xdrone.xDrone.Wait;
import ic.ac.uk.xdrone.xDrone.Walls;
import ic.ac.uk.xdrone.xDrone.XDronePackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ic.ac.uk.xdrone.xDrone.XDronePackage
 * @generated
 */
public class XDroneAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static XDronePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XDroneAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = XDronePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XDroneSwitch<Adapter> modelSwitch =
    new XDroneSwitch<Adapter>()
    {
      @Override
      public Adapter caseProgram(Program object)
      {
        return createProgramAdapter();
      }
      @Override
      public Adapter caseMain(Main object)
      {
        return createMainAdapter();
      }
      @Override
      public Adapter caseFly(Fly object)
      {
        return createFlyAdapter();
      }
      @Override
      public Adapter caseEnvironment(Environment object)
      {
        return createEnvironmentAdapter();
      }
      @Override
      public Adapter caseSuperCommand(SuperCommand object)
      {
        return createSuperCommandAdapter();
      }
      @Override
      public Adapter caseCommand(Command object)
      {
        return createCommandAdapter();
      }
      @Override
      public Adapter caseGoTo(GoTo object)
      {
        return createGoToAdapter();
      }
      @Override
      public Adapter caseUp(Up object)
      {
        return createUpAdapter();
      }
      @Override
      public Adapter caseDown(Down object)
      {
        return createDownAdapter();
      }
      @Override
      public Adapter caseLeft(Left object)
      {
        return createLeftAdapter();
      }
      @Override
      public Adapter caseRight(Right object)
      {
        return createRightAdapter();
      }
      @Override
      public Adapter caseForward(Forward object)
      {
        return createForwardAdapter();
      }
      @Override
      public Adapter caseBackward(Backward object)
      {
        return createBackwardAdapter();
      }
      @Override
      public Adapter caseRotateL(RotateL object)
      {
        return createRotateLAdapter();
      }
      @Override
      public Adapter caseRotateR(RotateR object)
      {
        return createRotateRAdapter();
      }
      @Override
      public Adapter caseWait(Wait object)
      {
        return createWaitAdapter();
      }
      @Override
      public Adapter caseDrone(Drone object)
      {
        return createDroneAdapter();
      }
      @Override
      public Adapter caseObject(ic.ac.uk.xdrone.xDrone.Object object)
      {
        return createObjectAdapter();
      }
      @Override
      public Adapter caseOrigin(Origin object)
      {
        return createOriginAdapter();
      }
      @Override
      public Adapter caseSize(Size object)
      {
        return createSizeAdapter();
      }
      @Override
      public Adapter casePosition(Position object)
      {
        return createPositionAdapter();
      }
      @Override
      public Adapter caseVector(Vector object)
      {
        return createVectorAdapter();
      }
      @Override
      public Adapter caseColor(Color object)
      {
        return createColorAdapter();
      }
      @Override
      public Adapter caseWalls(Walls object)
      {
        return createWallsAdapter();
      }
      @Override
      public Adapter caseFrontWall(FrontWall object)
      {
        return createFrontWallAdapter();
      }
      @Override
      public Adapter caseRightWall(RightWall object)
      {
        return createRightWallAdapter();
      }
      @Override
      public Adapter caseLeftWall(LeftWall object)
      {
        return createLeftWallAdapter();
      }
      @Override
      public Adapter caseBackWall(BackWall object)
      {
        return createBackWallAdapter();
      }
      @Override
      public Adapter caseUpWall(UpWall object)
      {
        return createUpWallAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.Program
   * @generated
   */
  public Adapter createProgramAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.Main <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.Main
   * @generated
   */
  public Adapter createMainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.Fly <em>Fly</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.Fly
   * @generated
   */
  public Adapter createFlyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.Environment <em>Environment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.Environment
   * @generated
   */
  public Adapter createEnvironmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.SuperCommand <em>Super Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.SuperCommand
   * @generated
   */
  public Adapter createSuperCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.Command
   * @generated
   */
  public Adapter createCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.GoTo <em>Go To</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.GoTo
   * @generated
   */
  public Adapter createGoToAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.Up <em>Up</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.Up
   * @generated
   */
  public Adapter createUpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.Down <em>Down</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.Down
   * @generated
   */
  public Adapter createDownAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.Left <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.Left
   * @generated
   */
  public Adapter createLeftAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.Right <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.Right
   * @generated
   */
  public Adapter createRightAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.Forward <em>Forward</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.Forward
   * @generated
   */
  public Adapter createForwardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.Backward <em>Backward</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.Backward
   * @generated
   */
  public Adapter createBackwardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.RotateL <em>Rotate L</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.RotateL
   * @generated
   */
  public Adapter createRotateLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.RotateR <em>Rotate R</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.RotateR
   * @generated
   */
  public Adapter createRotateRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.Wait <em>Wait</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.Wait
   * @generated
   */
  public Adapter createWaitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.Drone <em>Drone</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.Drone
   * @generated
   */
  public Adapter createDroneAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.Object
   * @generated
   */
  public Adapter createObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.Origin <em>Origin</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.Origin
   * @generated
   */
  public Adapter createOriginAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.Size <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.Size
   * @generated
   */
  public Adapter createSizeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.Position <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.Position
   * @generated
   */
  public Adapter createPositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.Vector <em>Vector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.Vector
   * @generated
   */
  public Adapter createVectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.Color
   * @generated
   */
  public Adapter createColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.Walls <em>Walls</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.Walls
   * @generated
   */
  public Adapter createWallsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.FrontWall <em>Front Wall</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.FrontWall
   * @generated
   */
  public Adapter createFrontWallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.RightWall <em>Right Wall</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.RightWall
   * @generated
   */
  public Adapter createRightWallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.LeftWall <em>Left Wall</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.LeftWall
   * @generated
   */
  public Adapter createLeftWallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.BackWall <em>Back Wall</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.BackWall
   * @generated
   */
  public Adapter createBackWallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ic.ac.uk.xdrone.xDrone.UpWall <em>Up Wall</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ic.ac.uk.xdrone.xDrone.UpWall
   * @generated
   */
  public Adapter createUpWallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //XDroneAdapterFactory
