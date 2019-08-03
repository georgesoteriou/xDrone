/*
 * generated by Xtext 2.17.0
 */
package ic.ac.uk.xdrone.serializer;

import com.google.inject.Inject;
import ic.ac.uk.xdrone.services.XDroneGrammarAccess;
import ic.ac.uk.xdrone.xDrone.Backward;
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
import ic.ac.uk.xdrone.xDrone.Up;
import ic.ac.uk.xdrone.xDrone.UserFunction;
import ic.ac.uk.xdrone.xDrone.Wait;
import ic.ac.uk.xdrone.xDrone.XDronePackage;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class XDroneSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XDroneGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == XDronePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XDronePackage.BACKWARD:
				sequence_Backward(context, (Backward) semanticObject); 
				return; 
			case XDronePackage.DOWN:
				sequence_Down(context, (Down) semanticObject); 
				return; 
			case XDronePackage.DRONE:
				sequence_Drone(context, (Drone) semanticObject); 
				return; 
			case XDronePackage.ENVIRONMENT:
				sequence_Environment(context, (Environment) semanticObject); 
				return; 
			case XDronePackage.FLY:
				sequence_Fly(context, (Fly) semanticObject); 
				return; 
			case XDronePackage.FORWARD:
				sequence_Forward(context, (Forward) semanticObject); 
				return; 
			case XDronePackage.FUNCTION_NAME:
				sequence_FunctionName(context, (FunctionName) semanticObject); 
				return; 
			case XDronePackage.LEFT:
				sequence_Left(context, (Left) semanticObject); 
				return; 
			case XDronePackage.MOVE:
				sequence_Move(context, (Move) semanticObject); 
				return; 
			case XDronePackage.OBJECT:
				sequence_Object(context, (ic.ac.uk.xdrone.xDrone.Object) semanticObject); 
				return; 
			case XDronePackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case XDronePackage.RIGHT:
				sequence_Right(context, (Right) semanticObject); 
				return; 
			case XDronePackage.ROTATE_L:
				sequence_RotateL(context, (RotateL) semanticObject); 
				return; 
			case XDronePackage.ROTATE_R:
				sequence_RotateR(context, (RotateR) semanticObject); 
				return; 
			case XDronePackage.UP:
				sequence_Up(context, (Up) semanticObject); 
				return; 
			case XDronePackage.USER_FUNCTION:
				sequence_UserFunction(context, (UserFunction) semanticObject); 
				return; 
			case XDronePackage.WAIT:
				sequence_Wait(context, (Wait) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     SuperCommand returns Backward
	 *     Command returns Backward
	 *     Backward returns Backward
	 *
	 * Constraint:
	 *     distance=DOUBLE
	 */
	protected void sequence_Backward(ISerializationContext context, Backward semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.BACKWARD__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.BACKWARD__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBackwardAccess().getDistanceDOUBLEParserRuleCall_2_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SuperCommand returns Down
	 *     Command returns Down
	 *     Down returns Down
	 *
	 * Constraint:
	 *     distance=DOUBLE
	 */
	protected void sequence_Down(ISerializationContext context, Down semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.DOWN__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.DOWN__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDownAccess().getDistanceDOUBLEParserRuleCall_2_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Drone returns Drone
	 *
	 * Constraint:
	 *     (x=DOUBLE z=DOUBLE y=DOUBLE)
	 */
	protected void sequence_Drone(ISerializationContext context, Drone semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.DRONE__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.DRONE__X));
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.DRONE__Z) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.DRONE__Z));
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.DRONE__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.DRONE__Y));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDroneAccess().getXDOUBLEParserRuleCall_2_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getDroneAccess().getZDOUBLEParserRuleCall_4_0(), semanticObject.getZ());
		feeder.accept(grammarAccess.getDroneAccess().getYDOUBLEParserRuleCall_6_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Environment returns Environment
	 *
	 * Constraint:
	 *     (drone+=Drone? objects+=Object*)
	 */
	protected void sequence_Environment(ISerializationContext context, Environment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Fly returns Fly
	 *
	 * Constraint:
	 *     (takeoff+=Takeoff commands+=SuperCommand* land+=Land)
	 */
	protected void sequence_Fly(ISerializationContext context, Fly semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SuperCommand returns Forward
	 *     Command returns Forward
	 *     Forward returns Forward
	 *
	 * Constraint:
	 *     distance=DOUBLE
	 */
	protected void sequence_Forward(ISerializationContext context, Forward semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.FORWARD__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.FORWARD__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getForwardAccess().getDistanceDOUBLEParserRuleCall_2_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SuperCommand returns FunctionName
	 *     FunctionName returns FunctionName
	 *
	 * Constraint:
	 *     func_name=ID
	 */
	protected void sequence_FunctionName(ISerializationContext context, FunctionName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.FUNCTION_NAME__FUNC_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.FUNCTION_NAME__FUNC_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFunctionNameAccess().getFunc_nameIDTerminalRuleCall_0_0(), semanticObject.getFunc_name());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SuperCommand returns Left
	 *     Command returns Left
	 *     Left returns Left
	 *
	 * Constraint:
	 *     distance=DOUBLE
	 */
	protected void sequence_Left(ISerializationContext context, Left semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.LEFT__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.LEFT__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLeftAccess().getDistanceDOUBLEParserRuleCall_2_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Move returns Move
	 *
	 * Constraint:
	 *     (x=DOUBLE y=DOUBLE z=DOUBLE)
	 */
	protected void sequence_Move(ISerializationContext context, Move semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.MOVE__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.MOVE__X));
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.MOVE__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.MOVE__Y));
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.MOVE__Z) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.MOVE__Z));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMoveAccess().getXDOUBLEParserRuleCall_2_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getMoveAccess().getYDOUBLEParserRuleCall_4_0(), semanticObject.getY());
		feeder.accept(grammarAccess.getMoveAccess().getZDOUBLEParserRuleCall_6_0(), semanticObject.getZ());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Object returns Object
	 *
	 * Constraint:
	 *     (
	 *         object_name=ID 
	 *         sx=DOUBLE 
	 *         sz=DOUBLE 
	 *         sy=DOUBLE 
	 *         lx=DOUBLE 
	 *         lz=DOUBLE 
	 *         ly=DOUBLE
	 *     )
	 */
	protected void sequence_Object(ISerializationContext context, ic.ac.uk.xdrone.xDrone.Object semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.OBJECT__OBJECT_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.OBJECT__OBJECT_NAME));
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.OBJECT__SX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.OBJECT__SX));
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.OBJECT__SZ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.OBJECT__SZ));
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.OBJECT__SY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.OBJECT__SY));
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.OBJECT__LX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.OBJECT__LX));
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.OBJECT__LZ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.OBJECT__LZ));
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.OBJECT__LY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.OBJECT__LY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getObjectAccess().getObject_nameIDTerminalRuleCall_0_0(), semanticObject.getObject_name());
		feeder.accept(grammarAccess.getObjectAccess().getSxDOUBLEParserRuleCall_2_0(), semanticObject.getSx());
		feeder.accept(grammarAccess.getObjectAccess().getSzDOUBLEParserRuleCall_4_0(), semanticObject.getSz());
		feeder.accept(grammarAccess.getObjectAccess().getSyDOUBLEParserRuleCall_6_0(), semanticObject.getSy());
		feeder.accept(grammarAccess.getObjectAccess().getLxDOUBLEParserRuleCall_8_0(), semanticObject.getLx());
		feeder.accept(grammarAccess.getObjectAccess().getLzDOUBLEParserRuleCall_10_0(), semanticObject.getLz());
		feeder.accept(grammarAccess.getObjectAccess().getLyDOUBLEParserRuleCall_12_0(), semanticObject.getLy());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     (fly=Fly environment=Environment)
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.PROGRAM__FLY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.PROGRAM__FLY));
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.PROGRAM__ENVIRONMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.PROGRAM__ENVIRONMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProgramAccess().getFlyFlyParserRuleCall_0_0(), semanticObject.getFly());
		feeder.accept(grammarAccess.getProgramAccess().getEnvironmentEnvironmentParserRuleCall_1_0(), semanticObject.getEnvironment());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SuperCommand returns Right
	 *     Command returns Right
	 *     Right returns Right
	 *
	 * Constraint:
	 *     distance=DOUBLE
	 */
	protected void sequence_Right(ISerializationContext context, Right semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.RIGHT__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.RIGHT__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRightAccess().getDistanceDOUBLEParserRuleCall_2_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SuperCommand returns RotateL
	 *     Command returns RotateL
	 *     RotateL returns RotateL
	 *
	 * Constraint:
	 *     angle=INT
	 */
	protected void sequence_RotateL(ISerializationContext context, RotateL semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.ROTATE_L__ANGLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.ROTATE_L__ANGLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRotateLAccess().getAngleINTTerminalRuleCall_2_0(), semanticObject.getAngle());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SuperCommand returns RotateR
	 *     Command returns RotateR
	 *     RotateR returns RotateR
	 *
	 * Constraint:
	 *     angle=INT
	 */
	protected void sequence_RotateR(ISerializationContext context, RotateR semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.ROTATE_R__ANGLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.ROTATE_R__ANGLE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRotateRAccess().getAngleINTTerminalRuleCall_2_0(), semanticObject.getAngle());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SuperCommand returns Up
	 *     Command returns Up
	 *     Up returns Up
	 *
	 * Constraint:
	 *     distance=DOUBLE
	 */
	protected void sequence_Up(ISerializationContext context, Up semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.UP__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.UP__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUpAccess().getDistanceDOUBLEParserRuleCall_2_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     UserFunction returns UserFunction
	 *
	 * Constraint:
	 *     (name=ID func+=Command*)
	 */
	protected void sequence_UserFunction(ISerializationContext context, UserFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SuperCommand returns Wait
	 *     Command returns Wait
	 *     Wait returns Wait
	 *
	 * Constraint:
	 *     seconds=DOUBLE
	 */
	protected void sequence_Wait(ISerializationContext context, Wait semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XDronePackage.Literals.WAIT__SECONDS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XDronePackage.Literals.WAIT__SECONDS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWaitAccess().getSecondsDOUBLEParserRuleCall_2_0(), semanticObject.getSeconds());
		feeder.finish();
	}
	
	
}
