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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fly'", "'('", "')'", "'{'", "'}'", "'environment'", "'TAKEOFF'", "'LAND'", "'-'", "'.'", "'GOTO'", "'UP'", "'DOWN'", "'LEFT'", "'RIGHT'", "'FORWARD'", "'BACKWARD'", "'ROTATELEFT'", "'ROTATERIGHT'", "'WAIT'", "'DRONE'", "'='", "'rotation'", "'origin'", "'size'", "'position'", "','", "'color'", "'WALLS'", "'front'", "'right'", "'left'", "'back'", "'up'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=6;
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
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

            if ( (LA1_0==16) ) {
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
    // InternalXDrone.g:164:1: ruleFly returns [EObject current=null] : (otherlv_0= 'fly' otherlv_1= '(' otherlv_2= ')' otherlv_3= '{' ( ( (lv_takeoff_4_0= ruleTakeoff ) ) ( (lv_commands_5_0= ruleSuperCommand ) )* ( (lv_land_6_0= ruleLand ) ) ) otherlv_7= '}' ) ;
    public final EObject ruleFly() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_takeoff_4_0 = null;

        EObject lv_commands_5_0 = null;

        AntlrDatatypeRuleToken lv_land_6_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:170:2: ( (otherlv_0= 'fly' otherlv_1= '(' otherlv_2= ')' otherlv_3= '{' ( ( (lv_takeoff_4_0= ruleTakeoff ) ) ( (lv_commands_5_0= ruleSuperCommand ) )* ( (lv_land_6_0= ruleLand ) ) ) otherlv_7= '}' ) )
            // InternalXDrone.g:171:2: (otherlv_0= 'fly' otherlv_1= '(' otherlv_2= ')' otherlv_3= '{' ( ( (lv_takeoff_4_0= ruleTakeoff ) ) ( (lv_commands_5_0= ruleSuperCommand ) )* ( (lv_land_6_0= ruleLand ) ) ) otherlv_7= '}' )
            {
            // InternalXDrone.g:171:2: (otherlv_0= 'fly' otherlv_1= '(' otherlv_2= ')' otherlv_3= '{' ( ( (lv_takeoff_4_0= ruleTakeoff ) ) ( (lv_commands_5_0= ruleSuperCommand ) )* ( (lv_land_6_0= ruleLand ) ) ) otherlv_7= '}' )
            // InternalXDrone.g:172:3: otherlv_0= 'fly' otherlv_1= '(' otherlv_2= ')' otherlv_3= '{' ( ( (lv_takeoff_4_0= ruleTakeoff ) ) ( (lv_commands_5_0= ruleSuperCommand ) )* ( (lv_land_6_0= ruleLand ) ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFlyAccess().getFlyKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFlyAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFlyAccess().getRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getFlyAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalXDrone.g:188:3: ( ( (lv_takeoff_4_0= ruleTakeoff ) ) ( (lv_commands_5_0= ruleSuperCommand ) )* ( (lv_land_6_0= ruleLand ) ) )
            // InternalXDrone.g:189:4: ( (lv_takeoff_4_0= ruleTakeoff ) ) ( (lv_commands_5_0= ruleSuperCommand ) )* ( (lv_land_6_0= ruleLand ) )
            {
            // InternalXDrone.g:189:4: ( (lv_takeoff_4_0= ruleTakeoff ) )
            // InternalXDrone.g:190:5: (lv_takeoff_4_0= ruleTakeoff )
            {
            // InternalXDrone.g:190:5: (lv_takeoff_4_0= ruleTakeoff )
            // InternalXDrone.g:191:6: lv_takeoff_4_0= ruleTakeoff
            {

            						newCompositeNode(grammarAccess.getFlyAccess().getTakeoffTakeoffParserRuleCall_4_0_0());
            					
            pushFollow(FOLLOW_8);
            lv_takeoff_4_0=ruleTakeoff();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getFlyRule());
            						}
            						add(
            							current,
            							"takeoff",
            							lv_takeoff_4_0,
            							"ic.ac.uk.xdrone.XDrone.Takeoff");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalXDrone.g:208:4: ( (lv_commands_5_0= ruleSuperCommand ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=21 && LA2_0<=30)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalXDrone.g:209:5: (lv_commands_5_0= ruleSuperCommand )
            	    {
            	    // InternalXDrone.g:209:5: (lv_commands_5_0= ruleSuperCommand )
            	    // InternalXDrone.g:210:6: lv_commands_5_0= ruleSuperCommand
            	    {

            	    						newCompositeNode(grammarAccess.getFlyAccess().getCommandsSuperCommandParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_commands_5_0=ruleSuperCommand();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFlyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"commands",
            	    							lv_commands_5_0,
            	    							"ic.ac.uk.xdrone.XDrone.SuperCommand");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalXDrone.g:227:4: ( (lv_land_6_0= ruleLand ) )
            // InternalXDrone.g:228:5: (lv_land_6_0= ruleLand )
            {
            // InternalXDrone.g:228:5: (lv_land_6_0= ruleLand )
            // InternalXDrone.g:229:6: lv_land_6_0= ruleLand
            {

            						newCompositeNode(grammarAccess.getFlyAccess().getLandLandParserRuleCall_4_2_0());
            					
            pushFollow(FOLLOW_9);
            lv_land_6_0=ruleLand();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getFlyRule());
            						}
            						add(
            							current,
            							"land",
            							lv_land_6_0,
            							"ic.ac.uk.xdrone.XDrone.Land");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getFlyAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalXDrone.g:255:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalXDrone.g:255:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalXDrone.g:256:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalXDrone.g:262:1: ruleEnvironment returns [EObject current=null] : ( () otherlv_1= 'environment' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_drone_5_0= ruleDrone ) ) | ( (lv_walls_6_0= ruleWalls ) ) | ( (lv_objects_7_0= ruleObject ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        EObject lv_drone_5_0 = null;

        EObject lv_walls_6_0 = null;

        EObject lv_objects_7_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:268:2: ( ( () otherlv_1= 'environment' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_drone_5_0= ruleDrone ) ) | ( (lv_walls_6_0= ruleWalls ) ) | ( (lv_objects_7_0= ruleObject ) ) )* otherlv_8= '}' ) )
            // InternalXDrone.g:269:2: ( () otherlv_1= 'environment' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_drone_5_0= ruleDrone ) ) | ( (lv_walls_6_0= ruleWalls ) ) | ( (lv_objects_7_0= ruleObject ) ) )* otherlv_8= '}' )
            {
            // InternalXDrone.g:269:2: ( () otherlv_1= 'environment' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_drone_5_0= ruleDrone ) ) | ( (lv_walls_6_0= ruleWalls ) ) | ( (lv_objects_7_0= ruleObject ) ) )* otherlv_8= '}' )
            // InternalXDrone.g:270:3: () otherlv_1= 'environment' otherlv_2= '(' otherlv_3= ')' otherlv_4= '{' ( ( (lv_drone_5_0= ruleDrone ) ) | ( (lv_walls_6_0= ruleWalls ) ) | ( (lv_objects_7_0= ruleObject ) ) )* otherlv_8= '}'
            {
            // InternalXDrone.g:270:3: ()
            // InternalXDrone.g:271:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalXDrone.g:293:3: ( ( (lv_drone_5_0= ruleDrone ) ) | ( (lv_walls_6_0= ruleWalls ) ) | ( (lv_objects_7_0= ruleObject ) ) )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case 31:
                    {
                    alt3=1;
                    }
                    break;
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
            	    // InternalXDrone.g:294:4: ( (lv_drone_5_0= ruleDrone ) )
            	    {
            	    // InternalXDrone.g:294:4: ( (lv_drone_5_0= ruleDrone ) )
            	    // InternalXDrone.g:295:5: (lv_drone_5_0= ruleDrone )
            	    {
            	    // InternalXDrone.g:295:5: (lv_drone_5_0= ruleDrone )
            	    // InternalXDrone.g:296:6: lv_drone_5_0= ruleDrone
            	    {

            	    						newCompositeNode(grammarAccess.getEnvironmentAccess().getDroneDroneParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_drone_5_0=ruleDrone();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"drone",
            	    							lv_drone_5_0,
            	    							"ic.ac.uk.xdrone.XDrone.Drone");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDrone.g:314:4: ( (lv_walls_6_0= ruleWalls ) )
            	    {
            	    // InternalXDrone.g:314:4: ( (lv_walls_6_0= ruleWalls ) )
            	    // InternalXDrone.g:315:5: (lv_walls_6_0= ruleWalls )
            	    {
            	    // InternalXDrone.g:315:5: (lv_walls_6_0= ruleWalls )
            	    // InternalXDrone.g:316:6: lv_walls_6_0= ruleWalls
            	    {

            	    						newCompositeNode(grammarAccess.getEnvironmentAccess().getWallsWallsParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_walls_6_0=ruleWalls();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"walls",
            	    							lv_walls_6_0,
            	    							"ic.ac.uk.xdrone.XDrone.Walls");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDrone.g:334:4: ( (lv_objects_7_0= ruleObject ) )
            	    {
            	    // InternalXDrone.g:334:4: ( (lv_objects_7_0= ruleObject ) )
            	    // InternalXDrone.g:335:5: (lv_objects_7_0= ruleObject )
            	    {
            	    // InternalXDrone.g:335:5: (lv_objects_7_0= ruleObject )
            	    // InternalXDrone.g:336:6: lv_objects_7_0= ruleObject
            	    {

            	    						newCompositeNode(grammarAccess.getEnvironmentAccess().getObjectsObjectParserRuleCall_5_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_objects_7_0=ruleObject();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"objects",
            	    							lv_objects_7_0,
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

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalXDrone.g:362:1: entryRuleTakeoff returns [String current=null] : iv_ruleTakeoff= ruleTakeoff EOF ;
    public final String entryRuleTakeoff() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTakeoff = null;


        try {
            // InternalXDrone.g:362:47: (iv_ruleTakeoff= ruleTakeoff EOF )
            // InternalXDrone.g:363:2: iv_ruleTakeoff= ruleTakeoff EOF
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
    // InternalXDrone.g:369:1: ruleTakeoff returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'TAKEOFF' kw= '(' kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleTakeoff() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXDrone.g:375:2: ( (kw= 'TAKEOFF' kw= '(' kw= ')' ) )
            // InternalXDrone.g:376:2: (kw= 'TAKEOFF' kw= '(' kw= ')' )
            {
            // InternalXDrone.g:376:2: (kw= 'TAKEOFF' kw= '(' kw= ')' )
            // InternalXDrone.g:377:3: kw= 'TAKEOFF' kw= '(' kw= ')'
            {
            kw=(Token)match(input,17,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTakeoffAccess().getTAKEOFFKeyword_0());
            		
            kw=(Token)match(input,12,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTakeoffAccess().getLeftParenthesisKeyword_1());
            		
            kw=(Token)match(input,13,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTakeoffAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleTakeoff"


    // $ANTLR start "entryRuleLand"
    // InternalXDrone.g:396:1: entryRuleLand returns [String current=null] : iv_ruleLand= ruleLand EOF ;
    public final String entryRuleLand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLand = null;


        try {
            // InternalXDrone.g:396:44: (iv_ruleLand= ruleLand EOF )
            // InternalXDrone.g:397:2: iv_ruleLand= ruleLand EOF
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
    // InternalXDrone.g:403:1: ruleLand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'LAND' kw= '(' kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleLand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXDrone.g:409:2: ( (kw= 'LAND' kw= '(' kw= ')' ) )
            // InternalXDrone.g:410:2: (kw= 'LAND' kw= '(' kw= ')' )
            {
            // InternalXDrone.g:410:2: (kw= 'LAND' kw= '(' kw= ')' )
            // InternalXDrone.g:411:3: kw= 'LAND' kw= '(' kw= ')'
            {
            kw=(Token)match(input,18,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLandAccess().getLANDKeyword_0());
            		
            kw=(Token)match(input,12,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLandAccess().getLeftParenthesisKeyword_1());
            		
            kw=(Token)match(input,13,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getLandAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleLand"


    // $ANTLR start "entryRuleSuperCommand"
    // InternalXDrone.g:430:1: entryRuleSuperCommand returns [EObject current=null] : iv_ruleSuperCommand= ruleSuperCommand EOF ;
    public final EObject entryRuleSuperCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperCommand = null;


        try {
            // InternalXDrone.g:430:53: (iv_ruleSuperCommand= ruleSuperCommand EOF )
            // InternalXDrone.g:431:2: iv_ruleSuperCommand= ruleSuperCommand EOF
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
    // InternalXDrone.g:437:1: ruleSuperCommand returns [EObject current=null] : this_Command_0= ruleCommand ;
    public final EObject ruleSuperCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:443:2: (this_Command_0= ruleCommand )
            // InternalXDrone.g:444:2: this_Command_0= ruleCommand
            {

            		newCompositeNode(grammarAccess.getSuperCommandAccess().getCommandParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Command_0=ruleCommand();

            state._fsp--;


            		current = this_Command_0;
            		afterParserOrEnumRuleCall();
            	

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
    // InternalXDrone.g:455:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalXDrone.g:455:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalXDrone.g:456:2: iv_ruleCommand= ruleCommand EOF
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
    // InternalXDrone.g:462:1: ruleCommand returns [EObject current=null] : (this_Up_0= ruleUp | this_Down_1= ruleDown | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_Forward_4= ruleForward | this_Backward_5= ruleBackward | this_RotateL_6= ruleRotateL | this_RotateR_7= ruleRotateR | this_Wait_8= ruleWait | this_GoTo_9= ruleGoTo ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_Up_0 = null;

        EObject this_Down_1 = null;

        EObject this_Left_2 = null;

        EObject this_Right_3 = null;

        EObject this_Forward_4 = null;

        EObject this_Backward_5 = null;

        EObject this_RotateL_6 = null;

        EObject this_RotateR_7 = null;

        EObject this_Wait_8 = null;

        EObject this_GoTo_9 = null;



        	enterRule();

        try {
            // InternalXDrone.g:468:2: ( (this_Up_0= ruleUp | this_Down_1= ruleDown | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_Forward_4= ruleForward | this_Backward_5= ruleBackward | this_RotateL_6= ruleRotateL | this_RotateR_7= ruleRotateR | this_Wait_8= ruleWait | this_GoTo_9= ruleGoTo ) )
            // InternalXDrone.g:469:2: (this_Up_0= ruleUp | this_Down_1= ruleDown | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_Forward_4= ruleForward | this_Backward_5= ruleBackward | this_RotateL_6= ruleRotateL | this_RotateR_7= ruleRotateR | this_Wait_8= ruleWait | this_GoTo_9= ruleGoTo )
            {
            // InternalXDrone.g:469:2: (this_Up_0= ruleUp | this_Down_1= ruleDown | this_Left_2= ruleLeft | this_Right_3= ruleRight | this_Forward_4= ruleForward | this_Backward_5= ruleBackward | this_RotateL_6= ruleRotateL | this_RotateR_7= ruleRotateR | this_Wait_8= ruleWait | this_GoTo_9= ruleGoTo )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 24:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            case 26:
                {
                alt4=5;
                }
                break;
            case 27:
                {
                alt4=6;
                }
                break;
            case 28:
                {
                alt4=7;
                }
                break;
            case 29:
                {
                alt4=8;
                }
                break;
            case 30:
                {
                alt4=9;
                }
                break;
            case 21:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalXDrone.g:470:3: this_Up_0= ruleUp
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getUpParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Up_0=ruleUp();

                    state._fsp--;


                    			current = this_Up_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXDrone.g:479:3: this_Down_1= ruleDown
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getDownParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Down_1=ruleDown();

                    state._fsp--;


                    			current = this_Down_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXDrone.g:488:3: this_Left_2= ruleLeft
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getLeftParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Left_2=ruleLeft();

                    state._fsp--;


                    			current = this_Left_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalXDrone.g:497:3: this_Right_3= ruleRight
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRightParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Right_3=ruleRight();

                    state._fsp--;


                    			current = this_Right_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalXDrone.g:506:3: this_Forward_4= ruleForward
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getForwardParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Forward_4=ruleForward();

                    state._fsp--;


                    			current = this_Forward_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalXDrone.g:515:3: this_Backward_5= ruleBackward
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getBackwardParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Backward_5=ruleBackward();

                    state._fsp--;


                    			current = this_Backward_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalXDrone.g:524:3: this_RotateL_6= ruleRotateL
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRotateLParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_RotateL_6=ruleRotateL();

                    state._fsp--;


                    			current = this_RotateL_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalXDrone.g:533:3: this_RotateR_7= ruleRotateR
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getRotateRParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_RotateR_7=ruleRotateR();

                    state._fsp--;


                    			current = this_RotateR_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalXDrone.g:542:3: this_Wait_8= ruleWait
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getWaitParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wait_8=ruleWait();

                    state._fsp--;


                    			current = this_Wait_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalXDrone.g:551:3: this_GoTo_9= ruleGoTo
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getGoToParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_GoTo_9=ruleGoTo();

                    state._fsp--;


                    			current = this_GoTo_9;
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
    // InternalXDrone.g:563:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalXDrone.g:563:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalXDrone.g:564:2: iv_ruleDOUBLE= ruleDOUBLE EOF
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
    // InternalXDrone.g:570:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE ) | this_POSITIVE_DOUBLE_2= rulePOSITIVE_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_POSITIVE_DOUBLE_1 = null;

        AntlrDatatypeRuleToken this_POSITIVE_DOUBLE_2 = null;



        	enterRule();

        try {
            // InternalXDrone.g:576:2: ( ( (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE ) | this_POSITIVE_DOUBLE_2= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:577:2: ( (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE ) | this_POSITIVE_DOUBLE_2= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:577:2: ( (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE ) | this_POSITIVE_DOUBLE_2= rulePOSITIVE_DOUBLE )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXDrone.g:578:3: (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE )
                    {
                    // InternalXDrone.g:578:3: (kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE )
                    // InternalXDrone.g:579:4: kw= '-' this_POSITIVE_DOUBLE_1= rulePOSITIVE_DOUBLE
                    {
                    kw=(Token)match(input,19,FOLLOW_11); 

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
                    // InternalXDrone.g:596:3: this_POSITIVE_DOUBLE_2= rulePOSITIVE_DOUBLE
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
    // InternalXDrone.g:610:1: entryRulePOSITIVE_DOUBLE returns [String current=null] : iv_rulePOSITIVE_DOUBLE= rulePOSITIVE_DOUBLE EOF ;
    public final String entryRulePOSITIVE_DOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePOSITIVE_DOUBLE = null;


        try {
            // InternalXDrone.g:610:55: (iv_rulePOSITIVE_DOUBLE= rulePOSITIVE_DOUBLE EOF )
            // InternalXDrone.g:611:2: iv_rulePOSITIVE_DOUBLE= rulePOSITIVE_DOUBLE EOF
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
    // InternalXDrone.g:617:1: rulePOSITIVE_DOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulePOSITIVE_DOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:623:2: ( ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT ) )
            // InternalXDrone.g:624:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT )
            {
            // InternalXDrone.g:624:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) | this_INT_3= RULE_INT )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==20) ) {
                    alt6=1;
                }
                else if ( (LA6_1==EOF||LA6_1==13||LA6_1==15||LA6_1==33||(LA6_1>=36 && LA6_1<=37)||(LA6_1>=40 && LA6_1<=44)) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXDrone.g:625:3: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
                    {
                    // InternalXDrone.g:625:3: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
                    // InternalXDrone.g:626:4: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_12); 

                    				current.merge(this_INT_0);
                    			

                    				newLeafNode(this_INT_0, grammarAccess.getPOSITIVE_DOUBLEAccess().getINTTerminalRuleCall_0_0());
                    			
                    kw=(Token)match(input,20,FOLLOW_11); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPOSITIVE_DOUBLEAccess().getFullStopKeyword_0_1());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getPOSITIVE_DOUBLEAccess().getINTTerminalRuleCall_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:647:3: this_INT_3= RULE_INT
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
    // InternalXDrone.g:658:1: entryRuleGoTo returns [EObject current=null] : iv_ruleGoTo= ruleGoTo EOF ;
    public final EObject entryRuleGoTo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoTo = null;


        try {
            // InternalXDrone.g:658:45: (iv_ruleGoTo= ruleGoTo EOF )
            // InternalXDrone.g:659:2: iv_ruleGoTo= ruleGoTo EOF
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
    // InternalXDrone.g:665:1: ruleGoTo returns [EObject current=null] : (otherlv_0= 'GOTO' otherlv_1= '(' ( (lv_object_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleGoTo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_object_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalXDrone.g:671:2: ( (otherlv_0= 'GOTO' otherlv_1= '(' ( (lv_object_name_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:672:2: (otherlv_0= 'GOTO' otherlv_1= '(' ( (lv_object_name_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:672:2: (otherlv_0= 'GOTO' otherlv_1= '(' ( (lv_object_name_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalXDrone.g:673:3: otherlv_0= 'GOTO' otherlv_1= '(' ( (lv_object_name_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGoToAccess().getGOTOKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getGoToAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:681:3: ( (lv_object_name_2_0= RULE_STRING ) )
            // InternalXDrone.g:682:4: (lv_object_name_2_0= RULE_STRING )
            {
            // InternalXDrone.g:682:4: (lv_object_name_2_0= RULE_STRING )
            // InternalXDrone.g:683:5: lv_object_name_2_0= RULE_STRING
            {
            lv_object_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

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

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRuleUp"
    // InternalXDrone.g:707:1: entryRuleUp returns [EObject current=null] : iv_ruleUp= ruleUp EOF ;
    public final EObject entryRuleUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUp = null;


        try {
            // InternalXDrone.g:707:43: (iv_ruleUp= ruleUp EOF )
            // InternalXDrone.g:708:2: iv_ruleUp= ruleUp EOF
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
    // InternalXDrone.g:714:1: ruleUp returns [EObject current=null] : (otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleUp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:720:2: ( (otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:721:2: (otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:721:2: (otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:722:3: otherlv_0= 'UP' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUpAccess().getUPKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getUpAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:730:3: ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:731:4: (lv_distance_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:731:4: (lv_distance_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:732:5: lv_distance_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getUpAccess().getDistancePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_distance_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getUpAccess().getRightParenthesisKeyword_3());
            		

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


    // $ANTLR start "entryRuleDown"
    // InternalXDrone.g:757:1: entryRuleDown returns [EObject current=null] : iv_ruleDown= ruleDown EOF ;
    public final EObject entryRuleDown() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDown = null;


        try {
            // InternalXDrone.g:757:45: (iv_ruleDown= ruleDown EOF )
            // InternalXDrone.g:758:2: iv_ruleDown= ruleDown EOF
            {
             newCompositeNode(grammarAccess.getDownRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDown=ruleDown();

            state._fsp--;

             current =iv_ruleDown; 
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
    // $ANTLR end "entryRuleDown"


    // $ANTLR start "ruleDown"
    // InternalXDrone.g:764:1: ruleDown returns [EObject current=null] : (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleDown() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:770:2: ( (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:771:2: (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:771:2: (otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:772:3: otherlv_0= 'DOWN' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDownAccess().getDOWNKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDownAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:780:3: ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:781:4: (lv_distance_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:781:4: (lv_distance_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:782:5: lv_distance_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getDownAccess().getDistancePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_distance_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDownRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDownAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleDown"


    // $ANTLR start "entryRuleLeft"
    // InternalXDrone.g:807:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // InternalXDrone.g:807:45: (iv_ruleLeft= ruleLeft EOF )
            // InternalXDrone.g:808:2: iv_ruleLeft= ruleLeft EOF
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
    // InternalXDrone.g:814:1: ruleLeft returns [EObject current=null] : (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:820:2: ( (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:821:2: (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:821:2: (otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:822:3: otherlv_0= 'LEFT' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLeftAccess().getLEFTKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:830:3: ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:831:4: (lv_distance_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:831:4: (lv_distance_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:832:5: lv_distance_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getLeftAccess().getDistancePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_distance_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeftRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLeftAccess().getRightParenthesisKeyword_3());
            		

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


    // $ANTLR start "entryRuleRight"
    // InternalXDrone.g:857:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // InternalXDrone.g:857:46: (iv_ruleRight= ruleRight EOF )
            // InternalXDrone.g:858:2: iv_ruleRight= ruleRight EOF
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
    // InternalXDrone.g:864:1: ruleRight returns [EObject current=null] : (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:870:2: ( (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:871:2: (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:871:2: (otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:872:3: otherlv_0= 'RIGHT' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRightAccess().getRIGHTKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRightAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:880:3: ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:881:4: (lv_distance_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:881:4: (lv_distance_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:882:5: lv_distance_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getRightAccess().getDistancePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_distance_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRightRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRightAccess().getRightParenthesisKeyword_3());
            		

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


    // $ANTLR start "entryRuleForward"
    // InternalXDrone.g:907:1: entryRuleForward returns [EObject current=null] : iv_ruleForward= ruleForward EOF ;
    public final EObject entryRuleForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForward = null;


        try {
            // InternalXDrone.g:907:48: (iv_ruleForward= ruleForward EOF )
            // InternalXDrone.g:908:2: iv_ruleForward= ruleForward EOF
            {
             newCompositeNode(grammarAccess.getForwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForward=ruleForward();

            state._fsp--;

             current =iv_ruleForward; 
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
    // $ANTLR end "entryRuleForward"


    // $ANTLR start "ruleForward"
    // InternalXDrone.g:914:1: ruleForward returns [EObject current=null] : (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:920:2: ( (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:921:2: (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:921:2: (otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:922:3: otherlv_0= 'FORWARD' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getForwardAccess().getFORWARDKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getForwardAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:930:3: ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:931:4: (lv_distance_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:931:4: (lv_distance_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:932:5: lv_distance_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getForwardAccess().getDistancePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_distance_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForwardRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getForwardAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleForward"


    // $ANTLR start "entryRuleBackward"
    // InternalXDrone.g:957:1: entryRuleBackward returns [EObject current=null] : iv_ruleBackward= ruleBackward EOF ;
    public final EObject entryRuleBackward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackward = null;


        try {
            // InternalXDrone.g:957:49: (iv_ruleBackward= ruleBackward EOF )
            // InternalXDrone.g:958:2: iv_ruleBackward= ruleBackward EOF
            {
             newCompositeNode(grammarAccess.getBackwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackward=ruleBackward();

            state._fsp--;

             current =iv_ruleBackward; 
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
    // $ANTLR end "entryRuleBackward"


    // $ANTLR start "ruleBackward"
    // InternalXDrone.g:964:1: ruleBackward returns [EObject current=null] : (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleBackward() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_distance_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:970:2: ( (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:971:2: (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:971:2: (otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:972:3: otherlv_0= 'BACKWARD' otherlv_1= '(' ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBackwardAccess().getBACKWARDKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getBackwardAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:980:3: ( (lv_distance_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:981:4: (lv_distance_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:981:4: (lv_distance_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:982:5: lv_distance_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getBackwardAccess().getDistancePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_distance_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackwardRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_2_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBackwardAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleBackward"


    // $ANTLR start "entryRuleRotateL"
    // InternalXDrone.g:1007:1: entryRuleRotateL returns [EObject current=null] : iv_ruleRotateL= ruleRotateL EOF ;
    public final EObject entryRuleRotateL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotateL = null;


        try {
            // InternalXDrone.g:1007:48: (iv_ruleRotateL= ruleRotateL EOF )
            // InternalXDrone.g:1008:2: iv_ruleRotateL= ruleRotateL EOF
            {
             newCompositeNode(grammarAccess.getRotateLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotateL=ruleRotateL();

            state._fsp--;

             current =iv_ruleRotateL; 
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
    // $ANTLR end "entryRuleRotateL"


    // $ANTLR start "ruleRotateL"
    // InternalXDrone.g:1014:1: ruleRotateL returns [EObject current=null] : (otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_angle_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleRotateL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_angle_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1020:2: ( (otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_angle_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:1021:2: (otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_angle_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:1021:2: (otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_angle_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:1022:3: otherlv_0= 'ROTATELEFT' otherlv_1= '(' ( (lv_angle_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateLAccess().getROTATELEFTKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateLAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:1030:3: ( (lv_angle_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1031:4: (lv_angle_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1031:4: (lv_angle_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1032:5: lv_angle_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getRotateLAccess().getAnglePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_angle_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateLRule());
            					}
            					set(
            						current,
            						"angle",
            						lv_angle_2_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateLAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleRotateL"


    // $ANTLR start "entryRuleRotateR"
    // InternalXDrone.g:1057:1: entryRuleRotateR returns [EObject current=null] : iv_ruleRotateR= ruleRotateR EOF ;
    public final EObject entryRuleRotateR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotateR = null;


        try {
            // InternalXDrone.g:1057:48: (iv_ruleRotateR= ruleRotateR EOF )
            // InternalXDrone.g:1058:2: iv_ruleRotateR= ruleRotateR EOF
            {
             newCompositeNode(grammarAccess.getRotateRRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotateR=ruleRotateR();

            state._fsp--;

             current =iv_ruleRotateR; 
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
    // $ANTLR end "entryRuleRotateR"


    // $ANTLR start "ruleRotateR"
    // InternalXDrone.g:1064:1: ruleRotateR returns [EObject current=null] : (otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_angle_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleRotateR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_angle_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1070:2: ( (otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_angle_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:1071:2: (otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_angle_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:1071:2: (otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_angle_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:1072:3: otherlv_0= 'ROTATERIGHT' otherlv_1= '(' ( (lv_angle_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateRAccess().getROTATERIGHTKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateRAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:1080:3: ( (lv_angle_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1081:4: (lv_angle_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1081:4: (lv_angle_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1082:5: lv_angle_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getRotateRAccess().getAnglePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_angle_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateRRule());
            					}
            					set(
            						current,
            						"angle",
            						lv_angle_2_0,
            						"ic.ac.uk.xdrone.XDrone.POSITIVE_DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getRotateRAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleRotateR"


    // $ANTLR start "entryRuleWait"
    // InternalXDrone.g:1107:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalXDrone.g:1107:45: (iv_ruleWait= ruleWait EOF )
            // InternalXDrone.g:1108:2: iv_ruleWait= ruleWait EOF
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
    // InternalXDrone.g:1114:1: ruleWait returns [EObject current=null] : (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_seconds_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1120:2: ( (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' ) )
            // InternalXDrone.g:1121:2: (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            {
            // InternalXDrone.g:1121:2: (otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')' )
            // InternalXDrone.g:1122:3: otherlv_0= 'WAIT' otherlv_1= '(' ( (lv_seconds_2_0= rulePOSITIVE_DOUBLE ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWaitAccess().getWAITKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getWaitAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXDrone.g:1130:3: ( (lv_seconds_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1131:4: (lv_seconds_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1131:4: (lv_seconds_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1132:5: lv_seconds_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getWaitAccess().getSecondsPOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDrone"
    // InternalXDrone.g:1157:1: entryRuleDrone returns [EObject current=null] : iv_ruleDrone= ruleDrone EOF ;
    public final EObject entryRuleDrone() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrone = null;


        try {
            // InternalXDrone.g:1157:46: (iv_ruleDrone= ruleDrone EOF )
            // InternalXDrone.g:1158:2: iv_ruleDrone= ruleDrone EOF
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
    // InternalXDrone.g:1164:1: ruleDrone returns [EObject current=null] : (otherlv_0= 'DRONE' otherlv_1= '=' otherlv_2= '{' ( ( (lv_position_3_0= rulePosition ) ) | (otherlv_4= 'rotation' otherlv_5= '=' ( (lv_rotation_6_0= ruleDOUBLE ) ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleDrone() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_position_3_0 = null;

        AntlrDatatypeRuleToken lv_rotation_6_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1170:2: ( (otherlv_0= 'DRONE' otherlv_1= '=' otherlv_2= '{' ( ( (lv_position_3_0= rulePosition ) ) | (otherlv_4= 'rotation' otherlv_5= '=' ( (lv_rotation_6_0= ruleDOUBLE ) ) ) )* otherlv_7= '}' ) )
            // InternalXDrone.g:1171:2: (otherlv_0= 'DRONE' otherlv_1= '=' otherlv_2= '{' ( ( (lv_position_3_0= rulePosition ) ) | (otherlv_4= 'rotation' otherlv_5= '=' ( (lv_rotation_6_0= ruleDOUBLE ) ) ) )* otherlv_7= '}' )
            {
            // InternalXDrone.g:1171:2: (otherlv_0= 'DRONE' otherlv_1= '=' otherlv_2= '{' ( ( (lv_position_3_0= rulePosition ) ) | (otherlv_4= 'rotation' otherlv_5= '=' ( (lv_rotation_6_0= ruleDOUBLE ) ) ) )* otherlv_7= '}' )
            // InternalXDrone.g:1172:3: otherlv_0= 'DRONE' otherlv_1= '=' otherlv_2= '{' ( ( (lv_position_3_0= rulePosition ) ) | (otherlv_4= 'rotation' otherlv_5= '=' ( (lv_rotation_6_0= ruleDOUBLE ) ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDroneAccess().getDRONEKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDroneAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDrone.g:1184:3: ( ( (lv_position_3_0= rulePosition ) ) | (otherlv_4= 'rotation' otherlv_5= '=' ( (lv_rotation_6_0= ruleDOUBLE ) ) ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==36) ) {
                    alt7=1;
                }
                else if ( (LA7_0==33) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXDrone.g:1185:4: ( (lv_position_3_0= rulePosition ) )
            	    {
            	    // InternalXDrone.g:1185:4: ( (lv_position_3_0= rulePosition ) )
            	    // InternalXDrone.g:1186:5: (lv_position_3_0= rulePosition )
            	    {
            	    // InternalXDrone.g:1186:5: (lv_position_3_0= rulePosition )
            	    // InternalXDrone.g:1187:6: lv_position_3_0= rulePosition
            	    {

            	    						newCompositeNode(grammarAccess.getDroneAccess().getPositionPositionParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_position_3_0=rulePosition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDroneRule());
            	    						}
            	    						set(
            	    							current,
            	    							"position",
            	    							lv_position_3_0,
            	    							"ic.ac.uk.xdrone.XDrone.Position");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDrone.g:1205:4: (otherlv_4= 'rotation' otherlv_5= '=' ( (lv_rotation_6_0= ruleDOUBLE ) ) )
            	    {
            	    // InternalXDrone.g:1205:4: (otherlv_4= 'rotation' otherlv_5= '=' ( (lv_rotation_6_0= ruleDOUBLE ) ) )
            	    // InternalXDrone.g:1206:5: otherlv_4= 'rotation' otherlv_5= '=' ( (lv_rotation_6_0= ruleDOUBLE ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_14); 

            	    					newLeafNode(otherlv_4, grammarAccess.getDroneAccess().getRotationKeyword_3_1_0());
            	    				
            	    otherlv_5=(Token)match(input,32,FOLLOW_16); 

            	    					newLeafNode(otherlv_5, grammarAccess.getDroneAccess().getEqualsSignKeyword_3_1_1());
            	    				
            	    // InternalXDrone.g:1214:5: ( (lv_rotation_6_0= ruleDOUBLE ) )
            	    // InternalXDrone.g:1215:6: (lv_rotation_6_0= ruleDOUBLE )
            	    {
            	    // InternalXDrone.g:1215:6: (lv_rotation_6_0= ruleDOUBLE )
            	    // InternalXDrone.g:1216:7: lv_rotation_6_0= ruleDOUBLE
            	    {

            	    							newCompositeNode(grammarAccess.getDroneAccess().getRotationDOUBLEParserRuleCall_3_1_2_0());
            	    						
            	    pushFollow(FOLLOW_15);
            	    lv_rotation_6_0=ruleDOUBLE();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getDroneRule());
            	    							}
            	    							set(
            	    								current,
            	    								"rotation",
            	    								lv_rotation_6_0,
            	    								"ic.ac.uk.xdrone.XDrone.DOUBLE");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalXDrone.g:1243:1: entryRuleObject returns [EObject current=null] : iv_ruleObject= ruleObject EOF ;
    public final EObject entryRuleObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObject = null;


        try {
            // InternalXDrone.g:1243:47: (iv_ruleObject= ruleObject EOF )
            // InternalXDrone.g:1244:2: iv_ruleObject= ruleObject EOF
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
    // InternalXDrone.g:1250:1: ruleObject returns [EObject current=null] : ( ( (lv_object_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_origin_3_0= ruleOrigin ) ) | ( (lv_size_4_0= ruleSize ) ) | ( (lv_color_5_0= ruleColor ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleObject() throws RecognitionException {
        EObject current = null;

        Token lv_object_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_origin_3_0 = null;

        EObject lv_size_4_0 = null;

        EObject lv_color_5_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1256:2: ( ( ( (lv_object_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_origin_3_0= ruleOrigin ) ) | ( (lv_size_4_0= ruleSize ) ) | ( (lv_color_5_0= ruleColor ) ) )* otherlv_6= '}' ) )
            // InternalXDrone.g:1257:2: ( ( (lv_object_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_origin_3_0= ruleOrigin ) ) | ( (lv_size_4_0= ruleSize ) ) | ( (lv_color_5_0= ruleColor ) ) )* otherlv_6= '}' )
            {
            // InternalXDrone.g:1257:2: ( ( (lv_object_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_origin_3_0= ruleOrigin ) ) | ( (lv_size_4_0= ruleSize ) ) | ( (lv_color_5_0= ruleColor ) ) )* otherlv_6= '}' )
            // InternalXDrone.g:1258:3: ( (lv_object_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '{' ( ( (lv_origin_3_0= ruleOrigin ) ) | ( (lv_size_4_0= ruleSize ) ) | ( (lv_color_5_0= ruleColor ) ) )* otherlv_6= '}'
            {
            // InternalXDrone.g:1258:3: ( (lv_object_name_0_0= RULE_ID ) )
            // InternalXDrone.g:1259:4: (lv_object_name_0_0= RULE_ID )
            {
            // InternalXDrone.g:1259:4: (lv_object_name_0_0= RULE_ID )
            // InternalXDrone.g:1260:5: lv_object_name_0_0= RULE_ID
            {
            lv_object_name_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_1=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getObjectAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDrone.g:1284:3: ( ( (lv_origin_3_0= ruleOrigin ) ) | ( (lv_size_4_0= ruleSize ) ) | ( (lv_color_5_0= ruleColor ) ) )*
            loop8:
            do {
                int alt8=4;
                switch ( input.LA(1) ) {
                case 34:
                    {
                    alt8=1;
                    }
                    break;
                case 35:
                    {
                    alt8=2;
                    }
                    break;
                case 38:
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalXDrone.g:1285:4: ( (lv_origin_3_0= ruleOrigin ) )
            	    {
            	    // InternalXDrone.g:1285:4: ( (lv_origin_3_0= ruleOrigin ) )
            	    // InternalXDrone.g:1286:5: (lv_origin_3_0= ruleOrigin )
            	    {
            	    // InternalXDrone.g:1286:5: (lv_origin_3_0= ruleOrigin )
            	    // InternalXDrone.g:1287:6: lv_origin_3_0= ruleOrigin
            	    {

            	    						newCompositeNode(grammarAccess.getObjectAccess().getOriginOriginParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_origin_3_0=ruleOrigin();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getObjectRule());
            	    						}
            	    						set(
            	    							current,
            	    							"origin",
            	    							lv_origin_3_0,
            	    							"ic.ac.uk.xdrone.XDrone.Origin");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDrone.g:1305:4: ( (lv_size_4_0= ruleSize ) )
            	    {
            	    // InternalXDrone.g:1305:4: ( (lv_size_4_0= ruleSize ) )
            	    // InternalXDrone.g:1306:5: (lv_size_4_0= ruleSize )
            	    {
            	    // InternalXDrone.g:1306:5: (lv_size_4_0= ruleSize )
            	    // InternalXDrone.g:1307:6: lv_size_4_0= ruleSize
            	    {

            	    						newCompositeNode(grammarAccess.getObjectAccess().getSizeSizeParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_size_4_0=ruleSize();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getObjectRule());
            	    						}
            	    						set(
            	    							current,
            	    							"size",
            	    							lv_size_4_0,
            	    							"ic.ac.uk.xdrone.XDrone.Size");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDrone.g:1325:4: ( (lv_color_5_0= ruleColor ) )
            	    {
            	    // InternalXDrone.g:1325:4: ( (lv_color_5_0= ruleColor ) )
            	    // InternalXDrone.g:1326:5: (lv_color_5_0= ruleColor )
            	    {
            	    // InternalXDrone.g:1326:5: (lv_color_5_0= ruleColor )
            	    // InternalXDrone.g:1327:6: lv_color_5_0= ruleColor
            	    {

            	    						newCompositeNode(grammarAccess.getObjectAccess().getColorColorParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_color_5_0=ruleColor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getObjectRule());
            	    						}
            	    						set(
            	    							current,
            	    							"color",
            	    							lv_color_5_0,
            	    							"ic.ac.uk.xdrone.XDrone.Color");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalXDrone.g:1353:1: entryRuleOrigin returns [EObject current=null] : iv_ruleOrigin= ruleOrigin EOF ;
    public final EObject entryRuleOrigin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrigin = null;


        try {
            // InternalXDrone.g:1353:47: (iv_ruleOrigin= ruleOrigin EOF )
            // InternalXDrone.g:1354:2: iv_ruleOrigin= ruleOrigin EOF
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
    // InternalXDrone.g:1360:1: ruleOrigin returns [EObject current=null] : (otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) ;
    public final EObject ruleOrigin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vector_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1366:2: ( (otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) )
            // InternalXDrone.g:1367:2: (otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            {
            // InternalXDrone.g:1367:2: (otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            // InternalXDrone.g:1368:3: otherlv_0= 'origin' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getOriginAccess().getOriginKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOriginAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1376:3: ( (lv_vector_2_0= ruleVector ) )
            // InternalXDrone.g:1377:4: (lv_vector_2_0= ruleVector )
            {
            // InternalXDrone.g:1377:4: (lv_vector_2_0= ruleVector )
            // InternalXDrone.g:1378:5: lv_vector_2_0= ruleVector
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
    // InternalXDrone.g:1399:1: entryRuleSize returns [EObject current=null] : iv_ruleSize= ruleSize EOF ;
    public final EObject entryRuleSize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSize = null;


        try {
            // InternalXDrone.g:1399:45: (iv_ruleSize= ruleSize EOF )
            // InternalXDrone.g:1400:2: iv_ruleSize= ruleSize EOF
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
    // InternalXDrone.g:1406:1: ruleSize returns [EObject current=null] : (otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) ;
    public final EObject ruleSize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vector_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1412:2: ( (otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) )
            // InternalXDrone.g:1413:2: (otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            {
            // InternalXDrone.g:1413:2: (otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            // InternalXDrone.g:1414:3: otherlv_0= 'size' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSizeAccess().getSizeKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSizeAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1422:3: ( (lv_vector_2_0= ruleVector ) )
            // InternalXDrone.g:1423:4: (lv_vector_2_0= ruleVector )
            {
            // InternalXDrone.g:1423:4: (lv_vector_2_0= ruleVector )
            // InternalXDrone.g:1424:5: lv_vector_2_0= ruleVector
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
    // InternalXDrone.g:1445:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalXDrone.g:1445:49: (iv_rulePosition= rulePosition EOF )
            // InternalXDrone.g:1446:2: iv_rulePosition= rulePosition EOF
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
    // InternalXDrone.g:1452:1: rulePosition returns [EObject current=null] : (otherlv_0= 'position' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_vector_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1458:2: ( (otherlv_0= 'position' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) ) )
            // InternalXDrone.g:1459:2: (otherlv_0= 'position' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            {
            // InternalXDrone.g:1459:2: (otherlv_0= 'position' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) ) )
            // InternalXDrone.g:1460:3: otherlv_0= 'position' otherlv_1= '=' ( (lv_vector_2_0= ruleVector ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getPositionAccess().getPositionKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPositionAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1468:3: ( (lv_vector_2_0= ruleVector ) )
            // InternalXDrone.g:1469:4: (lv_vector_2_0= ruleVector )
            {
            // InternalXDrone.g:1469:4: (lv_vector_2_0= ruleVector )
            // InternalXDrone.g:1470:5: lv_vector_2_0= ruleVector
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
    // InternalXDrone.g:1491:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // InternalXDrone.g:1491:47: (iv_ruleVector= ruleVector EOF )
            // InternalXDrone.g:1492:2: iv_ruleVector= ruleVector EOF
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
    // InternalXDrone.g:1498:1: ruleVector returns [EObject current=null] : (otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' ) ;
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
            // InternalXDrone.g:1504:2: ( (otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' ) )
            // InternalXDrone.g:1505:2: (otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' )
            {
            // InternalXDrone.g:1505:2: (otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')' )
            // InternalXDrone.g:1506:3: otherlv_0= '(' ( (lv_x_1_0= ruleDOUBLE ) ) otherlv_2= ',' ( (lv_y_3_0= ruleDOUBLE ) ) otherlv_4= ',' ( (lv_z_5_0= ruleDOUBLE ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getLeftParenthesisKeyword_0());
            		
            // InternalXDrone.g:1510:3: ( (lv_x_1_0= ruleDOUBLE ) )
            // InternalXDrone.g:1511:4: (lv_x_1_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1511:4: (lv_x_1_0= ruleDOUBLE )
            // InternalXDrone.g:1512:5: lv_x_1_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getVectorAccess().getXDOUBLEParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_2=(Token)match(input,37,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getVectorAccess().getCommaKeyword_2());
            		
            // InternalXDrone.g:1533:3: ( (lv_y_3_0= ruleDOUBLE ) )
            // InternalXDrone.g:1534:4: (lv_y_3_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1534:4: (lv_y_3_0= ruleDOUBLE )
            // InternalXDrone.g:1535:5: lv_y_3_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getVectorAccess().getYDOUBLEParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            otherlv_4=(Token)match(input,37,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getVectorAccess().getCommaKeyword_4());
            		
            // InternalXDrone.g:1556:3: ( (lv_z_5_0= ruleDOUBLE ) )
            // InternalXDrone.g:1557:4: (lv_z_5_0= ruleDOUBLE )
            {
            // InternalXDrone.g:1557:4: (lv_z_5_0= ruleDOUBLE )
            // InternalXDrone.g:1558:5: lv_z_5_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getVectorAccess().getZDOUBLEParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

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
    // InternalXDrone.g:1583:1: entryRuleColor returns [EObject current=null] : iv_ruleColor= ruleColor EOF ;
    public final EObject entryRuleColor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColor = null;


        try {
            // InternalXDrone.g:1583:46: (iv_ruleColor= ruleColor EOF )
            // InternalXDrone.g:1584:2: iv_ruleColor= ruleColor EOF
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
    // InternalXDrone.g:1590:1: ruleColor returns [EObject current=null] : (otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleColor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_color_value_2_0=null;


        	enterRule();

        try {
            // InternalXDrone.g:1596:2: ( (otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) ) ) )
            // InternalXDrone.g:1597:2: (otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) ) )
            {
            // InternalXDrone.g:1597:2: (otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) ) )
            // InternalXDrone.g:1598:3: otherlv_0= 'color' otherlv_1= '=' ( (lv_color_value_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getColorAccess().getColorKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getColorAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1606:3: ( (lv_color_value_2_0= RULE_STRING ) )
            // InternalXDrone.g:1607:4: (lv_color_value_2_0= RULE_STRING )
            {
            // InternalXDrone.g:1607:4: (lv_color_value_2_0= RULE_STRING )
            // InternalXDrone.g:1608:5: lv_color_value_2_0= RULE_STRING
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
    // InternalXDrone.g:1628:1: entryRuleWalls returns [EObject current=null] : iv_ruleWalls= ruleWalls EOF ;
    public final EObject entryRuleWalls() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWalls = null;


        try {
            // InternalXDrone.g:1628:46: (iv_ruleWalls= ruleWalls EOF )
            // InternalXDrone.g:1629:2: iv_ruleWalls= ruleWalls EOF
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
    // InternalXDrone.g:1635:1: ruleWalls returns [EObject current=null] : (otherlv_0= 'WALLS' otherlv_1= '=' otherlv_2= '{' ( ( (lv_front_3_0= ruleFrontWall ) ) | ( (lv_right_4_0= ruleRightWall ) ) | ( (lv_back_5_0= ruleBackWall ) ) | ( (lv_left_6_0= ruleLeftWall ) ) | ( (lv_up_7_0= ruleUpWall ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleWalls() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
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
            // InternalXDrone.g:1641:2: ( (otherlv_0= 'WALLS' otherlv_1= '=' otherlv_2= '{' ( ( (lv_front_3_0= ruleFrontWall ) ) | ( (lv_right_4_0= ruleRightWall ) ) | ( (lv_back_5_0= ruleBackWall ) ) | ( (lv_left_6_0= ruleLeftWall ) ) | ( (lv_up_7_0= ruleUpWall ) ) )* otherlv_8= '}' ) )
            // InternalXDrone.g:1642:2: (otherlv_0= 'WALLS' otherlv_1= '=' otherlv_2= '{' ( ( (lv_front_3_0= ruleFrontWall ) ) | ( (lv_right_4_0= ruleRightWall ) ) | ( (lv_back_5_0= ruleBackWall ) ) | ( (lv_left_6_0= ruleLeftWall ) ) | ( (lv_up_7_0= ruleUpWall ) ) )* otherlv_8= '}' )
            {
            // InternalXDrone.g:1642:2: (otherlv_0= 'WALLS' otherlv_1= '=' otherlv_2= '{' ( ( (lv_front_3_0= ruleFrontWall ) ) | ( (lv_right_4_0= ruleRightWall ) ) | ( (lv_back_5_0= ruleBackWall ) ) | ( (lv_left_6_0= ruleLeftWall ) ) | ( (lv_up_7_0= ruleUpWall ) ) )* otherlv_8= '}' )
            // InternalXDrone.g:1643:3: otherlv_0= 'WALLS' otherlv_1= '=' otherlv_2= '{' ( ( (lv_front_3_0= ruleFrontWall ) ) | ( (lv_right_4_0= ruleRightWall ) ) | ( (lv_back_5_0= ruleBackWall ) ) | ( (lv_left_6_0= ruleLeftWall ) ) | ( (lv_up_7_0= ruleUpWall ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getWallsAccess().getWALLSKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getWallsAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getWallsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalXDrone.g:1655:3: ( ( (lv_front_3_0= ruleFrontWall ) ) | ( (lv_right_4_0= ruleRightWall ) ) | ( (lv_back_5_0= ruleBackWall ) ) | ( (lv_left_6_0= ruleLeftWall ) ) | ( (lv_up_7_0= ruleUpWall ) ) )*
            loop9:
            do {
                int alt9=6;
                switch ( input.LA(1) ) {
                case 40:
                    {
                    alt9=1;
                    }
                    break;
                case 41:
                    {
                    alt9=2;
                    }
                    break;
                case 43:
                    {
                    alt9=3;
                    }
                    break;
                case 42:
                    {
                    alt9=4;
                    }
                    break;
                case 44:
                    {
                    alt9=5;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // InternalXDrone.g:1656:4: ( (lv_front_3_0= ruleFrontWall ) )
            	    {
            	    // InternalXDrone.g:1656:4: ( (lv_front_3_0= ruleFrontWall ) )
            	    // InternalXDrone.g:1657:5: (lv_front_3_0= ruleFrontWall )
            	    {
            	    // InternalXDrone.g:1657:5: (lv_front_3_0= ruleFrontWall )
            	    // InternalXDrone.g:1658:6: lv_front_3_0= ruleFrontWall
            	    {

            	    						newCompositeNode(grammarAccess.getWallsAccess().getFrontFrontWallParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_front_3_0=ruleFrontWall();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWallsRule());
            	    						}
            	    						set(
            	    							current,
            	    							"front",
            	    							lv_front_3_0,
            	    							"ic.ac.uk.xdrone.XDrone.FrontWall");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalXDrone.g:1676:4: ( (lv_right_4_0= ruleRightWall ) )
            	    {
            	    // InternalXDrone.g:1676:4: ( (lv_right_4_0= ruleRightWall ) )
            	    // InternalXDrone.g:1677:5: (lv_right_4_0= ruleRightWall )
            	    {
            	    // InternalXDrone.g:1677:5: (lv_right_4_0= ruleRightWall )
            	    // InternalXDrone.g:1678:6: lv_right_4_0= ruleRightWall
            	    {

            	    						newCompositeNode(grammarAccess.getWallsAccess().getRightRightWallParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_right_4_0=ruleRightWall();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWallsRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_4_0,
            	    							"ic.ac.uk.xdrone.XDrone.RightWall");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalXDrone.g:1696:4: ( (lv_back_5_0= ruleBackWall ) )
            	    {
            	    // InternalXDrone.g:1696:4: ( (lv_back_5_0= ruleBackWall ) )
            	    // InternalXDrone.g:1697:5: (lv_back_5_0= ruleBackWall )
            	    {
            	    // InternalXDrone.g:1697:5: (lv_back_5_0= ruleBackWall )
            	    // InternalXDrone.g:1698:6: lv_back_5_0= ruleBackWall
            	    {

            	    						newCompositeNode(grammarAccess.getWallsAccess().getBackBackWallParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_back_5_0=ruleBackWall();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWallsRule());
            	    						}
            	    						set(
            	    							current,
            	    							"back",
            	    							lv_back_5_0,
            	    							"ic.ac.uk.xdrone.XDrone.BackWall");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalXDrone.g:1716:4: ( (lv_left_6_0= ruleLeftWall ) )
            	    {
            	    // InternalXDrone.g:1716:4: ( (lv_left_6_0= ruleLeftWall ) )
            	    // InternalXDrone.g:1717:5: (lv_left_6_0= ruleLeftWall )
            	    {
            	    // InternalXDrone.g:1717:5: (lv_left_6_0= ruleLeftWall )
            	    // InternalXDrone.g:1718:6: lv_left_6_0= ruleLeftWall
            	    {

            	    						newCompositeNode(grammarAccess.getWallsAccess().getLeftLeftWallParserRuleCall_3_3_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_left_6_0=ruleLeftWall();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWallsRule());
            	    						}
            	    						set(
            	    							current,
            	    							"left",
            	    							lv_left_6_0,
            	    							"ic.ac.uk.xdrone.XDrone.LeftWall");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalXDrone.g:1736:4: ( (lv_up_7_0= ruleUpWall ) )
            	    {
            	    // InternalXDrone.g:1736:4: ( (lv_up_7_0= ruleUpWall ) )
            	    // InternalXDrone.g:1737:5: (lv_up_7_0= ruleUpWall )
            	    {
            	    // InternalXDrone.g:1737:5: (lv_up_7_0= ruleUpWall )
            	    // InternalXDrone.g:1738:6: lv_up_7_0= ruleUpWall
            	    {

            	    						newCompositeNode(grammarAccess.getWallsAccess().getUpUpWallParserRuleCall_3_4_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_up_7_0=ruleUpWall();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWallsRule());
            	    						}
            	    						set(
            	    							current,
            	    							"up",
            	    							lv_up_7_0,
            	    							"ic.ac.uk.xdrone.XDrone.UpWall");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getWallsAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleFrontWall"
    // InternalXDrone.g:1764:1: entryRuleFrontWall returns [EObject current=null] : iv_ruleFrontWall= ruleFrontWall EOF ;
    public final EObject entryRuleFrontWall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFrontWall = null;


        try {
            // InternalXDrone.g:1764:50: (iv_ruleFrontWall= ruleFrontWall EOF )
            // InternalXDrone.g:1765:2: iv_ruleFrontWall= ruleFrontWall EOF
            {
             newCompositeNode(grammarAccess.getFrontWallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFrontWall=ruleFrontWall();

            state._fsp--;

             current =iv_ruleFrontWall; 
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
    // $ANTLR end "entryRuleFrontWall"


    // $ANTLR start "ruleFrontWall"
    // InternalXDrone.g:1771:1: ruleFrontWall returns [EObject current=null] : (otherlv_0= 'front' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) ;
    public final EObject ruleFrontWall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1777:2: ( (otherlv_0= 'front' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) )
            // InternalXDrone.g:1778:2: (otherlv_0= 'front' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            {
            // InternalXDrone.g:1778:2: (otherlv_0= 'front' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            // InternalXDrone.g:1779:3: otherlv_0= 'front' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getFrontWallAccess().getFrontKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getFrontWallAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1787:3: ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1788:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1788:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1789:5: lv_value_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getFrontWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFrontWallRule());
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
    // $ANTLR end "ruleFrontWall"


    // $ANTLR start "entryRuleRightWall"
    // InternalXDrone.g:1810:1: entryRuleRightWall returns [EObject current=null] : iv_ruleRightWall= ruleRightWall EOF ;
    public final EObject entryRuleRightWall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightWall = null;


        try {
            // InternalXDrone.g:1810:50: (iv_ruleRightWall= ruleRightWall EOF )
            // InternalXDrone.g:1811:2: iv_ruleRightWall= ruleRightWall EOF
            {
             newCompositeNode(grammarAccess.getRightWallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightWall=ruleRightWall();

            state._fsp--;

             current =iv_ruleRightWall; 
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
    // $ANTLR end "entryRuleRightWall"


    // $ANTLR start "ruleRightWall"
    // InternalXDrone.g:1817:1: ruleRightWall returns [EObject current=null] : (otherlv_0= 'right' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) ;
    public final EObject ruleRightWall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1823:2: ( (otherlv_0= 'right' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) )
            // InternalXDrone.g:1824:2: (otherlv_0= 'right' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            {
            // InternalXDrone.g:1824:2: (otherlv_0= 'right' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            // InternalXDrone.g:1825:3: otherlv_0= 'right' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getRightWallAccess().getRightKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getRightWallAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1833:3: ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1834:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1834:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1835:5: lv_value_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getRightWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRightWallRule());
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
    // $ANTLR end "ruleRightWall"


    // $ANTLR start "entryRuleLeftWall"
    // InternalXDrone.g:1856:1: entryRuleLeftWall returns [EObject current=null] : iv_ruleLeftWall= ruleLeftWall EOF ;
    public final EObject entryRuleLeftWall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftWall = null;


        try {
            // InternalXDrone.g:1856:49: (iv_ruleLeftWall= ruleLeftWall EOF )
            // InternalXDrone.g:1857:2: iv_ruleLeftWall= ruleLeftWall EOF
            {
             newCompositeNode(grammarAccess.getLeftWallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftWall=ruleLeftWall();

            state._fsp--;

             current =iv_ruleLeftWall; 
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
    // $ANTLR end "entryRuleLeftWall"


    // $ANTLR start "ruleLeftWall"
    // InternalXDrone.g:1863:1: ruleLeftWall returns [EObject current=null] : (otherlv_0= 'left' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) ;
    public final EObject ruleLeftWall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1869:2: ( (otherlv_0= 'left' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) )
            // InternalXDrone.g:1870:2: (otherlv_0= 'left' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            {
            // InternalXDrone.g:1870:2: (otherlv_0= 'left' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            // InternalXDrone.g:1871:3: otherlv_0= 'left' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getLeftWallAccess().getLeftKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftWallAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1879:3: ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1880:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1880:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1881:5: lv_value_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getLeftWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeftWallRule());
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
    // $ANTLR end "ruleLeftWall"


    // $ANTLR start "entryRuleBackWall"
    // InternalXDrone.g:1902:1: entryRuleBackWall returns [EObject current=null] : iv_ruleBackWall= ruleBackWall EOF ;
    public final EObject entryRuleBackWall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackWall = null;


        try {
            // InternalXDrone.g:1902:49: (iv_ruleBackWall= ruleBackWall EOF )
            // InternalXDrone.g:1903:2: iv_ruleBackWall= ruleBackWall EOF
            {
             newCompositeNode(grammarAccess.getBackWallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackWall=ruleBackWall();

            state._fsp--;

             current =iv_ruleBackWall; 
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
    // $ANTLR end "entryRuleBackWall"


    // $ANTLR start "ruleBackWall"
    // InternalXDrone.g:1909:1: ruleBackWall returns [EObject current=null] : (otherlv_0= 'back' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) ;
    public final EObject ruleBackWall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1915:2: ( (otherlv_0= 'back' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) )
            // InternalXDrone.g:1916:2: (otherlv_0= 'back' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            {
            // InternalXDrone.g:1916:2: (otherlv_0= 'back' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            // InternalXDrone.g:1917:3: otherlv_0= 'back' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getBackWallAccess().getBackKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getBackWallAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1925:3: ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1926:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1926:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1927:5: lv_value_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getBackWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBackWallRule());
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
    // $ANTLR end "ruleBackWall"


    // $ANTLR start "entryRuleUpWall"
    // InternalXDrone.g:1948:1: entryRuleUpWall returns [EObject current=null] : iv_ruleUpWall= ruleUpWall EOF ;
    public final EObject entryRuleUpWall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpWall = null;


        try {
            // InternalXDrone.g:1948:47: (iv_ruleUpWall= ruleUpWall EOF )
            // InternalXDrone.g:1949:2: iv_ruleUpWall= ruleUpWall EOF
            {
             newCompositeNode(grammarAccess.getUpWallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpWall=ruleUpWall();

            state._fsp--;

             current =iv_ruleUpWall; 
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
    // $ANTLR end "entryRuleUpWall"


    // $ANTLR start "ruleUpWall"
    // InternalXDrone.g:1955:1: ruleUpWall returns [EObject current=null] : (otherlv_0= 'up' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) ;
    public final EObject ruleUpWall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXDrone.g:1961:2: ( (otherlv_0= 'up' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) ) )
            // InternalXDrone.g:1962:2: (otherlv_0= 'up' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            {
            // InternalXDrone.g:1962:2: (otherlv_0= 'up' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) ) )
            // InternalXDrone.g:1963:3: otherlv_0= 'up' otherlv_1= '=' ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getUpWallAccess().getUpKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getUpWallAccess().getEqualsSignKeyword_1());
            		
            // InternalXDrone.g:1971:3: ( (lv_value_2_0= rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1972:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1972:4: (lv_value_2_0= rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1973:5: lv_value_2_0= rulePOSITIVE_DOUBLE
            {

            					newCompositeNode(grammarAccess.getUpWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=rulePOSITIVE_DOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpWallRule());
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
    // $ANTLR end "ruleUpWall"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000007FE40000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008080008040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001200008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000004C00008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00001F0000008000L});

}