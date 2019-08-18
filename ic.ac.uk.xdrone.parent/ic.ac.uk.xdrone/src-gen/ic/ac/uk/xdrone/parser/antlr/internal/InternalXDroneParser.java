package ic.ac.uk.xdrone.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import ic.ac.uk.xdrone.services.XDroneGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXDroneParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fly(){'", "'}'", "'environment(){'", "'TAKEOFF()'", "'LAND()'", "'-'", "'.'", "'GOTO'", "'('", "')'", "'MOVE'", "'ROTATE'", "'WAIT'", "'()'", "'DRONE'", "'{'", "'rotation'", "'='", "'origin'", "'size'", "'position'", "','", "'color'", "'WALLS'", "'front'", "'right'", "'left'", "'back'", "'up'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalXDroneParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXDroneParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXDroneParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXDrone.g"; }



     	private XDroneGrammarAccess grammarAccess;

        public InternalXDroneParser(TokenStream input, XDroneGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected XDroneGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalXDrone.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalXDrone.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalXDrone.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalXDrone.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_main_0_0= ruleMain ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_main_0_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:77:2: ( ( (lv_main_0_0= ruleMain ) ) )
            // InternalXDrone.g:78:2: ( (lv_main_0_0= ruleMain ) )
            {
            // InternalXDrone.g:78:2: ( (lv_main_0_0= ruleMain ) )
            // InternalXDrone.g:79:3: (lv_main_0_0= ruleMain )
            {
            // InternalXDrone.g:79:3: (lv_main_0_0= ruleMain )
            // InternalXDrone.g:80:4: lv_main_0_0= ruleMain
            {

            				newCompositeNode(grammarAccess.getProgramAccess().getMainMainParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_main_0_0=ruleMain();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getProgramRule());
            				}
            				set(
            					current,
            					"main",
            					lv_main_0_0,
            					"ic.ac.uk.xdrone.XDrone.Main");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleMain"
    // InternalXDrone.g:100:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalXDrone.g:100:45: (iv_ruleMain= ruleMain EOF )
            // InternalXDrone.g:101:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalXDrone.g:107:1: ruleMain returns [EObject current=null] : ( ( (lv_fly_0_0= ruleFly ) ) ( (lv_environment_1_0= ruleEnvironment ) )? ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        EObject lv_fly_0_0 = null;

        EObject lv_environment_1_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:113:2: ( ( ( (lv_fly_0_0= ruleFly ) ) ( (lv_environment_1_0= ruleEnvironment ) )? ) )
            // InternalXDrone.g:114:2: ( ( (lv_fly_0_0= ruleFly ) ) ( (lv_environment_1_0= ruleEnvironment ) )? )
            {
            // InternalXDrone.g:114:2: ( ( (lv_fly_0_0= ruleFly ) ) ( (lv_environment_1_0= ruleEnvironment ) )? )
            // InternalXDrone.g:115:3: ( (lv_fly_0_0= ruleFly ) ) ( (lv_environment_1_0= ruleEnvironment ) )?
            {
            // InternalXDrone.g:115:3: ( (lv_fly_0_0= ruleFly ) )
            // InternalXDrone.g:116:4: (lv_fly_0_0= ruleFly )
            {
            // InternalXDrone.g:116:4: (lv_fly_0_0= ruleFly )
            // InternalXDrone.g:117:5: lv_fly_0_0= ruleFly
            {

            					newCompositeNode(grammarAccess.getMainAccess().getFlyFlyParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_fly_0_0=ruleFly();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainRule());
            					}
            					set(
            						current,
            						"fly",
            						lv_fly_0_0,
            						"ic.ac.uk.xdrone.XDrone.Fly");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXDrone.g:134:3: ( (lv_environment_1_0= ruleEnvironment ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalXDrone.g:135:4: (lv_environment_1_0= ruleEnvironment )
                    {
                    // InternalXDrone.g:135:4: (lv_environment_1_0= ruleEnvironment )
                    // InternalXDrone.g:136:5: lv_environment_1_0= ruleEnvironment
                    {

                    					newCompositeNode(grammarAccess.getMainAccess().getEnvironmentEnvironmentParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_environment_1_0=ruleEnvironment();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMainRule());
                    					}
                    					set(
                    						current,
                    						"environment",
                    						lv_environment_1_0,
                    						"ic.ac.uk.xdrone.XDrone.Environment");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleFly"
    // InternalXDrone.g:157:1: entryRuleFly returns [EObject current=null] : iv_ruleFly= ruleFly EOF ;
    public final EObject entryRuleFly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFly = null;


        try {
            // InternalXDrone.g:157:44: (iv_ruleFly= ruleFly EOF )
            // InternalXDrone.g:158:2: iv_ruleFly= ruleFly EOF
            {
             newCompositeNode(grammarAccess.getFlyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFly=ruleFly();

            state._fsp--;

             current =iv_ruleFly; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFly"


    // $ANTLR start "ruleFly"
    // InternalXDrone.g:164:1: ruleFly returns [EObject current=null] : (otherlv_0= 'fly(){' ( ( (lv_takeoff_1_0= ruleTakeoff ) ) ( (lv_commands_2_0= ruleSuperCommand ) )* ( (lv_land_3_0= ruleLand ) ) ) otherlv_4= '}' ) ;
    public final EObject ruleFly() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_takeoff_1_0 = null;

        EObject lv_commands_2_0 = null;

        AntlrDatatypeRuleToken lv_land_3_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:170:2: ( (otherlv_0= 'fly(){' ( ( (lv_takeoff_1_0= ruleTakeoff ) ) ( (lv_commands_2_0= ruleSuperCommand ) )* ( (lv_land_3_0= ruleLand ) ) ) otherlv_4= '}' ) )
            // InternalXDrone.g:171:2: (otherlv_0= 'fly(){' ( ( (lv_takeoff_1_0= ruleTakeoff ) ) ( (lv_commands_2_0= ruleSuperCommand ) )* ( (lv_land_3_0= ruleLand ) ) ) otherlv_4= '}' )
            {
            // InternalXDrone.g:171:2: (otherlv_0= 'fly(){' ( ( (lv_takeoff_1_0= ruleTakeoff ) ) ( (lv_commands_2_0= ruleSuperCommand ) )* ( (lv_land_3_0= ruleLand ) ) ) otherlv_4= '}' )
            // InternalXDrone.g:172:3: otherlv_0= 'fly(){' ( ( (lv_takeoff_1_0= ruleTakeoff ) ) ( (lv_commands_2_0= ruleSuperCommand ) )* ( (lv_land_3_0= ruleLand ) ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFlyAccess().getFlyKeyword_0());
            		
            // InternalXDrone.g:176:3: ( ( (lv_takeoff_1_0= ruleTakeoff ) ) ( (lv_commands_2_0= ruleSuperCommand ) )* ( (lv_land_3_0= ruleLand ) ) )
            // InternalXDrone.g:177:4: ( (lv_takeoff_1_0= ruleTakeoff ) ) ( (lv_commands_2_0= ruleSuperCommand ) )* ( (lv_land_3_0= ruleLand ) )
            {
            // InternalXDrone.g:177:4: ( (lv_takeoff_1_0= ruleTakeoff ) )
            // InternalXDrone.g:178:5: (lv_takeoff_1_0= ruleTakeoff )
            {
            // InternalXDrone.g:178:5: (lv_takeoff_1_0= ruleTakeoff )
            // InternalXDrone.g:179:6: lv_takeoff_1_0= ruleTakeoff
            {

            						newCompositeNode(grammarAccess.getFlyAccess().getTakeoffTakeoffParserRuleCall_1_0_0());
            					
            pushFollow(FOLLOW_5);
            lv_takeoff_1_0=ruleTakeoff();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getFlyRule());
            						}
            						add(
            							current,
            							"takeoff",
            							lv_takeoff_1_0,
            							"ic.ac.uk.xdrone.XDrone.Takeoff");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalXDrone.g:196:4: ( (lv_commands_2_0= ruleSuperCommand ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==18||(LA2_0>=21 && LA2_0<=23)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalXDrone.g:197:5: (lv_commands_2_0= ruleSuperCommand )
            	    {
            	    // InternalXDrone.g:197:5: (lv_commands_2_0= ruleSuperCommand )
            	    // InternalXDrone.g:198:6: lv_commands_2_0= ruleSuperCommand
            	    {

            	    						newCompositeNode(grammarAccess.getFlyAccess().getCommandsSuperCommandParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_commands_2_0=ruleSuperCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFlyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"commands",
            	    							lv_commands_2_0,
            	    							"ic.ac.uk.xdrone.XDrone.SuperCommand");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalXDrone.g:215:4: ( (lv_land_3_0= ruleLand ) )
            // InternalXDrone.g:216:5: (lv_land_3_0= ruleLand )
            {
            // InternalXDrone.g:216:5: (lv_land_3_0= ruleLand )
            // InternalXDrone.g:217:6: lv_land_3_0= ruleLand
            {

            						newCompositeNode(grammarAccess.getFlyAccess().getLandLandParserRuleCall_1_2_0());
            					
            pushFollow(FOLLOW_6);
            lv_land_3_0=ruleLand();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getFlyRule());
            						}
            						add(
            							current,
            							"land",
            							lv_land_3_0,
            							"ic.ac.uk.xdrone.XDrone.Land");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFlyAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFly"


    // $ANTLR start "entryRuleEnvironment"
    // InternalXDrone.g:243:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalXDrone.g:243:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalXDrone.g:244:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalXDrone.g:250:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= 'environment(){' ( ( (lv_drone_2_0= ruleDrone ) ) | ( (lv_walls_3_0= ruleWalls ) ) | ( (lv_objects_4_0= ruleObject ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_drone_2_0 = null;

        EObject lv_walls_3_0 = null;

        EObject lv_objects_4_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:256:2: ( ( () otherlv_1= 'environment(){' ( ( (lv_drone_2_0= ruleDrone ) ) | ( (lv_walls_3_0= ruleWalls ) ) | ( (lv_objects_4_0= ruleObject ) ) )* otherlv_5= '}' ) )
            // InternalXDrone.g:257:2: ( () otherlv_1= 'environment(){' ( ( (lv_drone_2_0= ruleDrone ) ) | ( (lv_walls_3_0= ruleWalls ) ) | ( (lv_objects_4_0= ruleObject ) ) )* otherlv_5= '}' )
            {
            // InternalXDrone.g:257:2: ( () otherlv_1= 'environment(){' ( ( (lv_drone_2_0= ruleDrone ) ) | ( (lv_walls_3_0= ruleWalls ) ) | ( (lv_objects_4_0= ruleObject ) ) )* otherlv_5= '}' )
            // InternalXDrone.g:258:3: () otherlv_1= 'environment(){' ( ( (lv_drone_2_0= ruleDrone ) ) | ( (lv_walls_3_0= ruleWalls ) ) | ( (lv_objects_4_0= ruleObject ) ) )* otherlv_5= '}'
            {
            // InternalXDrone.g:258:3: ()
            // InternalXDrone.g:259:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1());
            		
            // InternalXDrone.g:269:3: ( ( (lv_drone_2_0= ruleDrone ) ) | ( (lv_walls_3_0= ruleWalls ) ) | ( (lv_objects_4_0= ruleObject ) ) )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    alt3=1;
                    }
                    break;
                case 34:
                case 36:
                case 37:
                case 38:
                case 39:
                    {
                    alt3=2;
                    }
                    break;
                case RULE_ID:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalXDrone.g:270:4: ( (lv_drone_2_0= ruleDrone ) )
            	    {
            	    // InternalXDrone.g:270:4: ( (lv_drone_2_0= ruleDrone ) )
            	    // InternalXDrone.g:271:5: (lv_drone_2_0= ruleDrone )
            	    {
            	    // InternalXDrone.g:271:5: (lv_drone_2_0= ruleDrone )
            	    // InternalXDrone.g:272:6: lv_drone_2_0= ruleDrone
            	    {

            	    						newCompositeNode(grammarAccess.getEnvironmentAccess().getDroneDroneParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_drone_2_0=ruleDrone();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"drone",
            	    							lv_drone_2_0,
            	    							"ic.ac.uk.xdrone.XDrone.Drone");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDrone.g:290:4: ( (lv_walls_3_0= ruleWalls ) )
            	    {
            	    // InternalXDrone.g:290:4: ( (lv_walls_3_0= ruleWalls ) )
            	    // InternalXDrone.g:291:5: (lv_walls_3_0= ruleWalls )
            	    {
            	    // InternalXDrone.g:291:5: (lv_walls_3_0= ruleWalls )
            	    // InternalXDrone.g:292:6: lv_walls_3_0= ruleWalls
            	    {

            	    						newCompositeNode(grammarAccess.getEnvironmentAccess().getWallsWallsParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_walls_3_0=ruleWalls();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"walls",
            	    							lv_walls_3_0,
            	    							"ic.ac.uk.xdrone.XDrone.Walls");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDrone.g:310:4: ( (lv_objects_4_0= ruleObject ) )
            	    {
            	    // InternalXDrone.g:310:4: ( (lv_objects_4_0= ruleObject ) )
            	    // InternalXDrone.g:311:5: (lv_objects_4_0= ruleObject )
            	    {
            	    // InternalXDrone.g:311:5: (lv_objects_4_0= ruleObject )
            	    // InternalXDrone.g:312:6: lv_objects_4_0= ruleObject
            	    {

            	    						newCompositeNode(grammarAccess.getEnvironmentAccess().getObjectsObjectParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_objects_4_0=ruleObject();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"objects",
            	    							lv_objects_4_0,
            	    							"ic.ac.uk.xdrone.XDrone.Object");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleTakeoff"
    // InternalXDrone.g:338:1: entryRuleTakeoff returns [String current=null] : iv_ruleTakeoff= ruleTakeoff EOF ;
    public final String entryRuleTakeoff() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTakeoff = null;


        try {
            // InternalXDrone.g:338:47: (iv_ruleTakeoff= ruleTakeoff EOF )
            // InternalXDrone.g:339:2: iv_ruleTakeoff= ruleTakeoff EOF
            {
             newCompositeNode(grammarAccess.getTakeoffRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTakeoff=ruleTakeoff();

            state._fsp--;

             current =iv_ruleTakeoff.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTakeoff"


    // $ANTLR start "ruleTakeoff"
    // InternalXDrone.g:345:1: ruleTakeoff returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'TAKEOFF()' ;
    public final AntlrDatatypeRuleToken ruleTakeoff() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXDrone.g:351:2: (kw= 'TAKEOFF()' )
            // InternalXDrone.g:352:2: kw= 'TAKEOFF()'
            {
            kw=(Token)match(input,14,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getTakeoffAccess().getTAKEOFFKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTakeoff"


    // $ANTLR start "entryRuleLand"
    // InternalXDrone.g:360:1: entryRuleLand returns [String current=null] : iv_ruleLand= ruleLand EOF ;
    public final String entryRuleLand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLand = null;


        try {
            // InternalXDrone.g:360:44: (iv_ruleLand= ruleLand EOF )
            // InternalXDrone.g:361:2: iv_ruleLand= ruleLand EOF
            {
             newCompositeNode(grammarAccess.getLandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLand=ruleLand();

            state._fsp--;

             current =iv_ruleLand.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLand"


    // $ANTLR start "ruleLand"
    // InternalXDrone.g:367:1: ruleLand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'LAND()' ;
    public final AntlrDatatypeRuleToken ruleLand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXDrone.g:373:2: (kw= 'LAND()' )
            // InternalXDrone.g:374:2: kw= 'LAND()'
            {
            kw=(Token)match(input,15,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getLandAccess().getLANDKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLand"


    // $ANTLR start "entryRuleSuperCommand"
    // InternalXDrone.g:382:1: entryRuleSuperCommand returns [EObject current=null] : iv_ruleSuperCommand= ruleSuperCommand EOF ;
    public final EObject entryRuleSuperCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperCommand = null;


        try {
            // InternalXDrone.g:382:53: (iv_ruleSuperCommand= ruleSuperCommand EOF )
            // InternalXDrone.g:383:2: iv_ruleSuperCommand= ruleSuperCommand EOF
            {
             newCompositeNode(grammarAccess.getSuperCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuperCommand=ruleSuperCommand();

            state._fsp--;

             current =iv_ruleSuperCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuperCommand"


    // $ANTLR start "ruleSuperCommand"
    // InternalXDrone.g:389:1: ruleSuperCommand returns [EObject current=null] : (this_Command_0= ruleCommand | this_FunctionName_1= ruleFunctionName ) ;
    public final EObject ruleSuperCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_FunctionName_1 = null;



        	enterRule();

        try {
            // InternalXDrone.g:395:2: ( (this_Command_0= ruleCommand | this_FunctionName_1= ruleFunctionName ) )
            // InternalXDrone.g:396:2: (this_Command_0= ruleCommand | this_FunctionName_1= ruleFunctionName )
            {
            // InternalXDrone.g:396:2: (this_Command_0= ruleCommand | this_FunctionName_1= ruleFunctionName )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18||(LA4_0>=21 && LA4_0<=23)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalXDrone.g:397:3: this_Command_0= ruleCommand
                    {

                    			newCompositeNode(grammarAccess.getSuperCommandAccess().getCommandParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Command_0=ruleCommand();

                    state._fsp--;


                    			current = this_Command_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXDrone.g:406:3: this_FunctionName_1= ruleFunctionName
                    {

                    			newCompositeNode(grammarAccess.getSuperCommandAccess().getFunctionNameParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FunctionName_1=ruleFunctionName();

                    state._fsp--;


                    			current = this_FunctionName_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuperCommand"


    // $ANTLR start "entryRuleCommand"
    // InternalXDrone.g:418:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalXDrone.g:418:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalXDrone.g:419:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalXDrone.g:425:1: ruleCommand returns [EObject current=null] : (this_Wait_0= ruleWait | this_Move_1= ruleMove | this_Rotate_2= ruleRotate | this_GoTo_3= ruleGoTo ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Wait_0 = null;

        EObject this_Move_1 = null;

        EObject this_Rotate_2 = null;

        EObject this_GoTo_3 = null;



        	enterRule();

        try {
            // InternalXDrone.g:431:2: ( (this_Wait_0= ruleWait | this_Move_1= ruleMove | this_Rotate_2= ruleRotate | this_GoTo_3= ruleGoTo ) )
            // InternalXDrone.g:432:2: (this_Wait_0= ruleWait | this_Move_1= ruleMove | this_Rotate_2= ruleRotate | this_GoTo_3= ruleGoTo )
            {
            // InternalXDrone.g:432:2: (this_Wait_0= ruleWait | this_Move_1= ruleMove | this_Rotate_2= ruleRotate | this_GoTo_3= ruleGoTo )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalXDrone.g:433:3: this_Wait_0= ruleWait
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getWaitParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wait_0=ruleWait();

                    state._fsp--;


                    			current = this_Wait_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXDrone.g:442:3: this_Move_1= ruleMove
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getMoveParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Move_1=ruleMove();

                    state._fsp--;


                    			current = this_Move_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXDrone.g:451:3: this_Rotate_2= ruleRotate
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRotateParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rotate_2=ruleRotate();

                    state._fsp--;


                    			current = this_Rotate_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXDrone.g:460:3: this_GoTo_3= ruleGoTo
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getGoToParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_GoTo_3=ruleGoTo();

                    state._fsp--;


                    			current = this_GoTo_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalXDrone.g:472:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalXDrone.g:472:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalXDrone.g:473:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalXDrone.g:479:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE ) | this_POSITIVE_DOUBLE_2= rulePOSITIVE_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_POSITIVE_DOUBLE_1 = null;

        AntlrDatatypeRuleToken this_POSITIVE_DOUBLE_2 = null;



        	enterRule();

        try {
            // InternalXDrone.g:485:2: ( ( (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE ) | this_POSITIVE_DOUBLE_2= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:486:2: ( (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE ) | this_POSITIVE_DOUBLE_2= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:486:2: ( (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE ) | this_POSITIVE_DOUBLE_2= rulePOSITIVE_DOUBLE )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_INT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXDrone.g:487:3: (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE )
                    {
                    // InternalXDrone.g:487:3: (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE )
                    // InternalXDrone.g:488:4: kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE
                    {
                    kw=(Token)match(input,16,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getDOUBLEAccess().getPOSITIVE_DOUBLEParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_POSITIVE_DOUBLE_1=rulePOSITIVE_DOUBLE();

                    state._fsp--;


                    				current.merge(this_POSITIVE_DOUBLE_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:505:3: this_POSITIVE_DOUBLE_2= rulePOSITIVE_DOUBLE
                    {

                    			newCompositeNode(grammarAccess.getDOUBLEAccess().getPOSITIVE_DOUBLEParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_POSITIVE_DOUBLE_2=rulePOSITIVE_DOUBLE();

                    state._fsp--;


                    			current.merge(this_POSITIVE_DOUBLE_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRulePOSITIVE_DOUBLE"
    // InternalXDrone.g:519:1: entryRulePOSITIVE_DOUBLE returns [String current=null] : iv_rulePOSITIVE_DOUBLE= rulePOSITIVE_DOUBLE EOF ;
    public final String entryRulePOSITIVE_DOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePOSITIVE_DOUBLE = null;


        try {
            // InternalXDrone.g:519:55: (iv_rulePOSITIVE_DOUBLE= rulePOSITIVE_DOUBLE EOF )
            // InternalXDrone.g:520:2: iv_rulePOSITIVE_DOUBLE= rulePOSITIVE_DOUBLE EOF
            {
             newCompositeNode(grammarAccess.getPOSITIVE_DOUBLERule()); 
            pushFollow(FOLLOW_1);
            iv_rulePOSITIVE_DOUBLE=rulePOSITIVE_DOUBLE();

            state._fsp--;

             current =iv_rulePOSITIVE_DOUBLE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePOSITIVE_DOUBLE"


    // $ANTLR start "rulePOSITIVE_DOUBLE"
    // InternalXDrone.g:526:1: rulePOSITIVE_DOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulePOSITIVE_DOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:532:2: ( ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT ) )
            // InternalXDrone.g:533:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT )
            {
            // InternalXDrone.g:533:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==17) ) {
                    alt7=1;
                }
                else if ( (LA7_1==EOF||LA7_1==RULE_ID||LA7_1==12||LA7_1==20||LA7_1==25||LA7_1==27||(LA7_1>=31 && LA7_1<=32)||LA7_1==34||(LA7_1>=36 && LA7_1<=39)) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalXDrone.g:534:3: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
                    {
                    // InternalXDrone.g:534:3: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
                    // InternalXDrone.g:535:4: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_9); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getPOSITIVE_DOUBLEAccess().getINTTerminalRuleCall_0_0());
                    			
                    kw=(Token)match(input,17,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPOSITIVE_DOUBLEAccess().getFullStopKeyword_0_1());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getPOSITIVE_DOUBLEAccess().getINTTerminalRuleCall_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:556:3: this_INT_3= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_3);
                    		

                    			newLeafNode(this_INT_3, grammarAccess.getPOSITIVE_DOUBLEAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePOSITIVE_DOUBLE"


    // $ANTLR start "entryRuleGoTo"
    // InternalXDrone.g:567:1: entryRuleGoTo returns [EObject current=null] : iv_ruleGoTo= ruleGoTo EOF ;
    public final EObject entryRuleGoTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoTo = null;


        try {
            // InternalXDrone.g:567:45: (iv_ruleGoTo= ruleGoTo EOF )
            // InternalXDrone.g:568:2: iv_ruleGoTo= ruleGoTo EOF
            {
             newCompositeNode(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoTo=ruleGoTo();

            state._fsp--;

             current =iv_ruleGoTo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoTo"


    // $ANTLR start "ruleGoTo"
    // InternalXDrone.g:574:1: ruleGoTo returns [EObject current=null] : (otherlv_0= 'GOTO' otherlv_1= '(' ( (lv_object_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleGoTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_object_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:580:2: ( (otherlv_0= 'GOTO' otherlv_1= '(' ( (lv_object_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:581:2: (otherlv_0= 'GOTO' otherlv_1= '(' ( (lv_object_name_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:581:2: (otherlv_0= 'GOTO' otherlv_1= '(' ( (lv_object_name_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalXDrone.g:582:3: otherlv_0= 'GOTO' otherlv_1= '(' ( (lv_object_name_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getGoToAccess().getGOTOKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getGoToAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:590:3: ( (lv_object_name_2_0= RULE_STRING ) )
            // InternalXDrone.g:591:4: (lv_object_name_2_0= RULE_STRING )
            {
            // InternalXDrone.g:591:4: (lv_object_name_2_0= RULE_STRING )
            // InternalXDrone.g:592:5: lv_object_name_2_0= RULE_STRING
            {
            lv_object_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_object_name_2_0, grammarAccess.getGoToAccess().getObject_nameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoToRule());
            					}
            					setWithLastConsumed(
            						current,
            						"object_name",
            						lv_object_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getGoToAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "entryRuleMove"
    // InternalXDrone.g:616:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalXDrone.g:616:45: (iv_ruleMove= ruleMove EOF )
            // InternalXDrone.g:617:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalXDrone.g:623:1: ruleMove returns [EObject current=null] : (otherlv_0= 'MOVE' ( (lv_vector_1_0= ruleVector ) ) ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_vector_1_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:629:2: ( (otherlv_0= 'MOVE' ( (lv_vector_1_0= ruleVector ) ) ) )
            // InternalXDrone.g:630:2: (otherlv_0= 'MOVE' ( (lv_vector_1_0= ruleVector ) ) )
            {
            // InternalXDrone.g:630:2: (otherlv_0= 'MOVE' ( (lv_vector_1_0= ruleVector ) ) )
            // InternalXDrone.g:631:3: otherlv_0= 'MOVE' ( (lv_vector_1_0= ruleVector ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMOVEKeyword_0());
            		
            // InternalXDrone.g:635:3: ( (lv_vector_1_0= ruleVector ) )
            // InternalXDrone.g:636:4: (lv_vector_1_0= ruleVector )
            {
            // InternalXDrone.g:636:4: (lv_vector_1_0= ruleVector )
            // InternalXDrone.g:637:5: lv_vector_1_0= ruleVector
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getVectorVectorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_vector_1_0=ruleVector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"vector",
            						lv_vector_1_0,
            						"ic.ac.uk.xdrone.XDrone.Vector");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleRotate"
    // InternalXDrone.g:658:1: entryRuleRotate returns [EObject current=null] : iv_ruleRotate= ruleRotate EOF ;
    public final EObject entryRuleRotate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotate = null;


        try {
            // InternalXDrone.g:658:47: (iv_ruleRotate= ruleRotate EOF )
            // InternalXDrone.g:659:2: iv_ruleRotate= ruleRotate EOF
            {
             newCompositeNode(grammarAccess.getRotateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotate=ruleRotate();

            state._fsp--;

             current =iv_ruleRotate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRotate"


    // $ANTLR start "ruleRotate"
    // InternalXDrone.g:665:1: ruleRotate returns [EObject current=null] : (otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_angle_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleRotate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_angle_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:671:2: ( (otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_angle_2_0= ruleDOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:672:2: (otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_angle_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:672:2: (otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_angle_2_0= ruleDOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:673:3: otherlv_0= 'ROTATE' otherlv_1= '(' ( (lv_angle_2_0= ruleDOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateAccess().getROTATEKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:681:3: ( (lv_angle_2_0= ruleDOUBLE ) )
            // InternalXDrone.g:682:4: (lv_angle_2_0= ruleDOUBLE )
            {
            // InternalXDrone.g:682:4: (lv_angle_2_0= ruleDOUBLE )
            // InternalXDrone.g:683:5: lv_angle_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getRotateAccess().getAngleDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_angle_2_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateRule());
            					}
            					set(
            						current,
            						"angle",
            						lv_angle_2_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRotate"


    // $ANTLR start "entryRuleWait"
    // InternalXDrone.g:708:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalXDrone.g:708:45: (iv_ruleWait= ruleWait EOF )
            // InternalXDrone.g:709:2: iv_ruleWait= ruleWait EOF
            {
             newCompositeNode(grammarAccess.getWaitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWait=ruleWait();

            state._fsp--;

             current =iv_ruleWait; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // InternalXDrone.g:715:1: ruleWait returns [EObject current=null] : (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_seconds_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:721:2: ( (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:722:2: (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:722:2: (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:723:3: otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getWaitAccess().getWAITKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:731:3: ( (lv_seconds_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:732:4: (lv_seconds_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:732:4: (lv_seconds_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:733:5: lv_seconds_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getWaitAccess().getSecondsPOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_seconds_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWaitRule());
            					}
            					set(
            						current,
            						"seconds",
            						lv_seconds_2_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getWaitAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleFunctionName"
    // InternalXDrone.g:758:1: entryRuleFunctionName returns [EObject current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final EObject entryRuleFunctionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionName = null;


        try {
            // InternalXDrone.g:758:53: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalXDrone.g:759:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
             newCompositeNode(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionName=ruleFunctionName();

            state._fsp--;

             current =iv_ruleFunctionName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // InternalXDrone.g:765:1: ruleFunctionName returns [EObject current=null] : ( ( (lv_func_name_0_0= RULE_ID ) ) otherlv_1= '()' ) ;
    public final EObject ruleFunctionName() throws RecognitionException {
        EObject current = null;

        Token lv_func_name_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalXDrone.g:771:2: ( ( ( (lv_func_name_0_0= RULE_ID ) ) otherlv_1= '()' ) )
            // InternalXDrone.g:772:2: ( ( (lv_func_name_0_0= RULE_ID ) ) otherlv_1= '()' )
            {
            // InternalXDrone.g:772:2: ( ( (lv_func_name_0_0= RULE_ID ) ) otherlv_1= '()' )
            // InternalXDrone.g:773:3: ( (lv_func_name_0_0= RULE_ID ) ) otherlv_1= '()'
            {
            // InternalXDrone.g:773:3: ( (lv_func_name_0_0= RULE_ID ) )
            // InternalXDrone.g:774:4: (lv_func_name_0_0= RULE_ID )
            {
            // InternalXDrone.g:774:4: (lv_func_name_0_0= RULE_ID )
            // InternalXDrone.g:775:5: lv_func_name_0_0= RULE_ID
            {
            lv_func_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_func_name_0_0, grammarAccess.getFunctionNameAccess().getFunc_nameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionNameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"func_name",
            						lv_func_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionNameAccess().getLeftParenthesisRightParenthesisKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleDrone"
    // InternalXDrone.g:799:1: entryRuleDrone returns [EObject current=null] : iv_ruleDrone= ruleDrone EOF ;
    public final EObject entryRuleDrone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrone = null;


        try {
            // InternalXDrone.g:799:46: (iv_ruleDrone= ruleDrone EOF )
            // InternalXDrone.g:800:2: iv_ruleDrone= ruleDrone EOF
            {
             newCompositeNode(grammarAccess.getDroneRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDrone=ruleDrone();

            state._fsp--;

             current =iv_ruleDrone; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDrone"


    // $ANTLR start "ruleDrone"
    // InternalXDrone.g:806:1: ruleDrone returns [EObject current=null] : (otherlv_0= 'DRONE' otherlv_1= '{' ( ( (lv_position_2_0= rulePosition ) ) | (otherlv_3= 'rotation' otherlv_4= '=' ( (lv_rotation_5_0= ruleDOUBLE ) ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleDrone() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_position_2_0 = null;

        AntlrDatatypeRuleToken lv_rotation_5_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:812:2: ( (otherlv_0= 'DRONE' otherlv_1= '{' ( ( (lv_position_2_0= rulePosition ) ) | (otherlv_3= 'rotation' otherlv_4= '=' ( (lv_rotation_5_0= ruleDOUBLE ) ) ) )* otherlv_6= '}' ) )
            // InternalXDrone.g:813:2: (otherlv_0= 'DRONE' otherlv_1= '{' ( ( (lv_position_2_0= rulePosition ) ) | (otherlv_3= 'rotation' otherlv_4= '=' ( (lv_rotation_5_0= ruleDOUBLE ) ) ) )* otherlv_6= '}' )
            {
            // InternalXDrone.g:813:2: (otherlv_0= 'DRONE' otherlv_1= '{' ( ( (lv_position_2_0= rulePosition ) ) | (otherlv_3= 'rotation' otherlv_4= '=' ( (lv_rotation_5_0= ruleDOUBLE ) ) ) )* otherlv_6= '}' )
            // InternalXDrone.g:814:3: otherlv_0= 'DRONE' otherlv_1= '{' ( ( (lv_position_2_0= rulePosition ) ) | (otherlv_3= 'rotation' otherlv_4= '=' ( (lv_rotation_5_0= ruleDOUBLE ) ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getDroneAccess().getDRONEKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXDrone.g:822:3: ( ( (lv_position_2_0= rulePosition ) ) | (otherlv_3= 'rotation' otherlv_4= '=' ( (lv_rotation_5_0= ruleDOUBLE ) ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==31) ) {
                    alt8=1;
                }
                else if ( (LA8_0==27) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalXDrone.g:823:4: ( (lv_position_2_0= rulePosition ) )
            	    {
            	    // InternalXDrone.g:823:4: ( (lv_position_2_0= rulePosition ) )
            	    // InternalXDrone.g:824:5: (lv_position_2_0= rulePosition )
            	    {
            	    // InternalXDrone.g:824:5: (lv_position_2_0= rulePosition )
            	    // InternalXDrone.g:825:6: lv_position_2_0= rulePosition
            	    {

            	    						newCompositeNode(grammarAccess.getDroneAccess().getPositionPositionParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_position_2_0=rulePosition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDroneRule());
            	    						}
            	    						set(
            	    							current,
            	    							"position",
            	    							lv_position_2_0,
            	    							"ic.ac.uk.xdrone.XDrone.Position");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDrone.g:843:4: (otherlv_3= 'rotation' otherlv_4= '=' ( (lv_rotation_5_0= ruleDOUBLE ) ) )
            	    {
            	    // InternalXDrone.g:843:4: (otherlv_3= 'rotation' otherlv_4= '=' ( (lv_rotation_5_0= ruleDOUBLE ) ) )
            	    // InternalXDrone.g:844:5: otherlv_3= 'rotation' otherlv_4= '=' ( (lv_rotation_5_0= ruleDOUBLE ) )
            	    {
            	    otherlv_3=(Token)match(input,27,FOLLOW_17); 

            	    					newLeafNode(otherlv_3, grammarAccess.getDroneAccess().getRotationKeyword_2_1_0());
            	    				
            	    otherlv_4=(Token)match(input,28,FOLLOW_13); 

            	    					newLeafNode(otherlv_4, grammarAccess.getDroneAccess().getEqualsSignKeyword_2_1_1());
            	    				
            	    // InternalXDrone.g:852:5: ( (lv_rotation_5_0= ruleDOUBLE ) )
            	    // InternalXDrone.g:853:6: (lv_rotation_5_0= ruleDOUBLE )
            	    {
            	    // InternalXDrone.g:853:6: (lv_rotation_5_0= ruleDOUBLE )
            	    // InternalXDrone.g:854:7: lv_rotation_5_0= ruleDOUBLE
            	    {

            	    							newCompositeNode(grammarAccess.getDroneAccess().getRotationDOUBLEParserRuleCall_2_1_2_0());
            	    						
            	    pushFollow(FOLLOW_16);
            	    lv_rotation_5_0=ruleDOUBLE();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getDroneRule());
            	    							}
            	    							set(
            	    								current,
            	    								"rotation",
            	    								lv_rotation_5_0,
            	    								"ic.ac.uk.xdrone.XDrone.DOUBLE");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDrone"


    // $ANTLR start "entryRuleObject"
    // InternalXDrone.g:881:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalXDrone.g:881:47: (iv_ruleObject= ruleObject EOF )
            // InternalXDrone.g:882:2: iv_ruleObject= ruleObject EOF
            {
             newCompositeNode(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObject=ruleObject();

            state._fsp--;

             current =iv_ruleObject; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalXDrone.g:888:1: ruleObject returns [EObject current=null] : ( ( (lv_object_name_0_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_origin_2_0= ruleOrigin ) ) | ( (lv_size_3_0= ruleSize ) ) | ( (lv_color_4_0= ruleColor ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_object_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_origin_2_0 = null;

        EObject lv_size_3_0 = null;

        EObject lv_color_4_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:894:2: ( ( ( (lv_object_name_0_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_origin_2_0= ruleOrigin ) ) | ( (lv_size_3_0= ruleSize ) ) | ( (lv_color_4_0= ruleColor ) ) )* otherlv_5= '}' ) )
            // InternalXDrone.g:895:2: ( ( (lv_object_name_0_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_origin_2_0= ruleOrigin ) ) | ( (lv_size_3_0= ruleSize ) ) | ( (lv_color_4_0= ruleColor ) ) )* otherlv_5= '}' )
            {
            // InternalXDrone.g:895:2: ( ( (lv_object_name_0_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_origin_2_0= ruleOrigin ) ) | ( (lv_size_3_0= ruleSize ) ) | ( (lv_color_4_0= ruleColor ) ) )* otherlv_5= '}' )
            // InternalXDrone.g:896:3: ( (lv_object_name_0_0= RULE_ID ) ) otherlv_1= '{' ( ( (lv_origin_2_0= ruleOrigin ) ) | ( (lv_size_3_0= ruleSize ) ) | ( (lv_color_4_0= ruleColor ) ) )* otherlv_5= '}'
            {
            // InternalXDrone.g:896:3: ( (lv_object_name_0_0= RULE_ID ) )
            // InternalXDrone.g:897:4: (lv_object_name_0_0= RULE_ID )
            {
            // InternalXDrone.g:897:4: (lv_object_name_0_0= RULE_ID )
            // InternalXDrone.g:898:5: lv_object_name_0_0= RULE_ID
            {
            lv_object_name_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_object_name_0_0, grammarAccess.getObjectAccess().getObject_nameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"object_name",
            						lv_object_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalXDrone.g:918:3: ( ( (lv_origin_2_0= ruleOrigin ) ) | ( (lv_size_3_0= ruleSize ) ) | ( (lv_color_4_0= ruleColor ) ) )*
            loop9:
            do {
                int alt9=4;
                switch ( input.LA(1) ) {
                case 29:
                    {
                    alt9=1;
                    }
                    break;
                case 30:
                    {
                    alt9=2;
                    }
                    break;
                case 33:
                    {
                    alt9=3;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // InternalXDrone.g:919:4: ( (lv_origin_2_0= ruleOrigin ) )
            	    {
            	    // InternalXDrone.g:919:4: ( (lv_origin_2_0= ruleOrigin ) )
            	    // InternalXDrone.g:920:5: (lv_origin_2_0= ruleOrigin )
            	    {
            	    // InternalXDrone.g:920:5: (lv_origin_2_0= ruleOrigin )
            	    // InternalXDrone.g:921:6: lv_origin_2_0= ruleOrigin
            	    {

            	    						newCompositeNode(grammarAccess.getObjectAccess().getOriginOriginParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_origin_2_0=ruleOrigin();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getObjectRule());
            	    						}
            	    						set(
            	    							current,
            	    							"origin",
            	    							lv_origin_2_0,
            	    							"ic.ac.uk.xdrone.XDrone.Origin");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDrone.g:939:4: ( (lv_size_3_0= ruleSize ) )
            	    {
            	    // InternalXDrone.g:939:4: ( (lv_size_3_0= ruleSize ) )
            	    // InternalXDrone.g:940:5: (lv_size_3_0= ruleSize )
            	    {
            	    // InternalXDrone.g:940:5: (lv_size_3_0= ruleSize )
            	    // InternalXDrone.g:941:6: lv_size_3_0= ruleSize
            	    {

            	    						newCompositeNode(grammarAccess.getObjectAccess().getSizeSizeParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_size_3_0=ruleSize();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getObjectRule());
            	    						}
            	    						set(
            	    							current,
            	    							"size",
            	    							lv_size_3_0,
            	    							"ic.ac.uk.xdrone.XDrone.Size");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDrone.g:959:4: ( (lv_color_4_0= ruleColor ) )
            	    {
            	    // InternalXDrone.g:959:4: ( (lv_color_4_0= ruleColor ) )
            	    // InternalXDrone.g:960:5: (lv_color_4_0= ruleColor )
            	    {
            	    // InternalXDrone.g:960:5: (lv_color_4_0= ruleColor )
            	    // InternalXDrone.g:961:6: lv_color_4_0= ruleColor
            	    {

            	    						newCompositeNode(grammarAccess.getObjectAccess().getColorColorParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_color_4_0=ruleColor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getObjectRule());
            	    						}
            	    						set(
            	    							current,
            	    							"color",
            	    							lv_color_4_0,
            	    							"ic.ac.uk.xdrone.XDrone.Color");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleOrigin"
    // InternalXDrone.g:987:1: entryRuleOrigin returns [EObject current=null] : iv_ruleOrigin= ruleOrigin EOF ;
    public final EObject entryRuleOrigin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrigin = null;


        try {
            // InternalXDrone.g:987:47: (iv_ruleOrigin= ruleOrigin EOF )
            // InternalXDrone.g:988:2: iv_ruleOrigin= ruleOrigin EOF
            {
             newCompositeNode(grammarAccess.getOriginRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrigin=ruleOrigin();

            state._fsp--;

             current =iv_ruleOrigin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrigin"


    // $ANTLR start "ruleOrigin"
    // InternalXDrone.g:994:1: ruleOrigin returns [EObject current=null] : (otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) ;
    public final EObject ruleOrigin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vector_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1000:2: ( (otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) )
            // InternalXDrone.g:1001:2: (otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            {
            // InternalXDrone.g:1001:2: (otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            // InternalXDrone.g:1002:3: otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getOriginAccess().getOriginKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getOriginAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1010:3: ( (lv_vector_2_0= ruleVector ) )
            // InternalXDrone.g:1011:4: (lv_vector_2_0= ruleVector )
            {
            // InternalXDrone.g:1011:4: (lv_vector_2_0= ruleVector )
            // InternalXDrone.g:1012:5: lv_vector_2_0= ruleVector
            {

            					newCompositeNode(grammarAccess.getOriginAccess().getVectorVectorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_vector_2_0=ruleVector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOriginRule());
            					}
            					set(
            						current,
            						"vector",
            						lv_vector_2_0,
            						"ic.ac.uk.xdrone.XDrone.Vector");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrigin"


    // $ANTLR start "entryRuleSize"
    // InternalXDrone.g:1033:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalXDrone.g:1033:45: (iv_ruleSize= ruleSize EOF )
            // InternalXDrone.g:1034:2: iv_ruleSize= ruleSize EOF
            {
             newCompositeNode(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSize=ruleSize();

            state._fsp--;

             current =iv_ruleSize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // InternalXDrone.g:1040:1: ruleSize returns [EObject current=null] : (otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vector_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1046:2: ( (otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) )
            // InternalXDrone.g:1047:2: (otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            {
            // InternalXDrone.g:1047:2: (otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            // InternalXDrone.g:1048:3: otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1056:3: ( (lv_vector_2_0= ruleVector ) )
            // InternalXDrone.g:1057:4: (lv_vector_2_0= ruleVector )
            {
            // InternalXDrone.g:1057:4: (lv_vector_2_0= ruleVector )
            // InternalXDrone.g:1058:5: lv_vector_2_0= ruleVector
            {

            					newCompositeNode(grammarAccess.getSizeAccess().getVectorVectorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_vector_2_0=ruleVector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSizeRule());
            					}
            					set(
            						current,
            						"vector",
            						lv_vector_2_0,
            						"ic.ac.uk.xdrone.XDrone.Vector");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRulePosition"
    // InternalXDrone.g:1079:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalXDrone.g:1079:49: (iv_rulePosition= rulePosition EOF )
            // InternalXDrone.g:1080:2: iv_rulePosition= rulePosition EOF
            {
             newCompositeNode(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePosition=rulePosition();

            state._fsp--;

             current =iv_rulePosition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalXDrone.g:1086:1: rulePosition returns [EObject current=null] : (otherlv_0= 'position' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vector_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1092:2: ( (otherlv_0= 'position' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) )
            // InternalXDrone.g:1093:2: (otherlv_0= 'position' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            {
            // InternalXDrone.g:1093:2: (otherlv_0= 'position' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            // InternalXDrone.g:1094:3: otherlv_0= 'position' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getPositionAccess().getPositionKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getPositionAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1102:3: ( (lv_vector_2_0= ruleVector ) )
            // InternalXDrone.g:1103:4: (lv_vector_2_0= ruleVector )
            {
            // InternalXDrone.g:1103:4: (lv_vector_2_0= ruleVector )
            // InternalXDrone.g:1104:5: lv_vector_2_0= ruleVector
            {

            					newCompositeNode(grammarAccess.getPositionAccess().getVectorVectorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_vector_2_0=ruleVector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositionRule());
            					}
            					set(
            						current,
            						"vector",
            						lv_vector_2_0,
            						"ic.ac.uk.xdrone.XDrone.Vector");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleVector"
    // InternalXDrone.g:1125:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // InternalXDrone.g:1125:47: (iv_ruleVector= ruleVector EOF )
            // InternalXDrone.g:1126:2: iv_ruleVector= ruleVector EOF
            {
             newCompositeNode(grammarAccess.getVectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVector=ruleVector();

            state._fsp--;

             current =iv_ruleVector; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVector"


    // $ANTLR start "ruleVector"
    // InternalXDrone.g:1132:1: ruleVector returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' ) ;
    public final EObject ruleVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_x_1_0 = null;

        AntlrDatatypeRuleToken lv_y_3_0 = null;

        AntlrDatatypeRuleToken lv_z_5_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1138:2: ( (otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' ) )
            // InternalXDrone.g:1139:2: (otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' )
            {
            // InternalXDrone.g:1139:2: (otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' )
            // InternalXDrone.g:1140:3: otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getLeftParenthesisKeyword_0());
            		
            // InternalXDrone.g:1144:3: ( (lv_x_1_0= ruleDOUBLE ) )
            // InternalXDrone.g:1145:4: (lv_x_1_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1145:4: (lv_x_1_0= ruleDOUBLE )
            // InternalXDrone.g:1146:5: lv_x_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getVectorAccess().getXDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_19);
            lv_x_1_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVectorRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_1_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getVectorAccess().getCommaKeyword_2());
            		
            // InternalXDrone.g:1167:3: ( (lv_y_3_0= ruleDOUBLE ) )
            // InternalXDrone.g:1168:4: (lv_y_3_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1168:4: (lv_y_3_0= ruleDOUBLE )
            // InternalXDrone.g:1169:5: lv_y_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getVectorAccess().getYDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_y_3_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVectorRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_3_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getVectorAccess().getCommaKeyword_4());
            		
            // InternalXDrone.g:1190:3: ( (lv_z_5_0= ruleDOUBLE ) )
            // InternalXDrone.g:1191:4: (lv_z_5_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1191:4: (lv_z_5_0= ruleDOUBLE )
            // InternalXDrone.g:1192:5: lv_z_5_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getVectorAccess().getZDOUBLEParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_z_5_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVectorRule());
            					}
            					set(
            						current,
            						"z",
            						lv_z_5_0,
            						"ic.ac.uk.xdrone.XDrone.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getVectorAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVector"


    // $ANTLR start "entryRuleColor"
    // InternalXDrone.g:1217:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalXDrone.g:1217:46: (iv_ruleColor= ruleColor EOF )
            // InternalXDrone.g:1218:2: iv_ruleColor= ruleColor EOF
            {
             newCompositeNode(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColor=ruleColor();

            state._fsp--;

             current =iv_ruleColor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalXDrone.g:1224:1: ruleColor returns [EObject current=null] : (otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_color_value_2_0=null;


        	enterRule();

        try {
            // InternalXDrone.g:1230:2: ( (otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) ) ) )
            // InternalXDrone.g:1231:2: (otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) ) )
            {
            // InternalXDrone.g:1231:2: (otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) ) )
            // InternalXDrone.g:1232:3: otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getColorAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1240:3: ( (lv_color_value_2_0= RULE_STRING ) )
            // InternalXDrone.g:1241:4: (lv_color_value_2_0= RULE_STRING )
            {
            // InternalXDrone.g:1241:4: (lv_color_value_2_0= RULE_STRING )
            // InternalXDrone.g:1242:5: lv_color_value_2_0= RULE_STRING
            {
            lv_color_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_color_value_2_0, grammarAccess.getColorAccess().getColor_valueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"color_value",
            						lv_color_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleWalls"
    // InternalXDrone.g:1262:1: entryRuleWalls returns [EObject current=null] : iv_ruleWalls= ruleWalls EOF ;
    public final EObject entryRuleWalls() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWalls = null;


        try {
            // InternalXDrone.g:1262:46: (iv_ruleWalls= ruleWalls EOF )
            // InternalXDrone.g:1263:2: iv_ruleWalls= ruleWalls EOF
            {
             newCompositeNode(grammarAccess.getWallsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWalls=ruleWalls();

            state._fsp--;

             current =iv_ruleWalls; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWalls"


    // $ANTLR start "ruleWalls"
    // InternalXDrone.g:1269:1: ruleWalls returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'WALLS' otherlv_2= '{' ( (lv_front_3_0= ruleFront ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_4_0= ruleRight ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_back_5_0= ruleBack ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_left_6_0= ruleLeft ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_up_7_0= ruleUp ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleWalls() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_8=null;
        EObject lv_front_3_0 = null;

        EObject lv_right_4_0 = null;

        EObject lv_back_5_0 = null;

        EObject lv_left_6_0 = null;

        EObject lv_up_7_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1275:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'WALLS' otherlv_2= '{' ( (lv_front_3_0= ruleFront ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_4_0= ruleRight ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_back_5_0= ruleBack ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_left_6_0= ruleLeft ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_up_7_0= ruleUp ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalXDrone.g:1276:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'WALLS' otherlv_2= '{' ( (lv_front_3_0= ruleFront ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_4_0= ruleRight ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_back_5_0= ruleBack ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_left_6_0= ruleLeft ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_up_7_0= ruleUp ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalXDrone.g:1276:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'WALLS' otherlv_2= '{' ( (lv_front_3_0= ruleFront ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_4_0= ruleRight ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_back_5_0= ruleBack ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_left_6_0= ruleLeft ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_up_7_0= ruleUp ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) ) )
            // InternalXDrone.g:1277:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'WALLS' otherlv_2= '{' ( (lv_front_3_0= ruleFront ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_4_0= ruleRight ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_back_5_0= ruleBack ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_left_6_0= ruleLeft ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_up_7_0= ruleUp ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalXDrone.g:1277:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'WALLS' otherlv_2= '{' ( (lv_front_3_0= ruleFront ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_4_0= ruleRight ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_back_5_0= ruleBack ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_left_6_0= ruleLeft ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_up_7_0= ruleUp ) ) otherlv_8= '}' ) ) ) ) )+ {...}?) )
            // InternalXDrone.g:1278:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'WALLS' otherlv_2= '{' ( (lv_front_3_0= ruleFront ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_4_0= ruleRight ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_back_5_0= ruleBack ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_left_6_0= ruleLeft ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_up_7_0= ruleUp ) ) otherlv_8= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getWallsAccess().getUnorderedGroup());
            			
            // InternalXDrone.g:1281:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'WALLS' otherlv_2= '{' ( (lv_front_3_0= ruleFront ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_4_0= ruleRight ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_back_5_0= ruleBack ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_left_6_0= ruleLeft ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_up_7_0= ruleUp ) ) otherlv_8= '}' ) ) ) ) )+ {...}?)
            // InternalXDrone.g:1282:5: ( ({...}? => ( ({...}? => (otherlv_1= 'WALLS' otherlv_2= '{' ( (lv_front_3_0= ruleFront ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_4_0= ruleRight ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_back_5_0= ruleBack ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_left_6_0= ruleLeft ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_up_7_0= ruleUp ) ) otherlv_8= '}' ) ) ) ) )+ {...}?
            {
            // InternalXDrone.g:1282:5: ( ({...}? => ( ({...}? => (otherlv_1= 'WALLS' otherlv_2= '{' ( (lv_front_3_0= ruleFront ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_4_0= ruleRight ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_back_5_0= ruleBack ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_left_6_0= ruleLeft ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_up_7_0= ruleUp ) ) otherlv_8= '}' ) ) ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=6;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalXDrone.g:1283:3: ({...}? => ( ({...}? => (otherlv_1= 'WALLS' otherlv_2= '{' ( (lv_front_3_0= ruleFront ) ) ) ) ) )
            	    {
            	    // InternalXDrone.g:1283:3: ({...}? => ( ({...}? => (otherlv_1= 'WALLS' otherlv_2= '{' ( (lv_front_3_0= ruleFront ) ) ) ) ) )
            	    // InternalXDrone.g:1284:4: {...}? => ( ({...}? => (otherlv_1= 'WALLS' otherlv_2= '{' ( (lv_front_3_0= ruleFront ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleWalls", "getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalXDrone.g:1284:99: ( ({...}? => (otherlv_1= 'WALLS' otherlv_2= '{' ( (lv_front_3_0= ruleFront ) ) ) ) )
            	    // InternalXDrone.g:1285:5: ({...}? => (otherlv_1= 'WALLS' otherlv_2= '{' ( (lv_front_3_0= ruleFront ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getWallsAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalXDrone.g:1288:8: ({...}? => (otherlv_1= 'WALLS' otherlv_2= '{' ( (lv_front_3_0= ruleFront ) ) ) )
            	    // InternalXDrone.g:1288:9: {...}? => (otherlv_1= 'WALLS' otherlv_2= '{' ( (lv_front_3_0= ruleFront ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleWalls", "true");
            	    }
            	    // InternalXDrone.g:1288:18: (otherlv_1= 'WALLS' otherlv_2= '{' ( (lv_front_3_0= ruleFront ) ) )
            	    // InternalXDrone.g:1288:19: otherlv_1= 'WALLS' otherlv_2= '{' ( (lv_front_3_0= ruleFront ) )
            	    {
            	    otherlv_1=(Token)match(input,34,FOLLOW_15); 

            	    								newLeafNode(otherlv_1, grammarAccess.getWallsAccess().getWALLSKeyword_0_0());
            	    							
            	    otherlv_2=(Token)match(input,26,FOLLOW_20); 

            	    								newLeafNode(otherlv_2, grammarAccess.getWallsAccess().getLeftCurlyBracketKeyword_0_1());
            	    							
            	    // InternalXDrone.g:1296:8: ( (lv_front_3_0= ruleFront ) )
            	    // InternalXDrone.g:1297:9: (lv_front_3_0= ruleFront )
            	    {
            	    // InternalXDrone.g:1297:9: (lv_front_3_0= ruleFront )
            	    // InternalXDrone.g:1298:10: lv_front_3_0= ruleFront
            	    {

            	    										newCompositeNode(grammarAccess.getWallsAccess().getFrontFrontParserRuleCall_0_2_0());
            	    									
            	    pushFollow(FOLLOW_21);
            	    lv_front_3_0=ruleFront();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getWallsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"front",
            	    											lv_front_3_0,
            	    											"ic.ac.uk.xdrone.XDrone.Front");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWallsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDrone.g:1321:3: ({...}? => ( ({...}? => ( (lv_right_4_0= ruleRight ) ) ) ) )
            	    {
            	    // InternalXDrone.g:1321:3: ({...}? => ( ({...}? => ( (lv_right_4_0= ruleRight ) ) ) ) )
            	    // InternalXDrone.g:1322:4: {...}? => ( ({...}? => ( (lv_right_4_0= ruleRight ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleWalls", "getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalXDrone.g:1322:99: ( ({...}? => ( (lv_right_4_0= ruleRight ) ) ) )
            	    // InternalXDrone.g:1323:5: ({...}? => ( (lv_right_4_0= ruleRight ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getWallsAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalXDrone.g:1326:8: ({...}? => ( (lv_right_4_0= ruleRight ) ) )
            	    // InternalXDrone.g:1326:9: {...}? => ( (lv_right_4_0= ruleRight ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleWalls", "true");
            	    }
            	    // InternalXDrone.g:1326:18: ( (lv_right_4_0= ruleRight ) )
            	    // InternalXDrone.g:1326:19: (lv_right_4_0= ruleRight )
            	    {
            	    // InternalXDrone.g:1326:19: (lv_right_4_0= ruleRight )
            	    // InternalXDrone.g:1327:9: lv_right_4_0= ruleRight
            	    {

            	    									newCompositeNode(grammarAccess.getWallsAccess().getRightRightParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_21);
            	    lv_right_4_0=ruleRight();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getWallsRule());
            	    									}
            	    									set(
            	    										current,
            	    										"right",
            	    										lv_right_4_0,
            	    										"ic.ac.uk.xdrone.XDrone.Right");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWallsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDrone.g:1349:3: ({...}? => ( ({...}? => ( (lv_back_5_0= ruleBack ) ) ) ) )
            	    {
            	    // InternalXDrone.g:1349:3: ({...}? => ( ({...}? => ( (lv_back_5_0= ruleBack ) ) ) ) )
            	    // InternalXDrone.g:1350:4: {...}? => ( ({...}? => ( (lv_back_5_0= ruleBack ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleWalls", "getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalXDrone.g:1350:99: ( ({...}? => ( (lv_back_5_0= ruleBack ) ) ) )
            	    // InternalXDrone.g:1351:5: ({...}? => ( (lv_back_5_0= ruleBack ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getWallsAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalXDrone.g:1354:8: ({...}? => ( (lv_back_5_0= ruleBack ) ) )
            	    // InternalXDrone.g:1354:9: {...}? => ( (lv_back_5_0= ruleBack ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleWalls", "true");
            	    }
            	    // InternalXDrone.g:1354:18: ( (lv_back_5_0= ruleBack ) )
            	    // InternalXDrone.g:1354:19: (lv_back_5_0= ruleBack )
            	    {
            	    // InternalXDrone.g:1354:19: (lv_back_5_0= ruleBack )
            	    // InternalXDrone.g:1355:9: lv_back_5_0= ruleBack
            	    {

            	    									newCompositeNode(grammarAccess.getWallsAccess().getBackBackParserRuleCall_2_0());
            	    								
            	    pushFollow(FOLLOW_21);
            	    lv_back_5_0=ruleBack();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getWallsRule());
            	    									}
            	    									set(
            	    										current,
            	    										"back",
            	    										lv_back_5_0,
            	    										"ic.ac.uk.xdrone.XDrone.Back");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWallsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalXDrone.g:1377:3: ({...}? => ( ({...}? => ( (lv_left_6_0= ruleLeft ) ) ) ) )
            	    {
            	    // InternalXDrone.g:1377:3: ({...}? => ( ({...}? => ( (lv_left_6_0= ruleLeft ) ) ) ) )
            	    // InternalXDrone.g:1378:4: {...}? => ( ({...}? => ( (lv_left_6_0= ruleLeft ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleWalls", "getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalXDrone.g:1378:99: ( ({...}? => ( (lv_left_6_0= ruleLeft ) ) ) )
            	    // InternalXDrone.g:1379:5: ({...}? => ( (lv_left_6_0= ruleLeft ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getWallsAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalXDrone.g:1382:8: ({...}? => ( (lv_left_6_0= ruleLeft ) ) )
            	    // InternalXDrone.g:1382:9: {...}? => ( (lv_left_6_0= ruleLeft ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleWalls", "true");
            	    }
            	    // InternalXDrone.g:1382:18: ( (lv_left_6_0= ruleLeft ) )
            	    // InternalXDrone.g:1382:19: (lv_left_6_0= ruleLeft )
            	    {
            	    // InternalXDrone.g:1382:19: (lv_left_6_0= ruleLeft )
            	    // InternalXDrone.g:1383:9: lv_left_6_0= ruleLeft
            	    {

            	    									newCompositeNode(grammarAccess.getWallsAccess().getLeftLeftParserRuleCall_3_0());
            	    								
            	    pushFollow(FOLLOW_21);
            	    lv_left_6_0=ruleLeft();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getWallsRule());
            	    									}
            	    									set(
            	    										current,
            	    										"left",
            	    										lv_left_6_0,
            	    										"ic.ac.uk.xdrone.XDrone.Left");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWallsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalXDrone.g:1405:3: ({...}? => ( ({...}? => ( ( (lv_up_7_0= ruleUp ) ) otherlv_8= '}' ) ) ) )
            	    {
            	    // InternalXDrone.g:1405:3: ({...}? => ( ({...}? => ( ( (lv_up_7_0= ruleUp ) ) otherlv_8= '}' ) ) ) )
            	    // InternalXDrone.g:1406:4: {...}? => ( ({...}? => ( ( (lv_up_7_0= ruleUp ) ) otherlv_8= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleWalls", "getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalXDrone.g:1406:99: ( ({...}? => ( ( (lv_up_7_0= ruleUp ) ) otherlv_8= '}' ) ) )
            	    // InternalXDrone.g:1407:5: ({...}? => ( ( (lv_up_7_0= ruleUp ) ) otherlv_8= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getWallsAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalXDrone.g:1410:8: ({...}? => ( ( (lv_up_7_0= ruleUp ) ) otherlv_8= '}' ) )
            	    // InternalXDrone.g:1410:9: {...}? => ( ( (lv_up_7_0= ruleUp ) ) otherlv_8= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleWalls", "true");
            	    }
            	    // InternalXDrone.g:1410:18: ( ( (lv_up_7_0= ruleUp ) ) otherlv_8= '}' )
            	    // InternalXDrone.g:1410:19: ( (lv_up_7_0= ruleUp ) ) otherlv_8= '}'
            	    {
            	    // InternalXDrone.g:1410:19: ( (lv_up_7_0= ruleUp ) )
            	    // InternalXDrone.g:1411:9: (lv_up_7_0= ruleUp )
            	    {
            	    // InternalXDrone.g:1411:9: (lv_up_7_0= ruleUp )
            	    // InternalXDrone.g:1412:10: lv_up_7_0= ruleUp
            	    {

            	    										newCompositeNode(grammarAccess.getWallsAccess().getUpUpParserRuleCall_4_0_0());
            	    									
            	    pushFollow(FOLLOW_6);
            	    lv_up_7_0=ruleUp();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getWallsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"up",
            	    											lv_up_7_0,
            	    											"ic.ac.uk.xdrone.XDrone.Up");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_8=(Token)match(input,12,FOLLOW_21); 

            	    								newLeafNode(otherlv_8, grammarAccess.getWallsAccess().getRightCurlyBracketKeyword_4_1());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWallsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleWalls", "getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getWallsAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWalls"


    // $ANTLR start "entryRuleFront"
    // InternalXDrone.g:1450:1: entryRuleFront returns [EObject current=null] : iv_ruleFront= ruleFront EOF ;
    public final EObject entryRuleFront() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFront = null;


        try {
            // InternalXDrone.g:1450:46: (iv_ruleFront= ruleFront EOF )
            // InternalXDrone.g:1451:2: iv_ruleFront= ruleFront EOF
            {
             newCompositeNode(grammarAccess.getFrontRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFront=ruleFront();

            state._fsp--;

             current =iv_ruleFront; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFront"


    // $ANTLR start "ruleFront"
    // InternalXDrone.g:1457:1: ruleFront returns [EObject current=null] : (otherlv_0= 'front' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) ;
    public final EObject ruleFront() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1463:2: ( (otherlv_0= 'front' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) )
            // InternalXDrone.g:1464:2: (otherlv_0= 'front' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            {
            // InternalXDrone.g:1464:2: (otherlv_0= 'front' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            // InternalXDrone.g:1465:3: otherlv_0= 'front' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getFrontAccess().getFrontKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFrontAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1473:3: ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1474:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1474:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1475:5: lv_value_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getFrontAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFrontRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFront"


    // $ANTLR start "entryRuleRight"
    // InternalXDrone.g:1496:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // InternalXDrone.g:1496:46: (iv_ruleRight= ruleRight EOF )
            // InternalXDrone.g:1497:2: iv_ruleRight= ruleRight EOF
            {
             newCompositeNode(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRight=ruleRight();

            state._fsp--;

             current =iv_ruleRight; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // InternalXDrone.g:1503:1: ruleRight returns [EObject current=null] : (otherlv_0= 'right' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1509:2: ( (otherlv_0= 'right' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) )
            // InternalXDrone.g:1510:2: (otherlv_0= 'right' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            {
            // InternalXDrone.g:1510:2: (otherlv_0= 'right' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            // InternalXDrone.g:1511:3: otherlv_0= 'right' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getRightAccess().getRightKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRightAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1519:3: ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1520:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1520:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1521:5: lv_value_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getRightAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRightRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleLeft"
    // InternalXDrone.g:1542:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // InternalXDrone.g:1542:45: (iv_ruleLeft= ruleLeft EOF )
            // InternalXDrone.g:1543:2: iv_ruleLeft= ruleLeft EOF
            {
             newCompositeNode(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeft=ruleLeft();

            state._fsp--;

             current =iv_ruleLeft; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // InternalXDrone.g:1549:1: ruleLeft returns [EObject current=null] : (otherlv_0= 'left' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1555:2: ( (otherlv_0= 'left' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) )
            // InternalXDrone.g:1556:2: (otherlv_0= 'left' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            {
            // InternalXDrone.g:1556:2: (otherlv_0= 'left' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            // InternalXDrone.g:1557:3: otherlv_0= 'left' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getLeftAccess().getLeftKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1565:3: ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1566:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1566:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1567:5: lv_value_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getLeftAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeftRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleBack"
    // InternalXDrone.g:1588:1: entryRuleBack returns [EObject current=null] : iv_ruleBack= ruleBack EOF ;
    public final EObject entryRuleBack() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBack = null;


        try {
            // InternalXDrone.g:1588:45: (iv_ruleBack= ruleBack EOF )
            // InternalXDrone.g:1589:2: iv_ruleBack= ruleBack EOF
            {
             newCompositeNode(grammarAccess.getBackRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBack=ruleBack();

            state._fsp--;

             current =iv_ruleBack; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBack"


    // $ANTLR start "ruleBack"
    // InternalXDrone.g:1595:1: ruleBack returns [EObject current=null] : (otherlv_0= 'back' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) ;
    public final EObject ruleBack() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1601:2: ( (otherlv_0= 'back' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) )
            // InternalXDrone.g:1602:2: (otherlv_0= 'back' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            {
            // InternalXDrone.g:1602:2: (otherlv_0= 'back' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            // InternalXDrone.g:1603:3: otherlv_0= 'back' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getBackAccess().getBackKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getBackAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1611:3: ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1612:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1612:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1613:5: lv_value_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getBackAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBack"


    // $ANTLR start "entryRuleUp"
    // InternalXDrone.g:1634:1: entryRuleUp returns [EObject current=null] : iv_ruleUp= ruleUp EOF ;
    public final EObject entryRuleUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUp = null;


        try {
            // InternalXDrone.g:1634:43: (iv_ruleUp= ruleUp EOF )
            // InternalXDrone.g:1635:2: iv_ruleUp= ruleUp EOF
            {
             newCompositeNode(grammarAccess.getUpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUp=ruleUp();

            state._fsp--;

             current =iv_ruleUp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUp"


    // $ANTLR start "ruleUp"
    // InternalXDrone.g:1641:1: ruleUp returns [EObject current=null] : (otherlv_0= 'up' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) ;
    public final EObject ruleUp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1647:2: ( (otherlv_0= 'up' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) )
            // InternalXDrone.g:1648:2: (otherlv_0= 'up' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            {
            // InternalXDrone.g:1648:2: (otherlv_0= 'up' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            // InternalXDrone.g:1649:3: otherlv_0= 'up' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getUpAccess().getUpKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getUpAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1657:3: ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1658:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1658:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1659:5: lv_value_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getUpAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUp"

    // Delegated rules


    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\1\13\uffff";
    static final String dfa_3s = "\1\6\1\uffff\5\0\5\uffff";
    static final String dfa_4s = "\1\47\1\uffff\5\0\5\uffff";
    static final String dfa_5s = "\1\uffff\1\6\5\uffff\1\1\1\2\1\3\1\4\1\5";
    static final String dfa_6s = "\2\uffff\1\0\1\3\1\2\1\1\1\4\5\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\5\uffff\1\1\14\uffff\1\1\10\uffff\1\2\1\uffff\1\3\1\5\1\4\1\6",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 1282:5: ( ({...}? => ( ({...}? => (otherlv_1= 'WALLS' otherlv_2= '{' ( (lv_front_3_0= ruleFront ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_right_4_0= ruleRight ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_back_5_0= ruleBack ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_left_6_0= ruleLeft ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_up_7_0= ruleUp ) ) otherlv_8= '}' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_2 = input.LA(1);

                         
                        int index10_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 0) ) {s = 7;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 3) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_3 = input.LA(1);

                         
                        int index10_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 1) ) {s = 8;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_6 = input.LA(1);

                         
                        int index10_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getWallsAccess().getUnorderedGroup(), 4) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getWallsAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index10_6);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000E48040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000F402001040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000088001000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000260001000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000F400000002L});

}
