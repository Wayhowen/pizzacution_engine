package org.mdse.minisql.schema.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

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
import org.mdse.minisql.schema.services.MSQLSchemaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMSQLSchemaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "String", "TABLE", "Bool", "Int", "Comma", "Colon", "LeftCurlyBracket", "RightCurlyBracket", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_ID=12;
    public static final int RULE_WS=17;
    public static final int LeftCurlyBracket=10;
    public static final int RULE_STRING=14;
    public static final int String=4;
    public static final int RULE_ANY_OTHER=18;
    public static final int Int=7;
    public static final int RULE_SL_COMMENT=16;
    public static final int TABLE=5;
    public static final int Comma=8;
    public static final int Bool=6;
    public static final int RULE_INT=13;
    public static final int RULE_ML_COMMENT=15;
    public static final int Colon=9;
    public static final int RightCurlyBracket=11;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMSQLSchemaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMSQLSchemaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMSQLSchemaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMSQLSchemaParser.g"; }


    	private MSQLSchemaGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("Int", "'Int'");
    		tokenNameToValue.put("Bool", "'Bool'");
    		tokenNameToValue.put("TABLE", "'TABLE'");
    		tokenNameToValue.put("String", "'String'");
    	}

    	public void setGrammarAccess(MSQLSchemaGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleTable"
    // InternalMSQLSchemaParser.g:63:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalMSQLSchemaParser.g:64:1: ( ruleTable EOF )
            // InternalMSQLSchemaParser.g:65:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalMSQLSchemaParser.g:72:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:76:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalMSQLSchemaParser.g:77:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalMSQLSchemaParser.g:77:2: ( ( rule__Table__Group__0 ) )
            // InternalMSQLSchemaParser.g:78:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalMSQLSchemaParser.g:79:3: ( rule__Table__Group__0 )
            // InternalMSQLSchemaParser.g:79:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // InternalMSQLSchemaParser.g:88:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalMSQLSchemaParser.g:89:1: ( ruleColumn EOF )
            // InternalMSQLSchemaParser.g:90:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalMSQLSchemaParser.g:97:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:101:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalMSQLSchemaParser.g:102:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalMSQLSchemaParser.g:102:2: ( ( rule__Column__Group__0 ) )
            // InternalMSQLSchemaParser.g:103:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalMSQLSchemaParser.g:104:3: ( rule__Column__Group__0 )
            // InternalMSQLSchemaParser.g:104:4: rule__Column__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleType"
    // InternalMSQLSchemaParser.g:113:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMSQLSchemaParser.g:114:1: ( ruleType EOF )
            // InternalMSQLSchemaParser.g:115:1: ruleType EOF
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
    // InternalMSQLSchemaParser.g:122:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:126:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMSQLSchemaParser.g:127:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMSQLSchemaParser.g:127:2: ( ( rule__Type__Alternatives ) )
            // InternalMSQLSchemaParser.g:128:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMSQLSchemaParser.g:129:3: ( rule__Type__Alternatives )
            // InternalMSQLSchemaParser.g:129:4: rule__Type__Alternatives
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
    // InternalMSQLSchemaParser.g:138:1: entryRuleIntegerType : ruleIntegerType EOF ;
    public final void entryRuleIntegerType() throws RecognitionException {
        try {
            // InternalMSQLSchemaParser.g:139:1: ( ruleIntegerType EOF )
            // InternalMSQLSchemaParser.g:140:1: ruleIntegerType EOF
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
    // InternalMSQLSchemaParser.g:147:1: ruleIntegerType : ( ( rule__IntegerType__Group__0 ) ) ;
    public final void ruleIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:151:2: ( ( ( rule__IntegerType__Group__0 ) ) )
            // InternalMSQLSchemaParser.g:152:2: ( ( rule__IntegerType__Group__0 ) )
            {
            // InternalMSQLSchemaParser.g:152:2: ( ( rule__IntegerType__Group__0 ) )
            // InternalMSQLSchemaParser.g:153:3: ( rule__IntegerType__Group__0 )
            {
             before(grammarAccess.getIntegerTypeAccess().getGroup()); 
            // InternalMSQLSchemaParser.g:154:3: ( rule__IntegerType__Group__0 )
            // InternalMSQLSchemaParser.g:154:4: rule__IntegerType__Group__0
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
    // InternalMSQLSchemaParser.g:163:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // InternalMSQLSchemaParser.g:164:1: ( ruleStringType EOF )
            // InternalMSQLSchemaParser.g:165:1: ruleStringType EOF
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
    // InternalMSQLSchemaParser.g:172:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:176:2: ( ( ( rule__StringType__Group__0 ) ) )
            // InternalMSQLSchemaParser.g:177:2: ( ( rule__StringType__Group__0 ) )
            {
            // InternalMSQLSchemaParser.g:177:2: ( ( rule__StringType__Group__0 ) )
            // InternalMSQLSchemaParser.g:178:3: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // InternalMSQLSchemaParser.g:179:3: ( rule__StringType__Group__0 )
            // InternalMSQLSchemaParser.g:179:4: rule__StringType__Group__0
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
    // InternalMSQLSchemaParser.g:188:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // InternalMSQLSchemaParser.g:189:1: ( ruleBooleanType EOF )
            // InternalMSQLSchemaParser.g:190:1: ruleBooleanType EOF
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
    // InternalMSQLSchemaParser.g:197:1: ruleBooleanType : ( ( rule__BooleanType__Group__0 ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:201:2: ( ( ( rule__BooleanType__Group__0 ) ) )
            // InternalMSQLSchemaParser.g:202:2: ( ( rule__BooleanType__Group__0 ) )
            {
            // InternalMSQLSchemaParser.g:202:2: ( ( rule__BooleanType__Group__0 ) )
            // InternalMSQLSchemaParser.g:203:3: ( rule__BooleanType__Group__0 )
            {
             before(grammarAccess.getBooleanTypeAccess().getGroup()); 
            // InternalMSQLSchemaParser.g:204:3: ( rule__BooleanType__Group__0 )
            // InternalMSQLSchemaParser.g:204:4: rule__BooleanType__Group__0
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
    // InternalMSQLSchemaParser.g:212:1: rule__Type__Alternatives : ( ( ruleIntegerType ) | ( ruleStringType ) | ( ruleBooleanType ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:216:1: ( ( ruleIntegerType ) | ( ruleStringType ) | ( ruleBooleanType ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case Int:
                {
                alt1=1;
                }
                break;
            case String:
                {
                alt1=2;
                }
                break;
            case Bool:
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
                    // InternalMSQLSchemaParser.g:217:2: ( ruleIntegerType )
                    {
                    // InternalMSQLSchemaParser.g:217:2: ( ruleIntegerType )
                    // InternalMSQLSchemaParser.g:218:3: ruleIntegerType
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
                    // InternalMSQLSchemaParser.g:223:2: ( ruleStringType )
                    {
                    // InternalMSQLSchemaParser.g:223:2: ( ruleStringType )
                    // InternalMSQLSchemaParser.g:224:3: ruleStringType
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
                    // InternalMSQLSchemaParser.g:229:2: ( ruleBooleanType )
                    {
                    // InternalMSQLSchemaParser.g:229:2: ( ruleBooleanType )
                    // InternalMSQLSchemaParser.g:230:3: ruleBooleanType
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


    // $ANTLR start "rule__Table__Group__0"
    // InternalMSQLSchemaParser.g:239:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:243:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalMSQLSchemaParser.g:244:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

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
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalMSQLSchemaParser.g:251:1: rule__Table__Group__0__Impl : ( TABLE ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:255:1: ( ( TABLE ) )
            // InternalMSQLSchemaParser.g:256:1: ( TABLE )
            {
            // InternalMSQLSchemaParser.g:256:1: ( TABLE )
            // InternalMSQLSchemaParser.g:257:2: TABLE
            {
             before(grammarAccess.getTableAccess().getTABLEKeyword_0()); 
            match(input,TABLE,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getTABLEKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalMSQLSchemaParser.g:266:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:270:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalMSQLSchemaParser.g:271:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

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
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalMSQLSchemaParser.g:278:1: rule__Table__Group__1__Impl : ( ( rule__Table__NameAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:282:1: ( ( ( rule__Table__NameAssignment_1 ) ) )
            // InternalMSQLSchemaParser.g:283:1: ( ( rule__Table__NameAssignment_1 ) )
            {
            // InternalMSQLSchemaParser.g:283:1: ( ( rule__Table__NameAssignment_1 ) )
            // InternalMSQLSchemaParser.g:284:2: ( rule__Table__NameAssignment_1 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_1()); 
            // InternalMSQLSchemaParser.g:285:2: ( rule__Table__NameAssignment_1 )
            // InternalMSQLSchemaParser.g:285:3: rule__Table__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalMSQLSchemaParser.g:293:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:297:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalMSQLSchemaParser.g:298:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

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
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalMSQLSchemaParser.g:305:1: rule__Table__Group__2__Impl : ( LeftCurlyBracket ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:309:1: ( ( LeftCurlyBracket ) )
            // InternalMSQLSchemaParser.g:310:1: ( LeftCurlyBracket )
            {
            // InternalMSQLSchemaParser.g:310:1: ( LeftCurlyBracket )
            // InternalMSQLSchemaParser.g:311:2: LeftCurlyBracket
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalMSQLSchemaParser.g:320:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:324:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalMSQLSchemaParser.g:325:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__4();

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
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalMSQLSchemaParser.g:332:1: rule__Table__Group__3__Impl : ( ( rule__Table__ColumnsAssignment_3 ) ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:336:1: ( ( ( rule__Table__ColumnsAssignment_3 ) ) )
            // InternalMSQLSchemaParser.g:337:1: ( ( rule__Table__ColumnsAssignment_3 ) )
            {
            // InternalMSQLSchemaParser.g:337:1: ( ( rule__Table__ColumnsAssignment_3 ) )
            // InternalMSQLSchemaParser.g:338:2: ( rule__Table__ColumnsAssignment_3 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_3()); 
            // InternalMSQLSchemaParser.g:339:2: ( rule__Table__ColumnsAssignment_3 )
            // InternalMSQLSchemaParser.g:339:3: rule__Table__ColumnsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // InternalMSQLSchemaParser.g:347:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:351:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalMSQLSchemaParser.g:352:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Table__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__5();

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
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // InternalMSQLSchemaParser.g:359:1: rule__Table__Group__4__Impl : ( ( rule__Table__Group_4__0 )* ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:363:1: ( ( ( rule__Table__Group_4__0 )* ) )
            // InternalMSQLSchemaParser.g:364:1: ( ( rule__Table__Group_4__0 )* )
            {
            // InternalMSQLSchemaParser.g:364:1: ( ( rule__Table__Group_4__0 )* )
            // InternalMSQLSchemaParser.g:365:2: ( rule__Table__Group_4__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_4()); 
            // InternalMSQLSchemaParser.g:366:2: ( rule__Table__Group_4__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Comma) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMSQLSchemaParser.g:366:3: rule__Table__Group_4__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Table__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__5"
    // InternalMSQLSchemaParser.g:374:1: rule__Table__Group__5 : rule__Table__Group__5__Impl ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:378:1: ( rule__Table__Group__5__Impl )
            // InternalMSQLSchemaParser.g:379:2: rule__Table__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__5__Impl();

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
    // $ANTLR end "rule__Table__Group__5"


    // $ANTLR start "rule__Table__Group__5__Impl"
    // InternalMSQLSchemaParser.g:385:1: rule__Table__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:389:1: ( ( RightCurlyBracket ) )
            // InternalMSQLSchemaParser.g:390:1: ( RightCurlyBracket )
            {
            // InternalMSQLSchemaParser.g:390:1: ( RightCurlyBracket )
            // InternalMSQLSchemaParser.g:391:2: RightCurlyBracket
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5__Impl"


    // $ANTLR start "rule__Table__Group_4__0"
    // InternalMSQLSchemaParser.g:401:1: rule__Table__Group_4__0 : rule__Table__Group_4__0__Impl rule__Table__Group_4__1 ;
    public final void rule__Table__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:405:1: ( rule__Table__Group_4__0__Impl rule__Table__Group_4__1 )
            // InternalMSQLSchemaParser.g:406:2: rule__Table__Group_4__0__Impl rule__Table__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Table__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_4__1();

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
    // $ANTLR end "rule__Table__Group_4__0"


    // $ANTLR start "rule__Table__Group_4__0__Impl"
    // InternalMSQLSchemaParser.g:413:1: rule__Table__Group_4__0__Impl : ( Comma ) ;
    public final void rule__Table__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:417:1: ( ( Comma ) )
            // InternalMSQLSchemaParser.g:418:1: ( Comma )
            {
            // InternalMSQLSchemaParser.g:418:1: ( Comma )
            // InternalMSQLSchemaParser.g:419:2: Comma
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_4_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__0__Impl"


    // $ANTLR start "rule__Table__Group_4__1"
    // InternalMSQLSchemaParser.g:428:1: rule__Table__Group_4__1 : rule__Table__Group_4__1__Impl ;
    public final void rule__Table__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:432:1: ( rule__Table__Group_4__1__Impl )
            // InternalMSQLSchemaParser.g:433:2: rule__Table__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_4__1__Impl();

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
    // $ANTLR end "rule__Table__Group_4__1"


    // $ANTLR start "rule__Table__Group_4__1__Impl"
    // InternalMSQLSchemaParser.g:439:1: rule__Table__Group_4__1__Impl : ( ( rule__Table__ColumnsAssignment_4_1 ) ) ;
    public final void rule__Table__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:443:1: ( ( ( rule__Table__ColumnsAssignment_4_1 ) ) )
            // InternalMSQLSchemaParser.g:444:1: ( ( rule__Table__ColumnsAssignment_4_1 ) )
            {
            // InternalMSQLSchemaParser.g:444:1: ( ( rule__Table__ColumnsAssignment_4_1 ) )
            // InternalMSQLSchemaParser.g:445:2: ( rule__Table__ColumnsAssignment_4_1 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_4_1()); 
            // InternalMSQLSchemaParser.g:446:2: ( rule__Table__ColumnsAssignment_4_1 )
            // InternalMSQLSchemaParser.g:446:3: rule__Table__ColumnsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_4__1__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalMSQLSchemaParser.g:455:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:459:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalMSQLSchemaParser.g:460:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__1();

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
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // InternalMSQLSchemaParser.g:467:1: rule__Column__Group__0__Impl : ( ( rule__Column__NameAssignment_0 ) ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:471:1: ( ( ( rule__Column__NameAssignment_0 ) ) )
            // InternalMSQLSchemaParser.g:472:1: ( ( rule__Column__NameAssignment_0 ) )
            {
            // InternalMSQLSchemaParser.g:472:1: ( ( rule__Column__NameAssignment_0 ) )
            // InternalMSQLSchemaParser.g:473:2: ( rule__Column__NameAssignment_0 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_0()); 
            // InternalMSQLSchemaParser.g:474:2: ( rule__Column__NameAssignment_0 )
            // InternalMSQLSchemaParser.g:474:3: rule__Column__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Column__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // InternalMSQLSchemaParser.g:482:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:486:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalMSQLSchemaParser.g:487:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__2();

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
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // InternalMSQLSchemaParser.g:494:1: rule__Column__Group__1__Impl : ( Colon ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:498:1: ( ( Colon ) )
            // InternalMSQLSchemaParser.g:499:1: ( Colon )
            {
            // InternalMSQLSchemaParser.g:499:1: ( Colon )
            // InternalMSQLSchemaParser.g:500:2: Colon
            {
             before(grammarAccess.getColumnAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // InternalMSQLSchemaParser.g:509:1: rule__Column__Group__2 : rule__Column__Group__2__Impl ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:513:1: ( rule__Column__Group__2__Impl )
            // InternalMSQLSchemaParser.g:514:2: rule__Column__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__2__Impl();

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
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // InternalMSQLSchemaParser.g:520:1: rule__Column__Group__2__Impl : ( ( rule__Column__TypeAssignment_2 ) ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:524:1: ( ( ( rule__Column__TypeAssignment_2 ) ) )
            // InternalMSQLSchemaParser.g:525:1: ( ( rule__Column__TypeAssignment_2 ) )
            {
            // InternalMSQLSchemaParser.g:525:1: ( ( rule__Column__TypeAssignment_2 ) )
            // InternalMSQLSchemaParser.g:526:2: ( rule__Column__TypeAssignment_2 )
            {
             before(grammarAccess.getColumnAccess().getTypeAssignment_2()); 
            // InternalMSQLSchemaParser.g:527:2: ( rule__Column__TypeAssignment_2 )
            // InternalMSQLSchemaParser.g:527:3: rule__Column__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Column__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__IntegerType__Group__0"
    // InternalMSQLSchemaParser.g:536:1: rule__IntegerType__Group__0 : rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 ;
    public final void rule__IntegerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:540:1: ( rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 )
            // InternalMSQLSchemaParser.g:541:2: rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1
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
    // InternalMSQLSchemaParser.g:548:1: rule__IntegerType__Group__0__Impl : ( Int ) ;
    public final void rule__IntegerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:552:1: ( ( Int ) )
            // InternalMSQLSchemaParser.g:553:1: ( Int )
            {
            // InternalMSQLSchemaParser.g:553:1: ( Int )
            // InternalMSQLSchemaParser.g:554:2: Int
            {
             before(grammarAccess.getIntegerTypeAccess().getIntKeyword_0()); 
            match(input,Int,FOLLOW_2); 
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
    // InternalMSQLSchemaParser.g:563:1: rule__IntegerType__Group__1 : rule__IntegerType__Group__1__Impl ;
    public final void rule__IntegerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:567:1: ( rule__IntegerType__Group__1__Impl )
            // InternalMSQLSchemaParser.g:568:2: rule__IntegerType__Group__1__Impl
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
    // InternalMSQLSchemaParser.g:574:1: rule__IntegerType__Group__1__Impl : ( () ) ;
    public final void rule__IntegerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:578:1: ( ( () ) )
            // InternalMSQLSchemaParser.g:579:1: ( () )
            {
            // InternalMSQLSchemaParser.g:579:1: ( () )
            // InternalMSQLSchemaParser.g:580:2: ()
            {
             before(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_1()); 
            // InternalMSQLSchemaParser.g:581:2: ()
            // InternalMSQLSchemaParser.g:581:3: 
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
    // InternalMSQLSchemaParser.g:590:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:594:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalMSQLSchemaParser.g:595:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
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
    // InternalMSQLSchemaParser.g:602:1: rule__StringType__Group__0__Impl : ( String ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:606:1: ( ( String ) )
            // InternalMSQLSchemaParser.g:607:1: ( String )
            {
            // InternalMSQLSchemaParser.g:607:1: ( String )
            // InternalMSQLSchemaParser.g:608:2: String
            {
             before(grammarAccess.getStringTypeAccess().getStringKeyword_0()); 
            match(input,String,FOLLOW_2); 
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
    // InternalMSQLSchemaParser.g:617:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:621:1: ( rule__StringType__Group__1__Impl )
            // InternalMSQLSchemaParser.g:622:2: rule__StringType__Group__1__Impl
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
    // InternalMSQLSchemaParser.g:628:1: rule__StringType__Group__1__Impl : ( () ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:632:1: ( ( () ) )
            // InternalMSQLSchemaParser.g:633:1: ( () )
            {
            // InternalMSQLSchemaParser.g:633:1: ( () )
            // InternalMSQLSchemaParser.g:634:2: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_1()); 
            // InternalMSQLSchemaParser.g:635:2: ()
            // InternalMSQLSchemaParser.g:635:3: 
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
    // InternalMSQLSchemaParser.g:644:1: rule__BooleanType__Group__0 : rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 ;
    public final void rule__BooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:648:1: ( rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 )
            // InternalMSQLSchemaParser.g:649:2: rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1
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
    // InternalMSQLSchemaParser.g:656:1: rule__BooleanType__Group__0__Impl : ( Bool ) ;
    public final void rule__BooleanType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:660:1: ( ( Bool ) )
            // InternalMSQLSchemaParser.g:661:1: ( Bool )
            {
            // InternalMSQLSchemaParser.g:661:1: ( Bool )
            // InternalMSQLSchemaParser.g:662:2: Bool
            {
             before(grammarAccess.getBooleanTypeAccess().getBoolKeyword_0()); 
            match(input,Bool,FOLLOW_2); 
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
    // InternalMSQLSchemaParser.g:671:1: rule__BooleanType__Group__1 : rule__BooleanType__Group__1__Impl ;
    public final void rule__BooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:675:1: ( rule__BooleanType__Group__1__Impl )
            // InternalMSQLSchemaParser.g:676:2: rule__BooleanType__Group__1__Impl
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
    // InternalMSQLSchemaParser.g:682:1: rule__BooleanType__Group__1__Impl : ( () ) ;
    public final void rule__BooleanType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:686:1: ( ( () ) )
            // InternalMSQLSchemaParser.g:687:1: ( () )
            {
            // InternalMSQLSchemaParser.g:687:1: ( () )
            // InternalMSQLSchemaParser.g:688:2: ()
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_1()); 
            // InternalMSQLSchemaParser.g:689:2: ()
            // InternalMSQLSchemaParser.g:689:3: 
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


    // $ANTLR start "rule__Table__NameAssignment_1"
    // InternalMSQLSchemaParser.g:698:1: rule__Table__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Table__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:702:1: ( ( RULE_ID ) )
            // InternalMSQLSchemaParser.g:703:2: ( RULE_ID )
            {
            // InternalMSQLSchemaParser.g:703:2: ( RULE_ID )
            // InternalMSQLSchemaParser.g:704:3: RULE_ID
            {
             before(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__NameAssignment_1"


    // $ANTLR start "rule__Table__ColumnsAssignment_3"
    // InternalMSQLSchemaParser.g:713:1: rule__Table__ColumnsAssignment_3 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:717:1: ( ( ruleColumn ) )
            // InternalMSQLSchemaParser.g:718:2: ( ruleColumn )
            {
            // InternalMSQLSchemaParser.g:718:2: ( ruleColumn )
            // InternalMSQLSchemaParser.g:719:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ColumnsAssignment_3"


    // $ANTLR start "rule__Table__ColumnsAssignment_4_1"
    // InternalMSQLSchemaParser.g:728:1: rule__Table__ColumnsAssignment_4_1 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:732:1: ( ( ruleColumn ) )
            // InternalMSQLSchemaParser.g:733:2: ( ruleColumn )
            {
            // InternalMSQLSchemaParser.g:733:2: ( ruleColumn )
            // InternalMSQLSchemaParser.g:734:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ColumnsAssignment_4_1"


    // $ANTLR start "rule__Column__NameAssignment_0"
    // InternalMSQLSchemaParser.g:743:1: rule__Column__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Column__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:747:1: ( ( RULE_ID ) )
            // InternalMSQLSchemaParser.g:748:2: ( RULE_ID )
            {
            // InternalMSQLSchemaParser.g:748:2: ( RULE_ID )
            // InternalMSQLSchemaParser.g:749:3: RULE_ID
            {
             before(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__NameAssignment_0"


    // $ANTLR start "rule__Column__TypeAssignment_2"
    // InternalMSQLSchemaParser.g:758:1: rule__Column__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Column__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLSchemaParser.g:762:1: ( ( ruleType ) )
            // InternalMSQLSchemaParser.g:763:2: ( ruleType )
            {
            // InternalMSQLSchemaParser.g:763:2: ( ruleType )
            // InternalMSQLSchemaParser.g:764:3: ruleType
            {
             before(grammarAccess.getColumnAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__TypeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000000D0L});

}