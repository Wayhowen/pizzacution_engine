package org.mdse.minisql.types.ide.contentassist.antlr.internal;

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
import org.mdse.minisql.types.services.MSQLTypesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMSQLTypesParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Int'", "'String'", "'Bool'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMSQLTypesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMSQLTypesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMSQLTypesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMSQLTypes.g"; }


    	private MSQLTypesGrammarAccess grammarAccess;

    	public void setGrammarAccess(MSQLTypesGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleType"
    // InternalMSQLTypes.g:53:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMSQLTypes.g:54:1: ( ruleType EOF )
            // InternalMSQLTypes.g:55:1: ruleType EOF
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
    // InternalMSQLTypes.g:62:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLTypes.g:66:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMSQLTypes.g:67:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMSQLTypes.g:67:2: ( ( rule__Type__Alternatives ) )
            // InternalMSQLTypes.g:68:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMSQLTypes.g:69:3: ( rule__Type__Alternatives )
            // InternalMSQLTypes.g:69:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleIntegerType"
    // InternalMSQLTypes.g:78:1: entryRuleIntegerType : ruleIntegerType EOF ;
    public final void entryRuleIntegerType() throws RecognitionException {
        try {
            // InternalMSQLTypes.g:79:1: ( ruleIntegerType EOF )
            // InternalMSQLTypes.g:80:1: ruleIntegerType EOF
            {
             before(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerType();

            state._fsp--;

             after(grammarAccess.getIntegerTypeRule()); 
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
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // InternalMSQLTypes.g:87:1: ruleIntegerType : ( ( rule__IntegerType__Group__0 ) ) ;
    public final void ruleIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLTypes.g:91:2: ( ( ( rule__IntegerType__Group__0 ) ) )
            // InternalMSQLTypes.g:92:2: ( ( rule__IntegerType__Group__0 ) )
            {
            // InternalMSQLTypes.g:92:2: ( ( rule__IntegerType__Group__0 ) )
            // InternalMSQLTypes.g:93:3: ( rule__IntegerType__Group__0 )
            {
             before(grammarAccess.getIntegerTypeAccess().getGroup()); 
            // InternalMSQLTypes.g:94:3: ( rule__IntegerType__Group__0 )
            // InternalMSQLTypes.g:94:4: rule__IntegerType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleStringType"
    // InternalMSQLTypes.g:103:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // InternalMSQLTypes.g:104:1: ( ruleStringType EOF )
            // InternalMSQLTypes.g:105:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleStringType();

            state._fsp--;

             after(grammarAccess.getStringTypeRule()); 
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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalMSQLTypes.g:112:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLTypes.g:116:2: ( ( ( rule__StringType__Group__0 ) ) )
            // InternalMSQLTypes.g:117:2: ( ( rule__StringType__Group__0 ) )
            {
            // InternalMSQLTypes.g:117:2: ( ( rule__StringType__Group__0 ) )
            // InternalMSQLTypes.g:118:3: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // InternalMSQLTypes.g:119:3: ( rule__StringType__Group__0 )
            // InternalMSQLTypes.g:119:4: rule__StringType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleBooleanType"
    // InternalMSQLTypes.g:128:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // InternalMSQLTypes.g:129:1: ( ruleBooleanType EOF )
            // InternalMSQLTypes.g:130:1: ruleBooleanType EOF
            {
             before(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getBooleanTypeRule()); 
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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalMSQLTypes.g:137:1: ruleBooleanType : ( ( rule__BooleanType__Group__0 ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLTypes.g:141:2: ( ( ( rule__BooleanType__Group__0 ) ) )
            // InternalMSQLTypes.g:142:2: ( ( rule__BooleanType__Group__0 ) )
            {
            // InternalMSQLTypes.g:142:2: ( ( rule__BooleanType__Group__0 ) )
            // InternalMSQLTypes.g:143:3: ( rule__BooleanType__Group__0 )
            {
             before(grammarAccess.getBooleanTypeAccess().getGroup()); 
            // InternalMSQLTypes.g:144:3: ( rule__BooleanType__Group__0 )
            // InternalMSQLTypes.g:144:4: rule__BooleanType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMSQLTypes.g:152:1: rule__Type__Alternatives : ( ( ruleIntegerType ) | ( ruleStringType ) | ( ruleBooleanType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLTypes.g:156:1: ( ( ruleIntegerType ) | ( ruleStringType ) | ( ruleBooleanType ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
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
                    // InternalMSQLTypes.g:157:2: ( ruleIntegerType )
                    {
                    // InternalMSQLTypes.g:157:2: ( ruleIntegerType )
                    // InternalMSQLTypes.g:158:3: ruleIntegerType
                    {
                     before(grammarAccess.getTypeAccess().getIntegerTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getIntegerTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLTypes.g:163:2: ( ruleStringType )
                    {
                    // InternalMSQLTypes.g:163:2: ( ruleStringType )
                    // InternalMSQLTypes.g:164:3: ruleStringType
                    {
                     before(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMSQLTypes.g:169:2: ( ruleBooleanType )
                    {
                    // InternalMSQLTypes.g:169:2: ( ruleBooleanType )
                    // InternalMSQLTypes.g:170:3: ruleBooleanType
                    {
                     before(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_2()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__IntegerType__Group__0"
    // InternalMSQLTypes.g:179:1: rule__IntegerType__Group__0 : rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 ;
    public final void rule__IntegerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLTypes.g:183:1: ( rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 )
            // InternalMSQLTypes.g:184:2: rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1
            {
            pushFollow(FOLLOW_1);
            rule__IntegerType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerType__Group__1();

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
    // $ANTLR end "rule__IntegerType__Group__0"


    // $ANTLR start "rule__IntegerType__Group__0__Impl"
    // InternalMSQLTypes.g:191:1: rule__IntegerType__Group__0__Impl : ( 'Int' ) ;
    public final void rule__IntegerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLTypes.g:195:1: ( ( 'Int' ) )
            // InternalMSQLTypes.g:196:1: ( 'Int' )
            {
            // InternalMSQLTypes.g:196:1: ( 'Int' )
            // InternalMSQLTypes.g:197:2: 'Int'
            {
             before(grammarAccess.getIntegerTypeAccess().getIntKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getIntegerTypeAccess().getIntKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerType__Group__0__Impl"


    // $ANTLR start "rule__IntegerType__Group__1"
    // InternalMSQLTypes.g:206:1: rule__IntegerType__Group__1 : rule__IntegerType__Group__1__Impl ;
    public final void rule__IntegerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLTypes.g:210:1: ( rule__IntegerType__Group__1__Impl )
            // InternalMSQLTypes.g:211:2: rule__IntegerType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerType__Group__1__Impl();

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
    // $ANTLR end "rule__IntegerType__Group__1"


    // $ANTLR start "rule__IntegerType__Group__1__Impl"
    // InternalMSQLTypes.g:217:1: rule__IntegerType__Group__1__Impl : ( () ) ;
    public final void rule__IntegerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLTypes.g:221:1: ( ( () ) )
            // InternalMSQLTypes.g:222:1: ( () )
            {
            // InternalMSQLTypes.g:222:1: ( () )
            // InternalMSQLTypes.g:223:2: ()
            {
             before(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_1()); 
            // InternalMSQLTypes.g:224:2: ()
            // InternalMSQLTypes.g:224:3: 
            {
            }

             after(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerType__Group__1__Impl"


    // $ANTLR start "rule__StringType__Group__0"
    // InternalMSQLTypes.g:233:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLTypes.g:237:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalMSQLTypes.g:238:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_1);
            rule__StringType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group__1();

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
    // $ANTLR end "rule__StringType__Group__0"


    // $ANTLR start "rule__StringType__Group__0__Impl"
    // InternalMSQLTypes.g:245:1: rule__StringType__Group__0__Impl : ( 'String' ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLTypes.g:249:1: ( ( 'String' ) )
            // InternalMSQLTypes.g:250:1: ( 'String' )
            {
            // InternalMSQLTypes.g:250:1: ( 'String' )
            // InternalMSQLTypes.g:251:2: 'String'
            {
             before(grammarAccess.getStringTypeAccess().getStringKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getStringKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__0__Impl"


    // $ANTLR start "rule__StringType__Group__1"
    // InternalMSQLTypes.g:260:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLTypes.g:264:1: ( rule__StringType__Group__1__Impl )
            // InternalMSQLTypes.g:265:2: rule__StringType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group__1__Impl();

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
    // $ANTLR end "rule__StringType__Group__1"


    // $ANTLR start "rule__StringType__Group__1__Impl"
    // InternalMSQLTypes.g:271:1: rule__StringType__Group__1__Impl : ( () ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLTypes.g:275:1: ( ( () ) )
            // InternalMSQLTypes.g:276:1: ( () )
            {
            // InternalMSQLTypes.g:276:1: ( () )
            // InternalMSQLTypes.g:277:2: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_1()); 
            // InternalMSQLTypes.g:278:2: ()
            // InternalMSQLTypes.g:278:3: 
            {
            }

             after(grammarAccess.getStringTypeAccess().getStringTypeAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__1__Impl"


    // $ANTLR start "rule__BooleanType__Group__0"
    // InternalMSQLTypes.g:287:1: rule__BooleanType__Group__0 : rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 ;
    public final void rule__BooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLTypes.g:291:1: ( rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 )
            // InternalMSQLTypes.g:292:2: rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1
            {
            pushFollow(FOLLOW_1);
            rule__BooleanType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanType__Group__1();

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
    // $ANTLR end "rule__BooleanType__Group__0"


    // $ANTLR start "rule__BooleanType__Group__0__Impl"
    // InternalMSQLTypes.g:299:1: rule__BooleanType__Group__0__Impl : ( 'Bool' ) ;
    public final void rule__BooleanType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLTypes.g:303:1: ( ( 'Bool' ) )
            // InternalMSQLTypes.g:304:1: ( 'Bool' )
            {
            // InternalMSQLTypes.g:304:1: ( 'Bool' )
            // InternalMSQLTypes.g:305:2: 'Bool'
            {
             before(grammarAccess.getBooleanTypeAccess().getBoolKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getBooleanTypeAccess().getBoolKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__0__Impl"


    // $ANTLR start "rule__BooleanType__Group__1"
    // InternalMSQLTypes.g:314:1: rule__BooleanType__Group__1 : rule__BooleanType__Group__1__Impl ;
    public final void rule__BooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLTypes.g:318:1: ( rule__BooleanType__Group__1__Impl )
            // InternalMSQLTypes.g:319:2: rule__BooleanType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanType__Group__1__Impl();

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
    // $ANTLR end "rule__BooleanType__Group__1"


    // $ANTLR start "rule__BooleanType__Group__1__Impl"
    // InternalMSQLTypes.g:325:1: rule__BooleanType__Group__1__Impl : ( () ) ;
    public final void rule__BooleanType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLTypes.g:329:1: ( ( () ) )
            // InternalMSQLTypes.g:330:1: ( () )
            {
            // InternalMSQLTypes.g:330:1: ( () )
            // InternalMSQLTypes.g:331:2: ()
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_1()); 
            // InternalMSQLTypes.g:332:2: ()
            // InternalMSQLTypes.g:332:3: 
            {
            }

             after(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanType__Group__1__Impl"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});

}