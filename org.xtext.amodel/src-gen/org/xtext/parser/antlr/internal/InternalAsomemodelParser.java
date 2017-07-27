package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.AsomemodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAsomemodelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'}'", "'RepositoryService'", "'Provided'", "'DomainInterface'", "'DataPort'", "'interfaces'", "':'", "'.'", "'Type'", "';'", "'Double'", "'Int'", "'String'", "'Immutable'", "'NonVolatile'", "'Entity'", "'attributes'", "'['", "','", "'inf'", "']'", "'ValueObject'", "'ordered'", "'unordered'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
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


        public InternalAsomemodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAsomemodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAsomemodelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAsomemodel.g"; }



     	private AsomemodelGrammarAccess grammarAccess;

        public InternalAsomemodelParser(TokenStream input, AsomemodelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Asomemodel";
       	}

       	@Override
       	protected AsomemodelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAsomemodel"
    // InternalAsomemodel.g:64:1: entryRuleAsomemodel returns [EObject current=null] : iv_ruleAsomemodel= ruleAsomemodel EOF ;
    public final EObject entryRuleAsomemodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsomemodel = null;


        try {
            // InternalAsomemodel.g:64:51: (iv_ruleAsomemodel= ruleAsomemodel EOF )
            // InternalAsomemodel.g:65:2: iv_ruleAsomemodel= ruleAsomemodel EOF
            {
             newCompositeNode(grammarAccess.getAsomemodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsomemodel=ruleAsomemodel();

            state._fsp--;

             current =iv_ruleAsomemodel; 
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
    // $ANTLR end "entryRuleAsomemodel"


    // $ANTLR start "ruleAsomemodel"
    // InternalAsomemodel.g:71:1: ruleAsomemodel returns [EObject current=null] : this_Model_0= ruleModel ;
    public final EObject ruleAsomemodel() throws RecognitionException {
        EObject current = null;

        EObject this_Model_0 = null;



        	enterRule();

        try {
            // InternalAsomemodel.g:77:2: (this_Model_0= ruleModel )
            // InternalAsomemodel.g:78:2: this_Model_0= ruleModel
            {

            		newCompositeNode(grammarAccess.getAsomemodelAccess().getModelParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Model_0=ruleModel();

            state._fsp--;


            		current = this_Model_0;
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
    // $ANTLR end "ruleAsomemodel"


    // $ANTLR start "entryRuleModel"
    // InternalAsomemodel.g:89:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalAsomemodel.g:89:46: (iv_ruleModel= ruleModel EOF )
            // InternalAsomemodel.g:90:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAsomemodel.g:96:1: ruleModel returns [EObject current=null] : (otherlv_0= 'Model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_repositoryservice_3_0= ruleRepositoryService ) )? ( (lv_domaininterface_4_0= ruleDomainInterface ) )? otherlv_5= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_repositoryservice_3_0 = null;

        EObject lv_domaininterface_4_0 = null;



        	enterRule();

        try {
            // InternalAsomemodel.g:102:2: ( (otherlv_0= 'Model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_repositoryservice_3_0= ruleRepositoryService ) )? ( (lv_domaininterface_4_0= ruleDomainInterface ) )? otherlv_5= '}' ) )
            // InternalAsomemodel.g:103:2: (otherlv_0= 'Model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_repositoryservice_3_0= ruleRepositoryService ) )? ( (lv_domaininterface_4_0= ruleDomainInterface ) )? otherlv_5= '}' )
            {
            // InternalAsomemodel.g:103:2: (otherlv_0= 'Model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_repositoryservice_3_0= ruleRepositoryService ) )? ( (lv_domaininterface_4_0= ruleDomainInterface ) )? otherlv_5= '}' )
            // InternalAsomemodel.g:104:3: otherlv_0= 'Model' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_repositoryservice_3_0= ruleRepositoryService ) )? ( (lv_domaininterface_4_0= ruleDomainInterface ) )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getModelKeyword_0());
            		
            // InternalAsomemodel.g:108:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAsomemodel.g:109:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAsomemodel.g:109:4: (lv_name_1_0= RULE_ID )
            // InternalAsomemodel.g:110:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAsomemodel.g:130:3: ( (lv_repositoryservice_3_0= ruleRepositoryService ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalAsomemodel.g:131:4: (lv_repositoryservice_3_0= ruleRepositoryService )
                    {
                    // InternalAsomemodel.g:131:4: (lv_repositoryservice_3_0= ruleRepositoryService )
                    // InternalAsomemodel.g:132:5: lv_repositoryservice_3_0= ruleRepositoryService
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getRepositoryserviceRepositoryServiceParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_repositoryservice_3_0=ruleRepositoryService();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"repositoryservice",
                    						lv_repositoryservice_3_0,
                    						"org.xtext.Asomemodel.RepositoryService");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalAsomemodel.g:149:3: ( (lv_domaininterface_4_0= ruleDomainInterface ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAsomemodel.g:150:4: (lv_domaininterface_4_0= ruleDomainInterface )
                    {
                    // InternalAsomemodel.g:150:4: (lv_domaininterface_4_0= ruleDomainInterface )
                    // InternalAsomemodel.g:151:5: lv_domaininterface_4_0= ruleDomainInterface
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getDomaininterfaceDomainInterfaceParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_domaininterface_4_0=ruleDomainInterface();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"domaininterface",
                    						lv_domaininterface_4_0,
                    						"org.xtext.Asomemodel.DomainInterface");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRepositoryService"
    // InternalAsomemodel.g:176:1: entryRuleRepositoryService returns [EObject current=null] : iv_ruleRepositoryService= ruleRepositoryService EOF ;
    public final EObject entryRuleRepositoryService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositoryService = null;


        try {
            // InternalAsomemodel.g:176:58: (iv_ruleRepositoryService= ruleRepositoryService EOF )
            // InternalAsomemodel.g:177:2: iv_ruleRepositoryService= ruleRepositoryService EOF
            {
             newCompositeNode(grammarAccess.getRepositoryServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepositoryService=ruleRepositoryService();

            state._fsp--;

             current =iv_ruleRepositoryService; 
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
    // $ANTLR end "entryRuleRepositoryService"


    // $ANTLR start "ruleRepositoryService"
    // InternalAsomemodel.g:183:1: ruleRepositoryService returns [EObject current=null] : (otherlv_0= 'RepositoryService' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Provided' ( (lv_dataport_4_0= ruleDataPort ) ) otherlv_5= '}' ) ;
    public final EObject ruleRepositoryService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dataport_4_0 = null;



        	enterRule();

        try {
            // InternalAsomemodel.g:189:2: ( (otherlv_0= 'RepositoryService' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Provided' ( (lv_dataport_4_0= ruleDataPort ) ) otherlv_5= '}' ) )
            // InternalAsomemodel.g:190:2: (otherlv_0= 'RepositoryService' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Provided' ( (lv_dataport_4_0= ruleDataPort ) ) otherlv_5= '}' )
            {
            // InternalAsomemodel.g:190:2: (otherlv_0= 'RepositoryService' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Provided' ( (lv_dataport_4_0= ruleDataPort ) ) otherlv_5= '}' )
            // InternalAsomemodel.g:191:3: otherlv_0= 'RepositoryService' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'Provided' ( (lv_dataport_4_0= ruleDataPort ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRepositoryServiceAccess().getRepositoryServiceKeyword_0());
            		
            // InternalAsomemodel.g:195:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAsomemodel.g:196:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAsomemodel.g:196:4: (lv_name_1_0= RULE_ID )
            // InternalAsomemodel.g:197:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRepositoryServiceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRepositoryServiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRepositoryServiceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRepositoryServiceAccess().getProvidedKeyword_3());
            		
            // InternalAsomemodel.g:221:3: ( (lv_dataport_4_0= ruleDataPort ) )
            // InternalAsomemodel.g:222:4: (lv_dataport_4_0= ruleDataPort )
            {
            // InternalAsomemodel.g:222:4: (lv_dataport_4_0= ruleDataPort )
            // InternalAsomemodel.g:223:5: lv_dataport_4_0= ruleDataPort
            {

            					newCompositeNode(grammarAccess.getRepositoryServiceAccess().getDataportDataPortParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_dataport_4_0=ruleDataPort();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepositoryServiceRule());
            					}
            					set(
            						current,
            						"dataport",
            						lv_dataport_4_0,
            						"org.xtext.Asomemodel.DataPort");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRepositoryServiceAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRepositoryService"


    // $ANTLR start "entryRuleDomainInterface"
    // InternalAsomemodel.g:248:1: entryRuleDomainInterface returns [EObject current=null] : iv_ruleDomainInterface= ruleDomainInterface EOF ;
    public final EObject entryRuleDomainInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainInterface = null;


        try {
            // InternalAsomemodel.g:248:56: (iv_ruleDomainInterface= ruleDomainInterface EOF )
            // InternalAsomemodel.g:249:2: iv_ruleDomainInterface= ruleDomainInterface EOF
            {
             newCompositeNode(grammarAccess.getDomainInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainInterface=ruleDomainInterface();

            state._fsp--;

             current =iv_ruleDomainInterface; 
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
    // $ANTLR end "entryRuleDomainInterface"


    // $ANTLR start "ruleDomainInterface"
    // InternalAsomemodel.g:255:1: ruleDomainInterface returns [EObject current=null] : (otherlv_0= 'DomainInterface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_element_3_0= ruleElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleDomainInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_element_3_0 = null;



        	enterRule();

        try {
            // InternalAsomemodel.g:261:2: ( (otherlv_0= 'DomainInterface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_element_3_0= ruleElement ) )* otherlv_4= '}' ) )
            // InternalAsomemodel.g:262:2: (otherlv_0= 'DomainInterface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_element_3_0= ruleElement ) )* otherlv_4= '}' )
            {
            // InternalAsomemodel.g:262:2: (otherlv_0= 'DomainInterface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_element_3_0= ruleElement ) )* otherlv_4= '}' )
            // InternalAsomemodel.g:263:3: otherlv_0= 'DomainInterface' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_element_3_0= ruleElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDomainInterfaceAccess().getDomainInterfaceKeyword_0());
            		
            // InternalAsomemodel.g:267:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAsomemodel.g:268:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAsomemodel.g:268:4: (lv_name_1_0= RULE_ID )
            // InternalAsomemodel.g:269:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDomainInterfaceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDomainInterfaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getDomainInterfaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAsomemodel.g:289:3: ( (lv_element_3_0= ruleElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21||LA3_0==26||LA3_0==34) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalAsomemodel.g:290:4: (lv_element_3_0= ruleElement )
            	    {
            	    // InternalAsomemodel.g:290:4: (lv_element_3_0= ruleElement )
            	    // InternalAsomemodel.g:291:5: lv_element_3_0= ruleElement
            	    {

            	    					newCompositeNode(grammarAccess.getDomainInterfaceAccess().getElementElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_element_3_0=ruleElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDomainInterfaceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"element",
            	    						lv_element_3_0,
            	    						"org.xtext.Asomemodel.Element");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDomainInterfaceAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDomainInterface"


    // $ANTLR start "entryRuleDataPort"
    // InternalAsomemodel.g:316:1: entryRuleDataPort returns [EObject current=null] : iv_ruleDataPort= ruleDataPort EOF ;
    public final EObject entryRuleDataPort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPort = null;


        try {
            // InternalAsomemodel.g:316:49: (iv_ruleDataPort= ruleDataPort EOF )
            // InternalAsomemodel.g:317:2: iv_ruleDataPort= ruleDataPort EOF
            {
             newCompositeNode(grammarAccess.getDataPortRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataPort=ruleDataPort();

            state._fsp--;

             current =iv_ruleDataPort; 
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
    // $ANTLR end "entryRuleDataPort"


    // $ANTLR start "ruleDataPort"
    // InternalAsomemodel.g:323:1: ruleDataPort returns [EObject current=null] : (otherlv_0= 'DataPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'interfaces' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) ;
    public final EObject ruleDataPort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalAsomemodel.g:329:2: ( (otherlv_0= 'DataPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'interfaces' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) )
            // InternalAsomemodel.g:330:2: (otherlv_0= 'DataPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'interfaces' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
            {
            // InternalAsomemodel.g:330:2: (otherlv_0= 'DataPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'interfaces' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
            // InternalAsomemodel.g:331:3: otherlv_0= 'DataPort' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'interfaces' otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDataPortAccess().getDataPortKeyword_0());
            		
            // InternalAsomemodel.g:335:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAsomemodel.g:336:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAsomemodel.g:336:4: (lv_name_1_0= RULE_ID )
            // InternalAsomemodel.g:337:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataPortAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getDataPortAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getDataPortAccess().getInterfacesKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getDataPortAccess().getColonKeyword_4());
            		
            // InternalAsomemodel.g:365:3: ( (otherlv_5= RULE_ID ) )
            // InternalAsomemodel.g:366:4: (otherlv_5= RULE_ID )
            {
            // InternalAsomemodel.g:366:4: (otherlv_5= RULE_ID )
            // InternalAsomemodel.g:367:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataPortRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_5, grammarAccess.getDataPortAccess().getCrossModelModelCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getDataPortAccess().getFullStopKeyword_6());
            		
            // InternalAsomemodel.g:382:3: ( (otherlv_7= RULE_ID ) )
            // InternalAsomemodel.g:383:4: (otherlv_7= RULE_ID )
            {
            // InternalAsomemodel.g:383:4: (otherlv_7= RULE_ID )
            // InternalAsomemodel.g:384:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataPortRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(otherlv_7, grammarAccess.getDataPortAccess().getCrossInterfaceDomainInterfaceCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDataPortAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleDataPort"


    // $ANTLR start "entryRuleElement"
    // InternalAsomemodel.g:403:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalAsomemodel.g:403:48: (iv_ruleElement= ruleElement EOF )
            // InternalAsomemodel.g:404:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalAsomemodel.g:410:1: ruleElement returns [EObject current=null] : ( ruleType | this_Entity_1= ruleEntity | this_ValueObject_2= ruleValueObject ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_1 = null;

        EObject this_ValueObject_2 = null;



        	enterRule();

        try {
            // InternalAsomemodel.g:416:2: ( ( ruleType | this_Entity_1= ruleEntity | this_ValueObject_2= ruleValueObject ) )
            // InternalAsomemodel.g:417:2: ( ruleType | this_Entity_1= ruleEntity | this_ValueObject_2= ruleValueObject )
            {
            // InternalAsomemodel.g:417:2: ( ruleType | this_Entity_1= ruleEntity | this_ValueObject_2= ruleValueObject )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 34:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalAsomemodel.g:418:3: ruleType
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;


                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAsomemodel.g:426:3: this_Entity_1= ruleEntity
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getEntityParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAsomemodel.g:435:3: this_ValueObject_2= ruleValueObject
                    {

                    			newCompositeNode(grammarAccess.getElementAccess().getValueObjectParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ValueObject_2=ruleValueObject();

                    state._fsp--;


                    			current = this_ValueObject_2;
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleType"
    // InternalAsomemodel.g:447:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // InternalAsomemodel.g:447:44: (iv_ruleType= ruleType EOF )
            // InternalAsomemodel.g:448:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalAsomemodel.g:454:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Type' this_Datatype_1= ruleDatatype kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Datatype_1 = null;



        	enterRule();

        try {
            // InternalAsomemodel.g:460:2: ( (kw= 'Type' this_Datatype_1= ruleDatatype kw= ';' ) )
            // InternalAsomemodel.g:461:2: (kw= 'Type' this_Datatype_1= ruleDatatype kw= ';' )
            {
            // InternalAsomemodel.g:461:2: (kw= 'Type' this_Datatype_1= ruleDatatype kw= ';' )
            // InternalAsomemodel.g:462:3: kw= 'Type' this_Datatype_1= ruleDatatype kw= ';'
            {
            kw=(Token)match(input,21,FOLLOW_14); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTypeAccess().getTypeKeyword_0());
            		

            			newCompositeNode(grammarAccess.getTypeAccess().getDatatypeParserRuleCall_1());
            		
            pushFollow(FOLLOW_15);
            this_Datatype_1=ruleDatatype();

            state._fsp--;


            			current.merge(this_Datatype_1);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,22,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getTypeAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDatatype"
    // InternalAsomemodel.g:486:1: entryRuleDatatype returns [String current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final String entryRuleDatatype() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDatatype = null;


        try {
            // InternalAsomemodel.g:486:48: (iv_ruleDatatype= ruleDatatype EOF )
            // InternalAsomemodel.g:487:2: iv_ruleDatatype= ruleDatatype EOF
            {
             newCompositeNode(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDatatype=ruleDatatype();

            state._fsp--;

             current =iv_ruleDatatype.getText(); 
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
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // InternalAsomemodel.g:493:1: ruleDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Double' | kw= 'Int' | kw= 'String' ) ;
    public final AntlrDatatypeRuleToken ruleDatatype() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsomemodel.g:499:2: ( (kw= 'Double' | kw= 'Int' | kw= 'String' ) )
            // InternalAsomemodel.g:500:2: (kw= 'Double' | kw= 'Int' | kw= 'String' )
            {
            // InternalAsomemodel.g:500:2: (kw= 'Double' | kw= 'Int' | kw= 'String' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalAsomemodel.g:501:3: kw= 'Double'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDatatypeAccess().getDoubleKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAsomemodel.g:507:3: kw= 'Int'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDatatypeAccess().getIntKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalAsomemodel.g:513:3: kw= 'String'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDatatypeAccess().getStringKeyword_2());
                    		

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
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleEntity"
    // InternalAsomemodel.g:522:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalAsomemodel.g:522:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalAsomemodel.g:523:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalAsomemodel.g:529:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'Immutable' otherlv_1= 'NonVolatile' otherlv_2= 'Entity' ( (lv_name_3_0= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= '{' otherlv_6= 'attributes' otherlv_7= ':' ( (lv_attri_8_0= ruleAttri ) )* otherlv_9= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_multiplicity_4_0 = null;

        EObject lv_attri_8_0 = null;



        	enterRule();

        try {
            // InternalAsomemodel.g:535:2: ( (otherlv_0= 'Immutable' otherlv_1= 'NonVolatile' otherlv_2= 'Entity' ( (lv_name_3_0= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= '{' otherlv_6= 'attributes' otherlv_7= ':' ( (lv_attri_8_0= ruleAttri ) )* otherlv_9= '}' ) )
            // InternalAsomemodel.g:536:2: (otherlv_0= 'Immutable' otherlv_1= 'NonVolatile' otherlv_2= 'Entity' ( (lv_name_3_0= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= '{' otherlv_6= 'attributes' otherlv_7= ':' ( (lv_attri_8_0= ruleAttri ) )* otherlv_9= '}' )
            {
            // InternalAsomemodel.g:536:2: (otherlv_0= 'Immutable' otherlv_1= 'NonVolatile' otherlv_2= 'Entity' ( (lv_name_3_0= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= '{' otherlv_6= 'attributes' otherlv_7= ':' ( (lv_attri_8_0= ruleAttri ) )* otherlv_9= '}' )
            // InternalAsomemodel.g:537:3: otherlv_0= 'Immutable' otherlv_1= 'NonVolatile' otherlv_2= 'Entity' ( (lv_name_3_0= RULE_ID ) ) ( (lv_multiplicity_4_0= ruleMultiplicity ) ) otherlv_5= '{' otherlv_6= 'attributes' otherlv_7= ':' ( (lv_attri_8_0= ruleAttri ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getImmutableKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getNonVolatileKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getEntityKeyword_2());
            		
            // InternalAsomemodel.g:549:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalAsomemodel.g:550:4: (lv_name_3_0= RULE_ID )
            {
            // InternalAsomemodel.g:550:4: (lv_name_3_0= RULE_ID )
            // InternalAsomemodel.g:551:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_name_3_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalAsomemodel.g:567:3: ( (lv_multiplicity_4_0= ruleMultiplicity ) )
            // InternalAsomemodel.g:568:4: (lv_multiplicity_4_0= ruleMultiplicity )
            {
            // InternalAsomemodel.g:568:4: (lv_multiplicity_4_0= ruleMultiplicity )
            // InternalAsomemodel.g:569:5: lv_multiplicity_4_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getMultiplicityMultiplicityParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_4);
            lv_multiplicity_4_0=ruleMultiplicity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"multiplicity",
            						lv_multiplicity_4_0,
            						"org.xtext.Asomemodel.Multiplicity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getAttributesKeyword_6());
            		
            otherlv_7=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getColonKeyword_7());
            		
            // InternalAsomemodel.g:598:3: ( (lv_attri_8_0= ruleAttri ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAsomemodel.g:599:4: (lv_attri_8_0= ruleAttri )
            	    {
            	    // InternalAsomemodel.g:599:4: (lv_attri_8_0= ruleAttri )
            	    // InternalAsomemodel.g:600:5: lv_attri_8_0= ruleAttri
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttriAttriParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_attri_8_0=ruleAttri();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attri",
            	    						lv_attri_8_0,
            	    						"org.xtext.Asomemodel.Attri");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleMultiplicity"
    // InternalAsomemodel.g:625:1: entryRuleMultiplicity returns [EObject current=null] : iv_ruleMultiplicity= ruleMultiplicity EOF ;
    public final EObject entryRuleMultiplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicity = null;


        try {
            // InternalAsomemodel.g:625:53: (iv_ruleMultiplicity= ruleMultiplicity EOF )
            // InternalAsomemodel.g:626:2: iv_ruleMultiplicity= ruleMultiplicity EOF
            {
             newCompositeNode(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicity=ruleMultiplicity();

            state._fsp--;

             current =iv_ruleMultiplicity; 
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
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // InternalAsomemodel.g:632:1: ruleMultiplicity returns [EObject current=null] : (otherlv_0= '[' ( (lv_name_1_0= RULE_INT ) ) otherlv_2= ',' ( ( (lv_name_3_0= RULE_INT ) ) | otherlv_4= 'inf' ) otherlv_5= ']' ) ;
    public final EObject ruleMultiplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalAsomemodel.g:638:2: ( (otherlv_0= '[' ( (lv_name_1_0= RULE_INT ) ) otherlv_2= ',' ( ( (lv_name_3_0= RULE_INT ) ) | otherlv_4= 'inf' ) otherlv_5= ']' ) )
            // InternalAsomemodel.g:639:2: (otherlv_0= '[' ( (lv_name_1_0= RULE_INT ) ) otherlv_2= ',' ( ( (lv_name_3_0= RULE_INT ) ) | otherlv_4= 'inf' ) otherlv_5= ']' )
            {
            // InternalAsomemodel.g:639:2: (otherlv_0= '[' ( (lv_name_1_0= RULE_INT ) ) otherlv_2= ',' ( ( (lv_name_3_0= RULE_INT ) ) | otherlv_4= 'inf' ) otherlv_5= ']' )
            // InternalAsomemodel.g:640:3: otherlv_0= '[' ( (lv_name_1_0= RULE_INT ) ) otherlv_2= ',' ( ( (lv_name_3_0= RULE_INT ) ) | otherlv_4= 'inf' ) otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalAsomemodel.g:644:3: ( (lv_name_1_0= RULE_INT ) )
            // InternalAsomemodel.g:645:4: (lv_name_1_0= RULE_INT )
            {
            // InternalAsomemodel.g:645:4: (lv_name_1_0= RULE_INT )
            // InternalAsomemodel.g:646:5: lv_name_1_0= RULE_INT
            {
            lv_name_1_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMultiplicityAccess().getNameINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiplicityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getMultiplicityAccess().getCommaKeyword_2());
            		
            // InternalAsomemodel.g:666:3: ( ( (lv_name_3_0= RULE_INT ) ) | otherlv_4= 'inf' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            else if ( (LA7_0==32) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAsomemodel.g:667:4: ( (lv_name_3_0= RULE_INT ) )
                    {
                    // InternalAsomemodel.g:667:4: ( (lv_name_3_0= RULE_INT ) )
                    // InternalAsomemodel.g:668:5: (lv_name_3_0= RULE_INT )
                    {
                    // InternalAsomemodel.g:668:5: (lv_name_3_0= RULE_INT )
                    // InternalAsomemodel.g:669:6: lv_name_3_0= RULE_INT
                    {
                    lv_name_3_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getMultiplicityAccess().getNameINTTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMultiplicityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAsomemodel.g:686:4: otherlv_4= 'inf'
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_24); 

                    				newLeafNode(otherlv_4, grammarAccess.getMultiplicityAccess().getInfKeyword_3_1());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiplicityAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleValueObject"
    // InternalAsomemodel.g:699:1: entryRuleValueObject returns [EObject current=null] : iv_ruleValueObject= ruleValueObject EOF ;
    public final EObject entryRuleValueObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueObject = null;


        try {
            // InternalAsomemodel.g:699:52: (iv_ruleValueObject= ruleValueObject EOF )
            // InternalAsomemodel.g:700:2: iv_ruleValueObject= ruleValueObject EOF
            {
             newCompositeNode(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValueObject=ruleValueObject();

            state._fsp--;

             current =iv_ruleValueObject; 
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
    // $ANTLR end "entryRuleValueObject"


    // $ANTLR start "ruleValueObject"
    // InternalAsomemodel.g:706:1: ruleValueObject returns [EObject current=null] : (otherlv_0= 'ValueObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'attributes' otherlv_4= ':' ( (lv_attri_5_0= ruleAttri ) )* otherlv_6= '}' ) ;
    public final EObject ruleValueObject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attri_5_0 = null;



        	enterRule();

        try {
            // InternalAsomemodel.g:712:2: ( (otherlv_0= 'ValueObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'attributes' otherlv_4= ':' ( (lv_attri_5_0= ruleAttri ) )* otherlv_6= '}' ) )
            // InternalAsomemodel.g:713:2: (otherlv_0= 'ValueObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'attributes' otherlv_4= ':' ( (lv_attri_5_0= ruleAttri ) )* otherlv_6= '}' )
            {
            // InternalAsomemodel.g:713:2: (otherlv_0= 'ValueObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'attributes' otherlv_4= ':' ( (lv_attri_5_0= ruleAttri ) )* otherlv_6= '}' )
            // InternalAsomemodel.g:714:3: otherlv_0= 'ValueObject' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'attributes' otherlv_4= ':' ( (lv_attri_5_0= ruleAttri ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getValueObjectAccess().getValueObjectKeyword_0());
            		
            // InternalAsomemodel.g:718:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalAsomemodel.g:719:4: (lv_name_1_0= RULE_ID )
            {
            // InternalAsomemodel.g:719:4: (lv_name_1_0= RULE_ID )
            // InternalAsomemodel.g:720:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getValueObjectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getValueObjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getValueObjectAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getValueObjectAccess().getAttributesKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getValueObjectAccess().getColonKeyword_4());
            		
            // InternalAsomemodel.g:748:3: ( (lv_attri_5_0= ruleAttri ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAsomemodel.g:749:4: (lv_attri_5_0= ruleAttri )
            	    {
            	    // InternalAsomemodel.g:749:4: (lv_attri_5_0= ruleAttri )
            	    // InternalAsomemodel.g:750:5: lv_attri_5_0= ruleAttri
            	    {

            	    					newCompositeNode(grammarAccess.getValueObjectAccess().getAttriAttriParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_attri_5_0=ruleAttri();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getValueObjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attri",
            	    						lv_attri_5_0,
            	    						"org.xtext.Asomemodel.Attri");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getValueObjectAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleValueObject"


    // $ANTLR start "entryRuleAttri"
    // InternalAsomemodel.g:775:1: entryRuleAttri returns [EObject current=null] : iv_ruleAttri= ruleAttri EOF ;
    public final EObject entryRuleAttri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttri = null;


        try {
            // InternalAsomemodel.g:775:46: (iv_ruleAttri= ruleAttri EOF )
            // InternalAsomemodel.g:776:2: iv_ruleAttri= ruleAttri EOF
            {
             newCompositeNode(grammarAccess.getAttriRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttri=ruleAttri();

            state._fsp--;

             current =iv_ruleAttri; 
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
    // $ANTLR end "entryRuleAttri"


    // $ANTLR start "ruleAttri"
    // InternalAsomemodel.g:782:1: ruleAttri returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_datatype_6_0= ruleDatatype ) ) ( (lv_multiplicity_7_0= ruleMultiplicity ) ) ( (lv_order_8_0= ruleOrder ) ) otherlv_9= ';' ) ;
    public final EObject ruleAttri() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_datatype_6_0 = null;

        EObject lv_multiplicity_7_0 = null;

        AntlrDatatypeRuleToken lv_order_8_0 = null;



        	enterRule();

        try {
            // InternalAsomemodel.g:788:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_datatype_6_0= ruleDatatype ) ) ( (lv_multiplicity_7_0= ruleMultiplicity ) ) ( (lv_order_8_0= ruleOrder ) ) otherlv_9= ';' ) )
            // InternalAsomemodel.g:789:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_datatype_6_0= ruleDatatype ) ) ( (lv_multiplicity_7_0= ruleMultiplicity ) ) ( (lv_order_8_0= ruleOrder ) ) otherlv_9= ';' )
            {
            // InternalAsomemodel.g:789:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_datatype_6_0= ruleDatatype ) ) ( (lv_multiplicity_7_0= ruleMultiplicity ) ) ( (lv_order_8_0= ruleOrder ) ) otherlv_9= ';' )
            // InternalAsomemodel.g:790:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= '.' ( (lv_datatype_6_0= ruleDatatype ) ) ( (lv_multiplicity_7_0= ruleMultiplicity ) ) ( (lv_order_8_0= ruleOrder ) ) otherlv_9= ';'
            {
            // InternalAsomemodel.g:790:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalAsomemodel.g:791:4: (lv_name_0_0= RULE_ID )
            {
            // InternalAsomemodel.g:791:4: (lv_name_0_0= RULE_ID )
            // InternalAsomemodel.g:792:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getAttriAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttriRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAttriAccess().getColonKeyword_1());
            		
            // InternalAsomemodel.g:812:3: ( (otherlv_2= RULE_ID ) )
            // InternalAsomemodel.g:813:4: (otherlv_2= RULE_ID )
            {
            // InternalAsomemodel.g:813:4: (otherlv_2= RULE_ID )
            // InternalAsomemodel.g:814:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttriRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_2, grammarAccess.getAttriAccess().getCrossModelModelCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAttriAccess().getFullStopKeyword_3());
            		
            // InternalAsomemodel.g:829:3: ( (otherlv_4= RULE_ID ) )
            // InternalAsomemodel.g:830:4: (otherlv_4= RULE_ID )
            {
            // InternalAsomemodel.g:830:4: (otherlv_4= RULE_ID )
            // InternalAsomemodel.g:831:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttriRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_4, grammarAccess.getAttriAccess().getCrossInterfaceDomainInterfaceCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getAttriAccess().getFullStopKeyword_5());
            		
            // InternalAsomemodel.g:846:3: ( (lv_datatype_6_0= ruleDatatype ) )
            // InternalAsomemodel.g:847:4: (lv_datatype_6_0= ruleDatatype )
            {
            // InternalAsomemodel.g:847:4: (lv_datatype_6_0= ruleDatatype )
            // InternalAsomemodel.g:848:5: lv_datatype_6_0= ruleDatatype
            {

            					newCompositeNode(grammarAccess.getAttriAccess().getDatatypeDatatypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_18);
            lv_datatype_6_0=ruleDatatype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttriRule());
            					}
            					set(
            						current,
            						"datatype",
            						lv_datatype_6_0,
            						"org.xtext.Asomemodel.Datatype");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAsomemodel.g:865:3: ( (lv_multiplicity_7_0= ruleMultiplicity ) )
            // InternalAsomemodel.g:866:4: (lv_multiplicity_7_0= ruleMultiplicity )
            {
            // InternalAsomemodel.g:866:4: (lv_multiplicity_7_0= ruleMultiplicity )
            // InternalAsomemodel.g:867:5: lv_multiplicity_7_0= ruleMultiplicity
            {

            					newCompositeNode(grammarAccess.getAttriAccess().getMultiplicityMultiplicityParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_25);
            lv_multiplicity_7_0=ruleMultiplicity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttriRule());
            					}
            					set(
            						current,
            						"multiplicity",
            						lv_multiplicity_7_0,
            						"org.xtext.Asomemodel.Multiplicity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAsomemodel.g:884:3: ( (lv_order_8_0= ruleOrder ) )
            // InternalAsomemodel.g:885:4: (lv_order_8_0= ruleOrder )
            {
            // InternalAsomemodel.g:885:4: (lv_order_8_0= ruleOrder )
            // InternalAsomemodel.g:886:5: lv_order_8_0= ruleOrder
            {

            					newCompositeNode(grammarAccess.getAttriAccess().getOrderOrderParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_15);
            lv_order_8_0=ruleOrder();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttriRule());
            					}
            					set(
            						current,
            						"order",
            						lv_order_8_0,
            						"org.xtext.Asomemodel.Order");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAttriAccess().getSemicolonKeyword_9());
            		

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
    // $ANTLR end "ruleAttri"


    // $ANTLR start "entryRuleOrder"
    // InternalAsomemodel.g:911:1: entryRuleOrder returns [String current=null] : iv_ruleOrder= ruleOrder EOF ;
    public final String entryRuleOrder() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOrder = null;


        try {
            // InternalAsomemodel.g:911:45: (iv_ruleOrder= ruleOrder EOF )
            // InternalAsomemodel.g:912:2: iv_ruleOrder= ruleOrder EOF
            {
             newCompositeNode(grammarAccess.getOrderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrder=ruleOrder();

            state._fsp--;

             current =iv_ruleOrder.getText(); 
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
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // InternalAsomemodel.g:918:1: ruleOrder returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ordered' | kw= 'unordered' ) ;
    public final AntlrDatatypeRuleToken ruleOrder() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalAsomemodel.g:924:2: ( (kw= 'ordered' | kw= 'unordered' ) )
            // InternalAsomemodel.g:925:2: (kw= 'ordered' | kw= 'unordered' )
            {
            // InternalAsomemodel.g:925:2: (kw= 'ordered' | kw= 'unordered' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==35) ) {
                alt9=1;
            }
            else if ( (LA9_0==36) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAsomemodel.g:926:3: kw= 'ordered'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrderAccess().getOrderedKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAsomemodel.g:932:3: kw= 'unordered'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOrderAccess().getUnorderedKeyword_1());
                    		

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
    // $ANTLR end "ruleOrder"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000404202000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001800000000L});

}