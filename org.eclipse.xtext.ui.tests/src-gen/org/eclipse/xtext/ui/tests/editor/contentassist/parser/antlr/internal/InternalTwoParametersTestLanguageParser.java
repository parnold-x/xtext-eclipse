package org.eclipse.xtext.ui.tests.editor.contentassist.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.TwoParametersTestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTwoParametersTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#1'", "'#2'", "'#3'", "'#4'", "'#5'", "'#6'", "'#7'", "'#8'", "'#9'", "'trailing'", "'#10'", "'#11'", "'#12'", "'#13'", "'#14'", "'scenario3'", "'scenario4'", "'scenario5'", "'fragment'", "'include'", "'keyword'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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


        public InternalTwoParametersTestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTwoParametersTestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTwoParametersTestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTwoParametersTestLanguage.g"; }



     	private TwoParametersTestLanguageGrammarAccess grammarAccess;

        public InternalTwoParametersTestLanguageParser(TokenStream input, TwoParametersTestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ParserRuleParameters";
       	}

       	@Override
       	protected TwoParametersTestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleParserRuleParameters"
    // InternalTwoParametersTestLanguage.g:64:1: entryRuleParserRuleParameters returns [EObject current=null] : iv_ruleParserRuleParameters= ruleParserRuleParameters EOF ;
    public final EObject entryRuleParserRuleParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParserRuleParameters = null;


        try {
            // InternalTwoParametersTestLanguage.g:64:61: (iv_ruleParserRuleParameters= ruleParserRuleParameters EOF )
            // InternalTwoParametersTestLanguage.g:65:2: iv_ruleParserRuleParameters= ruleParserRuleParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParserRuleParametersRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParserRuleParameters=ruleParserRuleParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParserRuleParameters; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParserRuleParameters"


    // $ANTLR start "ruleParserRuleParameters"
    // InternalTwoParametersTestLanguage.g:71:1: ruleParserRuleParameters returns [EObject current=null] : ( () ( (otherlv_1= '#1' ( (lv_scenario_2_0= norm3_Scenario6 ) ) ) | (otherlv_3= '#2' ( (lv_scenario_4_0= ruleScenario6 ) ) ) | (otherlv_5= '#3' ( (lv_scenario_6_0= norm3_Scenario7 ) ) ) | (otherlv_7= '#4' ( (lv_scenario_8_0= norm2_Scenario7 ) ) ) | ( ( ( '#5' ( ( norm3_Scenario7 ) ) ) )=> (otherlv_9= '#5' ( (lv_scenario_10_0= norm3_Scenario7 ) ) ) ) | ( ( ( '#6' ( ( ruleScenario7 ) ) ) )=> (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario7 ) ) ) ) | (otherlv_13= '#7' ( (lv_scenario_14_0= norm3_Scenario8 ) ) ) | (otherlv_15= '#8' ( (lv_scenario_16_0= norm2_Scenario8 ) ) ) | (otherlv_17= '#9' ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_18_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_19_0= norm3_Scenario7 ) ) (otherlv_20= 'trailing' )? ) ) ) | (otherlv_21= '#10' ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_22_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_23_0= ruleScenario7 ) ) (otherlv_24= 'trailing' )? ) ) ) | (otherlv_25= '#11' ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_26_0= ruleScenario9 ) ) | ( ( (lv_scenario_27_0= norm3_Scenario7 ) ) (otherlv_28= 'trailing' )? ) ) ) | (otherlv_29= '#12' ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_30_0= ruleScenario9 ) ) | ( ( (lv_scenario_31_0= ruleScenario7 ) ) (otherlv_32= 'trailing' )? ) ) ) | (otherlv_33= '#13' ( (lv_scenario_34_0= norm1_Scenario10 ) ) ) | (otherlv_35= '#14' ( (lv_scenario_36_0= norm3_Scenario10 ) ) ) ) ) ;
    public final EObject ruleParserRuleParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        EObject lv_scenario_2_0 = null;

        EObject lv_scenario_4_0 = null;

        EObject lv_scenario_6_0 = null;

        EObject lv_scenario_8_0 = null;

        EObject lv_scenario_10_0 = null;

        EObject lv_scenario_12_0 = null;

        EObject lv_scenario_14_0 = null;

        EObject lv_scenario_16_0 = null;

        EObject lv_scenario_18_0 = null;

        EObject lv_scenario_19_0 = null;

        EObject lv_scenario_22_0 = null;

        EObject lv_scenario_23_0 = null;

        EObject lv_scenario_26_0 = null;

        EObject lv_scenario_27_0 = null;

        EObject lv_scenario_30_0 = null;

        EObject lv_scenario_31_0 = null;

        EObject lv_scenario_34_0 = null;

        EObject lv_scenario_36_0 = null;


        try {
            // InternalTwoParametersTestLanguage.g:72:1: ( ( () ( (otherlv_1= '#1' ( (lv_scenario_2_0= norm3_Scenario6 ) ) ) | (otherlv_3= '#2' ( (lv_scenario_4_0= ruleScenario6 ) ) ) | (otherlv_5= '#3' ( (lv_scenario_6_0= norm3_Scenario7 ) ) ) | (otherlv_7= '#4' ( (lv_scenario_8_0= norm2_Scenario7 ) ) ) | ( ( ( '#5' ( ( norm3_Scenario7 ) ) ) )=> (otherlv_9= '#5' ( (lv_scenario_10_0= norm3_Scenario7 ) ) ) ) | ( ( ( '#6' ( ( ruleScenario7 ) ) ) )=> (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario7 ) ) ) ) | (otherlv_13= '#7' ( (lv_scenario_14_0= norm3_Scenario8 ) ) ) | (otherlv_15= '#8' ( (lv_scenario_16_0= norm2_Scenario8 ) ) ) | (otherlv_17= '#9' ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_18_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_19_0= norm3_Scenario7 ) ) (otherlv_20= 'trailing' )? ) ) ) | (otherlv_21= '#10' ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_22_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_23_0= ruleScenario7 ) ) (otherlv_24= 'trailing' )? ) ) ) | (otherlv_25= '#11' ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_26_0= ruleScenario9 ) ) | ( ( (lv_scenario_27_0= norm3_Scenario7 ) ) (otherlv_28= 'trailing' )? ) ) ) | (otherlv_29= '#12' ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_30_0= ruleScenario9 ) ) | ( ( (lv_scenario_31_0= ruleScenario7 ) ) (otherlv_32= 'trailing' )? ) ) ) | (otherlv_33= '#13' ( (lv_scenario_34_0= norm1_Scenario10 ) ) ) | (otherlv_35= '#14' ( (lv_scenario_36_0= norm3_Scenario10 ) ) ) ) ) )
            // InternalTwoParametersTestLanguage.g:73:2: ( () ( (otherlv_1= '#1' ( (lv_scenario_2_0= norm3_Scenario6 ) ) ) | (otherlv_3= '#2' ( (lv_scenario_4_0= ruleScenario6 ) ) ) | (otherlv_5= '#3' ( (lv_scenario_6_0= norm3_Scenario7 ) ) ) | (otherlv_7= '#4' ( (lv_scenario_8_0= norm2_Scenario7 ) ) ) | ( ( ( '#5' ( ( norm3_Scenario7 ) ) ) )=> (otherlv_9= '#5' ( (lv_scenario_10_0= norm3_Scenario7 ) ) ) ) | ( ( ( '#6' ( ( ruleScenario7 ) ) ) )=> (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario7 ) ) ) ) | (otherlv_13= '#7' ( (lv_scenario_14_0= norm3_Scenario8 ) ) ) | (otherlv_15= '#8' ( (lv_scenario_16_0= norm2_Scenario8 ) ) ) | (otherlv_17= '#9' ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_18_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_19_0= norm3_Scenario7 ) ) (otherlv_20= 'trailing' )? ) ) ) | (otherlv_21= '#10' ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_22_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_23_0= ruleScenario7 ) ) (otherlv_24= 'trailing' )? ) ) ) | (otherlv_25= '#11' ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_26_0= ruleScenario9 ) ) | ( ( (lv_scenario_27_0= norm3_Scenario7 ) ) (otherlv_28= 'trailing' )? ) ) ) | (otherlv_29= '#12' ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_30_0= ruleScenario9 ) ) | ( ( (lv_scenario_31_0= ruleScenario7 ) ) (otherlv_32= 'trailing' )? ) ) ) | (otherlv_33= '#13' ( (lv_scenario_34_0= norm1_Scenario10 ) ) ) | (otherlv_35= '#14' ( (lv_scenario_36_0= norm3_Scenario10 ) ) ) ) )
            {
            // InternalTwoParametersTestLanguage.g:73:2: ( () ( (otherlv_1= '#1' ( (lv_scenario_2_0= norm3_Scenario6 ) ) ) | (otherlv_3= '#2' ( (lv_scenario_4_0= ruleScenario6 ) ) ) | (otherlv_5= '#3' ( (lv_scenario_6_0= norm3_Scenario7 ) ) ) | (otherlv_7= '#4' ( (lv_scenario_8_0= norm2_Scenario7 ) ) ) | ( ( ( '#5' ( ( norm3_Scenario7 ) ) ) )=> (otherlv_9= '#5' ( (lv_scenario_10_0= norm3_Scenario7 ) ) ) ) | ( ( ( '#6' ( ( ruleScenario7 ) ) ) )=> (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario7 ) ) ) ) | (otherlv_13= '#7' ( (lv_scenario_14_0= norm3_Scenario8 ) ) ) | (otherlv_15= '#8' ( (lv_scenario_16_0= norm2_Scenario8 ) ) ) | (otherlv_17= '#9' ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_18_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_19_0= norm3_Scenario7 ) ) (otherlv_20= 'trailing' )? ) ) ) | (otherlv_21= '#10' ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_22_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_23_0= ruleScenario7 ) ) (otherlv_24= 'trailing' )? ) ) ) | (otherlv_25= '#11' ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_26_0= ruleScenario9 ) ) | ( ( (lv_scenario_27_0= norm3_Scenario7 ) ) (otherlv_28= 'trailing' )? ) ) ) | (otherlv_29= '#12' ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_30_0= ruleScenario9 ) ) | ( ( (lv_scenario_31_0= ruleScenario7 ) ) (otherlv_32= 'trailing' )? ) ) ) | (otherlv_33= '#13' ( (lv_scenario_34_0= norm1_Scenario10 ) ) ) | (otherlv_35= '#14' ( (lv_scenario_36_0= norm3_Scenario10 ) ) ) ) )
            // InternalTwoParametersTestLanguage.g:74:3: () ( (otherlv_1= '#1' ( (lv_scenario_2_0= norm3_Scenario6 ) ) ) | (otherlv_3= '#2' ( (lv_scenario_4_0= ruleScenario6 ) ) ) | (otherlv_5= '#3' ( (lv_scenario_6_0= norm3_Scenario7 ) ) ) | (otherlv_7= '#4' ( (lv_scenario_8_0= norm2_Scenario7 ) ) ) | ( ( ( '#5' ( ( norm3_Scenario7 ) ) ) )=> (otherlv_9= '#5' ( (lv_scenario_10_0= norm3_Scenario7 ) ) ) ) | ( ( ( '#6' ( ( ruleScenario7 ) ) ) )=> (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario7 ) ) ) ) | (otherlv_13= '#7' ( (lv_scenario_14_0= norm3_Scenario8 ) ) ) | (otherlv_15= '#8' ( (lv_scenario_16_0= norm2_Scenario8 ) ) ) | (otherlv_17= '#9' ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_18_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_19_0= norm3_Scenario7 ) ) (otherlv_20= 'trailing' )? ) ) ) | (otherlv_21= '#10' ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_22_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_23_0= ruleScenario7 ) ) (otherlv_24= 'trailing' )? ) ) ) | (otherlv_25= '#11' ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_26_0= ruleScenario9 ) ) | ( ( (lv_scenario_27_0= norm3_Scenario7 ) ) (otherlv_28= 'trailing' )? ) ) ) | (otherlv_29= '#12' ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_30_0= ruleScenario9 ) ) | ( ( (lv_scenario_31_0= ruleScenario7 ) ) (otherlv_32= 'trailing' )? ) ) ) | (otherlv_33= '#13' ( (lv_scenario_34_0= norm1_Scenario10 ) ) ) | (otherlv_35= '#14' ( (lv_scenario_36_0= norm3_Scenario10 ) ) ) )
            {
            // InternalTwoParametersTestLanguage.g:74:3: ()
            // InternalTwoParametersTestLanguage.g:75:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParserRuleParametersAccess().getParserRuleParametersAction_0(),
              					current);
              			
            }

            }

            // InternalTwoParametersTestLanguage.g:81:3: ( (otherlv_1= '#1' ( (lv_scenario_2_0= norm3_Scenario6 ) ) ) | (otherlv_3= '#2' ( (lv_scenario_4_0= ruleScenario6 ) ) ) | (otherlv_5= '#3' ( (lv_scenario_6_0= norm3_Scenario7 ) ) ) | (otherlv_7= '#4' ( (lv_scenario_8_0= norm2_Scenario7 ) ) ) | ( ( ( '#5' ( ( norm3_Scenario7 ) ) ) )=> (otherlv_9= '#5' ( (lv_scenario_10_0= norm3_Scenario7 ) ) ) ) | ( ( ( '#6' ( ( ruleScenario7 ) ) ) )=> (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario7 ) ) ) ) | (otherlv_13= '#7' ( (lv_scenario_14_0= norm3_Scenario8 ) ) ) | (otherlv_15= '#8' ( (lv_scenario_16_0= norm2_Scenario8 ) ) ) | (otherlv_17= '#9' ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_18_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_19_0= norm3_Scenario7 ) ) (otherlv_20= 'trailing' )? ) ) ) | (otherlv_21= '#10' ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_22_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_23_0= ruleScenario7 ) ) (otherlv_24= 'trailing' )? ) ) ) | (otherlv_25= '#11' ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_26_0= ruleScenario9 ) ) | ( ( (lv_scenario_27_0= norm3_Scenario7 ) ) (otherlv_28= 'trailing' )? ) ) ) | (otherlv_29= '#12' ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_30_0= ruleScenario9 ) ) | ( ( (lv_scenario_31_0= ruleScenario7 ) ) (otherlv_32= 'trailing' )? ) ) ) | (otherlv_33= '#13' ( (lv_scenario_34_0= norm1_Scenario10 ) ) ) | (otherlv_35= '#14' ( (lv_scenario_36_0= norm3_Scenario10 ) ) ) )
            int alt9=14;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalTwoParametersTestLanguage.g:82:4: (otherlv_1= '#1' ( (lv_scenario_2_0= norm3_Scenario6 ) ) )
                    {
                    // InternalTwoParametersTestLanguage.g:82:4: (otherlv_1= '#1' ( (lv_scenario_2_0= norm3_Scenario6 ) ) )
                    // InternalTwoParametersTestLanguage.g:83:5: otherlv_1= '#1' ( (lv_scenario_2_0= norm3_Scenario6 ) )
                    {
                    otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitOneKeyword_1_0_0());
                      				
                    }
                    // InternalTwoParametersTestLanguage.g:87:5: ( (lv_scenario_2_0= norm3_Scenario6 ) )
                    // InternalTwoParametersTestLanguage.g:88:6: (lv_scenario_2_0= norm3_Scenario6 )
                    {
                    // InternalTwoParametersTestLanguage.g:88:6: (lv_scenario_2_0= norm3_Scenario6 )
                    // InternalTwoParametersTestLanguage.g:89:7: lv_scenario_2_0= norm3_Scenario6
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario6ParserRuleCall_1_0_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_scenario_2_0=norm3_Scenario6();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
                      							}
                      							set(
                      								current,
                      								"scenario",
                      								lv_scenario_2_0,
                      								"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.Scenario6");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTwoParametersTestLanguage.g:108:4: (otherlv_3= '#2' ( (lv_scenario_4_0= ruleScenario6 ) ) )
                    {
                    // InternalTwoParametersTestLanguage.g:108:4: (otherlv_3= '#2' ( (lv_scenario_4_0= ruleScenario6 ) ) )
                    // InternalTwoParametersTestLanguage.g:109:5: otherlv_3= '#2' ( (lv_scenario_4_0= ruleScenario6 ) )
                    {
                    otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitTwoKeyword_1_1_0());
                      				
                    }
                    // InternalTwoParametersTestLanguage.g:113:5: ( (lv_scenario_4_0= ruleScenario6 ) )
                    // InternalTwoParametersTestLanguage.g:114:6: (lv_scenario_4_0= ruleScenario6 )
                    {
                    // InternalTwoParametersTestLanguage.g:114:6: (lv_scenario_4_0= ruleScenario6 )
                    // InternalTwoParametersTestLanguage.g:115:7: lv_scenario_4_0= ruleScenario6
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario6ParserRuleCall_1_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_scenario_4_0=ruleScenario6();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
                      							}
                      							set(
                      								current,
                      								"scenario",
                      								lv_scenario_4_0,
                      								"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.Scenario6");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTwoParametersTestLanguage.g:134:4: (otherlv_5= '#3' ( (lv_scenario_6_0= norm3_Scenario7 ) ) )
                    {
                    // InternalTwoParametersTestLanguage.g:134:4: (otherlv_5= '#3' ( (lv_scenario_6_0= norm3_Scenario7 ) ) )
                    // InternalTwoParametersTestLanguage.g:135:5: otherlv_5= '#3' ( (lv_scenario_6_0= norm3_Scenario7 ) )
                    {
                    otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitThreeKeyword_1_2_0());
                      				
                    }
                    // InternalTwoParametersTestLanguage.g:139:5: ( (lv_scenario_6_0= norm3_Scenario7 ) )
                    // InternalTwoParametersTestLanguage.g:140:6: (lv_scenario_6_0= norm3_Scenario7 )
                    {
                    // InternalTwoParametersTestLanguage.g:140:6: (lv_scenario_6_0= norm3_Scenario7 )
                    // InternalTwoParametersTestLanguage.g:141:7: lv_scenario_6_0= norm3_Scenario7
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario7ParserRuleCall_1_2_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_scenario_6_0=norm3_Scenario7();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
                      							}
                      							set(
                      								current,
                      								"scenario",
                      								lv_scenario_6_0,
                      								"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.Scenario7");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTwoParametersTestLanguage.g:160:4: (otherlv_7= '#4' ( (lv_scenario_8_0= norm2_Scenario7 ) ) )
                    {
                    // InternalTwoParametersTestLanguage.g:160:4: (otherlv_7= '#4' ( (lv_scenario_8_0= norm2_Scenario7 ) ) )
                    // InternalTwoParametersTestLanguage.g:161:5: otherlv_7= '#4' ( (lv_scenario_8_0= norm2_Scenario7 ) )
                    {
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitFourKeyword_1_3_0());
                      				
                    }
                    // InternalTwoParametersTestLanguage.g:165:5: ( (lv_scenario_8_0= norm2_Scenario7 ) )
                    // InternalTwoParametersTestLanguage.g:166:6: (lv_scenario_8_0= norm2_Scenario7 )
                    {
                    // InternalTwoParametersTestLanguage.g:166:6: (lv_scenario_8_0= norm2_Scenario7 )
                    // InternalTwoParametersTestLanguage.g:167:7: lv_scenario_8_0= norm2_Scenario7
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario7ParserRuleCall_1_3_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_scenario_8_0=norm2_Scenario7();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
                      							}
                      							set(
                      								current,
                      								"scenario",
                      								lv_scenario_8_0,
                      								"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.Scenario7");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalTwoParametersTestLanguage.g:186:4: ( ( ( '#5' ( ( norm3_Scenario7 ) ) ) )=> (otherlv_9= '#5' ( (lv_scenario_10_0= norm3_Scenario7 ) ) ) )
                    {
                    // InternalTwoParametersTestLanguage.g:186:4: ( ( ( '#5' ( ( norm3_Scenario7 ) ) ) )=> (otherlv_9= '#5' ( (lv_scenario_10_0= norm3_Scenario7 ) ) ) )
                    // InternalTwoParametersTestLanguage.g:187:5: ( ( '#5' ( ( norm3_Scenario7 ) ) ) )=> (otherlv_9= '#5' ( (lv_scenario_10_0= norm3_Scenario7 ) ) )
                    {
                    // InternalTwoParametersTestLanguage.g:196:5: (otherlv_9= '#5' ( (lv_scenario_10_0= norm3_Scenario7 ) ) )
                    // InternalTwoParametersTestLanguage.g:197:6: otherlv_9= '#5' ( (lv_scenario_10_0= norm3_Scenario7 ) )
                    {
                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_9, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitFiveKeyword_1_4_0_0());
                      					
                    }
                    // InternalTwoParametersTestLanguage.g:201:6: ( (lv_scenario_10_0= norm3_Scenario7 ) )
                    // InternalTwoParametersTestLanguage.g:202:7: (lv_scenario_10_0= norm3_Scenario7 )
                    {
                    // InternalTwoParametersTestLanguage.g:202:7: (lv_scenario_10_0= norm3_Scenario7 )
                    // InternalTwoParametersTestLanguage.g:203:8: lv_scenario_10_0= norm3_Scenario7
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario7ParserRuleCall_1_4_0_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_scenario_10_0=norm3_Scenario7();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
                      								}
                      								set(
                      									current,
                      									"scenario",
                      									lv_scenario_10_0,
                      									"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.Scenario7");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalTwoParametersTestLanguage.g:223:4: ( ( ( '#6' ( ( ruleScenario7 ) ) ) )=> (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario7 ) ) ) )
                    {
                    // InternalTwoParametersTestLanguage.g:223:4: ( ( ( '#6' ( ( ruleScenario7 ) ) ) )=> (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario7 ) ) ) )
                    // InternalTwoParametersTestLanguage.g:224:5: ( ( '#6' ( ( ruleScenario7 ) ) ) )=> (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario7 ) ) )
                    {
                    // InternalTwoParametersTestLanguage.g:233:5: (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario7 ) ) )
                    // InternalTwoParametersTestLanguage.g:234:6: otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario7 ) )
                    {
                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_11, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitSixKeyword_1_5_0_0());
                      					
                    }
                    // InternalTwoParametersTestLanguage.g:238:6: ( (lv_scenario_12_0= ruleScenario7 ) )
                    // InternalTwoParametersTestLanguage.g:239:7: (lv_scenario_12_0= ruleScenario7 )
                    {
                    // InternalTwoParametersTestLanguage.g:239:7: (lv_scenario_12_0= ruleScenario7 )
                    // InternalTwoParametersTestLanguage.g:240:8: lv_scenario_12_0= ruleScenario7
                    {
                    if ( state.backtracking==0 ) {

                      								newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario7ParserRuleCall_1_5_0_1_0());
                      							
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_scenario_12_0=ruleScenario7();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      								if (current==null) {
                      									current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
                      								}
                      								set(
                      									current,
                      									"scenario",
                      									lv_scenario_12_0,
                      									"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.Scenario7");
                      								afterParserOrEnumRuleCall();
                      							
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalTwoParametersTestLanguage.g:260:4: (otherlv_13= '#7' ( (lv_scenario_14_0= norm3_Scenario8 ) ) )
                    {
                    // InternalTwoParametersTestLanguage.g:260:4: (otherlv_13= '#7' ( (lv_scenario_14_0= norm3_Scenario8 ) ) )
                    // InternalTwoParametersTestLanguage.g:261:5: otherlv_13= '#7' ( (lv_scenario_14_0= norm3_Scenario8 ) )
                    {
                    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_13, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitSevenKeyword_1_6_0());
                      				
                    }
                    // InternalTwoParametersTestLanguage.g:265:5: ( (lv_scenario_14_0= norm3_Scenario8 ) )
                    // InternalTwoParametersTestLanguage.g:266:6: (lv_scenario_14_0= norm3_Scenario8 )
                    {
                    // InternalTwoParametersTestLanguage.g:266:6: (lv_scenario_14_0= norm3_Scenario8 )
                    // InternalTwoParametersTestLanguage.g:267:7: lv_scenario_14_0= norm3_Scenario8
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario8ParserRuleCall_1_6_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_scenario_14_0=norm3_Scenario8();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
                      							}
                      							set(
                      								current,
                      								"scenario",
                      								lv_scenario_14_0,
                      								"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.Scenario8");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalTwoParametersTestLanguage.g:286:4: (otherlv_15= '#8' ( (lv_scenario_16_0= norm2_Scenario8 ) ) )
                    {
                    // InternalTwoParametersTestLanguage.g:286:4: (otherlv_15= '#8' ( (lv_scenario_16_0= norm2_Scenario8 ) ) )
                    // InternalTwoParametersTestLanguage.g:287:5: otherlv_15= '#8' ( (lv_scenario_16_0= norm2_Scenario8 ) )
                    {
                    otherlv_15=(Token)match(input,18,FollowSets000.FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_15, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitEightKeyword_1_7_0());
                      				
                    }
                    // InternalTwoParametersTestLanguage.g:291:5: ( (lv_scenario_16_0= norm2_Scenario8 ) )
                    // InternalTwoParametersTestLanguage.g:292:6: (lv_scenario_16_0= norm2_Scenario8 )
                    {
                    // InternalTwoParametersTestLanguage.g:292:6: (lv_scenario_16_0= norm2_Scenario8 )
                    // InternalTwoParametersTestLanguage.g:293:7: lv_scenario_16_0= norm2_Scenario8
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario8ParserRuleCall_1_7_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_scenario_16_0=norm2_Scenario8();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
                      							}
                      							set(
                      								current,
                      								"scenario",
                      								lv_scenario_16_0,
                      								"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.Scenario8");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalTwoParametersTestLanguage.g:312:4: (otherlv_17= '#9' ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_18_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_19_0= norm3_Scenario7 ) ) (otherlv_20= 'trailing' )? ) ) )
                    {
                    // InternalTwoParametersTestLanguage.g:312:4: (otherlv_17= '#9' ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_18_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_19_0= norm3_Scenario7 ) ) (otherlv_20= 'trailing' )? ) ) )
                    // InternalTwoParametersTestLanguage.g:313:5: otherlv_17= '#9' ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_18_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_19_0= norm3_Scenario7 ) ) (otherlv_20= 'trailing' )? ) )
                    {
                    otherlv_17=(Token)match(input,19,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_17, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitNineKeyword_1_8_0());
                      				
                    }
                    // InternalTwoParametersTestLanguage.g:317:5: ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_18_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_19_0= norm3_Scenario7 ) ) (otherlv_20= 'trailing' )? ) )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==31) ) {
                        int LA2_1 = input.LA(2);

                        if ( (LA2_1==EOF||LA2_1==20) ) {
                            alt2=2;
                        }
                        else if ( (LA2_1==27) && (synpred3_InternalTwoParametersTestLanguage())) {
                            alt2=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA2_0==RULE_ID) ) {
                        int LA2_2 = input.LA(2);

                        if ( (LA2_2==EOF||LA2_2==20) ) {
                            alt2=2;
                        }
                        else if ( (LA2_2==27) && (synpred3_InternalTwoParametersTestLanguage())) {
                            alt2=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalTwoParametersTestLanguage.g:318:6: ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_18_0= norm3_Scenario9 ) )
                            {
                            // InternalTwoParametersTestLanguage.g:318:6: ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_18_0= norm3_Scenario9 ) )
                            // InternalTwoParametersTestLanguage.g:319:7: ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_18_0= norm3_Scenario9 )
                            {
                            // InternalTwoParametersTestLanguage.g:323:7: (lv_scenario_18_0= norm3_Scenario9 )
                            // InternalTwoParametersTestLanguage.g:324:8: lv_scenario_18_0= norm3_Scenario9
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario9ParserRuleCall_1_8_1_0_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_scenario_18_0=norm3_Scenario9();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
                              								}
                              								set(
                              									current,
                              									"scenario",
                              									lv_scenario_18_0,
                              									"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.Scenario9");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalTwoParametersTestLanguage.g:342:6: ( ( (lv_scenario_19_0= norm3_Scenario7 ) ) (otherlv_20= 'trailing' )? )
                            {
                            // InternalTwoParametersTestLanguage.g:342:6: ( ( (lv_scenario_19_0= norm3_Scenario7 ) ) (otherlv_20= 'trailing' )? )
                            // InternalTwoParametersTestLanguage.g:343:7: ( (lv_scenario_19_0= norm3_Scenario7 ) ) (otherlv_20= 'trailing' )?
                            {
                            // InternalTwoParametersTestLanguage.g:343:7: ( (lv_scenario_19_0= norm3_Scenario7 ) )
                            // InternalTwoParametersTestLanguage.g:344:8: (lv_scenario_19_0= norm3_Scenario7 )
                            {
                            // InternalTwoParametersTestLanguage.g:344:8: (lv_scenario_19_0= norm3_Scenario7 )
                            // InternalTwoParametersTestLanguage.g:345:9: lv_scenario_19_0= norm3_Scenario7
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario7ParserRuleCall_1_8_1_1_0_0());
                              								
                            }
                            pushFollow(FollowSets000.FOLLOW_7);
                            lv_scenario_19_0=norm3_Scenario7();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
                              									}
                              									set(
                              										current,
                              										"scenario",
                              										lv_scenario_19_0,
                              										"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.Scenario7");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            // InternalTwoParametersTestLanguage.g:362:7: (otherlv_20= 'trailing' )?
                            int alt1=2;
                            int LA1_0 = input.LA(1);

                            if ( (LA1_0==20) ) {
                                alt1=1;
                            }
                            switch (alt1) {
                                case 1 :
                                    // InternalTwoParametersTestLanguage.g:363:8: otherlv_20= 'trailing'
                                    {
                                    otherlv_20=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(otherlv_20, grammarAccess.getParserRuleParametersAccess().getTrailingKeyword_1_8_1_1_1());
                                      							
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalTwoParametersTestLanguage.g:372:4: (otherlv_21= '#10' ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_22_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_23_0= ruleScenario7 ) ) (otherlv_24= 'trailing' )? ) ) )
                    {
                    // InternalTwoParametersTestLanguage.g:372:4: (otherlv_21= '#10' ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_22_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_23_0= ruleScenario7 ) ) (otherlv_24= 'trailing' )? ) ) )
                    // InternalTwoParametersTestLanguage.g:373:5: otherlv_21= '#10' ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_22_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_23_0= ruleScenario7 ) ) (otherlv_24= 'trailing' )? ) )
                    {
                    otherlv_21=(Token)match(input,21,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_21, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitOneDigitZeroKeyword_1_9_0());
                      				
                    }
                    // InternalTwoParametersTestLanguage.g:377:5: ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_22_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_23_0= ruleScenario7 ) ) (otherlv_24= 'trailing' )? ) )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==31) && (synpred4_InternalTwoParametersTestLanguage())) {
                        alt4=1;
                    }
                    else if ( (LA4_0==RULE_ID) ) {
                        int LA4_2 = input.LA(2);

                        if ( (LA4_2==EOF||LA4_2==20) ) {
                            alt4=2;
                        }
                        else if ( (LA4_2==27) && (synpred4_InternalTwoParametersTestLanguage())) {
                            alt4=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 2, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalTwoParametersTestLanguage.g:378:6: ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_22_0= norm3_Scenario9 ) )
                            {
                            // InternalTwoParametersTestLanguage.g:378:6: ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_22_0= norm3_Scenario9 ) )
                            // InternalTwoParametersTestLanguage.g:379:7: ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_22_0= norm3_Scenario9 )
                            {
                            // InternalTwoParametersTestLanguage.g:383:7: (lv_scenario_22_0= norm3_Scenario9 )
                            // InternalTwoParametersTestLanguage.g:384:8: lv_scenario_22_0= norm3_Scenario9
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario9ParserRuleCall_1_9_1_0_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_scenario_22_0=norm3_Scenario9();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
                              								}
                              								set(
                              									current,
                              									"scenario",
                              									lv_scenario_22_0,
                              									"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.Scenario9");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalTwoParametersTestLanguage.g:402:6: ( ( (lv_scenario_23_0= ruleScenario7 ) ) (otherlv_24= 'trailing' )? )
                            {
                            // InternalTwoParametersTestLanguage.g:402:6: ( ( (lv_scenario_23_0= ruleScenario7 ) ) (otherlv_24= 'trailing' )? )
                            // InternalTwoParametersTestLanguage.g:403:7: ( (lv_scenario_23_0= ruleScenario7 ) ) (otherlv_24= 'trailing' )?
                            {
                            // InternalTwoParametersTestLanguage.g:403:7: ( (lv_scenario_23_0= ruleScenario7 ) )
                            // InternalTwoParametersTestLanguage.g:404:8: (lv_scenario_23_0= ruleScenario7 )
                            {
                            // InternalTwoParametersTestLanguage.g:404:8: (lv_scenario_23_0= ruleScenario7 )
                            // InternalTwoParametersTestLanguage.g:405:9: lv_scenario_23_0= ruleScenario7
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario7ParserRuleCall_1_9_1_1_0_0());
                              								
                            }
                            pushFollow(FollowSets000.FOLLOW_7);
                            lv_scenario_23_0=ruleScenario7();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
                              									}
                              									set(
                              										current,
                              										"scenario",
                              										lv_scenario_23_0,
                              										"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.Scenario7");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            // InternalTwoParametersTestLanguage.g:422:7: (otherlv_24= 'trailing' )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( (LA3_0==20) ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // InternalTwoParametersTestLanguage.g:423:8: otherlv_24= 'trailing'
                                    {
                                    otherlv_24=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(otherlv_24, grammarAccess.getParserRuleParametersAccess().getTrailingKeyword_1_9_1_1_1());
                                      							
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalTwoParametersTestLanguage.g:432:4: (otherlv_25= '#11' ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_26_0= ruleScenario9 ) ) | ( ( (lv_scenario_27_0= norm3_Scenario7 ) ) (otherlv_28= 'trailing' )? ) ) )
                    {
                    // InternalTwoParametersTestLanguage.g:432:4: (otherlv_25= '#11' ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_26_0= ruleScenario9 ) ) | ( ( (lv_scenario_27_0= norm3_Scenario7 ) ) (otherlv_28= 'trailing' )? ) ) )
                    // InternalTwoParametersTestLanguage.g:433:5: otherlv_25= '#11' ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_26_0= ruleScenario9 ) ) | ( ( (lv_scenario_27_0= norm3_Scenario7 ) ) (otherlv_28= 'trailing' )? ) )
                    {
                    otherlv_25=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_25, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitOneDigitOneKeyword_1_10_0());
                      				
                    }
                    // InternalTwoParametersTestLanguage.g:437:5: ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_26_0= ruleScenario9 ) ) | ( ( (lv_scenario_27_0= norm3_Scenario7 ) ) (otherlv_28= 'trailing' )? ) )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ID) ) {
                        int LA6_1 = input.LA(2);

                        if ( (LA6_1==27) && (synpred5_InternalTwoParametersTestLanguage())) {
                            alt6=1;
                        }
                        else if ( (LA6_1==EOF||LA6_1==20) ) {
                            alt6=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 1, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA6_0==31) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalTwoParametersTestLanguage.g:438:6: ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_26_0= ruleScenario9 ) )
                            {
                            // InternalTwoParametersTestLanguage.g:438:6: ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_26_0= ruleScenario9 ) )
                            // InternalTwoParametersTestLanguage.g:439:7: ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_26_0= ruleScenario9 )
                            {
                            // InternalTwoParametersTestLanguage.g:443:7: (lv_scenario_26_0= ruleScenario9 )
                            // InternalTwoParametersTestLanguage.g:444:8: lv_scenario_26_0= ruleScenario9
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario9ParserRuleCall_1_10_1_0_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_scenario_26_0=ruleScenario9();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
                              								}
                              								set(
                              									current,
                              									"scenario",
                              									lv_scenario_26_0,
                              									"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.Scenario9");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalTwoParametersTestLanguage.g:462:6: ( ( (lv_scenario_27_0= norm3_Scenario7 ) ) (otherlv_28= 'trailing' )? )
                            {
                            // InternalTwoParametersTestLanguage.g:462:6: ( ( (lv_scenario_27_0= norm3_Scenario7 ) ) (otherlv_28= 'trailing' )? )
                            // InternalTwoParametersTestLanguage.g:463:7: ( (lv_scenario_27_0= norm3_Scenario7 ) ) (otherlv_28= 'trailing' )?
                            {
                            // InternalTwoParametersTestLanguage.g:463:7: ( (lv_scenario_27_0= norm3_Scenario7 ) )
                            // InternalTwoParametersTestLanguage.g:464:8: (lv_scenario_27_0= norm3_Scenario7 )
                            {
                            // InternalTwoParametersTestLanguage.g:464:8: (lv_scenario_27_0= norm3_Scenario7 )
                            // InternalTwoParametersTestLanguage.g:465:9: lv_scenario_27_0= norm3_Scenario7
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario7ParserRuleCall_1_10_1_1_0_0());
                              								
                            }
                            pushFollow(FollowSets000.FOLLOW_7);
                            lv_scenario_27_0=norm3_Scenario7();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
                              									}
                              									set(
                              										current,
                              										"scenario",
                              										lv_scenario_27_0,
                              										"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.Scenario7");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            // InternalTwoParametersTestLanguage.g:482:7: (otherlv_28= 'trailing' )?
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0==20) ) {
                                alt5=1;
                            }
                            switch (alt5) {
                                case 1 :
                                    // InternalTwoParametersTestLanguage.g:483:8: otherlv_28= 'trailing'
                                    {
                                    otherlv_28=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(otherlv_28, grammarAccess.getParserRuleParametersAccess().getTrailingKeyword_1_10_1_1_1());
                                      							
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalTwoParametersTestLanguage.g:492:4: (otherlv_29= '#12' ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_30_0= ruleScenario9 ) ) | ( ( (lv_scenario_31_0= ruleScenario7 ) ) (otherlv_32= 'trailing' )? ) ) )
                    {
                    // InternalTwoParametersTestLanguage.g:492:4: (otherlv_29= '#12' ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_30_0= ruleScenario9 ) ) | ( ( (lv_scenario_31_0= ruleScenario7 ) ) (otherlv_32= 'trailing' )? ) ) )
                    // InternalTwoParametersTestLanguage.g:493:5: otherlv_29= '#12' ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_30_0= ruleScenario9 ) ) | ( ( (lv_scenario_31_0= ruleScenario7 ) ) (otherlv_32= 'trailing' )? ) )
                    {
                    otherlv_29=(Token)match(input,23,FollowSets000.FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_29, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitOneDigitTwoKeyword_1_11_0());
                      				
                    }
                    // InternalTwoParametersTestLanguage.g:497:5: ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_30_0= ruleScenario9 ) ) | ( ( (lv_scenario_31_0= ruleScenario7 ) ) (otherlv_32= 'trailing' )? ) )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID) ) {
                        int LA8_1 = input.LA(2);

                        if ( (LA8_1==27) && (synpred6_InternalTwoParametersTestLanguage())) {
                            alt8=1;
                        }
                        else if ( (LA8_1==EOF||LA8_1==20) ) {
                            alt8=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalTwoParametersTestLanguage.g:498:6: ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_30_0= ruleScenario9 ) )
                            {
                            // InternalTwoParametersTestLanguage.g:498:6: ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_30_0= ruleScenario9 ) )
                            // InternalTwoParametersTestLanguage.g:499:7: ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_30_0= ruleScenario9 )
                            {
                            // InternalTwoParametersTestLanguage.g:503:7: (lv_scenario_30_0= ruleScenario9 )
                            // InternalTwoParametersTestLanguage.g:504:8: lv_scenario_30_0= ruleScenario9
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario9ParserRuleCall_1_11_1_0_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_scenario_30_0=ruleScenario9();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
                              								}
                              								set(
                              									current,
                              									"scenario",
                              									lv_scenario_30_0,
                              									"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.Scenario9");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalTwoParametersTestLanguage.g:522:6: ( ( (lv_scenario_31_0= ruleScenario7 ) ) (otherlv_32= 'trailing' )? )
                            {
                            // InternalTwoParametersTestLanguage.g:522:6: ( ( (lv_scenario_31_0= ruleScenario7 ) ) (otherlv_32= 'trailing' )? )
                            // InternalTwoParametersTestLanguage.g:523:7: ( (lv_scenario_31_0= ruleScenario7 ) ) (otherlv_32= 'trailing' )?
                            {
                            // InternalTwoParametersTestLanguage.g:523:7: ( (lv_scenario_31_0= ruleScenario7 ) )
                            // InternalTwoParametersTestLanguage.g:524:8: (lv_scenario_31_0= ruleScenario7 )
                            {
                            // InternalTwoParametersTestLanguage.g:524:8: (lv_scenario_31_0= ruleScenario7 )
                            // InternalTwoParametersTestLanguage.g:525:9: lv_scenario_31_0= ruleScenario7
                            {
                            if ( state.backtracking==0 ) {

                              									newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario7ParserRuleCall_1_11_1_1_0_0());
                              								
                            }
                            pushFollow(FollowSets000.FOLLOW_7);
                            lv_scenario_31_0=ruleScenario7();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              									if (current==null) {
                              										current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
                              									}
                              									set(
                              										current,
                              										"scenario",
                              										lv_scenario_31_0,
                              										"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.Scenario7");
                              									afterParserOrEnumRuleCall();
                              								
                            }

                            }


                            }

                            // InternalTwoParametersTestLanguage.g:542:7: (otherlv_32= 'trailing' )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0==20) ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // InternalTwoParametersTestLanguage.g:543:8: otherlv_32= 'trailing'
                                    {
                                    otherlv_32=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      								newLeafNode(otherlv_32, grammarAccess.getParserRuleParametersAccess().getTrailingKeyword_1_11_1_1_1());
                                      							
                                    }

                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 13 :
                    // InternalTwoParametersTestLanguage.g:552:4: (otherlv_33= '#13' ( (lv_scenario_34_0= norm1_Scenario10 ) ) )
                    {
                    // InternalTwoParametersTestLanguage.g:552:4: (otherlv_33= '#13' ( (lv_scenario_34_0= norm1_Scenario10 ) ) )
                    // InternalTwoParametersTestLanguage.g:553:5: otherlv_33= '#13' ( (lv_scenario_34_0= norm1_Scenario10 ) )
                    {
                    otherlv_33=(Token)match(input,24,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_33, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitOneDigitThreeKeyword_1_12_0());
                      				
                    }
                    // InternalTwoParametersTestLanguage.g:557:5: ( (lv_scenario_34_0= norm1_Scenario10 ) )
                    // InternalTwoParametersTestLanguage.g:558:6: (lv_scenario_34_0= norm1_Scenario10 )
                    {
                    // InternalTwoParametersTestLanguage.g:558:6: (lv_scenario_34_0= norm1_Scenario10 )
                    // InternalTwoParametersTestLanguage.g:559:7: lv_scenario_34_0= norm1_Scenario10
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario10ParserRuleCall_1_12_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_scenario_34_0=norm1_Scenario10();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
                      							}
                      							set(
                      								current,
                      								"scenario",
                      								lv_scenario_34_0,
                      								"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.Scenario10");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;
                case 14 :
                    // InternalTwoParametersTestLanguage.g:578:4: (otherlv_35= '#14' ( (lv_scenario_36_0= norm3_Scenario10 ) ) )
                    {
                    // InternalTwoParametersTestLanguage.g:578:4: (otherlv_35= '#14' ( (lv_scenario_36_0= norm3_Scenario10 ) ) )
                    // InternalTwoParametersTestLanguage.g:579:5: otherlv_35= '#14' ( (lv_scenario_36_0= norm3_Scenario10 ) )
                    {
                    otherlv_35=(Token)match(input,25,FollowSets000.FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_35, grammarAccess.getParserRuleParametersAccess().getNumberSignDigitOneDigitFourKeyword_1_13_0());
                      				
                    }
                    // InternalTwoParametersTestLanguage.g:583:5: ( (lv_scenario_36_0= norm3_Scenario10 ) )
                    // InternalTwoParametersTestLanguage.g:584:6: (lv_scenario_36_0= norm3_Scenario10 )
                    {
                    // InternalTwoParametersTestLanguage.g:584:6: (lv_scenario_36_0= norm3_Scenario10 )
                    // InternalTwoParametersTestLanguage.g:585:7: lv_scenario_36_0= norm3_Scenario10
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getParserRuleParametersAccess().getScenarioScenario10ParserRuleCall_1_13_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_scenario_36_0=norm3_Scenario10();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getParserRuleParametersRule());
                      							}
                      							set(
                      								current,
                      								"scenario",
                      								lv_scenario_36_0,
                      								"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.Scenario10");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


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
    // $ANTLR end "ruleParserRuleParameters"


    // $ANTLR start "entryRuleScenario6"
    // InternalTwoParametersTestLanguage.g:608:1: entryRuleScenario6 returns [EObject current=null] : iv_ruleScenario6= ruleScenario6 EOF ;
    public final EObject entryRuleScenario6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario6 = null;


        try {
            // InternalTwoParametersTestLanguage.g:608:50: (iv_ruleScenario6= ruleScenario6 EOF )
            // InternalTwoParametersTestLanguage.g:609:2: iv_ruleScenario6= ruleScenario6 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScenario6Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario6=ruleScenario6();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScenario6; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScenario6"


    // $ANTLR start "ruleScenario6"
    // InternalTwoParametersTestLanguage.g:615:1: ruleScenario6 returns [EObject current=null] : ( (lv_second_0_0= RULE_ID ) ) ;
    public final EObject ruleScenario6() throws RecognitionException {
        EObject current = null;

        Token lv_second_0_0=null;

        try {
            // InternalTwoParametersTestLanguage.g:616:1: ( ( (lv_second_0_0= RULE_ID ) ) )
            // InternalTwoParametersTestLanguage.g:617:2: ( (lv_second_0_0= RULE_ID ) )
            {
            // InternalTwoParametersTestLanguage.g:617:2: ( (lv_second_0_0= RULE_ID ) )
            // InternalTwoParametersTestLanguage.g:618:3: (lv_second_0_0= RULE_ID )
            {
            // InternalTwoParametersTestLanguage.g:618:3: (lv_second_0_0= RULE_ID )
            // InternalTwoParametersTestLanguage.g:619:4: lv_second_0_0= RULE_ID
            {
            lv_second_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_second_0_0, grammarAccess.getScenario6Access().getSecondIDTerminalRuleCall_1_0_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getScenario6Rule());
              				}
              				setWithLastConsumed(
              					current,
              					"second",
              					lv_second_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


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
    // $ANTLR end "ruleScenario6"


    // $ANTLR start "norm3_Scenario6"
    // InternalTwoParametersTestLanguage.g:639:1: norm3_Scenario6 returns [EObject current=null] : ( (lv_first_0_0= RULE_ID ) ) ;
    public final EObject norm3_Scenario6() throws RecognitionException {
        EObject current = null;

        Token lv_first_0_0=null;

        try {
            // InternalTwoParametersTestLanguage.g:640:1: ( ( (lv_first_0_0= RULE_ID ) ) )
            // InternalTwoParametersTestLanguage.g:641:2: ( (lv_first_0_0= RULE_ID ) )
            {
            // InternalTwoParametersTestLanguage.g:641:2: ( (lv_first_0_0= RULE_ID ) )
            // InternalTwoParametersTestLanguage.g:642:3: (lv_first_0_0= RULE_ID )
            {
            // InternalTwoParametersTestLanguage.g:642:3: (lv_first_0_0= RULE_ID )
            // InternalTwoParametersTestLanguage.g:643:4: lv_first_0_0= RULE_ID
            {
            lv_first_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_first_0_0, grammarAccess.getScenario6Access().getFirstIDTerminalRuleCall_0_0_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getScenario6Rule());
              				}
              				setWithLastConsumed(
              					current,
              					"first",
              					lv_first_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


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
    // $ANTLR end "norm3_Scenario6"


    // $ANTLR start "entryRuleScenario7"
    // InternalTwoParametersTestLanguage.g:662:1: entryRuleScenario7 returns [EObject current=null] : iv_ruleScenario7= ruleScenario7 EOF ;
    public final EObject entryRuleScenario7() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario7 = null;


        try {
            // InternalTwoParametersTestLanguage.g:662:50: (iv_ruleScenario7= ruleScenario7 EOF )
            // InternalTwoParametersTestLanguage.g:663:2: iv_ruleScenario7= ruleScenario7 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScenario7Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario7=ruleScenario7();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScenario7; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScenario7"


    // $ANTLR start "ruleScenario7"
    // InternalTwoParametersTestLanguage.g:669:1: ruleScenario7 returns [EObject current=null] : ( (lv_first_0_0= ruleIdOrKeyword2 ) ) ;
    public final EObject ruleScenario7() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_first_0_0 = null;


        try {
            // InternalTwoParametersTestLanguage.g:670:1: ( ( (lv_first_0_0= ruleIdOrKeyword2 ) ) )
            // InternalTwoParametersTestLanguage.g:671:2: ( (lv_first_0_0= ruleIdOrKeyword2 ) )
            {
            // InternalTwoParametersTestLanguage.g:671:2: ( (lv_first_0_0= ruleIdOrKeyword2 ) )
            // InternalTwoParametersTestLanguage.g:672:3: (lv_first_0_0= ruleIdOrKeyword2 )
            {
            // InternalTwoParametersTestLanguage.g:672:3: (lv_first_0_0= ruleIdOrKeyword2 )
            // InternalTwoParametersTestLanguage.g:673:4: lv_first_0_0= ruleIdOrKeyword2
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getScenario7Access().getFirstIdOrKeyword2ParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_first_0_0=ruleIdOrKeyword2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getScenario7Rule());
              				}
              				set(
              					current,
              					"first",
              					lv_first_0_0,
              					"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.IdOrKeyword2");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


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
    // $ANTLR end "ruleScenario7"


    // $ANTLR start "norm2_Scenario7"
    // InternalTwoParametersTestLanguage.g:694:1: norm2_Scenario7 returns [EObject current=null] : ( (lv_first_0_0= norm2_IdOrKeyword2 ) ) ;
    public final EObject norm2_Scenario7() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_first_0_0 = null;


        try {
            // InternalTwoParametersTestLanguage.g:695:1: ( ( (lv_first_0_0= norm2_IdOrKeyword2 ) ) )
            // InternalTwoParametersTestLanguage.g:696:2: ( (lv_first_0_0= norm2_IdOrKeyword2 ) )
            {
            // InternalTwoParametersTestLanguage.g:696:2: ( (lv_first_0_0= norm2_IdOrKeyword2 ) )
            // InternalTwoParametersTestLanguage.g:697:3: (lv_first_0_0= norm2_IdOrKeyword2 )
            {
            // InternalTwoParametersTestLanguage.g:697:3: (lv_first_0_0= norm2_IdOrKeyword2 )
            // InternalTwoParametersTestLanguage.g:698:4: lv_first_0_0= norm2_IdOrKeyword2
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getScenario7Access().getFirstIdOrKeyword2ParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_first_0_0=norm2_IdOrKeyword2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getScenario7Rule());
              				}
              				set(
              					current,
              					"first",
              					lv_first_0_0,
              					"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.IdOrKeyword2");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


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
    // $ANTLR end "norm2_Scenario7"


    // $ANTLR start "norm3_Scenario7"
    // InternalTwoParametersTestLanguage.g:719:1: norm3_Scenario7 returns [EObject current=null] : ( (lv_first_0_0= norm7_IdOrKeyword2 ) ) ;
    public final EObject norm3_Scenario7() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_first_0_0 = null;


        try {
            // InternalTwoParametersTestLanguage.g:720:1: ( ( (lv_first_0_0= norm7_IdOrKeyword2 ) ) )
            // InternalTwoParametersTestLanguage.g:721:2: ( (lv_first_0_0= norm7_IdOrKeyword2 ) )
            {
            // InternalTwoParametersTestLanguage.g:721:2: ( (lv_first_0_0= norm7_IdOrKeyword2 ) )
            // InternalTwoParametersTestLanguage.g:722:3: (lv_first_0_0= norm7_IdOrKeyword2 )
            {
            // InternalTwoParametersTestLanguage.g:722:3: (lv_first_0_0= norm7_IdOrKeyword2 )
            // InternalTwoParametersTestLanguage.g:723:4: lv_first_0_0= norm7_IdOrKeyword2
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getScenario7Access().getFirstIdOrKeyword2ParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_first_0_0=norm7_IdOrKeyword2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getScenario7Rule());
              				}
              				set(
              					current,
              					"first",
              					lv_first_0_0,
              					"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.IdOrKeyword2");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


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
    // $ANTLR end "norm3_Scenario7"


    // $ANTLR start "norm2_Scenario8"
    // InternalTwoParametersTestLanguage.g:744:1: norm2_Scenario8 returns [EObject current=null] : ( ( ( ( norm2_IdOrKeyword2 ) )=> (lv_first_0_0= norm2_IdOrKeyword2 ) ) | ( (lv_second_1_0= 'scenario3' ) ) ) ;
    public final EObject norm2_Scenario8() throws RecognitionException {
        EObject current = null;

        Token lv_second_1_0=null;
        AntlrDatatypeRuleToken lv_first_0_0 = null;


        try {
            // InternalTwoParametersTestLanguage.g:745:1: ( ( ( ( ( norm2_IdOrKeyword2 ) )=> (lv_first_0_0= norm2_IdOrKeyword2 ) ) | ( (lv_second_1_0= 'scenario3' ) ) ) )
            // InternalTwoParametersTestLanguage.g:746:2: ( ( ( ( norm2_IdOrKeyword2 ) )=> (lv_first_0_0= norm2_IdOrKeyword2 ) ) | ( (lv_second_1_0= 'scenario3' ) ) )
            {
            // InternalTwoParametersTestLanguage.g:746:2: ( ( ( ( norm2_IdOrKeyword2 ) )=> (lv_first_0_0= norm2_IdOrKeyword2 ) ) | ( (lv_second_1_0= 'scenario3' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) && (synpred7_InternalTwoParametersTestLanguage())) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTwoParametersTestLanguage.g:747:3: ( ( ( norm2_IdOrKeyword2 ) )=> (lv_first_0_0= norm2_IdOrKeyword2 ) )
                    {
                    // InternalTwoParametersTestLanguage.g:747:3: ( ( ( norm2_IdOrKeyword2 ) )=> (lv_first_0_0= norm2_IdOrKeyword2 ) )
                    // InternalTwoParametersTestLanguage.g:748:4: ( ( norm2_IdOrKeyword2 ) )=> (lv_first_0_0= norm2_IdOrKeyword2 )
                    {
                    // InternalTwoParametersTestLanguage.g:752:4: (lv_first_0_0= norm2_IdOrKeyword2 )
                    // InternalTwoParametersTestLanguage.g:753:5: lv_first_0_0= norm2_IdOrKeyword2
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getScenario8Access().getFirstIdOrKeyword2ParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_first_0_0=norm2_IdOrKeyword2();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getScenario8Rule());
                      					}
                      					set(
                      						current,
                      						"first",
                      						lv_first_0_0,
                      						"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.IdOrKeyword2");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTwoParametersTestLanguage.g:771:3: ( (lv_second_1_0= 'scenario3' ) )
                    {
                    // InternalTwoParametersTestLanguage.g:771:3: ( (lv_second_1_0= 'scenario3' ) )
                    // InternalTwoParametersTestLanguage.g:772:4: (lv_second_1_0= 'scenario3' )
                    {
                    // InternalTwoParametersTestLanguage.g:772:4: (lv_second_1_0= 'scenario3' )
                    // InternalTwoParametersTestLanguage.g:773:5: lv_second_1_0= 'scenario3'
                    {
                    lv_second_1_0=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_second_1_0, grammarAccess.getScenario8Access().getSecondScenario3Keyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getScenario8Rule());
                      					}
                      					setWithLastConsumed(current, "second", lv_second_1_0, "scenario3");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "norm2_Scenario8"


    // $ANTLR start "norm3_Scenario8"
    // InternalTwoParametersTestLanguage.g:790:1: norm3_Scenario8 returns [EObject current=null] : ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_first_0_0= norm7_IdOrKeyword2 ) ) | ( (lv_second_1_0= 'scenario3' ) ) ) ;
    public final EObject norm3_Scenario8() throws RecognitionException {
        EObject current = null;

        Token lv_second_1_0=null;
        AntlrDatatypeRuleToken lv_first_0_0 = null;


        try {
            // InternalTwoParametersTestLanguage.g:791:1: ( ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_first_0_0= norm7_IdOrKeyword2 ) ) | ( (lv_second_1_0= 'scenario3' ) ) ) )
            // InternalTwoParametersTestLanguage.g:792:2: ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_first_0_0= norm7_IdOrKeyword2 ) ) | ( (lv_second_1_0= 'scenario3' ) ) )
            {
            // InternalTwoParametersTestLanguage.g:792:2: ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_first_0_0= norm7_IdOrKeyword2 ) ) | ( (lv_second_1_0= 'scenario3' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) && (synpred8_InternalTwoParametersTestLanguage())) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) && (synpred8_InternalTwoParametersTestLanguage())) {
                alt11=1;
            }
            else if ( (LA11_0==26) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalTwoParametersTestLanguage.g:793:3: ( ( ( norm7_IdOrKeyword2 ) )=> (lv_first_0_0= norm7_IdOrKeyword2 ) )
                    {
                    // InternalTwoParametersTestLanguage.g:793:3: ( ( ( norm7_IdOrKeyword2 ) )=> (lv_first_0_0= norm7_IdOrKeyword2 ) )
                    // InternalTwoParametersTestLanguage.g:794:4: ( ( norm7_IdOrKeyword2 ) )=> (lv_first_0_0= norm7_IdOrKeyword2 )
                    {
                    // InternalTwoParametersTestLanguage.g:798:4: (lv_first_0_0= norm7_IdOrKeyword2 )
                    // InternalTwoParametersTestLanguage.g:799:5: lv_first_0_0= norm7_IdOrKeyword2
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getScenario8Access().getFirstIdOrKeyword2ParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_first_0_0=norm7_IdOrKeyword2();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getScenario8Rule());
                      					}
                      					set(
                      						current,
                      						"first",
                      						lv_first_0_0,
                      						"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.IdOrKeyword2");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTwoParametersTestLanguage.g:817:3: ( (lv_second_1_0= 'scenario3' ) )
                    {
                    // InternalTwoParametersTestLanguage.g:817:3: ( (lv_second_1_0= 'scenario3' ) )
                    // InternalTwoParametersTestLanguage.g:818:4: (lv_second_1_0= 'scenario3' )
                    {
                    // InternalTwoParametersTestLanguage.g:818:4: (lv_second_1_0= 'scenario3' )
                    // InternalTwoParametersTestLanguage.g:819:5: lv_second_1_0= 'scenario3'
                    {
                    lv_second_1_0=(Token)match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_second_1_0, grammarAccess.getScenario8Access().getSecondScenario3Keyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getScenario8Rule());
                      					}
                      					setWithLastConsumed(current, "second", lv_second_1_0, "scenario3");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "norm3_Scenario8"


    // $ANTLR start "entryRuleScenario9"
    // InternalTwoParametersTestLanguage.g:835:1: entryRuleScenario9 returns [EObject current=null] : iv_ruleScenario9= ruleScenario9 EOF ;
    public final EObject entryRuleScenario9() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario9 = null;


        try {
            // InternalTwoParametersTestLanguage.g:835:50: (iv_ruleScenario9= ruleScenario9 EOF )
            // InternalTwoParametersTestLanguage.g:836:2: iv_ruleScenario9= ruleScenario9 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScenario9Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario9=ruleScenario9();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScenario9; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleScenario9"


    // $ANTLR start "ruleScenario9"
    // InternalTwoParametersTestLanguage.g:842:1: ruleScenario9 returns [EObject current=null] : ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_second_0_0= ruleIdOrKeyword2 ) ) otherlv_1= 'scenario4' ) ;
    public final EObject ruleScenario9() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_second_0_0 = null;


        try {
            // InternalTwoParametersTestLanguage.g:843:1: ( ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_second_0_0= ruleIdOrKeyword2 ) ) otherlv_1= 'scenario4' ) )
            // InternalTwoParametersTestLanguage.g:844:2: ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_second_0_0= ruleIdOrKeyword2 ) ) otherlv_1= 'scenario4' )
            {
            // InternalTwoParametersTestLanguage.g:844:2: ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_second_0_0= ruleIdOrKeyword2 ) ) otherlv_1= 'scenario4' )
            // InternalTwoParametersTestLanguage.g:845:3: ( ( ( ruleIdOrKeyword2 ) )=> (lv_second_0_0= ruleIdOrKeyword2 ) ) otherlv_1= 'scenario4'
            {
            // InternalTwoParametersTestLanguage.g:845:3: ( ( ( ruleIdOrKeyword2 ) )=> (lv_second_0_0= ruleIdOrKeyword2 ) )
            // InternalTwoParametersTestLanguage.g:846:4: ( ( ruleIdOrKeyword2 ) )=> (lv_second_0_0= ruleIdOrKeyword2 )
            {
            // InternalTwoParametersTestLanguage.g:850:4: (lv_second_0_0= ruleIdOrKeyword2 )
            // InternalTwoParametersTestLanguage.g:851:5: lv_second_0_0= ruleIdOrKeyword2
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getScenario9Access().getSecondIdOrKeyword2ParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_second_0_0=ruleIdOrKeyword2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getScenario9Rule());
              					}
              					set(
              						current,
              						"second",
              						lv_second_0_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.IdOrKeyword2");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getScenario9Access().getScenario4Keyword_1());
              		
            }

            }


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
    // $ANTLR end "ruleScenario9"


    // $ANTLR start "norm3_Scenario9"
    // InternalTwoParametersTestLanguage.g:877:1: norm3_Scenario9 returns [EObject current=null] : ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_second_0_0= norm7_IdOrKeyword2 ) ) otherlv_1= 'scenario4' ) ;
    public final EObject norm3_Scenario9() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_second_0_0 = null;


        try {
            // InternalTwoParametersTestLanguage.g:878:1: ( ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_second_0_0= norm7_IdOrKeyword2 ) ) otherlv_1= 'scenario4' ) )
            // InternalTwoParametersTestLanguage.g:879:2: ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_second_0_0= norm7_IdOrKeyword2 ) ) otherlv_1= 'scenario4' )
            {
            // InternalTwoParametersTestLanguage.g:879:2: ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_second_0_0= norm7_IdOrKeyword2 ) ) otherlv_1= 'scenario4' )
            // InternalTwoParametersTestLanguage.g:880:3: ( ( ( norm7_IdOrKeyword2 ) )=> (lv_second_0_0= norm7_IdOrKeyword2 ) ) otherlv_1= 'scenario4'
            {
            // InternalTwoParametersTestLanguage.g:880:3: ( ( ( norm7_IdOrKeyword2 ) )=> (lv_second_0_0= norm7_IdOrKeyword2 ) )
            // InternalTwoParametersTestLanguage.g:881:4: ( ( norm7_IdOrKeyword2 ) )=> (lv_second_0_0= norm7_IdOrKeyword2 )
            {
            // InternalTwoParametersTestLanguage.g:885:4: (lv_second_0_0= norm7_IdOrKeyword2 )
            // InternalTwoParametersTestLanguage.g:886:5: lv_second_0_0= norm7_IdOrKeyword2
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getScenario9Access().getSecondIdOrKeyword2ParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_10);
            lv_second_0_0=norm7_IdOrKeyword2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getScenario9Rule());
              					}
              					set(
              						current,
              						"second",
              						lv_second_0_0,
              						"org.eclipse.xtext.ui.tests.editor.contentassist.TwoParametersTestLanguage.IdOrKeyword2");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getScenario9Access().getScenario4Keyword_1());
              		
            }

            }


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
    // $ANTLR end "norm3_Scenario9"


    // $ANTLR start "norm1_Scenario10"
    // InternalTwoParametersTestLanguage.g:912:1: norm1_Scenario10 returns [EObject current=null] : ( ( () otherlv_1= 'trailing' ) | ( () otherlv_3= 'scenario5' ( (lv_first_4_0= norm1_IdOrKeyword ) ) ( (lv_second_5_0= ruleIdOrKeyword ) ) ) | ( () otherlv_7= 'scenario5' otherlv_8= 'fragment' this_Scenario5Body_9= ruleScenario5Body[$current] otherlv_10= 'trailing' ) ) ;
    public final EObject norm1_Scenario10() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_first_4_0 = null;

        AntlrDatatypeRuleToken lv_second_5_0 = null;

        EObject this_Scenario5Body_9 = null;


        try {
            // InternalTwoParametersTestLanguage.g:913:1: ( ( ( () otherlv_1= 'trailing' ) | ( () otherlv_3= 'scenario5' ( (lv_first_4_0= norm1_IdOrKeyword ) ) ( (lv_second_5_0= ruleIdOrKeyword ) ) ) | ( () otherlv_7= 'scenario5' otherlv_8= 'fragment' this_Scenario5Body_9= ruleScenario5Body[$current] otherlv_10= 'trailing' ) ) )
            // InternalTwoParametersTestLanguage.g:914:2: ( ( () otherlv_1= 'trailing' ) | ( () otherlv_3= 'scenario5' ( (lv_first_4_0= norm1_IdOrKeyword ) ) ( (lv_second_5_0= ruleIdOrKeyword ) ) ) | ( () otherlv_7= 'scenario5' otherlv_8= 'fragment' this_Scenario5Body_9= ruleScenario5Body[$current] otherlv_10= 'trailing' ) )
            {
            // InternalTwoParametersTestLanguage.g:914:2: ( ( () otherlv_1= 'trailing' ) | ( () otherlv_3= 'scenario5' ( (lv_first_4_0= norm1_IdOrKeyword ) ) ( (lv_second_5_0= ruleIdOrKeyword ) ) ) | ( () otherlv_7= 'scenario5' otherlv_8= 'fragment' this_Scenario5Body_9= ruleScenario5Body[$current] otherlv_10= 'trailing' ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            else if ( (LA12_0==28) ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==29) ) {
                    alt12=3;
                }
                else if ( (LA12_2==RULE_ID||LA12_2==31) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalTwoParametersTestLanguage.g:915:3: ( () otherlv_1= 'trailing' )
                    {
                    // InternalTwoParametersTestLanguage.g:915:3: ( () otherlv_1= 'trailing' )
                    // InternalTwoParametersTestLanguage.g:916:4: () otherlv_1= 'trailing'
                    {
                    // InternalTwoParametersTestLanguage.g:916:4: ()
                    // InternalTwoParametersTestLanguage.g:917:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getScenario10Access().getScenarioAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getScenario10Access().getTrailingKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTwoParametersTestLanguage.g:929:3: ( () otherlv_3= 'scenario5' ( (lv_first_4_0= norm1_IdOrKeyword ) ) ( (lv_second_5_0= ruleIdOrKeyword ) ) )
                    {
                    // InternalTwoParametersTestLanguage.g:929:3: ( () otherlv_3= 'scenario5' ( (lv_first_4_0= norm1_IdOrKeyword ) ) ( (lv_second_5_0= ruleIdOrKeyword ) ) )
                    // InternalTwoParametersTestLanguage.g:930:4: () otherlv_3= 'scenario5' ( (lv_first_4_0= norm1_IdOrKeyword ) ) ( (lv_second_5_0= ruleIdOrKeyword ) )
                    {
                    // InternalTwoParametersTestLanguage.g:930:4: ()
                    // InternalTwoParametersTestLanguage.g:931:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getScenario10Access().getScenarioAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getScenario10Access().getScenario5Keyword_2_1());
                      			
                    }
                    // InternalTwoParametersTestLanguage.g:941:4: ( (lv_first_4_0= norm1_IdOrKeyword ) )
                    // InternalTwoParametersTestLanguage.g:942:5: (lv_first_4_0= norm1_IdOrKeyword )
                    {
                    // InternalTwoParametersTestLanguage.g:942:5: (lv_first_4_0= norm1_IdOrKeyword )
                    // InternalTwoParametersTestLanguage.g:943:6: lv_first_4_0= norm1_IdOrKeyword
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getScenario10Access().getFirstIdOrKeywordParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_3);
                    lv_first_4_0=norm1_IdOrKeyword();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getScenario10Rule());
                      						}
                      						set(
                      							current,
                      							"first",
                      							lv_first_4_0,
                      							"org.eclipse.xtext.ui.tests.editor.contentassist.ParametersTestLanguage.IdOrKeyword");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTwoParametersTestLanguage.g:960:4: ( (lv_second_5_0= ruleIdOrKeyword ) )
                    // InternalTwoParametersTestLanguage.g:961:5: (lv_second_5_0= ruleIdOrKeyword )
                    {
                    // InternalTwoParametersTestLanguage.g:961:5: (lv_second_5_0= ruleIdOrKeyword )
                    // InternalTwoParametersTestLanguage.g:962:6: lv_second_5_0= ruleIdOrKeyword
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getScenario10Access().getSecondIdOrKeywordParserRuleCall_2_4_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_second_5_0=ruleIdOrKeyword();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getScenario10Rule());
                      						}
                      						set(
                      							current,
                      							"second",
                      							lv_second_5_0,
                      							"org.eclipse.xtext.ui.tests.editor.contentassist.ParametersTestLanguage.IdOrKeyword");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTwoParametersTestLanguage.g:981:3: ( () otherlv_7= 'scenario5' otherlv_8= 'fragment' this_Scenario5Body_9= ruleScenario5Body[$current] otherlv_10= 'trailing' )
                    {
                    // InternalTwoParametersTestLanguage.g:981:3: ( () otherlv_7= 'scenario5' otherlv_8= 'fragment' this_Scenario5Body_9= ruleScenario5Body[$current] otherlv_10= 'trailing' )
                    // InternalTwoParametersTestLanguage.g:982:4: () otherlv_7= 'scenario5' otherlv_8= 'fragment' this_Scenario5Body_9= ruleScenario5Body[$current] otherlv_10= 'trailing'
                    {
                    // InternalTwoParametersTestLanguage.g:982:4: ()
                    // InternalTwoParametersTestLanguage.g:983:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getScenario10Access().getScenarioAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,28,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getScenario10Access().getScenario5Keyword_3_1());
                      			
                    }
                    otherlv_8=(Token)match(input,29,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getScenario10Access().getFragmentKeyword_3_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getScenario10Rule());
                      				}
                      				newCompositeNode(grammarAccess.getScenario10Access().getScenario5BodyParserRuleCall_3_3());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    this_Scenario5Body_9=ruleScenario5Body(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Scenario5Body_9;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getScenario10Access().getTrailingKeyword_3_4());
                      			
                    }

                    }


                    }
                    break;

            }


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
    // $ANTLR end "norm1_Scenario10"


    // $ANTLR start "norm3_Scenario10"
    // InternalTwoParametersTestLanguage.g:1018:1: norm3_Scenario10 returns [EObject current=null] : ( ( () otherlv_1= 'include' ) | ( () otherlv_3= 'trailing' ) | ( () otherlv_5= 'scenario5' (otherlv_6= 'include' )? ( (lv_first_7_0= norm1_IdOrKeyword ) ) ( (lv_second_8_0= ruleIdOrKeyword ) ) ) | ( () otherlv_10= 'scenario5' otherlv_11= 'fragment' this_Scenario5Body_12= norm1_Scenario5Body[$current] otherlv_13= 'trailing' ) ) ;
    public final EObject norm3_Scenario10() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_first_7_0 = null;

        AntlrDatatypeRuleToken lv_second_8_0 = null;

        EObject this_Scenario5Body_12 = null;


        try {
            // InternalTwoParametersTestLanguage.g:1019:1: ( ( ( () otherlv_1= 'include' ) | ( () otherlv_3= 'trailing' ) | ( () otherlv_5= 'scenario5' (otherlv_6= 'include' )? ( (lv_first_7_0= norm1_IdOrKeyword ) ) ( (lv_second_8_0= ruleIdOrKeyword ) ) ) | ( () otherlv_10= 'scenario5' otherlv_11= 'fragment' this_Scenario5Body_12= norm1_Scenario5Body[$current] otherlv_13= 'trailing' ) ) )
            // InternalTwoParametersTestLanguage.g:1020:2: ( ( () otherlv_1= 'include' ) | ( () otherlv_3= 'trailing' ) | ( () otherlv_5= 'scenario5' (otherlv_6= 'include' )? ( (lv_first_7_0= norm1_IdOrKeyword ) ) ( (lv_second_8_0= ruleIdOrKeyword ) ) ) | ( () otherlv_10= 'scenario5' otherlv_11= 'fragment' this_Scenario5Body_12= norm1_Scenario5Body[$current] otherlv_13= 'trailing' ) )
            {
            // InternalTwoParametersTestLanguage.g:1020:2: ( ( () otherlv_1= 'include' ) | ( () otherlv_3= 'trailing' ) | ( () otherlv_5= 'scenario5' (otherlv_6= 'include' )? ( (lv_first_7_0= norm1_IdOrKeyword ) ) ( (lv_second_8_0= ruleIdOrKeyword ) ) ) | ( () otherlv_10= 'scenario5' otherlv_11= 'fragment' this_Scenario5Body_12= norm1_Scenario5Body[$current] otherlv_13= 'trailing' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt14=1;
                }
                break;
            case 20:
                {
                alt14=2;
                }
                break;
            case 28:
                {
                int LA14_3 = input.LA(2);

                if ( (LA14_3==RULE_ID||(LA14_3>=30 && LA14_3<=31)) ) {
                    alt14=3;
                }
                else if ( (LA14_3==29) ) {
                    alt14=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalTwoParametersTestLanguage.g:1021:3: ( () otherlv_1= 'include' )
                    {
                    // InternalTwoParametersTestLanguage.g:1021:3: ( () otherlv_1= 'include' )
                    // InternalTwoParametersTestLanguage.g:1022:4: () otherlv_1= 'include'
                    {
                    // InternalTwoParametersTestLanguage.g:1022:4: ()
                    // InternalTwoParametersTestLanguage.g:1023:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getScenario10Access().getScenarioAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getScenario10Access().getIncludeKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalTwoParametersTestLanguage.g:1035:3: ( () otherlv_3= 'trailing' )
                    {
                    // InternalTwoParametersTestLanguage.g:1035:3: ( () otherlv_3= 'trailing' )
                    // InternalTwoParametersTestLanguage.g:1036:4: () otherlv_3= 'trailing'
                    {
                    // InternalTwoParametersTestLanguage.g:1036:4: ()
                    // InternalTwoParametersTestLanguage.g:1037:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getScenario10Access().getScenarioAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getScenario10Access().getTrailingKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalTwoParametersTestLanguage.g:1049:3: ( () otherlv_5= 'scenario5' (otherlv_6= 'include' )? ( (lv_first_7_0= norm1_IdOrKeyword ) ) ( (lv_second_8_0= ruleIdOrKeyword ) ) )
                    {
                    // InternalTwoParametersTestLanguage.g:1049:3: ( () otherlv_5= 'scenario5' (otherlv_6= 'include' )? ( (lv_first_7_0= norm1_IdOrKeyword ) ) ( (lv_second_8_0= ruleIdOrKeyword ) ) )
                    // InternalTwoParametersTestLanguage.g:1050:4: () otherlv_5= 'scenario5' (otherlv_6= 'include' )? ( (lv_first_7_0= norm1_IdOrKeyword ) ) ( (lv_second_8_0= ruleIdOrKeyword ) )
                    {
                    // InternalTwoParametersTestLanguage.g:1050:4: ()
                    // InternalTwoParametersTestLanguage.g:1051:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getScenario10Access().getScenarioAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,28,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getScenario10Access().getScenario5Keyword_2_1());
                      			
                    }
                    // InternalTwoParametersTestLanguage.g:1061:4: (otherlv_6= 'include' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==30) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalTwoParametersTestLanguage.g:1062:5: otherlv_6= 'include'
                            {
                            otherlv_6=(Token)match(input,30,FollowSets000.FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getScenario10Access().getIncludeKeyword_2_2_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalTwoParametersTestLanguage.g:1067:4: ( (lv_first_7_0= norm1_IdOrKeyword ) )
                    // InternalTwoParametersTestLanguage.g:1068:5: (lv_first_7_0= norm1_IdOrKeyword )
                    {
                    // InternalTwoParametersTestLanguage.g:1068:5: (lv_first_7_0= norm1_IdOrKeyword )
                    // InternalTwoParametersTestLanguage.g:1069:6: lv_first_7_0= norm1_IdOrKeyword
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getScenario10Access().getFirstIdOrKeywordParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_3);
                    lv_first_7_0=norm1_IdOrKeyword();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getScenario10Rule());
                      						}
                      						set(
                      							current,
                      							"first",
                      							lv_first_7_0,
                      							"org.eclipse.xtext.ui.tests.editor.contentassist.ParametersTestLanguage.IdOrKeyword");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalTwoParametersTestLanguage.g:1086:4: ( (lv_second_8_0= ruleIdOrKeyword ) )
                    // InternalTwoParametersTestLanguage.g:1087:5: (lv_second_8_0= ruleIdOrKeyword )
                    {
                    // InternalTwoParametersTestLanguage.g:1087:5: (lv_second_8_0= ruleIdOrKeyword )
                    // InternalTwoParametersTestLanguage.g:1088:6: lv_second_8_0= ruleIdOrKeyword
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getScenario10Access().getSecondIdOrKeywordParserRuleCall_2_4_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_second_8_0=ruleIdOrKeyword();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getScenario10Rule());
                      						}
                      						set(
                      							current,
                      							"second",
                      							lv_second_8_0,
                      							"org.eclipse.xtext.ui.tests.editor.contentassist.ParametersTestLanguage.IdOrKeyword");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTwoParametersTestLanguage.g:1107:3: ( () otherlv_10= 'scenario5' otherlv_11= 'fragment' this_Scenario5Body_12= norm1_Scenario5Body[$current] otherlv_13= 'trailing' )
                    {
                    // InternalTwoParametersTestLanguage.g:1107:3: ( () otherlv_10= 'scenario5' otherlv_11= 'fragment' this_Scenario5Body_12= norm1_Scenario5Body[$current] otherlv_13= 'trailing' )
                    // InternalTwoParametersTestLanguage.g:1108:4: () otherlv_10= 'scenario5' otherlv_11= 'fragment' this_Scenario5Body_12= norm1_Scenario5Body[$current] otherlv_13= 'trailing'
                    {
                    // InternalTwoParametersTestLanguage.g:1108:4: ()
                    // InternalTwoParametersTestLanguage.g:1109:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getScenario10Access().getScenarioAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_10=(Token)match(input,28,FollowSets000.FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getScenario10Access().getScenario5Keyword_3_1());
                      			
                    }
                    otherlv_11=(Token)match(input,29,FollowSets000.FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getScenario10Access().getFragmentKeyword_3_2());
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getScenario10Rule());
                      				}
                      				newCompositeNode(grammarAccess.getScenario10Access().getScenario5BodyParserRuleCall_3_3());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
                    this_Scenario5Body_12=norm1_Scenario5Body(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Scenario5Body_12;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_13=(Token)match(input,20,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getScenario10Access().getTrailingKeyword_3_4());
                      			
                    }

                    }


                    }
                    break;

            }


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
    // $ANTLR end "norm3_Scenario10"


    // $ANTLR start "entryRuleIdOrKeyword2"
    // InternalTwoParametersTestLanguage.g:1143:1: entryRuleIdOrKeyword2 returns [String current=null] : iv_ruleIdOrKeyword2= ruleIdOrKeyword2 EOF ;
    public final String entryRuleIdOrKeyword2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrKeyword2 = null;


        try {
            // InternalTwoParametersTestLanguage.g:1143:52: (iv_ruleIdOrKeyword2= ruleIdOrKeyword2 EOF )
            // InternalTwoParametersTestLanguage.g:1144:2: iv_ruleIdOrKeyword2= ruleIdOrKeyword2 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrKeyword2Rule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIdOrKeyword2=ruleIdOrKeyword2();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrKeyword2.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdOrKeyword2"


    // $ANTLR start "ruleIdOrKeyword2"
    // InternalTwoParametersTestLanguage.g:1150:1: ruleIdOrKeyword2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleIdOrKeyword2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

        try {
            // InternalTwoParametersTestLanguage.g:1151:1: (this_ID_0= RULE_ID )
            // InternalTwoParametersTestLanguage.g:1152:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getIdOrKeyword2Access().getIDTerminalRuleCall_1());
              	
            }

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
    // $ANTLR end "ruleIdOrKeyword2"


    // $ANTLR start "norm1_IdOrKeyword2"
    // InternalTwoParametersTestLanguage.g:1163:1: norm1_IdOrKeyword2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken norm1_IdOrKeyword2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

        try {
            // InternalTwoParametersTestLanguage.g:1164:1: (this_ID_0= RULE_ID )
            // InternalTwoParametersTestLanguage.g:1165:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getIdOrKeyword2Access().getIDTerminalRuleCall_1());
              	
            }

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
    // $ANTLR end "norm1_IdOrKeyword2"


    // $ANTLR start "norm2_IdOrKeyword2"
    // InternalTwoParametersTestLanguage.g:1176:1: norm2_IdOrKeyword2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken norm2_IdOrKeyword2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

        try {
            // InternalTwoParametersTestLanguage.g:1177:1: (this_ID_0= RULE_ID )
            // InternalTwoParametersTestLanguage.g:1178:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getIdOrKeyword2Access().getIDTerminalRuleCall_1());
              	
            }

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
    // $ANTLR end "norm2_IdOrKeyword2"


    // $ANTLR start "norm5_IdOrKeyword2"
    // InternalTwoParametersTestLanguage.g:1189:1: norm5_IdOrKeyword2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'keyword' | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken norm5_IdOrKeyword2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

        try {
            // InternalTwoParametersTestLanguage.g:1190:1: ( (kw= 'keyword' | this_ID_1= RULE_ID ) )
            // InternalTwoParametersTestLanguage.g:1191:2: (kw= 'keyword' | this_ID_1= RULE_ID )
            {
            // InternalTwoParametersTestLanguage.g:1191:2: (kw= 'keyword' | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalTwoParametersTestLanguage.g:1192:3: kw= 'keyword'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getIdOrKeyword2Access().getKeywordKeyword_0_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTwoParametersTestLanguage.g:1198:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getIdOrKeyword2Access().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


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
    // $ANTLR end "norm5_IdOrKeyword2"


    // $ANTLR start "norm6_IdOrKeyword2"
    // InternalTwoParametersTestLanguage.g:1210:1: norm6_IdOrKeyword2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'keyword' | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken norm6_IdOrKeyword2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

        try {
            // InternalTwoParametersTestLanguage.g:1211:1: ( (kw= 'keyword' | this_ID_1= RULE_ID ) )
            // InternalTwoParametersTestLanguage.g:1212:2: (kw= 'keyword' | this_ID_1= RULE_ID )
            {
            // InternalTwoParametersTestLanguage.g:1212:2: (kw= 'keyword' | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalTwoParametersTestLanguage.g:1213:3: kw= 'keyword'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getIdOrKeyword2Access().getKeywordKeyword_0_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTwoParametersTestLanguage.g:1219:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getIdOrKeyword2Access().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


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
    // $ANTLR end "norm6_IdOrKeyword2"


    // $ANTLR start "norm7_IdOrKeyword2"
    // InternalTwoParametersTestLanguage.g:1231:1: norm7_IdOrKeyword2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'keyword' | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken norm7_IdOrKeyword2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

        try {
            // InternalTwoParametersTestLanguage.g:1232:1: ( (kw= 'keyword' | this_ID_1= RULE_ID ) )
            // InternalTwoParametersTestLanguage.g:1233:2: (kw= 'keyword' | this_ID_1= RULE_ID )
            {
            // InternalTwoParametersTestLanguage.g:1233:2: (kw= 'keyword' | this_ID_1= RULE_ID )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalTwoParametersTestLanguage.g:1234:3: kw= 'keyword'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getIdOrKeyword2Access().getKeywordKeyword_0_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTwoParametersTestLanguage.g:1240:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getIdOrKeyword2Access().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


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
    // $ANTLR end "norm7_IdOrKeyword2"


    // $ANTLR start "ruleScenario5Body"
    // InternalTwoParametersTestLanguage.g:1252:1: ruleScenario5Body[EObject in_current] returns [EObject current=in_current] : (otherlv_0= 'fragment' )? ;
    public final EObject ruleScenario5Body(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;

        try {
            // InternalTwoParametersTestLanguage.g:1253:1: ( (otherlv_0= 'fragment' )? )
            // InternalTwoParametersTestLanguage.g:1254:2: (otherlv_0= 'fragment' )?
            {
            // InternalTwoParametersTestLanguage.g:1254:2: (otherlv_0= 'fragment' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTwoParametersTestLanguage.g:1255:3: otherlv_0= 'fragment'
                    {
                    otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(otherlv_0, grammarAccess.getScenario5BodyAccess().getFragmentKeyword_1_0());
                      		
                    }

                    }
                    break;

            }


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
    // $ANTLR end "ruleScenario5Body"


    // $ANTLR start "norm1_Scenario5Body"
    // InternalTwoParametersTestLanguage.g:1264:1: norm1_Scenario5Body[EObject in_current] returns [EObject current=in_current] : otherlv_0= 'include' ;
    public final EObject norm1_Scenario5Body(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;

        try {
            // InternalTwoParametersTestLanguage.g:1265:1: (otherlv_0= 'include' )
            // InternalTwoParametersTestLanguage.g:1266:2: otherlv_0= 'include'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getScenario5BodyAccess().getIncludeKeyword_0_0());
              	
            }

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
    // $ANTLR end "norm1_Scenario5Body"


    // $ANTLR start "entryRuleIdOrKeyword"
    // InternalTwoParametersTestLanguage.g:1273:1: entryRuleIdOrKeyword returns [String current=null] : iv_ruleIdOrKeyword= ruleIdOrKeyword EOF ;
    public final String entryRuleIdOrKeyword() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrKeyword = null;


        try {
            // InternalTwoParametersTestLanguage.g:1273:51: (iv_ruleIdOrKeyword= ruleIdOrKeyword EOF )
            // InternalTwoParametersTestLanguage.g:1274:2: iv_ruleIdOrKeyword= ruleIdOrKeyword EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrKeywordRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIdOrKeyword=ruleIdOrKeyword();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrKeyword.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdOrKeyword"


    // $ANTLR start "ruleIdOrKeyword"
    // InternalTwoParametersTestLanguage.g:1280:1: ruleIdOrKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleIdOrKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

        try {
            // InternalTwoParametersTestLanguage.g:1281:1: (this_ID_0= RULE_ID )
            // InternalTwoParametersTestLanguage.g:1282:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getIdOrKeywordAccess().getIDTerminalRuleCall_1());
              	
            }

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
    // $ANTLR end "ruleIdOrKeyword"


    // $ANTLR start "norm1_IdOrKeyword"
    // InternalTwoParametersTestLanguage.g:1293:1: norm1_IdOrKeyword returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'keyword' | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken norm1_IdOrKeyword() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

        try {
            // InternalTwoParametersTestLanguage.g:1294:1: ( (kw= 'keyword' | this_ID_1= RULE_ID ) )
            // InternalTwoParametersTestLanguage.g:1295:2: (kw= 'keyword' | this_ID_1= RULE_ID )
            {
            // InternalTwoParametersTestLanguage.g:1295:2: (kw= 'keyword' | this_ID_1= RULE_ID )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalTwoParametersTestLanguage.g:1296:3: kw= 'keyword'
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getIdOrKeywordAccess().getKeywordKeyword_0_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalTwoParametersTestLanguage.g:1302:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getIdOrKeywordAccess().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


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
    // $ANTLR end "norm1_IdOrKeyword"

    // $ANTLR start synpred1_InternalTwoParametersTestLanguage
    public final void synpred1_InternalTwoParametersTestLanguage_fragment() throws RecognitionException {   
        // InternalTwoParametersTestLanguage.g:187:5: ( ( '#5' ( ( norm3_Scenario7 ) ) ) )
        // InternalTwoParametersTestLanguage.g:187:6: ( '#5' ( ( norm3_Scenario7 ) ) )
        {
        // InternalTwoParametersTestLanguage.g:187:6: ( '#5' ( ( norm3_Scenario7 ) ) )
        // InternalTwoParametersTestLanguage.g:188:6: '#5' ( ( norm3_Scenario7 ) )
        {
        match(input,15,FollowSets000.FOLLOW_4); if (state.failed) return ;
        // InternalTwoParametersTestLanguage.g:189:6: ( ( norm3_Scenario7 ) )
        // InternalTwoParametersTestLanguage.g:190:7: ( norm3_Scenario7 )
        {
        // InternalTwoParametersTestLanguage.g:190:7: ( norm3_Scenario7 )
        // InternalTwoParametersTestLanguage.g:191:8: norm3_Scenario7
        {
        pushFollow(FollowSets000.FOLLOW_2);
        norm3_Scenario7();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalTwoParametersTestLanguage

    // $ANTLR start synpred2_InternalTwoParametersTestLanguage
    public final void synpred2_InternalTwoParametersTestLanguage_fragment() throws RecognitionException {   
        // InternalTwoParametersTestLanguage.g:224:5: ( ( '#6' ( ( ruleScenario7 ) ) ) )
        // InternalTwoParametersTestLanguage.g:224:6: ( '#6' ( ( ruleScenario7 ) ) )
        {
        // InternalTwoParametersTestLanguage.g:224:6: ( '#6' ( ( ruleScenario7 ) ) )
        // InternalTwoParametersTestLanguage.g:225:6: '#6' ( ( ruleScenario7 ) )
        {
        match(input,16,FollowSets000.FOLLOW_3); if (state.failed) return ;
        // InternalTwoParametersTestLanguage.g:226:6: ( ( ruleScenario7 ) )
        // InternalTwoParametersTestLanguage.g:227:7: ( ruleScenario7 )
        {
        // InternalTwoParametersTestLanguage.g:227:7: ( ruleScenario7 )
        // InternalTwoParametersTestLanguage.g:228:8: ruleScenario7
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleScenario7();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalTwoParametersTestLanguage

    // $ANTLR start synpred3_InternalTwoParametersTestLanguage
    public final void synpred3_InternalTwoParametersTestLanguage_fragment() throws RecognitionException {   
        // InternalTwoParametersTestLanguage.g:319:7: ( ( norm7_IdOrKeyword2 ) )
        // InternalTwoParametersTestLanguage.g:319:8: ( norm7_IdOrKeyword2 )
        {
        // InternalTwoParametersTestLanguage.g:319:8: ( norm7_IdOrKeyword2 )
        // InternalTwoParametersTestLanguage.g:320:8: norm7_IdOrKeyword2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        norm7_IdOrKeyword2();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalTwoParametersTestLanguage

    // $ANTLR start synpred4_InternalTwoParametersTestLanguage
    public final void synpred4_InternalTwoParametersTestLanguage_fragment() throws RecognitionException {   
        // InternalTwoParametersTestLanguage.g:379:7: ( ( norm7_IdOrKeyword2 ) )
        // InternalTwoParametersTestLanguage.g:379:8: ( norm7_IdOrKeyword2 )
        {
        // InternalTwoParametersTestLanguage.g:379:8: ( norm7_IdOrKeyword2 )
        // InternalTwoParametersTestLanguage.g:380:8: norm7_IdOrKeyword2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        norm7_IdOrKeyword2();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalTwoParametersTestLanguage

    // $ANTLR start synpred5_InternalTwoParametersTestLanguage
    public final void synpred5_InternalTwoParametersTestLanguage_fragment() throws RecognitionException {   
        // InternalTwoParametersTestLanguage.g:439:7: ( ( ruleIdOrKeyword2 ) )
        // InternalTwoParametersTestLanguage.g:439:8: ( ruleIdOrKeyword2 )
        {
        // InternalTwoParametersTestLanguage.g:439:8: ( ruleIdOrKeyword2 )
        // InternalTwoParametersTestLanguage.g:440:8: ruleIdOrKeyword2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleIdOrKeyword2();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalTwoParametersTestLanguage

    // $ANTLR start synpred6_InternalTwoParametersTestLanguage
    public final void synpred6_InternalTwoParametersTestLanguage_fragment() throws RecognitionException {   
        // InternalTwoParametersTestLanguage.g:499:7: ( ( ruleIdOrKeyword2 ) )
        // InternalTwoParametersTestLanguage.g:499:8: ( ruleIdOrKeyword2 )
        {
        // InternalTwoParametersTestLanguage.g:499:8: ( ruleIdOrKeyword2 )
        // InternalTwoParametersTestLanguage.g:500:8: ruleIdOrKeyword2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        ruleIdOrKeyword2();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalTwoParametersTestLanguage

    // $ANTLR start synpred7_InternalTwoParametersTestLanguage
    public final void synpred7_InternalTwoParametersTestLanguage_fragment() throws RecognitionException {   
        // InternalTwoParametersTestLanguage.g:748:4: ( ( norm2_IdOrKeyword2 ) )
        // InternalTwoParametersTestLanguage.g:748:5: ( norm2_IdOrKeyword2 )
        {
        // InternalTwoParametersTestLanguage.g:748:5: ( norm2_IdOrKeyword2 )
        // InternalTwoParametersTestLanguage.g:749:5: norm2_IdOrKeyword2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        norm2_IdOrKeyword2();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalTwoParametersTestLanguage

    // $ANTLR start synpred8_InternalTwoParametersTestLanguage
    public final void synpred8_InternalTwoParametersTestLanguage_fragment() throws RecognitionException {   
        // InternalTwoParametersTestLanguage.g:794:4: ( ( norm7_IdOrKeyword2 ) )
        // InternalTwoParametersTestLanguage.g:794:5: ( norm7_IdOrKeyword2 )
        {
        // InternalTwoParametersTestLanguage.g:794:5: ( norm7_IdOrKeyword2 )
        // InternalTwoParametersTestLanguage.g:795:5: norm7_IdOrKeyword2
        {
        pushFollow(FollowSets000.FOLLOW_2);
        norm7_IdOrKeyword2();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalTwoParametersTestLanguage

    // Delegated rules

    public final boolean synpred2_InternalTwoParametersTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalTwoParametersTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalTwoParametersTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalTwoParametersTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalTwoParametersTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalTwoParametersTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalTwoParametersTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalTwoParametersTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalTwoParametersTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalTwoParametersTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalTwoParametersTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalTwoParametersTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalTwoParametersTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalTwoParametersTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalTwoParametersTestLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalTwoParametersTestLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\13\16\uffff";
    static final String dfa_3s = "\1\31\16\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16";
    static final String dfa_5s = "\1\0\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\12\1\13\1\14\1\15\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "81:3: ( (otherlv_1= '#1' ( (lv_scenario_2_0= norm3_Scenario6 ) ) ) | (otherlv_3= '#2' ( (lv_scenario_4_0= ruleScenario6 ) ) ) | (otherlv_5= '#3' ( (lv_scenario_6_0= norm3_Scenario7 ) ) ) | (otherlv_7= '#4' ( (lv_scenario_8_0= norm2_Scenario7 ) ) ) | ( ( ( '#5' ( ( norm3_Scenario7 ) ) ) )=> (otherlv_9= '#5' ( (lv_scenario_10_0= norm3_Scenario7 ) ) ) ) | ( ( ( '#6' ( ( ruleScenario7 ) ) ) )=> (otherlv_11= '#6' ( (lv_scenario_12_0= ruleScenario7 ) ) ) ) | (otherlv_13= '#7' ( (lv_scenario_14_0= norm3_Scenario8 ) ) ) | (otherlv_15= '#8' ( (lv_scenario_16_0= norm2_Scenario8 ) ) ) | (otherlv_17= '#9' ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_18_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_19_0= norm3_Scenario7 ) ) (otherlv_20= 'trailing' )? ) ) ) | (otherlv_21= '#10' ( ( ( ( norm7_IdOrKeyword2 ) )=> (lv_scenario_22_0= norm3_Scenario9 ) ) | ( ( (lv_scenario_23_0= ruleScenario7 ) ) (otherlv_24= 'trailing' )? ) ) ) | (otherlv_25= '#11' ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_26_0= ruleScenario9 ) ) | ( ( (lv_scenario_27_0= norm3_Scenario7 ) ) (otherlv_28= 'trailing' )? ) ) ) | (otherlv_29= '#12' ( ( ( ( ruleIdOrKeyword2 ) )=> (lv_scenario_30_0= ruleScenario9 ) ) | ( ( (lv_scenario_31_0= ruleScenario7 ) ) (otherlv_32= 'trailing' )? ) ) ) | (otherlv_33= '#13' ( (lv_scenario_34_0= norm1_Scenario10 ) ) ) | (otherlv_35= '#14' ( (lv_scenario_36_0= norm3_Scenario10 ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_0 = input.LA(1);

                         
                        int index9_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_0==11) ) {s = 1;}

                        else if ( (LA9_0==12) ) {s = 2;}

                        else if ( (LA9_0==13) ) {s = 3;}

                        else if ( (LA9_0==14) ) {s = 4;}

                        else if ( (LA9_0==15) && (synpred1_InternalTwoParametersTestLanguage())) {s = 5;}

                        else if ( (LA9_0==16) && (synpred2_InternalTwoParametersTestLanguage())) {s = 6;}

                        else if ( (LA9_0==17) ) {s = 7;}

                        else if ( (LA9_0==18) ) {s = 8;}

                        else if ( (LA9_0==19) ) {s = 9;}

                        else if ( (LA9_0==21) ) {s = 10;}

                        else if ( (LA9_0==22) ) {s = 11;}

                        else if ( (LA9_0==23) ) {s = 12;}

                        else if ( (LA9_0==24) ) {s = 13;}

                        else if ( (LA9_0==25) ) {s = 14;}

                         
                        input.seek(index9_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000080000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000084000010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000010L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010100000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000050100000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020100000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000C0000010L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    }


}