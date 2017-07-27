package org.xtext.ide.contentassist.antlr.internal;

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
import org.xtext.services.AsomemodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAsomemodelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Double'", "'Int'", "'String'", "'inf'", "'ordered'", "'unordered'", "'Model'", "'{'", "'}'", "'RepositoryService'", "'Provided'", "'DomainInterface'", "'DataPort'", "'interfaces'", "':'", "'.'", "'Type'", "';'", "'Immutable'", "'NonVolatile'", "'Entity'", "'attributes'", "'['", "','", "']'", "'ValueObject'"
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

    	public void setGrammarAccess(AsomemodelGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleAsomemodel"
    // InternalAsomemodel.g:53:1: entryRuleAsomemodel : ruleAsomemodel EOF ;
    public final void entryRuleAsomemodel() throws RecognitionException {
        try {
            // InternalAsomemodel.g:54:1: ( ruleAsomemodel EOF )
            // InternalAsomemodel.g:55:1: ruleAsomemodel EOF
            {
             before(grammarAccess.getAsomemodelRule()); 
            pushFollow(FOLLOW_1);
            ruleAsomemodel();

            state._fsp--;

             after(grammarAccess.getAsomemodelRule()); 
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
    // $ANTLR end "entryRuleAsomemodel"


    // $ANTLR start "ruleAsomemodel"
    // InternalAsomemodel.g:62:1: ruleAsomemodel : ( ruleModel ) ;
    public final void ruleAsomemodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:66:2: ( ( ruleModel ) )
            // InternalAsomemodel.g:67:2: ( ruleModel )
            {
            // InternalAsomemodel.g:67:2: ( ruleModel )
            // InternalAsomemodel.g:68:3: ruleModel
            {
             before(grammarAccess.getAsomemodelAccess().getModelParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getAsomemodelAccess().getModelParserRuleCall()); 

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
    // $ANTLR end "ruleAsomemodel"


    // $ANTLR start "entryRuleModel"
    // InternalAsomemodel.g:78:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalAsomemodel.g:79:1: ( ruleModel EOF )
            // InternalAsomemodel.g:80:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalAsomemodel.g:87:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:91:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalAsomemodel.g:92:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalAsomemodel.g:92:2: ( ( rule__Model__Group__0 ) )
            // InternalAsomemodel.g:93:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalAsomemodel.g:94:3: ( rule__Model__Group__0 )
            // InternalAsomemodel.g:94:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRepositoryService"
    // InternalAsomemodel.g:103:1: entryRuleRepositoryService : ruleRepositoryService EOF ;
    public final void entryRuleRepositoryService() throws RecognitionException {
        try {
            // InternalAsomemodel.g:104:1: ( ruleRepositoryService EOF )
            // InternalAsomemodel.g:105:1: ruleRepositoryService EOF
            {
             before(grammarAccess.getRepositoryServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleRepositoryService();

            state._fsp--;

             after(grammarAccess.getRepositoryServiceRule()); 
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
    // $ANTLR end "entryRuleRepositoryService"


    // $ANTLR start "ruleRepositoryService"
    // InternalAsomemodel.g:112:1: ruleRepositoryService : ( ( rule__RepositoryService__Group__0 ) ) ;
    public final void ruleRepositoryService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:116:2: ( ( ( rule__RepositoryService__Group__0 ) ) )
            // InternalAsomemodel.g:117:2: ( ( rule__RepositoryService__Group__0 ) )
            {
            // InternalAsomemodel.g:117:2: ( ( rule__RepositoryService__Group__0 ) )
            // InternalAsomemodel.g:118:3: ( rule__RepositoryService__Group__0 )
            {
             before(grammarAccess.getRepositoryServiceAccess().getGroup()); 
            // InternalAsomemodel.g:119:3: ( rule__RepositoryService__Group__0 )
            // InternalAsomemodel.g:119:4: rule__RepositoryService__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryServiceAccess().getGroup()); 

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
    // $ANTLR end "ruleRepositoryService"


    // $ANTLR start "entryRuleDomainInterface"
    // InternalAsomemodel.g:128:1: entryRuleDomainInterface : ruleDomainInterface EOF ;
    public final void entryRuleDomainInterface() throws RecognitionException {
        try {
            // InternalAsomemodel.g:129:1: ( ruleDomainInterface EOF )
            // InternalAsomemodel.g:130:1: ruleDomainInterface EOF
            {
             before(grammarAccess.getDomainInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainInterface();

            state._fsp--;

             after(grammarAccess.getDomainInterfaceRule()); 
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
    // $ANTLR end "entryRuleDomainInterface"


    // $ANTLR start "ruleDomainInterface"
    // InternalAsomemodel.g:137:1: ruleDomainInterface : ( ( rule__DomainInterface__Group__0 ) ) ;
    public final void ruleDomainInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:141:2: ( ( ( rule__DomainInterface__Group__0 ) ) )
            // InternalAsomemodel.g:142:2: ( ( rule__DomainInterface__Group__0 ) )
            {
            // InternalAsomemodel.g:142:2: ( ( rule__DomainInterface__Group__0 ) )
            // InternalAsomemodel.g:143:3: ( rule__DomainInterface__Group__0 )
            {
             before(grammarAccess.getDomainInterfaceAccess().getGroup()); 
            // InternalAsomemodel.g:144:3: ( rule__DomainInterface__Group__0 )
            // InternalAsomemodel.g:144:4: rule__DomainInterface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DomainInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainInterfaceAccess().getGroup()); 

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
    // $ANTLR end "ruleDomainInterface"


    // $ANTLR start "entryRuleDataPort"
    // InternalAsomemodel.g:153:1: entryRuleDataPort : ruleDataPort EOF ;
    public final void entryRuleDataPort() throws RecognitionException {
        try {
            // InternalAsomemodel.g:154:1: ( ruleDataPort EOF )
            // InternalAsomemodel.g:155:1: ruleDataPort EOF
            {
             before(grammarAccess.getDataPortRule()); 
            pushFollow(FOLLOW_1);
            ruleDataPort();

            state._fsp--;

             after(grammarAccess.getDataPortRule()); 
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
    // $ANTLR end "entryRuleDataPort"


    // $ANTLR start "ruleDataPort"
    // InternalAsomemodel.g:162:1: ruleDataPort : ( ( rule__DataPort__Group__0 ) ) ;
    public final void ruleDataPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:166:2: ( ( ( rule__DataPort__Group__0 ) ) )
            // InternalAsomemodel.g:167:2: ( ( rule__DataPort__Group__0 ) )
            {
            // InternalAsomemodel.g:167:2: ( ( rule__DataPort__Group__0 ) )
            // InternalAsomemodel.g:168:3: ( rule__DataPort__Group__0 )
            {
             before(grammarAccess.getDataPortAccess().getGroup()); 
            // InternalAsomemodel.g:169:3: ( rule__DataPort__Group__0 )
            // InternalAsomemodel.g:169:4: rule__DataPort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataPortAccess().getGroup()); 

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
    // $ANTLR end "ruleDataPort"


    // $ANTLR start "entryRuleElement"
    // InternalAsomemodel.g:178:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalAsomemodel.g:179:1: ( ruleElement EOF )
            // InternalAsomemodel.g:180:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalAsomemodel.g:187:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:191:2: ( ( ( rule__Element__Alternatives ) ) )
            // InternalAsomemodel.g:192:2: ( ( rule__Element__Alternatives ) )
            {
            // InternalAsomemodel.g:192:2: ( ( rule__Element__Alternatives ) )
            // InternalAsomemodel.g:193:3: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // InternalAsomemodel.g:194:3: ( rule__Element__Alternatives )
            // InternalAsomemodel.g:194:4: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleType"
    // InternalAsomemodel.g:203:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalAsomemodel.g:204:1: ( ruleType EOF )
            // InternalAsomemodel.g:205:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalAsomemodel.g:212:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:216:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalAsomemodel.g:217:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalAsomemodel.g:217:2: ( ( rule__Type__Group__0 ) )
            // InternalAsomemodel.g:218:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalAsomemodel.g:219:3: ( rule__Type__Group__0 )
            // InternalAsomemodel.g:219:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDatatype"
    // InternalAsomemodel.g:228:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // InternalAsomemodel.g:229:1: ( ruleDatatype EOF )
            // InternalAsomemodel.g:230:1: ruleDatatype EOF
            {
             before(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getDatatypeRule()); 
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
    // $ANTLR end "entryRuleDatatype"


    // $ANTLR start "ruleDatatype"
    // InternalAsomemodel.g:237:1: ruleDatatype : ( ( rule__Datatype__Alternatives ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:241:2: ( ( ( rule__Datatype__Alternatives ) ) )
            // InternalAsomemodel.g:242:2: ( ( rule__Datatype__Alternatives ) )
            {
            // InternalAsomemodel.g:242:2: ( ( rule__Datatype__Alternatives ) )
            // InternalAsomemodel.g:243:3: ( rule__Datatype__Alternatives )
            {
             before(grammarAccess.getDatatypeAccess().getAlternatives()); 
            // InternalAsomemodel.g:244:3: ( rule__Datatype__Alternatives )
            // InternalAsomemodel.g:244:4: rule__Datatype__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Datatype__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDatatype"


    // $ANTLR start "entryRuleEntity"
    // InternalAsomemodel.g:253:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalAsomemodel.g:254:1: ( ruleEntity EOF )
            // InternalAsomemodel.g:255:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalAsomemodel.g:262:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:266:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalAsomemodel.g:267:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalAsomemodel.g:267:2: ( ( rule__Entity__Group__0 ) )
            // InternalAsomemodel.g:268:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalAsomemodel.g:269:3: ( rule__Entity__Group__0 )
            // InternalAsomemodel.g:269:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleMultiplicity"
    // InternalAsomemodel.g:278:1: entryRuleMultiplicity : ruleMultiplicity EOF ;
    public final void entryRuleMultiplicity() throws RecognitionException {
        try {
            // InternalAsomemodel.g:279:1: ( ruleMultiplicity EOF )
            // InternalAsomemodel.g:280:1: ruleMultiplicity EOF
            {
             before(grammarAccess.getMultiplicityRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getMultiplicityRule()); 
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
    // $ANTLR end "entryRuleMultiplicity"


    // $ANTLR start "ruleMultiplicity"
    // InternalAsomemodel.g:287:1: ruleMultiplicity : ( ( rule__Multiplicity__Group__0 ) ) ;
    public final void ruleMultiplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:291:2: ( ( ( rule__Multiplicity__Group__0 ) ) )
            // InternalAsomemodel.g:292:2: ( ( rule__Multiplicity__Group__0 ) )
            {
            // InternalAsomemodel.g:292:2: ( ( rule__Multiplicity__Group__0 ) )
            // InternalAsomemodel.g:293:3: ( rule__Multiplicity__Group__0 )
            {
             before(grammarAccess.getMultiplicityAccess().getGroup()); 
            // InternalAsomemodel.g:294:3: ( rule__Multiplicity__Group__0 )
            // InternalAsomemodel.g:294:4: rule__Multiplicity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getGroup()); 

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
    // $ANTLR end "ruleMultiplicity"


    // $ANTLR start "entryRuleValueObject"
    // InternalAsomemodel.g:303:1: entryRuleValueObject : ruleValueObject EOF ;
    public final void entryRuleValueObject() throws RecognitionException {
        try {
            // InternalAsomemodel.g:304:1: ( ruleValueObject EOF )
            // InternalAsomemodel.g:305:1: ruleValueObject EOF
            {
             before(grammarAccess.getValueObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleValueObject();

            state._fsp--;

             after(grammarAccess.getValueObjectRule()); 
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
    // $ANTLR end "entryRuleValueObject"


    // $ANTLR start "ruleValueObject"
    // InternalAsomemodel.g:312:1: ruleValueObject : ( ( rule__ValueObject__Group__0 ) ) ;
    public final void ruleValueObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:316:2: ( ( ( rule__ValueObject__Group__0 ) ) )
            // InternalAsomemodel.g:317:2: ( ( rule__ValueObject__Group__0 ) )
            {
            // InternalAsomemodel.g:317:2: ( ( rule__ValueObject__Group__0 ) )
            // InternalAsomemodel.g:318:3: ( rule__ValueObject__Group__0 )
            {
             before(grammarAccess.getValueObjectAccess().getGroup()); 
            // InternalAsomemodel.g:319:3: ( rule__ValueObject__Group__0 )
            // InternalAsomemodel.g:319:4: rule__ValueObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ValueObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getValueObjectAccess().getGroup()); 

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
    // $ANTLR end "ruleValueObject"


    // $ANTLR start "entryRuleAttri"
    // InternalAsomemodel.g:328:1: entryRuleAttri : ruleAttri EOF ;
    public final void entryRuleAttri() throws RecognitionException {
        try {
            // InternalAsomemodel.g:329:1: ( ruleAttri EOF )
            // InternalAsomemodel.g:330:1: ruleAttri EOF
            {
             before(grammarAccess.getAttriRule()); 
            pushFollow(FOLLOW_1);
            ruleAttri();

            state._fsp--;

             after(grammarAccess.getAttriRule()); 
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
    // $ANTLR end "entryRuleAttri"


    // $ANTLR start "ruleAttri"
    // InternalAsomemodel.g:337:1: ruleAttri : ( ( rule__Attri__Group__0 ) ) ;
    public final void ruleAttri() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:341:2: ( ( ( rule__Attri__Group__0 ) ) )
            // InternalAsomemodel.g:342:2: ( ( rule__Attri__Group__0 ) )
            {
            // InternalAsomemodel.g:342:2: ( ( rule__Attri__Group__0 ) )
            // InternalAsomemodel.g:343:3: ( rule__Attri__Group__0 )
            {
             before(grammarAccess.getAttriAccess().getGroup()); 
            // InternalAsomemodel.g:344:3: ( rule__Attri__Group__0 )
            // InternalAsomemodel.g:344:4: rule__Attri__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attri__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttriAccess().getGroup()); 

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
    // $ANTLR end "ruleAttri"


    // $ANTLR start "entryRuleOrder"
    // InternalAsomemodel.g:353:1: entryRuleOrder : ruleOrder EOF ;
    public final void entryRuleOrder() throws RecognitionException {
        try {
            // InternalAsomemodel.g:354:1: ( ruleOrder EOF )
            // InternalAsomemodel.g:355:1: ruleOrder EOF
            {
             before(grammarAccess.getOrderRule()); 
            pushFollow(FOLLOW_1);
            ruleOrder();

            state._fsp--;

             after(grammarAccess.getOrderRule()); 
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
    // $ANTLR end "entryRuleOrder"


    // $ANTLR start "ruleOrder"
    // InternalAsomemodel.g:362:1: ruleOrder : ( ( rule__Order__Alternatives ) ) ;
    public final void ruleOrder() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:366:2: ( ( ( rule__Order__Alternatives ) ) )
            // InternalAsomemodel.g:367:2: ( ( rule__Order__Alternatives ) )
            {
            // InternalAsomemodel.g:367:2: ( ( rule__Order__Alternatives ) )
            // InternalAsomemodel.g:368:3: ( rule__Order__Alternatives )
            {
             before(grammarAccess.getOrderAccess().getAlternatives()); 
            // InternalAsomemodel.g:369:3: ( rule__Order__Alternatives )
            // InternalAsomemodel.g:369:4: rule__Order__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Order__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrderAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOrder"


    // $ANTLR start "rule__Element__Alternatives"
    // InternalAsomemodel.g:377:1: rule__Element__Alternatives : ( ( ruleType ) | ( ruleEntity ) | ( ruleValueObject ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:381:1: ( ( ruleType ) | ( ruleEntity ) | ( ruleValueObject ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt1=1;
                }
                break;
            case 29:
                {
                alt1=2;
                }
                break;
            case 36:
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
                    // InternalAsomemodel.g:382:2: ( ruleType )
                    {
                    // InternalAsomemodel.g:382:2: ( ruleType )
                    // InternalAsomemodel.g:383:3: ruleType
                    {
                     before(grammarAccess.getElementAccess().getTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAsomemodel.g:388:2: ( ruleEntity )
                    {
                    // InternalAsomemodel.g:388:2: ( ruleEntity )
                    // InternalAsomemodel.g:389:3: ruleEntity
                    {
                     before(grammarAccess.getElementAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getEntityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAsomemodel.g:394:2: ( ruleValueObject )
                    {
                    // InternalAsomemodel.g:394:2: ( ruleValueObject )
                    // InternalAsomemodel.g:395:3: ruleValueObject
                    {
                     before(grammarAccess.getElementAccess().getValueObjectParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleValueObject();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getValueObjectParserRuleCall_2()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__Datatype__Alternatives"
    // InternalAsomemodel.g:404:1: rule__Datatype__Alternatives : ( ( 'Double' ) | ( 'Int' ) | ( 'String' ) );
    public final void rule__Datatype__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:408:1: ( ( 'Double' ) | ( 'Int' ) | ( 'String' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAsomemodel.g:409:2: ( 'Double' )
                    {
                    // InternalAsomemodel.g:409:2: ( 'Double' )
                    // InternalAsomemodel.g:410:3: 'Double'
                    {
                     before(grammarAccess.getDatatypeAccess().getDoubleKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getDatatypeAccess().getDoubleKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAsomemodel.g:415:2: ( 'Int' )
                    {
                    // InternalAsomemodel.g:415:2: ( 'Int' )
                    // InternalAsomemodel.g:416:3: 'Int'
                    {
                     before(grammarAccess.getDatatypeAccess().getIntKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDatatypeAccess().getIntKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAsomemodel.g:421:2: ( 'String' )
                    {
                    // InternalAsomemodel.g:421:2: ( 'String' )
                    // InternalAsomemodel.g:422:3: 'String'
                    {
                     before(grammarAccess.getDatatypeAccess().getStringKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getDatatypeAccess().getStringKeyword_2()); 

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
    // $ANTLR end "rule__Datatype__Alternatives"


    // $ANTLR start "rule__Multiplicity__Alternatives_3"
    // InternalAsomemodel.g:431:1: rule__Multiplicity__Alternatives_3 : ( ( ( rule__Multiplicity__NameAssignment_3_0 ) ) | ( 'inf' ) );
    public final void rule__Multiplicity__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:435:1: ( ( ( rule__Multiplicity__NameAssignment_3_0 ) ) | ( 'inf' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAsomemodel.g:436:2: ( ( rule__Multiplicity__NameAssignment_3_0 ) )
                    {
                    // InternalAsomemodel.g:436:2: ( ( rule__Multiplicity__NameAssignment_3_0 ) )
                    // InternalAsomemodel.g:437:3: ( rule__Multiplicity__NameAssignment_3_0 )
                    {
                     before(grammarAccess.getMultiplicityAccess().getNameAssignment_3_0()); 
                    // InternalAsomemodel.g:438:3: ( rule__Multiplicity__NameAssignment_3_0 )
                    // InternalAsomemodel.g:438:4: rule__Multiplicity__NameAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplicity__NameAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicityAccess().getNameAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAsomemodel.g:442:2: ( 'inf' )
                    {
                    // InternalAsomemodel.g:442:2: ( 'inf' )
                    // InternalAsomemodel.g:443:3: 'inf'
                    {
                     before(grammarAccess.getMultiplicityAccess().getInfKeyword_3_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMultiplicityAccess().getInfKeyword_3_1()); 

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
    // $ANTLR end "rule__Multiplicity__Alternatives_3"


    // $ANTLR start "rule__Order__Alternatives"
    // InternalAsomemodel.g:452:1: rule__Order__Alternatives : ( ( 'ordered' ) | ( 'unordered' ) );
    public final void rule__Order__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:456:1: ( ( 'ordered' ) | ( 'unordered' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAsomemodel.g:457:2: ( 'ordered' )
                    {
                    // InternalAsomemodel.g:457:2: ( 'ordered' )
                    // InternalAsomemodel.g:458:3: 'ordered'
                    {
                     before(grammarAccess.getOrderAccess().getOrderedKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getOrderAccess().getOrderedKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAsomemodel.g:463:2: ( 'unordered' )
                    {
                    // InternalAsomemodel.g:463:2: ( 'unordered' )
                    // InternalAsomemodel.g:464:3: 'unordered'
                    {
                     before(grammarAccess.getOrderAccess().getUnorderedKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOrderAccess().getUnorderedKeyword_1()); 

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
    // $ANTLR end "rule__Order__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalAsomemodel.g:473:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:477:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalAsomemodel.g:478:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalAsomemodel.g:485:1: rule__Model__Group__0__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:489:1: ( ( 'Model' ) )
            // InternalAsomemodel.g:490:1: ( 'Model' )
            {
            // InternalAsomemodel.g:490:1: ( 'Model' )
            // InternalAsomemodel.g:491:2: 'Model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalAsomemodel.g:500:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:504:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalAsomemodel.g:505:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalAsomemodel.g:512:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:516:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalAsomemodel.g:517:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalAsomemodel.g:517:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalAsomemodel.g:518:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalAsomemodel.g:519:2: ( rule__Model__NameAssignment_1 )
            // InternalAsomemodel.g:519:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalAsomemodel.g:527:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:531:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalAsomemodel.g:532:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalAsomemodel.g:539:1: rule__Model__Group__2__Impl : ( '{' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:543:1: ( ( '{' ) )
            // InternalAsomemodel.g:544:1: ( '{' )
            {
            // InternalAsomemodel.g:544:1: ( '{' )
            // InternalAsomemodel.g:545:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalAsomemodel.g:554:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:558:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalAsomemodel.g:559:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalAsomemodel.g:566:1: rule__Model__Group__3__Impl : ( ( rule__Model__RepositoryserviceAssignment_3 )? ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:570:1: ( ( ( rule__Model__RepositoryserviceAssignment_3 )? ) )
            // InternalAsomemodel.g:571:1: ( ( rule__Model__RepositoryserviceAssignment_3 )? )
            {
            // InternalAsomemodel.g:571:1: ( ( rule__Model__RepositoryserviceAssignment_3 )? )
            // InternalAsomemodel.g:572:2: ( rule__Model__RepositoryserviceAssignment_3 )?
            {
             before(grammarAccess.getModelAccess().getRepositoryserviceAssignment_3()); 
            // InternalAsomemodel.g:573:2: ( rule__Model__RepositoryserviceAssignment_3 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAsomemodel.g:573:3: rule__Model__RepositoryserviceAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__RepositoryserviceAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getRepositoryserviceAssignment_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalAsomemodel.g:581:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:585:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalAsomemodel.g:586:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalAsomemodel.g:593:1: rule__Model__Group__4__Impl : ( ( rule__Model__DomaininterfaceAssignment_4 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:597:1: ( ( ( rule__Model__DomaininterfaceAssignment_4 )? ) )
            // InternalAsomemodel.g:598:1: ( ( rule__Model__DomaininterfaceAssignment_4 )? )
            {
            // InternalAsomemodel.g:598:1: ( ( rule__Model__DomaininterfaceAssignment_4 )? )
            // InternalAsomemodel.g:599:2: ( rule__Model__DomaininterfaceAssignment_4 )?
            {
             before(grammarAccess.getModelAccess().getDomaininterfaceAssignment_4()); 
            // InternalAsomemodel.g:600:2: ( rule__Model__DomaininterfaceAssignment_4 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAsomemodel.g:600:3: rule__Model__DomaininterfaceAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__DomaininterfaceAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getDomaininterfaceAssignment_4()); 

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
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalAsomemodel.g:608:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:612:1: ( rule__Model__Group__5__Impl )
            // InternalAsomemodel.g:613:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__5__Impl();

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
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalAsomemodel.g:619:1: rule__Model__Group__5__Impl : ( '}' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:623:1: ( ( '}' ) )
            // InternalAsomemodel.g:624:1: ( '}' )
            {
            // InternalAsomemodel.g:624:1: ( '}' )
            // InternalAsomemodel.g:625:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__RepositoryService__Group__0"
    // InternalAsomemodel.g:635:1: rule__RepositoryService__Group__0 : rule__RepositoryService__Group__0__Impl rule__RepositoryService__Group__1 ;
    public final void rule__RepositoryService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:639:1: ( rule__RepositoryService__Group__0__Impl rule__RepositoryService__Group__1 )
            // InternalAsomemodel.g:640:2: rule__RepositoryService__Group__0__Impl rule__RepositoryService__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RepositoryService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepositoryService__Group__1();

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
    // $ANTLR end "rule__RepositoryService__Group__0"


    // $ANTLR start "rule__RepositoryService__Group__0__Impl"
    // InternalAsomemodel.g:647:1: rule__RepositoryService__Group__0__Impl : ( 'RepositoryService' ) ;
    public final void rule__RepositoryService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:651:1: ( ( 'RepositoryService' ) )
            // InternalAsomemodel.g:652:1: ( 'RepositoryService' )
            {
            // InternalAsomemodel.g:652:1: ( 'RepositoryService' )
            // InternalAsomemodel.g:653:2: 'RepositoryService'
            {
             before(grammarAccess.getRepositoryServiceAccess().getRepositoryServiceKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRepositoryServiceAccess().getRepositoryServiceKeyword_0()); 

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
    // $ANTLR end "rule__RepositoryService__Group__0__Impl"


    // $ANTLR start "rule__RepositoryService__Group__1"
    // InternalAsomemodel.g:662:1: rule__RepositoryService__Group__1 : rule__RepositoryService__Group__1__Impl rule__RepositoryService__Group__2 ;
    public final void rule__RepositoryService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:666:1: ( rule__RepositoryService__Group__1__Impl rule__RepositoryService__Group__2 )
            // InternalAsomemodel.g:667:2: rule__RepositoryService__Group__1__Impl rule__RepositoryService__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RepositoryService__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepositoryService__Group__2();

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
    // $ANTLR end "rule__RepositoryService__Group__1"


    // $ANTLR start "rule__RepositoryService__Group__1__Impl"
    // InternalAsomemodel.g:674:1: rule__RepositoryService__Group__1__Impl : ( ( rule__RepositoryService__NameAssignment_1 ) ) ;
    public final void rule__RepositoryService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:678:1: ( ( ( rule__RepositoryService__NameAssignment_1 ) ) )
            // InternalAsomemodel.g:679:1: ( ( rule__RepositoryService__NameAssignment_1 ) )
            {
            // InternalAsomemodel.g:679:1: ( ( rule__RepositoryService__NameAssignment_1 ) )
            // InternalAsomemodel.g:680:2: ( rule__RepositoryService__NameAssignment_1 )
            {
             before(grammarAccess.getRepositoryServiceAccess().getNameAssignment_1()); 
            // InternalAsomemodel.g:681:2: ( rule__RepositoryService__NameAssignment_1 )
            // InternalAsomemodel.g:681:3: rule__RepositoryService__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryService__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryServiceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RepositoryService__Group__1__Impl"


    // $ANTLR start "rule__RepositoryService__Group__2"
    // InternalAsomemodel.g:689:1: rule__RepositoryService__Group__2 : rule__RepositoryService__Group__2__Impl rule__RepositoryService__Group__3 ;
    public final void rule__RepositoryService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:693:1: ( rule__RepositoryService__Group__2__Impl rule__RepositoryService__Group__3 )
            // InternalAsomemodel.g:694:2: rule__RepositoryService__Group__2__Impl rule__RepositoryService__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__RepositoryService__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepositoryService__Group__3();

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
    // $ANTLR end "rule__RepositoryService__Group__2"


    // $ANTLR start "rule__RepositoryService__Group__2__Impl"
    // InternalAsomemodel.g:701:1: rule__RepositoryService__Group__2__Impl : ( '{' ) ;
    public final void rule__RepositoryService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:705:1: ( ( '{' ) )
            // InternalAsomemodel.g:706:1: ( '{' )
            {
            // InternalAsomemodel.g:706:1: ( '{' )
            // InternalAsomemodel.g:707:2: '{'
            {
             before(grammarAccess.getRepositoryServiceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRepositoryServiceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__RepositoryService__Group__2__Impl"


    // $ANTLR start "rule__RepositoryService__Group__3"
    // InternalAsomemodel.g:716:1: rule__RepositoryService__Group__3 : rule__RepositoryService__Group__3__Impl rule__RepositoryService__Group__4 ;
    public final void rule__RepositoryService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:720:1: ( rule__RepositoryService__Group__3__Impl rule__RepositoryService__Group__4 )
            // InternalAsomemodel.g:721:2: rule__RepositoryService__Group__3__Impl rule__RepositoryService__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__RepositoryService__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepositoryService__Group__4();

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
    // $ANTLR end "rule__RepositoryService__Group__3"


    // $ANTLR start "rule__RepositoryService__Group__3__Impl"
    // InternalAsomemodel.g:728:1: rule__RepositoryService__Group__3__Impl : ( 'Provided' ) ;
    public final void rule__RepositoryService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:732:1: ( ( 'Provided' ) )
            // InternalAsomemodel.g:733:1: ( 'Provided' )
            {
            // InternalAsomemodel.g:733:1: ( 'Provided' )
            // InternalAsomemodel.g:734:2: 'Provided'
            {
             before(grammarAccess.getRepositoryServiceAccess().getProvidedKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRepositoryServiceAccess().getProvidedKeyword_3()); 

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
    // $ANTLR end "rule__RepositoryService__Group__3__Impl"


    // $ANTLR start "rule__RepositoryService__Group__4"
    // InternalAsomemodel.g:743:1: rule__RepositoryService__Group__4 : rule__RepositoryService__Group__4__Impl rule__RepositoryService__Group__5 ;
    public final void rule__RepositoryService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:747:1: ( rule__RepositoryService__Group__4__Impl rule__RepositoryService__Group__5 )
            // InternalAsomemodel.g:748:2: rule__RepositoryService__Group__4__Impl rule__RepositoryService__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__RepositoryService__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepositoryService__Group__5();

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
    // $ANTLR end "rule__RepositoryService__Group__4"


    // $ANTLR start "rule__RepositoryService__Group__4__Impl"
    // InternalAsomemodel.g:755:1: rule__RepositoryService__Group__4__Impl : ( ( rule__RepositoryService__DataportAssignment_4 ) ) ;
    public final void rule__RepositoryService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:759:1: ( ( ( rule__RepositoryService__DataportAssignment_4 ) ) )
            // InternalAsomemodel.g:760:1: ( ( rule__RepositoryService__DataportAssignment_4 ) )
            {
            // InternalAsomemodel.g:760:1: ( ( rule__RepositoryService__DataportAssignment_4 ) )
            // InternalAsomemodel.g:761:2: ( rule__RepositoryService__DataportAssignment_4 )
            {
             before(grammarAccess.getRepositoryServiceAccess().getDataportAssignment_4()); 
            // InternalAsomemodel.g:762:2: ( rule__RepositoryService__DataportAssignment_4 )
            // InternalAsomemodel.g:762:3: rule__RepositoryService__DataportAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryService__DataportAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryServiceAccess().getDataportAssignment_4()); 

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
    // $ANTLR end "rule__RepositoryService__Group__4__Impl"


    // $ANTLR start "rule__RepositoryService__Group__5"
    // InternalAsomemodel.g:770:1: rule__RepositoryService__Group__5 : rule__RepositoryService__Group__5__Impl ;
    public final void rule__RepositoryService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:774:1: ( rule__RepositoryService__Group__5__Impl )
            // InternalAsomemodel.g:775:2: rule__RepositoryService__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryService__Group__5__Impl();

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
    // $ANTLR end "rule__RepositoryService__Group__5"


    // $ANTLR start "rule__RepositoryService__Group__5__Impl"
    // InternalAsomemodel.g:781:1: rule__RepositoryService__Group__5__Impl : ( '}' ) ;
    public final void rule__RepositoryService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:785:1: ( ( '}' ) )
            // InternalAsomemodel.g:786:1: ( '}' )
            {
            // InternalAsomemodel.g:786:1: ( '}' )
            // InternalAsomemodel.g:787:2: '}'
            {
             before(grammarAccess.getRepositoryServiceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRepositoryServiceAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__RepositoryService__Group__5__Impl"


    // $ANTLR start "rule__DomainInterface__Group__0"
    // InternalAsomemodel.g:797:1: rule__DomainInterface__Group__0 : rule__DomainInterface__Group__0__Impl rule__DomainInterface__Group__1 ;
    public final void rule__DomainInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:801:1: ( rule__DomainInterface__Group__0__Impl rule__DomainInterface__Group__1 )
            // InternalAsomemodel.g:802:2: rule__DomainInterface__Group__0__Impl rule__DomainInterface__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DomainInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainInterface__Group__1();

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
    // $ANTLR end "rule__DomainInterface__Group__0"


    // $ANTLR start "rule__DomainInterface__Group__0__Impl"
    // InternalAsomemodel.g:809:1: rule__DomainInterface__Group__0__Impl : ( 'DomainInterface' ) ;
    public final void rule__DomainInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:813:1: ( ( 'DomainInterface' ) )
            // InternalAsomemodel.g:814:1: ( 'DomainInterface' )
            {
            // InternalAsomemodel.g:814:1: ( 'DomainInterface' )
            // InternalAsomemodel.g:815:2: 'DomainInterface'
            {
             before(grammarAccess.getDomainInterfaceAccess().getDomainInterfaceKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDomainInterfaceAccess().getDomainInterfaceKeyword_0()); 

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
    // $ANTLR end "rule__DomainInterface__Group__0__Impl"


    // $ANTLR start "rule__DomainInterface__Group__1"
    // InternalAsomemodel.g:824:1: rule__DomainInterface__Group__1 : rule__DomainInterface__Group__1__Impl rule__DomainInterface__Group__2 ;
    public final void rule__DomainInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:828:1: ( rule__DomainInterface__Group__1__Impl rule__DomainInterface__Group__2 )
            // InternalAsomemodel.g:829:2: rule__DomainInterface__Group__1__Impl rule__DomainInterface__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DomainInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainInterface__Group__2();

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
    // $ANTLR end "rule__DomainInterface__Group__1"


    // $ANTLR start "rule__DomainInterface__Group__1__Impl"
    // InternalAsomemodel.g:836:1: rule__DomainInterface__Group__1__Impl : ( ( rule__DomainInterface__NameAssignment_1 ) ) ;
    public final void rule__DomainInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:840:1: ( ( ( rule__DomainInterface__NameAssignment_1 ) ) )
            // InternalAsomemodel.g:841:1: ( ( rule__DomainInterface__NameAssignment_1 ) )
            {
            // InternalAsomemodel.g:841:1: ( ( rule__DomainInterface__NameAssignment_1 ) )
            // InternalAsomemodel.g:842:2: ( rule__DomainInterface__NameAssignment_1 )
            {
             before(grammarAccess.getDomainInterfaceAccess().getNameAssignment_1()); 
            // InternalAsomemodel.g:843:2: ( rule__DomainInterface__NameAssignment_1 )
            // InternalAsomemodel.g:843:3: rule__DomainInterface__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DomainInterface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainInterfaceAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DomainInterface__Group__1__Impl"


    // $ANTLR start "rule__DomainInterface__Group__2"
    // InternalAsomemodel.g:851:1: rule__DomainInterface__Group__2 : rule__DomainInterface__Group__2__Impl rule__DomainInterface__Group__3 ;
    public final void rule__DomainInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:855:1: ( rule__DomainInterface__Group__2__Impl rule__DomainInterface__Group__3 )
            // InternalAsomemodel.g:856:2: rule__DomainInterface__Group__2__Impl rule__DomainInterface__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__DomainInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainInterface__Group__3();

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
    // $ANTLR end "rule__DomainInterface__Group__2"


    // $ANTLR start "rule__DomainInterface__Group__2__Impl"
    // InternalAsomemodel.g:863:1: rule__DomainInterface__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:867:1: ( ( '{' ) )
            // InternalAsomemodel.g:868:1: ( '{' )
            {
            // InternalAsomemodel.g:868:1: ( '{' )
            // InternalAsomemodel.g:869:2: '{'
            {
             before(grammarAccess.getDomainInterfaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDomainInterfaceAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__DomainInterface__Group__2__Impl"


    // $ANTLR start "rule__DomainInterface__Group__3"
    // InternalAsomemodel.g:878:1: rule__DomainInterface__Group__3 : rule__DomainInterface__Group__3__Impl rule__DomainInterface__Group__4 ;
    public final void rule__DomainInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:882:1: ( rule__DomainInterface__Group__3__Impl rule__DomainInterface__Group__4 )
            // InternalAsomemodel.g:883:2: rule__DomainInterface__Group__3__Impl rule__DomainInterface__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__DomainInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainInterface__Group__4();

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
    // $ANTLR end "rule__DomainInterface__Group__3"


    // $ANTLR start "rule__DomainInterface__Group__3__Impl"
    // InternalAsomemodel.g:890:1: rule__DomainInterface__Group__3__Impl : ( ( rule__DomainInterface__ElementAssignment_3 )* ) ;
    public final void rule__DomainInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:894:1: ( ( ( rule__DomainInterface__ElementAssignment_3 )* ) )
            // InternalAsomemodel.g:895:1: ( ( rule__DomainInterface__ElementAssignment_3 )* )
            {
            // InternalAsomemodel.g:895:1: ( ( rule__DomainInterface__ElementAssignment_3 )* )
            // InternalAsomemodel.g:896:2: ( rule__DomainInterface__ElementAssignment_3 )*
            {
             before(grammarAccess.getDomainInterfaceAccess().getElementAssignment_3()); 
            // InternalAsomemodel.g:897:2: ( rule__DomainInterface__ElementAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27||LA7_0==29||LA7_0==36) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAsomemodel.g:897:3: rule__DomainInterface__ElementAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__DomainInterface__ElementAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDomainInterfaceAccess().getElementAssignment_3()); 

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
    // $ANTLR end "rule__DomainInterface__Group__3__Impl"


    // $ANTLR start "rule__DomainInterface__Group__4"
    // InternalAsomemodel.g:905:1: rule__DomainInterface__Group__4 : rule__DomainInterface__Group__4__Impl ;
    public final void rule__DomainInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:909:1: ( rule__DomainInterface__Group__4__Impl )
            // InternalAsomemodel.g:910:2: rule__DomainInterface__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainInterface__Group__4__Impl();

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
    // $ANTLR end "rule__DomainInterface__Group__4"


    // $ANTLR start "rule__DomainInterface__Group__4__Impl"
    // InternalAsomemodel.g:916:1: rule__DomainInterface__Group__4__Impl : ( '}' ) ;
    public final void rule__DomainInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:920:1: ( ( '}' ) )
            // InternalAsomemodel.g:921:1: ( '}' )
            {
            // InternalAsomemodel.g:921:1: ( '}' )
            // InternalAsomemodel.g:922:2: '}'
            {
             before(grammarAccess.getDomainInterfaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDomainInterfaceAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__DomainInterface__Group__4__Impl"


    // $ANTLR start "rule__DataPort__Group__0"
    // InternalAsomemodel.g:932:1: rule__DataPort__Group__0 : rule__DataPort__Group__0__Impl rule__DataPort__Group__1 ;
    public final void rule__DataPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:936:1: ( rule__DataPort__Group__0__Impl rule__DataPort__Group__1 )
            // InternalAsomemodel.g:937:2: rule__DataPort__Group__0__Impl rule__DataPort__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DataPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataPort__Group__1();

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
    // $ANTLR end "rule__DataPort__Group__0"


    // $ANTLR start "rule__DataPort__Group__0__Impl"
    // InternalAsomemodel.g:944:1: rule__DataPort__Group__0__Impl : ( 'DataPort' ) ;
    public final void rule__DataPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:948:1: ( ( 'DataPort' ) )
            // InternalAsomemodel.g:949:1: ( 'DataPort' )
            {
            // InternalAsomemodel.g:949:1: ( 'DataPort' )
            // InternalAsomemodel.g:950:2: 'DataPort'
            {
             before(grammarAccess.getDataPortAccess().getDataPortKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDataPortAccess().getDataPortKeyword_0()); 

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
    // $ANTLR end "rule__DataPort__Group__0__Impl"


    // $ANTLR start "rule__DataPort__Group__1"
    // InternalAsomemodel.g:959:1: rule__DataPort__Group__1 : rule__DataPort__Group__1__Impl rule__DataPort__Group__2 ;
    public final void rule__DataPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:963:1: ( rule__DataPort__Group__1__Impl rule__DataPort__Group__2 )
            // InternalAsomemodel.g:964:2: rule__DataPort__Group__1__Impl rule__DataPort__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DataPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataPort__Group__2();

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
    // $ANTLR end "rule__DataPort__Group__1"


    // $ANTLR start "rule__DataPort__Group__1__Impl"
    // InternalAsomemodel.g:971:1: rule__DataPort__Group__1__Impl : ( ( rule__DataPort__NameAssignment_1 ) ) ;
    public final void rule__DataPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:975:1: ( ( ( rule__DataPort__NameAssignment_1 ) ) )
            // InternalAsomemodel.g:976:1: ( ( rule__DataPort__NameAssignment_1 ) )
            {
            // InternalAsomemodel.g:976:1: ( ( rule__DataPort__NameAssignment_1 ) )
            // InternalAsomemodel.g:977:2: ( rule__DataPort__NameAssignment_1 )
            {
             before(grammarAccess.getDataPortAccess().getNameAssignment_1()); 
            // InternalAsomemodel.g:978:2: ( rule__DataPort__NameAssignment_1 )
            // InternalAsomemodel.g:978:3: rule__DataPort__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataPort__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataPortAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DataPort__Group__1__Impl"


    // $ANTLR start "rule__DataPort__Group__2"
    // InternalAsomemodel.g:986:1: rule__DataPort__Group__2 : rule__DataPort__Group__2__Impl rule__DataPort__Group__3 ;
    public final void rule__DataPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:990:1: ( rule__DataPort__Group__2__Impl rule__DataPort__Group__3 )
            // InternalAsomemodel.g:991:2: rule__DataPort__Group__2__Impl rule__DataPort__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__DataPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataPort__Group__3();

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
    // $ANTLR end "rule__DataPort__Group__2"


    // $ANTLR start "rule__DataPort__Group__2__Impl"
    // InternalAsomemodel.g:998:1: rule__DataPort__Group__2__Impl : ( '{' ) ;
    public final void rule__DataPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1002:1: ( ( '{' ) )
            // InternalAsomemodel.g:1003:1: ( '{' )
            {
            // InternalAsomemodel.g:1003:1: ( '{' )
            // InternalAsomemodel.g:1004:2: '{'
            {
             before(grammarAccess.getDataPortAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDataPortAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__DataPort__Group__2__Impl"


    // $ANTLR start "rule__DataPort__Group__3"
    // InternalAsomemodel.g:1013:1: rule__DataPort__Group__3 : rule__DataPort__Group__3__Impl rule__DataPort__Group__4 ;
    public final void rule__DataPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1017:1: ( rule__DataPort__Group__3__Impl rule__DataPort__Group__4 )
            // InternalAsomemodel.g:1018:2: rule__DataPort__Group__3__Impl rule__DataPort__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__DataPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataPort__Group__4();

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
    // $ANTLR end "rule__DataPort__Group__3"


    // $ANTLR start "rule__DataPort__Group__3__Impl"
    // InternalAsomemodel.g:1025:1: rule__DataPort__Group__3__Impl : ( 'interfaces' ) ;
    public final void rule__DataPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1029:1: ( ( 'interfaces' ) )
            // InternalAsomemodel.g:1030:1: ( 'interfaces' )
            {
            // InternalAsomemodel.g:1030:1: ( 'interfaces' )
            // InternalAsomemodel.g:1031:2: 'interfaces'
            {
             before(grammarAccess.getDataPortAccess().getInterfacesKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDataPortAccess().getInterfacesKeyword_3()); 

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
    // $ANTLR end "rule__DataPort__Group__3__Impl"


    // $ANTLR start "rule__DataPort__Group__4"
    // InternalAsomemodel.g:1040:1: rule__DataPort__Group__4 : rule__DataPort__Group__4__Impl rule__DataPort__Group__5 ;
    public final void rule__DataPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1044:1: ( rule__DataPort__Group__4__Impl rule__DataPort__Group__5 )
            // InternalAsomemodel.g:1045:2: rule__DataPort__Group__4__Impl rule__DataPort__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__DataPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataPort__Group__5();

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
    // $ANTLR end "rule__DataPort__Group__4"


    // $ANTLR start "rule__DataPort__Group__4__Impl"
    // InternalAsomemodel.g:1052:1: rule__DataPort__Group__4__Impl : ( ':' ) ;
    public final void rule__DataPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1056:1: ( ( ':' ) )
            // InternalAsomemodel.g:1057:1: ( ':' )
            {
            // InternalAsomemodel.g:1057:1: ( ':' )
            // InternalAsomemodel.g:1058:2: ':'
            {
             before(grammarAccess.getDataPortAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDataPortAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__DataPort__Group__4__Impl"


    // $ANTLR start "rule__DataPort__Group__5"
    // InternalAsomemodel.g:1067:1: rule__DataPort__Group__5 : rule__DataPort__Group__5__Impl rule__DataPort__Group__6 ;
    public final void rule__DataPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1071:1: ( rule__DataPort__Group__5__Impl rule__DataPort__Group__6 )
            // InternalAsomemodel.g:1072:2: rule__DataPort__Group__5__Impl rule__DataPort__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__DataPort__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataPort__Group__6();

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
    // $ANTLR end "rule__DataPort__Group__5"


    // $ANTLR start "rule__DataPort__Group__5__Impl"
    // InternalAsomemodel.g:1079:1: rule__DataPort__Group__5__Impl : ( ( rule__DataPort__CrossModelAssignment_5 ) ) ;
    public final void rule__DataPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1083:1: ( ( ( rule__DataPort__CrossModelAssignment_5 ) ) )
            // InternalAsomemodel.g:1084:1: ( ( rule__DataPort__CrossModelAssignment_5 ) )
            {
            // InternalAsomemodel.g:1084:1: ( ( rule__DataPort__CrossModelAssignment_5 ) )
            // InternalAsomemodel.g:1085:2: ( rule__DataPort__CrossModelAssignment_5 )
            {
             before(grammarAccess.getDataPortAccess().getCrossModelAssignment_5()); 
            // InternalAsomemodel.g:1086:2: ( rule__DataPort__CrossModelAssignment_5 )
            // InternalAsomemodel.g:1086:3: rule__DataPort__CrossModelAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DataPort__CrossModelAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDataPortAccess().getCrossModelAssignment_5()); 

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
    // $ANTLR end "rule__DataPort__Group__5__Impl"


    // $ANTLR start "rule__DataPort__Group__6"
    // InternalAsomemodel.g:1094:1: rule__DataPort__Group__6 : rule__DataPort__Group__6__Impl rule__DataPort__Group__7 ;
    public final void rule__DataPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1098:1: ( rule__DataPort__Group__6__Impl rule__DataPort__Group__7 )
            // InternalAsomemodel.g:1099:2: rule__DataPort__Group__6__Impl rule__DataPort__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__DataPort__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataPort__Group__7();

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
    // $ANTLR end "rule__DataPort__Group__6"


    // $ANTLR start "rule__DataPort__Group__6__Impl"
    // InternalAsomemodel.g:1106:1: rule__DataPort__Group__6__Impl : ( '.' ) ;
    public final void rule__DataPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1110:1: ( ( '.' ) )
            // InternalAsomemodel.g:1111:1: ( '.' )
            {
            // InternalAsomemodel.g:1111:1: ( '.' )
            // InternalAsomemodel.g:1112:2: '.'
            {
             before(grammarAccess.getDataPortAccess().getFullStopKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDataPortAccess().getFullStopKeyword_6()); 

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
    // $ANTLR end "rule__DataPort__Group__6__Impl"


    // $ANTLR start "rule__DataPort__Group__7"
    // InternalAsomemodel.g:1121:1: rule__DataPort__Group__7 : rule__DataPort__Group__7__Impl rule__DataPort__Group__8 ;
    public final void rule__DataPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1125:1: ( rule__DataPort__Group__7__Impl rule__DataPort__Group__8 )
            // InternalAsomemodel.g:1126:2: rule__DataPort__Group__7__Impl rule__DataPort__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__DataPort__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataPort__Group__8();

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
    // $ANTLR end "rule__DataPort__Group__7"


    // $ANTLR start "rule__DataPort__Group__7__Impl"
    // InternalAsomemodel.g:1133:1: rule__DataPort__Group__7__Impl : ( ( rule__DataPort__CrossInterfaceAssignment_7 ) ) ;
    public final void rule__DataPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1137:1: ( ( ( rule__DataPort__CrossInterfaceAssignment_7 ) ) )
            // InternalAsomemodel.g:1138:1: ( ( rule__DataPort__CrossInterfaceAssignment_7 ) )
            {
            // InternalAsomemodel.g:1138:1: ( ( rule__DataPort__CrossInterfaceAssignment_7 ) )
            // InternalAsomemodel.g:1139:2: ( rule__DataPort__CrossInterfaceAssignment_7 )
            {
             before(grammarAccess.getDataPortAccess().getCrossInterfaceAssignment_7()); 
            // InternalAsomemodel.g:1140:2: ( rule__DataPort__CrossInterfaceAssignment_7 )
            // InternalAsomemodel.g:1140:3: rule__DataPort__CrossInterfaceAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__DataPort__CrossInterfaceAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getDataPortAccess().getCrossInterfaceAssignment_7()); 

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
    // $ANTLR end "rule__DataPort__Group__7__Impl"


    // $ANTLR start "rule__DataPort__Group__8"
    // InternalAsomemodel.g:1148:1: rule__DataPort__Group__8 : rule__DataPort__Group__8__Impl ;
    public final void rule__DataPort__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1152:1: ( rule__DataPort__Group__8__Impl )
            // InternalAsomemodel.g:1153:2: rule__DataPort__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataPort__Group__8__Impl();

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
    // $ANTLR end "rule__DataPort__Group__8"


    // $ANTLR start "rule__DataPort__Group__8__Impl"
    // InternalAsomemodel.g:1159:1: rule__DataPort__Group__8__Impl : ( '}' ) ;
    public final void rule__DataPort__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1163:1: ( ( '}' ) )
            // InternalAsomemodel.g:1164:1: ( '}' )
            {
            // InternalAsomemodel.g:1164:1: ( '}' )
            // InternalAsomemodel.g:1165:2: '}'
            {
             before(grammarAccess.getDataPortAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDataPortAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__DataPort__Group__8__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalAsomemodel.g:1175:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1179:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalAsomemodel.g:1180:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

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
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalAsomemodel.g:1187:1: rule__Type__Group__0__Impl : ( 'Type' ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1191:1: ( ( 'Type' ) )
            // InternalAsomemodel.g:1192:1: ( 'Type' )
            {
            // InternalAsomemodel.g:1192:1: ( 'Type' )
            // InternalAsomemodel.g:1193:2: 'Type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeKeyword_0()); 

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
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalAsomemodel.g:1202:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1206:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalAsomemodel.g:1207:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__2();

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
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalAsomemodel.g:1214:1: rule__Type__Group__1__Impl : ( ruleDatatype ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1218:1: ( ( ruleDatatype ) )
            // InternalAsomemodel.g:1219:1: ( ruleDatatype )
            {
            // InternalAsomemodel.g:1219:1: ( ruleDatatype )
            // InternalAsomemodel.g:1220:2: ruleDatatype
            {
             before(grammarAccess.getTypeAccess().getDatatypeParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getDatatypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // InternalAsomemodel.g:1229:1: rule__Type__Group__2 : rule__Type__Group__2__Impl ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1233:1: ( rule__Type__Group__2__Impl )
            // InternalAsomemodel.g:1234:2: rule__Type__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__2__Impl();

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
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // InternalAsomemodel.g:1240:1: rule__Type__Group__2__Impl : ( ';' ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1244:1: ( ( ';' ) )
            // InternalAsomemodel.g:1245:1: ( ';' )
            {
            // InternalAsomemodel.g:1245:1: ( ';' )
            // InternalAsomemodel.g:1246:2: ';'
            {
             before(grammarAccess.getTypeAccess().getSemicolonKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalAsomemodel.g:1256:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1260:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalAsomemodel.g:1261:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalAsomemodel.g:1268:1: rule__Entity__Group__0__Impl : ( 'Immutable' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1272:1: ( ( 'Immutable' ) )
            // InternalAsomemodel.g:1273:1: ( 'Immutable' )
            {
            // InternalAsomemodel.g:1273:1: ( 'Immutable' )
            // InternalAsomemodel.g:1274:2: 'Immutable'
            {
             before(grammarAccess.getEntityAccess().getImmutableKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getImmutableKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalAsomemodel.g:1283:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1287:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalAsomemodel.g:1288:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalAsomemodel.g:1295:1: rule__Entity__Group__1__Impl : ( 'NonVolatile' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1299:1: ( ( 'NonVolatile' ) )
            // InternalAsomemodel.g:1300:1: ( 'NonVolatile' )
            {
            // InternalAsomemodel.g:1300:1: ( 'NonVolatile' )
            // InternalAsomemodel.g:1301:2: 'NonVolatile'
            {
             before(grammarAccess.getEntityAccess().getNonVolatileKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNonVolatileKeyword_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalAsomemodel.g:1310:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1314:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalAsomemodel.g:1315:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalAsomemodel.g:1322:1: rule__Entity__Group__2__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1326:1: ( ( 'Entity' ) )
            // InternalAsomemodel.g:1327:1: ( 'Entity' )
            {
            // InternalAsomemodel.g:1327:1: ( 'Entity' )
            // InternalAsomemodel.g:1328:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalAsomemodel.g:1337:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1341:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalAsomemodel.g:1342:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalAsomemodel.g:1349:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__NameAssignment_3 ) ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1353:1: ( ( ( rule__Entity__NameAssignment_3 ) ) )
            // InternalAsomemodel.g:1354:1: ( ( rule__Entity__NameAssignment_3 ) )
            {
            // InternalAsomemodel.g:1354:1: ( ( rule__Entity__NameAssignment_3 ) )
            // InternalAsomemodel.g:1355:2: ( rule__Entity__NameAssignment_3 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_3()); 
            // InternalAsomemodel.g:1356:2: ( rule__Entity__NameAssignment_3 )
            // InternalAsomemodel.g:1356:3: rule__Entity__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalAsomemodel.g:1364:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1368:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalAsomemodel.g:1369:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalAsomemodel.g:1376:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__MultiplicityAssignment_4 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1380:1: ( ( ( rule__Entity__MultiplicityAssignment_4 ) ) )
            // InternalAsomemodel.g:1381:1: ( ( rule__Entity__MultiplicityAssignment_4 ) )
            {
            // InternalAsomemodel.g:1381:1: ( ( rule__Entity__MultiplicityAssignment_4 ) )
            // InternalAsomemodel.g:1382:2: ( rule__Entity__MultiplicityAssignment_4 )
            {
             before(grammarAccess.getEntityAccess().getMultiplicityAssignment_4()); 
            // InternalAsomemodel.g:1383:2: ( rule__Entity__MultiplicityAssignment_4 )
            // InternalAsomemodel.g:1383:3: rule__Entity__MultiplicityAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Entity__MultiplicityAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getMultiplicityAssignment_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalAsomemodel.g:1391:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1395:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalAsomemodel.g:1396:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__6();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalAsomemodel.g:1403:1: rule__Entity__Group__5__Impl : ( '{' ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1407:1: ( ( '{' ) )
            // InternalAsomemodel.g:1408:1: ( '{' )
            {
            // InternalAsomemodel.g:1408:1: ( '{' )
            // InternalAsomemodel.g:1409:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // InternalAsomemodel.g:1418:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1422:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // InternalAsomemodel.g:1423:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__7();

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
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // InternalAsomemodel.g:1430:1: rule__Entity__Group__6__Impl : ( 'attributes' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1434:1: ( ( 'attributes' ) )
            // InternalAsomemodel.g:1435:1: ( 'attributes' )
            {
            // InternalAsomemodel.g:1435:1: ( 'attributes' )
            // InternalAsomemodel.g:1436:2: 'attributes'
            {
             before(grammarAccess.getEntityAccess().getAttributesKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getAttributesKeyword_6()); 

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
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group__7"
    // InternalAsomemodel.g:1445:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl rule__Entity__Group__8 ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1449:1: ( rule__Entity__Group__7__Impl rule__Entity__Group__8 )
            // InternalAsomemodel.g:1450:2: rule__Entity__Group__7__Impl rule__Entity__Group__8
            {
            pushFollow(FOLLOW_20);
            rule__Entity__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__8();

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
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // InternalAsomemodel.g:1457:1: rule__Entity__Group__7__Impl : ( ':' ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1461:1: ( ( ':' ) )
            // InternalAsomemodel.g:1462:1: ( ':' )
            {
            // InternalAsomemodel.g:1462:1: ( ':' )
            // InternalAsomemodel.g:1463:2: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getColonKeyword_7()); 

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
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group__8"
    // InternalAsomemodel.g:1472:1: rule__Entity__Group__8 : rule__Entity__Group__8__Impl rule__Entity__Group__9 ;
    public final void rule__Entity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1476:1: ( rule__Entity__Group__8__Impl rule__Entity__Group__9 )
            // InternalAsomemodel.g:1477:2: rule__Entity__Group__8__Impl rule__Entity__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__Entity__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__9();

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
    // $ANTLR end "rule__Entity__Group__8"


    // $ANTLR start "rule__Entity__Group__8__Impl"
    // InternalAsomemodel.g:1484:1: rule__Entity__Group__8__Impl : ( ( rule__Entity__AttriAssignment_8 )* ) ;
    public final void rule__Entity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1488:1: ( ( ( rule__Entity__AttriAssignment_8 )* ) )
            // InternalAsomemodel.g:1489:1: ( ( rule__Entity__AttriAssignment_8 )* )
            {
            // InternalAsomemodel.g:1489:1: ( ( rule__Entity__AttriAssignment_8 )* )
            // InternalAsomemodel.g:1490:2: ( rule__Entity__AttriAssignment_8 )*
            {
             before(grammarAccess.getEntityAccess().getAttriAssignment_8()); 
            // InternalAsomemodel.g:1491:2: ( rule__Entity__AttriAssignment_8 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAsomemodel.g:1491:3: rule__Entity__AttriAssignment_8
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Entity__AttriAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getAttriAssignment_8()); 

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
    // $ANTLR end "rule__Entity__Group__8__Impl"


    // $ANTLR start "rule__Entity__Group__9"
    // InternalAsomemodel.g:1499:1: rule__Entity__Group__9 : rule__Entity__Group__9__Impl ;
    public final void rule__Entity__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1503:1: ( rule__Entity__Group__9__Impl )
            // InternalAsomemodel.g:1504:2: rule__Entity__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__9__Impl();

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
    // $ANTLR end "rule__Entity__Group__9"


    // $ANTLR start "rule__Entity__Group__9__Impl"
    // InternalAsomemodel.g:1510:1: rule__Entity__Group__9__Impl : ( '}' ) ;
    public final void rule__Entity__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1514:1: ( ( '}' ) )
            // InternalAsomemodel.g:1515:1: ( '}' )
            {
            // InternalAsomemodel.g:1515:1: ( '}' )
            // InternalAsomemodel.g:1516:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Entity__Group__9__Impl"


    // $ANTLR start "rule__Multiplicity__Group__0"
    // InternalAsomemodel.g:1526:1: rule__Multiplicity__Group__0 : rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 ;
    public final void rule__Multiplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1530:1: ( rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1 )
            // InternalAsomemodel.g:1531:2: rule__Multiplicity__Group__0__Impl rule__Multiplicity__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Multiplicity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__1();

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
    // $ANTLR end "rule__Multiplicity__Group__0"


    // $ANTLR start "rule__Multiplicity__Group__0__Impl"
    // InternalAsomemodel.g:1538:1: rule__Multiplicity__Group__0__Impl : ( '[' ) ;
    public final void rule__Multiplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1542:1: ( ( '[' ) )
            // InternalAsomemodel.g:1543:1: ( '[' )
            {
            // InternalAsomemodel.g:1543:1: ( '[' )
            // InternalAsomemodel.g:1544:2: '['
            {
             before(grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__Multiplicity__Group__0__Impl"


    // $ANTLR start "rule__Multiplicity__Group__1"
    // InternalAsomemodel.g:1553:1: rule__Multiplicity__Group__1 : rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 ;
    public final void rule__Multiplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1557:1: ( rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2 )
            // InternalAsomemodel.g:1558:2: rule__Multiplicity__Group__1__Impl rule__Multiplicity__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Multiplicity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__2();

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
    // $ANTLR end "rule__Multiplicity__Group__1"


    // $ANTLR start "rule__Multiplicity__Group__1__Impl"
    // InternalAsomemodel.g:1565:1: rule__Multiplicity__Group__1__Impl : ( ( rule__Multiplicity__NameAssignment_1 ) ) ;
    public final void rule__Multiplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1569:1: ( ( ( rule__Multiplicity__NameAssignment_1 ) ) )
            // InternalAsomemodel.g:1570:1: ( ( rule__Multiplicity__NameAssignment_1 ) )
            {
            // InternalAsomemodel.g:1570:1: ( ( rule__Multiplicity__NameAssignment_1 ) )
            // InternalAsomemodel.g:1571:2: ( rule__Multiplicity__NameAssignment_1 )
            {
             before(grammarAccess.getMultiplicityAccess().getNameAssignment_1()); 
            // InternalAsomemodel.g:1572:2: ( rule__Multiplicity__NameAssignment_1 )
            // InternalAsomemodel.g:1572:3: rule__Multiplicity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Multiplicity__Group__1__Impl"


    // $ANTLR start "rule__Multiplicity__Group__2"
    // InternalAsomemodel.g:1580:1: rule__Multiplicity__Group__2 : rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3 ;
    public final void rule__Multiplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1584:1: ( rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3 )
            // InternalAsomemodel.g:1585:2: rule__Multiplicity__Group__2__Impl rule__Multiplicity__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Multiplicity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__3();

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
    // $ANTLR end "rule__Multiplicity__Group__2"


    // $ANTLR start "rule__Multiplicity__Group__2__Impl"
    // InternalAsomemodel.g:1592:1: rule__Multiplicity__Group__2__Impl : ( ',' ) ;
    public final void rule__Multiplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1596:1: ( ( ',' ) )
            // InternalAsomemodel.g:1597:1: ( ',' )
            {
            // InternalAsomemodel.g:1597:1: ( ',' )
            // InternalAsomemodel.g:1598:2: ','
            {
             before(grammarAccess.getMultiplicityAccess().getCommaKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getCommaKeyword_2()); 

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
    // $ANTLR end "rule__Multiplicity__Group__2__Impl"


    // $ANTLR start "rule__Multiplicity__Group__3"
    // InternalAsomemodel.g:1607:1: rule__Multiplicity__Group__3 : rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4 ;
    public final void rule__Multiplicity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1611:1: ( rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4 )
            // InternalAsomemodel.g:1612:2: rule__Multiplicity__Group__3__Impl rule__Multiplicity__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Multiplicity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__4();

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
    // $ANTLR end "rule__Multiplicity__Group__3"


    // $ANTLR start "rule__Multiplicity__Group__3__Impl"
    // InternalAsomemodel.g:1619:1: rule__Multiplicity__Group__3__Impl : ( ( rule__Multiplicity__Alternatives_3 ) ) ;
    public final void rule__Multiplicity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1623:1: ( ( ( rule__Multiplicity__Alternatives_3 ) ) )
            // InternalAsomemodel.g:1624:1: ( ( rule__Multiplicity__Alternatives_3 ) )
            {
            // InternalAsomemodel.g:1624:1: ( ( rule__Multiplicity__Alternatives_3 ) )
            // InternalAsomemodel.g:1625:2: ( rule__Multiplicity__Alternatives_3 )
            {
             before(grammarAccess.getMultiplicityAccess().getAlternatives_3()); 
            // InternalAsomemodel.g:1626:2: ( rule__Multiplicity__Alternatives_3 )
            // InternalAsomemodel.g:1626:3: rule__Multiplicity__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicityAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Multiplicity__Group__3__Impl"


    // $ANTLR start "rule__Multiplicity__Group__4"
    // InternalAsomemodel.g:1634:1: rule__Multiplicity__Group__4 : rule__Multiplicity__Group__4__Impl ;
    public final void rule__Multiplicity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1638:1: ( rule__Multiplicity__Group__4__Impl )
            // InternalAsomemodel.g:1639:2: rule__Multiplicity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplicity__Group__4__Impl();

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
    // $ANTLR end "rule__Multiplicity__Group__4"


    // $ANTLR start "rule__Multiplicity__Group__4__Impl"
    // InternalAsomemodel.g:1645:1: rule__Multiplicity__Group__4__Impl : ( ']' ) ;
    public final void rule__Multiplicity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1649:1: ( ( ']' ) )
            // InternalAsomemodel.g:1650:1: ( ']' )
            {
            // InternalAsomemodel.g:1650:1: ( ']' )
            // InternalAsomemodel.g:1651:2: ']'
            {
             before(grammarAccess.getMultiplicityAccess().getRightSquareBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__Multiplicity__Group__4__Impl"


    // $ANTLR start "rule__ValueObject__Group__0"
    // InternalAsomemodel.g:1661:1: rule__ValueObject__Group__0 : rule__ValueObject__Group__0__Impl rule__ValueObject__Group__1 ;
    public final void rule__ValueObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1665:1: ( rule__ValueObject__Group__0__Impl rule__ValueObject__Group__1 )
            // InternalAsomemodel.g:1666:2: rule__ValueObject__Group__0__Impl rule__ValueObject__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ValueObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueObject__Group__1();

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
    // $ANTLR end "rule__ValueObject__Group__0"


    // $ANTLR start "rule__ValueObject__Group__0__Impl"
    // InternalAsomemodel.g:1673:1: rule__ValueObject__Group__0__Impl : ( 'ValueObject' ) ;
    public final void rule__ValueObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1677:1: ( ( 'ValueObject' ) )
            // InternalAsomemodel.g:1678:1: ( 'ValueObject' )
            {
            // InternalAsomemodel.g:1678:1: ( 'ValueObject' )
            // InternalAsomemodel.g:1679:2: 'ValueObject'
            {
             before(grammarAccess.getValueObjectAccess().getValueObjectKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getValueObjectAccess().getValueObjectKeyword_0()); 

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
    // $ANTLR end "rule__ValueObject__Group__0__Impl"


    // $ANTLR start "rule__ValueObject__Group__1"
    // InternalAsomemodel.g:1688:1: rule__ValueObject__Group__1 : rule__ValueObject__Group__1__Impl rule__ValueObject__Group__2 ;
    public final void rule__ValueObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1692:1: ( rule__ValueObject__Group__1__Impl rule__ValueObject__Group__2 )
            // InternalAsomemodel.g:1693:2: rule__ValueObject__Group__1__Impl rule__ValueObject__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ValueObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueObject__Group__2();

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
    // $ANTLR end "rule__ValueObject__Group__1"


    // $ANTLR start "rule__ValueObject__Group__1__Impl"
    // InternalAsomemodel.g:1700:1: rule__ValueObject__Group__1__Impl : ( ( rule__ValueObject__NameAssignment_1 ) ) ;
    public final void rule__ValueObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1704:1: ( ( ( rule__ValueObject__NameAssignment_1 ) ) )
            // InternalAsomemodel.g:1705:1: ( ( rule__ValueObject__NameAssignment_1 ) )
            {
            // InternalAsomemodel.g:1705:1: ( ( rule__ValueObject__NameAssignment_1 ) )
            // InternalAsomemodel.g:1706:2: ( rule__ValueObject__NameAssignment_1 )
            {
             before(grammarAccess.getValueObjectAccess().getNameAssignment_1()); 
            // InternalAsomemodel.g:1707:2: ( rule__ValueObject__NameAssignment_1 )
            // InternalAsomemodel.g:1707:3: rule__ValueObject__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ValueObject__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getValueObjectAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ValueObject__Group__1__Impl"


    // $ANTLR start "rule__ValueObject__Group__2"
    // InternalAsomemodel.g:1715:1: rule__ValueObject__Group__2 : rule__ValueObject__Group__2__Impl rule__ValueObject__Group__3 ;
    public final void rule__ValueObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1719:1: ( rule__ValueObject__Group__2__Impl rule__ValueObject__Group__3 )
            // InternalAsomemodel.g:1720:2: rule__ValueObject__Group__2__Impl rule__ValueObject__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ValueObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueObject__Group__3();

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
    // $ANTLR end "rule__ValueObject__Group__2"


    // $ANTLR start "rule__ValueObject__Group__2__Impl"
    // InternalAsomemodel.g:1727:1: rule__ValueObject__Group__2__Impl : ( '{' ) ;
    public final void rule__ValueObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1731:1: ( ( '{' ) )
            // InternalAsomemodel.g:1732:1: ( '{' )
            {
            // InternalAsomemodel.g:1732:1: ( '{' )
            // InternalAsomemodel.g:1733:2: '{'
            {
             before(grammarAccess.getValueObjectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getValueObjectAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__ValueObject__Group__2__Impl"


    // $ANTLR start "rule__ValueObject__Group__3"
    // InternalAsomemodel.g:1742:1: rule__ValueObject__Group__3 : rule__ValueObject__Group__3__Impl rule__ValueObject__Group__4 ;
    public final void rule__ValueObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1746:1: ( rule__ValueObject__Group__3__Impl rule__ValueObject__Group__4 )
            // InternalAsomemodel.g:1747:2: rule__ValueObject__Group__3__Impl rule__ValueObject__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__ValueObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueObject__Group__4();

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
    // $ANTLR end "rule__ValueObject__Group__3"


    // $ANTLR start "rule__ValueObject__Group__3__Impl"
    // InternalAsomemodel.g:1754:1: rule__ValueObject__Group__3__Impl : ( 'attributes' ) ;
    public final void rule__ValueObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1758:1: ( ( 'attributes' ) )
            // InternalAsomemodel.g:1759:1: ( 'attributes' )
            {
            // InternalAsomemodel.g:1759:1: ( 'attributes' )
            // InternalAsomemodel.g:1760:2: 'attributes'
            {
             before(grammarAccess.getValueObjectAccess().getAttributesKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getValueObjectAccess().getAttributesKeyword_3()); 

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
    // $ANTLR end "rule__ValueObject__Group__3__Impl"


    // $ANTLR start "rule__ValueObject__Group__4"
    // InternalAsomemodel.g:1769:1: rule__ValueObject__Group__4 : rule__ValueObject__Group__4__Impl rule__ValueObject__Group__5 ;
    public final void rule__ValueObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1773:1: ( rule__ValueObject__Group__4__Impl rule__ValueObject__Group__5 )
            // InternalAsomemodel.g:1774:2: rule__ValueObject__Group__4__Impl rule__ValueObject__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__ValueObject__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueObject__Group__5();

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
    // $ANTLR end "rule__ValueObject__Group__4"


    // $ANTLR start "rule__ValueObject__Group__4__Impl"
    // InternalAsomemodel.g:1781:1: rule__ValueObject__Group__4__Impl : ( ':' ) ;
    public final void rule__ValueObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1785:1: ( ( ':' ) )
            // InternalAsomemodel.g:1786:1: ( ':' )
            {
            // InternalAsomemodel.g:1786:1: ( ':' )
            // InternalAsomemodel.g:1787:2: ':'
            {
             before(grammarAccess.getValueObjectAccess().getColonKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getValueObjectAccess().getColonKeyword_4()); 

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
    // $ANTLR end "rule__ValueObject__Group__4__Impl"


    // $ANTLR start "rule__ValueObject__Group__5"
    // InternalAsomemodel.g:1796:1: rule__ValueObject__Group__5 : rule__ValueObject__Group__5__Impl rule__ValueObject__Group__6 ;
    public final void rule__ValueObject__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1800:1: ( rule__ValueObject__Group__5__Impl rule__ValueObject__Group__6 )
            // InternalAsomemodel.g:1801:2: rule__ValueObject__Group__5__Impl rule__ValueObject__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__ValueObject__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ValueObject__Group__6();

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
    // $ANTLR end "rule__ValueObject__Group__5"


    // $ANTLR start "rule__ValueObject__Group__5__Impl"
    // InternalAsomemodel.g:1808:1: rule__ValueObject__Group__5__Impl : ( ( rule__ValueObject__AttriAssignment_5 )* ) ;
    public final void rule__ValueObject__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1812:1: ( ( ( rule__ValueObject__AttriAssignment_5 )* ) )
            // InternalAsomemodel.g:1813:1: ( ( rule__ValueObject__AttriAssignment_5 )* )
            {
            // InternalAsomemodel.g:1813:1: ( ( rule__ValueObject__AttriAssignment_5 )* )
            // InternalAsomemodel.g:1814:2: ( rule__ValueObject__AttriAssignment_5 )*
            {
             before(grammarAccess.getValueObjectAccess().getAttriAssignment_5()); 
            // InternalAsomemodel.g:1815:2: ( rule__ValueObject__AttriAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAsomemodel.g:1815:3: rule__ValueObject__AttriAssignment_5
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ValueObject__AttriAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getValueObjectAccess().getAttriAssignment_5()); 

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
    // $ANTLR end "rule__ValueObject__Group__5__Impl"


    // $ANTLR start "rule__ValueObject__Group__6"
    // InternalAsomemodel.g:1823:1: rule__ValueObject__Group__6 : rule__ValueObject__Group__6__Impl ;
    public final void rule__ValueObject__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1827:1: ( rule__ValueObject__Group__6__Impl )
            // InternalAsomemodel.g:1828:2: rule__ValueObject__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ValueObject__Group__6__Impl();

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
    // $ANTLR end "rule__ValueObject__Group__6"


    // $ANTLR start "rule__ValueObject__Group__6__Impl"
    // InternalAsomemodel.g:1834:1: rule__ValueObject__Group__6__Impl : ( '}' ) ;
    public final void rule__ValueObject__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1838:1: ( ( '}' ) )
            // InternalAsomemodel.g:1839:1: ( '}' )
            {
            // InternalAsomemodel.g:1839:1: ( '}' )
            // InternalAsomemodel.g:1840:2: '}'
            {
             before(grammarAccess.getValueObjectAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getValueObjectAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__ValueObject__Group__6__Impl"


    // $ANTLR start "rule__Attri__Group__0"
    // InternalAsomemodel.g:1850:1: rule__Attri__Group__0 : rule__Attri__Group__0__Impl rule__Attri__Group__1 ;
    public final void rule__Attri__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1854:1: ( rule__Attri__Group__0__Impl rule__Attri__Group__1 )
            // InternalAsomemodel.g:1855:2: rule__Attri__Group__0__Impl rule__Attri__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Attri__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attri__Group__1();

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
    // $ANTLR end "rule__Attri__Group__0"


    // $ANTLR start "rule__Attri__Group__0__Impl"
    // InternalAsomemodel.g:1862:1: rule__Attri__Group__0__Impl : ( ( rule__Attri__NameAssignment_0 ) ) ;
    public final void rule__Attri__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1866:1: ( ( ( rule__Attri__NameAssignment_0 ) ) )
            // InternalAsomemodel.g:1867:1: ( ( rule__Attri__NameAssignment_0 ) )
            {
            // InternalAsomemodel.g:1867:1: ( ( rule__Attri__NameAssignment_0 ) )
            // InternalAsomemodel.g:1868:2: ( rule__Attri__NameAssignment_0 )
            {
             before(grammarAccess.getAttriAccess().getNameAssignment_0()); 
            // InternalAsomemodel.g:1869:2: ( rule__Attri__NameAssignment_0 )
            // InternalAsomemodel.g:1869:3: rule__Attri__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attri__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttriAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Attri__Group__0__Impl"


    // $ANTLR start "rule__Attri__Group__1"
    // InternalAsomemodel.g:1877:1: rule__Attri__Group__1 : rule__Attri__Group__1__Impl rule__Attri__Group__2 ;
    public final void rule__Attri__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1881:1: ( rule__Attri__Group__1__Impl rule__Attri__Group__2 )
            // InternalAsomemodel.g:1882:2: rule__Attri__Group__1__Impl rule__Attri__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Attri__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attri__Group__2();

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
    // $ANTLR end "rule__Attri__Group__1"


    // $ANTLR start "rule__Attri__Group__1__Impl"
    // InternalAsomemodel.g:1889:1: rule__Attri__Group__1__Impl : ( ':' ) ;
    public final void rule__Attri__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1893:1: ( ( ':' ) )
            // InternalAsomemodel.g:1894:1: ( ':' )
            {
            // InternalAsomemodel.g:1894:1: ( ':' )
            // InternalAsomemodel.g:1895:2: ':'
            {
             before(grammarAccess.getAttriAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAttriAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Attri__Group__1__Impl"


    // $ANTLR start "rule__Attri__Group__2"
    // InternalAsomemodel.g:1904:1: rule__Attri__Group__2 : rule__Attri__Group__2__Impl rule__Attri__Group__3 ;
    public final void rule__Attri__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1908:1: ( rule__Attri__Group__2__Impl rule__Attri__Group__3 )
            // InternalAsomemodel.g:1909:2: rule__Attri__Group__2__Impl rule__Attri__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Attri__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attri__Group__3();

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
    // $ANTLR end "rule__Attri__Group__2"


    // $ANTLR start "rule__Attri__Group__2__Impl"
    // InternalAsomemodel.g:1916:1: rule__Attri__Group__2__Impl : ( ( rule__Attri__CrossModelAssignment_2 ) ) ;
    public final void rule__Attri__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1920:1: ( ( ( rule__Attri__CrossModelAssignment_2 ) ) )
            // InternalAsomemodel.g:1921:1: ( ( rule__Attri__CrossModelAssignment_2 ) )
            {
            // InternalAsomemodel.g:1921:1: ( ( rule__Attri__CrossModelAssignment_2 ) )
            // InternalAsomemodel.g:1922:2: ( rule__Attri__CrossModelAssignment_2 )
            {
             before(grammarAccess.getAttriAccess().getCrossModelAssignment_2()); 
            // InternalAsomemodel.g:1923:2: ( rule__Attri__CrossModelAssignment_2 )
            // InternalAsomemodel.g:1923:3: rule__Attri__CrossModelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Attri__CrossModelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttriAccess().getCrossModelAssignment_2()); 

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
    // $ANTLR end "rule__Attri__Group__2__Impl"


    // $ANTLR start "rule__Attri__Group__3"
    // InternalAsomemodel.g:1931:1: rule__Attri__Group__3 : rule__Attri__Group__3__Impl rule__Attri__Group__4 ;
    public final void rule__Attri__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1935:1: ( rule__Attri__Group__3__Impl rule__Attri__Group__4 )
            // InternalAsomemodel.g:1936:2: rule__Attri__Group__3__Impl rule__Attri__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Attri__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attri__Group__4();

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
    // $ANTLR end "rule__Attri__Group__3"


    // $ANTLR start "rule__Attri__Group__3__Impl"
    // InternalAsomemodel.g:1943:1: rule__Attri__Group__3__Impl : ( '.' ) ;
    public final void rule__Attri__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1947:1: ( ( '.' ) )
            // InternalAsomemodel.g:1948:1: ( '.' )
            {
            // InternalAsomemodel.g:1948:1: ( '.' )
            // InternalAsomemodel.g:1949:2: '.'
            {
             before(grammarAccess.getAttriAccess().getFullStopKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAttriAccess().getFullStopKeyword_3()); 

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
    // $ANTLR end "rule__Attri__Group__3__Impl"


    // $ANTLR start "rule__Attri__Group__4"
    // InternalAsomemodel.g:1958:1: rule__Attri__Group__4 : rule__Attri__Group__4__Impl rule__Attri__Group__5 ;
    public final void rule__Attri__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1962:1: ( rule__Attri__Group__4__Impl rule__Attri__Group__5 )
            // InternalAsomemodel.g:1963:2: rule__Attri__Group__4__Impl rule__Attri__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Attri__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attri__Group__5();

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
    // $ANTLR end "rule__Attri__Group__4"


    // $ANTLR start "rule__Attri__Group__4__Impl"
    // InternalAsomemodel.g:1970:1: rule__Attri__Group__4__Impl : ( ( rule__Attri__CrossInterfaceAssignment_4 ) ) ;
    public final void rule__Attri__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1974:1: ( ( ( rule__Attri__CrossInterfaceAssignment_4 ) ) )
            // InternalAsomemodel.g:1975:1: ( ( rule__Attri__CrossInterfaceAssignment_4 ) )
            {
            // InternalAsomemodel.g:1975:1: ( ( rule__Attri__CrossInterfaceAssignment_4 ) )
            // InternalAsomemodel.g:1976:2: ( rule__Attri__CrossInterfaceAssignment_4 )
            {
             before(grammarAccess.getAttriAccess().getCrossInterfaceAssignment_4()); 
            // InternalAsomemodel.g:1977:2: ( rule__Attri__CrossInterfaceAssignment_4 )
            // InternalAsomemodel.g:1977:3: rule__Attri__CrossInterfaceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attri__CrossInterfaceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttriAccess().getCrossInterfaceAssignment_4()); 

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
    // $ANTLR end "rule__Attri__Group__4__Impl"


    // $ANTLR start "rule__Attri__Group__5"
    // InternalAsomemodel.g:1985:1: rule__Attri__Group__5 : rule__Attri__Group__5__Impl rule__Attri__Group__6 ;
    public final void rule__Attri__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:1989:1: ( rule__Attri__Group__5__Impl rule__Attri__Group__6 )
            // InternalAsomemodel.g:1990:2: rule__Attri__Group__5__Impl rule__Attri__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Attri__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attri__Group__6();

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
    // $ANTLR end "rule__Attri__Group__5"


    // $ANTLR start "rule__Attri__Group__5__Impl"
    // InternalAsomemodel.g:1997:1: rule__Attri__Group__5__Impl : ( '.' ) ;
    public final void rule__Attri__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2001:1: ( ( '.' ) )
            // InternalAsomemodel.g:2002:1: ( '.' )
            {
            // InternalAsomemodel.g:2002:1: ( '.' )
            // InternalAsomemodel.g:2003:2: '.'
            {
             before(grammarAccess.getAttriAccess().getFullStopKeyword_5()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAttriAccess().getFullStopKeyword_5()); 

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
    // $ANTLR end "rule__Attri__Group__5__Impl"


    // $ANTLR start "rule__Attri__Group__6"
    // InternalAsomemodel.g:2012:1: rule__Attri__Group__6 : rule__Attri__Group__6__Impl rule__Attri__Group__7 ;
    public final void rule__Attri__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2016:1: ( rule__Attri__Group__6__Impl rule__Attri__Group__7 )
            // InternalAsomemodel.g:2017:2: rule__Attri__Group__6__Impl rule__Attri__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Attri__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attri__Group__7();

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
    // $ANTLR end "rule__Attri__Group__6"


    // $ANTLR start "rule__Attri__Group__6__Impl"
    // InternalAsomemodel.g:2024:1: rule__Attri__Group__6__Impl : ( ( rule__Attri__DatatypeAssignment_6 ) ) ;
    public final void rule__Attri__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2028:1: ( ( ( rule__Attri__DatatypeAssignment_6 ) ) )
            // InternalAsomemodel.g:2029:1: ( ( rule__Attri__DatatypeAssignment_6 ) )
            {
            // InternalAsomemodel.g:2029:1: ( ( rule__Attri__DatatypeAssignment_6 ) )
            // InternalAsomemodel.g:2030:2: ( rule__Attri__DatatypeAssignment_6 )
            {
             before(grammarAccess.getAttriAccess().getDatatypeAssignment_6()); 
            // InternalAsomemodel.g:2031:2: ( rule__Attri__DatatypeAssignment_6 )
            // InternalAsomemodel.g:2031:3: rule__Attri__DatatypeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Attri__DatatypeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAttriAccess().getDatatypeAssignment_6()); 

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
    // $ANTLR end "rule__Attri__Group__6__Impl"


    // $ANTLR start "rule__Attri__Group__7"
    // InternalAsomemodel.g:2039:1: rule__Attri__Group__7 : rule__Attri__Group__7__Impl rule__Attri__Group__8 ;
    public final void rule__Attri__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2043:1: ( rule__Attri__Group__7__Impl rule__Attri__Group__8 )
            // InternalAsomemodel.g:2044:2: rule__Attri__Group__7__Impl rule__Attri__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__Attri__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attri__Group__8();

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
    // $ANTLR end "rule__Attri__Group__7"


    // $ANTLR start "rule__Attri__Group__7__Impl"
    // InternalAsomemodel.g:2051:1: rule__Attri__Group__7__Impl : ( ( rule__Attri__MultiplicityAssignment_7 ) ) ;
    public final void rule__Attri__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2055:1: ( ( ( rule__Attri__MultiplicityAssignment_7 ) ) )
            // InternalAsomemodel.g:2056:1: ( ( rule__Attri__MultiplicityAssignment_7 ) )
            {
            // InternalAsomemodel.g:2056:1: ( ( rule__Attri__MultiplicityAssignment_7 ) )
            // InternalAsomemodel.g:2057:2: ( rule__Attri__MultiplicityAssignment_7 )
            {
             before(grammarAccess.getAttriAccess().getMultiplicityAssignment_7()); 
            // InternalAsomemodel.g:2058:2: ( rule__Attri__MultiplicityAssignment_7 )
            // InternalAsomemodel.g:2058:3: rule__Attri__MultiplicityAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Attri__MultiplicityAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getAttriAccess().getMultiplicityAssignment_7()); 

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
    // $ANTLR end "rule__Attri__Group__7__Impl"


    // $ANTLR start "rule__Attri__Group__8"
    // InternalAsomemodel.g:2066:1: rule__Attri__Group__8 : rule__Attri__Group__8__Impl rule__Attri__Group__9 ;
    public final void rule__Attri__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2070:1: ( rule__Attri__Group__8__Impl rule__Attri__Group__9 )
            // InternalAsomemodel.g:2071:2: rule__Attri__Group__8__Impl rule__Attri__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Attri__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attri__Group__9();

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
    // $ANTLR end "rule__Attri__Group__8"


    // $ANTLR start "rule__Attri__Group__8__Impl"
    // InternalAsomemodel.g:2078:1: rule__Attri__Group__8__Impl : ( ( rule__Attri__OrderAssignment_8 ) ) ;
    public final void rule__Attri__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2082:1: ( ( ( rule__Attri__OrderAssignment_8 ) ) )
            // InternalAsomemodel.g:2083:1: ( ( rule__Attri__OrderAssignment_8 ) )
            {
            // InternalAsomemodel.g:2083:1: ( ( rule__Attri__OrderAssignment_8 ) )
            // InternalAsomemodel.g:2084:2: ( rule__Attri__OrderAssignment_8 )
            {
             before(grammarAccess.getAttriAccess().getOrderAssignment_8()); 
            // InternalAsomemodel.g:2085:2: ( rule__Attri__OrderAssignment_8 )
            // InternalAsomemodel.g:2085:3: rule__Attri__OrderAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Attri__OrderAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getAttriAccess().getOrderAssignment_8()); 

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
    // $ANTLR end "rule__Attri__Group__8__Impl"


    // $ANTLR start "rule__Attri__Group__9"
    // InternalAsomemodel.g:2093:1: rule__Attri__Group__9 : rule__Attri__Group__9__Impl ;
    public final void rule__Attri__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2097:1: ( rule__Attri__Group__9__Impl )
            // InternalAsomemodel.g:2098:2: rule__Attri__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attri__Group__9__Impl();

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
    // $ANTLR end "rule__Attri__Group__9"


    // $ANTLR start "rule__Attri__Group__9__Impl"
    // InternalAsomemodel.g:2104:1: rule__Attri__Group__9__Impl : ( ';' ) ;
    public final void rule__Attri__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2108:1: ( ( ';' ) )
            // InternalAsomemodel.g:2109:1: ( ';' )
            {
            // InternalAsomemodel.g:2109:1: ( ';' )
            // InternalAsomemodel.g:2110:2: ';'
            {
             before(grammarAccess.getAttriAccess().getSemicolonKeyword_9()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAttriAccess().getSemicolonKeyword_9()); 

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
    // $ANTLR end "rule__Attri__Group__9__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalAsomemodel.g:2120:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2124:1: ( ( RULE_ID ) )
            // InternalAsomemodel.g:2125:2: ( RULE_ID )
            {
            // InternalAsomemodel.g:2125:2: ( RULE_ID )
            // InternalAsomemodel.g:2126:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__RepositoryserviceAssignment_3"
    // InternalAsomemodel.g:2135:1: rule__Model__RepositoryserviceAssignment_3 : ( ruleRepositoryService ) ;
    public final void rule__Model__RepositoryserviceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2139:1: ( ( ruleRepositoryService ) )
            // InternalAsomemodel.g:2140:2: ( ruleRepositoryService )
            {
            // InternalAsomemodel.g:2140:2: ( ruleRepositoryService )
            // InternalAsomemodel.g:2141:3: ruleRepositoryService
            {
             before(grammarAccess.getModelAccess().getRepositoryserviceRepositoryServiceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRepositoryService();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRepositoryserviceRepositoryServiceParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Model__RepositoryserviceAssignment_3"


    // $ANTLR start "rule__Model__DomaininterfaceAssignment_4"
    // InternalAsomemodel.g:2150:1: rule__Model__DomaininterfaceAssignment_4 : ( ruleDomainInterface ) ;
    public final void rule__Model__DomaininterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2154:1: ( ( ruleDomainInterface ) )
            // InternalAsomemodel.g:2155:2: ( ruleDomainInterface )
            {
            // InternalAsomemodel.g:2155:2: ( ruleDomainInterface )
            // InternalAsomemodel.g:2156:3: ruleDomainInterface
            {
             before(grammarAccess.getModelAccess().getDomaininterfaceDomainInterfaceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDomainInterface();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDomaininterfaceDomainInterfaceParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Model__DomaininterfaceAssignment_4"


    // $ANTLR start "rule__RepositoryService__NameAssignment_1"
    // InternalAsomemodel.g:2165:1: rule__RepositoryService__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RepositoryService__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2169:1: ( ( RULE_ID ) )
            // InternalAsomemodel.g:2170:2: ( RULE_ID )
            {
            // InternalAsomemodel.g:2170:2: ( RULE_ID )
            // InternalAsomemodel.g:2171:3: RULE_ID
            {
             before(grammarAccess.getRepositoryServiceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRepositoryServiceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RepositoryService__NameAssignment_1"


    // $ANTLR start "rule__RepositoryService__DataportAssignment_4"
    // InternalAsomemodel.g:2180:1: rule__RepositoryService__DataportAssignment_4 : ( ruleDataPort ) ;
    public final void rule__RepositoryService__DataportAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2184:1: ( ( ruleDataPort ) )
            // InternalAsomemodel.g:2185:2: ( ruleDataPort )
            {
            // InternalAsomemodel.g:2185:2: ( ruleDataPort )
            // InternalAsomemodel.g:2186:3: ruleDataPort
            {
             before(grammarAccess.getRepositoryServiceAccess().getDataportDataPortParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDataPort();

            state._fsp--;

             after(grammarAccess.getRepositoryServiceAccess().getDataportDataPortParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RepositoryService__DataportAssignment_4"


    // $ANTLR start "rule__DomainInterface__NameAssignment_1"
    // InternalAsomemodel.g:2195:1: rule__DomainInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DomainInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2199:1: ( ( RULE_ID ) )
            // InternalAsomemodel.g:2200:2: ( RULE_ID )
            {
            // InternalAsomemodel.g:2200:2: ( RULE_ID )
            // InternalAsomemodel.g:2201:3: RULE_ID
            {
             before(grammarAccess.getDomainInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDomainInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DomainInterface__NameAssignment_1"


    // $ANTLR start "rule__DomainInterface__ElementAssignment_3"
    // InternalAsomemodel.g:2210:1: rule__DomainInterface__ElementAssignment_3 : ( ruleElement ) ;
    public final void rule__DomainInterface__ElementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2214:1: ( ( ruleElement ) )
            // InternalAsomemodel.g:2215:2: ( ruleElement )
            {
            // InternalAsomemodel.g:2215:2: ( ruleElement )
            // InternalAsomemodel.g:2216:3: ruleElement
            {
             before(grammarAccess.getDomainInterfaceAccess().getElementElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getDomainInterfaceAccess().getElementElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__DomainInterface__ElementAssignment_3"


    // $ANTLR start "rule__DataPort__NameAssignment_1"
    // InternalAsomemodel.g:2225:1: rule__DataPort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2229:1: ( ( RULE_ID ) )
            // InternalAsomemodel.g:2230:2: ( RULE_ID )
            {
            // InternalAsomemodel.g:2230:2: ( RULE_ID )
            // InternalAsomemodel.g:2231:3: RULE_ID
            {
             before(grammarAccess.getDataPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataPortAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataPort__NameAssignment_1"


    // $ANTLR start "rule__DataPort__CrossModelAssignment_5"
    // InternalAsomemodel.g:2240:1: rule__DataPort__CrossModelAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__DataPort__CrossModelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2244:1: ( ( ( RULE_ID ) ) )
            // InternalAsomemodel.g:2245:2: ( ( RULE_ID ) )
            {
            // InternalAsomemodel.g:2245:2: ( ( RULE_ID ) )
            // InternalAsomemodel.g:2246:3: ( RULE_ID )
            {
             before(grammarAccess.getDataPortAccess().getCrossModelModelCrossReference_5_0()); 
            // InternalAsomemodel.g:2247:3: ( RULE_ID )
            // InternalAsomemodel.g:2248:4: RULE_ID
            {
             before(grammarAccess.getDataPortAccess().getCrossModelModelIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataPortAccess().getCrossModelModelIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getDataPortAccess().getCrossModelModelCrossReference_5_0()); 

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
    // $ANTLR end "rule__DataPort__CrossModelAssignment_5"


    // $ANTLR start "rule__DataPort__CrossInterfaceAssignment_7"
    // InternalAsomemodel.g:2259:1: rule__DataPort__CrossInterfaceAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__DataPort__CrossInterfaceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2263:1: ( ( ( RULE_ID ) ) )
            // InternalAsomemodel.g:2264:2: ( ( RULE_ID ) )
            {
            // InternalAsomemodel.g:2264:2: ( ( RULE_ID ) )
            // InternalAsomemodel.g:2265:3: ( RULE_ID )
            {
             before(grammarAccess.getDataPortAccess().getCrossInterfaceDomainInterfaceCrossReference_7_0()); 
            // InternalAsomemodel.g:2266:3: ( RULE_ID )
            // InternalAsomemodel.g:2267:4: RULE_ID
            {
             before(grammarAccess.getDataPortAccess().getCrossInterfaceDomainInterfaceIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataPortAccess().getCrossInterfaceDomainInterfaceIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getDataPortAccess().getCrossInterfaceDomainInterfaceCrossReference_7_0()); 

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
    // $ANTLR end "rule__DataPort__CrossInterfaceAssignment_7"


    // $ANTLR start "rule__Entity__NameAssignment_3"
    // InternalAsomemodel.g:2278:1: rule__Entity__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2282:1: ( ( RULE_ID ) )
            // InternalAsomemodel.g:2283:2: ( RULE_ID )
            {
            // InternalAsomemodel.g:2283:2: ( RULE_ID )
            // InternalAsomemodel.g:2284:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_3"


    // $ANTLR start "rule__Entity__MultiplicityAssignment_4"
    // InternalAsomemodel.g:2293:1: rule__Entity__MultiplicityAssignment_4 : ( ruleMultiplicity ) ;
    public final void rule__Entity__MultiplicityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2297:1: ( ( ruleMultiplicity ) )
            // InternalAsomemodel.g:2298:2: ( ruleMultiplicity )
            {
            // InternalAsomemodel.g:2298:2: ( ruleMultiplicity )
            // InternalAsomemodel.g:2299:3: ruleMultiplicity
            {
             before(grammarAccess.getEntityAccess().getMultiplicityMultiplicityParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getMultiplicityMultiplicityParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Entity__MultiplicityAssignment_4"


    // $ANTLR start "rule__Entity__AttriAssignment_8"
    // InternalAsomemodel.g:2308:1: rule__Entity__AttriAssignment_8 : ( ruleAttri ) ;
    public final void rule__Entity__AttriAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2312:1: ( ( ruleAttri ) )
            // InternalAsomemodel.g:2313:2: ( ruleAttri )
            {
            // InternalAsomemodel.g:2313:2: ( ruleAttri )
            // InternalAsomemodel.g:2314:3: ruleAttri
            {
             before(grammarAccess.getEntityAccess().getAttriAttriParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleAttri();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getAttriAttriParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Entity__AttriAssignment_8"


    // $ANTLR start "rule__Multiplicity__NameAssignment_1"
    // InternalAsomemodel.g:2323:1: rule__Multiplicity__NameAssignment_1 : ( RULE_INT ) ;
    public final void rule__Multiplicity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2327:1: ( ( RULE_INT ) )
            // InternalAsomemodel.g:2328:2: ( RULE_INT )
            {
            // InternalAsomemodel.g:2328:2: ( RULE_INT )
            // InternalAsomemodel.g:2329:3: RULE_INT
            {
             before(grammarAccess.getMultiplicityAccess().getNameINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getNameINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Multiplicity__NameAssignment_1"


    // $ANTLR start "rule__Multiplicity__NameAssignment_3_0"
    // InternalAsomemodel.g:2338:1: rule__Multiplicity__NameAssignment_3_0 : ( RULE_INT ) ;
    public final void rule__Multiplicity__NameAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2342:1: ( ( RULE_INT ) )
            // InternalAsomemodel.g:2343:2: ( RULE_INT )
            {
            // InternalAsomemodel.g:2343:2: ( RULE_INT )
            // InternalAsomemodel.g:2344:3: RULE_INT
            {
             before(grammarAccess.getMultiplicityAccess().getNameINTTerminalRuleCall_3_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getMultiplicityAccess().getNameINTTerminalRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Multiplicity__NameAssignment_3_0"


    // $ANTLR start "rule__ValueObject__NameAssignment_1"
    // InternalAsomemodel.g:2353:1: rule__ValueObject__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ValueObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2357:1: ( ( RULE_ID ) )
            // InternalAsomemodel.g:2358:2: ( RULE_ID )
            {
            // InternalAsomemodel.g:2358:2: ( RULE_ID )
            // InternalAsomemodel.g:2359:3: RULE_ID
            {
             before(grammarAccess.getValueObjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getValueObjectAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ValueObject__NameAssignment_1"


    // $ANTLR start "rule__ValueObject__AttriAssignment_5"
    // InternalAsomemodel.g:2368:1: rule__ValueObject__AttriAssignment_5 : ( ruleAttri ) ;
    public final void rule__ValueObject__AttriAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2372:1: ( ( ruleAttri ) )
            // InternalAsomemodel.g:2373:2: ( ruleAttri )
            {
            // InternalAsomemodel.g:2373:2: ( ruleAttri )
            // InternalAsomemodel.g:2374:3: ruleAttri
            {
             before(grammarAccess.getValueObjectAccess().getAttriAttriParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAttri();

            state._fsp--;

             after(grammarAccess.getValueObjectAccess().getAttriAttriParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ValueObject__AttriAssignment_5"


    // $ANTLR start "rule__Attri__NameAssignment_0"
    // InternalAsomemodel.g:2383:1: rule__Attri__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attri__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2387:1: ( ( RULE_ID ) )
            // InternalAsomemodel.g:2388:2: ( RULE_ID )
            {
            // InternalAsomemodel.g:2388:2: ( RULE_ID )
            // InternalAsomemodel.g:2389:3: RULE_ID
            {
             before(grammarAccess.getAttriAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttriAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Attri__NameAssignment_0"


    // $ANTLR start "rule__Attri__CrossModelAssignment_2"
    // InternalAsomemodel.g:2398:1: rule__Attri__CrossModelAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Attri__CrossModelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2402:1: ( ( ( RULE_ID ) ) )
            // InternalAsomemodel.g:2403:2: ( ( RULE_ID ) )
            {
            // InternalAsomemodel.g:2403:2: ( ( RULE_ID ) )
            // InternalAsomemodel.g:2404:3: ( RULE_ID )
            {
             before(grammarAccess.getAttriAccess().getCrossModelModelCrossReference_2_0()); 
            // InternalAsomemodel.g:2405:3: ( RULE_ID )
            // InternalAsomemodel.g:2406:4: RULE_ID
            {
             before(grammarAccess.getAttriAccess().getCrossModelModelIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttriAccess().getCrossModelModelIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAttriAccess().getCrossModelModelCrossReference_2_0()); 

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
    // $ANTLR end "rule__Attri__CrossModelAssignment_2"


    // $ANTLR start "rule__Attri__CrossInterfaceAssignment_4"
    // InternalAsomemodel.g:2417:1: rule__Attri__CrossInterfaceAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Attri__CrossInterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2421:1: ( ( ( RULE_ID ) ) )
            // InternalAsomemodel.g:2422:2: ( ( RULE_ID ) )
            {
            // InternalAsomemodel.g:2422:2: ( ( RULE_ID ) )
            // InternalAsomemodel.g:2423:3: ( RULE_ID )
            {
             before(grammarAccess.getAttriAccess().getCrossInterfaceDomainInterfaceCrossReference_4_0()); 
            // InternalAsomemodel.g:2424:3: ( RULE_ID )
            // InternalAsomemodel.g:2425:4: RULE_ID
            {
             before(grammarAccess.getAttriAccess().getCrossInterfaceDomainInterfaceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttriAccess().getCrossInterfaceDomainInterfaceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAttriAccess().getCrossInterfaceDomainInterfaceCrossReference_4_0()); 

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
    // $ANTLR end "rule__Attri__CrossInterfaceAssignment_4"


    // $ANTLR start "rule__Attri__DatatypeAssignment_6"
    // InternalAsomemodel.g:2436:1: rule__Attri__DatatypeAssignment_6 : ( ruleDatatype ) ;
    public final void rule__Attri__DatatypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2440:1: ( ( ruleDatatype ) )
            // InternalAsomemodel.g:2441:2: ( ruleDatatype )
            {
            // InternalAsomemodel.g:2441:2: ( ruleDatatype )
            // InternalAsomemodel.g:2442:3: ruleDatatype
            {
             before(grammarAccess.getAttriAccess().getDatatypeDatatypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDatatype();

            state._fsp--;

             after(grammarAccess.getAttriAccess().getDatatypeDatatypeParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Attri__DatatypeAssignment_6"


    // $ANTLR start "rule__Attri__MultiplicityAssignment_7"
    // InternalAsomemodel.g:2451:1: rule__Attri__MultiplicityAssignment_7 : ( ruleMultiplicity ) ;
    public final void rule__Attri__MultiplicityAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2455:1: ( ( ruleMultiplicity ) )
            // InternalAsomemodel.g:2456:2: ( ruleMultiplicity )
            {
            // InternalAsomemodel.g:2456:2: ( ruleMultiplicity )
            // InternalAsomemodel.g:2457:3: ruleMultiplicity
            {
             before(grammarAccess.getAttriAccess().getMultiplicityMultiplicityParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicity();

            state._fsp--;

             after(grammarAccess.getAttriAccess().getMultiplicityMultiplicityParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Attri__MultiplicityAssignment_7"


    // $ANTLR start "rule__Attri__OrderAssignment_8"
    // InternalAsomemodel.g:2466:1: rule__Attri__OrderAssignment_8 : ( ruleOrder ) ;
    public final void rule__Attri__OrderAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAsomemodel.g:2470:1: ( ( ruleOrder ) )
            // InternalAsomemodel.g:2471:2: ( ruleOrder )
            {
            // InternalAsomemodel.g:2471:2: ( ruleOrder )
            // InternalAsomemodel.g:2472:3: ruleOrder
            {
             before(grammarAccess.getAttriAccess().getOrderOrderParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleOrder();

            state._fsp--;

             after(grammarAccess.getAttriAccess().getOrderOrderParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Attri__OrderAssignment_8"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000580000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001028080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001028000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000018000L});

}