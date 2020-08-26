package org.eclipse.xtext.ui.tests.editor.contentassist.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.Bug348427TestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBug348427TestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'1.1'", "'next'", "'1.2'", "'1.3'", "'1.4'", "':'", "'bool'", "'keyword'", "'child1'", "'end'", "'child2'", "'child3'", "'2.1'", "'2.2'", "'2.3'", "'2.4'", "'2.5'", "'2.6'", "'2.7'", "'2.8'", "'a'", "'b'"
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
    public static final int T__32=32;
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


        public InternalBug348427TestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBug348427TestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBug348427TestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBug348427TestLanguage.g"; }



     	private Bug348427TestLanguageGrammarAccess grammarAccess;

        public InternalBug348427TestLanguageParser(TokenStream input, Bug348427TestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected Bug348427TestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBug348427TestLanguage.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBug348427TestLanguage.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalBug348427TestLanguage.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBug348427TestLanguage.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_element1_0_0= ruleScenario1_1 ) ) | ( (lv_element1_1_0= ruleScenario1_2 ) ) | ( (lv_element1_2_0= ruleScenario1_3 ) ) | ( (lv_element1_3_0= ruleScenario1_4 ) ) | ( (lv_element2_4_0= ruleScenario2_1 ) ) | ( (lv_element2_5_0= ruleScenario2_2 ) ) | ( (lv_element2_6_0= ruleScenario2_3 ) ) | ( (lv_element2_7_0= ruleScenario2_4 ) ) | ( (lv_element2_8_0= ruleScenario2_5 ) ) | ( (lv_element2_9_0= ruleScenario2_6 ) ) | ( (lv_element2_10_0= ruleScenario2_7 ) ) | ( (lv_element2_11_0= ruleScenario2_8 ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_element1_0_0 = null;

        EObject lv_element1_1_0 = null;

        EObject lv_element1_2_0 = null;

        EObject lv_element1_3_0 = null;

        EObject lv_element2_4_0 = null;

        EObject lv_element2_5_0 = null;

        EObject lv_element2_6_0 = null;

        EObject lv_element2_7_0 = null;

        EObject lv_element2_8_0 = null;

        EObject lv_element2_9_0 = null;

        EObject lv_element2_10_0 = null;

        EObject lv_element2_11_0 = null;


        try {
            // InternalBug348427TestLanguage.g:73:1: ( ( ( (lv_element1_0_0= ruleScenario1_1 ) ) | ( (lv_element1_1_0= ruleScenario1_2 ) ) | ( (lv_element1_2_0= ruleScenario1_3 ) ) | ( (lv_element1_3_0= ruleScenario1_4 ) ) | ( (lv_element2_4_0= ruleScenario2_1 ) ) | ( (lv_element2_5_0= ruleScenario2_2 ) ) | ( (lv_element2_6_0= ruleScenario2_3 ) ) | ( (lv_element2_7_0= ruleScenario2_4 ) ) | ( (lv_element2_8_0= ruleScenario2_5 ) ) | ( (lv_element2_9_0= ruleScenario2_6 ) ) | ( (lv_element2_10_0= ruleScenario2_7 ) ) | ( (lv_element2_11_0= ruleScenario2_8 ) ) ) )
            // InternalBug348427TestLanguage.g:74:2: ( ( (lv_element1_0_0= ruleScenario1_1 ) ) | ( (lv_element1_1_0= ruleScenario1_2 ) ) | ( (lv_element1_2_0= ruleScenario1_3 ) ) | ( (lv_element1_3_0= ruleScenario1_4 ) ) | ( (lv_element2_4_0= ruleScenario2_1 ) ) | ( (lv_element2_5_0= ruleScenario2_2 ) ) | ( (lv_element2_6_0= ruleScenario2_3 ) ) | ( (lv_element2_7_0= ruleScenario2_4 ) ) | ( (lv_element2_8_0= ruleScenario2_5 ) ) | ( (lv_element2_9_0= ruleScenario2_6 ) ) | ( (lv_element2_10_0= ruleScenario2_7 ) ) | ( (lv_element2_11_0= ruleScenario2_8 ) ) )
            {
            // InternalBug348427TestLanguage.g:74:2: ( ( (lv_element1_0_0= ruleScenario1_1 ) ) | ( (lv_element1_1_0= ruleScenario1_2 ) ) | ( (lv_element1_2_0= ruleScenario1_3 ) ) | ( (lv_element1_3_0= ruleScenario1_4 ) ) | ( (lv_element2_4_0= ruleScenario2_1 ) ) | ( (lv_element2_5_0= ruleScenario2_2 ) ) | ( (lv_element2_6_0= ruleScenario2_3 ) ) | ( (lv_element2_7_0= ruleScenario2_4 ) ) | ( (lv_element2_8_0= ruleScenario2_5 ) ) | ( (lv_element2_9_0= ruleScenario2_6 ) ) | ( (lv_element2_10_0= ruleScenario2_7 ) ) | ( (lv_element2_11_0= ruleScenario2_8 ) ) )
            int alt1=12;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            case 15:
                {
                alt1=4;
                }
                break;
            case 23:
                {
                alt1=5;
                }
                break;
            case 24:
                {
                alt1=6;
                }
                break;
            case 25:
                {
                alt1=7;
                }
                break;
            case 26:
                {
                alt1=8;
                }
                break;
            case 27:
                {
                alt1=9;
                }
                break;
            case 28:
                {
                alt1=10;
                }
                break;
            case 29:
                {
                alt1=11;
                }
                break;
            case 30:
                {
                alt1=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBug348427TestLanguage.g:75:3: ( (lv_element1_0_0= ruleScenario1_1 ) )
                    {
                    // InternalBug348427TestLanguage.g:75:3: ( (lv_element1_0_0= ruleScenario1_1 ) )
                    // InternalBug348427TestLanguage.g:76:4: (lv_element1_0_0= ruleScenario1_1 )
                    {
                    // InternalBug348427TestLanguage.g:76:4: (lv_element1_0_0= ruleScenario1_1 )
                    // InternalBug348427TestLanguage.g:77:5: lv_element1_0_0= ruleScenario1_1
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement1Scenario1_1ParserRuleCall_0_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element1_0_0=ruleScenario1_1();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element1",
                    						lv_element1_0_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario1_1");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:95:3: ( (lv_element1_1_0= ruleScenario1_2 ) )
                    {
                    // InternalBug348427TestLanguage.g:95:3: ( (lv_element1_1_0= ruleScenario1_2 ) )
                    // InternalBug348427TestLanguage.g:96:4: (lv_element1_1_0= ruleScenario1_2 )
                    {
                    // InternalBug348427TestLanguage.g:96:4: (lv_element1_1_0= ruleScenario1_2 )
                    // InternalBug348427TestLanguage.g:97:5: lv_element1_1_0= ruleScenario1_2
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement1Scenario1_2ParserRuleCall_1_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element1_1_0=ruleScenario1_2();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element1",
                    						lv_element1_1_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario1_2");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBug348427TestLanguage.g:115:3: ( (lv_element1_2_0= ruleScenario1_3 ) )
                    {
                    // InternalBug348427TestLanguage.g:115:3: ( (lv_element1_2_0= ruleScenario1_3 ) )
                    // InternalBug348427TestLanguage.g:116:4: (lv_element1_2_0= ruleScenario1_3 )
                    {
                    // InternalBug348427TestLanguage.g:116:4: (lv_element1_2_0= ruleScenario1_3 )
                    // InternalBug348427TestLanguage.g:117:5: lv_element1_2_0= ruleScenario1_3
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement1Scenario1_3ParserRuleCall_2_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element1_2_0=ruleScenario1_3();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element1",
                    						lv_element1_2_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario1_3");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalBug348427TestLanguage.g:135:3: ( (lv_element1_3_0= ruleScenario1_4 ) )
                    {
                    // InternalBug348427TestLanguage.g:135:3: ( (lv_element1_3_0= ruleScenario1_4 ) )
                    // InternalBug348427TestLanguage.g:136:4: (lv_element1_3_0= ruleScenario1_4 )
                    {
                    // InternalBug348427TestLanguage.g:136:4: (lv_element1_3_0= ruleScenario1_4 )
                    // InternalBug348427TestLanguage.g:137:5: lv_element1_3_0= ruleScenario1_4
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement1Scenario1_4ParserRuleCall_3_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element1_3_0=ruleScenario1_4();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element1",
                    						lv_element1_3_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario1_4");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalBug348427TestLanguage.g:155:3: ( (lv_element2_4_0= ruleScenario2_1 ) )
                    {
                    // InternalBug348427TestLanguage.g:155:3: ( (lv_element2_4_0= ruleScenario2_1 ) )
                    // InternalBug348427TestLanguage.g:156:4: (lv_element2_4_0= ruleScenario2_1 )
                    {
                    // InternalBug348427TestLanguage.g:156:4: (lv_element2_4_0= ruleScenario2_1 )
                    // InternalBug348427TestLanguage.g:157:5: lv_element2_4_0= ruleScenario2_1
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement2Scenario2_1ParserRuleCall_4_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element2_4_0=ruleScenario2_1();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element2",
                    						lv_element2_4_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario2_1");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalBug348427TestLanguage.g:175:3: ( (lv_element2_5_0= ruleScenario2_2 ) )
                    {
                    // InternalBug348427TestLanguage.g:175:3: ( (lv_element2_5_0= ruleScenario2_2 ) )
                    // InternalBug348427TestLanguage.g:176:4: (lv_element2_5_0= ruleScenario2_2 )
                    {
                    // InternalBug348427TestLanguage.g:176:4: (lv_element2_5_0= ruleScenario2_2 )
                    // InternalBug348427TestLanguage.g:177:5: lv_element2_5_0= ruleScenario2_2
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement2Scenario2_2ParserRuleCall_5_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element2_5_0=ruleScenario2_2();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element2",
                    						lv_element2_5_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario2_2");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalBug348427TestLanguage.g:195:3: ( (lv_element2_6_0= ruleScenario2_3 ) )
                    {
                    // InternalBug348427TestLanguage.g:195:3: ( (lv_element2_6_0= ruleScenario2_3 ) )
                    // InternalBug348427TestLanguage.g:196:4: (lv_element2_6_0= ruleScenario2_3 )
                    {
                    // InternalBug348427TestLanguage.g:196:4: (lv_element2_6_0= ruleScenario2_3 )
                    // InternalBug348427TestLanguage.g:197:5: lv_element2_6_0= ruleScenario2_3
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement2Scenario2_3ParserRuleCall_6_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element2_6_0=ruleScenario2_3();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element2",
                    						lv_element2_6_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario2_3");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalBug348427TestLanguage.g:215:3: ( (lv_element2_7_0= ruleScenario2_4 ) )
                    {
                    // InternalBug348427TestLanguage.g:215:3: ( (lv_element2_7_0= ruleScenario2_4 ) )
                    // InternalBug348427TestLanguage.g:216:4: (lv_element2_7_0= ruleScenario2_4 )
                    {
                    // InternalBug348427TestLanguage.g:216:4: (lv_element2_7_0= ruleScenario2_4 )
                    // InternalBug348427TestLanguage.g:217:5: lv_element2_7_0= ruleScenario2_4
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement2Scenario2_4ParserRuleCall_7_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element2_7_0=ruleScenario2_4();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element2",
                    						lv_element2_7_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario2_4");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalBug348427TestLanguage.g:235:3: ( (lv_element2_8_0= ruleScenario2_5 ) )
                    {
                    // InternalBug348427TestLanguage.g:235:3: ( (lv_element2_8_0= ruleScenario2_5 ) )
                    // InternalBug348427TestLanguage.g:236:4: (lv_element2_8_0= ruleScenario2_5 )
                    {
                    // InternalBug348427TestLanguage.g:236:4: (lv_element2_8_0= ruleScenario2_5 )
                    // InternalBug348427TestLanguage.g:237:5: lv_element2_8_0= ruleScenario2_5
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement2Scenario2_5ParserRuleCall_8_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element2_8_0=ruleScenario2_5();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element2",
                    						lv_element2_8_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario2_5");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalBug348427TestLanguage.g:255:3: ( (lv_element2_9_0= ruleScenario2_6 ) )
                    {
                    // InternalBug348427TestLanguage.g:255:3: ( (lv_element2_9_0= ruleScenario2_6 ) )
                    // InternalBug348427TestLanguage.g:256:4: (lv_element2_9_0= ruleScenario2_6 )
                    {
                    // InternalBug348427TestLanguage.g:256:4: (lv_element2_9_0= ruleScenario2_6 )
                    // InternalBug348427TestLanguage.g:257:5: lv_element2_9_0= ruleScenario2_6
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement2Scenario2_6ParserRuleCall_9_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element2_9_0=ruleScenario2_6();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element2",
                    						lv_element2_9_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario2_6");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalBug348427TestLanguage.g:275:3: ( (lv_element2_10_0= ruleScenario2_7 ) )
                    {
                    // InternalBug348427TestLanguage.g:275:3: ( (lv_element2_10_0= ruleScenario2_7 ) )
                    // InternalBug348427TestLanguage.g:276:4: (lv_element2_10_0= ruleScenario2_7 )
                    {
                    // InternalBug348427TestLanguage.g:276:4: (lv_element2_10_0= ruleScenario2_7 )
                    // InternalBug348427TestLanguage.g:277:5: lv_element2_10_0= ruleScenario2_7
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement2Scenario2_7ParserRuleCall_10_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element2_10_0=ruleScenario2_7();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element2",
                    						lv_element2_10_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario2_7");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalBug348427TestLanguage.g:295:3: ( (lv_element2_11_0= ruleScenario2_8 ) )
                    {
                    // InternalBug348427TestLanguage.g:295:3: ( (lv_element2_11_0= ruleScenario2_8 ) )
                    // InternalBug348427TestLanguage.g:296:4: (lv_element2_11_0= ruleScenario2_8 )
                    {
                    // InternalBug348427TestLanguage.g:296:4: (lv_element2_11_0= ruleScenario2_8 )
                    // InternalBug348427TestLanguage.g:297:5: lv_element2_11_0= ruleScenario2_8
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getElement2Scenario2_8ParserRuleCall_11_0());
                    				
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element2_11_0=ruleScenario2_8();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"element2",
                    						lv_element2_11_0,
                    						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Scenario2_8");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleScenario1_1"
    // InternalBug348427TestLanguage.g:318:1: entryRuleScenario1_1 returns [EObject current=null] : iv_ruleScenario1_1= ruleScenario1_1 EOF ;
    public final EObject entryRuleScenario1_1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario1_1 = null;


        try {
            // InternalBug348427TestLanguage.g:318:52: (iv_ruleScenario1_1= ruleScenario1_1 EOF )
            // InternalBug348427TestLanguage.g:319:2: iv_ruleScenario1_1= ruleScenario1_1 EOF
            {
             newCompositeNode(grammarAccess.getScenario1_1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario1_1=ruleScenario1_1();

            state._fsp--;

             current =iv_ruleScenario1_1; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario1_1"


    // $ANTLR start "ruleScenario1_1"
    // InternalBug348427TestLanguage.g:325:1: ruleScenario1_1 returns [EObject current=null] : (otherlv_0= '1.1' ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) ) otherlv_4= 'next' ) ;
    public final EObject ruleScenario1_1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_child_1_0 = null;

        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;


        try {
            // InternalBug348427TestLanguage.g:326:1: ( (otherlv_0= '1.1' ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) ) otherlv_4= 'next' ) )
            // InternalBug348427TestLanguage.g:327:2: (otherlv_0= '1.1' ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) ) otherlv_4= 'next' )
            {
            // InternalBug348427TestLanguage.g:327:2: (otherlv_0= '1.1' ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) ) otherlv_4= 'next' )
            // InternalBug348427TestLanguage.g:328:3: otherlv_0= '1.1' ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) ) otherlv_4= 'next'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScenario1_1Access().getDigitOneFullStopDigitOneKeyword_0());
            		
            // InternalBug348427TestLanguage.g:332:3: ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalBug348427TestLanguage.g:333:4: ( (lv_child_1_0= ruleChild1_1 ) )
                    {
                    // InternalBug348427TestLanguage.g:333:4: ( (lv_child_1_0= ruleChild1_1 ) )
                    // InternalBug348427TestLanguage.g:334:5: (lv_child_1_0= ruleChild1_1 )
                    {
                    // InternalBug348427TestLanguage.g:334:5: (lv_child_1_0= ruleChild1_1 )
                    // InternalBug348427TestLanguage.g:335:6: lv_child_1_0= ruleChild1_1
                    {

                    						newCompositeNode(grammarAccess.getScenario1_1Access().getChildChild1_1ParserRuleCall_1_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_1_0=ruleChild1_1();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario1_1Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_1_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_1");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:353:4: ( (lv_child_2_0= ruleChild1_2 ) )
                    {
                    // InternalBug348427TestLanguage.g:353:4: ( (lv_child_2_0= ruleChild1_2 ) )
                    // InternalBug348427TestLanguage.g:354:5: (lv_child_2_0= ruleChild1_2 )
                    {
                    // InternalBug348427TestLanguage.g:354:5: (lv_child_2_0= ruleChild1_2 )
                    // InternalBug348427TestLanguage.g:355:6: lv_child_2_0= ruleChild1_2
                    {

                    						newCompositeNode(grammarAccess.getScenario1_1Access().getChildChild1_2ParserRuleCall_1_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_2_0=ruleChild1_2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario1_1Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_2_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_2");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBug348427TestLanguage.g:373:4: ( (lv_child_3_0= ruleChild1_3 ) )
                    {
                    // InternalBug348427TestLanguage.g:373:4: ( (lv_child_3_0= ruleChild1_3 ) )
                    // InternalBug348427TestLanguage.g:374:5: (lv_child_3_0= ruleChild1_3 )
                    {
                    // InternalBug348427TestLanguage.g:374:5: (lv_child_3_0= ruleChild1_3 )
                    // InternalBug348427TestLanguage.g:375:6: lv_child_3_0= ruleChild1_3
                    {

                    						newCompositeNode(grammarAccess.getScenario1_1Access().getChildChild1_3ParserRuleCall_1_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_3_0=ruleChild1_3();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario1_1Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_3_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_3");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getScenario1_1Access().getNextKeyword_2());
            		

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
    // $ANTLR end "ruleScenario1_1"


    // $ANTLR start "entryRuleScenario1_2"
    // InternalBug348427TestLanguage.g:401:1: entryRuleScenario1_2 returns [EObject current=null] : iv_ruleScenario1_2= ruleScenario1_2 EOF ;
    public final EObject entryRuleScenario1_2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario1_2 = null;


        try {
            // InternalBug348427TestLanguage.g:401:52: (iv_ruleScenario1_2= ruleScenario1_2 EOF )
            // InternalBug348427TestLanguage.g:402:2: iv_ruleScenario1_2= ruleScenario1_2 EOF
            {
             newCompositeNode(grammarAccess.getScenario1_2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario1_2=ruleScenario1_2();

            state._fsp--;

             current =iv_ruleScenario1_2; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario1_2"


    // $ANTLR start "ruleScenario1_2"
    // InternalBug348427TestLanguage.g:408:1: ruleScenario1_2 returns [EObject current=null] : (otherlv_0= '1.2' ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) )+ otherlv_4= 'next' ) ;
    public final EObject ruleScenario1_2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_child_1_0 = null;

        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;


        try {
            // InternalBug348427TestLanguage.g:409:1: ( (otherlv_0= '1.2' ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) )+ otherlv_4= 'next' ) )
            // InternalBug348427TestLanguage.g:410:2: (otherlv_0= '1.2' ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) )+ otherlv_4= 'next' )
            {
            // InternalBug348427TestLanguage.g:410:2: (otherlv_0= '1.2' ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) )+ otherlv_4= 'next' )
            // InternalBug348427TestLanguage.g:411:3: otherlv_0= '1.2' ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) )+ otherlv_4= 'next'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScenario1_2Access().getDigitOneFullStopDigitTwoKeyword_0());
            		
            // InternalBug348427TestLanguage.g:415:3: ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=4;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalBug348427TestLanguage.g:416:4: ( (lv_child_1_0= ruleChild1_1 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:416:4: ( (lv_child_1_0= ruleChild1_1 ) )
            	    // InternalBug348427TestLanguage.g:417:5: (lv_child_1_0= ruleChild1_1 )
            	    {
            	    // InternalBug348427TestLanguage.g:417:5: (lv_child_1_0= ruleChild1_1 )
            	    // InternalBug348427TestLanguage.g:418:6: lv_child_1_0= ruleChild1_1
            	    {

            	    						newCompositeNode(grammarAccess.getScenario1_2Access().getChildChild1_1ParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_1_0=ruleChild1_1();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario1_2Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_1_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_1");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBug348427TestLanguage.g:436:4: ( (lv_child_2_0= ruleChild1_2 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:436:4: ( (lv_child_2_0= ruleChild1_2 ) )
            	    // InternalBug348427TestLanguage.g:437:5: (lv_child_2_0= ruleChild1_2 )
            	    {
            	    // InternalBug348427TestLanguage.g:437:5: (lv_child_2_0= ruleChild1_2 )
            	    // InternalBug348427TestLanguage.g:438:6: lv_child_2_0= ruleChild1_2
            	    {

            	    						newCompositeNode(grammarAccess.getScenario1_2Access().getChildChild1_2ParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_2_0=ruleChild1_2();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario1_2Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_2_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_2");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBug348427TestLanguage.g:456:4: ( (lv_child_3_0= ruleChild1_3 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:456:4: ( (lv_child_3_0= ruleChild1_3 ) )
            	    // InternalBug348427TestLanguage.g:457:5: (lv_child_3_0= ruleChild1_3 )
            	    {
            	    // InternalBug348427TestLanguage.g:457:5: (lv_child_3_0= ruleChild1_3 )
            	    // InternalBug348427TestLanguage.g:458:6: lv_child_3_0= ruleChild1_3
            	    {

            	    						newCompositeNode(grammarAccess.getScenario1_2Access().getChildChild1_3ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_3_0=ruleChild1_3();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario1_2Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_3_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_3");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getScenario1_2Access().getNextKeyword_2());
            		

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
    // $ANTLR end "ruleScenario1_2"


    // $ANTLR start "entryRuleScenario1_3"
    // InternalBug348427TestLanguage.g:484:1: entryRuleScenario1_3 returns [EObject current=null] : iv_ruleScenario1_3= ruleScenario1_3 EOF ;
    public final EObject entryRuleScenario1_3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario1_3 = null;


        try {
            // InternalBug348427TestLanguage.g:484:52: (iv_ruleScenario1_3= ruleScenario1_3 EOF )
            // InternalBug348427TestLanguage.g:485:2: iv_ruleScenario1_3= ruleScenario1_3 EOF
            {
             newCompositeNode(grammarAccess.getScenario1_3Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario1_3=ruleScenario1_3();

            state._fsp--;

             current =iv_ruleScenario1_3; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario1_3"


    // $ANTLR start "ruleScenario1_3"
    // InternalBug348427TestLanguage.g:491:1: ruleScenario1_3 returns [EObject current=null] : ( () otherlv_1= '1.3' ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )* otherlv_5= 'next' ) ;
    public final EObject ruleScenario1_3() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;

        EObject lv_child_4_0 = null;


        try {
            // InternalBug348427TestLanguage.g:492:1: ( ( () otherlv_1= '1.3' ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )* otherlv_5= 'next' ) )
            // InternalBug348427TestLanguage.g:493:2: ( () otherlv_1= '1.3' ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )* otherlv_5= 'next' )
            {
            // InternalBug348427TestLanguage.g:493:2: ( () otherlv_1= '1.3' ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )* otherlv_5= 'next' )
            // InternalBug348427TestLanguage.g:494:3: () otherlv_1= '1.3' ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )* otherlv_5= 'next'
            {
            // InternalBug348427TestLanguage.g:494:3: ()
            // InternalBug348427TestLanguage.g:495:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScenario1_3Access().getScenario1Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getScenario1_3Access().getDigitOneFullStopDigitThreeKeyword_1());
            		
            // InternalBug348427TestLanguage.g:505:3: ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )*
            loop4:
            do {
                int alt4=4;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalBug348427TestLanguage.g:506:4: ( (lv_child_2_0= ruleChild1_1 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:506:4: ( (lv_child_2_0= ruleChild1_1 ) )
            	    // InternalBug348427TestLanguage.g:507:5: (lv_child_2_0= ruleChild1_1 )
            	    {
            	    // InternalBug348427TestLanguage.g:507:5: (lv_child_2_0= ruleChild1_1 )
            	    // InternalBug348427TestLanguage.g:508:6: lv_child_2_0= ruleChild1_1
            	    {

            	    						newCompositeNode(grammarAccess.getScenario1_3Access().getChildChild1_1ParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_2_0=ruleChild1_1();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario1_3Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_2_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_1");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBug348427TestLanguage.g:526:4: ( (lv_child_3_0= ruleChild1_2 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:526:4: ( (lv_child_3_0= ruleChild1_2 ) )
            	    // InternalBug348427TestLanguage.g:527:5: (lv_child_3_0= ruleChild1_2 )
            	    {
            	    // InternalBug348427TestLanguage.g:527:5: (lv_child_3_0= ruleChild1_2 )
            	    // InternalBug348427TestLanguage.g:528:6: lv_child_3_0= ruleChild1_2
            	    {

            	    						newCompositeNode(grammarAccess.getScenario1_3Access().getChildChild1_2ParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_3_0=ruleChild1_2();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario1_3Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_3_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_2");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBug348427TestLanguage.g:546:4: ( (lv_child_4_0= ruleChild1_3 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:546:4: ( (lv_child_4_0= ruleChild1_3 ) )
            	    // InternalBug348427TestLanguage.g:547:5: (lv_child_4_0= ruleChild1_3 )
            	    {
            	    // InternalBug348427TestLanguage.g:547:5: (lv_child_4_0= ruleChild1_3 )
            	    // InternalBug348427TestLanguage.g:548:6: lv_child_4_0= ruleChild1_3
            	    {

            	    						newCompositeNode(grammarAccess.getScenario1_3Access().getChildChild1_3ParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_4_0=ruleChild1_3();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario1_3Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_4_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_3");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getScenario1_3Access().getNextKeyword_3());
            		

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
    // $ANTLR end "ruleScenario1_3"


    // $ANTLR start "entryRuleScenario1_4"
    // InternalBug348427TestLanguage.g:574:1: entryRuleScenario1_4 returns [EObject current=null] : iv_ruleScenario1_4= ruleScenario1_4 EOF ;
    public final EObject entryRuleScenario1_4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario1_4 = null;


        try {
            // InternalBug348427TestLanguage.g:574:52: (iv_ruleScenario1_4= ruleScenario1_4 EOF )
            // InternalBug348427TestLanguage.g:575:2: iv_ruleScenario1_4= ruleScenario1_4 EOF
            {
             newCompositeNode(grammarAccess.getScenario1_4Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario1_4=ruleScenario1_4();

            state._fsp--;

             current =iv_ruleScenario1_4; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario1_4"


    // $ANTLR start "ruleScenario1_4"
    // InternalBug348427TestLanguage.g:581:1: ruleScenario1_4 returns [EObject current=null] : ( () otherlv_1= '1.4' ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )? otherlv_5= 'next' ) ;
    public final EObject ruleScenario1_4() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;

        EObject lv_child_4_0 = null;


        try {
            // InternalBug348427TestLanguage.g:582:1: ( ( () otherlv_1= '1.4' ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )? otherlv_5= 'next' ) )
            // InternalBug348427TestLanguage.g:583:2: ( () otherlv_1= '1.4' ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )? otherlv_5= 'next' )
            {
            // InternalBug348427TestLanguage.g:583:2: ( () otherlv_1= '1.4' ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )? otherlv_5= 'next' )
            // InternalBug348427TestLanguage.g:584:3: () otherlv_1= '1.4' ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )? otherlv_5= 'next'
            {
            // InternalBug348427TestLanguage.g:584:3: ()
            // InternalBug348427TestLanguage.g:585:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScenario1_4Access().getScenario1Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getScenario1_4Access().getDigitOneFullStopDigitFourKeyword_1());
            		
            // InternalBug348427TestLanguage.g:595:3: ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )?
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalBug348427TestLanguage.g:596:4: ( (lv_child_2_0= ruleChild1_1 ) )
                    {
                    // InternalBug348427TestLanguage.g:596:4: ( (lv_child_2_0= ruleChild1_1 ) )
                    // InternalBug348427TestLanguage.g:597:5: (lv_child_2_0= ruleChild1_1 )
                    {
                    // InternalBug348427TestLanguage.g:597:5: (lv_child_2_0= ruleChild1_1 )
                    // InternalBug348427TestLanguage.g:598:6: lv_child_2_0= ruleChild1_1
                    {

                    						newCompositeNode(grammarAccess.getScenario1_4Access().getChildChild1_1ParserRuleCall_2_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_2_0=ruleChild1_1();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario1_4Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_2_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_1");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:616:4: ( (lv_child_3_0= ruleChild1_2 ) )
                    {
                    // InternalBug348427TestLanguage.g:616:4: ( (lv_child_3_0= ruleChild1_2 ) )
                    // InternalBug348427TestLanguage.g:617:5: (lv_child_3_0= ruleChild1_2 )
                    {
                    // InternalBug348427TestLanguage.g:617:5: (lv_child_3_0= ruleChild1_2 )
                    // InternalBug348427TestLanguage.g:618:6: lv_child_3_0= ruleChild1_2
                    {

                    						newCompositeNode(grammarAccess.getScenario1_4Access().getChildChild1_2ParserRuleCall_2_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_3_0=ruleChild1_2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario1_4Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_3_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_2");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBug348427TestLanguage.g:636:4: ( (lv_child_4_0= ruleChild1_3 ) )
                    {
                    // InternalBug348427TestLanguage.g:636:4: ( (lv_child_4_0= ruleChild1_3 ) )
                    // InternalBug348427TestLanguage.g:637:5: (lv_child_4_0= ruleChild1_3 )
                    {
                    // InternalBug348427TestLanguage.g:637:5: (lv_child_4_0= ruleChild1_3 )
                    // InternalBug348427TestLanguage.g:638:6: lv_child_4_0= ruleChild1_3
                    {

                    						newCompositeNode(grammarAccess.getScenario1_4Access().getChildChild1_3ParserRuleCall_2_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_4_0=ruleChild1_3();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario1_4Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_4_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child1_3");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getScenario1_4Access().getNextKeyword_3());
            		

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
    // $ANTLR end "ruleScenario1_4"


    // $ANTLR start "entryRuleChild1_1"
    // InternalBug348427TestLanguage.g:664:1: entryRuleChild1_1 returns [EObject current=null] : iv_ruleChild1_1= ruleChild1_1 EOF ;
    public final EObject entryRuleChild1_1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild1_1 = null;


        try {
            // InternalBug348427TestLanguage.g:664:49: (iv_ruleChild1_1= ruleChild1_1 EOF )
            // InternalBug348427TestLanguage.g:665:2: iv_ruleChild1_1= ruleChild1_1 EOF
            {
             newCompositeNode(grammarAccess.getChild1_1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild1_1=ruleChild1_1();

            state._fsp--;

             current =iv_ruleChild1_1; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleChild1_1"


    // $ANTLR start "ruleChild1_1"
    // InternalBug348427TestLanguage.g:671:1: ruleChild1_1 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child1' otherlv_6= 'end' ) ;
    public final EObject ruleChild1_1() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_bool_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_enumType_4_0 = null;


        try {
            // InternalBug348427TestLanguage.g:672:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child1' otherlv_6= 'end' ) )
            // InternalBug348427TestLanguage.g:673:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child1' otherlv_6= 'end' )
            {
            // InternalBug348427TestLanguage.g:673:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child1' otherlv_6= 'end' )
            // InternalBug348427TestLanguage.g:674:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child1' otherlv_6= 'end'
            {
            // InternalBug348427TestLanguage.g:674:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBug348427TestLanguage.g:675:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBug348427TestLanguage.g:675:4: (lv_name_0_0= RULE_ID )
            // InternalBug348427TestLanguage.g:676:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getChild1_1Access().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChild1_1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getChild1_1Access().getColonKeyword_1());
            		
            // InternalBug348427TestLanguage.g:696:3: ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalBug348427TestLanguage.g:697:4: ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword'
                    {
                    // InternalBug348427TestLanguage.g:697:4: ( (lv_bool_2_0= 'bool' ) )
                    // InternalBug348427TestLanguage.g:698:5: (lv_bool_2_0= 'bool' )
                    {
                    // InternalBug348427TestLanguage.g:698:5: (lv_bool_2_0= 'bool' )
                    // InternalBug348427TestLanguage.g:699:6: lv_bool_2_0= 'bool'
                    {
                    lv_bool_2_0=(Token)match(input,17,FollowSets000.FOLLOW_8); 

                    						newLeafNode(lv_bool_2_0, grammarAccess.getChild1_1Access().getBoolBoolKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild1_1Rule());
                    						}
                    						setWithLastConsumed(current, "bool", lv_bool_2_0 != null, "bool");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getChild1_1Access().getKeywordKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBug348427TestLanguage.g:716:3: ( (lv_enumType_4_0= ruleEnumType ) )
            // InternalBug348427TestLanguage.g:717:4: (lv_enumType_4_0= ruleEnumType )
            {
            // InternalBug348427TestLanguage.g:717:4: (lv_enumType_4_0= ruleEnumType )
            // InternalBug348427TestLanguage.g:718:5: lv_enumType_4_0= ruleEnumType
            {

            					newCompositeNode(grammarAccess.getChild1_1Access().getEnumTypeEnumTypeEnumRuleCall_3_0());
            				
            pushFollow(FollowSets000.FOLLOW_9);
            lv_enumType_4_0=ruleEnumType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChild1_1Rule());
            					}
            					set(
            						current,
            						"enumType",
            						lv_enumType_4_0,
            						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.EnumType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getChild1_1Access().getChild1Keyword_4());
            		
            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChild1_1Access().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleChild1_1"


    // $ANTLR start "entryRuleChild1_2"
    // InternalBug348427TestLanguage.g:747:1: entryRuleChild1_2 returns [EObject current=null] : iv_ruleChild1_2= ruleChild1_2 EOF ;
    public final EObject entryRuleChild1_2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild1_2 = null;


        try {
            // InternalBug348427TestLanguage.g:747:49: (iv_ruleChild1_2= ruleChild1_2 EOF )
            // InternalBug348427TestLanguage.g:748:2: iv_ruleChild1_2= ruleChild1_2 EOF
            {
             newCompositeNode(grammarAccess.getChild1_2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild1_2=ruleChild1_2();

            state._fsp--;

             current =iv_ruleChild1_2; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleChild1_2"


    // $ANTLR start "ruleChild1_2"
    // InternalBug348427TestLanguage.g:754:1: ruleChild1_2 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child2' otherlv_6= 'end' ) ;
    public final EObject ruleChild1_2() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_bool_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_enumType_4_0 = null;


        try {
            // InternalBug348427TestLanguage.g:755:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child2' otherlv_6= 'end' ) )
            // InternalBug348427TestLanguage.g:756:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child2' otherlv_6= 'end' )
            {
            // InternalBug348427TestLanguage.g:756:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child2' otherlv_6= 'end' )
            // InternalBug348427TestLanguage.g:757:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child2' otherlv_6= 'end'
            {
            // InternalBug348427TestLanguage.g:757:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBug348427TestLanguage.g:758:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBug348427TestLanguage.g:758:4: (lv_name_0_0= RULE_ID )
            // InternalBug348427TestLanguage.g:759:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getChild1_2Access().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChild1_2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getChild1_2Access().getColonKeyword_1());
            		
            // InternalBug348427TestLanguage.g:779:3: ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBug348427TestLanguage.g:780:4: ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword'
                    {
                    // InternalBug348427TestLanguage.g:780:4: ( (lv_bool_2_0= 'bool' ) )
                    // InternalBug348427TestLanguage.g:781:5: (lv_bool_2_0= 'bool' )
                    {
                    // InternalBug348427TestLanguage.g:781:5: (lv_bool_2_0= 'bool' )
                    // InternalBug348427TestLanguage.g:782:6: lv_bool_2_0= 'bool'
                    {
                    lv_bool_2_0=(Token)match(input,17,FollowSets000.FOLLOW_8); 

                    						newLeafNode(lv_bool_2_0, grammarAccess.getChild1_2Access().getBoolBoolKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild1_2Rule());
                    						}
                    						setWithLastConsumed(current, "bool", lv_bool_2_0 != null, "bool");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getChild1_2Access().getKeywordKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBug348427TestLanguage.g:799:3: ( (lv_enumType_4_0= ruleEnumType ) )
            // InternalBug348427TestLanguage.g:800:4: (lv_enumType_4_0= ruleEnumType )
            {
            // InternalBug348427TestLanguage.g:800:4: (lv_enumType_4_0= ruleEnumType )
            // InternalBug348427TestLanguage.g:801:5: lv_enumType_4_0= ruleEnumType
            {

            					newCompositeNode(grammarAccess.getChild1_2Access().getEnumTypeEnumTypeEnumRuleCall_3_0());
            				
            pushFollow(FollowSets000.FOLLOW_11);
            lv_enumType_4_0=ruleEnumType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChild1_2Rule());
            					}
            					set(
            						current,
            						"enumType",
            						lv_enumType_4_0,
            						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.EnumType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getChild1_2Access().getChild2Keyword_4());
            		
            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChild1_2Access().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleChild1_2"


    // $ANTLR start "entryRuleChild1_3"
    // InternalBug348427TestLanguage.g:830:1: entryRuleChild1_3 returns [EObject current=null] : iv_ruleChild1_3= ruleChild1_3 EOF ;
    public final EObject entryRuleChild1_3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild1_3 = null;


        try {
            // InternalBug348427TestLanguage.g:830:49: (iv_ruleChild1_3= ruleChild1_3 EOF )
            // InternalBug348427TestLanguage.g:831:2: iv_ruleChild1_3= ruleChild1_3 EOF
            {
             newCompositeNode(grammarAccess.getChild1_3Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild1_3=ruleChild1_3();

            state._fsp--;

             current =iv_ruleChild1_3; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleChild1_3"


    // $ANTLR start "ruleChild1_3"
    // InternalBug348427TestLanguage.g:837:1: ruleChild1_3 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child3' otherlv_6= 'end' ) ;
    public final EObject ruleChild1_3() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_bool_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_enumType_4_0 = null;


        try {
            // InternalBug348427TestLanguage.g:838:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child3' otherlv_6= 'end' ) )
            // InternalBug348427TestLanguage.g:839:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child3' otherlv_6= 'end' )
            {
            // InternalBug348427TestLanguage.g:839:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child3' otherlv_6= 'end' )
            // InternalBug348427TestLanguage.g:840:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( (lv_enumType_4_0= ruleEnumType ) ) otherlv_5= 'child3' otherlv_6= 'end'
            {
            // InternalBug348427TestLanguage.g:840:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBug348427TestLanguage.g:841:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBug348427TestLanguage.g:841:4: (lv_name_0_0= RULE_ID )
            // InternalBug348427TestLanguage.g:842:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getChild1_3Access().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChild1_3Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getChild1_3Access().getColonKeyword_1());
            		
            // InternalBug348427TestLanguage.g:862:3: ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalBug348427TestLanguage.g:863:4: ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword'
                    {
                    // InternalBug348427TestLanguage.g:863:4: ( (lv_bool_2_0= 'bool' ) )
                    // InternalBug348427TestLanguage.g:864:5: (lv_bool_2_0= 'bool' )
                    {
                    // InternalBug348427TestLanguage.g:864:5: (lv_bool_2_0= 'bool' )
                    // InternalBug348427TestLanguage.g:865:6: lv_bool_2_0= 'bool'
                    {
                    lv_bool_2_0=(Token)match(input,17,FollowSets000.FOLLOW_8); 

                    						newLeafNode(lv_bool_2_0, grammarAccess.getChild1_3Access().getBoolBoolKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild1_3Rule());
                    						}
                    						setWithLastConsumed(current, "bool", lv_bool_2_0 != null, "bool");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getChild1_3Access().getKeywordKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBug348427TestLanguage.g:882:3: ( (lv_enumType_4_0= ruleEnumType ) )
            // InternalBug348427TestLanguage.g:883:4: (lv_enumType_4_0= ruleEnumType )
            {
            // InternalBug348427TestLanguage.g:883:4: (lv_enumType_4_0= ruleEnumType )
            // InternalBug348427TestLanguage.g:884:5: lv_enumType_4_0= ruleEnumType
            {

            					newCompositeNode(grammarAccess.getChild1_3Access().getEnumTypeEnumTypeEnumRuleCall_3_0());
            				
            pushFollow(FollowSets000.FOLLOW_12);
            lv_enumType_4_0=ruleEnumType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChild1_3Rule());
            					}
            					set(
            						current,
            						"enumType",
            						lv_enumType_4_0,
            						"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.EnumType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getChild1_3Access().getChild3Keyword_4());
            		
            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChild1_3Access().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleChild1_3"


    // $ANTLR start "entryRuleScenario2_1"
    // InternalBug348427TestLanguage.g:913:1: entryRuleScenario2_1 returns [EObject current=null] : iv_ruleScenario2_1= ruleScenario2_1 EOF ;
    public final EObject entryRuleScenario2_1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario2_1 = null;


        try {
            // InternalBug348427TestLanguage.g:913:52: (iv_ruleScenario2_1= ruleScenario2_1 EOF )
            // InternalBug348427TestLanguage.g:914:2: iv_ruleScenario2_1= ruleScenario2_1 EOF
            {
             newCompositeNode(grammarAccess.getScenario2_1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario2_1=ruleScenario2_1();

            state._fsp--;

             current =iv_ruleScenario2_1; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario2_1"


    // $ANTLR start "ruleScenario2_1"
    // InternalBug348427TestLanguage.g:920:1: ruleScenario2_1 returns [EObject current=null] : (otherlv_0= '2.1' ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) ) otherlv_4= 'next' ) ;
    public final EObject ruleScenario2_1() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_child_1_0 = null;

        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;


        try {
            // InternalBug348427TestLanguage.g:921:1: ( (otherlv_0= '2.1' ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) ) otherlv_4= 'next' ) )
            // InternalBug348427TestLanguage.g:922:2: (otherlv_0= '2.1' ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) ) otherlv_4= 'next' )
            {
            // InternalBug348427TestLanguage.g:922:2: (otherlv_0= '2.1' ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) ) otherlv_4= 'next' )
            // InternalBug348427TestLanguage.g:923:3: otherlv_0= '2.1' ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) ) otherlv_4= 'next'
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScenario2_1Access().getDigitTwoFullStopDigitOneKeyword_0());
            		
            // InternalBug348427TestLanguage.g:927:3: ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) )
            int alt9=3;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalBug348427TestLanguage.g:928:4: ( (lv_child_1_0= ruleChild2_1 ) )
                    {
                    // InternalBug348427TestLanguage.g:928:4: ( (lv_child_1_0= ruleChild2_1 ) )
                    // InternalBug348427TestLanguage.g:929:5: (lv_child_1_0= ruleChild2_1 )
                    {
                    // InternalBug348427TestLanguage.g:929:5: (lv_child_1_0= ruleChild2_1 )
                    // InternalBug348427TestLanguage.g:930:6: lv_child_1_0= ruleChild2_1
                    {

                    						newCompositeNode(grammarAccess.getScenario2_1Access().getChildChild2_1ParserRuleCall_1_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_1_0=ruleChild2_1();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_1Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_1_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_1");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:948:4: ( (lv_child_2_0= ruleChild2_2 ) )
                    {
                    // InternalBug348427TestLanguage.g:948:4: ( (lv_child_2_0= ruleChild2_2 ) )
                    // InternalBug348427TestLanguage.g:949:5: (lv_child_2_0= ruleChild2_2 )
                    {
                    // InternalBug348427TestLanguage.g:949:5: (lv_child_2_0= ruleChild2_2 )
                    // InternalBug348427TestLanguage.g:950:6: lv_child_2_0= ruleChild2_2
                    {

                    						newCompositeNode(grammarAccess.getScenario2_1Access().getChildChild2_2ParserRuleCall_1_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_2_0=ruleChild2_2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_1Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_2_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_2");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBug348427TestLanguage.g:968:4: ( (lv_child_3_0= ruleChild2_3 ) )
                    {
                    // InternalBug348427TestLanguage.g:968:4: ( (lv_child_3_0= ruleChild2_3 ) )
                    // InternalBug348427TestLanguage.g:969:5: (lv_child_3_0= ruleChild2_3 )
                    {
                    // InternalBug348427TestLanguage.g:969:5: (lv_child_3_0= ruleChild2_3 )
                    // InternalBug348427TestLanguage.g:970:6: lv_child_3_0= ruleChild2_3
                    {

                    						newCompositeNode(grammarAccess.getScenario2_1Access().getChildChild2_3ParserRuleCall_1_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_3_0=ruleChild2_3();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_1Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_3_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_3");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getScenario2_1Access().getNextKeyword_2());
            		

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
    // $ANTLR end "ruleScenario2_1"


    // $ANTLR start "entryRuleScenario2_2"
    // InternalBug348427TestLanguage.g:996:1: entryRuleScenario2_2 returns [EObject current=null] : iv_ruleScenario2_2= ruleScenario2_2 EOF ;
    public final EObject entryRuleScenario2_2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario2_2 = null;


        try {
            // InternalBug348427TestLanguage.g:996:52: (iv_ruleScenario2_2= ruleScenario2_2 EOF )
            // InternalBug348427TestLanguage.g:997:2: iv_ruleScenario2_2= ruleScenario2_2 EOF
            {
             newCompositeNode(grammarAccess.getScenario2_2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario2_2=ruleScenario2_2();

            state._fsp--;

             current =iv_ruleScenario2_2; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario2_2"


    // $ANTLR start "ruleScenario2_2"
    // InternalBug348427TestLanguage.g:1003:1: ruleScenario2_2 returns [EObject current=null] : (otherlv_0= '2.2' ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) )+ otherlv_4= 'next' ) ;
    public final EObject ruleScenario2_2() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_child_1_0 = null;

        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;


        try {
            // InternalBug348427TestLanguage.g:1004:1: ( (otherlv_0= '2.2' ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) )+ otherlv_4= 'next' ) )
            // InternalBug348427TestLanguage.g:1005:2: (otherlv_0= '2.2' ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) )+ otherlv_4= 'next' )
            {
            // InternalBug348427TestLanguage.g:1005:2: (otherlv_0= '2.2' ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) )+ otherlv_4= 'next' )
            // InternalBug348427TestLanguage.g:1006:3: otherlv_0= '2.2' ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) )+ otherlv_4= 'next'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScenario2_2Access().getDigitTwoFullStopDigitTwoKeyword_0());
            		
            // InternalBug348427TestLanguage.g:1010:3: ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=4;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalBug348427TestLanguage.g:1011:4: ( (lv_child_1_0= ruleChild2_1 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1011:4: ( (lv_child_1_0= ruleChild2_1 ) )
            	    // InternalBug348427TestLanguage.g:1012:5: (lv_child_1_0= ruleChild2_1 )
            	    {
            	    // InternalBug348427TestLanguage.g:1012:5: (lv_child_1_0= ruleChild2_1 )
            	    // InternalBug348427TestLanguage.g:1013:6: lv_child_1_0= ruleChild2_1
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_2Access().getChildChild2_1ParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_1_0=ruleChild2_1();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_2Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_1_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_1");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBug348427TestLanguage.g:1031:4: ( (lv_child_2_0= ruleChild2_2 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1031:4: ( (lv_child_2_0= ruleChild2_2 ) )
            	    // InternalBug348427TestLanguage.g:1032:5: (lv_child_2_0= ruleChild2_2 )
            	    {
            	    // InternalBug348427TestLanguage.g:1032:5: (lv_child_2_0= ruleChild2_2 )
            	    // InternalBug348427TestLanguage.g:1033:6: lv_child_2_0= ruleChild2_2
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_2Access().getChildChild2_2ParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_2_0=ruleChild2_2();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_2Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_2_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_2");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBug348427TestLanguage.g:1051:4: ( (lv_child_3_0= ruleChild2_3 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1051:4: ( (lv_child_3_0= ruleChild2_3 ) )
            	    // InternalBug348427TestLanguage.g:1052:5: (lv_child_3_0= ruleChild2_3 )
            	    {
            	    // InternalBug348427TestLanguage.g:1052:5: (lv_child_3_0= ruleChild2_3 )
            	    // InternalBug348427TestLanguage.g:1053:6: lv_child_3_0= ruleChild2_3
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_2Access().getChildChild2_3ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_3_0=ruleChild2_3();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_2Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_3_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_3");
            	    						afterParserOrEnumRuleCall();
            	    					

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

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getScenario2_2Access().getNextKeyword_2());
            		

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
    // $ANTLR end "ruleScenario2_2"


    // $ANTLR start "entryRuleScenario2_3"
    // InternalBug348427TestLanguage.g:1079:1: entryRuleScenario2_3 returns [EObject current=null] : iv_ruleScenario2_3= ruleScenario2_3 EOF ;
    public final EObject entryRuleScenario2_3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario2_3 = null;


        try {
            // InternalBug348427TestLanguage.g:1079:52: (iv_ruleScenario2_3= ruleScenario2_3 EOF )
            // InternalBug348427TestLanguage.g:1080:2: iv_ruleScenario2_3= ruleScenario2_3 EOF
            {
             newCompositeNode(grammarAccess.getScenario2_3Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario2_3=ruleScenario2_3();

            state._fsp--;

             current =iv_ruleScenario2_3; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario2_3"


    // $ANTLR start "ruleScenario2_3"
    // InternalBug348427TestLanguage.g:1086:1: ruleScenario2_3 returns [EObject current=null] : (otherlv_0= '2.3' ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) ) otherlv_4= 'next' ) ;
    public final EObject ruleScenario2_3() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_child_1_0 = null;

        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;


        try {
            // InternalBug348427TestLanguage.g:1087:1: ( (otherlv_0= '2.3' ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) ) otherlv_4= 'next' ) )
            // InternalBug348427TestLanguage.g:1088:2: (otherlv_0= '2.3' ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) ) otherlv_4= 'next' )
            {
            // InternalBug348427TestLanguage.g:1088:2: (otherlv_0= '2.3' ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) ) otherlv_4= 'next' )
            // InternalBug348427TestLanguage.g:1089:3: otherlv_0= '2.3' ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) ) otherlv_4= 'next'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScenario2_3Access().getDigitTwoFullStopDigitThreeKeyword_0());
            		
            // InternalBug348427TestLanguage.g:1093:3: ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalBug348427TestLanguage.g:1094:4: ( (lv_child_1_0= ruleChild2_4 ) )
                    {
                    // InternalBug348427TestLanguage.g:1094:4: ( (lv_child_1_0= ruleChild2_4 ) )
                    // InternalBug348427TestLanguage.g:1095:5: (lv_child_1_0= ruleChild2_4 )
                    {
                    // InternalBug348427TestLanguage.g:1095:5: (lv_child_1_0= ruleChild2_4 )
                    // InternalBug348427TestLanguage.g:1096:6: lv_child_1_0= ruleChild2_4
                    {

                    						newCompositeNode(grammarAccess.getScenario2_3Access().getChildChild2_4ParserRuleCall_1_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_1_0=ruleChild2_4();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_3Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_1_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_4");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:1114:4: ( (lv_child_2_0= ruleChild2_5 ) )
                    {
                    // InternalBug348427TestLanguage.g:1114:4: ( (lv_child_2_0= ruleChild2_5 ) )
                    // InternalBug348427TestLanguage.g:1115:5: (lv_child_2_0= ruleChild2_5 )
                    {
                    // InternalBug348427TestLanguage.g:1115:5: (lv_child_2_0= ruleChild2_5 )
                    // InternalBug348427TestLanguage.g:1116:6: lv_child_2_0= ruleChild2_5
                    {

                    						newCompositeNode(grammarAccess.getScenario2_3Access().getChildChild2_5ParserRuleCall_1_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_2_0=ruleChild2_5();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_3Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_2_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_5");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBug348427TestLanguage.g:1134:4: ( (lv_child_3_0= ruleChild2_6 ) )
                    {
                    // InternalBug348427TestLanguage.g:1134:4: ( (lv_child_3_0= ruleChild2_6 ) )
                    // InternalBug348427TestLanguage.g:1135:5: (lv_child_3_0= ruleChild2_6 )
                    {
                    // InternalBug348427TestLanguage.g:1135:5: (lv_child_3_0= ruleChild2_6 )
                    // InternalBug348427TestLanguage.g:1136:6: lv_child_3_0= ruleChild2_6
                    {

                    						newCompositeNode(grammarAccess.getScenario2_3Access().getChildChild2_6ParserRuleCall_1_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_3_0=ruleChild2_6();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_3Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_3_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_6");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getScenario2_3Access().getNextKeyword_2());
            		

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
    // $ANTLR end "ruleScenario2_3"


    // $ANTLR start "entryRuleScenario2_4"
    // InternalBug348427TestLanguage.g:1162:1: entryRuleScenario2_4 returns [EObject current=null] : iv_ruleScenario2_4= ruleScenario2_4 EOF ;
    public final EObject entryRuleScenario2_4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario2_4 = null;


        try {
            // InternalBug348427TestLanguage.g:1162:52: (iv_ruleScenario2_4= ruleScenario2_4 EOF )
            // InternalBug348427TestLanguage.g:1163:2: iv_ruleScenario2_4= ruleScenario2_4 EOF
            {
             newCompositeNode(grammarAccess.getScenario2_4Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario2_4=ruleScenario2_4();

            state._fsp--;

             current =iv_ruleScenario2_4; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario2_4"


    // $ANTLR start "ruleScenario2_4"
    // InternalBug348427TestLanguage.g:1169:1: ruleScenario2_4 returns [EObject current=null] : (otherlv_0= '2.4' ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) )+ otherlv_4= 'next' ) ;
    public final EObject ruleScenario2_4() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_child_1_0 = null;

        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;


        try {
            // InternalBug348427TestLanguage.g:1170:1: ( (otherlv_0= '2.4' ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) )+ otherlv_4= 'next' ) )
            // InternalBug348427TestLanguage.g:1171:2: (otherlv_0= '2.4' ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) )+ otherlv_4= 'next' )
            {
            // InternalBug348427TestLanguage.g:1171:2: (otherlv_0= '2.4' ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) )+ otherlv_4= 'next' )
            // InternalBug348427TestLanguage.g:1172:3: otherlv_0= '2.4' ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) )+ otherlv_4= 'next'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScenario2_4Access().getDigitTwoFullStopDigitFourKeyword_0());
            		
            // InternalBug348427TestLanguage.g:1176:3: ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=4;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // InternalBug348427TestLanguage.g:1177:4: ( (lv_child_1_0= ruleChild2_4 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1177:4: ( (lv_child_1_0= ruleChild2_4 ) )
            	    // InternalBug348427TestLanguage.g:1178:5: (lv_child_1_0= ruleChild2_4 )
            	    {
            	    // InternalBug348427TestLanguage.g:1178:5: (lv_child_1_0= ruleChild2_4 )
            	    // InternalBug348427TestLanguage.g:1179:6: lv_child_1_0= ruleChild2_4
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_4Access().getChildChild2_4ParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_1_0=ruleChild2_4();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_4Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_1_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_4");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBug348427TestLanguage.g:1197:4: ( (lv_child_2_0= ruleChild2_5 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1197:4: ( (lv_child_2_0= ruleChild2_5 ) )
            	    // InternalBug348427TestLanguage.g:1198:5: (lv_child_2_0= ruleChild2_5 )
            	    {
            	    // InternalBug348427TestLanguage.g:1198:5: (lv_child_2_0= ruleChild2_5 )
            	    // InternalBug348427TestLanguage.g:1199:6: lv_child_2_0= ruleChild2_5
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_4Access().getChildChild2_5ParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_2_0=ruleChild2_5();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_4Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_2_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_5");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBug348427TestLanguage.g:1217:4: ( (lv_child_3_0= ruleChild2_6 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1217:4: ( (lv_child_3_0= ruleChild2_6 ) )
            	    // InternalBug348427TestLanguage.g:1218:5: (lv_child_3_0= ruleChild2_6 )
            	    {
            	    // InternalBug348427TestLanguage.g:1218:5: (lv_child_3_0= ruleChild2_6 )
            	    // InternalBug348427TestLanguage.g:1219:6: lv_child_3_0= ruleChild2_6
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_4Access().getChildChild2_6ParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_3_0=ruleChild2_6();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_4Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_3_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_6");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getScenario2_4Access().getNextKeyword_2());
            		

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
    // $ANTLR end "ruleScenario2_4"


    // $ANTLR start "entryRuleScenario2_5"
    // InternalBug348427TestLanguage.g:1245:1: entryRuleScenario2_5 returns [EObject current=null] : iv_ruleScenario2_5= ruleScenario2_5 EOF ;
    public final EObject entryRuleScenario2_5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario2_5 = null;


        try {
            // InternalBug348427TestLanguage.g:1245:52: (iv_ruleScenario2_5= ruleScenario2_5 EOF )
            // InternalBug348427TestLanguage.g:1246:2: iv_ruleScenario2_5= ruleScenario2_5 EOF
            {
             newCompositeNode(grammarAccess.getScenario2_5Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario2_5=ruleScenario2_5();

            state._fsp--;

             current =iv_ruleScenario2_5; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario2_5"


    // $ANTLR start "ruleScenario2_5"
    // InternalBug348427TestLanguage.g:1252:1: ruleScenario2_5 returns [EObject current=null] : ( () otherlv_1= '2.5' ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )? otherlv_5= 'next' ) ;
    public final EObject ruleScenario2_5() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;

        EObject lv_child_4_0 = null;


        try {
            // InternalBug348427TestLanguage.g:1253:1: ( ( () otherlv_1= '2.5' ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )? otherlv_5= 'next' ) )
            // InternalBug348427TestLanguage.g:1254:2: ( () otherlv_1= '2.5' ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )? otherlv_5= 'next' )
            {
            // InternalBug348427TestLanguage.g:1254:2: ( () otherlv_1= '2.5' ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )? otherlv_5= 'next' )
            // InternalBug348427TestLanguage.g:1255:3: () otherlv_1= '2.5' ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )? otherlv_5= 'next'
            {
            // InternalBug348427TestLanguage.g:1255:3: ()
            // InternalBug348427TestLanguage.g:1256:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScenario2_5Access().getScenario2Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getScenario2_5Access().getDigitTwoFullStopDigitFiveKeyword_1());
            		
            // InternalBug348427TestLanguage.g:1266:3: ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )?
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalBug348427TestLanguage.g:1267:4: ( (lv_child_2_0= ruleChild2_1 ) )
                    {
                    // InternalBug348427TestLanguage.g:1267:4: ( (lv_child_2_0= ruleChild2_1 ) )
                    // InternalBug348427TestLanguage.g:1268:5: (lv_child_2_0= ruleChild2_1 )
                    {
                    // InternalBug348427TestLanguage.g:1268:5: (lv_child_2_0= ruleChild2_1 )
                    // InternalBug348427TestLanguage.g:1269:6: lv_child_2_0= ruleChild2_1
                    {

                    						newCompositeNode(grammarAccess.getScenario2_5Access().getChildChild2_1ParserRuleCall_2_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_2_0=ruleChild2_1();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_5Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_2_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_1");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:1287:4: ( (lv_child_3_0= ruleChild2_2 ) )
                    {
                    // InternalBug348427TestLanguage.g:1287:4: ( (lv_child_3_0= ruleChild2_2 ) )
                    // InternalBug348427TestLanguage.g:1288:5: (lv_child_3_0= ruleChild2_2 )
                    {
                    // InternalBug348427TestLanguage.g:1288:5: (lv_child_3_0= ruleChild2_2 )
                    // InternalBug348427TestLanguage.g:1289:6: lv_child_3_0= ruleChild2_2
                    {

                    						newCompositeNode(grammarAccess.getScenario2_5Access().getChildChild2_2ParserRuleCall_2_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_3_0=ruleChild2_2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_5Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_3_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_2");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBug348427TestLanguage.g:1307:4: ( (lv_child_4_0= ruleChild2_3 ) )
                    {
                    // InternalBug348427TestLanguage.g:1307:4: ( (lv_child_4_0= ruleChild2_3 ) )
                    // InternalBug348427TestLanguage.g:1308:5: (lv_child_4_0= ruleChild2_3 )
                    {
                    // InternalBug348427TestLanguage.g:1308:5: (lv_child_4_0= ruleChild2_3 )
                    // InternalBug348427TestLanguage.g:1309:6: lv_child_4_0= ruleChild2_3
                    {

                    						newCompositeNode(grammarAccess.getScenario2_5Access().getChildChild2_3ParserRuleCall_2_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_4_0=ruleChild2_3();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_5Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_4_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_3");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getScenario2_5Access().getNextKeyword_3());
            		

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
    // $ANTLR end "ruleScenario2_5"


    // $ANTLR start "entryRuleScenario2_6"
    // InternalBug348427TestLanguage.g:1335:1: entryRuleScenario2_6 returns [EObject current=null] : iv_ruleScenario2_6= ruleScenario2_6 EOF ;
    public final EObject entryRuleScenario2_6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario2_6 = null;


        try {
            // InternalBug348427TestLanguage.g:1335:52: (iv_ruleScenario2_6= ruleScenario2_6 EOF )
            // InternalBug348427TestLanguage.g:1336:2: iv_ruleScenario2_6= ruleScenario2_6 EOF
            {
             newCompositeNode(grammarAccess.getScenario2_6Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario2_6=ruleScenario2_6();

            state._fsp--;

             current =iv_ruleScenario2_6; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario2_6"


    // $ANTLR start "ruleScenario2_6"
    // InternalBug348427TestLanguage.g:1342:1: ruleScenario2_6 returns [EObject current=null] : ( () otherlv_1= '2.6' ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )* otherlv_5= 'next' ) ;
    public final EObject ruleScenario2_6() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;

        EObject lv_child_4_0 = null;


        try {
            // InternalBug348427TestLanguage.g:1343:1: ( ( () otherlv_1= '2.6' ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )* otherlv_5= 'next' ) )
            // InternalBug348427TestLanguage.g:1344:2: ( () otherlv_1= '2.6' ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )* otherlv_5= 'next' )
            {
            // InternalBug348427TestLanguage.g:1344:2: ( () otherlv_1= '2.6' ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )* otherlv_5= 'next' )
            // InternalBug348427TestLanguage.g:1345:3: () otherlv_1= '2.6' ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )* otherlv_5= 'next'
            {
            // InternalBug348427TestLanguage.g:1345:3: ()
            // InternalBug348427TestLanguage.g:1346:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScenario2_6Access().getScenario2Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getScenario2_6Access().getDigitTwoFullStopDigitSixKeyword_1());
            		
            // InternalBug348427TestLanguage.g:1356:3: ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )*
            loop14:
            do {
                int alt14=4;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // InternalBug348427TestLanguage.g:1357:4: ( (lv_child_2_0= ruleChild2_1 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1357:4: ( (lv_child_2_0= ruleChild2_1 ) )
            	    // InternalBug348427TestLanguage.g:1358:5: (lv_child_2_0= ruleChild2_1 )
            	    {
            	    // InternalBug348427TestLanguage.g:1358:5: (lv_child_2_0= ruleChild2_1 )
            	    // InternalBug348427TestLanguage.g:1359:6: lv_child_2_0= ruleChild2_1
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_6Access().getChildChild2_1ParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_2_0=ruleChild2_1();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_6Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_2_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_1");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBug348427TestLanguage.g:1377:4: ( (lv_child_3_0= ruleChild2_2 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1377:4: ( (lv_child_3_0= ruleChild2_2 ) )
            	    // InternalBug348427TestLanguage.g:1378:5: (lv_child_3_0= ruleChild2_2 )
            	    {
            	    // InternalBug348427TestLanguage.g:1378:5: (lv_child_3_0= ruleChild2_2 )
            	    // InternalBug348427TestLanguage.g:1379:6: lv_child_3_0= ruleChild2_2
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_6Access().getChildChild2_2ParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_3_0=ruleChild2_2();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_6Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_3_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_2");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBug348427TestLanguage.g:1397:4: ( (lv_child_4_0= ruleChild2_3 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1397:4: ( (lv_child_4_0= ruleChild2_3 ) )
            	    // InternalBug348427TestLanguage.g:1398:5: (lv_child_4_0= ruleChild2_3 )
            	    {
            	    // InternalBug348427TestLanguage.g:1398:5: (lv_child_4_0= ruleChild2_3 )
            	    // InternalBug348427TestLanguage.g:1399:6: lv_child_4_0= ruleChild2_3
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_6Access().getChildChild2_3ParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_4_0=ruleChild2_3();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_6Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_4_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_3");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getScenario2_6Access().getNextKeyword_3());
            		

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
    // $ANTLR end "ruleScenario2_6"


    // $ANTLR start "entryRuleScenario2_7"
    // InternalBug348427TestLanguage.g:1425:1: entryRuleScenario2_7 returns [EObject current=null] : iv_ruleScenario2_7= ruleScenario2_7 EOF ;
    public final EObject entryRuleScenario2_7() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario2_7 = null;


        try {
            // InternalBug348427TestLanguage.g:1425:52: (iv_ruleScenario2_7= ruleScenario2_7 EOF )
            // InternalBug348427TestLanguage.g:1426:2: iv_ruleScenario2_7= ruleScenario2_7 EOF
            {
             newCompositeNode(grammarAccess.getScenario2_7Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario2_7=ruleScenario2_7();

            state._fsp--;

             current =iv_ruleScenario2_7; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario2_7"


    // $ANTLR start "ruleScenario2_7"
    // InternalBug348427TestLanguage.g:1432:1: ruleScenario2_7 returns [EObject current=null] : ( () otherlv_1= '2.7' ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )? otherlv_5= 'next' ) ;
    public final EObject ruleScenario2_7() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;

        EObject lv_child_4_0 = null;


        try {
            // InternalBug348427TestLanguage.g:1433:1: ( ( () otherlv_1= '2.7' ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )? otherlv_5= 'next' ) )
            // InternalBug348427TestLanguage.g:1434:2: ( () otherlv_1= '2.7' ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )? otherlv_5= 'next' )
            {
            // InternalBug348427TestLanguage.g:1434:2: ( () otherlv_1= '2.7' ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )? otherlv_5= 'next' )
            // InternalBug348427TestLanguage.g:1435:3: () otherlv_1= '2.7' ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )? otherlv_5= 'next'
            {
            // InternalBug348427TestLanguage.g:1435:3: ()
            // InternalBug348427TestLanguage.g:1436:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScenario2_7Access().getScenario2Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getScenario2_7Access().getDigitTwoFullStopDigitSevenKeyword_1());
            		
            // InternalBug348427TestLanguage.g:1446:3: ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )?
            int alt15=4;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalBug348427TestLanguage.g:1447:4: ( (lv_child_2_0= ruleChild2_4 ) )
                    {
                    // InternalBug348427TestLanguage.g:1447:4: ( (lv_child_2_0= ruleChild2_4 ) )
                    // InternalBug348427TestLanguage.g:1448:5: (lv_child_2_0= ruleChild2_4 )
                    {
                    // InternalBug348427TestLanguage.g:1448:5: (lv_child_2_0= ruleChild2_4 )
                    // InternalBug348427TestLanguage.g:1449:6: lv_child_2_0= ruleChild2_4
                    {

                    						newCompositeNode(grammarAccess.getScenario2_7Access().getChildChild2_4ParserRuleCall_2_0_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_2_0=ruleChild2_4();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_7Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_2_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_4");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:1467:4: ( (lv_child_3_0= ruleChild2_5 ) )
                    {
                    // InternalBug348427TestLanguage.g:1467:4: ( (lv_child_3_0= ruleChild2_5 ) )
                    // InternalBug348427TestLanguage.g:1468:5: (lv_child_3_0= ruleChild2_5 )
                    {
                    // InternalBug348427TestLanguage.g:1468:5: (lv_child_3_0= ruleChild2_5 )
                    // InternalBug348427TestLanguage.g:1469:6: lv_child_3_0= ruleChild2_5
                    {

                    						newCompositeNode(grammarAccess.getScenario2_7Access().getChildChild2_5ParserRuleCall_2_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_3_0=ruleChild2_5();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_7Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_3_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_5");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalBug348427TestLanguage.g:1487:4: ( (lv_child_4_0= ruleChild2_6 ) )
                    {
                    // InternalBug348427TestLanguage.g:1487:4: ( (lv_child_4_0= ruleChild2_6 ) )
                    // InternalBug348427TestLanguage.g:1488:5: (lv_child_4_0= ruleChild2_6 )
                    {
                    // InternalBug348427TestLanguage.g:1488:5: (lv_child_4_0= ruleChild2_6 )
                    // InternalBug348427TestLanguage.g:1489:6: lv_child_4_0= ruleChild2_6
                    {

                    						newCompositeNode(grammarAccess.getScenario2_7Access().getChildChild2_6ParserRuleCall_2_2_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_4);
                    lv_child_4_0=ruleChild2_6();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScenario2_7Rule());
                    						}
                    						add(
                    							current,
                    							"child",
                    							lv_child_4_0,
                    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_6");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getScenario2_7Access().getNextKeyword_3());
            		

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
    // $ANTLR end "ruleScenario2_7"


    // $ANTLR start "entryRuleScenario2_8"
    // InternalBug348427TestLanguage.g:1515:1: entryRuleScenario2_8 returns [EObject current=null] : iv_ruleScenario2_8= ruleScenario2_8 EOF ;
    public final EObject entryRuleScenario2_8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScenario2_8 = null;


        try {
            // InternalBug348427TestLanguage.g:1515:52: (iv_ruleScenario2_8= ruleScenario2_8 EOF )
            // InternalBug348427TestLanguage.g:1516:2: iv_ruleScenario2_8= ruleScenario2_8 EOF
            {
             newCompositeNode(grammarAccess.getScenario2_8Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScenario2_8=ruleScenario2_8();

            state._fsp--;

             current =iv_ruleScenario2_8; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleScenario2_8"


    // $ANTLR start "ruleScenario2_8"
    // InternalBug348427TestLanguage.g:1522:1: ruleScenario2_8 returns [EObject current=null] : ( () otherlv_1= '2.8' ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )* otherlv_5= 'next' ) ;
    public final EObject ruleScenario2_8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_child_2_0 = null;

        EObject lv_child_3_0 = null;

        EObject lv_child_4_0 = null;


        try {
            // InternalBug348427TestLanguage.g:1523:1: ( ( () otherlv_1= '2.8' ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )* otherlv_5= 'next' ) )
            // InternalBug348427TestLanguage.g:1524:2: ( () otherlv_1= '2.8' ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )* otherlv_5= 'next' )
            {
            // InternalBug348427TestLanguage.g:1524:2: ( () otherlv_1= '2.8' ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )* otherlv_5= 'next' )
            // InternalBug348427TestLanguage.g:1525:3: () otherlv_1= '2.8' ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )* otherlv_5= 'next'
            {
            // InternalBug348427TestLanguage.g:1525:3: ()
            // InternalBug348427TestLanguage.g:1526:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScenario2_8Access().getScenario2Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getScenario2_8Access().getDigitTwoFullStopDigitEightKeyword_1());
            		
            // InternalBug348427TestLanguage.g:1536:3: ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )*
            loop16:
            do {
                int alt16=4;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // InternalBug348427TestLanguage.g:1537:4: ( (lv_child_2_0= ruleChild2_4 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1537:4: ( (lv_child_2_0= ruleChild2_4 ) )
            	    // InternalBug348427TestLanguage.g:1538:5: (lv_child_2_0= ruleChild2_4 )
            	    {
            	    // InternalBug348427TestLanguage.g:1538:5: (lv_child_2_0= ruleChild2_4 )
            	    // InternalBug348427TestLanguage.g:1539:6: lv_child_2_0= ruleChild2_4
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_8Access().getChildChild2_4ParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_2_0=ruleChild2_4();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_8Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_2_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_4");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalBug348427TestLanguage.g:1557:4: ( (lv_child_3_0= ruleChild2_5 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1557:4: ( (lv_child_3_0= ruleChild2_5 ) )
            	    // InternalBug348427TestLanguage.g:1558:5: (lv_child_3_0= ruleChild2_5 )
            	    {
            	    // InternalBug348427TestLanguage.g:1558:5: (lv_child_3_0= ruleChild2_5 )
            	    // InternalBug348427TestLanguage.g:1559:6: lv_child_3_0= ruleChild2_5
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_8Access().getChildChild2_5ParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_3_0=ruleChild2_5();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_8Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_3_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_5");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalBug348427TestLanguage.g:1577:4: ( (lv_child_4_0= ruleChild2_6 ) )
            	    {
            	    // InternalBug348427TestLanguage.g:1577:4: ( (lv_child_4_0= ruleChild2_6 ) )
            	    // InternalBug348427TestLanguage.g:1578:5: (lv_child_4_0= ruleChild2_6 )
            	    {
            	    // InternalBug348427TestLanguage.g:1578:5: (lv_child_4_0= ruleChild2_6 )
            	    // InternalBug348427TestLanguage.g:1579:6: lv_child_4_0= ruleChild2_6
            	    {

            	    						newCompositeNode(grammarAccess.getScenario2_8Access().getChildChild2_6ParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_child_4_0=ruleChild2_6();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getScenario2_8Rule());
            	    						}
            	    						add(
            	    							current,
            	    							"child",
            	    							lv_child_4_0,
            	    							"org.eclipse.xtext.ui.tests.editor.contentassist.Bug348427TestLanguage.Child2_6");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getScenario2_8Access().getNextKeyword_3());
            		

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
    // $ANTLR end "ruleScenario2_8"


    // $ANTLR start "entryRuleChild2_1"
    // InternalBug348427TestLanguage.g:1605:1: entryRuleChild2_1 returns [EObject current=null] : iv_ruleChild2_1= ruleChild2_1 EOF ;
    public final EObject entryRuleChild2_1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild2_1 = null;


        try {
            // InternalBug348427TestLanguage.g:1605:49: (iv_ruleChild2_1= ruleChild2_1 EOF )
            // InternalBug348427TestLanguage.g:1606:2: iv_ruleChild2_1= ruleChild2_1 EOF
            {
             newCompositeNode(grammarAccess.getChild2_1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild2_1=ruleChild2_1();

            state._fsp--;

             current =iv_ruleChild2_1; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleChild2_1"


    // $ANTLR start "ruleChild2_1"
    // InternalBug348427TestLanguage.g:1612:1: ruleChild2_1 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child1' otherlv_6= 'end' ) ;
    public final EObject ruleChild2_1() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_bool_2_0=null;
        Token otherlv_3=null;
        Token lv_string_4_1=null;
        Token lv_string_4_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

        try {
            // InternalBug348427TestLanguage.g:1613:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child1' otherlv_6= 'end' ) )
            // InternalBug348427TestLanguage.g:1614:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child1' otherlv_6= 'end' )
            {
            // InternalBug348427TestLanguage.g:1614:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child1' otherlv_6= 'end' )
            // InternalBug348427TestLanguage.g:1615:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child1' otherlv_6= 'end'
            {
            // InternalBug348427TestLanguage.g:1615:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBug348427TestLanguage.g:1616:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBug348427TestLanguage.g:1616:4: (lv_name_0_0= RULE_ID )
            // InternalBug348427TestLanguage.g:1617:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getChild2_1Access().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChild2_1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getChild2_1Access().getColonKeyword_1());
            		
            // InternalBug348427TestLanguage.g:1637:3: ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalBug348427TestLanguage.g:1638:4: ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword'
                    {
                    // InternalBug348427TestLanguage.g:1638:4: ( (lv_bool_2_0= 'bool' ) )
                    // InternalBug348427TestLanguage.g:1639:5: (lv_bool_2_0= 'bool' )
                    {
                    // InternalBug348427TestLanguage.g:1639:5: (lv_bool_2_0= 'bool' )
                    // InternalBug348427TestLanguage.g:1640:6: lv_bool_2_0= 'bool'
                    {
                    lv_bool_2_0=(Token)match(input,17,FollowSets000.FOLLOW_8); 

                    						newLeafNode(lv_bool_2_0, grammarAccess.getChild2_1Access().getBoolBoolKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_1Rule());
                    						}
                    						setWithLastConsumed(current, "bool", lv_bool_2_0 != null, "bool");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getChild2_1Access().getKeywordKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBug348427TestLanguage.g:1657:3: ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) )
            // InternalBug348427TestLanguage.g:1658:4: ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) )
            {
            // InternalBug348427TestLanguage.g:1658:4: ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) )
            // InternalBug348427TestLanguage.g:1659:5: (lv_string_4_1= 'a' | lv_string_4_2= 'b' )
            {
            // InternalBug348427TestLanguage.g:1659:5: (lv_string_4_1= 'a' | lv_string_4_2= 'b' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            else if ( (LA18_0==32) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalBug348427TestLanguage.g:1660:6: lv_string_4_1= 'a'
                    {
                    lv_string_4_1=(Token)match(input,31,FollowSets000.FOLLOW_9); 

                    						newLeafNode(lv_string_4_1, grammarAccess.getChild2_1Access().getStringAKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_1Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_4_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:1671:6: lv_string_4_2= 'b'
                    {
                    lv_string_4_2=(Token)match(input,32,FollowSets000.FOLLOW_9); 

                    						newLeafNode(lv_string_4_2, grammarAccess.getChild2_1Access().getStringBKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_1Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_4_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getChild2_1Access().getChild1Keyword_4());
            		
            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChild2_1Access().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleChild2_1"


    // $ANTLR start "entryRuleChild2_2"
    // InternalBug348427TestLanguage.g:1696:1: entryRuleChild2_2 returns [EObject current=null] : iv_ruleChild2_2= ruleChild2_2 EOF ;
    public final EObject entryRuleChild2_2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild2_2 = null;


        try {
            // InternalBug348427TestLanguage.g:1696:49: (iv_ruleChild2_2= ruleChild2_2 EOF )
            // InternalBug348427TestLanguage.g:1697:2: iv_ruleChild2_2= ruleChild2_2 EOF
            {
             newCompositeNode(grammarAccess.getChild2_2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild2_2=ruleChild2_2();

            state._fsp--;

             current =iv_ruleChild2_2; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleChild2_2"


    // $ANTLR start "ruleChild2_2"
    // InternalBug348427TestLanguage.g:1703:1: ruleChild2_2 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child2' otherlv_6= 'end' ) ;
    public final EObject ruleChild2_2() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_bool_2_0=null;
        Token otherlv_3=null;
        Token lv_string_4_1=null;
        Token lv_string_4_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

        try {
            // InternalBug348427TestLanguage.g:1704:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child2' otherlv_6= 'end' ) )
            // InternalBug348427TestLanguage.g:1705:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child2' otherlv_6= 'end' )
            {
            // InternalBug348427TestLanguage.g:1705:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child2' otherlv_6= 'end' )
            // InternalBug348427TestLanguage.g:1706:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child2' otherlv_6= 'end'
            {
            // InternalBug348427TestLanguage.g:1706:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBug348427TestLanguage.g:1707:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBug348427TestLanguage.g:1707:4: (lv_name_0_0= RULE_ID )
            // InternalBug348427TestLanguage.g:1708:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getChild2_2Access().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChild2_2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getChild2_2Access().getColonKeyword_1());
            		
            // InternalBug348427TestLanguage.g:1728:3: ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalBug348427TestLanguage.g:1729:4: ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword'
                    {
                    // InternalBug348427TestLanguage.g:1729:4: ( (lv_bool_2_0= 'bool' ) )
                    // InternalBug348427TestLanguage.g:1730:5: (lv_bool_2_0= 'bool' )
                    {
                    // InternalBug348427TestLanguage.g:1730:5: (lv_bool_2_0= 'bool' )
                    // InternalBug348427TestLanguage.g:1731:6: lv_bool_2_0= 'bool'
                    {
                    lv_bool_2_0=(Token)match(input,17,FollowSets000.FOLLOW_8); 

                    						newLeafNode(lv_bool_2_0, grammarAccess.getChild2_2Access().getBoolBoolKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_2Rule());
                    						}
                    						setWithLastConsumed(current, "bool", lv_bool_2_0 != null, "bool");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getChild2_2Access().getKeywordKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBug348427TestLanguage.g:1748:3: ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) )
            // InternalBug348427TestLanguage.g:1749:4: ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) )
            {
            // InternalBug348427TestLanguage.g:1749:4: ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) )
            // InternalBug348427TestLanguage.g:1750:5: (lv_string_4_1= 'a' | lv_string_4_2= 'b' )
            {
            // InternalBug348427TestLanguage.g:1750:5: (lv_string_4_1= 'a' | lv_string_4_2= 'b' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            else if ( (LA20_0==32) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalBug348427TestLanguage.g:1751:6: lv_string_4_1= 'a'
                    {
                    lv_string_4_1=(Token)match(input,31,FollowSets000.FOLLOW_11); 

                    						newLeafNode(lv_string_4_1, grammarAccess.getChild2_2Access().getStringAKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_2Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_4_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:1762:6: lv_string_4_2= 'b'
                    {
                    lv_string_4_2=(Token)match(input,32,FollowSets000.FOLLOW_11); 

                    						newLeafNode(lv_string_4_2, grammarAccess.getChild2_2Access().getStringBKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_2Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_4_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getChild2_2Access().getChild2Keyword_4());
            		
            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChild2_2Access().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleChild2_2"


    // $ANTLR start "entryRuleChild2_3"
    // InternalBug348427TestLanguage.g:1787:1: entryRuleChild2_3 returns [EObject current=null] : iv_ruleChild2_3= ruleChild2_3 EOF ;
    public final EObject entryRuleChild2_3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild2_3 = null;


        try {
            // InternalBug348427TestLanguage.g:1787:49: (iv_ruleChild2_3= ruleChild2_3 EOF )
            // InternalBug348427TestLanguage.g:1788:2: iv_ruleChild2_3= ruleChild2_3 EOF
            {
             newCompositeNode(grammarAccess.getChild2_3Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild2_3=ruleChild2_3();

            state._fsp--;

             current =iv_ruleChild2_3; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleChild2_3"


    // $ANTLR start "ruleChild2_3"
    // InternalBug348427TestLanguage.g:1794:1: ruleChild2_3 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child3' otherlv_6= 'end' ) ;
    public final EObject ruleChild2_3() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_bool_2_0=null;
        Token otherlv_3=null;
        Token lv_string_4_1=null;
        Token lv_string_4_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

        try {
            // InternalBug348427TestLanguage.g:1795:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child3' otherlv_6= 'end' ) )
            // InternalBug348427TestLanguage.g:1796:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child3' otherlv_6= 'end' )
            {
            // InternalBug348427TestLanguage.g:1796:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child3' otherlv_6= 'end' )
            // InternalBug348427TestLanguage.g:1797:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) ) otherlv_5= 'child3' otherlv_6= 'end'
            {
            // InternalBug348427TestLanguage.g:1797:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBug348427TestLanguage.g:1798:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBug348427TestLanguage.g:1798:4: (lv_name_0_0= RULE_ID )
            // InternalBug348427TestLanguage.g:1799:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getChild2_3Access().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChild2_3Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getChild2_3Access().getColonKeyword_1());
            		
            // InternalBug348427TestLanguage.g:1819:3: ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalBug348427TestLanguage.g:1820:4: ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword'
                    {
                    // InternalBug348427TestLanguage.g:1820:4: ( (lv_bool_2_0= 'bool' ) )
                    // InternalBug348427TestLanguage.g:1821:5: (lv_bool_2_0= 'bool' )
                    {
                    // InternalBug348427TestLanguage.g:1821:5: (lv_bool_2_0= 'bool' )
                    // InternalBug348427TestLanguage.g:1822:6: lv_bool_2_0= 'bool'
                    {
                    lv_bool_2_0=(Token)match(input,17,FollowSets000.FOLLOW_8); 

                    						newLeafNode(lv_bool_2_0, grammarAccess.getChild2_3Access().getBoolBoolKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_3Rule());
                    						}
                    						setWithLastConsumed(current, "bool", lv_bool_2_0 != null, "bool");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getChild2_3Access().getKeywordKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBug348427TestLanguage.g:1839:3: ( ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) ) )
            // InternalBug348427TestLanguage.g:1840:4: ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) )
            {
            // InternalBug348427TestLanguage.g:1840:4: ( (lv_string_4_1= 'a' | lv_string_4_2= 'b' ) )
            // InternalBug348427TestLanguage.g:1841:5: (lv_string_4_1= 'a' | lv_string_4_2= 'b' )
            {
            // InternalBug348427TestLanguage.g:1841:5: (lv_string_4_1= 'a' | lv_string_4_2= 'b' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            else if ( (LA22_0==32) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalBug348427TestLanguage.g:1842:6: lv_string_4_1= 'a'
                    {
                    lv_string_4_1=(Token)match(input,31,FollowSets000.FOLLOW_12); 

                    						newLeafNode(lv_string_4_1, grammarAccess.getChild2_3Access().getStringAKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_3Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_4_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:1853:6: lv_string_4_2= 'b'
                    {
                    lv_string_4_2=(Token)match(input,32,FollowSets000.FOLLOW_12); 

                    						newLeafNode(lv_string_4_2, grammarAccess.getChild2_3Access().getStringBKeyword_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_3Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_4_2, null);
                    					

                    }
                    break;

            }


            }


            }

            otherlv_5=(Token)match(input,22,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getChild2_3Access().getChild3Keyword_4());
            		
            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getChild2_3Access().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleChild2_3"


    // $ANTLR start "entryRuleChild2_4"
    // InternalBug348427TestLanguage.g:1878:1: entryRuleChild2_4 returns [EObject current=null] : iv_ruleChild2_4= ruleChild2_4 EOF ;
    public final EObject entryRuleChild2_4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild2_4 = null;


        try {
            // InternalBug348427TestLanguage.g:1878:49: (iv_ruleChild2_4= ruleChild2_4 EOF )
            // InternalBug348427TestLanguage.g:1879:2: iv_ruleChild2_4= ruleChild2_4 EOF
            {
             newCompositeNode(grammarAccess.getChild2_4Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild2_4=ruleChild2_4();

            state._fsp--;

             current =iv_ruleChild2_4; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleChild2_4"


    // $ANTLR start "ruleChild2_4"
    // InternalBug348427TestLanguage.g:1885:1: ruleChild2_4 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child1' otherlv_7= 'end' ) ;
    public final EObject ruleChild2_4() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_bool_2_0=null;
        Token otherlv_3=null;
        Token lv_string_4_0=null;
        Token lv_string_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

        try {
            // InternalBug348427TestLanguage.g:1886:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child1' otherlv_7= 'end' ) )
            // InternalBug348427TestLanguage.g:1887:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child1' otherlv_7= 'end' )
            {
            // InternalBug348427TestLanguage.g:1887:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child1' otherlv_7= 'end' )
            // InternalBug348427TestLanguage.g:1888:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child1' otherlv_7= 'end'
            {
            // InternalBug348427TestLanguage.g:1888:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBug348427TestLanguage.g:1889:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBug348427TestLanguage.g:1889:4: (lv_name_0_0= RULE_ID )
            // InternalBug348427TestLanguage.g:1890:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getChild2_4Access().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChild2_4Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getChild2_4Access().getColonKeyword_1());
            		
            // InternalBug348427TestLanguage.g:1910:3: ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBug348427TestLanguage.g:1911:4: ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword'
                    {
                    // InternalBug348427TestLanguage.g:1911:4: ( (lv_bool_2_0= 'bool' ) )
                    // InternalBug348427TestLanguage.g:1912:5: (lv_bool_2_0= 'bool' )
                    {
                    // InternalBug348427TestLanguage.g:1912:5: (lv_bool_2_0= 'bool' )
                    // InternalBug348427TestLanguage.g:1913:6: lv_bool_2_0= 'bool'
                    {
                    lv_bool_2_0=(Token)match(input,17,FollowSets000.FOLLOW_8); 

                    						newLeafNode(lv_bool_2_0, grammarAccess.getChild2_4Access().getBoolBoolKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_4Rule());
                    						}
                    						setWithLastConsumed(current, "bool", lv_bool_2_0 != null, "bool");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getChild2_4Access().getKeywordKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBug348427TestLanguage.g:1930:3: ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            else if ( (LA24_0==32) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalBug348427TestLanguage.g:1931:4: ( (lv_string_4_0= 'a' ) )
                    {
                    // InternalBug348427TestLanguage.g:1931:4: ( (lv_string_4_0= 'a' ) )
                    // InternalBug348427TestLanguage.g:1932:5: (lv_string_4_0= 'a' )
                    {
                    // InternalBug348427TestLanguage.g:1932:5: (lv_string_4_0= 'a' )
                    // InternalBug348427TestLanguage.g:1933:6: lv_string_4_0= 'a'
                    {
                    lv_string_4_0=(Token)match(input,31,FollowSets000.FOLLOW_9); 

                    						newLeafNode(lv_string_4_0, grammarAccess.getChild2_4Access().getStringAKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_4Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_4_0, "a");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:1946:4: ( (lv_string_5_0= 'b' ) )
                    {
                    // InternalBug348427TestLanguage.g:1946:4: ( (lv_string_5_0= 'b' ) )
                    // InternalBug348427TestLanguage.g:1947:5: (lv_string_5_0= 'b' )
                    {
                    // InternalBug348427TestLanguage.g:1947:5: (lv_string_5_0= 'b' )
                    // InternalBug348427TestLanguage.g:1948:6: lv_string_5_0= 'b'
                    {
                    lv_string_5_0=(Token)match(input,32,FollowSets000.FOLLOW_9); 

                    						newLeafNode(lv_string_5_0, grammarAccess.getChild2_4Access().getStringBKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_4Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_5_0, "b");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getChild2_4Access().getChild1Keyword_4());
            		
            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getChild2_4Access().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleChild2_4"


    // $ANTLR start "entryRuleChild2_5"
    // InternalBug348427TestLanguage.g:1973:1: entryRuleChild2_5 returns [EObject current=null] : iv_ruleChild2_5= ruleChild2_5 EOF ;
    public final EObject entryRuleChild2_5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild2_5 = null;


        try {
            // InternalBug348427TestLanguage.g:1973:49: (iv_ruleChild2_5= ruleChild2_5 EOF )
            // InternalBug348427TestLanguage.g:1974:2: iv_ruleChild2_5= ruleChild2_5 EOF
            {
             newCompositeNode(grammarAccess.getChild2_5Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild2_5=ruleChild2_5();

            state._fsp--;

             current =iv_ruleChild2_5; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleChild2_5"


    // $ANTLR start "ruleChild2_5"
    // InternalBug348427TestLanguage.g:1980:1: ruleChild2_5 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child2' otherlv_7= 'end' ) ;
    public final EObject ruleChild2_5() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_bool_2_0=null;
        Token otherlv_3=null;
        Token lv_string_4_0=null;
        Token lv_string_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

        try {
            // InternalBug348427TestLanguage.g:1981:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child2' otherlv_7= 'end' ) )
            // InternalBug348427TestLanguage.g:1982:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child2' otherlv_7= 'end' )
            {
            // InternalBug348427TestLanguage.g:1982:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child2' otherlv_7= 'end' )
            // InternalBug348427TestLanguage.g:1983:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child2' otherlv_7= 'end'
            {
            // InternalBug348427TestLanguage.g:1983:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBug348427TestLanguage.g:1984:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBug348427TestLanguage.g:1984:4: (lv_name_0_0= RULE_ID )
            // InternalBug348427TestLanguage.g:1985:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getChild2_5Access().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChild2_5Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getChild2_5Access().getColonKeyword_1());
            		
            // InternalBug348427TestLanguage.g:2005:3: ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==17) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalBug348427TestLanguage.g:2006:4: ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword'
                    {
                    // InternalBug348427TestLanguage.g:2006:4: ( (lv_bool_2_0= 'bool' ) )
                    // InternalBug348427TestLanguage.g:2007:5: (lv_bool_2_0= 'bool' )
                    {
                    // InternalBug348427TestLanguage.g:2007:5: (lv_bool_2_0= 'bool' )
                    // InternalBug348427TestLanguage.g:2008:6: lv_bool_2_0= 'bool'
                    {
                    lv_bool_2_0=(Token)match(input,17,FollowSets000.FOLLOW_8); 

                    						newLeafNode(lv_bool_2_0, grammarAccess.getChild2_5Access().getBoolBoolKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_5Rule());
                    						}
                    						setWithLastConsumed(current, "bool", lv_bool_2_0 != null, "bool");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getChild2_5Access().getKeywordKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBug348427TestLanguage.g:2025:3: ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            else if ( (LA26_0==32) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalBug348427TestLanguage.g:2026:4: ( (lv_string_4_0= 'a' ) )
                    {
                    // InternalBug348427TestLanguage.g:2026:4: ( (lv_string_4_0= 'a' ) )
                    // InternalBug348427TestLanguage.g:2027:5: (lv_string_4_0= 'a' )
                    {
                    // InternalBug348427TestLanguage.g:2027:5: (lv_string_4_0= 'a' )
                    // InternalBug348427TestLanguage.g:2028:6: lv_string_4_0= 'a'
                    {
                    lv_string_4_0=(Token)match(input,31,FollowSets000.FOLLOW_11); 

                    						newLeafNode(lv_string_4_0, grammarAccess.getChild2_5Access().getStringAKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_5Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_4_0, "a");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:2041:4: ( (lv_string_5_0= 'b' ) )
                    {
                    // InternalBug348427TestLanguage.g:2041:4: ( (lv_string_5_0= 'b' ) )
                    // InternalBug348427TestLanguage.g:2042:5: (lv_string_5_0= 'b' )
                    {
                    // InternalBug348427TestLanguage.g:2042:5: (lv_string_5_0= 'b' )
                    // InternalBug348427TestLanguage.g:2043:6: lv_string_5_0= 'b'
                    {
                    lv_string_5_0=(Token)match(input,32,FollowSets000.FOLLOW_11); 

                    						newLeafNode(lv_string_5_0, grammarAccess.getChild2_5Access().getStringBKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_5Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_5_0, "b");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getChild2_5Access().getChild2Keyword_4());
            		
            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getChild2_5Access().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleChild2_5"


    // $ANTLR start "entryRuleChild2_6"
    // InternalBug348427TestLanguage.g:2068:1: entryRuleChild2_6 returns [EObject current=null] : iv_ruleChild2_6= ruleChild2_6 EOF ;
    public final EObject entryRuleChild2_6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChild2_6 = null;


        try {
            // InternalBug348427TestLanguage.g:2068:49: (iv_ruleChild2_6= ruleChild2_6 EOF )
            // InternalBug348427TestLanguage.g:2069:2: iv_ruleChild2_6= ruleChild2_6 EOF
            {
             newCompositeNode(grammarAccess.getChild2_6Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChild2_6=ruleChild2_6();

            state._fsp--;

             current =iv_ruleChild2_6; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

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
    // $ANTLR end "entryRuleChild2_6"


    // $ANTLR start "ruleChild2_6"
    // InternalBug348427TestLanguage.g:2075:1: ruleChild2_6 returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child3' otherlv_7= 'end' ) ;
    public final EObject ruleChild2_6() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_bool_2_0=null;
        Token otherlv_3=null;
        Token lv_string_4_0=null;
        Token lv_string_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

        try {
            // InternalBug348427TestLanguage.g:2076:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child3' otherlv_7= 'end' ) )
            // InternalBug348427TestLanguage.g:2077:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child3' otherlv_7= 'end' )
            {
            // InternalBug348427TestLanguage.g:2077:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child3' otherlv_7= 'end' )
            // InternalBug348427TestLanguage.g:2078:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )? ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) ) otherlv_6= 'child3' otherlv_7= 'end'
            {
            // InternalBug348427TestLanguage.g:2078:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalBug348427TestLanguage.g:2079:4: (lv_name_0_0= RULE_ID )
            {
            // InternalBug348427TestLanguage.g:2079:4: (lv_name_0_0= RULE_ID )
            // InternalBug348427TestLanguage.g:2080:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getChild2_6Access().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChild2_6Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FollowSets000.FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getChild2_6Access().getColonKeyword_1());
            		
            // InternalBug348427TestLanguage.g:2100:3: ( ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==17) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalBug348427TestLanguage.g:2101:4: ( (lv_bool_2_0= 'bool' ) ) otherlv_3= 'keyword'
                    {
                    // InternalBug348427TestLanguage.g:2101:4: ( (lv_bool_2_0= 'bool' ) )
                    // InternalBug348427TestLanguage.g:2102:5: (lv_bool_2_0= 'bool' )
                    {
                    // InternalBug348427TestLanguage.g:2102:5: (lv_bool_2_0= 'bool' )
                    // InternalBug348427TestLanguage.g:2103:6: lv_bool_2_0= 'bool'
                    {
                    lv_bool_2_0=(Token)match(input,17,FollowSets000.FOLLOW_8); 

                    						newLeafNode(lv_bool_2_0, grammarAccess.getChild2_6Access().getBoolBoolKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_6Rule());
                    						}
                    						setWithLastConsumed(current, "bool", lv_bool_2_0 != null, "bool");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getChild2_6Access().getKeywordKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalBug348427TestLanguage.g:2120:3: ( ( (lv_string_4_0= 'a' ) ) | ( (lv_string_5_0= 'b' ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            else if ( (LA28_0==32) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalBug348427TestLanguage.g:2121:4: ( (lv_string_4_0= 'a' ) )
                    {
                    // InternalBug348427TestLanguage.g:2121:4: ( (lv_string_4_0= 'a' ) )
                    // InternalBug348427TestLanguage.g:2122:5: (lv_string_4_0= 'a' )
                    {
                    // InternalBug348427TestLanguage.g:2122:5: (lv_string_4_0= 'a' )
                    // InternalBug348427TestLanguage.g:2123:6: lv_string_4_0= 'a'
                    {
                    lv_string_4_0=(Token)match(input,31,FollowSets000.FOLLOW_12); 

                    						newLeafNode(lv_string_4_0, grammarAccess.getChild2_6Access().getStringAKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_6Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_4_0, "a");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:2136:4: ( (lv_string_5_0= 'b' ) )
                    {
                    // InternalBug348427TestLanguage.g:2136:4: ( (lv_string_5_0= 'b' ) )
                    // InternalBug348427TestLanguage.g:2137:5: (lv_string_5_0= 'b' )
                    {
                    // InternalBug348427TestLanguage.g:2137:5: (lv_string_5_0= 'b' )
                    // InternalBug348427TestLanguage.g:2138:6: lv_string_5_0= 'b'
                    {
                    lv_string_5_0=(Token)match(input,32,FollowSets000.FOLLOW_12); 

                    						newLeafNode(lv_string_5_0, grammarAccess.getChild2_6Access().getStringBKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getChild2_6Rule());
                    						}
                    						setWithLastConsumed(current, "string", lv_string_5_0, "b");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getChild2_6Access().getChild3Keyword_4());
            		
            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getChild2_6Access().getEndKeyword_5());
            		

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
    // $ANTLR end "ruleChild2_6"


    // $ANTLR start "ruleEnumType"
    // InternalBug348427TestLanguage.g:2163:1: ruleEnumType returns [Enumerator current=null] : ( (enumLiteral_0= 'a' ) | (enumLiteral_1= 'b' ) ) ;
    public final Enumerator ruleEnumType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

        try {
            // InternalBug348427TestLanguage.g:2164:1: ( ( (enumLiteral_0= 'a' ) | (enumLiteral_1= 'b' ) ) )
            // InternalBug348427TestLanguage.g:2165:2: ( (enumLiteral_0= 'a' ) | (enumLiteral_1= 'b' ) )
            {
            // InternalBug348427TestLanguage.g:2165:2: ( (enumLiteral_0= 'a' ) | (enumLiteral_1= 'b' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            else if ( (LA29_0==32) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalBug348427TestLanguage.g:2166:3: (enumLiteral_0= 'a' )
                    {
                    // InternalBug348427TestLanguage.g:2166:3: (enumLiteral_0= 'a' )
                    // InternalBug348427TestLanguage.g:2167:4: enumLiteral_0= 'a'
                    {
                    enumLiteral_0=(Token)match(input,31,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getEnumTypeAccess().getAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEnumTypeAccess().getAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalBug348427TestLanguage.g:2174:3: (enumLiteral_1= 'b' )
                    {
                    // InternalBug348427TestLanguage.g:2174:3: (enumLiteral_1= 'b' )
                    // InternalBug348427TestLanguage.g:2175:4: enumLiteral_1= 'b'
                    {
                    enumLiteral_1=(Token)match(input,32,FollowSets000.FOLLOW_2); 

                    				current = grammarAccess.getEnumTypeAccess().getBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEnumTypeAccess().getBEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleEnumType"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\1\20\1\21\1\22\2\23\1\37\3\uffff";
    static final String dfa_3s = "\1\4\1\20\1\40\1\22\2\26\1\40\3\uffff";
    static final String dfa_4s = "\7\uffff\1\1\1\2\1\3";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3\15\uffff\1\4\1\5",
            "\1\6",
            "\1\7\1\uffff\1\10\1\11",
            "\1\7\1\uffff\1\10\1\11",
            "\1\4\1\5",
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "332:3: ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) )";
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\4\1\uffff\1\20\1\21\1\22\2\23\1\37\3\uffff";
    static final String dfa_9s = "\1\14\1\uffff\1\20\1\40\1\22\2\26\1\40\3\uffff";
    static final String dfa_10s = "\1\uffff\1\4\6\uffff\1\1\1\2\1\3";
    static final String dfa_11s = "\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\7\uffff\1\1",
            "",
            "\1\3",
            "\1\4\15\uffff\1\5\1\6",
            "\1\7",
            "\1\10\1\uffff\1\11\1\12",
            "\1\10\1\uffff\1\11\1\12",
            "\1\5\1\6",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()+ loopback of 415:3: ( ( (lv_child_1_0= ruleChild1_1 ) ) | ( (lv_child_2_0= ruleChild1_2 ) ) | ( (lv_child_3_0= ruleChild1_3 ) ) )+";
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "()* loopback of 505:3: ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )*";
        }
    }
    static final String dfa_13s = "\1\4\1\20\1\uffff\1\21\1\22\2\23\1\37\3\uffff";
    static final String dfa_14s = "\1\14\1\20\1\uffff\1\40\1\22\2\26\1\40\3\uffff";
    static final String dfa_15s = "\2\uffff\1\4\5\uffff\1\1\1\2\1\3";
    static final String[] dfa_16s = {
            "\1\1\7\uffff\1\2",
            "\1\3",
            "",
            "\1\4\15\uffff\1\5\1\6",
            "\1\7",
            "\1\10\1\uffff\1\11\1\12",
            "\1\10\1\uffff\1\11\1\12",
            "\1\5\1\6",
            "",
            "",
            ""
    };
    static final char[] dfa_13 = DFA.unpackEncodedStringToUnsignedChars(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[][] dfa_16 = unpackEncodedStringArray(dfa_16s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_15;
            this.special = dfa_11;
            this.transition = dfa_16;
        }
        public String getDescription() {
            return "595:3: ( ( (lv_child_2_0= ruleChild1_1 ) ) | ( (lv_child_3_0= ruleChild1_2 ) ) | ( (lv_child_4_0= ruleChild1_3 ) ) )?";
        }
    }
    static final String dfa_17s = "\7\uffff\1\2\1\1\1\3";
    static final String[] dfa_18s = {
            "\1\1",
            "\1\2",
            "\1\3\15\uffff\1\4\1\5",
            "\1\6",
            "\1\10\1\uffff\1\7\1\11",
            "\1\10\1\uffff\1\7\1\11",
            "\1\4\1\5",
            "",
            "",
            ""
    };
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_17;
            this.special = dfa_5;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "927:3: ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) )";
        }
    }
    static final String dfa_19s = "\1\uffff\1\4\6\uffff\1\2\1\1\1\3";
    static final String[] dfa_20s = {
            "\1\2\7\uffff\1\1",
            "",
            "\1\3",
            "\1\4\15\uffff\1\5\1\6",
            "\1\7",
            "\1\11\1\uffff\1\10\1\12",
            "\1\11\1\uffff\1\10\1\12",
            "\1\5\1\6",
            "",
            "",
            ""
    };
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_19;
            this.special = dfa_11;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "()+ loopback of 1010:3: ( ( (lv_child_1_0= ruleChild2_1 ) ) | ( (lv_child_2_0= ruleChild2_2 ) ) | ( (lv_child_3_0= ruleChild2_3 ) ) )+";
        }
    }
    static final String dfa_21s = "\7\uffff\1\3\1\2\1\1";
    static final String[] dfa_22s = {
            "\1\1",
            "\1\2",
            "\1\3\15\uffff\1\4\1\5",
            "\1\6",
            "\1\11\1\uffff\1\10\1\7",
            "\1\11\1\uffff\1\10\1\7",
            "\1\4\1\5",
            "",
            "",
            ""
    };
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[][] dfa_22 = unpackEncodedStringArray(dfa_22s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_21;
            this.special = dfa_5;
            this.transition = dfa_22;
        }
        public String getDescription() {
            return "1093:3: ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) )";
        }
    }
    static final String dfa_23s = "\1\uffff\1\4\6\uffff\1\3\1\2\1\1";
    static final String[] dfa_24s = {
            "\1\2\7\uffff\1\1",
            "",
            "\1\3",
            "\1\4\15\uffff\1\5\1\6",
            "\1\7",
            "\1\12\1\uffff\1\11\1\10",
            "\1\12\1\uffff\1\11\1\10",
            "\1\5\1\6",
            "",
            "",
            ""
    };
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_23;
            this.special = dfa_11;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "()+ loopback of 1176:3: ( ( (lv_child_1_0= ruleChild2_4 ) ) | ( (lv_child_2_0= ruleChild2_5 ) ) | ( (lv_child_3_0= ruleChild2_6 ) ) )+";
        }
    }
    static final String dfa_25s = "\2\uffff\1\4\5\uffff\1\2\1\1\1\3";
    static final String[] dfa_26s = {
            "\1\1\7\uffff\1\2",
            "\1\3",
            "",
            "\1\4\15\uffff\1\5\1\6",
            "\1\7",
            "\1\11\1\uffff\1\10\1\12",
            "\1\11\1\uffff\1\10\1\12",
            "\1\5\1\6",
            "",
            "",
            ""
    };
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_25;
            this.special = dfa_11;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "1266:3: ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )?";
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_23;
            this.special = dfa_11;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "()* loopback of 1356:3: ( ( (lv_child_2_0= ruleChild2_1 ) ) | ( (lv_child_3_0= ruleChild2_2 ) ) | ( (lv_child_4_0= ruleChild2_3 ) ) )*";
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_13;
            this.max = dfa_14;
            this.accept = dfa_25;
            this.special = dfa_11;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "1446:3: ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )?";
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_23;
            this.special = dfa_11;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "()* loopback of 1536:3: ( ( (lv_child_2_0= ruleChild2_4 ) ) | ( (lv_child_3_0= ruleChild2_5 ) ) | ( (lv_child_4_0= ruleChild2_6 ) ) )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001010L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000180020000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000180000000L});
    }


}