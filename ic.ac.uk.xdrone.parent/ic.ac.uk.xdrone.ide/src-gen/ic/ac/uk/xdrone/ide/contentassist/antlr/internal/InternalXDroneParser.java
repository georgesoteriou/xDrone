package ic.ac.uk.xdrone.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import ic.ac.uk.xdrone.services.XDroneGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXDroneParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(XDroneGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalXDrone.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalXDrone.g:54:1: ( ruleProgram EOF )
            // InternalXDrone.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalXDrone.g:62:1: ruleProgram : ( ( rule__Program__MainAssignment ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:66:2: ( ( ( rule__Program__MainAssignment ) ) )
            // InternalXDrone.g:67:2: ( ( rule__Program__MainAssignment ) )
            {
            // InternalXDrone.g:67:2: ( ( rule__Program__MainAssignment ) )
            // InternalXDrone.g:68:3: ( rule__Program__MainAssignment )
            {
             before(grammarAccess.getProgramAccess().getMainAssignment()); 
            // InternalXDrone.g:69:3: ( rule__Program__MainAssignment )
            // InternalXDrone.g:69:4: rule__Program__MainAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Program__MainAssignment();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getMainAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleMain"
    // InternalXDrone.g:78:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // InternalXDrone.g:79:1: ( ruleMain EOF )
            // InternalXDrone.g:80:1: ruleMain EOF
            {
             before(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getMainRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalXDrone.g:87:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:91:2: ( ( ( rule__Main__Group__0 ) ) )
            // InternalXDrone.g:92:2: ( ( rule__Main__Group__0 ) )
            {
            // InternalXDrone.g:92:2: ( ( rule__Main__Group__0 ) )
            // InternalXDrone.g:93:3: ( rule__Main__Group__0 )
            {
             before(grammarAccess.getMainAccess().getGroup()); 
            // InternalXDrone.g:94:3: ( rule__Main__Group__0 )
            // InternalXDrone.g:94:4: rule__Main__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleFly"
    // InternalXDrone.g:103:1: entryRuleFly : ruleFly EOF ;
    public final void entryRuleFly() throws RecognitionException {
        try {
            // InternalXDrone.g:104:1: ( ruleFly EOF )
            // InternalXDrone.g:105:1: ruleFly EOF
            {
             before(grammarAccess.getFlyRule()); 
            pushFollow(FOLLOW_1);
            ruleFly();

            state._fsp--;

             after(grammarAccess.getFlyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFly"


    // $ANTLR start "ruleFly"
    // InternalXDrone.g:112:1: ruleFly : ( ( rule__Fly__Group__0 ) ) ;
    public final void ruleFly() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:116:2: ( ( ( rule__Fly__Group__0 ) ) )
            // InternalXDrone.g:117:2: ( ( rule__Fly__Group__0 ) )
            {
            // InternalXDrone.g:117:2: ( ( rule__Fly__Group__0 ) )
            // InternalXDrone.g:118:3: ( rule__Fly__Group__0 )
            {
             before(grammarAccess.getFlyAccess().getGroup()); 
            // InternalXDrone.g:119:3: ( rule__Fly__Group__0 )
            // InternalXDrone.g:119:4: rule__Fly__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fly__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFlyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFly"


    // $ANTLR start "entryRuleEnvironment"
    // InternalXDrone.g:128:1: entryRuleEnvironment : ruleEnvironment EOF ;
    public final void entryRuleEnvironment() throws RecognitionException {
        try {
            // InternalXDrone.g:129:1: ( ruleEnvironment EOF )
            // InternalXDrone.g:130:1: ruleEnvironment EOF
            {
             before(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getEnvironmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalXDrone.g:137:1: ruleEnvironment : ( ( rule__Environment__Group__0 ) ) ;
    public final void ruleEnvironment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:141:2: ( ( ( rule__Environment__Group__0 ) ) )
            // InternalXDrone.g:142:2: ( ( rule__Environment__Group__0 ) )
            {
            // InternalXDrone.g:142:2: ( ( rule__Environment__Group__0 ) )
            // InternalXDrone.g:143:3: ( rule__Environment__Group__0 )
            {
             before(grammarAccess.getEnvironmentAccess().getGroup()); 
            // InternalXDrone.g:144:3: ( rule__Environment__Group__0 )
            // InternalXDrone.g:144:4: rule__Environment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnvironmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleTakeoff"
    // InternalXDrone.g:153:1: entryRuleTakeoff : ruleTakeoff EOF ;
    public final void entryRuleTakeoff() throws RecognitionException {
        try {
            // InternalXDrone.g:154:1: ( ruleTakeoff EOF )
            // InternalXDrone.g:155:1: ruleTakeoff EOF
            {
             before(grammarAccess.getTakeoffRule()); 
            pushFollow(FOLLOW_1);
            ruleTakeoff();

            state._fsp--;

             after(grammarAccess.getTakeoffRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTakeoff"


    // $ANTLR start "ruleTakeoff"
    // InternalXDrone.g:162:1: ruleTakeoff : ( ( rule__Takeoff__Group__0 ) ) ;
    public final void ruleTakeoff() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:166:2: ( ( ( rule__Takeoff__Group__0 ) ) )
            // InternalXDrone.g:167:2: ( ( rule__Takeoff__Group__0 ) )
            {
            // InternalXDrone.g:167:2: ( ( rule__Takeoff__Group__0 ) )
            // InternalXDrone.g:168:3: ( rule__Takeoff__Group__0 )
            {
             before(grammarAccess.getTakeoffAccess().getGroup()); 
            // InternalXDrone.g:169:3: ( rule__Takeoff__Group__0 )
            // InternalXDrone.g:169:4: rule__Takeoff__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Takeoff__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTakeoffAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTakeoff"


    // $ANTLR start "entryRuleLand"
    // InternalXDrone.g:178:1: entryRuleLand : ruleLand EOF ;
    public final void entryRuleLand() throws RecognitionException {
        try {
            // InternalXDrone.g:179:1: ( ruleLand EOF )
            // InternalXDrone.g:180:1: ruleLand EOF
            {
             before(grammarAccess.getLandRule()); 
            pushFollow(FOLLOW_1);
            ruleLand();

            state._fsp--;

             after(grammarAccess.getLandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLand"


    // $ANTLR start "ruleLand"
    // InternalXDrone.g:187:1: ruleLand : ( ( rule__Land__Group__0 ) ) ;
    public final void ruleLand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:191:2: ( ( ( rule__Land__Group__0 ) ) )
            // InternalXDrone.g:192:2: ( ( rule__Land__Group__0 ) )
            {
            // InternalXDrone.g:192:2: ( ( rule__Land__Group__0 ) )
            // InternalXDrone.g:193:3: ( rule__Land__Group__0 )
            {
             before(grammarAccess.getLandAccess().getGroup()); 
            // InternalXDrone.g:194:3: ( rule__Land__Group__0 )
            // InternalXDrone.g:194:4: rule__Land__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Land__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLand"


    // $ANTLR start "entryRuleSuperCommand"
    // InternalXDrone.g:203:1: entryRuleSuperCommand : ruleSuperCommand EOF ;
    public final void entryRuleSuperCommand() throws RecognitionException {
        try {
            // InternalXDrone.g:204:1: ( ruleSuperCommand EOF )
            // InternalXDrone.g:205:1: ruleSuperCommand EOF
            {
             before(grammarAccess.getSuperCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleSuperCommand();

            state._fsp--;

             after(grammarAccess.getSuperCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSuperCommand"


    // $ANTLR start "ruleSuperCommand"
    // InternalXDrone.g:212:1: ruleSuperCommand : ( ruleCommand ) ;
    public final void ruleSuperCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:216:2: ( ( ruleCommand ) )
            // InternalXDrone.g:217:2: ( ruleCommand )
            {
            // InternalXDrone.g:217:2: ( ruleCommand )
            // InternalXDrone.g:218:3: ruleCommand
            {
             before(grammarAccess.getSuperCommandAccess().getCommandParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getSuperCommandAccess().getCommandParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSuperCommand"


    // $ANTLR start "entryRuleCommand"
    // InternalXDrone.g:228:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalXDrone.g:229:1: ( ruleCommand EOF )
            // InternalXDrone.g:230:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalXDrone.g:237:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:241:2: ( ( ( rule__Command__Alternatives ) ) )
            // InternalXDrone.g:242:2: ( ( rule__Command__Alternatives ) )
            {
            // InternalXDrone.g:242:2: ( ( rule__Command__Alternatives ) )
            // InternalXDrone.g:243:3: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // InternalXDrone.g:244:3: ( rule__Command__Alternatives )
            // InternalXDrone.g:244:4: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Command__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalXDrone.g:253:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalXDrone.g:254:1: ( ruleDOUBLE EOF )
            // InternalXDrone.g:255:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalXDrone.g:262:1: ruleDOUBLE : ( ( rule__DOUBLE__Alternatives ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:266:2: ( ( ( rule__DOUBLE__Alternatives ) ) )
            // InternalXDrone.g:267:2: ( ( rule__DOUBLE__Alternatives ) )
            {
            // InternalXDrone.g:267:2: ( ( rule__DOUBLE__Alternatives ) )
            // InternalXDrone.g:268:3: ( rule__DOUBLE__Alternatives )
            {
             before(grammarAccess.getDOUBLEAccess().getAlternatives()); 
            // InternalXDrone.g:269:3: ( rule__DOUBLE__Alternatives )
            // InternalXDrone.g:269:4: rule__DOUBLE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDOUBLEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRulePOSITIVE_DOUBLE"
    // InternalXDrone.g:278:1: entryRulePOSITIVE_DOUBLE : rulePOSITIVE_DOUBLE EOF ;
    public final void entryRulePOSITIVE_DOUBLE() throws RecognitionException {
        try {
            // InternalXDrone.g:279:1: ( rulePOSITIVE_DOUBLE EOF )
            // InternalXDrone.g:280:1: rulePOSITIVE_DOUBLE EOF
            {
             before(grammarAccess.getPOSITIVE_DOUBLERule()); 
            pushFollow(FOLLOW_1);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getPOSITIVE_DOUBLERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePOSITIVE_DOUBLE"


    // $ANTLR start "rulePOSITIVE_DOUBLE"
    // InternalXDrone.g:287:1: rulePOSITIVE_DOUBLE : ( ( rule__POSITIVE_DOUBLE__Alternatives ) ) ;
    public final void rulePOSITIVE_DOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:291:2: ( ( ( rule__POSITIVE_DOUBLE__Alternatives ) ) )
            // InternalXDrone.g:292:2: ( ( rule__POSITIVE_DOUBLE__Alternatives ) )
            {
            // InternalXDrone.g:292:2: ( ( rule__POSITIVE_DOUBLE__Alternatives ) )
            // InternalXDrone.g:293:3: ( rule__POSITIVE_DOUBLE__Alternatives )
            {
             before(grammarAccess.getPOSITIVE_DOUBLEAccess().getAlternatives()); 
            // InternalXDrone.g:294:3: ( rule__POSITIVE_DOUBLE__Alternatives )
            // InternalXDrone.g:294:4: rule__POSITIVE_DOUBLE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__POSITIVE_DOUBLE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPOSITIVE_DOUBLEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePOSITIVE_DOUBLE"


    // $ANTLR start "entryRuleGoTo"
    // InternalXDrone.g:303:1: entryRuleGoTo : ruleGoTo EOF ;
    public final void entryRuleGoTo() throws RecognitionException {
        try {
            // InternalXDrone.g:304:1: ( ruleGoTo EOF )
            // InternalXDrone.g:305:1: ruleGoTo EOF
            {
             before(grammarAccess.getGoToRule()); 
            pushFollow(FOLLOW_1);
            ruleGoTo();

            state._fsp--;

             after(grammarAccess.getGoToRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGoTo"


    // $ANTLR start "ruleGoTo"
    // InternalXDrone.g:312:1: ruleGoTo : ( ( rule__GoTo__Group__0 ) ) ;
    public final void ruleGoTo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:316:2: ( ( ( rule__GoTo__Group__0 ) ) )
            // InternalXDrone.g:317:2: ( ( rule__GoTo__Group__0 ) )
            {
            // InternalXDrone.g:317:2: ( ( rule__GoTo__Group__0 ) )
            // InternalXDrone.g:318:3: ( rule__GoTo__Group__0 )
            {
             before(grammarAccess.getGoToAccess().getGroup()); 
            // InternalXDrone.g:319:3: ( rule__GoTo__Group__0 )
            // InternalXDrone.g:319:4: rule__GoTo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGoTo"


    // $ANTLR start "entryRuleUp"
    // InternalXDrone.g:328:1: entryRuleUp : ruleUp EOF ;
    public final void entryRuleUp() throws RecognitionException {
        try {
            // InternalXDrone.g:329:1: ( ruleUp EOF )
            // InternalXDrone.g:330:1: ruleUp EOF
            {
             before(grammarAccess.getUpRule()); 
            pushFollow(FOLLOW_1);
            ruleUp();

            state._fsp--;

             after(grammarAccess.getUpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUp"


    // $ANTLR start "ruleUp"
    // InternalXDrone.g:337:1: ruleUp : ( ( rule__Up__Group__0 ) ) ;
    public final void ruleUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:341:2: ( ( ( rule__Up__Group__0 ) ) )
            // InternalXDrone.g:342:2: ( ( rule__Up__Group__0 ) )
            {
            // InternalXDrone.g:342:2: ( ( rule__Up__Group__0 ) )
            // InternalXDrone.g:343:3: ( rule__Up__Group__0 )
            {
             before(grammarAccess.getUpAccess().getGroup()); 
            // InternalXDrone.g:344:3: ( rule__Up__Group__0 )
            // InternalXDrone.g:344:4: rule__Up__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Up__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUp"


    // $ANTLR start "entryRuleDown"
    // InternalXDrone.g:353:1: entryRuleDown : ruleDown EOF ;
    public final void entryRuleDown() throws RecognitionException {
        try {
            // InternalXDrone.g:354:1: ( ruleDown EOF )
            // InternalXDrone.g:355:1: ruleDown EOF
            {
             before(grammarAccess.getDownRule()); 
            pushFollow(FOLLOW_1);
            ruleDown();

            state._fsp--;

             after(grammarAccess.getDownRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDown"


    // $ANTLR start "ruleDown"
    // InternalXDrone.g:362:1: ruleDown : ( ( rule__Down__Group__0 ) ) ;
    public final void ruleDown() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:366:2: ( ( ( rule__Down__Group__0 ) ) )
            // InternalXDrone.g:367:2: ( ( rule__Down__Group__0 ) )
            {
            // InternalXDrone.g:367:2: ( ( rule__Down__Group__0 ) )
            // InternalXDrone.g:368:3: ( rule__Down__Group__0 )
            {
             before(grammarAccess.getDownAccess().getGroup()); 
            // InternalXDrone.g:369:3: ( rule__Down__Group__0 )
            // InternalXDrone.g:369:4: rule__Down__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Down__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDownAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDown"


    // $ANTLR start "entryRuleLeft"
    // InternalXDrone.g:378:1: entryRuleLeft : ruleLeft EOF ;
    public final void entryRuleLeft() throws RecognitionException {
        try {
            // InternalXDrone.g:379:1: ( ruleLeft EOF )
            // InternalXDrone.g:380:1: ruleLeft EOF
            {
             before(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_1);
            ruleLeft();

            state._fsp--;

             after(grammarAccess.getLeftRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // InternalXDrone.g:387:1: ruleLeft : ( ( rule__Left__Group__0 ) ) ;
    public final void ruleLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:391:2: ( ( ( rule__Left__Group__0 ) ) )
            // InternalXDrone.g:392:2: ( ( rule__Left__Group__0 ) )
            {
            // InternalXDrone.g:392:2: ( ( rule__Left__Group__0 ) )
            // InternalXDrone.g:393:3: ( rule__Left__Group__0 )
            {
             before(grammarAccess.getLeftAccess().getGroup()); 
            // InternalXDrone.g:394:3: ( rule__Left__Group__0 )
            // InternalXDrone.g:394:4: rule__Left__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Left__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeftAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleRight"
    // InternalXDrone.g:403:1: entryRuleRight : ruleRight EOF ;
    public final void entryRuleRight() throws RecognitionException {
        try {
            // InternalXDrone.g:404:1: ( ruleRight EOF )
            // InternalXDrone.g:405:1: ruleRight EOF
            {
             before(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_1);
            ruleRight();

            state._fsp--;

             after(grammarAccess.getRightRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // InternalXDrone.g:412:1: ruleRight : ( ( rule__Right__Group__0 ) ) ;
    public final void ruleRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:416:2: ( ( ( rule__Right__Group__0 ) ) )
            // InternalXDrone.g:417:2: ( ( rule__Right__Group__0 ) )
            {
            // InternalXDrone.g:417:2: ( ( rule__Right__Group__0 ) )
            // InternalXDrone.g:418:3: ( rule__Right__Group__0 )
            {
             before(grammarAccess.getRightAccess().getGroup()); 
            // InternalXDrone.g:419:3: ( rule__Right__Group__0 )
            // InternalXDrone.g:419:4: rule__Right__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Right__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleForward"
    // InternalXDrone.g:428:1: entryRuleForward : ruleForward EOF ;
    public final void entryRuleForward() throws RecognitionException {
        try {
            // InternalXDrone.g:429:1: ( ruleForward EOF )
            // InternalXDrone.g:430:1: ruleForward EOF
            {
             before(grammarAccess.getForwardRule()); 
            pushFollow(FOLLOW_1);
            ruleForward();

            state._fsp--;

             after(grammarAccess.getForwardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForward"


    // $ANTLR start "ruleForward"
    // InternalXDrone.g:437:1: ruleForward : ( ( rule__Forward__Group__0 ) ) ;
    public final void ruleForward() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:441:2: ( ( ( rule__Forward__Group__0 ) ) )
            // InternalXDrone.g:442:2: ( ( rule__Forward__Group__0 ) )
            {
            // InternalXDrone.g:442:2: ( ( rule__Forward__Group__0 ) )
            // InternalXDrone.g:443:3: ( rule__Forward__Group__0 )
            {
             before(grammarAccess.getForwardAccess().getGroup()); 
            // InternalXDrone.g:444:3: ( rule__Forward__Group__0 )
            // InternalXDrone.g:444:4: rule__Forward__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Forward__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForwardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForward"


    // $ANTLR start "entryRuleBackward"
    // InternalXDrone.g:453:1: entryRuleBackward : ruleBackward EOF ;
    public final void entryRuleBackward() throws RecognitionException {
        try {
            // InternalXDrone.g:454:1: ( ruleBackward EOF )
            // InternalXDrone.g:455:1: ruleBackward EOF
            {
             before(grammarAccess.getBackwardRule()); 
            pushFollow(FOLLOW_1);
            ruleBackward();

            state._fsp--;

             after(grammarAccess.getBackwardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBackward"


    // $ANTLR start "ruleBackward"
    // InternalXDrone.g:462:1: ruleBackward : ( ( rule__Backward__Group__0 ) ) ;
    public final void ruleBackward() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:466:2: ( ( ( rule__Backward__Group__0 ) ) )
            // InternalXDrone.g:467:2: ( ( rule__Backward__Group__0 ) )
            {
            // InternalXDrone.g:467:2: ( ( rule__Backward__Group__0 ) )
            // InternalXDrone.g:468:3: ( rule__Backward__Group__0 )
            {
             before(grammarAccess.getBackwardAccess().getGroup()); 
            // InternalXDrone.g:469:3: ( rule__Backward__Group__0 )
            // InternalXDrone.g:469:4: rule__Backward__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Backward__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackwardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBackward"


    // $ANTLR start "entryRuleRotateL"
    // InternalXDrone.g:478:1: entryRuleRotateL : ruleRotateL EOF ;
    public final void entryRuleRotateL() throws RecognitionException {
        try {
            // InternalXDrone.g:479:1: ( ruleRotateL EOF )
            // InternalXDrone.g:480:1: ruleRotateL EOF
            {
             before(grammarAccess.getRotateLRule()); 
            pushFollow(FOLLOW_1);
            ruleRotateL();

            state._fsp--;

             after(grammarAccess.getRotateLRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRotateL"


    // $ANTLR start "ruleRotateL"
    // InternalXDrone.g:487:1: ruleRotateL : ( ( rule__RotateL__Group__0 ) ) ;
    public final void ruleRotateL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:491:2: ( ( ( rule__RotateL__Group__0 ) ) )
            // InternalXDrone.g:492:2: ( ( rule__RotateL__Group__0 ) )
            {
            // InternalXDrone.g:492:2: ( ( rule__RotateL__Group__0 ) )
            // InternalXDrone.g:493:3: ( rule__RotateL__Group__0 )
            {
             before(grammarAccess.getRotateLAccess().getGroup()); 
            // InternalXDrone.g:494:3: ( rule__RotateL__Group__0 )
            // InternalXDrone.g:494:4: rule__RotateL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RotateL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRotateLAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRotateL"


    // $ANTLR start "entryRuleRotateR"
    // InternalXDrone.g:503:1: entryRuleRotateR : ruleRotateR EOF ;
    public final void entryRuleRotateR() throws RecognitionException {
        try {
            // InternalXDrone.g:504:1: ( ruleRotateR EOF )
            // InternalXDrone.g:505:1: ruleRotateR EOF
            {
             before(grammarAccess.getRotateRRule()); 
            pushFollow(FOLLOW_1);
            ruleRotateR();

            state._fsp--;

             after(grammarAccess.getRotateRRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRotateR"


    // $ANTLR start "ruleRotateR"
    // InternalXDrone.g:512:1: ruleRotateR : ( ( rule__RotateR__Group__0 ) ) ;
    public final void ruleRotateR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:516:2: ( ( ( rule__RotateR__Group__0 ) ) )
            // InternalXDrone.g:517:2: ( ( rule__RotateR__Group__0 ) )
            {
            // InternalXDrone.g:517:2: ( ( rule__RotateR__Group__0 ) )
            // InternalXDrone.g:518:3: ( rule__RotateR__Group__0 )
            {
             before(grammarAccess.getRotateRAccess().getGroup()); 
            // InternalXDrone.g:519:3: ( rule__RotateR__Group__0 )
            // InternalXDrone.g:519:4: rule__RotateR__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RotateR__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRotateRAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRotateR"


    // $ANTLR start "entryRuleWait"
    // InternalXDrone.g:528:1: entryRuleWait : ruleWait EOF ;
    public final void entryRuleWait() throws RecognitionException {
        try {
            // InternalXDrone.g:529:1: ( ruleWait EOF )
            // InternalXDrone.g:530:1: ruleWait EOF
            {
             before(grammarAccess.getWaitRule()); 
            pushFollow(FOLLOW_1);
            ruleWait();

            state._fsp--;

             after(grammarAccess.getWaitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // InternalXDrone.g:537:1: ruleWait : ( ( rule__Wait__Group__0 ) ) ;
    public final void ruleWait() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:541:2: ( ( ( rule__Wait__Group__0 ) ) )
            // InternalXDrone.g:542:2: ( ( rule__Wait__Group__0 ) )
            {
            // InternalXDrone.g:542:2: ( ( rule__Wait__Group__0 ) )
            // InternalXDrone.g:543:3: ( rule__Wait__Group__0 )
            {
             before(grammarAccess.getWaitAccess().getGroup()); 
            // InternalXDrone.g:544:3: ( rule__Wait__Group__0 )
            // InternalXDrone.g:544:4: rule__Wait__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Wait__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWaitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleDrone"
    // InternalXDrone.g:553:1: entryRuleDrone : ruleDrone EOF ;
    public final void entryRuleDrone() throws RecognitionException {
        try {
            // InternalXDrone.g:554:1: ( ruleDrone EOF )
            // InternalXDrone.g:555:1: ruleDrone EOF
            {
             before(grammarAccess.getDroneRule()); 
            pushFollow(FOLLOW_1);
            ruleDrone();

            state._fsp--;

             after(grammarAccess.getDroneRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDrone"


    // $ANTLR start "ruleDrone"
    // InternalXDrone.g:562:1: ruleDrone : ( ( rule__Drone__Group__0 ) ) ;
    public final void ruleDrone() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:566:2: ( ( ( rule__Drone__Group__0 ) ) )
            // InternalXDrone.g:567:2: ( ( rule__Drone__Group__0 ) )
            {
            // InternalXDrone.g:567:2: ( ( rule__Drone__Group__0 ) )
            // InternalXDrone.g:568:3: ( rule__Drone__Group__0 )
            {
             before(grammarAccess.getDroneAccess().getGroup()); 
            // InternalXDrone.g:569:3: ( rule__Drone__Group__0 )
            // InternalXDrone.g:569:4: rule__Drone__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Drone__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDrone"


    // $ANTLR start "entryRuleObject"
    // InternalXDrone.g:578:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // InternalXDrone.g:579:1: ( ruleObject EOF )
            // InternalXDrone.g:580:1: ruleObject EOF
            {
             before(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObject"


    // $ANTLR start "ruleObject"
    // InternalXDrone.g:587:1: ruleObject : ( ( rule__Object__Group__0 ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:591:2: ( ( ( rule__Object__Group__0 ) ) )
            // InternalXDrone.g:592:2: ( ( rule__Object__Group__0 ) )
            {
            // InternalXDrone.g:592:2: ( ( rule__Object__Group__0 ) )
            // InternalXDrone.g:593:3: ( rule__Object__Group__0 )
            {
             before(grammarAccess.getObjectAccess().getGroup()); 
            // InternalXDrone.g:594:3: ( rule__Object__Group__0 )
            // InternalXDrone.g:594:4: rule__Object__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObject"


    // $ANTLR start "entryRuleOrigin"
    // InternalXDrone.g:603:1: entryRuleOrigin : ruleOrigin EOF ;
    public final void entryRuleOrigin() throws RecognitionException {
        try {
            // InternalXDrone.g:604:1: ( ruleOrigin EOF )
            // InternalXDrone.g:605:1: ruleOrigin EOF
            {
             before(grammarAccess.getOriginRule()); 
            pushFollow(FOLLOW_1);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getOriginRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrigin"


    // $ANTLR start "ruleOrigin"
    // InternalXDrone.g:612:1: ruleOrigin : ( ( rule__Origin__Group__0 ) ) ;
    public final void ruleOrigin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:616:2: ( ( ( rule__Origin__Group__0 ) ) )
            // InternalXDrone.g:617:2: ( ( rule__Origin__Group__0 ) )
            {
            // InternalXDrone.g:617:2: ( ( rule__Origin__Group__0 ) )
            // InternalXDrone.g:618:3: ( rule__Origin__Group__0 )
            {
             before(grammarAccess.getOriginAccess().getGroup()); 
            // InternalXDrone.g:619:3: ( rule__Origin__Group__0 )
            // InternalXDrone.g:619:4: rule__Origin__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrigin"


    // $ANTLR start "entryRuleSize"
    // InternalXDrone.g:628:1: entryRuleSize : ruleSize EOF ;
    public final void entryRuleSize() throws RecognitionException {
        try {
            // InternalXDrone.g:629:1: ( ruleSize EOF )
            // InternalXDrone.g:630:1: ruleSize EOF
            {
             before(grammarAccess.getSizeRule()); 
            pushFollow(FOLLOW_1);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getSizeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSize"


    // $ANTLR start "ruleSize"
    // InternalXDrone.g:637:1: ruleSize : ( ( rule__Size__Group__0 ) ) ;
    public final void ruleSize() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:641:2: ( ( ( rule__Size__Group__0 ) ) )
            // InternalXDrone.g:642:2: ( ( rule__Size__Group__0 ) )
            {
            // InternalXDrone.g:642:2: ( ( rule__Size__Group__0 ) )
            // InternalXDrone.g:643:3: ( rule__Size__Group__0 )
            {
             before(grammarAccess.getSizeAccess().getGroup()); 
            // InternalXDrone.g:644:3: ( rule__Size__Group__0 )
            // InternalXDrone.g:644:4: rule__Size__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Size__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSize"


    // $ANTLR start "entryRulePosition"
    // InternalXDrone.g:653:1: entryRulePosition : rulePosition EOF ;
    public final void entryRulePosition() throws RecognitionException {
        try {
            // InternalXDrone.g:654:1: ( rulePosition EOF )
            // InternalXDrone.g:655:1: rulePosition EOF
            {
             before(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getPositionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalXDrone.g:662:1: rulePosition : ( ( rule__Position__Group__0 ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:666:2: ( ( ( rule__Position__Group__0 ) ) )
            // InternalXDrone.g:667:2: ( ( rule__Position__Group__0 ) )
            {
            // InternalXDrone.g:667:2: ( ( rule__Position__Group__0 ) )
            // InternalXDrone.g:668:3: ( rule__Position__Group__0 )
            {
             before(grammarAccess.getPositionAccess().getGroup()); 
            // InternalXDrone.g:669:3: ( rule__Position__Group__0 )
            // InternalXDrone.g:669:4: rule__Position__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleVector"
    // InternalXDrone.g:678:1: entryRuleVector : ruleVector EOF ;
    public final void entryRuleVector() throws RecognitionException {
        try {
            // InternalXDrone.g:679:1: ( ruleVector EOF )
            // InternalXDrone.g:680:1: ruleVector EOF
            {
             before(grammarAccess.getVectorRule()); 
            pushFollow(FOLLOW_1);
            ruleVector();

            state._fsp--;

             after(grammarAccess.getVectorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVector"


    // $ANTLR start "ruleVector"
    // InternalXDrone.g:687:1: ruleVector : ( ( rule__Vector__Group__0 ) ) ;
    public final void ruleVector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:691:2: ( ( ( rule__Vector__Group__0 ) ) )
            // InternalXDrone.g:692:2: ( ( rule__Vector__Group__0 ) )
            {
            // InternalXDrone.g:692:2: ( ( rule__Vector__Group__0 ) )
            // InternalXDrone.g:693:3: ( rule__Vector__Group__0 )
            {
             before(grammarAccess.getVectorAccess().getGroup()); 
            // InternalXDrone.g:694:3: ( rule__Vector__Group__0 )
            // InternalXDrone.g:694:4: rule__Vector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Vector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVector"


    // $ANTLR start "entryRuleColor"
    // InternalXDrone.g:703:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalXDrone.g:704:1: ( ruleColor EOF )
            // InternalXDrone.g:705:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalXDrone.g:712:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:716:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalXDrone.g:717:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalXDrone.g:717:2: ( ( rule__Color__Group__0 ) )
            // InternalXDrone.g:718:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalXDrone.g:719:3: ( rule__Color__Group__0 )
            // InternalXDrone.g:719:4: rule__Color__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleWalls"
    // InternalXDrone.g:728:1: entryRuleWalls : ruleWalls EOF ;
    public final void entryRuleWalls() throws RecognitionException {
        try {
            // InternalXDrone.g:729:1: ( ruleWalls EOF )
            // InternalXDrone.g:730:1: ruleWalls EOF
            {
             before(grammarAccess.getWallsRule()); 
            pushFollow(FOLLOW_1);
            ruleWalls();

            state._fsp--;

             after(grammarAccess.getWallsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWalls"


    // $ANTLR start "ruleWalls"
    // InternalXDrone.g:737:1: ruleWalls : ( ( rule__Walls__Group__0 ) ) ;
    public final void ruleWalls() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:741:2: ( ( ( rule__Walls__Group__0 ) ) )
            // InternalXDrone.g:742:2: ( ( rule__Walls__Group__0 ) )
            {
            // InternalXDrone.g:742:2: ( ( rule__Walls__Group__0 ) )
            // InternalXDrone.g:743:3: ( rule__Walls__Group__0 )
            {
             before(grammarAccess.getWallsAccess().getGroup()); 
            // InternalXDrone.g:744:3: ( rule__Walls__Group__0 )
            // InternalXDrone.g:744:4: rule__Walls__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Walls__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWallsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWalls"


    // $ANTLR start "entryRuleFrontWall"
    // InternalXDrone.g:753:1: entryRuleFrontWall : ruleFrontWall EOF ;
    public final void entryRuleFrontWall() throws RecognitionException {
        try {
            // InternalXDrone.g:754:1: ( ruleFrontWall EOF )
            // InternalXDrone.g:755:1: ruleFrontWall EOF
            {
             before(grammarAccess.getFrontWallRule()); 
            pushFollow(FOLLOW_1);
            ruleFrontWall();

            state._fsp--;

             after(grammarAccess.getFrontWallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFrontWall"


    // $ANTLR start "ruleFrontWall"
    // InternalXDrone.g:762:1: ruleFrontWall : ( ( rule__FrontWall__Group__0 ) ) ;
    public final void ruleFrontWall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:766:2: ( ( ( rule__FrontWall__Group__0 ) ) )
            // InternalXDrone.g:767:2: ( ( rule__FrontWall__Group__0 ) )
            {
            // InternalXDrone.g:767:2: ( ( rule__FrontWall__Group__0 ) )
            // InternalXDrone.g:768:3: ( rule__FrontWall__Group__0 )
            {
             before(grammarAccess.getFrontWallAccess().getGroup()); 
            // InternalXDrone.g:769:3: ( rule__FrontWall__Group__0 )
            // InternalXDrone.g:769:4: rule__FrontWall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FrontWall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFrontWallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFrontWall"


    // $ANTLR start "entryRuleRightWall"
    // InternalXDrone.g:778:1: entryRuleRightWall : ruleRightWall EOF ;
    public final void entryRuleRightWall() throws RecognitionException {
        try {
            // InternalXDrone.g:779:1: ( ruleRightWall EOF )
            // InternalXDrone.g:780:1: ruleRightWall EOF
            {
             before(grammarAccess.getRightWallRule()); 
            pushFollow(FOLLOW_1);
            ruleRightWall();

            state._fsp--;

             after(grammarAccess.getRightWallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRightWall"


    // $ANTLR start "ruleRightWall"
    // InternalXDrone.g:787:1: ruleRightWall : ( ( rule__RightWall__Group__0 ) ) ;
    public final void ruleRightWall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:791:2: ( ( ( rule__RightWall__Group__0 ) ) )
            // InternalXDrone.g:792:2: ( ( rule__RightWall__Group__0 ) )
            {
            // InternalXDrone.g:792:2: ( ( rule__RightWall__Group__0 ) )
            // InternalXDrone.g:793:3: ( rule__RightWall__Group__0 )
            {
             before(grammarAccess.getRightWallAccess().getGroup()); 
            // InternalXDrone.g:794:3: ( rule__RightWall__Group__0 )
            // InternalXDrone.g:794:4: rule__RightWall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RightWall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightWallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRightWall"


    // $ANTLR start "entryRuleLeftWall"
    // InternalXDrone.g:803:1: entryRuleLeftWall : ruleLeftWall EOF ;
    public final void entryRuleLeftWall() throws RecognitionException {
        try {
            // InternalXDrone.g:804:1: ( ruleLeftWall EOF )
            // InternalXDrone.g:805:1: ruleLeftWall EOF
            {
             before(grammarAccess.getLeftWallRule()); 
            pushFollow(FOLLOW_1);
            ruleLeftWall();

            state._fsp--;

             after(grammarAccess.getLeftWallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeftWall"


    // $ANTLR start "ruleLeftWall"
    // InternalXDrone.g:812:1: ruleLeftWall : ( ( rule__LeftWall__Group__0 ) ) ;
    public final void ruleLeftWall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:816:2: ( ( ( rule__LeftWall__Group__0 ) ) )
            // InternalXDrone.g:817:2: ( ( rule__LeftWall__Group__0 ) )
            {
            // InternalXDrone.g:817:2: ( ( rule__LeftWall__Group__0 ) )
            // InternalXDrone.g:818:3: ( rule__LeftWall__Group__0 )
            {
             before(grammarAccess.getLeftWallAccess().getGroup()); 
            // InternalXDrone.g:819:3: ( rule__LeftWall__Group__0 )
            // InternalXDrone.g:819:4: rule__LeftWall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LeftWall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeftWallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeftWall"


    // $ANTLR start "entryRuleBackWall"
    // InternalXDrone.g:828:1: entryRuleBackWall : ruleBackWall EOF ;
    public final void entryRuleBackWall() throws RecognitionException {
        try {
            // InternalXDrone.g:829:1: ( ruleBackWall EOF )
            // InternalXDrone.g:830:1: ruleBackWall EOF
            {
             before(grammarAccess.getBackWallRule()); 
            pushFollow(FOLLOW_1);
            ruleBackWall();

            state._fsp--;

             after(grammarAccess.getBackWallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBackWall"


    // $ANTLR start "ruleBackWall"
    // InternalXDrone.g:837:1: ruleBackWall : ( ( rule__BackWall__Group__0 ) ) ;
    public final void ruleBackWall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:841:2: ( ( ( rule__BackWall__Group__0 ) ) )
            // InternalXDrone.g:842:2: ( ( rule__BackWall__Group__0 ) )
            {
            // InternalXDrone.g:842:2: ( ( rule__BackWall__Group__0 ) )
            // InternalXDrone.g:843:3: ( rule__BackWall__Group__0 )
            {
             before(grammarAccess.getBackWallAccess().getGroup()); 
            // InternalXDrone.g:844:3: ( rule__BackWall__Group__0 )
            // InternalXDrone.g:844:4: rule__BackWall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BackWall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackWallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBackWall"


    // $ANTLR start "entryRuleUpWall"
    // InternalXDrone.g:853:1: entryRuleUpWall : ruleUpWall EOF ;
    public final void entryRuleUpWall() throws RecognitionException {
        try {
            // InternalXDrone.g:854:1: ( ruleUpWall EOF )
            // InternalXDrone.g:855:1: ruleUpWall EOF
            {
             before(grammarAccess.getUpWallRule()); 
            pushFollow(FOLLOW_1);
            ruleUpWall();

            state._fsp--;

             after(grammarAccess.getUpWallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUpWall"


    // $ANTLR start "ruleUpWall"
    // InternalXDrone.g:862:1: ruleUpWall : ( ( rule__UpWall__Group__0 ) ) ;
    public final void ruleUpWall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:866:2: ( ( ( rule__UpWall__Group__0 ) ) )
            // InternalXDrone.g:867:2: ( ( rule__UpWall__Group__0 ) )
            {
            // InternalXDrone.g:867:2: ( ( rule__UpWall__Group__0 ) )
            // InternalXDrone.g:868:3: ( rule__UpWall__Group__0 )
            {
             before(grammarAccess.getUpWallAccess().getGroup()); 
            // InternalXDrone.g:869:3: ( rule__UpWall__Group__0 )
            // InternalXDrone.g:869:4: rule__UpWall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpWall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpWallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpWall"


    // $ANTLR start "rule__Environment__Alternatives_5"
    // InternalXDrone.g:877:1: rule__Environment__Alternatives_5 : ( ( ( rule__Environment__DroneAssignment_5_0 ) ) | ( ( rule__Environment__WallsAssignment_5_1 ) ) | ( ( rule__Environment__ObjectsAssignment_5_2 ) ) );
    public final void rule__Environment__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:881:1: ( ( ( rule__Environment__DroneAssignment_5_0 ) ) | ( ( rule__Environment__WallsAssignment_5_1 ) ) | ( ( rule__Environment__ObjectsAssignment_5_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt1=1;
                }
                break;
            case 39:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalXDrone.g:882:2: ( ( rule__Environment__DroneAssignment_5_0 ) )
                    {
                    // InternalXDrone.g:882:2: ( ( rule__Environment__DroneAssignment_5_0 ) )
                    // InternalXDrone.g:883:3: ( rule__Environment__DroneAssignment_5_0 )
                    {
                     before(grammarAccess.getEnvironmentAccess().getDroneAssignment_5_0()); 
                    // InternalXDrone.g:884:3: ( rule__Environment__DroneAssignment_5_0 )
                    // InternalXDrone.g:884:4: rule__Environment__DroneAssignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Environment__DroneAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnvironmentAccess().getDroneAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:888:2: ( ( rule__Environment__WallsAssignment_5_1 ) )
                    {
                    // InternalXDrone.g:888:2: ( ( rule__Environment__WallsAssignment_5_1 ) )
                    // InternalXDrone.g:889:3: ( rule__Environment__WallsAssignment_5_1 )
                    {
                     before(grammarAccess.getEnvironmentAccess().getWallsAssignment_5_1()); 
                    // InternalXDrone.g:890:3: ( rule__Environment__WallsAssignment_5_1 )
                    // InternalXDrone.g:890:4: rule__Environment__WallsAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Environment__WallsAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnvironmentAccess().getWallsAssignment_5_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXDrone.g:894:2: ( ( rule__Environment__ObjectsAssignment_5_2 ) )
                    {
                    // InternalXDrone.g:894:2: ( ( rule__Environment__ObjectsAssignment_5_2 ) )
                    // InternalXDrone.g:895:3: ( rule__Environment__ObjectsAssignment_5_2 )
                    {
                     before(grammarAccess.getEnvironmentAccess().getObjectsAssignment_5_2()); 
                    // InternalXDrone.g:896:3: ( rule__Environment__ObjectsAssignment_5_2 )
                    // InternalXDrone.g:896:4: rule__Environment__ObjectsAssignment_5_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Environment__ObjectsAssignment_5_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getEnvironmentAccess().getObjectsAssignment_5_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Alternatives_5"


    // $ANTLR start "rule__Command__Alternatives"
    // InternalXDrone.g:904:1: rule__Command__Alternatives : ( ( ruleUp ) | ( ruleDown ) | ( ruleLeft ) | ( ruleRight ) | ( ruleForward ) | ( ruleBackward ) | ( ruleRotateL ) | ( ruleRotateR ) | ( ruleWait ) | ( ruleGoTo ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:908:1: ( ( ruleUp ) | ( ruleDown ) | ( ruleLeft ) | ( ruleRight ) | ( ruleForward ) | ( ruleBackward ) | ( ruleRotateL ) | ( ruleRotateR ) | ( ruleWait ) | ( ruleGoTo ) )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            case 26:
                {
                alt2=5;
                }
                break;
            case 27:
                {
                alt2=6;
                }
                break;
            case 28:
                {
                alt2=7;
                }
                break;
            case 29:
                {
                alt2=8;
                }
                break;
            case 30:
                {
                alt2=9;
                }
                break;
            case 21:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalXDrone.g:909:2: ( ruleUp )
                    {
                    // InternalXDrone.g:909:2: ( ruleUp )
                    // InternalXDrone.g:910:3: ruleUp
                    {
                     before(grammarAccess.getCommandAccess().getUpParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUp();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getUpParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:915:2: ( ruleDown )
                    {
                    // InternalXDrone.g:915:2: ( ruleDown )
                    // InternalXDrone.g:916:3: ruleDown
                    {
                     before(grammarAccess.getCommandAccess().getDownParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDown();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getDownParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXDrone.g:921:2: ( ruleLeft )
                    {
                    // InternalXDrone.g:921:2: ( ruleLeft )
                    // InternalXDrone.g:922:3: ruleLeft
                    {
                     before(grammarAccess.getCommandAccess().getLeftParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLeft();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getLeftParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXDrone.g:927:2: ( ruleRight )
                    {
                    // InternalXDrone.g:927:2: ( ruleRight )
                    // InternalXDrone.g:928:3: ruleRight
                    {
                     before(grammarAccess.getCommandAccess().getRightParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRight();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getRightParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXDrone.g:933:2: ( ruleForward )
                    {
                    // InternalXDrone.g:933:2: ( ruleForward )
                    // InternalXDrone.g:934:3: ruleForward
                    {
                     before(grammarAccess.getCommandAccess().getForwardParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleForward();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getForwardParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalXDrone.g:939:2: ( ruleBackward )
                    {
                    // InternalXDrone.g:939:2: ( ruleBackward )
                    // InternalXDrone.g:940:3: ruleBackward
                    {
                     before(grammarAccess.getCommandAccess().getBackwardParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleBackward();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getBackwardParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalXDrone.g:945:2: ( ruleRotateL )
                    {
                    // InternalXDrone.g:945:2: ( ruleRotateL )
                    // InternalXDrone.g:946:3: ruleRotateL
                    {
                     before(grammarAccess.getCommandAccess().getRotateLParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleRotateL();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getRotateLParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalXDrone.g:951:2: ( ruleRotateR )
                    {
                    // InternalXDrone.g:951:2: ( ruleRotateR )
                    // InternalXDrone.g:952:3: ruleRotateR
                    {
                     before(grammarAccess.getCommandAccess().getRotateRParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleRotateR();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getRotateRParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalXDrone.g:957:2: ( ruleWait )
                    {
                    // InternalXDrone.g:957:2: ( ruleWait )
                    // InternalXDrone.g:958:3: ruleWait
                    {
                     before(grammarAccess.getCommandAccess().getWaitParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleWait();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getWaitParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalXDrone.g:963:2: ( ruleGoTo )
                    {
                    // InternalXDrone.g:963:2: ( ruleGoTo )
                    // InternalXDrone.g:964:3: ruleGoTo
                    {
                     before(grammarAccess.getCommandAccess().getGoToParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    ruleGoTo();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getGoToParserRuleCall_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__DOUBLE__Alternatives"
    // InternalXDrone.g:973:1: rule__DOUBLE__Alternatives : ( ( ( rule__DOUBLE__Group_0__0 ) ) | ( rulePOSITIVE_DOUBLE ) );
    public final void rule__DOUBLE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:977:1: ( ( ( rule__DOUBLE__Group_0__0 ) ) | ( rulePOSITIVE_DOUBLE ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXDrone.g:978:2: ( ( rule__DOUBLE__Group_0__0 ) )
                    {
                    // InternalXDrone.g:978:2: ( ( rule__DOUBLE__Group_0__0 ) )
                    // InternalXDrone.g:979:3: ( rule__DOUBLE__Group_0__0 )
                    {
                     before(grammarAccess.getDOUBLEAccess().getGroup_0()); 
                    // InternalXDrone.g:980:3: ( rule__DOUBLE__Group_0__0 )
                    // InternalXDrone.g:980:4: rule__DOUBLE__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DOUBLE__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDOUBLEAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:984:2: ( rulePOSITIVE_DOUBLE )
                    {
                    // InternalXDrone.g:984:2: ( rulePOSITIVE_DOUBLE )
                    // InternalXDrone.g:985:3: rulePOSITIVE_DOUBLE
                    {
                     before(grammarAccess.getDOUBLEAccess().getPOSITIVE_DOUBLEParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePOSITIVE_DOUBLE();

                    state._fsp--;

                     after(grammarAccess.getDOUBLEAccess().getPOSITIVE_DOUBLEParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Alternatives"


    // $ANTLR start "rule__POSITIVE_DOUBLE__Alternatives"
    // InternalXDrone.g:994:1: rule__POSITIVE_DOUBLE__Alternatives : ( ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) ) | ( RULE_INT ) );
    public final void rule__POSITIVE_DOUBLE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:998:1: ( ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) ) | ( RULE_INT ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==EOF||LA4_1==13||LA4_1==15||LA4_1==33||(LA4_1>=36 && LA4_1<=37)||(LA4_1>=40 && LA4_1<=44)) ) {
                    alt4=2;
                }
                else if ( (LA4_1==20) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalXDrone.g:999:2: ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) )
                    {
                    // InternalXDrone.g:999:2: ( ( rule__POSITIVE_DOUBLE__Group_0__0 ) )
                    // InternalXDrone.g:1000:3: ( rule__POSITIVE_DOUBLE__Group_0__0 )
                    {
                     before(grammarAccess.getPOSITIVE_DOUBLEAccess().getGroup_0()); 
                    // InternalXDrone.g:1001:3: ( rule__POSITIVE_DOUBLE__Group_0__0 )
                    // InternalXDrone.g:1001:4: rule__POSITIVE_DOUBLE__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__POSITIVE_DOUBLE__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPOSITIVE_DOUBLEAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:1005:2: ( RULE_INT )
                    {
                    // InternalXDrone.g:1005:2: ( RULE_INT )
                    // InternalXDrone.g:1006:3: RULE_INT
                    {
                     before(grammarAccess.getPOSITIVE_DOUBLEAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getPOSITIVE_DOUBLEAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POSITIVE_DOUBLE__Alternatives"


    // $ANTLR start "rule__Drone__Alternatives_3"
    // InternalXDrone.g:1015:1: rule__Drone__Alternatives_3 : ( ( ( rule__Drone__PositionAssignment_3_0 ) ) | ( ( rule__Drone__Group_3_1__0 ) ) );
    public final void rule__Drone__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1019:1: ( ( ( rule__Drone__PositionAssignment_3_0 ) ) | ( ( rule__Drone__Group_3_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==36) ) {
                alt5=1;
            }
            else if ( (LA5_0==33) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXDrone.g:1020:2: ( ( rule__Drone__PositionAssignment_3_0 ) )
                    {
                    // InternalXDrone.g:1020:2: ( ( rule__Drone__PositionAssignment_3_0 ) )
                    // InternalXDrone.g:1021:3: ( rule__Drone__PositionAssignment_3_0 )
                    {
                     before(grammarAccess.getDroneAccess().getPositionAssignment_3_0()); 
                    // InternalXDrone.g:1022:3: ( rule__Drone__PositionAssignment_3_0 )
                    // InternalXDrone.g:1022:4: rule__Drone__PositionAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Drone__PositionAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDroneAccess().getPositionAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:1026:2: ( ( rule__Drone__Group_3_1__0 ) )
                    {
                    // InternalXDrone.g:1026:2: ( ( rule__Drone__Group_3_1__0 ) )
                    // InternalXDrone.g:1027:3: ( rule__Drone__Group_3_1__0 )
                    {
                     before(grammarAccess.getDroneAccess().getGroup_3_1()); 
                    // InternalXDrone.g:1028:3: ( rule__Drone__Group_3_1__0 )
                    // InternalXDrone.g:1028:4: rule__Drone__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Drone__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDroneAccess().getGroup_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Alternatives_3"


    // $ANTLR start "rule__Object__Alternatives_3"
    // InternalXDrone.g:1036:1: rule__Object__Alternatives_3 : ( ( ( rule__Object__OriginAssignment_3_0 ) ) | ( ( rule__Object__SizeAssignment_3_1 ) ) | ( ( rule__Object__ColorAssignment_3_2 ) ) );
    public final void rule__Object__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1040:1: ( ( ( rule__Object__OriginAssignment_3_0 ) ) | ( ( rule__Object__SizeAssignment_3_1 ) ) | ( ( rule__Object__ColorAssignment_3_2 ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt6=1;
                }
                break;
            case 35:
                {
                alt6=2;
                }
                break;
            case 38:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalXDrone.g:1041:2: ( ( rule__Object__OriginAssignment_3_0 ) )
                    {
                    // InternalXDrone.g:1041:2: ( ( rule__Object__OriginAssignment_3_0 ) )
                    // InternalXDrone.g:1042:3: ( rule__Object__OriginAssignment_3_0 )
                    {
                     before(grammarAccess.getObjectAccess().getOriginAssignment_3_0()); 
                    // InternalXDrone.g:1043:3: ( rule__Object__OriginAssignment_3_0 )
                    // InternalXDrone.g:1043:4: rule__Object__OriginAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__OriginAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectAccess().getOriginAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:1047:2: ( ( rule__Object__SizeAssignment_3_1 ) )
                    {
                    // InternalXDrone.g:1047:2: ( ( rule__Object__SizeAssignment_3_1 ) )
                    // InternalXDrone.g:1048:3: ( rule__Object__SizeAssignment_3_1 )
                    {
                     before(grammarAccess.getObjectAccess().getSizeAssignment_3_1()); 
                    // InternalXDrone.g:1049:3: ( rule__Object__SizeAssignment_3_1 )
                    // InternalXDrone.g:1049:4: rule__Object__SizeAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__SizeAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectAccess().getSizeAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXDrone.g:1053:2: ( ( rule__Object__ColorAssignment_3_2 ) )
                    {
                    // InternalXDrone.g:1053:2: ( ( rule__Object__ColorAssignment_3_2 ) )
                    // InternalXDrone.g:1054:3: ( rule__Object__ColorAssignment_3_2 )
                    {
                     before(grammarAccess.getObjectAccess().getColorAssignment_3_2()); 
                    // InternalXDrone.g:1055:3: ( rule__Object__ColorAssignment_3_2 )
                    // InternalXDrone.g:1055:4: rule__Object__ColorAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Object__ColorAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getObjectAccess().getColorAssignment_3_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Alternatives_3"


    // $ANTLR start "rule__Walls__Alternatives_3"
    // InternalXDrone.g:1063:1: rule__Walls__Alternatives_3 : ( ( ( rule__Walls__FrontAssignment_3_0 ) ) | ( ( rule__Walls__RightAssignment_3_1 ) ) | ( ( rule__Walls__BackAssignment_3_2 ) ) | ( ( rule__Walls__LeftAssignment_3_3 ) ) | ( ( rule__Walls__UpAssignment_3_4 ) ) );
    public final void rule__Walls__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1067:1: ( ( ( rule__Walls__FrontAssignment_3_0 ) ) | ( ( rule__Walls__RightAssignment_3_1 ) ) | ( ( rule__Walls__BackAssignment_3_2 ) ) | ( ( rule__Walls__LeftAssignment_3_3 ) ) | ( ( rule__Walls__UpAssignment_3_4 ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt7=1;
                }
                break;
            case 41:
                {
                alt7=2;
                }
                break;
            case 43:
                {
                alt7=3;
                }
                break;
            case 42:
                {
                alt7=4;
                }
                break;
            case 44:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalXDrone.g:1068:2: ( ( rule__Walls__FrontAssignment_3_0 ) )
                    {
                    // InternalXDrone.g:1068:2: ( ( rule__Walls__FrontAssignment_3_0 ) )
                    // InternalXDrone.g:1069:3: ( rule__Walls__FrontAssignment_3_0 )
                    {
                     before(grammarAccess.getWallsAccess().getFrontAssignment_3_0()); 
                    // InternalXDrone.g:1070:3: ( rule__Walls__FrontAssignment_3_0 )
                    // InternalXDrone.g:1070:4: rule__Walls__FrontAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Walls__FrontAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWallsAccess().getFrontAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXDrone.g:1074:2: ( ( rule__Walls__RightAssignment_3_1 ) )
                    {
                    // InternalXDrone.g:1074:2: ( ( rule__Walls__RightAssignment_3_1 ) )
                    // InternalXDrone.g:1075:3: ( rule__Walls__RightAssignment_3_1 )
                    {
                     before(grammarAccess.getWallsAccess().getRightAssignment_3_1()); 
                    // InternalXDrone.g:1076:3: ( rule__Walls__RightAssignment_3_1 )
                    // InternalXDrone.g:1076:4: rule__Walls__RightAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Walls__RightAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getWallsAccess().getRightAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXDrone.g:1080:2: ( ( rule__Walls__BackAssignment_3_2 ) )
                    {
                    // InternalXDrone.g:1080:2: ( ( rule__Walls__BackAssignment_3_2 ) )
                    // InternalXDrone.g:1081:3: ( rule__Walls__BackAssignment_3_2 )
                    {
                     before(grammarAccess.getWallsAccess().getBackAssignment_3_2()); 
                    // InternalXDrone.g:1082:3: ( rule__Walls__BackAssignment_3_2 )
                    // InternalXDrone.g:1082:4: rule__Walls__BackAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Walls__BackAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getWallsAccess().getBackAssignment_3_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalXDrone.g:1086:2: ( ( rule__Walls__LeftAssignment_3_3 ) )
                    {
                    // InternalXDrone.g:1086:2: ( ( rule__Walls__LeftAssignment_3_3 ) )
                    // InternalXDrone.g:1087:3: ( rule__Walls__LeftAssignment_3_3 )
                    {
                     before(grammarAccess.getWallsAccess().getLeftAssignment_3_3()); 
                    // InternalXDrone.g:1088:3: ( rule__Walls__LeftAssignment_3_3 )
                    // InternalXDrone.g:1088:4: rule__Walls__LeftAssignment_3_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Walls__LeftAssignment_3_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getWallsAccess().getLeftAssignment_3_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalXDrone.g:1092:2: ( ( rule__Walls__UpAssignment_3_4 ) )
                    {
                    // InternalXDrone.g:1092:2: ( ( rule__Walls__UpAssignment_3_4 ) )
                    // InternalXDrone.g:1093:3: ( rule__Walls__UpAssignment_3_4 )
                    {
                     before(grammarAccess.getWallsAccess().getUpAssignment_3_4()); 
                    // InternalXDrone.g:1094:3: ( rule__Walls__UpAssignment_3_4 )
                    // InternalXDrone.g:1094:4: rule__Walls__UpAssignment_3_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Walls__UpAssignment_3_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getWallsAccess().getUpAssignment_3_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Alternatives_3"


    // $ANTLR start "rule__Main__Group__0"
    // InternalXDrone.g:1102:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1106:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // InternalXDrone.g:1107:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Main__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__0"


    // $ANTLR start "rule__Main__Group__0__Impl"
    // InternalXDrone.g:1114:1: rule__Main__Group__0__Impl : ( ( rule__Main__FlyAssignment_0 ) ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1118:1: ( ( ( rule__Main__FlyAssignment_0 ) ) )
            // InternalXDrone.g:1119:1: ( ( rule__Main__FlyAssignment_0 ) )
            {
            // InternalXDrone.g:1119:1: ( ( rule__Main__FlyAssignment_0 ) )
            // InternalXDrone.g:1120:2: ( rule__Main__FlyAssignment_0 )
            {
             before(grammarAccess.getMainAccess().getFlyAssignment_0()); 
            // InternalXDrone.g:1121:2: ( rule__Main__FlyAssignment_0 )
            // InternalXDrone.g:1121:3: rule__Main__FlyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Main__FlyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getFlyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__0__Impl"


    // $ANTLR start "rule__Main__Group__1"
    // InternalXDrone.g:1129:1: rule__Main__Group__1 : rule__Main__Group__1__Impl ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1133:1: ( rule__Main__Group__1__Impl )
            // InternalXDrone.g:1134:2: rule__Main__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__1"


    // $ANTLR start "rule__Main__Group__1__Impl"
    // InternalXDrone.g:1140:1: rule__Main__Group__1__Impl : ( ( rule__Main__EnvironmentAssignment_1 )? ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1144:1: ( ( ( rule__Main__EnvironmentAssignment_1 )? ) )
            // InternalXDrone.g:1145:1: ( ( rule__Main__EnvironmentAssignment_1 )? )
            {
            // InternalXDrone.g:1145:1: ( ( rule__Main__EnvironmentAssignment_1 )? )
            // InternalXDrone.g:1146:2: ( rule__Main__EnvironmentAssignment_1 )?
            {
             before(grammarAccess.getMainAccess().getEnvironmentAssignment_1()); 
            // InternalXDrone.g:1147:2: ( rule__Main__EnvironmentAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXDrone.g:1147:3: rule__Main__EnvironmentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Main__EnvironmentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMainAccess().getEnvironmentAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__1__Impl"


    // $ANTLR start "rule__Fly__Group__0"
    // InternalXDrone.g:1156:1: rule__Fly__Group__0 : rule__Fly__Group__0__Impl rule__Fly__Group__1 ;
    public final void rule__Fly__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1160:1: ( rule__Fly__Group__0__Impl rule__Fly__Group__1 )
            // InternalXDrone.g:1161:2: rule__Fly__Group__0__Impl rule__Fly__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Fly__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fly__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fly__Group__0"


    // $ANTLR start "rule__Fly__Group__0__Impl"
    // InternalXDrone.g:1168:1: rule__Fly__Group__0__Impl : ( 'fly' ) ;
    public final void rule__Fly__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1172:1: ( ( 'fly' ) )
            // InternalXDrone.g:1173:1: ( 'fly' )
            {
            // InternalXDrone.g:1173:1: ( 'fly' )
            // InternalXDrone.g:1174:2: 'fly'
            {
             before(grammarAccess.getFlyAccess().getFlyKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFlyAccess().getFlyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fly__Group__0__Impl"


    // $ANTLR start "rule__Fly__Group__1"
    // InternalXDrone.g:1183:1: rule__Fly__Group__1 : rule__Fly__Group__1__Impl rule__Fly__Group__2 ;
    public final void rule__Fly__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1187:1: ( rule__Fly__Group__1__Impl rule__Fly__Group__2 )
            // InternalXDrone.g:1188:2: rule__Fly__Group__1__Impl rule__Fly__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Fly__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fly__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fly__Group__1"


    // $ANTLR start "rule__Fly__Group__1__Impl"
    // InternalXDrone.g:1195:1: rule__Fly__Group__1__Impl : ( '(' ) ;
    public final void rule__Fly__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1199:1: ( ( '(' ) )
            // InternalXDrone.g:1200:1: ( '(' )
            {
            // InternalXDrone.g:1200:1: ( '(' )
            // InternalXDrone.g:1201:2: '('
            {
             before(grammarAccess.getFlyAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFlyAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fly__Group__1__Impl"


    // $ANTLR start "rule__Fly__Group__2"
    // InternalXDrone.g:1210:1: rule__Fly__Group__2 : rule__Fly__Group__2__Impl rule__Fly__Group__3 ;
    public final void rule__Fly__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1214:1: ( rule__Fly__Group__2__Impl rule__Fly__Group__3 )
            // InternalXDrone.g:1215:2: rule__Fly__Group__2__Impl rule__Fly__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Fly__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fly__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fly__Group__2"


    // $ANTLR start "rule__Fly__Group__2__Impl"
    // InternalXDrone.g:1222:1: rule__Fly__Group__2__Impl : ( ')' ) ;
    public final void rule__Fly__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1226:1: ( ( ')' ) )
            // InternalXDrone.g:1227:1: ( ')' )
            {
            // InternalXDrone.g:1227:1: ( ')' )
            // InternalXDrone.g:1228:2: ')'
            {
             before(grammarAccess.getFlyAccess().getRightParenthesisKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFlyAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fly__Group__2__Impl"


    // $ANTLR start "rule__Fly__Group__3"
    // InternalXDrone.g:1237:1: rule__Fly__Group__3 : rule__Fly__Group__3__Impl rule__Fly__Group__4 ;
    public final void rule__Fly__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1241:1: ( rule__Fly__Group__3__Impl rule__Fly__Group__4 )
            // InternalXDrone.g:1242:2: rule__Fly__Group__3__Impl rule__Fly__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Fly__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fly__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fly__Group__3"


    // $ANTLR start "rule__Fly__Group__3__Impl"
    // InternalXDrone.g:1249:1: rule__Fly__Group__3__Impl : ( '{' ) ;
    public final void rule__Fly__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1253:1: ( ( '{' ) )
            // InternalXDrone.g:1254:1: ( '{' )
            {
            // InternalXDrone.g:1254:1: ( '{' )
            // InternalXDrone.g:1255:2: '{'
            {
             before(grammarAccess.getFlyAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFlyAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fly__Group__3__Impl"


    // $ANTLR start "rule__Fly__Group__4"
    // InternalXDrone.g:1264:1: rule__Fly__Group__4 : rule__Fly__Group__4__Impl rule__Fly__Group__5 ;
    public final void rule__Fly__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1268:1: ( rule__Fly__Group__4__Impl rule__Fly__Group__5 )
            // InternalXDrone.g:1269:2: rule__Fly__Group__4__Impl rule__Fly__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Fly__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fly__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fly__Group__4"


    // $ANTLR start "rule__Fly__Group__4__Impl"
    // InternalXDrone.g:1276:1: rule__Fly__Group__4__Impl : ( ( rule__Fly__Group_4__0 ) ) ;
    public final void rule__Fly__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1280:1: ( ( ( rule__Fly__Group_4__0 ) ) )
            // InternalXDrone.g:1281:1: ( ( rule__Fly__Group_4__0 ) )
            {
            // InternalXDrone.g:1281:1: ( ( rule__Fly__Group_4__0 ) )
            // InternalXDrone.g:1282:2: ( rule__Fly__Group_4__0 )
            {
             before(grammarAccess.getFlyAccess().getGroup_4()); 
            // InternalXDrone.g:1283:2: ( rule__Fly__Group_4__0 )
            // InternalXDrone.g:1283:3: rule__Fly__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__Fly__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getFlyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fly__Group__4__Impl"


    // $ANTLR start "rule__Fly__Group__5"
    // InternalXDrone.g:1291:1: rule__Fly__Group__5 : rule__Fly__Group__5__Impl ;
    public final void rule__Fly__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1295:1: ( rule__Fly__Group__5__Impl )
            // InternalXDrone.g:1296:2: rule__Fly__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fly__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fly__Group__5"


    // $ANTLR start "rule__Fly__Group__5__Impl"
    // InternalXDrone.g:1302:1: rule__Fly__Group__5__Impl : ( '}' ) ;
    public final void rule__Fly__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1306:1: ( ( '}' ) )
            // InternalXDrone.g:1307:1: ( '}' )
            {
            // InternalXDrone.g:1307:1: ( '}' )
            // InternalXDrone.g:1308:2: '}'
            {
             before(grammarAccess.getFlyAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFlyAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fly__Group__5__Impl"


    // $ANTLR start "rule__Fly__Group_4__0"
    // InternalXDrone.g:1318:1: rule__Fly__Group_4__0 : rule__Fly__Group_4__0__Impl rule__Fly__Group_4__1 ;
    public final void rule__Fly__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1322:1: ( rule__Fly__Group_4__0__Impl rule__Fly__Group_4__1 )
            // InternalXDrone.g:1323:2: rule__Fly__Group_4__0__Impl rule__Fly__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__Fly__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fly__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fly__Group_4__0"


    // $ANTLR start "rule__Fly__Group_4__0__Impl"
    // InternalXDrone.g:1330:1: rule__Fly__Group_4__0__Impl : ( ( rule__Fly__TakeoffAssignment_4_0 ) ) ;
    public final void rule__Fly__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1334:1: ( ( ( rule__Fly__TakeoffAssignment_4_0 ) ) )
            // InternalXDrone.g:1335:1: ( ( rule__Fly__TakeoffAssignment_4_0 ) )
            {
            // InternalXDrone.g:1335:1: ( ( rule__Fly__TakeoffAssignment_4_0 ) )
            // InternalXDrone.g:1336:2: ( rule__Fly__TakeoffAssignment_4_0 )
            {
             before(grammarAccess.getFlyAccess().getTakeoffAssignment_4_0()); 
            // InternalXDrone.g:1337:2: ( rule__Fly__TakeoffAssignment_4_0 )
            // InternalXDrone.g:1337:3: rule__Fly__TakeoffAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Fly__TakeoffAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getFlyAccess().getTakeoffAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fly__Group_4__0__Impl"


    // $ANTLR start "rule__Fly__Group_4__1"
    // InternalXDrone.g:1345:1: rule__Fly__Group_4__1 : rule__Fly__Group_4__1__Impl rule__Fly__Group_4__2 ;
    public final void rule__Fly__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1349:1: ( rule__Fly__Group_4__1__Impl rule__Fly__Group_4__2 )
            // InternalXDrone.g:1350:2: rule__Fly__Group_4__1__Impl rule__Fly__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__Fly__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fly__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fly__Group_4__1"


    // $ANTLR start "rule__Fly__Group_4__1__Impl"
    // InternalXDrone.g:1357:1: rule__Fly__Group_4__1__Impl : ( ( rule__Fly__CommandsAssignment_4_1 )* ) ;
    public final void rule__Fly__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1361:1: ( ( ( rule__Fly__CommandsAssignment_4_1 )* ) )
            // InternalXDrone.g:1362:1: ( ( rule__Fly__CommandsAssignment_4_1 )* )
            {
            // InternalXDrone.g:1362:1: ( ( rule__Fly__CommandsAssignment_4_1 )* )
            // InternalXDrone.g:1363:2: ( rule__Fly__CommandsAssignment_4_1 )*
            {
             before(grammarAccess.getFlyAccess().getCommandsAssignment_4_1()); 
            // InternalXDrone.g:1364:2: ( rule__Fly__CommandsAssignment_4_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=21 && LA9_0<=30)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalXDrone.g:1364:3: rule__Fly__CommandsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Fly__CommandsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getFlyAccess().getCommandsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fly__Group_4__1__Impl"


    // $ANTLR start "rule__Fly__Group_4__2"
    // InternalXDrone.g:1372:1: rule__Fly__Group_4__2 : rule__Fly__Group_4__2__Impl ;
    public final void rule__Fly__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1376:1: ( rule__Fly__Group_4__2__Impl )
            // InternalXDrone.g:1377:2: rule__Fly__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fly__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fly__Group_4__2"


    // $ANTLR start "rule__Fly__Group_4__2__Impl"
    // InternalXDrone.g:1383:1: rule__Fly__Group_4__2__Impl : ( ( rule__Fly__LandAssignment_4_2 ) ) ;
    public final void rule__Fly__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1387:1: ( ( ( rule__Fly__LandAssignment_4_2 ) ) )
            // InternalXDrone.g:1388:1: ( ( rule__Fly__LandAssignment_4_2 ) )
            {
            // InternalXDrone.g:1388:1: ( ( rule__Fly__LandAssignment_4_2 ) )
            // InternalXDrone.g:1389:2: ( rule__Fly__LandAssignment_4_2 )
            {
             before(grammarAccess.getFlyAccess().getLandAssignment_4_2()); 
            // InternalXDrone.g:1390:2: ( rule__Fly__LandAssignment_4_2 )
            // InternalXDrone.g:1390:3: rule__Fly__LandAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Fly__LandAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getFlyAccess().getLandAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fly__Group_4__2__Impl"


    // $ANTLR start "rule__Environment__Group__0"
    // InternalXDrone.g:1399:1: rule__Environment__Group__0 : rule__Environment__Group__0__Impl rule__Environment__Group__1 ;
    public final void rule__Environment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1403:1: ( rule__Environment__Group__0__Impl rule__Environment__Group__1 )
            // InternalXDrone.g:1404:2: rule__Environment__Group__0__Impl rule__Environment__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Environment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__0"


    // $ANTLR start "rule__Environment__Group__0__Impl"
    // InternalXDrone.g:1411:1: rule__Environment__Group__0__Impl : ( () ) ;
    public final void rule__Environment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1415:1: ( ( () ) )
            // InternalXDrone.g:1416:1: ( () )
            {
            // InternalXDrone.g:1416:1: ( () )
            // InternalXDrone.g:1417:2: ()
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 
            // InternalXDrone.g:1418:2: ()
            // InternalXDrone.g:1418:3: 
            {
            }

             after(grammarAccess.getEnvironmentAccess().getEnvironmentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__0__Impl"


    // $ANTLR start "rule__Environment__Group__1"
    // InternalXDrone.g:1426:1: rule__Environment__Group__1 : rule__Environment__Group__1__Impl rule__Environment__Group__2 ;
    public final void rule__Environment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1430:1: ( rule__Environment__Group__1__Impl rule__Environment__Group__2 )
            // InternalXDrone.g:1431:2: rule__Environment__Group__1__Impl rule__Environment__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Environment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__1"


    // $ANTLR start "rule__Environment__Group__1__Impl"
    // InternalXDrone.g:1438:1: rule__Environment__Group__1__Impl : ( 'environment' ) ;
    public final void rule__Environment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1442:1: ( ( 'environment' ) )
            // InternalXDrone.g:1443:1: ( 'environment' )
            {
            // InternalXDrone.g:1443:1: ( 'environment' )
            // InternalXDrone.g:1444:2: 'environment'
            {
             before(grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getEnvironmentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__1__Impl"


    // $ANTLR start "rule__Environment__Group__2"
    // InternalXDrone.g:1453:1: rule__Environment__Group__2 : rule__Environment__Group__2__Impl rule__Environment__Group__3 ;
    public final void rule__Environment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1457:1: ( rule__Environment__Group__2__Impl rule__Environment__Group__3 )
            // InternalXDrone.g:1458:2: rule__Environment__Group__2__Impl rule__Environment__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Environment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__2"


    // $ANTLR start "rule__Environment__Group__2__Impl"
    // InternalXDrone.g:1465:1: rule__Environment__Group__2__Impl : ( '(' ) ;
    public final void rule__Environment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1469:1: ( ( '(' ) )
            // InternalXDrone.g:1470:1: ( '(' )
            {
            // InternalXDrone.g:1470:1: ( '(' )
            // InternalXDrone.g:1471:2: '('
            {
             before(grammarAccess.getEnvironmentAccess().getLeftParenthesisKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__2__Impl"


    // $ANTLR start "rule__Environment__Group__3"
    // InternalXDrone.g:1480:1: rule__Environment__Group__3 : rule__Environment__Group__3__Impl rule__Environment__Group__4 ;
    public final void rule__Environment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1484:1: ( rule__Environment__Group__3__Impl rule__Environment__Group__4 )
            // InternalXDrone.g:1485:2: rule__Environment__Group__3__Impl rule__Environment__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Environment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__3"


    // $ANTLR start "rule__Environment__Group__3__Impl"
    // InternalXDrone.g:1492:1: rule__Environment__Group__3__Impl : ( ')' ) ;
    public final void rule__Environment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1496:1: ( ( ')' ) )
            // InternalXDrone.g:1497:1: ( ')' )
            {
            // InternalXDrone.g:1497:1: ( ')' )
            // InternalXDrone.g:1498:2: ')'
            {
             before(grammarAccess.getEnvironmentAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__3__Impl"


    // $ANTLR start "rule__Environment__Group__4"
    // InternalXDrone.g:1507:1: rule__Environment__Group__4 : rule__Environment__Group__4__Impl rule__Environment__Group__5 ;
    public final void rule__Environment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1511:1: ( rule__Environment__Group__4__Impl rule__Environment__Group__5 )
            // InternalXDrone.g:1512:2: rule__Environment__Group__4__Impl rule__Environment__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Environment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__4"


    // $ANTLR start "rule__Environment__Group__4__Impl"
    // InternalXDrone.g:1519:1: rule__Environment__Group__4__Impl : ( '{' ) ;
    public final void rule__Environment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1523:1: ( ( '{' ) )
            // InternalXDrone.g:1524:1: ( '{' )
            {
            // InternalXDrone.g:1524:1: ( '{' )
            // InternalXDrone.g:1525:2: '{'
            {
             before(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__4__Impl"


    // $ANTLR start "rule__Environment__Group__5"
    // InternalXDrone.g:1534:1: rule__Environment__Group__5 : rule__Environment__Group__5__Impl rule__Environment__Group__6 ;
    public final void rule__Environment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1538:1: ( rule__Environment__Group__5__Impl rule__Environment__Group__6 )
            // InternalXDrone.g:1539:2: rule__Environment__Group__5__Impl rule__Environment__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Environment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Environment__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__5"


    // $ANTLR start "rule__Environment__Group__5__Impl"
    // InternalXDrone.g:1546:1: rule__Environment__Group__5__Impl : ( ( rule__Environment__Alternatives_5 )* ) ;
    public final void rule__Environment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1550:1: ( ( ( rule__Environment__Alternatives_5 )* ) )
            // InternalXDrone.g:1551:1: ( ( rule__Environment__Alternatives_5 )* )
            {
            // InternalXDrone.g:1551:1: ( ( rule__Environment__Alternatives_5 )* )
            // InternalXDrone.g:1552:2: ( rule__Environment__Alternatives_5 )*
            {
             before(grammarAccess.getEnvironmentAccess().getAlternatives_5()); 
            // InternalXDrone.g:1553:2: ( rule__Environment__Alternatives_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==31||LA10_0==39) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXDrone.g:1553:3: rule__Environment__Alternatives_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Environment__Alternatives_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getEnvironmentAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__5__Impl"


    // $ANTLR start "rule__Environment__Group__6"
    // InternalXDrone.g:1561:1: rule__Environment__Group__6 : rule__Environment__Group__6__Impl ;
    public final void rule__Environment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1565:1: ( rule__Environment__Group__6__Impl )
            // InternalXDrone.g:1566:2: rule__Environment__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Environment__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__6"


    // $ANTLR start "rule__Environment__Group__6__Impl"
    // InternalXDrone.g:1572:1: rule__Environment__Group__6__Impl : ( '}' ) ;
    public final void rule__Environment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1576:1: ( ( '}' ) )
            // InternalXDrone.g:1577:1: ( '}' )
            {
            // InternalXDrone.g:1577:1: ( '}' )
            // InternalXDrone.g:1578:2: '}'
            {
             before(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__Group__6__Impl"


    // $ANTLR start "rule__Takeoff__Group__0"
    // InternalXDrone.g:1588:1: rule__Takeoff__Group__0 : rule__Takeoff__Group__0__Impl rule__Takeoff__Group__1 ;
    public final void rule__Takeoff__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1592:1: ( rule__Takeoff__Group__0__Impl rule__Takeoff__Group__1 )
            // InternalXDrone.g:1593:2: rule__Takeoff__Group__0__Impl rule__Takeoff__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Takeoff__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Takeoff__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Takeoff__Group__0"


    // $ANTLR start "rule__Takeoff__Group__0__Impl"
    // InternalXDrone.g:1600:1: rule__Takeoff__Group__0__Impl : ( 'TAKEOFF' ) ;
    public final void rule__Takeoff__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1604:1: ( ( 'TAKEOFF' ) )
            // InternalXDrone.g:1605:1: ( 'TAKEOFF' )
            {
            // InternalXDrone.g:1605:1: ( 'TAKEOFF' )
            // InternalXDrone.g:1606:2: 'TAKEOFF'
            {
             before(grammarAccess.getTakeoffAccess().getTAKEOFFKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTakeoffAccess().getTAKEOFFKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Takeoff__Group__0__Impl"


    // $ANTLR start "rule__Takeoff__Group__1"
    // InternalXDrone.g:1615:1: rule__Takeoff__Group__1 : rule__Takeoff__Group__1__Impl rule__Takeoff__Group__2 ;
    public final void rule__Takeoff__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1619:1: ( rule__Takeoff__Group__1__Impl rule__Takeoff__Group__2 )
            // InternalXDrone.g:1620:2: rule__Takeoff__Group__1__Impl rule__Takeoff__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Takeoff__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Takeoff__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Takeoff__Group__1"


    // $ANTLR start "rule__Takeoff__Group__1__Impl"
    // InternalXDrone.g:1627:1: rule__Takeoff__Group__1__Impl : ( '(' ) ;
    public final void rule__Takeoff__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1631:1: ( ( '(' ) )
            // InternalXDrone.g:1632:1: ( '(' )
            {
            // InternalXDrone.g:1632:1: ( '(' )
            // InternalXDrone.g:1633:2: '('
            {
             before(grammarAccess.getTakeoffAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTakeoffAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Takeoff__Group__1__Impl"


    // $ANTLR start "rule__Takeoff__Group__2"
    // InternalXDrone.g:1642:1: rule__Takeoff__Group__2 : rule__Takeoff__Group__2__Impl ;
    public final void rule__Takeoff__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1646:1: ( rule__Takeoff__Group__2__Impl )
            // InternalXDrone.g:1647:2: rule__Takeoff__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Takeoff__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Takeoff__Group__2"


    // $ANTLR start "rule__Takeoff__Group__2__Impl"
    // InternalXDrone.g:1653:1: rule__Takeoff__Group__2__Impl : ( ')' ) ;
    public final void rule__Takeoff__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1657:1: ( ( ')' ) )
            // InternalXDrone.g:1658:1: ( ')' )
            {
            // InternalXDrone.g:1658:1: ( ')' )
            // InternalXDrone.g:1659:2: ')'
            {
             before(grammarAccess.getTakeoffAccess().getRightParenthesisKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTakeoffAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Takeoff__Group__2__Impl"


    // $ANTLR start "rule__Land__Group__0"
    // InternalXDrone.g:1669:1: rule__Land__Group__0 : rule__Land__Group__0__Impl rule__Land__Group__1 ;
    public final void rule__Land__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1673:1: ( rule__Land__Group__0__Impl rule__Land__Group__1 )
            // InternalXDrone.g:1674:2: rule__Land__Group__0__Impl rule__Land__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Land__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Land__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Land__Group__0"


    // $ANTLR start "rule__Land__Group__0__Impl"
    // InternalXDrone.g:1681:1: rule__Land__Group__0__Impl : ( 'LAND' ) ;
    public final void rule__Land__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1685:1: ( ( 'LAND' ) )
            // InternalXDrone.g:1686:1: ( 'LAND' )
            {
            // InternalXDrone.g:1686:1: ( 'LAND' )
            // InternalXDrone.g:1687:2: 'LAND'
            {
             before(grammarAccess.getLandAccess().getLANDKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getLandAccess().getLANDKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Land__Group__0__Impl"


    // $ANTLR start "rule__Land__Group__1"
    // InternalXDrone.g:1696:1: rule__Land__Group__1 : rule__Land__Group__1__Impl rule__Land__Group__2 ;
    public final void rule__Land__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1700:1: ( rule__Land__Group__1__Impl rule__Land__Group__2 )
            // InternalXDrone.g:1701:2: rule__Land__Group__1__Impl rule__Land__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Land__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Land__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Land__Group__1"


    // $ANTLR start "rule__Land__Group__1__Impl"
    // InternalXDrone.g:1708:1: rule__Land__Group__1__Impl : ( '(' ) ;
    public final void rule__Land__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1712:1: ( ( '(' ) )
            // InternalXDrone.g:1713:1: ( '(' )
            {
            // InternalXDrone.g:1713:1: ( '(' )
            // InternalXDrone.g:1714:2: '('
            {
             before(grammarAccess.getLandAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLandAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Land__Group__1__Impl"


    // $ANTLR start "rule__Land__Group__2"
    // InternalXDrone.g:1723:1: rule__Land__Group__2 : rule__Land__Group__2__Impl ;
    public final void rule__Land__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1727:1: ( rule__Land__Group__2__Impl )
            // InternalXDrone.g:1728:2: rule__Land__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Land__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Land__Group__2"


    // $ANTLR start "rule__Land__Group__2__Impl"
    // InternalXDrone.g:1734:1: rule__Land__Group__2__Impl : ( ')' ) ;
    public final void rule__Land__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1738:1: ( ( ')' ) )
            // InternalXDrone.g:1739:1: ( ')' )
            {
            // InternalXDrone.g:1739:1: ( ')' )
            // InternalXDrone.g:1740:2: ')'
            {
             before(grammarAccess.getLandAccess().getRightParenthesisKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLandAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Land__Group__2__Impl"


    // $ANTLR start "rule__DOUBLE__Group_0__0"
    // InternalXDrone.g:1750:1: rule__DOUBLE__Group_0__0 : rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1 ;
    public final void rule__DOUBLE__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1754:1: ( rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1 )
            // InternalXDrone.g:1755:2: rule__DOUBLE__Group_0__0__Impl rule__DOUBLE__Group_0__1
            {
            pushFollow(FOLLOW_13);
            rule__DOUBLE__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group_0__0"


    // $ANTLR start "rule__DOUBLE__Group_0__0__Impl"
    // InternalXDrone.g:1762:1: rule__DOUBLE__Group_0__0__Impl : ( '-' ) ;
    public final void rule__DOUBLE__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1766:1: ( ( '-' ) )
            // InternalXDrone.g:1767:1: ( '-' )
            {
            // InternalXDrone.g:1767:1: ( '-' )
            // InternalXDrone.g:1768:2: '-'
            {
             before(grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group_0__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group_0__1"
    // InternalXDrone.g:1777:1: rule__DOUBLE__Group_0__1 : rule__DOUBLE__Group_0__1__Impl ;
    public final void rule__DOUBLE__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1781:1: ( rule__DOUBLE__Group_0__1__Impl )
            // InternalXDrone.g:1782:2: rule__DOUBLE__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group_0__1"


    // $ANTLR start "rule__DOUBLE__Group_0__1__Impl"
    // InternalXDrone.g:1788:1: rule__DOUBLE__Group_0__1__Impl : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__DOUBLE__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1792:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:1793:1: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:1793:1: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:1794:2: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getDOUBLEAccess().getPOSITIVE_DOUBLEParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLEAccess().getPOSITIVE_DOUBLEParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group_0__1__Impl"


    // $ANTLR start "rule__POSITIVE_DOUBLE__Group_0__0"
    // InternalXDrone.g:1804:1: rule__POSITIVE_DOUBLE__Group_0__0 : rule__POSITIVE_DOUBLE__Group_0__0__Impl rule__POSITIVE_DOUBLE__Group_0__1 ;
    public final void rule__POSITIVE_DOUBLE__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1808:1: ( rule__POSITIVE_DOUBLE__Group_0__0__Impl rule__POSITIVE_DOUBLE__Group_0__1 )
            // InternalXDrone.g:1809:2: rule__POSITIVE_DOUBLE__Group_0__0__Impl rule__POSITIVE_DOUBLE__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__POSITIVE_DOUBLE__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__POSITIVE_DOUBLE__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POSITIVE_DOUBLE__Group_0__0"


    // $ANTLR start "rule__POSITIVE_DOUBLE__Group_0__0__Impl"
    // InternalXDrone.g:1816:1: rule__POSITIVE_DOUBLE__Group_0__0__Impl : ( RULE_INT ) ;
    public final void rule__POSITIVE_DOUBLE__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1820:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1821:1: ( RULE_INT )
            {
            // InternalXDrone.g:1821:1: ( RULE_INT )
            // InternalXDrone.g:1822:2: RULE_INT
            {
             before(grammarAccess.getPOSITIVE_DOUBLEAccess().getINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPOSITIVE_DOUBLEAccess().getINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POSITIVE_DOUBLE__Group_0__0__Impl"


    // $ANTLR start "rule__POSITIVE_DOUBLE__Group_0__1"
    // InternalXDrone.g:1831:1: rule__POSITIVE_DOUBLE__Group_0__1 : rule__POSITIVE_DOUBLE__Group_0__1__Impl rule__POSITIVE_DOUBLE__Group_0__2 ;
    public final void rule__POSITIVE_DOUBLE__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1835:1: ( rule__POSITIVE_DOUBLE__Group_0__1__Impl rule__POSITIVE_DOUBLE__Group_0__2 )
            // InternalXDrone.g:1836:2: rule__POSITIVE_DOUBLE__Group_0__1__Impl rule__POSITIVE_DOUBLE__Group_0__2
            {
            pushFollow(FOLLOW_13);
            rule__POSITIVE_DOUBLE__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__POSITIVE_DOUBLE__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POSITIVE_DOUBLE__Group_0__1"


    // $ANTLR start "rule__POSITIVE_DOUBLE__Group_0__1__Impl"
    // InternalXDrone.g:1843:1: rule__POSITIVE_DOUBLE__Group_0__1__Impl : ( '.' ) ;
    public final void rule__POSITIVE_DOUBLE__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1847:1: ( ( '.' ) )
            // InternalXDrone.g:1848:1: ( '.' )
            {
            // InternalXDrone.g:1848:1: ( '.' )
            // InternalXDrone.g:1849:2: '.'
            {
             before(grammarAccess.getPOSITIVE_DOUBLEAccess().getFullStopKeyword_0_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPOSITIVE_DOUBLEAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POSITIVE_DOUBLE__Group_0__1__Impl"


    // $ANTLR start "rule__POSITIVE_DOUBLE__Group_0__2"
    // InternalXDrone.g:1858:1: rule__POSITIVE_DOUBLE__Group_0__2 : rule__POSITIVE_DOUBLE__Group_0__2__Impl ;
    public final void rule__POSITIVE_DOUBLE__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1862:1: ( rule__POSITIVE_DOUBLE__Group_0__2__Impl )
            // InternalXDrone.g:1863:2: rule__POSITIVE_DOUBLE__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__POSITIVE_DOUBLE__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POSITIVE_DOUBLE__Group_0__2"


    // $ANTLR start "rule__POSITIVE_DOUBLE__Group_0__2__Impl"
    // InternalXDrone.g:1869:1: rule__POSITIVE_DOUBLE__Group_0__2__Impl : ( RULE_INT ) ;
    public final void rule__POSITIVE_DOUBLE__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1873:1: ( ( RULE_INT ) )
            // InternalXDrone.g:1874:1: ( RULE_INT )
            {
            // InternalXDrone.g:1874:1: ( RULE_INT )
            // InternalXDrone.g:1875:2: RULE_INT
            {
             before(grammarAccess.getPOSITIVE_DOUBLEAccess().getINTTerminalRuleCall_0_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPOSITIVE_DOUBLEAccess().getINTTerminalRuleCall_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__POSITIVE_DOUBLE__Group_0__2__Impl"


    // $ANTLR start "rule__GoTo__Group__0"
    // InternalXDrone.g:1885:1: rule__GoTo__Group__0 : rule__GoTo__Group__0__Impl rule__GoTo__Group__1 ;
    public final void rule__GoTo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1889:1: ( rule__GoTo__Group__0__Impl rule__GoTo__Group__1 )
            // InternalXDrone.g:1890:2: rule__GoTo__Group__0__Impl rule__GoTo__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__GoTo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoTo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__0"


    // $ANTLR start "rule__GoTo__Group__0__Impl"
    // InternalXDrone.g:1897:1: rule__GoTo__Group__0__Impl : ( 'GOTO' ) ;
    public final void rule__GoTo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1901:1: ( ( 'GOTO' ) )
            // InternalXDrone.g:1902:1: ( 'GOTO' )
            {
            // InternalXDrone.g:1902:1: ( 'GOTO' )
            // InternalXDrone.g:1903:2: 'GOTO'
            {
             before(grammarAccess.getGoToAccess().getGOTOKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getGOTOKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__0__Impl"


    // $ANTLR start "rule__GoTo__Group__1"
    // InternalXDrone.g:1912:1: rule__GoTo__Group__1 : rule__GoTo__Group__1__Impl rule__GoTo__Group__2 ;
    public final void rule__GoTo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1916:1: ( rule__GoTo__Group__1__Impl rule__GoTo__Group__2 )
            // InternalXDrone.g:1917:2: rule__GoTo__Group__1__Impl rule__GoTo__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__GoTo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoTo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__1"


    // $ANTLR start "rule__GoTo__Group__1__Impl"
    // InternalXDrone.g:1924:1: rule__GoTo__Group__1__Impl : ( '(' ) ;
    public final void rule__GoTo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1928:1: ( ( '(' ) )
            // InternalXDrone.g:1929:1: ( '(' )
            {
            // InternalXDrone.g:1929:1: ( '(' )
            // InternalXDrone.g:1930:2: '('
            {
             before(grammarAccess.getGoToAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__1__Impl"


    // $ANTLR start "rule__GoTo__Group__2"
    // InternalXDrone.g:1939:1: rule__GoTo__Group__2 : rule__GoTo__Group__2__Impl rule__GoTo__Group__3 ;
    public final void rule__GoTo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1943:1: ( rule__GoTo__Group__2__Impl rule__GoTo__Group__3 )
            // InternalXDrone.g:1944:2: rule__GoTo__Group__2__Impl rule__GoTo__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__GoTo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GoTo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__2"


    // $ANTLR start "rule__GoTo__Group__2__Impl"
    // InternalXDrone.g:1951:1: rule__GoTo__Group__2__Impl : ( ( rule__GoTo__Object_nameAssignment_2 ) ) ;
    public final void rule__GoTo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1955:1: ( ( ( rule__GoTo__Object_nameAssignment_2 ) ) )
            // InternalXDrone.g:1956:1: ( ( rule__GoTo__Object_nameAssignment_2 ) )
            {
            // InternalXDrone.g:1956:1: ( ( rule__GoTo__Object_nameAssignment_2 ) )
            // InternalXDrone.g:1957:2: ( rule__GoTo__Object_nameAssignment_2 )
            {
             before(grammarAccess.getGoToAccess().getObject_nameAssignment_2()); 
            // InternalXDrone.g:1958:2: ( rule__GoTo__Object_nameAssignment_2 )
            // InternalXDrone.g:1958:3: rule__GoTo__Object_nameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__Object_nameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGoToAccess().getObject_nameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__2__Impl"


    // $ANTLR start "rule__GoTo__Group__3"
    // InternalXDrone.g:1966:1: rule__GoTo__Group__3 : rule__GoTo__Group__3__Impl ;
    public final void rule__GoTo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1970:1: ( rule__GoTo__Group__3__Impl )
            // InternalXDrone.g:1971:2: rule__GoTo__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GoTo__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__3"


    // $ANTLR start "rule__GoTo__Group__3__Impl"
    // InternalXDrone.g:1977:1: rule__GoTo__Group__3__Impl : ( ')' ) ;
    public final void rule__GoTo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1981:1: ( ( ')' ) )
            // InternalXDrone.g:1982:1: ( ')' )
            {
            // InternalXDrone.g:1982:1: ( ')' )
            // InternalXDrone.g:1983:2: ')'
            {
             before(grammarAccess.getGoToAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Group__3__Impl"


    // $ANTLR start "rule__Up__Group__0"
    // InternalXDrone.g:1993:1: rule__Up__Group__0 : rule__Up__Group__0__Impl rule__Up__Group__1 ;
    public final void rule__Up__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:1997:1: ( rule__Up__Group__0__Impl rule__Up__Group__1 )
            // InternalXDrone.g:1998:2: rule__Up__Group__0__Impl rule__Up__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Up__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Up__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Up__Group__0"


    // $ANTLR start "rule__Up__Group__0__Impl"
    // InternalXDrone.g:2005:1: rule__Up__Group__0__Impl : ( 'UP' ) ;
    public final void rule__Up__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2009:1: ( ( 'UP' ) )
            // InternalXDrone.g:2010:1: ( 'UP' )
            {
            // InternalXDrone.g:2010:1: ( 'UP' )
            // InternalXDrone.g:2011:2: 'UP'
            {
             before(grammarAccess.getUpAccess().getUPKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUpAccess().getUPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Up__Group__0__Impl"


    // $ANTLR start "rule__Up__Group__1"
    // InternalXDrone.g:2020:1: rule__Up__Group__1 : rule__Up__Group__1__Impl rule__Up__Group__2 ;
    public final void rule__Up__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2024:1: ( rule__Up__Group__1__Impl rule__Up__Group__2 )
            // InternalXDrone.g:2025:2: rule__Up__Group__1__Impl rule__Up__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Up__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Up__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Up__Group__1"


    // $ANTLR start "rule__Up__Group__1__Impl"
    // InternalXDrone.g:2032:1: rule__Up__Group__1__Impl : ( '(' ) ;
    public final void rule__Up__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2036:1: ( ( '(' ) )
            // InternalXDrone.g:2037:1: ( '(' )
            {
            // InternalXDrone.g:2037:1: ( '(' )
            // InternalXDrone.g:2038:2: '('
            {
             before(grammarAccess.getUpAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getUpAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Up__Group__1__Impl"


    // $ANTLR start "rule__Up__Group__2"
    // InternalXDrone.g:2047:1: rule__Up__Group__2 : rule__Up__Group__2__Impl rule__Up__Group__3 ;
    public final void rule__Up__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2051:1: ( rule__Up__Group__2__Impl rule__Up__Group__3 )
            // InternalXDrone.g:2052:2: rule__Up__Group__2__Impl rule__Up__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Up__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Up__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Up__Group__2"


    // $ANTLR start "rule__Up__Group__2__Impl"
    // InternalXDrone.g:2059:1: rule__Up__Group__2__Impl : ( ( rule__Up__DistanceAssignment_2 ) ) ;
    public final void rule__Up__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2063:1: ( ( ( rule__Up__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:2064:1: ( ( rule__Up__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:2064:1: ( ( rule__Up__DistanceAssignment_2 ) )
            // InternalXDrone.g:2065:2: ( rule__Up__DistanceAssignment_2 )
            {
             before(grammarAccess.getUpAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:2066:2: ( rule__Up__DistanceAssignment_2 )
            // InternalXDrone.g:2066:3: rule__Up__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Up__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUpAccess().getDistanceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Up__Group__2__Impl"


    // $ANTLR start "rule__Up__Group__3"
    // InternalXDrone.g:2074:1: rule__Up__Group__3 : rule__Up__Group__3__Impl ;
    public final void rule__Up__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2078:1: ( rule__Up__Group__3__Impl )
            // InternalXDrone.g:2079:2: rule__Up__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Up__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Up__Group__3"


    // $ANTLR start "rule__Up__Group__3__Impl"
    // InternalXDrone.g:2085:1: rule__Up__Group__3__Impl : ( ')' ) ;
    public final void rule__Up__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2089:1: ( ( ')' ) )
            // InternalXDrone.g:2090:1: ( ')' )
            {
            // InternalXDrone.g:2090:1: ( ')' )
            // InternalXDrone.g:2091:2: ')'
            {
             before(grammarAccess.getUpAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getUpAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Up__Group__3__Impl"


    // $ANTLR start "rule__Down__Group__0"
    // InternalXDrone.g:2101:1: rule__Down__Group__0 : rule__Down__Group__0__Impl rule__Down__Group__1 ;
    public final void rule__Down__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2105:1: ( rule__Down__Group__0__Impl rule__Down__Group__1 )
            // InternalXDrone.g:2106:2: rule__Down__Group__0__Impl rule__Down__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Down__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Down__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Down__Group__0"


    // $ANTLR start "rule__Down__Group__0__Impl"
    // InternalXDrone.g:2113:1: rule__Down__Group__0__Impl : ( 'DOWN' ) ;
    public final void rule__Down__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2117:1: ( ( 'DOWN' ) )
            // InternalXDrone.g:2118:1: ( 'DOWN' )
            {
            // InternalXDrone.g:2118:1: ( 'DOWN' )
            // InternalXDrone.g:2119:2: 'DOWN'
            {
             before(grammarAccess.getDownAccess().getDOWNKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDownAccess().getDOWNKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Down__Group__0__Impl"


    // $ANTLR start "rule__Down__Group__1"
    // InternalXDrone.g:2128:1: rule__Down__Group__1 : rule__Down__Group__1__Impl rule__Down__Group__2 ;
    public final void rule__Down__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2132:1: ( rule__Down__Group__1__Impl rule__Down__Group__2 )
            // InternalXDrone.g:2133:2: rule__Down__Group__1__Impl rule__Down__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Down__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Down__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Down__Group__1"


    // $ANTLR start "rule__Down__Group__1__Impl"
    // InternalXDrone.g:2140:1: rule__Down__Group__1__Impl : ( '(' ) ;
    public final void rule__Down__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2144:1: ( ( '(' ) )
            // InternalXDrone.g:2145:1: ( '(' )
            {
            // InternalXDrone.g:2145:1: ( '(' )
            // InternalXDrone.g:2146:2: '('
            {
             before(grammarAccess.getDownAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDownAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Down__Group__1__Impl"


    // $ANTLR start "rule__Down__Group__2"
    // InternalXDrone.g:2155:1: rule__Down__Group__2 : rule__Down__Group__2__Impl rule__Down__Group__3 ;
    public final void rule__Down__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2159:1: ( rule__Down__Group__2__Impl rule__Down__Group__3 )
            // InternalXDrone.g:2160:2: rule__Down__Group__2__Impl rule__Down__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Down__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Down__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Down__Group__2"


    // $ANTLR start "rule__Down__Group__2__Impl"
    // InternalXDrone.g:2167:1: rule__Down__Group__2__Impl : ( ( rule__Down__DistanceAssignment_2 ) ) ;
    public final void rule__Down__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2171:1: ( ( ( rule__Down__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:2172:1: ( ( rule__Down__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:2172:1: ( ( rule__Down__DistanceAssignment_2 ) )
            // InternalXDrone.g:2173:2: ( rule__Down__DistanceAssignment_2 )
            {
             before(grammarAccess.getDownAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:2174:2: ( rule__Down__DistanceAssignment_2 )
            // InternalXDrone.g:2174:3: rule__Down__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Down__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDownAccess().getDistanceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Down__Group__2__Impl"


    // $ANTLR start "rule__Down__Group__3"
    // InternalXDrone.g:2182:1: rule__Down__Group__3 : rule__Down__Group__3__Impl ;
    public final void rule__Down__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2186:1: ( rule__Down__Group__3__Impl )
            // InternalXDrone.g:2187:2: rule__Down__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Down__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Down__Group__3"


    // $ANTLR start "rule__Down__Group__3__Impl"
    // InternalXDrone.g:2193:1: rule__Down__Group__3__Impl : ( ')' ) ;
    public final void rule__Down__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2197:1: ( ( ')' ) )
            // InternalXDrone.g:2198:1: ( ')' )
            {
            // InternalXDrone.g:2198:1: ( ')' )
            // InternalXDrone.g:2199:2: ')'
            {
             before(grammarAccess.getDownAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDownAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Down__Group__3__Impl"


    // $ANTLR start "rule__Left__Group__0"
    // InternalXDrone.g:2209:1: rule__Left__Group__0 : rule__Left__Group__0__Impl rule__Left__Group__1 ;
    public final void rule__Left__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2213:1: ( rule__Left__Group__0__Impl rule__Left__Group__1 )
            // InternalXDrone.g:2214:2: rule__Left__Group__0__Impl rule__Left__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Left__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Left__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__0"


    // $ANTLR start "rule__Left__Group__0__Impl"
    // InternalXDrone.g:2221:1: rule__Left__Group__0__Impl : ( 'LEFT' ) ;
    public final void rule__Left__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2225:1: ( ( 'LEFT' ) )
            // InternalXDrone.g:2226:1: ( 'LEFT' )
            {
            // InternalXDrone.g:2226:1: ( 'LEFT' )
            // InternalXDrone.g:2227:2: 'LEFT'
            {
             before(grammarAccess.getLeftAccess().getLEFTKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLeftAccess().getLEFTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__0__Impl"


    // $ANTLR start "rule__Left__Group__1"
    // InternalXDrone.g:2236:1: rule__Left__Group__1 : rule__Left__Group__1__Impl rule__Left__Group__2 ;
    public final void rule__Left__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2240:1: ( rule__Left__Group__1__Impl rule__Left__Group__2 )
            // InternalXDrone.g:2241:2: rule__Left__Group__1__Impl rule__Left__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Left__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Left__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__1"


    // $ANTLR start "rule__Left__Group__1__Impl"
    // InternalXDrone.g:2248:1: rule__Left__Group__1__Impl : ( '(' ) ;
    public final void rule__Left__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2252:1: ( ( '(' ) )
            // InternalXDrone.g:2253:1: ( '(' )
            {
            // InternalXDrone.g:2253:1: ( '(' )
            // InternalXDrone.g:2254:2: '('
            {
             before(grammarAccess.getLeftAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLeftAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__1__Impl"


    // $ANTLR start "rule__Left__Group__2"
    // InternalXDrone.g:2263:1: rule__Left__Group__2 : rule__Left__Group__2__Impl rule__Left__Group__3 ;
    public final void rule__Left__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2267:1: ( rule__Left__Group__2__Impl rule__Left__Group__3 )
            // InternalXDrone.g:2268:2: rule__Left__Group__2__Impl rule__Left__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Left__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Left__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__2"


    // $ANTLR start "rule__Left__Group__2__Impl"
    // InternalXDrone.g:2275:1: rule__Left__Group__2__Impl : ( ( rule__Left__DistanceAssignment_2 ) ) ;
    public final void rule__Left__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2279:1: ( ( ( rule__Left__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:2280:1: ( ( rule__Left__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:2280:1: ( ( rule__Left__DistanceAssignment_2 ) )
            // InternalXDrone.g:2281:2: ( rule__Left__DistanceAssignment_2 )
            {
             before(grammarAccess.getLeftAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:2282:2: ( rule__Left__DistanceAssignment_2 )
            // InternalXDrone.g:2282:3: rule__Left__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Left__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLeftAccess().getDistanceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__2__Impl"


    // $ANTLR start "rule__Left__Group__3"
    // InternalXDrone.g:2290:1: rule__Left__Group__3 : rule__Left__Group__3__Impl ;
    public final void rule__Left__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2294:1: ( rule__Left__Group__3__Impl )
            // InternalXDrone.g:2295:2: rule__Left__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Left__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__3"


    // $ANTLR start "rule__Left__Group__3__Impl"
    // InternalXDrone.g:2301:1: rule__Left__Group__3__Impl : ( ')' ) ;
    public final void rule__Left__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2305:1: ( ( ')' ) )
            // InternalXDrone.g:2306:1: ( ')' )
            {
            // InternalXDrone.g:2306:1: ( ')' )
            // InternalXDrone.g:2307:2: ')'
            {
             before(grammarAccess.getLeftAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLeftAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__3__Impl"


    // $ANTLR start "rule__Right__Group__0"
    // InternalXDrone.g:2317:1: rule__Right__Group__0 : rule__Right__Group__0__Impl rule__Right__Group__1 ;
    public final void rule__Right__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2321:1: ( rule__Right__Group__0__Impl rule__Right__Group__1 )
            // InternalXDrone.g:2322:2: rule__Right__Group__0__Impl rule__Right__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Right__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Right__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__0"


    // $ANTLR start "rule__Right__Group__0__Impl"
    // InternalXDrone.g:2329:1: rule__Right__Group__0__Impl : ( 'RIGHT' ) ;
    public final void rule__Right__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2333:1: ( ( 'RIGHT' ) )
            // InternalXDrone.g:2334:1: ( 'RIGHT' )
            {
            // InternalXDrone.g:2334:1: ( 'RIGHT' )
            // InternalXDrone.g:2335:2: 'RIGHT'
            {
             before(grammarAccess.getRightAccess().getRIGHTKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRightAccess().getRIGHTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__0__Impl"


    // $ANTLR start "rule__Right__Group__1"
    // InternalXDrone.g:2344:1: rule__Right__Group__1 : rule__Right__Group__1__Impl rule__Right__Group__2 ;
    public final void rule__Right__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2348:1: ( rule__Right__Group__1__Impl rule__Right__Group__2 )
            // InternalXDrone.g:2349:2: rule__Right__Group__1__Impl rule__Right__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Right__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Right__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__1"


    // $ANTLR start "rule__Right__Group__1__Impl"
    // InternalXDrone.g:2356:1: rule__Right__Group__1__Impl : ( '(' ) ;
    public final void rule__Right__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2360:1: ( ( '(' ) )
            // InternalXDrone.g:2361:1: ( '(' )
            {
            // InternalXDrone.g:2361:1: ( '(' )
            // InternalXDrone.g:2362:2: '('
            {
             before(grammarAccess.getRightAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRightAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__1__Impl"


    // $ANTLR start "rule__Right__Group__2"
    // InternalXDrone.g:2371:1: rule__Right__Group__2 : rule__Right__Group__2__Impl rule__Right__Group__3 ;
    public final void rule__Right__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2375:1: ( rule__Right__Group__2__Impl rule__Right__Group__3 )
            // InternalXDrone.g:2376:2: rule__Right__Group__2__Impl rule__Right__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Right__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Right__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__2"


    // $ANTLR start "rule__Right__Group__2__Impl"
    // InternalXDrone.g:2383:1: rule__Right__Group__2__Impl : ( ( rule__Right__DistanceAssignment_2 ) ) ;
    public final void rule__Right__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2387:1: ( ( ( rule__Right__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:2388:1: ( ( rule__Right__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:2388:1: ( ( rule__Right__DistanceAssignment_2 ) )
            // InternalXDrone.g:2389:2: ( rule__Right__DistanceAssignment_2 )
            {
             before(grammarAccess.getRightAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:2390:2: ( rule__Right__DistanceAssignment_2 )
            // InternalXDrone.g:2390:3: rule__Right__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Right__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRightAccess().getDistanceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__2__Impl"


    // $ANTLR start "rule__Right__Group__3"
    // InternalXDrone.g:2398:1: rule__Right__Group__3 : rule__Right__Group__3__Impl ;
    public final void rule__Right__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2402:1: ( rule__Right__Group__3__Impl )
            // InternalXDrone.g:2403:2: rule__Right__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Right__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__3"


    // $ANTLR start "rule__Right__Group__3__Impl"
    // InternalXDrone.g:2409:1: rule__Right__Group__3__Impl : ( ')' ) ;
    public final void rule__Right__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2413:1: ( ( ')' ) )
            // InternalXDrone.g:2414:1: ( ')' )
            {
            // InternalXDrone.g:2414:1: ( ')' )
            // InternalXDrone.g:2415:2: ')'
            {
             before(grammarAccess.getRightAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRightAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__3__Impl"


    // $ANTLR start "rule__Forward__Group__0"
    // InternalXDrone.g:2425:1: rule__Forward__Group__0 : rule__Forward__Group__0__Impl rule__Forward__Group__1 ;
    public final void rule__Forward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2429:1: ( rule__Forward__Group__0__Impl rule__Forward__Group__1 )
            // InternalXDrone.g:2430:2: rule__Forward__Group__0__Impl rule__Forward__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Forward__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forward__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forward__Group__0"


    // $ANTLR start "rule__Forward__Group__0__Impl"
    // InternalXDrone.g:2437:1: rule__Forward__Group__0__Impl : ( 'FORWARD' ) ;
    public final void rule__Forward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2441:1: ( ( 'FORWARD' ) )
            // InternalXDrone.g:2442:1: ( 'FORWARD' )
            {
            // InternalXDrone.g:2442:1: ( 'FORWARD' )
            // InternalXDrone.g:2443:2: 'FORWARD'
            {
             before(grammarAccess.getForwardAccess().getFORWARDKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getForwardAccess().getFORWARDKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forward__Group__0__Impl"


    // $ANTLR start "rule__Forward__Group__1"
    // InternalXDrone.g:2452:1: rule__Forward__Group__1 : rule__Forward__Group__1__Impl rule__Forward__Group__2 ;
    public final void rule__Forward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2456:1: ( rule__Forward__Group__1__Impl rule__Forward__Group__2 )
            // InternalXDrone.g:2457:2: rule__Forward__Group__1__Impl rule__Forward__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Forward__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forward__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forward__Group__1"


    // $ANTLR start "rule__Forward__Group__1__Impl"
    // InternalXDrone.g:2464:1: rule__Forward__Group__1__Impl : ( '(' ) ;
    public final void rule__Forward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2468:1: ( ( '(' ) )
            // InternalXDrone.g:2469:1: ( '(' )
            {
            // InternalXDrone.g:2469:1: ( '(' )
            // InternalXDrone.g:2470:2: '('
            {
             before(grammarAccess.getForwardAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getForwardAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forward__Group__1__Impl"


    // $ANTLR start "rule__Forward__Group__2"
    // InternalXDrone.g:2479:1: rule__Forward__Group__2 : rule__Forward__Group__2__Impl rule__Forward__Group__3 ;
    public final void rule__Forward__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2483:1: ( rule__Forward__Group__2__Impl rule__Forward__Group__3 )
            // InternalXDrone.g:2484:2: rule__Forward__Group__2__Impl rule__Forward__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Forward__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forward__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forward__Group__2"


    // $ANTLR start "rule__Forward__Group__2__Impl"
    // InternalXDrone.g:2491:1: rule__Forward__Group__2__Impl : ( ( rule__Forward__DistanceAssignment_2 ) ) ;
    public final void rule__Forward__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2495:1: ( ( ( rule__Forward__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:2496:1: ( ( rule__Forward__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:2496:1: ( ( rule__Forward__DistanceAssignment_2 ) )
            // InternalXDrone.g:2497:2: ( rule__Forward__DistanceAssignment_2 )
            {
             before(grammarAccess.getForwardAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:2498:2: ( rule__Forward__DistanceAssignment_2 )
            // InternalXDrone.g:2498:3: rule__Forward__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Forward__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForwardAccess().getDistanceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forward__Group__2__Impl"


    // $ANTLR start "rule__Forward__Group__3"
    // InternalXDrone.g:2506:1: rule__Forward__Group__3 : rule__Forward__Group__3__Impl ;
    public final void rule__Forward__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2510:1: ( rule__Forward__Group__3__Impl )
            // InternalXDrone.g:2511:2: rule__Forward__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Forward__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forward__Group__3"


    // $ANTLR start "rule__Forward__Group__3__Impl"
    // InternalXDrone.g:2517:1: rule__Forward__Group__3__Impl : ( ')' ) ;
    public final void rule__Forward__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2521:1: ( ( ')' ) )
            // InternalXDrone.g:2522:1: ( ')' )
            {
            // InternalXDrone.g:2522:1: ( ')' )
            // InternalXDrone.g:2523:2: ')'
            {
             before(grammarAccess.getForwardAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getForwardAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forward__Group__3__Impl"


    // $ANTLR start "rule__Backward__Group__0"
    // InternalXDrone.g:2533:1: rule__Backward__Group__0 : rule__Backward__Group__0__Impl rule__Backward__Group__1 ;
    public final void rule__Backward__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2537:1: ( rule__Backward__Group__0__Impl rule__Backward__Group__1 )
            // InternalXDrone.g:2538:2: rule__Backward__Group__0__Impl rule__Backward__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Backward__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Backward__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backward__Group__0"


    // $ANTLR start "rule__Backward__Group__0__Impl"
    // InternalXDrone.g:2545:1: rule__Backward__Group__0__Impl : ( 'BACKWARD' ) ;
    public final void rule__Backward__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2549:1: ( ( 'BACKWARD' ) )
            // InternalXDrone.g:2550:1: ( 'BACKWARD' )
            {
            // InternalXDrone.g:2550:1: ( 'BACKWARD' )
            // InternalXDrone.g:2551:2: 'BACKWARD'
            {
             before(grammarAccess.getBackwardAccess().getBACKWARDKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBackwardAccess().getBACKWARDKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backward__Group__0__Impl"


    // $ANTLR start "rule__Backward__Group__1"
    // InternalXDrone.g:2560:1: rule__Backward__Group__1 : rule__Backward__Group__1__Impl rule__Backward__Group__2 ;
    public final void rule__Backward__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2564:1: ( rule__Backward__Group__1__Impl rule__Backward__Group__2 )
            // InternalXDrone.g:2565:2: rule__Backward__Group__1__Impl rule__Backward__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Backward__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Backward__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backward__Group__1"


    // $ANTLR start "rule__Backward__Group__1__Impl"
    // InternalXDrone.g:2572:1: rule__Backward__Group__1__Impl : ( '(' ) ;
    public final void rule__Backward__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2576:1: ( ( '(' ) )
            // InternalXDrone.g:2577:1: ( '(' )
            {
            // InternalXDrone.g:2577:1: ( '(' )
            // InternalXDrone.g:2578:2: '('
            {
             before(grammarAccess.getBackwardAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getBackwardAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backward__Group__1__Impl"


    // $ANTLR start "rule__Backward__Group__2"
    // InternalXDrone.g:2587:1: rule__Backward__Group__2 : rule__Backward__Group__2__Impl rule__Backward__Group__3 ;
    public final void rule__Backward__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2591:1: ( rule__Backward__Group__2__Impl rule__Backward__Group__3 )
            // InternalXDrone.g:2592:2: rule__Backward__Group__2__Impl rule__Backward__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Backward__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Backward__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backward__Group__2"


    // $ANTLR start "rule__Backward__Group__2__Impl"
    // InternalXDrone.g:2599:1: rule__Backward__Group__2__Impl : ( ( rule__Backward__DistanceAssignment_2 ) ) ;
    public final void rule__Backward__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2603:1: ( ( ( rule__Backward__DistanceAssignment_2 ) ) )
            // InternalXDrone.g:2604:1: ( ( rule__Backward__DistanceAssignment_2 ) )
            {
            // InternalXDrone.g:2604:1: ( ( rule__Backward__DistanceAssignment_2 ) )
            // InternalXDrone.g:2605:2: ( rule__Backward__DistanceAssignment_2 )
            {
             before(grammarAccess.getBackwardAccess().getDistanceAssignment_2()); 
            // InternalXDrone.g:2606:2: ( rule__Backward__DistanceAssignment_2 )
            // InternalXDrone.g:2606:3: rule__Backward__DistanceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Backward__DistanceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBackwardAccess().getDistanceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backward__Group__2__Impl"


    // $ANTLR start "rule__Backward__Group__3"
    // InternalXDrone.g:2614:1: rule__Backward__Group__3 : rule__Backward__Group__3__Impl ;
    public final void rule__Backward__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2618:1: ( rule__Backward__Group__3__Impl )
            // InternalXDrone.g:2619:2: rule__Backward__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Backward__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backward__Group__3"


    // $ANTLR start "rule__Backward__Group__3__Impl"
    // InternalXDrone.g:2625:1: rule__Backward__Group__3__Impl : ( ')' ) ;
    public final void rule__Backward__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2629:1: ( ( ')' ) )
            // InternalXDrone.g:2630:1: ( ')' )
            {
            // InternalXDrone.g:2630:1: ( ')' )
            // InternalXDrone.g:2631:2: ')'
            {
             before(grammarAccess.getBackwardAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBackwardAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backward__Group__3__Impl"


    // $ANTLR start "rule__RotateL__Group__0"
    // InternalXDrone.g:2641:1: rule__RotateL__Group__0 : rule__RotateL__Group__0__Impl rule__RotateL__Group__1 ;
    public final void rule__RotateL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2645:1: ( rule__RotateL__Group__0__Impl rule__RotateL__Group__1 )
            // InternalXDrone.g:2646:2: rule__RotateL__Group__0__Impl rule__RotateL__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RotateL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateL__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateL__Group__0"


    // $ANTLR start "rule__RotateL__Group__0__Impl"
    // InternalXDrone.g:2653:1: rule__RotateL__Group__0__Impl : ( 'ROTATELEFT' ) ;
    public final void rule__RotateL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2657:1: ( ( 'ROTATELEFT' ) )
            // InternalXDrone.g:2658:1: ( 'ROTATELEFT' )
            {
            // InternalXDrone.g:2658:1: ( 'ROTATELEFT' )
            // InternalXDrone.g:2659:2: 'ROTATELEFT'
            {
             before(grammarAccess.getRotateLAccess().getROTATELEFTKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRotateLAccess().getROTATELEFTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateL__Group__0__Impl"


    // $ANTLR start "rule__RotateL__Group__1"
    // InternalXDrone.g:2668:1: rule__RotateL__Group__1 : rule__RotateL__Group__1__Impl rule__RotateL__Group__2 ;
    public final void rule__RotateL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2672:1: ( rule__RotateL__Group__1__Impl rule__RotateL__Group__2 )
            // InternalXDrone.g:2673:2: rule__RotateL__Group__1__Impl rule__RotateL__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__RotateL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateL__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateL__Group__1"


    // $ANTLR start "rule__RotateL__Group__1__Impl"
    // InternalXDrone.g:2680:1: rule__RotateL__Group__1__Impl : ( '(' ) ;
    public final void rule__RotateL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2684:1: ( ( '(' ) )
            // InternalXDrone.g:2685:1: ( '(' )
            {
            // InternalXDrone.g:2685:1: ( '(' )
            // InternalXDrone.g:2686:2: '('
            {
             before(grammarAccess.getRotateLAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRotateLAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateL__Group__1__Impl"


    // $ANTLR start "rule__RotateL__Group__2"
    // InternalXDrone.g:2695:1: rule__RotateL__Group__2 : rule__RotateL__Group__2__Impl rule__RotateL__Group__3 ;
    public final void rule__RotateL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2699:1: ( rule__RotateL__Group__2__Impl rule__RotateL__Group__3 )
            // InternalXDrone.g:2700:2: rule__RotateL__Group__2__Impl rule__RotateL__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__RotateL__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateL__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateL__Group__2"


    // $ANTLR start "rule__RotateL__Group__2__Impl"
    // InternalXDrone.g:2707:1: rule__RotateL__Group__2__Impl : ( ( rule__RotateL__AngleAssignment_2 ) ) ;
    public final void rule__RotateL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2711:1: ( ( ( rule__RotateL__AngleAssignment_2 ) ) )
            // InternalXDrone.g:2712:1: ( ( rule__RotateL__AngleAssignment_2 ) )
            {
            // InternalXDrone.g:2712:1: ( ( rule__RotateL__AngleAssignment_2 ) )
            // InternalXDrone.g:2713:2: ( rule__RotateL__AngleAssignment_2 )
            {
             before(grammarAccess.getRotateLAccess().getAngleAssignment_2()); 
            // InternalXDrone.g:2714:2: ( rule__RotateL__AngleAssignment_2 )
            // InternalXDrone.g:2714:3: rule__RotateL__AngleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RotateL__AngleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRotateLAccess().getAngleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateL__Group__2__Impl"


    // $ANTLR start "rule__RotateL__Group__3"
    // InternalXDrone.g:2722:1: rule__RotateL__Group__3 : rule__RotateL__Group__3__Impl ;
    public final void rule__RotateL__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2726:1: ( rule__RotateL__Group__3__Impl )
            // InternalXDrone.g:2727:2: rule__RotateL__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RotateL__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateL__Group__3"


    // $ANTLR start "rule__RotateL__Group__3__Impl"
    // InternalXDrone.g:2733:1: rule__RotateL__Group__3__Impl : ( ')' ) ;
    public final void rule__RotateL__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2737:1: ( ( ')' ) )
            // InternalXDrone.g:2738:1: ( ')' )
            {
            // InternalXDrone.g:2738:1: ( ')' )
            // InternalXDrone.g:2739:2: ')'
            {
             before(grammarAccess.getRotateLAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRotateLAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateL__Group__3__Impl"


    // $ANTLR start "rule__RotateR__Group__0"
    // InternalXDrone.g:2749:1: rule__RotateR__Group__0 : rule__RotateR__Group__0__Impl rule__RotateR__Group__1 ;
    public final void rule__RotateR__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2753:1: ( rule__RotateR__Group__0__Impl rule__RotateR__Group__1 )
            // InternalXDrone.g:2754:2: rule__RotateR__Group__0__Impl rule__RotateR__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RotateR__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateR__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateR__Group__0"


    // $ANTLR start "rule__RotateR__Group__0__Impl"
    // InternalXDrone.g:2761:1: rule__RotateR__Group__0__Impl : ( 'ROTATERIGHT' ) ;
    public final void rule__RotateR__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2765:1: ( ( 'ROTATERIGHT' ) )
            // InternalXDrone.g:2766:1: ( 'ROTATERIGHT' )
            {
            // InternalXDrone.g:2766:1: ( 'ROTATERIGHT' )
            // InternalXDrone.g:2767:2: 'ROTATERIGHT'
            {
             before(grammarAccess.getRotateRAccess().getROTATERIGHTKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRotateRAccess().getROTATERIGHTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateR__Group__0__Impl"


    // $ANTLR start "rule__RotateR__Group__1"
    // InternalXDrone.g:2776:1: rule__RotateR__Group__1 : rule__RotateR__Group__1__Impl rule__RotateR__Group__2 ;
    public final void rule__RotateR__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2780:1: ( rule__RotateR__Group__1__Impl rule__RotateR__Group__2 )
            // InternalXDrone.g:2781:2: rule__RotateR__Group__1__Impl rule__RotateR__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__RotateR__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateR__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateR__Group__1"


    // $ANTLR start "rule__RotateR__Group__1__Impl"
    // InternalXDrone.g:2788:1: rule__RotateR__Group__1__Impl : ( '(' ) ;
    public final void rule__RotateR__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2792:1: ( ( '(' ) )
            // InternalXDrone.g:2793:1: ( '(' )
            {
            // InternalXDrone.g:2793:1: ( '(' )
            // InternalXDrone.g:2794:2: '('
            {
             before(grammarAccess.getRotateRAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRotateRAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateR__Group__1__Impl"


    // $ANTLR start "rule__RotateR__Group__2"
    // InternalXDrone.g:2803:1: rule__RotateR__Group__2 : rule__RotateR__Group__2__Impl rule__RotateR__Group__3 ;
    public final void rule__RotateR__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2807:1: ( rule__RotateR__Group__2__Impl rule__RotateR__Group__3 )
            // InternalXDrone.g:2808:2: rule__RotateR__Group__2__Impl rule__RotateR__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__RotateR__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateR__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateR__Group__2"


    // $ANTLR start "rule__RotateR__Group__2__Impl"
    // InternalXDrone.g:2815:1: rule__RotateR__Group__2__Impl : ( ( rule__RotateR__AngleAssignment_2 ) ) ;
    public final void rule__RotateR__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2819:1: ( ( ( rule__RotateR__AngleAssignment_2 ) ) )
            // InternalXDrone.g:2820:1: ( ( rule__RotateR__AngleAssignment_2 ) )
            {
            // InternalXDrone.g:2820:1: ( ( rule__RotateR__AngleAssignment_2 ) )
            // InternalXDrone.g:2821:2: ( rule__RotateR__AngleAssignment_2 )
            {
             before(grammarAccess.getRotateRAccess().getAngleAssignment_2()); 
            // InternalXDrone.g:2822:2: ( rule__RotateR__AngleAssignment_2 )
            // InternalXDrone.g:2822:3: rule__RotateR__AngleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RotateR__AngleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRotateRAccess().getAngleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateR__Group__2__Impl"


    // $ANTLR start "rule__RotateR__Group__3"
    // InternalXDrone.g:2830:1: rule__RotateR__Group__3 : rule__RotateR__Group__3__Impl ;
    public final void rule__RotateR__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2834:1: ( rule__RotateR__Group__3__Impl )
            // InternalXDrone.g:2835:2: rule__RotateR__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RotateR__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateR__Group__3"


    // $ANTLR start "rule__RotateR__Group__3__Impl"
    // InternalXDrone.g:2841:1: rule__RotateR__Group__3__Impl : ( ')' ) ;
    public final void rule__RotateR__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2845:1: ( ( ')' ) )
            // InternalXDrone.g:2846:1: ( ')' )
            {
            // InternalXDrone.g:2846:1: ( ')' )
            // InternalXDrone.g:2847:2: ')'
            {
             before(grammarAccess.getRotateRAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRotateRAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateR__Group__3__Impl"


    // $ANTLR start "rule__Wait__Group__0"
    // InternalXDrone.g:2857:1: rule__Wait__Group__0 : rule__Wait__Group__0__Impl rule__Wait__Group__1 ;
    public final void rule__Wait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2861:1: ( rule__Wait__Group__0__Impl rule__Wait__Group__1 )
            // InternalXDrone.g:2862:2: rule__Wait__Group__0__Impl rule__Wait__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Wait__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wait__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__0"


    // $ANTLR start "rule__Wait__Group__0__Impl"
    // InternalXDrone.g:2869:1: rule__Wait__Group__0__Impl : ( 'WAIT' ) ;
    public final void rule__Wait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2873:1: ( ( 'WAIT' ) )
            // InternalXDrone.g:2874:1: ( 'WAIT' )
            {
            // InternalXDrone.g:2874:1: ( 'WAIT' )
            // InternalXDrone.g:2875:2: 'WAIT'
            {
             before(grammarAccess.getWaitAccess().getWAITKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getWaitAccess().getWAITKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__0__Impl"


    // $ANTLR start "rule__Wait__Group__1"
    // InternalXDrone.g:2884:1: rule__Wait__Group__1 : rule__Wait__Group__1__Impl rule__Wait__Group__2 ;
    public final void rule__Wait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2888:1: ( rule__Wait__Group__1__Impl rule__Wait__Group__2 )
            // InternalXDrone.g:2889:2: rule__Wait__Group__1__Impl rule__Wait__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Wait__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wait__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__1"


    // $ANTLR start "rule__Wait__Group__1__Impl"
    // InternalXDrone.g:2896:1: rule__Wait__Group__1__Impl : ( '(' ) ;
    public final void rule__Wait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2900:1: ( ( '(' ) )
            // InternalXDrone.g:2901:1: ( '(' )
            {
            // InternalXDrone.g:2901:1: ( '(' )
            // InternalXDrone.g:2902:2: '('
            {
             before(grammarAccess.getWaitAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getWaitAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__1__Impl"


    // $ANTLR start "rule__Wait__Group__2"
    // InternalXDrone.g:2911:1: rule__Wait__Group__2 : rule__Wait__Group__2__Impl rule__Wait__Group__3 ;
    public final void rule__Wait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2915:1: ( rule__Wait__Group__2__Impl rule__Wait__Group__3 )
            // InternalXDrone.g:2916:2: rule__Wait__Group__2__Impl rule__Wait__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Wait__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wait__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__2"


    // $ANTLR start "rule__Wait__Group__2__Impl"
    // InternalXDrone.g:2923:1: rule__Wait__Group__2__Impl : ( ( rule__Wait__SecondsAssignment_2 ) ) ;
    public final void rule__Wait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2927:1: ( ( ( rule__Wait__SecondsAssignment_2 ) ) )
            // InternalXDrone.g:2928:1: ( ( rule__Wait__SecondsAssignment_2 ) )
            {
            // InternalXDrone.g:2928:1: ( ( rule__Wait__SecondsAssignment_2 ) )
            // InternalXDrone.g:2929:2: ( rule__Wait__SecondsAssignment_2 )
            {
             before(grammarAccess.getWaitAccess().getSecondsAssignment_2()); 
            // InternalXDrone.g:2930:2: ( rule__Wait__SecondsAssignment_2 )
            // InternalXDrone.g:2930:3: rule__Wait__SecondsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Wait__SecondsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWaitAccess().getSecondsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__2__Impl"


    // $ANTLR start "rule__Wait__Group__3"
    // InternalXDrone.g:2938:1: rule__Wait__Group__3 : rule__Wait__Group__3__Impl ;
    public final void rule__Wait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2942:1: ( rule__Wait__Group__3__Impl )
            // InternalXDrone.g:2943:2: rule__Wait__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Wait__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__3"


    // $ANTLR start "rule__Wait__Group__3__Impl"
    // InternalXDrone.g:2949:1: rule__Wait__Group__3__Impl : ( ')' ) ;
    public final void rule__Wait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2953:1: ( ( ')' ) )
            // InternalXDrone.g:2954:1: ( ')' )
            {
            // InternalXDrone.g:2954:1: ( ')' )
            // InternalXDrone.g:2955:2: ')'
            {
             before(grammarAccess.getWaitAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getWaitAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__Group__3__Impl"


    // $ANTLR start "rule__Drone__Group__0"
    // InternalXDrone.g:2965:1: rule__Drone__Group__0 : rule__Drone__Group__0__Impl rule__Drone__Group__1 ;
    public final void rule__Drone__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2969:1: ( rule__Drone__Group__0__Impl rule__Drone__Group__1 )
            // InternalXDrone.g:2970:2: rule__Drone__Group__0__Impl rule__Drone__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Drone__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__0"


    // $ANTLR start "rule__Drone__Group__0__Impl"
    // InternalXDrone.g:2977:1: rule__Drone__Group__0__Impl : ( 'DRONE' ) ;
    public final void rule__Drone__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2981:1: ( ( 'DRONE' ) )
            // InternalXDrone.g:2982:1: ( 'DRONE' )
            {
            // InternalXDrone.g:2982:1: ( 'DRONE' )
            // InternalXDrone.g:2983:2: 'DRONE'
            {
             before(grammarAccess.getDroneAccess().getDRONEKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getDRONEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__0__Impl"


    // $ANTLR start "rule__Drone__Group__1"
    // InternalXDrone.g:2992:1: rule__Drone__Group__1 : rule__Drone__Group__1__Impl rule__Drone__Group__2 ;
    public final void rule__Drone__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:2996:1: ( rule__Drone__Group__1__Impl rule__Drone__Group__2 )
            // InternalXDrone.g:2997:2: rule__Drone__Group__1__Impl rule__Drone__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Drone__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__1"


    // $ANTLR start "rule__Drone__Group__1__Impl"
    // InternalXDrone.g:3004:1: rule__Drone__Group__1__Impl : ( '=' ) ;
    public final void rule__Drone__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3008:1: ( ( '=' ) )
            // InternalXDrone.g:3009:1: ( '=' )
            {
            // InternalXDrone.g:3009:1: ( '=' )
            // InternalXDrone.g:3010:2: '='
            {
             before(grammarAccess.getDroneAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__1__Impl"


    // $ANTLR start "rule__Drone__Group__2"
    // InternalXDrone.g:3019:1: rule__Drone__Group__2 : rule__Drone__Group__2__Impl rule__Drone__Group__3 ;
    public final void rule__Drone__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3023:1: ( rule__Drone__Group__2__Impl rule__Drone__Group__3 )
            // InternalXDrone.g:3024:2: rule__Drone__Group__2__Impl rule__Drone__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Drone__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__2"


    // $ANTLR start "rule__Drone__Group__2__Impl"
    // InternalXDrone.g:3031:1: rule__Drone__Group__2__Impl : ( '{' ) ;
    public final void rule__Drone__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3035:1: ( ( '{' ) )
            // InternalXDrone.g:3036:1: ( '{' )
            {
            // InternalXDrone.g:3036:1: ( '{' )
            // InternalXDrone.g:3037:2: '{'
            {
             before(grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__2__Impl"


    // $ANTLR start "rule__Drone__Group__3"
    // InternalXDrone.g:3046:1: rule__Drone__Group__3 : rule__Drone__Group__3__Impl rule__Drone__Group__4 ;
    public final void rule__Drone__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3050:1: ( rule__Drone__Group__3__Impl rule__Drone__Group__4 )
            // InternalXDrone.g:3051:2: rule__Drone__Group__3__Impl rule__Drone__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Drone__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__3"


    // $ANTLR start "rule__Drone__Group__3__Impl"
    // InternalXDrone.g:3058:1: rule__Drone__Group__3__Impl : ( ( rule__Drone__Alternatives_3 )* ) ;
    public final void rule__Drone__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3062:1: ( ( ( rule__Drone__Alternatives_3 )* ) )
            // InternalXDrone.g:3063:1: ( ( rule__Drone__Alternatives_3 )* )
            {
            // InternalXDrone.g:3063:1: ( ( rule__Drone__Alternatives_3 )* )
            // InternalXDrone.g:3064:2: ( rule__Drone__Alternatives_3 )*
            {
             before(grammarAccess.getDroneAccess().getAlternatives_3()); 
            // InternalXDrone.g:3065:2: ( rule__Drone__Alternatives_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==33||LA11_0==36) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXDrone.g:3065:3: rule__Drone__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Drone__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDroneAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__3__Impl"


    // $ANTLR start "rule__Drone__Group__4"
    // InternalXDrone.g:3073:1: rule__Drone__Group__4 : rule__Drone__Group__4__Impl ;
    public final void rule__Drone__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3077:1: ( rule__Drone__Group__4__Impl )
            // InternalXDrone.g:3078:2: rule__Drone__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Drone__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__4"


    // $ANTLR start "rule__Drone__Group__4__Impl"
    // InternalXDrone.g:3084:1: rule__Drone__Group__4__Impl : ( '}' ) ;
    public final void rule__Drone__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3088:1: ( ( '}' ) )
            // InternalXDrone.g:3089:1: ( '}' )
            {
            // InternalXDrone.g:3089:1: ( '}' )
            // InternalXDrone.g:3090:2: '}'
            {
             before(grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group__4__Impl"


    // $ANTLR start "rule__Drone__Group_3_1__0"
    // InternalXDrone.g:3100:1: rule__Drone__Group_3_1__0 : rule__Drone__Group_3_1__0__Impl rule__Drone__Group_3_1__1 ;
    public final void rule__Drone__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3104:1: ( rule__Drone__Group_3_1__0__Impl rule__Drone__Group_3_1__1 )
            // InternalXDrone.g:3105:2: rule__Drone__Group_3_1__0__Impl rule__Drone__Group_3_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Drone__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group_3_1__0"


    // $ANTLR start "rule__Drone__Group_3_1__0__Impl"
    // InternalXDrone.g:3112:1: rule__Drone__Group_3_1__0__Impl : ( 'rotation' ) ;
    public final void rule__Drone__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3116:1: ( ( 'rotation' ) )
            // InternalXDrone.g:3117:1: ( 'rotation' )
            {
            // InternalXDrone.g:3117:1: ( 'rotation' )
            // InternalXDrone.g:3118:2: 'rotation'
            {
             before(grammarAccess.getDroneAccess().getRotationKeyword_3_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getRotationKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group_3_1__0__Impl"


    // $ANTLR start "rule__Drone__Group_3_1__1"
    // InternalXDrone.g:3127:1: rule__Drone__Group_3_1__1 : rule__Drone__Group_3_1__1__Impl rule__Drone__Group_3_1__2 ;
    public final void rule__Drone__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3131:1: ( rule__Drone__Group_3_1__1__Impl rule__Drone__Group_3_1__2 )
            // InternalXDrone.g:3132:2: rule__Drone__Group_3_1__1__Impl rule__Drone__Group_3_1__2
            {
            pushFollow(FOLLOW_19);
            rule__Drone__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drone__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group_3_1__1"


    // $ANTLR start "rule__Drone__Group_3_1__1__Impl"
    // InternalXDrone.g:3139:1: rule__Drone__Group_3_1__1__Impl : ( '=' ) ;
    public final void rule__Drone__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3143:1: ( ( '=' ) )
            // InternalXDrone.g:3144:1: ( '=' )
            {
            // InternalXDrone.g:3144:1: ( '=' )
            // InternalXDrone.g:3145:2: '='
            {
             before(grammarAccess.getDroneAccess().getEqualsSignKeyword_3_1_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDroneAccess().getEqualsSignKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group_3_1__1__Impl"


    // $ANTLR start "rule__Drone__Group_3_1__2"
    // InternalXDrone.g:3154:1: rule__Drone__Group_3_1__2 : rule__Drone__Group_3_1__2__Impl ;
    public final void rule__Drone__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3158:1: ( rule__Drone__Group_3_1__2__Impl )
            // InternalXDrone.g:3159:2: rule__Drone__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Drone__Group_3_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group_3_1__2"


    // $ANTLR start "rule__Drone__Group_3_1__2__Impl"
    // InternalXDrone.g:3165:1: rule__Drone__Group_3_1__2__Impl : ( ( rule__Drone__RotationAssignment_3_1_2 ) ) ;
    public final void rule__Drone__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3169:1: ( ( ( rule__Drone__RotationAssignment_3_1_2 ) ) )
            // InternalXDrone.g:3170:1: ( ( rule__Drone__RotationAssignment_3_1_2 ) )
            {
            // InternalXDrone.g:3170:1: ( ( rule__Drone__RotationAssignment_3_1_2 ) )
            // InternalXDrone.g:3171:2: ( rule__Drone__RotationAssignment_3_1_2 )
            {
             before(grammarAccess.getDroneAccess().getRotationAssignment_3_1_2()); 
            // InternalXDrone.g:3172:2: ( rule__Drone__RotationAssignment_3_1_2 )
            // InternalXDrone.g:3172:3: rule__Drone__RotationAssignment_3_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Drone__RotationAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDroneAccess().getRotationAssignment_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__Group_3_1__2__Impl"


    // $ANTLR start "rule__Object__Group__0"
    // InternalXDrone.g:3181:1: rule__Object__Group__0 : rule__Object__Group__0__Impl rule__Object__Group__1 ;
    public final void rule__Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3185:1: ( rule__Object__Group__0__Impl rule__Object__Group__1 )
            // InternalXDrone.g:3186:2: rule__Object__Group__0__Impl rule__Object__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Object__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0"


    // $ANTLR start "rule__Object__Group__0__Impl"
    // InternalXDrone.g:3193:1: rule__Object__Group__0__Impl : ( ( rule__Object__Object_nameAssignment_0 ) ) ;
    public final void rule__Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3197:1: ( ( ( rule__Object__Object_nameAssignment_0 ) ) )
            // InternalXDrone.g:3198:1: ( ( rule__Object__Object_nameAssignment_0 ) )
            {
            // InternalXDrone.g:3198:1: ( ( rule__Object__Object_nameAssignment_0 ) )
            // InternalXDrone.g:3199:2: ( rule__Object__Object_nameAssignment_0 )
            {
             before(grammarAccess.getObjectAccess().getObject_nameAssignment_0()); 
            // InternalXDrone.g:3200:2: ( rule__Object__Object_nameAssignment_0 )
            // InternalXDrone.g:3200:3: rule__Object__Object_nameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Object__Object_nameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObjectAccess().getObject_nameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__0__Impl"


    // $ANTLR start "rule__Object__Group__1"
    // InternalXDrone.g:3208:1: rule__Object__Group__1 : rule__Object__Group__1__Impl rule__Object__Group__2 ;
    public final void rule__Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3212:1: ( rule__Object__Group__1__Impl rule__Object__Group__2 )
            // InternalXDrone.g:3213:2: rule__Object__Group__1__Impl rule__Object__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Object__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1"


    // $ANTLR start "rule__Object__Group__1__Impl"
    // InternalXDrone.g:3220:1: rule__Object__Group__1__Impl : ( '=' ) ;
    public final void rule__Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3224:1: ( ( '=' ) )
            // InternalXDrone.g:3225:1: ( '=' )
            {
            // InternalXDrone.g:3225:1: ( '=' )
            // InternalXDrone.g:3226:2: '='
            {
             before(grammarAccess.getObjectAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__1__Impl"


    // $ANTLR start "rule__Object__Group__2"
    // InternalXDrone.g:3235:1: rule__Object__Group__2 : rule__Object__Group__2__Impl rule__Object__Group__3 ;
    public final void rule__Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3239:1: ( rule__Object__Group__2__Impl rule__Object__Group__3 )
            // InternalXDrone.g:3240:2: rule__Object__Group__2__Impl rule__Object__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Object__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2"


    // $ANTLR start "rule__Object__Group__2__Impl"
    // InternalXDrone.g:3247:1: rule__Object__Group__2__Impl : ( '{' ) ;
    public final void rule__Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3251:1: ( ( '{' ) )
            // InternalXDrone.g:3252:1: ( '{' )
            {
            // InternalXDrone.g:3252:1: ( '{' )
            // InternalXDrone.g:3253:2: '{'
            {
             before(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__2__Impl"


    // $ANTLR start "rule__Object__Group__3"
    // InternalXDrone.g:3262:1: rule__Object__Group__3 : rule__Object__Group__3__Impl rule__Object__Group__4 ;
    public final void rule__Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3266:1: ( rule__Object__Group__3__Impl rule__Object__Group__4 )
            // InternalXDrone.g:3267:2: rule__Object__Group__3__Impl rule__Object__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Object__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Object__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3"


    // $ANTLR start "rule__Object__Group__3__Impl"
    // InternalXDrone.g:3274:1: rule__Object__Group__3__Impl : ( ( rule__Object__Alternatives_3 )* ) ;
    public final void rule__Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3278:1: ( ( ( rule__Object__Alternatives_3 )* ) )
            // InternalXDrone.g:3279:1: ( ( rule__Object__Alternatives_3 )* )
            {
            // InternalXDrone.g:3279:1: ( ( rule__Object__Alternatives_3 )* )
            // InternalXDrone.g:3280:2: ( rule__Object__Alternatives_3 )*
            {
             before(grammarAccess.getObjectAccess().getAlternatives_3()); 
            // InternalXDrone.g:3281:2: ( rule__Object__Alternatives_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=34 && LA12_0<=35)||LA12_0==38) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXDrone.g:3281:3: rule__Object__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Object__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getObjectAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__3__Impl"


    // $ANTLR start "rule__Object__Group__4"
    // InternalXDrone.g:3289:1: rule__Object__Group__4 : rule__Object__Group__4__Impl ;
    public final void rule__Object__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3293:1: ( rule__Object__Group__4__Impl )
            // InternalXDrone.g:3294:2: rule__Object__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Object__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__4"


    // $ANTLR start "rule__Object__Group__4__Impl"
    // InternalXDrone.g:3300:1: rule__Object__Group__4__Impl : ( '}' ) ;
    public final void rule__Object__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3304:1: ( ( '}' ) )
            // InternalXDrone.g:3305:1: ( '}' )
            {
            // InternalXDrone.g:3305:1: ( '}' )
            // InternalXDrone.g:3306:2: '}'
            {
             before(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Group__4__Impl"


    // $ANTLR start "rule__Origin__Group__0"
    // InternalXDrone.g:3316:1: rule__Origin__Group__0 : rule__Origin__Group__0__Impl rule__Origin__Group__1 ;
    public final void rule__Origin__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3320:1: ( rule__Origin__Group__0__Impl rule__Origin__Group__1 )
            // InternalXDrone.g:3321:2: rule__Origin__Group__0__Impl rule__Origin__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Origin__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__0"


    // $ANTLR start "rule__Origin__Group__0__Impl"
    // InternalXDrone.g:3328:1: rule__Origin__Group__0__Impl : ( 'origin' ) ;
    public final void rule__Origin__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3332:1: ( ( 'origin' ) )
            // InternalXDrone.g:3333:1: ( 'origin' )
            {
            // InternalXDrone.g:3333:1: ( 'origin' )
            // InternalXDrone.g:3334:2: 'origin'
            {
             before(grammarAccess.getOriginAccess().getOriginKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getOriginKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__0__Impl"


    // $ANTLR start "rule__Origin__Group__1"
    // InternalXDrone.g:3343:1: rule__Origin__Group__1 : rule__Origin__Group__1__Impl rule__Origin__Group__2 ;
    public final void rule__Origin__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3347:1: ( rule__Origin__Group__1__Impl rule__Origin__Group__2 )
            // InternalXDrone.g:3348:2: rule__Origin__Group__1__Impl rule__Origin__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Origin__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Origin__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__1"


    // $ANTLR start "rule__Origin__Group__1__Impl"
    // InternalXDrone.g:3355:1: rule__Origin__Group__1__Impl : ( '=' ) ;
    public final void rule__Origin__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3359:1: ( ( '=' ) )
            // InternalXDrone.g:3360:1: ( '=' )
            {
            // InternalXDrone.g:3360:1: ( '=' )
            // InternalXDrone.g:3361:2: '='
            {
             before(grammarAccess.getOriginAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getOriginAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__1__Impl"


    // $ANTLR start "rule__Origin__Group__2"
    // InternalXDrone.g:3370:1: rule__Origin__Group__2 : rule__Origin__Group__2__Impl ;
    public final void rule__Origin__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3374:1: ( rule__Origin__Group__2__Impl )
            // InternalXDrone.g:3375:2: rule__Origin__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Origin__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__2"


    // $ANTLR start "rule__Origin__Group__2__Impl"
    // InternalXDrone.g:3381:1: rule__Origin__Group__2__Impl : ( ( rule__Origin__VectorAssignment_2 ) ) ;
    public final void rule__Origin__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3385:1: ( ( ( rule__Origin__VectorAssignment_2 ) ) )
            // InternalXDrone.g:3386:1: ( ( rule__Origin__VectorAssignment_2 ) )
            {
            // InternalXDrone.g:3386:1: ( ( rule__Origin__VectorAssignment_2 ) )
            // InternalXDrone.g:3387:2: ( rule__Origin__VectorAssignment_2 )
            {
             before(grammarAccess.getOriginAccess().getVectorAssignment_2()); 
            // InternalXDrone.g:3388:2: ( rule__Origin__VectorAssignment_2 )
            // InternalXDrone.g:3388:3: rule__Origin__VectorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Origin__VectorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOriginAccess().getVectorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__Group__2__Impl"


    // $ANTLR start "rule__Size__Group__0"
    // InternalXDrone.g:3397:1: rule__Size__Group__0 : rule__Size__Group__0__Impl rule__Size__Group__1 ;
    public final void rule__Size__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3401:1: ( rule__Size__Group__0__Impl rule__Size__Group__1 )
            // InternalXDrone.g:3402:2: rule__Size__Group__0__Impl rule__Size__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Size__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__0"


    // $ANTLR start "rule__Size__Group__0__Impl"
    // InternalXDrone.g:3409:1: rule__Size__Group__0__Impl : ( 'size' ) ;
    public final void rule__Size__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3413:1: ( ( 'size' ) )
            // InternalXDrone.g:3414:1: ( 'size' )
            {
            // InternalXDrone.g:3414:1: ( 'size' )
            // InternalXDrone.g:3415:2: 'size'
            {
             before(grammarAccess.getSizeAccess().getSizeKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getSizeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__0__Impl"


    // $ANTLR start "rule__Size__Group__1"
    // InternalXDrone.g:3424:1: rule__Size__Group__1 : rule__Size__Group__1__Impl rule__Size__Group__2 ;
    public final void rule__Size__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3428:1: ( rule__Size__Group__1__Impl rule__Size__Group__2 )
            // InternalXDrone.g:3429:2: rule__Size__Group__1__Impl rule__Size__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Size__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Size__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__1"


    // $ANTLR start "rule__Size__Group__1__Impl"
    // InternalXDrone.g:3436:1: rule__Size__Group__1__Impl : ( '=' ) ;
    public final void rule__Size__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3440:1: ( ( '=' ) )
            // InternalXDrone.g:3441:1: ( '=' )
            {
            // InternalXDrone.g:3441:1: ( '=' )
            // InternalXDrone.g:3442:2: '='
            {
             before(grammarAccess.getSizeAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSizeAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__1__Impl"


    // $ANTLR start "rule__Size__Group__2"
    // InternalXDrone.g:3451:1: rule__Size__Group__2 : rule__Size__Group__2__Impl ;
    public final void rule__Size__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3455:1: ( rule__Size__Group__2__Impl )
            // InternalXDrone.g:3456:2: rule__Size__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Size__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__2"


    // $ANTLR start "rule__Size__Group__2__Impl"
    // InternalXDrone.g:3462:1: rule__Size__Group__2__Impl : ( ( rule__Size__VectorAssignment_2 ) ) ;
    public final void rule__Size__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3466:1: ( ( ( rule__Size__VectorAssignment_2 ) ) )
            // InternalXDrone.g:3467:1: ( ( rule__Size__VectorAssignment_2 ) )
            {
            // InternalXDrone.g:3467:1: ( ( rule__Size__VectorAssignment_2 ) )
            // InternalXDrone.g:3468:2: ( rule__Size__VectorAssignment_2 )
            {
             before(grammarAccess.getSizeAccess().getVectorAssignment_2()); 
            // InternalXDrone.g:3469:2: ( rule__Size__VectorAssignment_2 )
            // InternalXDrone.g:3469:3: rule__Size__VectorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Size__VectorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSizeAccess().getVectorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__Group__2__Impl"


    // $ANTLR start "rule__Position__Group__0"
    // InternalXDrone.g:3478:1: rule__Position__Group__0 : rule__Position__Group__0__Impl rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3482:1: ( rule__Position__Group__0__Impl rule__Position__Group__1 )
            // InternalXDrone.g:3483:2: rule__Position__Group__0__Impl rule__Position__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Position__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__0"


    // $ANTLR start "rule__Position__Group__0__Impl"
    // InternalXDrone.g:3490:1: rule__Position__Group__0__Impl : ( 'position' ) ;
    public final void rule__Position__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3494:1: ( ( 'position' ) )
            // InternalXDrone.g:3495:1: ( 'position' )
            {
            // InternalXDrone.g:3495:1: ( 'position' )
            // InternalXDrone.g:3496:2: 'position'
            {
             before(grammarAccess.getPositionAccess().getPositionKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getPositionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__0__Impl"


    // $ANTLR start "rule__Position__Group__1"
    // InternalXDrone.g:3505:1: rule__Position__Group__1 : rule__Position__Group__1__Impl rule__Position__Group__2 ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3509:1: ( rule__Position__Group__1__Impl rule__Position__Group__2 )
            // InternalXDrone.g:3510:2: rule__Position__Group__1__Impl rule__Position__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Position__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__1"


    // $ANTLR start "rule__Position__Group__1__Impl"
    // InternalXDrone.g:3517:1: rule__Position__Group__1__Impl : ( '=' ) ;
    public final void rule__Position__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3521:1: ( ( '=' ) )
            // InternalXDrone.g:3522:1: ( '=' )
            {
            // InternalXDrone.g:3522:1: ( '=' )
            // InternalXDrone.g:3523:2: '='
            {
             before(grammarAccess.getPositionAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__1__Impl"


    // $ANTLR start "rule__Position__Group__2"
    // InternalXDrone.g:3532:1: rule__Position__Group__2 : rule__Position__Group__2__Impl ;
    public final void rule__Position__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3536:1: ( rule__Position__Group__2__Impl )
            // InternalXDrone.g:3537:2: rule__Position__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__2"


    // $ANTLR start "rule__Position__Group__2__Impl"
    // InternalXDrone.g:3543:1: rule__Position__Group__2__Impl : ( ( rule__Position__VectorAssignment_2 ) ) ;
    public final void rule__Position__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3547:1: ( ( ( rule__Position__VectorAssignment_2 ) ) )
            // InternalXDrone.g:3548:1: ( ( rule__Position__VectorAssignment_2 ) )
            {
            // InternalXDrone.g:3548:1: ( ( rule__Position__VectorAssignment_2 ) )
            // InternalXDrone.g:3549:2: ( rule__Position__VectorAssignment_2 )
            {
             before(grammarAccess.getPositionAccess().getVectorAssignment_2()); 
            // InternalXDrone.g:3550:2: ( rule__Position__VectorAssignment_2 )
            // InternalXDrone.g:3550:3: rule__Position__VectorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Position__VectorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getVectorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__2__Impl"


    // $ANTLR start "rule__Vector__Group__0"
    // InternalXDrone.g:3559:1: rule__Vector__Group__0 : rule__Vector__Group__0__Impl rule__Vector__Group__1 ;
    public final void rule__Vector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3563:1: ( rule__Vector__Group__0__Impl rule__Vector__Group__1 )
            // InternalXDrone.g:3564:2: rule__Vector__Group__0__Impl rule__Vector__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Vector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__0"


    // $ANTLR start "rule__Vector__Group__0__Impl"
    // InternalXDrone.g:3571:1: rule__Vector__Group__0__Impl : ( '(' ) ;
    public final void rule__Vector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3575:1: ( ( '(' ) )
            // InternalXDrone.g:3576:1: ( '(' )
            {
            // InternalXDrone.g:3576:1: ( '(' )
            // InternalXDrone.g:3577:2: '('
            {
             before(grammarAccess.getVectorAccess().getLeftParenthesisKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVectorAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__0__Impl"


    // $ANTLR start "rule__Vector__Group__1"
    // InternalXDrone.g:3586:1: rule__Vector__Group__1 : rule__Vector__Group__1__Impl rule__Vector__Group__2 ;
    public final void rule__Vector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3590:1: ( rule__Vector__Group__1__Impl rule__Vector__Group__2 )
            // InternalXDrone.g:3591:2: rule__Vector__Group__1__Impl rule__Vector__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Vector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__1"


    // $ANTLR start "rule__Vector__Group__1__Impl"
    // InternalXDrone.g:3598:1: rule__Vector__Group__1__Impl : ( ( rule__Vector__XAssignment_1 ) ) ;
    public final void rule__Vector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3602:1: ( ( ( rule__Vector__XAssignment_1 ) ) )
            // InternalXDrone.g:3603:1: ( ( rule__Vector__XAssignment_1 ) )
            {
            // InternalXDrone.g:3603:1: ( ( rule__Vector__XAssignment_1 ) )
            // InternalXDrone.g:3604:2: ( rule__Vector__XAssignment_1 )
            {
             before(grammarAccess.getVectorAccess().getXAssignment_1()); 
            // InternalXDrone.g:3605:2: ( rule__Vector__XAssignment_1 )
            // InternalXDrone.g:3605:3: rule__Vector__XAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Vector__XAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVectorAccess().getXAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__1__Impl"


    // $ANTLR start "rule__Vector__Group__2"
    // InternalXDrone.g:3613:1: rule__Vector__Group__2 : rule__Vector__Group__2__Impl rule__Vector__Group__3 ;
    public final void rule__Vector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3617:1: ( rule__Vector__Group__2__Impl rule__Vector__Group__3 )
            // InternalXDrone.g:3618:2: rule__Vector__Group__2__Impl rule__Vector__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Vector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vector__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__2"


    // $ANTLR start "rule__Vector__Group__2__Impl"
    // InternalXDrone.g:3625:1: rule__Vector__Group__2__Impl : ( ',' ) ;
    public final void rule__Vector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3629:1: ( ( ',' ) )
            // InternalXDrone.g:3630:1: ( ',' )
            {
            // InternalXDrone.g:3630:1: ( ',' )
            // InternalXDrone.g:3631:2: ','
            {
             before(grammarAccess.getVectorAccess().getCommaKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVectorAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__2__Impl"


    // $ANTLR start "rule__Vector__Group__3"
    // InternalXDrone.g:3640:1: rule__Vector__Group__3 : rule__Vector__Group__3__Impl rule__Vector__Group__4 ;
    public final void rule__Vector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3644:1: ( rule__Vector__Group__3__Impl rule__Vector__Group__4 )
            // InternalXDrone.g:3645:2: rule__Vector__Group__3__Impl rule__Vector__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__Vector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vector__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__3"


    // $ANTLR start "rule__Vector__Group__3__Impl"
    // InternalXDrone.g:3652:1: rule__Vector__Group__3__Impl : ( ( rule__Vector__YAssignment_3 ) ) ;
    public final void rule__Vector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3656:1: ( ( ( rule__Vector__YAssignment_3 ) ) )
            // InternalXDrone.g:3657:1: ( ( rule__Vector__YAssignment_3 ) )
            {
            // InternalXDrone.g:3657:1: ( ( rule__Vector__YAssignment_3 ) )
            // InternalXDrone.g:3658:2: ( rule__Vector__YAssignment_3 )
            {
             before(grammarAccess.getVectorAccess().getYAssignment_3()); 
            // InternalXDrone.g:3659:2: ( rule__Vector__YAssignment_3 )
            // InternalXDrone.g:3659:3: rule__Vector__YAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Vector__YAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVectorAccess().getYAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__3__Impl"


    // $ANTLR start "rule__Vector__Group__4"
    // InternalXDrone.g:3667:1: rule__Vector__Group__4 : rule__Vector__Group__4__Impl rule__Vector__Group__5 ;
    public final void rule__Vector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3671:1: ( rule__Vector__Group__4__Impl rule__Vector__Group__5 )
            // InternalXDrone.g:3672:2: rule__Vector__Group__4__Impl rule__Vector__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Vector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vector__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__4"


    // $ANTLR start "rule__Vector__Group__4__Impl"
    // InternalXDrone.g:3679:1: rule__Vector__Group__4__Impl : ( ',' ) ;
    public final void rule__Vector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3683:1: ( ( ',' ) )
            // InternalXDrone.g:3684:1: ( ',' )
            {
            // InternalXDrone.g:3684:1: ( ',' )
            // InternalXDrone.g:3685:2: ','
            {
             before(grammarAccess.getVectorAccess().getCommaKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVectorAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__4__Impl"


    // $ANTLR start "rule__Vector__Group__5"
    // InternalXDrone.g:3694:1: rule__Vector__Group__5 : rule__Vector__Group__5__Impl rule__Vector__Group__6 ;
    public final void rule__Vector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3698:1: ( rule__Vector__Group__5__Impl rule__Vector__Group__6 )
            // InternalXDrone.g:3699:2: rule__Vector__Group__5__Impl rule__Vector__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Vector__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vector__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__5"


    // $ANTLR start "rule__Vector__Group__5__Impl"
    // InternalXDrone.g:3706:1: rule__Vector__Group__5__Impl : ( ( rule__Vector__ZAssignment_5 ) ) ;
    public final void rule__Vector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3710:1: ( ( ( rule__Vector__ZAssignment_5 ) ) )
            // InternalXDrone.g:3711:1: ( ( rule__Vector__ZAssignment_5 ) )
            {
            // InternalXDrone.g:3711:1: ( ( rule__Vector__ZAssignment_5 ) )
            // InternalXDrone.g:3712:2: ( rule__Vector__ZAssignment_5 )
            {
             before(grammarAccess.getVectorAccess().getZAssignment_5()); 
            // InternalXDrone.g:3713:2: ( rule__Vector__ZAssignment_5 )
            // InternalXDrone.g:3713:3: rule__Vector__ZAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Vector__ZAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getVectorAccess().getZAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__5__Impl"


    // $ANTLR start "rule__Vector__Group__6"
    // InternalXDrone.g:3721:1: rule__Vector__Group__6 : rule__Vector__Group__6__Impl ;
    public final void rule__Vector__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3725:1: ( rule__Vector__Group__6__Impl )
            // InternalXDrone.g:3726:2: rule__Vector__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vector__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__6"


    // $ANTLR start "rule__Vector__Group__6__Impl"
    // InternalXDrone.g:3732:1: rule__Vector__Group__6__Impl : ( ')' ) ;
    public final void rule__Vector__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3736:1: ( ( ')' ) )
            // InternalXDrone.g:3737:1: ( ')' )
            {
            // InternalXDrone.g:3737:1: ( ')' )
            // InternalXDrone.g:3738:2: ')'
            {
             before(grammarAccess.getVectorAccess().getRightParenthesisKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVectorAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__Group__6__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // InternalXDrone.g:3748:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3752:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalXDrone.g:3753:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0"


    // $ANTLR start "rule__Color__Group__0__Impl"
    // InternalXDrone.g:3760:1: rule__Color__Group__0__Impl : ( 'color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3764:1: ( ( 'color' ) )
            // InternalXDrone.g:3765:1: ( 'color' )
            {
            // InternalXDrone.g:3765:1: ( 'color' )
            // InternalXDrone.g:3766:2: 'color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // InternalXDrone.g:3775:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3779:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalXDrone.g:3780:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Color__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1"


    // $ANTLR start "rule__Color__Group__1__Impl"
    // InternalXDrone.g:3787:1: rule__Color__Group__1__Impl : ( '=' ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3791:1: ( ( '=' ) )
            // InternalXDrone.g:3792:1: ( '=' )
            {
            // InternalXDrone.g:3792:1: ( '=' )
            // InternalXDrone.g:3793:2: '='
            {
             before(grammarAccess.getColorAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1__Impl"


    // $ANTLR start "rule__Color__Group__2"
    // InternalXDrone.g:3802:1: rule__Color__Group__2 : rule__Color__Group__2__Impl ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3806:1: ( rule__Color__Group__2__Impl )
            // InternalXDrone.g:3807:2: rule__Color__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__2"


    // $ANTLR start "rule__Color__Group__2__Impl"
    // InternalXDrone.g:3813:1: rule__Color__Group__2__Impl : ( ( rule__Color__Color_valueAssignment_2 ) ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3817:1: ( ( ( rule__Color__Color_valueAssignment_2 ) ) )
            // InternalXDrone.g:3818:1: ( ( rule__Color__Color_valueAssignment_2 ) )
            {
            // InternalXDrone.g:3818:1: ( ( rule__Color__Color_valueAssignment_2 ) )
            // InternalXDrone.g:3819:2: ( rule__Color__Color_valueAssignment_2 )
            {
             before(grammarAccess.getColorAccess().getColor_valueAssignment_2()); 
            // InternalXDrone.g:3820:2: ( rule__Color__Color_valueAssignment_2 )
            // InternalXDrone.g:3820:3: rule__Color__Color_valueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Color__Color_valueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getColor_valueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__2__Impl"


    // $ANTLR start "rule__Walls__Group__0"
    // InternalXDrone.g:3829:1: rule__Walls__Group__0 : rule__Walls__Group__0__Impl rule__Walls__Group__1 ;
    public final void rule__Walls__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3833:1: ( rule__Walls__Group__0__Impl rule__Walls__Group__1 )
            // InternalXDrone.g:3834:2: rule__Walls__Group__0__Impl rule__Walls__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Walls__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Walls__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group__0"


    // $ANTLR start "rule__Walls__Group__0__Impl"
    // InternalXDrone.g:3841:1: rule__Walls__Group__0__Impl : ( 'WALLS' ) ;
    public final void rule__Walls__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3845:1: ( ( 'WALLS' ) )
            // InternalXDrone.g:3846:1: ( 'WALLS' )
            {
            // InternalXDrone.g:3846:1: ( 'WALLS' )
            // InternalXDrone.g:3847:2: 'WALLS'
            {
             before(grammarAccess.getWallsAccess().getWALLSKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getWallsAccess().getWALLSKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group__0__Impl"


    // $ANTLR start "rule__Walls__Group__1"
    // InternalXDrone.g:3856:1: rule__Walls__Group__1 : rule__Walls__Group__1__Impl rule__Walls__Group__2 ;
    public final void rule__Walls__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3860:1: ( rule__Walls__Group__1__Impl rule__Walls__Group__2 )
            // InternalXDrone.g:3861:2: rule__Walls__Group__1__Impl rule__Walls__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Walls__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Walls__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group__1"


    // $ANTLR start "rule__Walls__Group__1__Impl"
    // InternalXDrone.g:3868:1: rule__Walls__Group__1__Impl : ( '=' ) ;
    public final void rule__Walls__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3872:1: ( ( '=' ) )
            // InternalXDrone.g:3873:1: ( '=' )
            {
            // InternalXDrone.g:3873:1: ( '=' )
            // InternalXDrone.g:3874:2: '='
            {
             before(grammarAccess.getWallsAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getWallsAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group__1__Impl"


    // $ANTLR start "rule__Walls__Group__2"
    // InternalXDrone.g:3883:1: rule__Walls__Group__2 : rule__Walls__Group__2__Impl rule__Walls__Group__3 ;
    public final void rule__Walls__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3887:1: ( rule__Walls__Group__2__Impl rule__Walls__Group__3 )
            // InternalXDrone.g:3888:2: rule__Walls__Group__2__Impl rule__Walls__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Walls__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Walls__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group__2"


    // $ANTLR start "rule__Walls__Group__2__Impl"
    // InternalXDrone.g:3895:1: rule__Walls__Group__2__Impl : ( '{' ) ;
    public final void rule__Walls__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3899:1: ( ( '{' ) )
            // InternalXDrone.g:3900:1: ( '{' )
            {
            // InternalXDrone.g:3900:1: ( '{' )
            // InternalXDrone.g:3901:2: '{'
            {
             before(grammarAccess.getWallsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getWallsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group__2__Impl"


    // $ANTLR start "rule__Walls__Group__3"
    // InternalXDrone.g:3910:1: rule__Walls__Group__3 : rule__Walls__Group__3__Impl rule__Walls__Group__4 ;
    public final void rule__Walls__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3914:1: ( rule__Walls__Group__3__Impl rule__Walls__Group__4 )
            // InternalXDrone.g:3915:2: rule__Walls__Group__3__Impl rule__Walls__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__Walls__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Walls__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group__3"


    // $ANTLR start "rule__Walls__Group__3__Impl"
    // InternalXDrone.g:3922:1: rule__Walls__Group__3__Impl : ( ( rule__Walls__Alternatives_3 )* ) ;
    public final void rule__Walls__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3926:1: ( ( ( rule__Walls__Alternatives_3 )* ) )
            // InternalXDrone.g:3927:1: ( ( rule__Walls__Alternatives_3 )* )
            {
            // InternalXDrone.g:3927:1: ( ( rule__Walls__Alternatives_3 )* )
            // InternalXDrone.g:3928:2: ( rule__Walls__Alternatives_3 )*
            {
             before(grammarAccess.getWallsAccess().getAlternatives_3()); 
            // InternalXDrone.g:3929:2: ( rule__Walls__Alternatives_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=40 && LA13_0<=44)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXDrone.g:3929:3: rule__Walls__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Walls__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getWallsAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group__3__Impl"


    // $ANTLR start "rule__Walls__Group__4"
    // InternalXDrone.g:3937:1: rule__Walls__Group__4 : rule__Walls__Group__4__Impl ;
    public final void rule__Walls__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3941:1: ( rule__Walls__Group__4__Impl )
            // InternalXDrone.g:3942:2: rule__Walls__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Walls__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group__4"


    // $ANTLR start "rule__Walls__Group__4__Impl"
    // InternalXDrone.g:3948:1: rule__Walls__Group__4__Impl : ( '}' ) ;
    public final void rule__Walls__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3952:1: ( ( '}' ) )
            // InternalXDrone.g:3953:1: ( '}' )
            {
            // InternalXDrone.g:3953:1: ( '}' )
            // InternalXDrone.g:3954:2: '}'
            {
             before(grammarAccess.getWallsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getWallsAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__Group__4__Impl"


    // $ANTLR start "rule__FrontWall__Group__0"
    // InternalXDrone.g:3964:1: rule__FrontWall__Group__0 : rule__FrontWall__Group__0__Impl rule__FrontWall__Group__1 ;
    public final void rule__FrontWall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3968:1: ( rule__FrontWall__Group__0__Impl rule__FrontWall__Group__1 )
            // InternalXDrone.g:3969:2: rule__FrontWall__Group__0__Impl rule__FrontWall__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__FrontWall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FrontWall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrontWall__Group__0"


    // $ANTLR start "rule__FrontWall__Group__0__Impl"
    // InternalXDrone.g:3976:1: rule__FrontWall__Group__0__Impl : ( 'front' ) ;
    public final void rule__FrontWall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3980:1: ( ( 'front' ) )
            // InternalXDrone.g:3981:1: ( 'front' )
            {
            // InternalXDrone.g:3981:1: ( 'front' )
            // InternalXDrone.g:3982:2: 'front'
            {
             before(grammarAccess.getFrontWallAccess().getFrontKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getFrontWallAccess().getFrontKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrontWall__Group__0__Impl"


    // $ANTLR start "rule__FrontWall__Group__1"
    // InternalXDrone.g:3991:1: rule__FrontWall__Group__1 : rule__FrontWall__Group__1__Impl rule__FrontWall__Group__2 ;
    public final void rule__FrontWall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:3995:1: ( rule__FrontWall__Group__1__Impl rule__FrontWall__Group__2 )
            // InternalXDrone.g:3996:2: rule__FrontWall__Group__1__Impl rule__FrontWall__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__FrontWall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FrontWall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrontWall__Group__1"


    // $ANTLR start "rule__FrontWall__Group__1__Impl"
    // InternalXDrone.g:4003:1: rule__FrontWall__Group__1__Impl : ( '=' ) ;
    public final void rule__FrontWall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4007:1: ( ( '=' ) )
            // InternalXDrone.g:4008:1: ( '=' )
            {
            // InternalXDrone.g:4008:1: ( '=' )
            // InternalXDrone.g:4009:2: '='
            {
             before(grammarAccess.getFrontWallAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFrontWallAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrontWall__Group__1__Impl"


    // $ANTLR start "rule__FrontWall__Group__2"
    // InternalXDrone.g:4018:1: rule__FrontWall__Group__2 : rule__FrontWall__Group__2__Impl ;
    public final void rule__FrontWall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4022:1: ( rule__FrontWall__Group__2__Impl )
            // InternalXDrone.g:4023:2: rule__FrontWall__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FrontWall__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrontWall__Group__2"


    // $ANTLR start "rule__FrontWall__Group__2__Impl"
    // InternalXDrone.g:4029:1: rule__FrontWall__Group__2__Impl : ( ( rule__FrontWall__ValueAssignment_2 ) ) ;
    public final void rule__FrontWall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4033:1: ( ( ( rule__FrontWall__ValueAssignment_2 ) ) )
            // InternalXDrone.g:4034:1: ( ( rule__FrontWall__ValueAssignment_2 ) )
            {
            // InternalXDrone.g:4034:1: ( ( rule__FrontWall__ValueAssignment_2 ) )
            // InternalXDrone.g:4035:2: ( rule__FrontWall__ValueAssignment_2 )
            {
             before(grammarAccess.getFrontWallAccess().getValueAssignment_2()); 
            // InternalXDrone.g:4036:2: ( rule__FrontWall__ValueAssignment_2 )
            // InternalXDrone.g:4036:3: rule__FrontWall__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FrontWall__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFrontWallAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrontWall__Group__2__Impl"


    // $ANTLR start "rule__RightWall__Group__0"
    // InternalXDrone.g:4045:1: rule__RightWall__Group__0 : rule__RightWall__Group__0__Impl rule__RightWall__Group__1 ;
    public final void rule__RightWall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4049:1: ( rule__RightWall__Group__0__Impl rule__RightWall__Group__1 )
            // InternalXDrone.g:4050:2: rule__RightWall__Group__0__Impl rule__RightWall__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__RightWall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightWall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightWall__Group__0"


    // $ANTLR start "rule__RightWall__Group__0__Impl"
    // InternalXDrone.g:4057:1: rule__RightWall__Group__0__Impl : ( 'right' ) ;
    public final void rule__RightWall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4061:1: ( ( 'right' ) )
            // InternalXDrone.g:4062:1: ( 'right' )
            {
            // InternalXDrone.g:4062:1: ( 'right' )
            // InternalXDrone.g:4063:2: 'right'
            {
             before(grammarAccess.getRightWallAccess().getRightKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getRightWallAccess().getRightKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightWall__Group__0__Impl"


    // $ANTLR start "rule__RightWall__Group__1"
    // InternalXDrone.g:4072:1: rule__RightWall__Group__1 : rule__RightWall__Group__1__Impl rule__RightWall__Group__2 ;
    public final void rule__RightWall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4076:1: ( rule__RightWall__Group__1__Impl rule__RightWall__Group__2 )
            // InternalXDrone.g:4077:2: rule__RightWall__Group__1__Impl rule__RightWall__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__RightWall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightWall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightWall__Group__1"


    // $ANTLR start "rule__RightWall__Group__1__Impl"
    // InternalXDrone.g:4084:1: rule__RightWall__Group__1__Impl : ( '=' ) ;
    public final void rule__RightWall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4088:1: ( ( '=' ) )
            // InternalXDrone.g:4089:1: ( '=' )
            {
            // InternalXDrone.g:4089:1: ( '=' )
            // InternalXDrone.g:4090:2: '='
            {
             before(grammarAccess.getRightWallAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRightWallAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightWall__Group__1__Impl"


    // $ANTLR start "rule__RightWall__Group__2"
    // InternalXDrone.g:4099:1: rule__RightWall__Group__2 : rule__RightWall__Group__2__Impl ;
    public final void rule__RightWall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4103:1: ( rule__RightWall__Group__2__Impl )
            // InternalXDrone.g:4104:2: rule__RightWall__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RightWall__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightWall__Group__2"


    // $ANTLR start "rule__RightWall__Group__2__Impl"
    // InternalXDrone.g:4110:1: rule__RightWall__Group__2__Impl : ( ( rule__RightWall__ValueAssignment_2 ) ) ;
    public final void rule__RightWall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4114:1: ( ( ( rule__RightWall__ValueAssignment_2 ) ) )
            // InternalXDrone.g:4115:1: ( ( rule__RightWall__ValueAssignment_2 ) )
            {
            // InternalXDrone.g:4115:1: ( ( rule__RightWall__ValueAssignment_2 ) )
            // InternalXDrone.g:4116:2: ( rule__RightWall__ValueAssignment_2 )
            {
             before(grammarAccess.getRightWallAccess().getValueAssignment_2()); 
            // InternalXDrone.g:4117:2: ( rule__RightWall__ValueAssignment_2 )
            // InternalXDrone.g:4117:3: rule__RightWall__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RightWall__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRightWallAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightWall__Group__2__Impl"


    // $ANTLR start "rule__LeftWall__Group__0"
    // InternalXDrone.g:4126:1: rule__LeftWall__Group__0 : rule__LeftWall__Group__0__Impl rule__LeftWall__Group__1 ;
    public final void rule__LeftWall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4130:1: ( rule__LeftWall__Group__0__Impl rule__LeftWall__Group__1 )
            // InternalXDrone.g:4131:2: rule__LeftWall__Group__0__Impl rule__LeftWall__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__LeftWall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftWall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftWall__Group__0"


    // $ANTLR start "rule__LeftWall__Group__0__Impl"
    // InternalXDrone.g:4138:1: rule__LeftWall__Group__0__Impl : ( 'left' ) ;
    public final void rule__LeftWall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4142:1: ( ( 'left' ) )
            // InternalXDrone.g:4143:1: ( 'left' )
            {
            // InternalXDrone.g:4143:1: ( 'left' )
            // InternalXDrone.g:4144:2: 'left'
            {
             before(grammarAccess.getLeftWallAccess().getLeftKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getLeftWallAccess().getLeftKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftWall__Group__0__Impl"


    // $ANTLR start "rule__LeftWall__Group__1"
    // InternalXDrone.g:4153:1: rule__LeftWall__Group__1 : rule__LeftWall__Group__1__Impl rule__LeftWall__Group__2 ;
    public final void rule__LeftWall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4157:1: ( rule__LeftWall__Group__1__Impl rule__LeftWall__Group__2 )
            // InternalXDrone.g:4158:2: rule__LeftWall__Group__1__Impl rule__LeftWall__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__LeftWall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftWall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftWall__Group__1"


    // $ANTLR start "rule__LeftWall__Group__1__Impl"
    // InternalXDrone.g:4165:1: rule__LeftWall__Group__1__Impl : ( '=' ) ;
    public final void rule__LeftWall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4169:1: ( ( '=' ) )
            // InternalXDrone.g:4170:1: ( '=' )
            {
            // InternalXDrone.g:4170:1: ( '=' )
            // InternalXDrone.g:4171:2: '='
            {
             before(grammarAccess.getLeftWallAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLeftWallAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftWall__Group__1__Impl"


    // $ANTLR start "rule__LeftWall__Group__2"
    // InternalXDrone.g:4180:1: rule__LeftWall__Group__2 : rule__LeftWall__Group__2__Impl ;
    public final void rule__LeftWall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4184:1: ( rule__LeftWall__Group__2__Impl )
            // InternalXDrone.g:4185:2: rule__LeftWall__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeftWall__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftWall__Group__2"


    // $ANTLR start "rule__LeftWall__Group__2__Impl"
    // InternalXDrone.g:4191:1: rule__LeftWall__Group__2__Impl : ( ( rule__LeftWall__ValueAssignment_2 ) ) ;
    public final void rule__LeftWall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4195:1: ( ( ( rule__LeftWall__ValueAssignment_2 ) ) )
            // InternalXDrone.g:4196:1: ( ( rule__LeftWall__ValueAssignment_2 ) )
            {
            // InternalXDrone.g:4196:1: ( ( rule__LeftWall__ValueAssignment_2 ) )
            // InternalXDrone.g:4197:2: ( rule__LeftWall__ValueAssignment_2 )
            {
             before(grammarAccess.getLeftWallAccess().getValueAssignment_2()); 
            // InternalXDrone.g:4198:2: ( rule__LeftWall__ValueAssignment_2 )
            // InternalXDrone.g:4198:3: rule__LeftWall__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LeftWall__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLeftWallAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftWall__Group__2__Impl"


    // $ANTLR start "rule__BackWall__Group__0"
    // InternalXDrone.g:4207:1: rule__BackWall__Group__0 : rule__BackWall__Group__0__Impl rule__BackWall__Group__1 ;
    public final void rule__BackWall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4211:1: ( rule__BackWall__Group__0__Impl rule__BackWall__Group__1 )
            // InternalXDrone.g:4212:2: rule__BackWall__Group__0__Impl rule__BackWall__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__BackWall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackWall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackWall__Group__0"


    // $ANTLR start "rule__BackWall__Group__0__Impl"
    // InternalXDrone.g:4219:1: rule__BackWall__Group__0__Impl : ( 'back' ) ;
    public final void rule__BackWall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4223:1: ( ( 'back' ) )
            // InternalXDrone.g:4224:1: ( 'back' )
            {
            // InternalXDrone.g:4224:1: ( 'back' )
            // InternalXDrone.g:4225:2: 'back'
            {
             before(grammarAccess.getBackWallAccess().getBackKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getBackWallAccess().getBackKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackWall__Group__0__Impl"


    // $ANTLR start "rule__BackWall__Group__1"
    // InternalXDrone.g:4234:1: rule__BackWall__Group__1 : rule__BackWall__Group__1__Impl rule__BackWall__Group__2 ;
    public final void rule__BackWall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4238:1: ( rule__BackWall__Group__1__Impl rule__BackWall__Group__2 )
            // InternalXDrone.g:4239:2: rule__BackWall__Group__1__Impl rule__BackWall__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__BackWall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BackWall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackWall__Group__1"


    // $ANTLR start "rule__BackWall__Group__1__Impl"
    // InternalXDrone.g:4246:1: rule__BackWall__Group__1__Impl : ( '=' ) ;
    public final void rule__BackWall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4250:1: ( ( '=' ) )
            // InternalXDrone.g:4251:1: ( '=' )
            {
            // InternalXDrone.g:4251:1: ( '=' )
            // InternalXDrone.g:4252:2: '='
            {
             before(grammarAccess.getBackWallAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBackWallAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackWall__Group__1__Impl"


    // $ANTLR start "rule__BackWall__Group__2"
    // InternalXDrone.g:4261:1: rule__BackWall__Group__2 : rule__BackWall__Group__2__Impl ;
    public final void rule__BackWall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4265:1: ( rule__BackWall__Group__2__Impl )
            // InternalXDrone.g:4266:2: rule__BackWall__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BackWall__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackWall__Group__2"


    // $ANTLR start "rule__BackWall__Group__2__Impl"
    // InternalXDrone.g:4272:1: rule__BackWall__Group__2__Impl : ( ( rule__BackWall__ValueAssignment_2 ) ) ;
    public final void rule__BackWall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4276:1: ( ( ( rule__BackWall__ValueAssignment_2 ) ) )
            // InternalXDrone.g:4277:1: ( ( rule__BackWall__ValueAssignment_2 ) )
            {
            // InternalXDrone.g:4277:1: ( ( rule__BackWall__ValueAssignment_2 ) )
            // InternalXDrone.g:4278:2: ( rule__BackWall__ValueAssignment_2 )
            {
             before(grammarAccess.getBackWallAccess().getValueAssignment_2()); 
            // InternalXDrone.g:4279:2: ( rule__BackWall__ValueAssignment_2 )
            // InternalXDrone.g:4279:3: rule__BackWall__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BackWall__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBackWallAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackWall__Group__2__Impl"


    // $ANTLR start "rule__UpWall__Group__0"
    // InternalXDrone.g:4288:1: rule__UpWall__Group__0 : rule__UpWall__Group__0__Impl rule__UpWall__Group__1 ;
    public final void rule__UpWall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4292:1: ( rule__UpWall__Group__0__Impl rule__UpWall__Group__1 )
            // InternalXDrone.g:4293:2: rule__UpWall__Group__0__Impl rule__UpWall__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__UpWall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpWall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpWall__Group__0"


    // $ANTLR start "rule__UpWall__Group__0__Impl"
    // InternalXDrone.g:4300:1: rule__UpWall__Group__0__Impl : ( 'up' ) ;
    public final void rule__UpWall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4304:1: ( ( 'up' ) )
            // InternalXDrone.g:4305:1: ( 'up' )
            {
            // InternalXDrone.g:4305:1: ( 'up' )
            // InternalXDrone.g:4306:2: 'up'
            {
             before(grammarAccess.getUpWallAccess().getUpKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getUpWallAccess().getUpKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpWall__Group__0__Impl"


    // $ANTLR start "rule__UpWall__Group__1"
    // InternalXDrone.g:4315:1: rule__UpWall__Group__1 : rule__UpWall__Group__1__Impl rule__UpWall__Group__2 ;
    public final void rule__UpWall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4319:1: ( rule__UpWall__Group__1__Impl rule__UpWall__Group__2 )
            // InternalXDrone.g:4320:2: rule__UpWall__Group__1__Impl rule__UpWall__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__UpWall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpWall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpWall__Group__1"


    // $ANTLR start "rule__UpWall__Group__1__Impl"
    // InternalXDrone.g:4327:1: rule__UpWall__Group__1__Impl : ( '=' ) ;
    public final void rule__UpWall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4331:1: ( ( '=' ) )
            // InternalXDrone.g:4332:1: ( '=' )
            {
            // InternalXDrone.g:4332:1: ( '=' )
            // InternalXDrone.g:4333:2: '='
            {
             before(grammarAccess.getUpWallAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getUpWallAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpWall__Group__1__Impl"


    // $ANTLR start "rule__UpWall__Group__2"
    // InternalXDrone.g:4342:1: rule__UpWall__Group__2 : rule__UpWall__Group__2__Impl ;
    public final void rule__UpWall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4346:1: ( rule__UpWall__Group__2__Impl )
            // InternalXDrone.g:4347:2: rule__UpWall__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpWall__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpWall__Group__2"


    // $ANTLR start "rule__UpWall__Group__2__Impl"
    // InternalXDrone.g:4353:1: rule__UpWall__Group__2__Impl : ( ( rule__UpWall__ValueAssignment_2 ) ) ;
    public final void rule__UpWall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4357:1: ( ( ( rule__UpWall__ValueAssignment_2 ) ) )
            // InternalXDrone.g:4358:1: ( ( rule__UpWall__ValueAssignment_2 ) )
            {
            // InternalXDrone.g:4358:1: ( ( rule__UpWall__ValueAssignment_2 ) )
            // InternalXDrone.g:4359:2: ( rule__UpWall__ValueAssignment_2 )
            {
             before(grammarAccess.getUpWallAccess().getValueAssignment_2()); 
            // InternalXDrone.g:4360:2: ( rule__UpWall__ValueAssignment_2 )
            // InternalXDrone.g:4360:3: rule__UpWall__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UpWall__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUpWallAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpWall__Group__2__Impl"


    // $ANTLR start "rule__Program__MainAssignment"
    // InternalXDrone.g:4369:1: rule__Program__MainAssignment : ( ruleMain ) ;
    public final void rule__Program__MainAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4373:1: ( ( ruleMain ) )
            // InternalXDrone.g:4374:2: ( ruleMain )
            {
            // InternalXDrone.g:4374:2: ( ruleMain )
            // InternalXDrone.g:4375:3: ruleMain
            {
             before(grammarAccess.getProgramAccess().getMainMainParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getMainMainParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__MainAssignment"


    // $ANTLR start "rule__Main__FlyAssignment_0"
    // InternalXDrone.g:4384:1: rule__Main__FlyAssignment_0 : ( ruleFly ) ;
    public final void rule__Main__FlyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4388:1: ( ( ruleFly ) )
            // InternalXDrone.g:4389:2: ( ruleFly )
            {
            // InternalXDrone.g:4389:2: ( ruleFly )
            // InternalXDrone.g:4390:3: ruleFly
            {
             before(grammarAccess.getMainAccess().getFlyFlyParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFly();

            state._fsp--;

             after(grammarAccess.getMainAccess().getFlyFlyParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__FlyAssignment_0"


    // $ANTLR start "rule__Main__EnvironmentAssignment_1"
    // InternalXDrone.g:4399:1: rule__Main__EnvironmentAssignment_1 : ( ruleEnvironment ) ;
    public final void rule__Main__EnvironmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4403:1: ( ( ruleEnvironment ) )
            // InternalXDrone.g:4404:2: ( ruleEnvironment )
            {
            // InternalXDrone.g:4404:2: ( ruleEnvironment )
            // InternalXDrone.g:4405:3: ruleEnvironment
            {
             before(grammarAccess.getMainAccess().getEnvironmentEnvironmentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnvironment();

            state._fsp--;

             after(grammarAccess.getMainAccess().getEnvironmentEnvironmentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__EnvironmentAssignment_1"


    // $ANTLR start "rule__Fly__TakeoffAssignment_4_0"
    // InternalXDrone.g:4414:1: rule__Fly__TakeoffAssignment_4_0 : ( ruleTakeoff ) ;
    public final void rule__Fly__TakeoffAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4418:1: ( ( ruleTakeoff ) )
            // InternalXDrone.g:4419:2: ( ruleTakeoff )
            {
            // InternalXDrone.g:4419:2: ( ruleTakeoff )
            // InternalXDrone.g:4420:3: ruleTakeoff
            {
             before(grammarAccess.getFlyAccess().getTakeoffTakeoffParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTakeoff();

            state._fsp--;

             after(grammarAccess.getFlyAccess().getTakeoffTakeoffParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fly__TakeoffAssignment_4_0"


    // $ANTLR start "rule__Fly__CommandsAssignment_4_1"
    // InternalXDrone.g:4429:1: rule__Fly__CommandsAssignment_4_1 : ( ruleSuperCommand ) ;
    public final void rule__Fly__CommandsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4433:1: ( ( ruleSuperCommand ) )
            // InternalXDrone.g:4434:2: ( ruleSuperCommand )
            {
            // InternalXDrone.g:4434:2: ( ruleSuperCommand )
            // InternalXDrone.g:4435:3: ruleSuperCommand
            {
             before(grammarAccess.getFlyAccess().getCommandsSuperCommandParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSuperCommand();

            state._fsp--;

             after(grammarAccess.getFlyAccess().getCommandsSuperCommandParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fly__CommandsAssignment_4_1"


    // $ANTLR start "rule__Fly__LandAssignment_4_2"
    // InternalXDrone.g:4444:1: rule__Fly__LandAssignment_4_2 : ( ruleLand ) ;
    public final void rule__Fly__LandAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4448:1: ( ( ruleLand ) )
            // InternalXDrone.g:4449:2: ( ruleLand )
            {
            // InternalXDrone.g:4449:2: ( ruleLand )
            // InternalXDrone.g:4450:3: ruleLand
            {
             before(grammarAccess.getFlyAccess().getLandLandParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLand();

            state._fsp--;

             after(grammarAccess.getFlyAccess().getLandLandParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fly__LandAssignment_4_2"


    // $ANTLR start "rule__Environment__DroneAssignment_5_0"
    // InternalXDrone.g:4459:1: rule__Environment__DroneAssignment_5_0 : ( ruleDrone ) ;
    public final void rule__Environment__DroneAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4463:1: ( ( ruleDrone ) )
            // InternalXDrone.g:4464:2: ( ruleDrone )
            {
            // InternalXDrone.g:4464:2: ( ruleDrone )
            // InternalXDrone.g:4465:3: ruleDrone
            {
             before(grammarAccess.getEnvironmentAccess().getDroneDroneParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDrone();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getDroneDroneParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__DroneAssignment_5_0"


    // $ANTLR start "rule__Environment__WallsAssignment_5_1"
    // InternalXDrone.g:4474:1: rule__Environment__WallsAssignment_5_1 : ( ruleWalls ) ;
    public final void rule__Environment__WallsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4478:1: ( ( ruleWalls ) )
            // InternalXDrone.g:4479:2: ( ruleWalls )
            {
            // InternalXDrone.g:4479:2: ( ruleWalls )
            // InternalXDrone.g:4480:3: ruleWalls
            {
             before(grammarAccess.getEnvironmentAccess().getWallsWallsParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWalls();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getWallsWallsParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__WallsAssignment_5_1"


    // $ANTLR start "rule__Environment__ObjectsAssignment_5_2"
    // InternalXDrone.g:4489:1: rule__Environment__ObjectsAssignment_5_2 : ( ruleObject ) ;
    public final void rule__Environment__ObjectsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4493:1: ( ( ruleObject ) )
            // InternalXDrone.g:4494:2: ( ruleObject )
            {
            // InternalXDrone.g:4494:2: ( ruleObject )
            // InternalXDrone.g:4495:3: ruleObject
            {
             before(grammarAccess.getEnvironmentAccess().getObjectsObjectParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObject();

            state._fsp--;

             after(grammarAccess.getEnvironmentAccess().getObjectsObjectParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Environment__ObjectsAssignment_5_2"


    // $ANTLR start "rule__GoTo__Object_nameAssignment_2"
    // InternalXDrone.g:4504:1: rule__GoTo__Object_nameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__GoTo__Object_nameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4508:1: ( ( RULE_STRING ) )
            // InternalXDrone.g:4509:2: ( RULE_STRING )
            {
            // InternalXDrone.g:4509:2: ( RULE_STRING )
            // InternalXDrone.g:4510:3: RULE_STRING
            {
             before(grammarAccess.getGoToAccess().getObject_nameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGoToAccess().getObject_nameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GoTo__Object_nameAssignment_2"


    // $ANTLR start "rule__Up__DistanceAssignment_2"
    // InternalXDrone.g:4519:1: rule__Up__DistanceAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Up__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4523:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4524:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4524:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4525:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getUpAccess().getDistancePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getUpAccess().getDistancePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Up__DistanceAssignment_2"


    // $ANTLR start "rule__Down__DistanceAssignment_2"
    // InternalXDrone.g:4534:1: rule__Down__DistanceAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Down__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4538:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4539:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4539:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4540:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getDownAccess().getDistancePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getDownAccess().getDistancePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Down__DistanceAssignment_2"


    // $ANTLR start "rule__Left__DistanceAssignment_2"
    // InternalXDrone.g:4549:1: rule__Left__DistanceAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Left__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4553:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4554:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4554:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4555:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getLeftAccess().getDistancePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getLeftAccess().getDistancePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__DistanceAssignment_2"


    // $ANTLR start "rule__Right__DistanceAssignment_2"
    // InternalXDrone.g:4564:1: rule__Right__DistanceAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Right__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4568:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4569:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4569:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4570:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getRightAccess().getDistancePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getRightAccess().getDistancePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__DistanceAssignment_2"


    // $ANTLR start "rule__Forward__DistanceAssignment_2"
    // InternalXDrone.g:4579:1: rule__Forward__DistanceAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Forward__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4583:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4584:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4584:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4585:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getForwardAccess().getDistancePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getForwardAccess().getDistancePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forward__DistanceAssignment_2"


    // $ANTLR start "rule__Backward__DistanceAssignment_2"
    // InternalXDrone.g:4594:1: rule__Backward__DistanceAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Backward__DistanceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4598:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4599:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4599:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4600:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getBackwardAccess().getDistancePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getBackwardAccess().getDistancePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Backward__DistanceAssignment_2"


    // $ANTLR start "rule__RotateL__AngleAssignment_2"
    // InternalXDrone.g:4609:1: rule__RotateL__AngleAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__RotateL__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4613:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4614:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4614:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4615:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getRotateLAccess().getAnglePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getRotateLAccess().getAnglePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateL__AngleAssignment_2"


    // $ANTLR start "rule__RotateR__AngleAssignment_2"
    // InternalXDrone.g:4624:1: rule__RotateR__AngleAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__RotateR__AngleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4628:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4629:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4629:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4630:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getRotateRAccess().getAnglePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getRotateRAccess().getAnglePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RotateR__AngleAssignment_2"


    // $ANTLR start "rule__Wait__SecondsAssignment_2"
    // InternalXDrone.g:4639:1: rule__Wait__SecondsAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__Wait__SecondsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4643:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4644:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4644:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4645:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getWaitAccess().getSecondsPOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getWaitAccess().getSecondsPOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Wait__SecondsAssignment_2"


    // $ANTLR start "rule__Drone__PositionAssignment_3_0"
    // InternalXDrone.g:4654:1: rule__Drone__PositionAssignment_3_0 : ( rulePosition ) ;
    public final void rule__Drone__PositionAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4658:1: ( ( rulePosition ) )
            // InternalXDrone.g:4659:2: ( rulePosition )
            {
            // InternalXDrone.g:4659:2: ( rulePosition )
            // InternalXDrone.g:4660:3: rulePosition
            {
             before(grammarAccess.getDroneAccess().getPositionPositionParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getDroneAccess().getPositionPositionParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__PositionAssignment_3_0"


    // $ANTLR start "rule__Drone__RotationAssignment_3_1_2"
    // InternalXDrone.g:4669:1: rule__Drone__RotationAssignment_3_1_2 : ( ruleDOUBLE ) ;
    public final void rule__Drone__RotationAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4673:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:4674:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:4674:2: ( ruleDOUBLE )
            // InternalXDrone.g:4675:3: ruleDOUBLE
            {
             before(grammarAccess.getDroneAccess().getRotationDOUBLEParserRuleCall_3_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDroneAccess().getRotationDOUBLEParserRuleCall_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Drone__RotationAssignment_3_1_2"


    // $ANTLR start "rule__Object__Object_nameAssignment_0"
    // InternalXDrone.g:4684:1: rule__Object__Object_nameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Object__Object_nameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4688:1: ( ( RULE_ID ) )
            // InternalXDrone.g:4689:2: ( RULE_ID )
            {
            // InternalXDrone.g:4689:2: ( RULE_ID )
            // InternalXDrone.g:4690:3: RULE_ID
            {
             before(grammarAccess.getObjectAccess().getObject_nameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObjectAccess().getObject_nameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__Object_nameAssignment_0"


    // $ANTLR start "rule__Object__OriginAssignment_3_0"
    // InternalXDrone.g:4699:1: rule__Object__OriginAssignment_3_0 : ( ruleOrigin ) ;
    public final void rule__Object__OriginAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4703:1: ( ( ruleOrigin ) )
            // InternalXDrone.g:4704:2: ( ruleOrigin )
            {
            // InternalXDrone.g:4704:2: ( ruleOrigin )
            // InternalXDrone.g:4705:3: ruleOrigin
            {
             before(grammarAccess.getObjectAccess().getOriginOriginParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOrigin();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getOriginOriginParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__OriginAssignment_3_0"


    // $ANTLR start "rule__Object__SizeAssignment_3_1"
    // InternalXDrone.g:4714:1: rule__Object__SizeAssignment_3_1 : ( ruleSize ) ;
    public final void rule__Object__SizeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4718:1: ( ( ruleSize ) )
            // InternalXDrone.g:4719:2: ( ruleSize )
            {
            // InternalXDrone.g:4719:2: ( ruleSize )
            // InternalXDrone.g:4720:3: ruleSize
            {
             before(grammarAccess.getObjectAccess().getSizeSizeParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSize();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getSizeSizeParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__SizeAssignment_3_1"


    // $ANTLR start "rule__Object__ColorAssignment_3_2"
    // InternalXDrone.g:4729:1: rule__Object__ColorAssignment_3_2 : ( ruleColor ) ;
    public final void rule__Object__ColorAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4733:1: ( ( ruleColor ) )
            // InternalXDrone.g:4734:2: ( ruleColor )
            {
            // InternalXDrone.g:4734:2: ( ruleColor )
            // InternalXDrone.g:4735:3: ruleColor
            {
             before(grammarAccess.getObjectAccess().getColorColorParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getObjectAccess().getColorColorParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Object__ColorAssignment_3_2"


    // $ANTLR start "rule__Origin__VectorAssignment_2"
    // InternalXDrone.g:4744:1: rule__Origin__VectorAssignment_2 : ( ruleVector ) ;
    public final void rule__Origin__VectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4748:1: ( ( ruleVector ) )
            // InternalXDrone.g:4749:2: ( ruleVector )
            {
            // InternalXDrone.g:4749:2: ( ruleVector )
            // InternalXDrone.g:4750:3: ruleVector
            {
             before(grammarAccess.getOriginAccess().getVectorVectorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVector();

            state._fsp--;

             after(grammarAccess.getOriginAccess().getVectorVectorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Origin__VectorAssignment_2"


    // $ANTLR start "rule__Size__VectorAssignment_2"
    // InternalXDrone.g:4759:1: rule__Size__VectorAssignment_2 : ( ruleVector ) ;
    public final void rule__Size__VectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4763:1: ( ( ruleVector ) )
            // InternalXDrone.g:4764:2: ( ruleVector )
            {
            // InternalXDrone.g:4764:2: ( ruleVector )
            // InternalXDrone.g:4765:3: ruleVector
            {
             before(grammarAccess.getSizeAccess().getVectorVectorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVector();

            state._fsp--;

             after(grammarAccess.getSizeAccess().getVectorVectorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Size__VectorAssignment_2"


    // $ANTLR start "rule__Position__VectorAssignment_2"
    // InternalXDrone.g:4774:1: rule__Position__VectorAssignment_2 : ( ruleVector ) ;
    public final void rule__Position__VectorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4778:1: ( ( ruleVector ) )
            // InternalXDrone.g:4779:2: ( ruleVector )
            {
            // InternalXDrone.g:4779:2: ( ruleVector )
            // InternalXDrone.g:4780:3: ruleVector
            {
             before(grammarAccess.getPositionAccess().getVectorVectorParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVector();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getVectorVectorParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__VectorAssignment_2"


    // $ANTLR start "rule__Vector__XAssignment_1"
    // InternalXDrone.g:4789:1: rule__Vector__XAssignment_1 : ( ruleDOUBLE ) ;
    public final void rule__Vector__XAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4793:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:4794:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:4794:2: ( ruleDOUBLE )
            // InternalXDrone.g:4795:3: ruleDOUBLE
            {
             before(grammarAccess.getVectorAccess().getXDOUBLEParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getVectorAccess().getXDOUBLEParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__XAssignment_1"


    // $ANTLR start "rule__Vector__YAssignment_3"
    // InternalXDrone.g:4804:1: rule__Vector__YAssignment_3 : ( ruleDOUBLE ) ;
    public final void rule__Vector__YAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4808:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:4809:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:4809:2: ( ruleDOUBLE )
            // InternalXDrone.g:4810:3: ruleDOUBLE
            {
             before(grammarAccess.getVectorAccess().getYDOUBLEParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getVectorAccess().getYDOUBLEParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__YAssignment_3"


    // $ANTLR start "rule__Vector__ZAssignment_5"
    // InternalXDrone.g:4819:1: rule__Vector__ZAssignment_5 : ( ruleDOUBLE ) ;
    public final void rule__Vector__ZAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4823:1: ( ( ruleDOUBLE ) )
            // InternalXDrone.g:4824:2: ( ruleDOUBLE )
            {
            // InternalXDrone.g:4824:2: ( ruleDOUBLE )
            // InternalXDrone.g:4825:3: ruleDOUBLE
            {
             before(grammarAccess.getVectorAccess().getZDOUBLEParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getVectorAccess().getZDOUBLEParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vector__ZAssignment_5"


    // $ANTLR start "rule__Color__Color_valueAssignment_2"
    // InternalXDrone.g:4834:1: rule__Color__Color_valueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Color__Color_valueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4838:1: ( ( RULE_STRING ) )
            // InternalXDrone.g:4839:2: ( RULE_STRING )
            {
            // InternalXDrone.g:4839:2: ( RULE_STRING )
            // InternalXDrone.g:4840:3: RULE_STRING
            {
             before(grammarAccess.getColorAccess().getColor_valueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColor_valueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Color_valueAssignment_2"


    // $ANTLR start "rule__Walls__FrontAssignment_3_0"
    // InternalXDrone.g:4849:1: rule__Walls__FrontAssignment_3_0 : ( ruleFrontWall ) ;
    public final void rule__Walls__FrontAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4853:1: ( ( ruleFrontWall ) )
            // InternalXDrone.g:4854:2: ( ruleFrontWall )
            {
            // InternalXDrone.g:4854:2: ( ruleFrontWall )
            // InternalXDrone.g:4855:3: ruleFrontWall
            {
             before(grammarAccess.getWallsAccess().getFrontFrontWallParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFrontWall();

            state._fsp--;

             after(grammarAccess.getWallsAccess().getFrontFrontWallParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__FrontAssignment_3_0"


    // $ANTLR start "rule__Walls__RightAssignment_3_1"
    // InternalXDrone.g:4864:1: rule__Walls__RightAssignment_3_1 : ( ruleRightWall ) ;
    public final void rule__Walls__RightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4868:1: ( ( ruleRightWall ) )
            // InternalXDrone.g:4869:2: ( ruleRightWall )
            {
            // InternalXDrone.g:4869:2: ( ruleRightWall )
            // InternalXDrone.g:4870:3: ruleRightWall
            {
             before(grammarAccess.getWallsAccess().getRightRightWallParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRightWall();

            state._fsp--;

             after(grammarAccess.getWallsAccess().getRightRightWallParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__RightAssignment_3_1"


    // $ANTLR start "rule__Walls__BackAssignment_3_2"
    // InternalXDrone.g:4879:1: rule__Walls__BackAssignment_3_2 : ( ruleBackWall ) ;
    public final void rule__Walls__BackAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4883:1: ( ( ruleBackWall ) )
            // InternalXDrone.g:4884:2: ( ruleBackWall )
            {
            // InternalXDrone.g:4884:2: ( ruleBackWall )
            // InternalXDrone.g:4885:3: ruleBackWall
            {
             before(grammarAccess.getWallsAccess().getBackBackWallParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBackWall();

            state._fsp--;

             after(grammarAccess.getWallsAccess().getBackBackWallParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__BackAssignment_3_2"


    // $ANTLR start "rule__Walls__LeftAssignment_3_3"
    // InternalXDrone.g:4894:1: rule__Walls__LeftAssignment_3_3 : ( ruleLeftWall ) ;
    public final void rule__Walls__LeftAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4898:1: ( ( ruleLeftWall ) )
            // InternalXDrone.g:4899:2: ( ruleLeftWall )
            {
            // InternalXDrone.g:4899:2: ( ruleLeftWall )
            // InternalXDrone.g:4900:3: ruleLeftWall
            {
             before(grammarAccess.getWallsAccess().getLeftLeftWallParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLeftWall();

            state._fsp--;

             after(grammarAccess.getWallsAccess().getLeftLeftWallParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__LeftAssignment_3_3"


    // $ANTLR start "rule__Walls__UpAssignment_3_4"
    // InternalXDrone.g:4909:1: rule__Walls__UpAssignment_3_4 : ( ruleUpWall ) ;
    public final void rule__Walls__UpAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4913:1: ( ( ruleUpWall ) )
            // InternalXDrone.g:4914:2: ( ruleUpWall )
            {
            // InternalXDrone.g:4914:2: ( ruleUpWall )
            // InternalXDrone.g:4915:3: ruleUpWall
            {
             before(grammarAccess.getWallsAccess().getUpUpWallParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleUpWall();

            state._fsp--;

             after(grammarAccess.getWallsAccess().getUpUpWallParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Walls__UpAssignment_3_4"


    // $ANTLR start "rule__FrontWall__ValueAssignment_2"
    // InternalXDrone.g:4924:1: rule__FrontWall__ValueAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__FrontWall__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4928:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4929:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4929:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4930:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getFrontWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getFrontWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FrontWall__ValueAssignment_2"


    // $ANTLR start "rule__RightWall__ValueAssignment_2"
    // InternalXDrone.g:4939:1: rule__RightWall__ValueAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__RightWall__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4943:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4944:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4944:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4945:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getRightWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getRightWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightWall__ValueAssignment_2"


    // $ANTLR start "rule__LeftWall__ValueAssignment_2"
    // InternalXDrone.g:4954:1: rule__LeftWall__ValueAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__LeftWall__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4958:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4959:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4959:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4960:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getLeftWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getLeftWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftWall__ValueAssignment_2"


    // $ANTLR start "rule__BackWall__ValueAssignment_2"
    // InternalXDrone.g:4969:1: rule__BackWall__ValueAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__BackWall__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4973:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4974:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4974:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4975:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getBackWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getBackWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackWall__ValueAssignment_2"


    // $ANTLR start "rule__UpWall__ValueAssignment_2"
    // InternalXDrone.g:4984:1: rule__UpWall__ValueAssignment_2 : ( rulePOSITIVE_DOUBLE ) ;
    public final void rule__UpWall__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXDrone.g:4988:1: ( ( rulePOSITIVE_DOUBLE ) )
            // InternalXDrone.g:4989:2: ( rulePOSITIVE_DOUBLE )
            {
            // InternalXDrone.g:4989:2: ( rulePOSITIVE_DOUBLE )
            // InternalXDrone.g:4990:3: rulePOSITIVE_DOUBLE
            {
             before(grammarAccess.getUpWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePOSITIVE_DOUBLE();

            state._fsp--;

             after(grammarAccess.getUpWallAccess().getValuePOSITIVE_DOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpWall__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000007FE40000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000007FE00002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008080008040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000008080000042L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001200008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001200000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004C00008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004C00000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00001F0000008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00001F0000000002L});

}