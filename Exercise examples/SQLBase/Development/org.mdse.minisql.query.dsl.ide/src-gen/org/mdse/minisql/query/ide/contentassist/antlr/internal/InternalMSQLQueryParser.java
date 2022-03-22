package org.mdse.minisql.query.ide.contentassist.antlr.internal;
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
import org.mdse.minisql.query.services.MSQLQueryGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMSQLQueryParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SELECT", "String", "ORDER", "WHERE", "Bool", "DESC", "FROM", "AND", "ASC", "Int", "NOT", "ExclamationMarkEqualsSign", "LessThanSignEqualsSign", "GreaterThanSignEqualsSign", "BY", "OR", "LeftParenthesis", "RightParenthesis", "Asterisk", "PlusSign", "Comma", "HyphenMinus", "Solidus", "Semicolon", "LessThanSign", "EqualsSign", "GreaterThanSign", "RULE_BOOL", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_STRING=34;
    public static final int String=5;
    public static final int FROM=10;
    public static final int DESC=9;
    public static final int Int=13;
    public static final int LessThanSign=28;
    public static final int RULE_SL_COMMENT=36;
    public static final int ORDER=6;
    public static final int ASC=12;
    public static final int Comma=24;
    public static final int EqualsSign=29;
    public static final int HyphenMinus=25;
    public static final int LeftParenthesis=20;
    public static final int Bool=8;
    public static final int BY=18;
    public static final int LessThanSignEqualsSign=16;
    public static final int Solidus=26;
    public static final int EOF=-1;
    public static final int Asterisk=22;
    public static final int GreaterThanSign=30;
    public static final int OR=19;
    public static final int RULE_ID=32;
    public static final int RULE_WS=37;
    public static final int RightParenthesis=21;
    public static final int RULE_ANY_OTHER=38;
    public static final int WHERE=7;
    public static final int RULE_BOOL=31;
    public static final int SELECT=4;
    public static final int GreaterThanSignEqualsSign=17;
    public static final int Semicolon=27;
    public static final int NOT=14;
    public static final int PlusSign=23;
    public static final int RULE_INT=33;
    public static final int AND=11;
    public static final int RULE_ML_COMMENT=35;
    public static final int ExclamationMarkEqualsSign=15;

    // delegates
    // delegators


        public InternalMSQLQueryParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMSQLQueryParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMSQLQueryParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMSQLQueryParser.g"; }


    	private MSQLQueryGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("LeftParenthesis", "'('");
    		tokenNameToValue.put("RightParenthesis", "')'");
    		tokenNameToValue.put("Asterisk", "'*'");
    		tokenNameToValue.put("PlusSign", "'+'");
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("HyphenMinus", "'-'");
    		tokenNameToValue.put("Solidus", "'/'");
    		tokenNameToValue.put("Semicolon", "';'");
    		tokenNameToValue.put("LessThanSign", "'<'");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("GreaterThanSign", "'>'");
    		tokenNameToValue.put("ExclamationMarkEqualsSign", "'!='");
    		tokenNameToValue.put("LessThanSignEqualsSign", "'<='");
    		tokenNameToValue.put("GreaterThanSignEqualsSign", "'>='");
    		tokenNameToValue.put("BY", "'BY'");
    		tokenNameToValue.put("OR", "'OR'");
    		tokenNameToValue.put("AND", "'AND'");
    		tokenNameToValue.put("ASC", "'ASC'");
    		tokenNameToValue.put("Int", "'Int'");
    		tokenNameToValue.put("NOT", "'NOT'");
    		tokenNameToValue.put("Bool", "'Bool'");
    		tokenNameToValue.put("DESC", "'DESC'");
    		tokenNameToValue.put("FROM", "'FROM'");
    		tokenNameToValue.put("ORDER", "'ORDER'");
    		tokenNameToValue.put("WHERE", "'WHERE'");
    		tokenNameToValue.put("SELECT", "'SELECT'");
    		tokenNameToValue.put("String", "'String'");
    	}

    	public void setGrammarAccess(MSQLQueryGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSelectQuery"
    // InternalMSQLQueryParser.g:82:1: entryRuleSelectQuery : ruleSelectQuery EOF ;
    public final void entryRuleSelectQuery() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:83:1: ( ruleSelectQuery EOF )
            // InternalMSQLQueryParser.g:84:1: ruleSelectQuery EOF
            {
             before(grammarAccess.getSelectQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectQuery();

            state._fsp--;

             after(grammarAccess.getSelectQueryRule()); 
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
    // $ANTLR end "entryRuleSelectQuery"


    // $ANTLR start "ruleSelectQuery"
    // InternalMSQLQueryParser.g:91:1: ruleSelectQuery : ( ( rule__SelectQuery__Group__0 ) ) ;
    public final void ruleSelectQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:95:2: ( ( ( rule__SelectQuery__Group__0 ) ) )
            // InternalMSQLQueryParser.g:96:2: ( ( rule__SelectQuery__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:96:2: ( ( rule__SelectQuery__Group__0 ) )
            // InternalMSQLQueryParser.g:97:3: ( rule__SelectQuery__Group__0 )
            {
             before(grammarAccess.getSelectQueryAccess().getGroup()); 
            // InternalMSQLQueryParser.g:98:3: ( rule__SelectQuery__Group__0 )
            // InternalMSQLQueryParser.g:98:4: rule__SelectQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectQuery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectQueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectQuery"


    // $ANTLR start "entryRuleWhatClause"
    // InternalMSQLQueryParser.g:107:1: entryRuleWhatClause : ruleWhatClause EOF ;
    public final void entryRuleWhatClause() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:108:1: ( ruleWhatClause EOF )
            // InternalMSQLQueryParser.g:109:1: ruleWhatClause EOF
            {
             before(grammarAccess.getWhatClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleWhatClause();

            state._fsp--;

             after(grammarAccess.getWhatClauseRule()); 
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
    // $ANTLR end "entryRuleWhatClause"


    // $ANTLR start "ruleWhatClause"
    // InternalMSQLQueryParser.g:116:1: ruleWhatClause : ( ( rule__WhatClause__Group__0 ) ) ;
    public final void ruleWhatClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:120:2: ( ( ( rule__WhatClause__Group__0 ) ) )
            // InternalMSQLQueryParser.g:121:2: ( ( rule__WhatClause__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:121:2: ( ( rule__WhatClause__Group__0 ) )
            // InternalMSQLQueryParser.g:122:3: ( rule__WhatClause__Group__0 )
            {
             before(grammarAccess.getWhatClauseAccess().getGroup()); 
            // InternalMSQLQueryParser.g:123:3: ( rule__WhatClause__Group__0 )
            // InternalMSQLQueryParser.g:123:4: rule__WhatClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhatClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhatClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhatClause"


    // $ANTLR start "entryRuleWhatDirective"
    // InternalMSQLQueryParser.g:132:1: entryRuleWhatDirective : ruleWhatDirective EOF ;
    public final void entryRuleWhatDirective() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:133:1: ( ruleWhatDirective EOF )
            // InternalMSQLQueryParser.g:134:1: ruleWhatDirective EOF
            {
             before(grammarAccess.getWhatDirectiveRule()); 
            pushFollow(FOLLOW_1);
            ruleWhatDirective();

            state._fsp--;

             after(grammarAccess.getWhatDirectiveRule()); 
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
    // $ANTLR end "entryRuleWhatDirective"


    // $ANTLR start "ruleWhatDirective"
    // InternalMSQLQueryParser.g:141:1: ruleWhatDirective : ( ( rule__WhatDirective__Alternatives ) ) ;
    public final void ruleWhatDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:145:2: ( ( ( rule__WhatDirective__Alternatives ) ) )
            // InternalMSQLQueryParser.g:146:2: ( ( rule__WhatDirective__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:146:2: ( ( rule__WhatDirective__Alternatives ) )
            // InternalMSQLQueryParser.g:147:3: ( rule__WhatDirective__Alternatives )
            {
             before(grammarAccess.getWhatDirectiveAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:148:3: ( rule__WhatDirective__Alternatives )
            // InternalMSQLQueryParser.g:148:4: rule__WhatDirective__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WhatDirective__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWhatDirectiveAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhatDirective"


    // $ANTLR start "entryRuleAllColumnsWhatDirective"
    // InternalMSQLQueryParser.g:157:1: entryRuleAllColumnsWhatDirective : ruleAllColumnsWhatDirective EOF ;
    public final void entryRuleAllColumnsWhatDirective() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:158:1: ( ruleAllColumnsWhatDirective EOF )
            // InternalMSQLQueryParser.g:159:1: ruleAllColumnsWhatDirective EOF
            {
             before(grammarAccess.getAllColumnsWhatDirectiveRule()); 
            pushFollow(FOLLOW_1);
            ruleAllColumnsWhatDirective();

            state._fsp--;

             after(grammarAccess.getAllColumnsWhatDirectiveRule()); 
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
    // $ANTLR end "entryRuleAllColumnsWhatDirective"


    // $ANTLR start "ruleAllColumnsWhatDirective"
    // InternalMSQLQueryParser.g:166:1: ruleAllColumnsWhatDirective : ( ( rule__AllColumnsWhatDirective__Group__0 ) ) ;
    public final void ruleAllColumnsWhatDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:170:2: ( ( ( rule__AllColumnsWhatDirective__Group__0 ) ) )
            // InternalMSQLQueryParser.g:171:2: ( ( rule__AllColumnsWhatDirective__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:171:2: ( ( rule__AllColumnsWhatDirective__Group__0 ) )
            // InternalMSQLQueryParser.g:172:3: ( rule__AllColumnsWhatDirective__Group__0 )
            {
             before(grammarAccess.getAllColumnsWhatDirectiveAccess().getGroup()); 
            // InternalMSQLQueryParser.g:173:3: ( rule__AllColumnsWhatDirective__Group__0 )
            // InternalMSQLQueryParser.g:173:4: rule__AllColumnsWhatDirective__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AllColumnsWhatDirective__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAllColumnsWhatDirectiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAllColumnsWhatDirective"


    // $ANTLR start "entryRuleSingleColumnWhatDirective"
    // InternalMSQLQueryParser.g:182:1: entryRuleSingleColumnWhatDirective : ruleSingleColumnWhatDirective EOF ;
    public final void entryRuleSingleColumnWhatDirective() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:183:1: ( ruleSingleColumnWhatDirective EOF )
            // InternalMSQLQueryParser.g:184:1: ruleSingleColumnWhatDirective EOF
            {
             before(grammarAccess.getSingleColumnWhatDirectiveRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleColumnWhatDirective();

            state._fsp--;

             after(grammarAccess.getSingleColumnWhatDirectiveRule()); 
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
    // $ANTLR end "entryRuleSingleColumnWhatDirective"


    // $ANTLR start "ruleSingleColumnWhatDirective"
    // InternalMSQLQueryParser.g:191:1: ruleSingleColumnWhatDirective : ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) ) ;
    public final void ruleSingleColumnWhatDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:195:2: ( ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) ) )
            // InternalMSQLQueryParser.g:196:2: ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) )
            {
            // InternalMSQLQueryParser.g:196:2: ( ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment ) )
            // InternalMSQLQueryParser.g:197:3: ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment )
            {
             before(grammarAccess.getSingleColumnWhatDirectiveAccess().getColumnReferenceAssignment()); 
            // InternalMSQLQueryParser.g:198:3: ( rule__SingleColumnWhatDirective__ColumnReferenceAssignment )
            // InternalMSQLQueryParser.g:198:4: rule__SingleColumnWhatDirective__ColumnReferenceAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SingleColumnWhatDirective__ColumnReferenceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSingleColumnWhatDirectiveAccess().getColumnReferenceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleColumnWhatDirective"


    // $ANTLR start "entryRuleFromClause"
    // InternalMSQLQueryParser.g:207:1: entryRuleFromClause : ruleFromClause EOF ;
    public final void entryRuleFromClause() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:208:1: ( ruleFromClause EOF )
            // InternalMSQLQueryParser.g:209:1: ruleFromClause EOF
            {
             before(grammarAccess.getFromClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleFromClause();

            state._fsp--;

             after(grammarAccess.getFromClauseRule()); 
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
    // $ANTLR end "entryRuleFromClause"


    // $ANTLR start "ruleFromClause"
    // InternalMSQLQueryParser.g:216:1: ruleFromClause : ( ( rule__FromClause__Group__0 ) ) ;
    public final void ruleFromClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:220:2: ( ( ( rule__FromClause__Group__0 ) ) )
            // InternalMSQLQueryParser.g:221:2: ( ( rule__FromClause__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:221:2: ( ( rule__FromClause__Group__0 ) )
            // InternalMSQLQueryParser.g:222:3: ( rule__FromClause__Group__0 )
            {
             before(grammarAccess.getFromClauseAccess().getGroup()); 
            // InternalMSQLQueryParser.g:223:3: ( rule__FromClause__Group__0 )
            // InternalMSQLQueryParser.g:223:4: rule__FromClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FromClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFromClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFromClause"


    // $ANTLR start "entryRuleWhereClause"
    // InternalMSQLQueryParser.g:232:1: entryRuleWhereClause : ruleWhereClause EOF ;
    public final void entryRuleWhereClause() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:233:1: ( ruleWhereClause EOF )
            // InternalMSQLQueryParser.g:234:1: ruleWhereClause EOF
            {
             before(grammarAccess.getWhereClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleWhereClause();

            state._fsp--;

             after(grammarAccess.getWhereClauseRule()); 
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
    // $ANTLR end "entryRuleWhereClause"


    // $ANTLR start "ruleWhereClause"
    // InternalMSQLQueryParser.g:241:1: ruleWhereClause : ( ( rule__WhereClause__Group__0 ) ) ;
    public final void ruleWhereClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:245:2: ( ( ( rule__WhereClause__Group__0 ) ) )
            // InternalMSQLQueryParser.g:246:2: ( ( rule__WhereClause__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:246:2: ( ( rule__WhereClause__Group__0 ) )
            // InternalMSQLQueryParser.g:247:3: ( rule__WhereClause__Group__0 )
            {
             before(grammarAccess.getWhereClauseAccess().getGroup()); 
            // InternalMSQLQueryParser.g:248:3: ( rule__WhereClause__Group__0 )
            // InternalMSQLQueryParser.g:248:4: rule__WhereClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhereClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhereClause"


    // $ANTLR start "entryRuleOrderByClause"
    // InternalMSQLQueryParser.g:257:1: entryRuleOrderByClause : ruleOrderByClause EOF ;
    public final void entryRuleOrderByClause() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:258:1: ( ruleOrderByClause EOF )
            // InternalMSQLQueryParser.g:259:1: ruleOrderByClause EOF
            {
             before(grammarAccess.getOrderByClauseRule()); 
            pushFollow(FOLLOW_1);
            ruleOrderByClause();

            state._fsp--;

             after(grammarAccess.getOrderByClauseRule()); 
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
    // $ANTLR end "entryRuleOrderByClause"


    // $ANTLR start "ruleOrderByClause"
    // InternalMSQLQueryParser.g:266:1: ruleOrderByClause : ( ( rule__OrderByClause__Group__0 ) ) ;
    public final void ruleOrderByClause() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:270:2: ( ( ( rule__OrderByClause__Group__0 ) ) )
            // InternalMSQLQueryParser.g:271:2: ( ( rule__OrderByClause__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:271:2: ( ( rule__OrderByClause__Group__0 ) )
            // InternalMSQLQueryParser.g:272:3: ( rule__OrderByClause__Group__0 )
            {
             before(grammarAccess.getOrderByClauseAccess().getGroup()); 
            // InternalMSQLQueryParser.g:273:3: ( rule__OrderByClause__Group__0 )
            // InternalMSQLQueryParser.g:273:4: rule__OrderByClause__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrderByClause__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderByClauseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderByClause"


    // $ANTLR start "entryRuleOrderDirective"
    // InternalMSQLQueryParser.g:282:1: entryRuleOrderDirective : ruleOrderDirective EOF ;
    public final void entryRuleOrderDirective() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:283:1: ( ruleOrderDirective EOF )
            // InternalMSQLQueryParser.g:284:1: ruleOrderDirective EOF
            {
             before(grammarAccess.getOrderDirectiveRule()); 
            pushFollow(FOLLOW_1);
            ruleOrderDirective();

            state._fsp--;

             after(grammarAccess.getOrderDirectiveRule()); 
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
    // $ANTLR end "entryRuleOrderDirective"


    // $ANTLR start "ruleOrderDirective"
    // InternalMSQLQueryParser.g:291:1: ruleOrderDirective : ( ( rule__OrderDirective__Group__0 ) ) ;
    public final void ruleOrderDirective() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:295:2: ( ( ( rule__OrderDirective__Group__0 ) ) )
            // InternalMSQLQueryParser.g:296:2: ( ( rule__OrderDirective__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:296:2: ( ( rule__OrderDirective__Group__0 ) )
            // InternalMSQLQueryParser.g:297:3: ( rule__OrderDirective__Group__0 )
            {
             before(grammarAccess.getOrderDirectiveAccess().getGroup()); 
            // InternalMSQLQueryParser.g:298:3: ( rule__OrderDirective__Group__0 )
            // InternalMSQLQueryParser.g:298:4: rule__OrderDirective__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrderDirective__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrderDirectiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderDirective"


    // $ANTLR start "entryRuleExpression"
    // InternalMSQLQueryParser.g:307:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:308:1: ( ruleExpression EOF )
            // InternalMSQLQueryParser.g:309:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMSQLQueryParser.g:316:1: ruleExpression : ( ruleOrExpression ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:320:2: ( ( ruleOrExpression ) )
            // InternalMSQLQueryParser.g:321:2: ( ruleOrExpression )
            {
            // InternalMSQLQueryParser.g:321:2: ( ruleOrExpression )
            // InternalMSQLQueryParser.g:322:3: ruleOrExpression
            {
             before(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOrExpression"
    // InternalMSQLQueryParser.g:332:1: entryRuleOrExpression : ruleOrExpression EOF ;
    public final void entryRuleOrExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:333:1: ( ruleOrExpression EOF )
            // InternalMSQLQueryParser.g:334:1: ruleOrExpression EOF
            {
             before(grammarAccess.getOrExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleOrExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionRule()); 
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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // InternalMSQLQueryParser.g:341:1: ruleOrExpression : ( ( rule__OrExpression__Group__0 ) ) ;
    public final void ruleOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:345:2: ( ( ( rule__OrExpression__Group__0 ) ) )
            // InternalMSQLQueryParser.g:346:2: ( ( rule__OrExpression__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:346:2: ( ( rule__OrExpression__Group__0 ) )
            // InternalMSQLQueryParser.g:347:3: ( rule__OrExpression__Group__0 )
            {
             before(grammarAccess.getOrExpressionAccess().getGroup()); 
            // InternalMSQLQueryParser.g:348:3: ( rule__OrExpression__Group__0 )
            // InternalMSQLQueryParser.g:348:4: rule__OrExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalMSQLQueryParser.g:357:1: entryRuleAndExpression : ruleAndExpression EOF ;
    public final void entryRuleAndExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:358:1: ( ruleAndExpression EOF )
            // InternalMSQLQueryParser.g:359:1: ruleAndExpression EOF
            {
             before(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getAndExpressionRule()); 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalMSQLQueryParser.g:366:1: ruleAndExpression : ( ( rule__AndExpression__Group__0 ) ) ;
    public final void ruleAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:370:2: ( ( ( rule__AndExpression__Group__0 ) ) )
            // InternalMSQLQueryParser.g:371:2: ( ( rule__AndExpression__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:371:2: ( ( rule__AndExpression__Group__0 ) )
            // InternalMSQLQueryParser.g:372:3: ( rule__AndExpression__Group__0 )
            {
             before(grammarAccess.getAndExpressionAccess().getGroup()); 
            // InternalMSQLQueryParser.g:373:3: ( rule__AndExpression__Group__0 )
            // InternalMSQLQueryParser.g:373:4: rule__AndExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleAndOperand"
    // InternalMSQLQueryParser.g:382:1: entryRuleAndOperand : ruleAndOperand EOF ;
    public final void entryRuleAndOperand() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:383:1: ( ruleAndOperand EOF )
            // InternalMSQLQueryParser.g:384:1: ruleAndOperand EOF
            {
             before(grammarAccess.getAndOperandRule()); 
            pushFollow(FOLLOW_1);
            ruleAndOperand();

            state._fsp--;

             after(grammarAccess.getAndOperandRule()); 
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
    // $ANTLR end "entryRuleAndOperand"


    // $ANTLR start "ruleAndOperand"
    // InternalMSQLQueryParser.g:391:1: ruleAndOperand : ( ( rule__AndOperand__Alternatives ) ) ;
    public final void ruleAndOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:395:2: ( ( ( rule__AndOperand__Alternatives ) ) )
            // InternalMSQLQueryParser.g:396:2: ( ( rule__AndOperand__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:396:2: ( ( rule__AndOperand__Alternatives ) )
            // InternalMSQLQueryParser.g:397:3: ( rule__AndOperand__Alternatives )
            {
             before(grammarAccess.getAndOperandAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:398:3: ( rule__AndOperand__Alternatives )
            // InternalMSQLQueryParser.g:398:4: rule__AndOperand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AndOperand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAndOperandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndOperand"


    // $ANTLR start "entryRuleNotExpression"
    // InternalMSQLQueryParser.g:407:1: entryRuleNotExpression : ruleNotExpression EOF ;
    public final void entryRuleNotExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:408:1: ( ruleNotExpression EOF )
            // InternalMSQLQueryParser.g:409:1: ruleNotExpression EOF
            {
             before(grammarAccess.getNotExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleNotExpression();

            state._fsp--;

             after(grammarAccess.getNotExpressionRule()); 
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
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // InternalMSQLQueryParser.g:416:1: ruleNotExpression : ( ( rule__NotExpression__Group__0 ) ) ;
    public final void ruleNotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:420:2: ( ( ( rule__NotExpression__Group__0 ) ) )
            // InternalMSQLQueryParser.g:421:2: ( ( rule__NotExpression__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:421:2: ( ( rule__NotExpression__Group__0 ) )
            // InternalMSQLQueryParser.g:422:3: ( rule__NotExpression__Group__0 )
            {
             before(grammarAccess.getNotExpressionAccess().getGroup()); 
            // InternalMSQLQueryParser.g:423:3: ( rule__NotExpression__Group__0 )
            // InternalMSQLQueryParser.g:423:4: rule__NotExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleComparativeExpression"
    // InternalMSQLQueryParser.g:432:1: entryRuleComparativeExpression : ruleComparativeExpression EOF ;
    public final void entryRuleComparativeExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:433:1: ( ruleComparativeExpression EOF )
            // InternalMSQLQueryParser.g:434:1: ruleComparativeExpression EOF
            {
             before(grammarAccess.getComparativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleComparativeExpression();

            state._fsp--;

             after(grammarAccess.getComparativeExpressionRule()); 
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
    // $ANTLR end "entryRuleComparativeExpression"


    // $ANTLR start "ruleComparativeExpression"
    // InternalMSQLQueryParser.g:441:1: ruleComparativeExpression : ( ( rule__ComparativeExpression__Group__0 ) ) ;
    public final void ruleComparativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:445:2: ( ( ( rule__ComparativeExpression__Group__0 ) ) )
            // InternalMSQLQueryParser.g:446:2: ( ( rule__ComparativeExpression__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:446:2: ( ( rule__ComparativeExpression__Group__0 ) )
            // InternalMSQLQueryParser.g:447:3: ( rule__ComparativeExpression__Group__0 )
            {
             before(grammarAccess.getComparativeExpressionAccess().getGroup()); 
            // InternalMSQLQueryParser.g:448:3: ( rule__ComparativeExpression__Group__0 )
            // InternalMSQLQueryParser.g:448:4: rule__ComparativeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparativeExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparativeExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalMSQLQueryParser.g:457:1: entryRuleAdditiveExpression : ruleAdditiveExpression EOF ;
    public final void entryRuleAdditiveExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:458:1: ( ruleAdditiveExpression EOF )
            // InternalMSQLQueryParser.g:459:1: ruleAdditiveExpression EOF
            {
             before(grammarAccess.getAdditiveExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionRule()); 
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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalMSQLQueryParser.g:466:1: ruleAdditiveExpression : ( ( rule__AdditiveExpression__Group__0 ) ) ;
    public final void ruleAdditiveExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:470:2: ( ( ( rule__AdditiveExpression__Group__0 ) ) )
            // InternalMSQLQueryParser.g:471:2: ( ( rule__AdditiveExpression__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:471:2: ( ( rule__AdditiveExpression__Group__0 ) )
            // InternalMSQLQueryParser.g:472:3: ( rule__AdditiveExpression__Group__0 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup()); 
            // InternalMSQLQueryParser.g:473:3: ( rule__AdditiveExpression__Group__0 )
            // InternalMSQLQueryParser.g:473:4: rule__AdditiveExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalMSQLQueryParser.g:482:1: entryRuleMultiplicativeExpression : ruleMultiplicativeExpression EOF ;
    public final void entryRuleMultiplicativeExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:483:1: ( ruleMultiplicativeExpression EOF )
            // InternalMSQLQueryParser.g:484:1: ruleMultiplicativeExpression EOF
            {
             before(grammarAccess.getMultiplicativeExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionRule()); 
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
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalMSQLQueryParser.g:491:1: ruleMultiplicativeExpression : ( ( rule__MultiplicativeExpression__Group__0 ) ) ;
    public final void ruleMultiplicativeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:495:2: ( ( ( rule__MultiplicativeExpression__Group__0 ) ) )
            // InternalMSQLQueryParser.g:496:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:496:2: ( ( rule__MultiplicativeExpression__Group__0 ) )
            // InternalMSQLQueryParser.g:497:3: ( rule__MultiplicativeExpression__Group__0 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 
            // InternalMSQLQueryParser.g:498:3: ( rule__MultiplicativeExpression__Group__0 )
            // InternalMSQLQueryParser.g:498:4: rule__MultiplicativeExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleAtomicExpression"
    // InternalMSQLQueryParser.g:507:1: entryRuleAtomicExpression : ruleAtomicExpression EOF ;
    public final void entryRuleAtomicExpression() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:508:1: ( ruleAtomicExpression EOF )
            // InternalMSQLQueryParser.g:509:1: ruleAtomicExpression EOF
            {
             before(grammarAccess.getAtomicExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomicExpression();

            state._fsp--;

             after(grammarAccess.getAtomicExpressionRule()); 
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
    // $ANTLR end "entryRuleAtomicExpression"


    // $ANTLR start "ruleAtomicExpression"
    // InternalMSQLQueryParser.g:516:1: ruleAtomicExpression : ( ( rule__AtomicExpression__Alternatives ) ) ;
    public final void ruleAtomicExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:520:2: ( ( ( rule__AtomicExpression__Alternatives ) ) )
            // InternalMSQLQueryParser.g:521:2: ( ( rule__AtomicExpression__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:521:2: ( ( rule__AtomicExpression__Alternatives ) )
            // InternalMSQLQueryParser.g:522:3: ( rule__AtomicExpression__Alternatives )
            {
             before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:523:3: ( rule__AtomicExpression__Alternatives )
            // InternalMSQLQueryParser.g:523:4: rule__AtomicExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomicExpression"


    // $ANTLR start "entryRuleTableReference"
    // InternalMSQLQueryParser.g:532:1: entryRuleTableReference : ruleTableReference EOF ;
    public final void entryRuleTableReference() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:533:1: ( ruleTableReference EOF )
            // InternalMSQLQueryParser.g:534:1: ruleTableReference EOF
            {
             before(grammarAccess.getTableReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleTableReference();

            state._fsp--;

             after(grammarAccess.getTableReferenceRule()); 
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
    // $ANTLR end "entryRuleTableReference"


    // $ANTLR start "ruleTableReference"
    // InternalMSQLQueryParser.g:541:1: ruleTableReference : ( ( rule__TableReference__TableAssignment ) ) ;
    public final void ruleTableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:545:2: ( ( ( rule__TableReference__TableAssignment ) ) )
            // InternalMSQLQueryParser.g:546:2: ( ( rule__TableReference__TableAssignment ) )
            {
            // InternalMSQLQueryParser.g:546:2: ( ( rule__TableReference__TableAssignment ) )
            // InternalMSQLQueryParser.g:547:3: ( rule__TableReference__TableAssignment )
            {
             before(grammarAccess.getTableReferenceAccess().getTableAssignment()); 
            // InternalMSQLQueryParser.g:548:3: ( rule__TableReference__TableAssignment )
            // InternalMSQLQueryParser.g:548:4: rule__TableReference__TableAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TableReference__TableAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTableReferenceAccess().getTableAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTableReference"


    // $ANTLR start "entryRuleColumnReference"
    // InternalMSQLQueryParser.g:557:1: entryRuleColumnReference : ruleColumnReference EOF ;
    public final void entryRuleColumnReference() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:558:1: ( ruleColumnReference EOF )
            // InternalMSQLQueryParser.g:559:1: ruleColumnReference EOF
            {
             before(grammarAccess.getColumnReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleColumnReference();

            state._fsp--;

             after(grammarAccess.getColumnReferenceRule()); 
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
    // $ANTLR end "entryRuleColumnReference"


    // $ANTLR start "ruleColumnReference"
    // InternalMSQLQueryParser.g:566:1: ruleColumnReference : ( ( rule__ColumnReference__ColumnAssignment ) ) ;
    public final void ruleColumnReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:570:2: ( ( ( rule__ColumnReference__ColumnAssignment ) ) )
            // InternalMSQLQueryParser.g:571:2: ( ( rule__ColumnReference__ColumnAssignment ) )
            {
            // InternalMSQLQueryParser.g:571:2: ( ( rule__ColumnReference__ColumnAssignment ) )
            // InternalMSQLQueryParser.g:572:3: ( rule__ColumnReference__ColumnAssignment )
            {
             before(grammarAccess.getColumnReferenceAccess().getColumnAssignment()); 
            // InternalMSQLQueryParser.g:573:3: ( rule__ColumnReference__ColumnAssignment )
            // InternalMSQLQueryParser.g:573:4: rule__ColumnReference__ColumnAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ColumnReference__ColumnAssignment();

            state._fsp--;


            }

             after(grammarAccess.getColumnReferenceAccess().getColumnAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnReference"


    // $ANTLR start "entryRuleLiteral"
    // InternalMSQLQueryParser.g:582:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:583:1: ( ruleLiteral EOF )
            // InternalMSQLQueryParser.g:584:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalMSQLQueryParser.g:591:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:595:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalMSQLQueryParser.g:596:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:596:2: ( ( rule__Literal__Alternatives ) )
            // InternalMSQLQueryParser.g:597:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:598:3: ( rule__Literal__Alternatives )
            // InternalMSQLQueryParser.g:598:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMSQLQueryParser.g:607:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:608:1: ( ruleStringLiteral EOF )
            // InternalMSQLQueryParser.g:609:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMSQLQueryParser.g:616:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:620:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalMSQLQueryParser.g:621:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalMSQLQueryParser.g:621:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalMSQLQueryParser.g:622:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalMSQLQueryParser.g:623:3: ( rule__StringLiteral__ValueAssignment )
            // InternalMSQLQueryParser.g:623:4: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalMSQLQueryParser.g:632:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:633:1: ( ruleIntegerLiteral EOF )
            // InternalMSQLQueryParser.g:634:1: ruleIntegerLiteral EOF
            {
             before(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralRule()); 
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
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalMSQLQueryParser.g:641:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__ValueAssignment ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:645:2: ( ( ( rule__IntegerLiteral__ValueAssignment ) ) )
            // InternalMSQLQueryParser.g:646:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            {
            // InternalMSQLQueryParser.g:646:2: ( ( rule__IntegerLiteral__ValueAssignment ) )
            // InternalMSQLQueryParser.g:647:3: ( rule__IntegerLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 
            // InternalMSQLQueryParser.g:648:3: ( rule__IntegerLiteral__ValueAssignment )
            // InternalMSQLQueryParser.g:648:4: rule__IntegerLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntegerLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntegerLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalMSQLQueryParser.g:657:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:658:1: ( ruleBooleanLiteral EOF )
            // InternalMSQLQueryParser.g:659:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalMSQLQueryParser.g:666:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:670:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // InternalMSQLQueryParser.g:671:2: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // InternalMSQLQueryParser.g:671:2: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // InternalMSQLQueryParser.g:672:3: ( rule__BooleanLiteral__ValueAssignment )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            // InternalMSQLQueryParser.g:673:3: ( rule__BooleanLiteral__ValueAssignment )
            // InternalMSQLQueryParser.g:673:4: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleIntegerType"
    // InternalMSQLQueryParser.g:682:1: entryRuleIntegerType : ruleIntegerType EOF ;
    public final void entryRuleIntegerType() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:683:1: ( ruleIntegerType EOF )
            // InternalMSQLQueryParser.g:684:1: ruleIntegerType EOF
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
    // InternalMSQLQueryParser.g:691:1: ruleIntegerType : ( ( rule__IntegerType__Group__0 ) ) ;
    public final void ruleIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:695:2: ( ( ( rule__IntegerType__Group__0 ) ) )
            // InternalMSQLQueryParser.g:696:2: ( ( rule__IntegerType__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:696:2: ( ( rule__IntegerType__Group__0 ) )
            // InternalMSQLQueryParser.g:697:3: ( rule__IntegerType__Group__0 )
            {
             before(grammarAccess.getIntegerTypeAccess().getGroup()); 
            // InternalMSQLQueryParser.g:698:3: ( rule__IntegerType__Group__0 )
            // InternalMSQLQueryParser.g:698:4: rule__IntegerType__Group__0
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
    // InternalMSQLQueryParser.g:707:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:708:1: ( ruleStringType EOF )
            // InternalMSQLQueryParser.g:709:1: ruleStringType EOF
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
    // InternalMSQLQueryParser.g:716:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:720:2: ( ( ( rule__StringType__Group__0 ) ) )
            // InternalMSQLQueryParser.g:721:2: ( ( rule__StringType__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:721:2: ( ( rule__StringType__Group__0 ) )
            // InternalMSQLQueryParser.g:722:3: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // InternalMSQLQueryParser.g:723:3: ( rule__StringType__Group__0 )
            // InternalMSQLQueryParser.g:723:4: rule__StringType__Group__0
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
    // InternalMSQLQueryParser.g:732:1: entryRuleBooleanType : ruleBooleanType EOF ;
    public final void entryRuleBooleanType() throws RecognitionException {
        try {
            // InternalMSQLQueryParser.g:733:1: ( ruleBooleanType EOF )
            // InternalMSQLQueryParser.g:734:1: ruleBooleanType EOF
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
    // InternalMSQLQueryParser.g:741:1: ruleBooleanType : ( ( rule__BooleanType__Group__0 ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:745:2: ( ( ( rule__BooleanType__Group__0 ) ) )
            // InternalMSQLQueryParser.g:746:2: ( ( rule__BooleanType__Group__0 ) )
            {
            // InternalMSQLQueryParser.g:746:2: ( ( rule__BooleanType__Group__0 ) )
            // InternalMSQLQueryParser.g:747:3: ( rule__BooleanType__Group__0 )
            {
             before(grammarAccess.getBooleanTypeAccess().getGroup()); 
            // InternalMSQLQueryParser.g:748:3: ( rule__BooleanType__Group__0 )
            // InternalMSQLQueryParser.g:748:4: rule__BooleanType__Group__0
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


    // $ANTLR start "ruleOrderDirection"
    // InternalMSQLQueryParser.g:757:1: ruleOrderDirection : ( ( rule__OrderDirection__Alternatives ) ) ;
    public final void ruleOrderDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:761:1: ( ( ( rule__OrderDirection__Alternatives ) ) )
            // InternalMSQLQueryParser.g:762:2: ( ( rule__OrderDirection__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:762:2: ( ( rule__OrderDirection__Alternatives ) )
            // InternalMSQLQueryParser.g:763:3: ( rule__OrderDirection__Alternatives )
            {
             before(grammarAccess.getOrderDirectionAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:764:3: ( rule__OrderDirection__Alternatives )
            // InternalMSQLQueryParser.g:764:4: rule__OrderDirection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OrderDirection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrderDirectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrderDirection"


    // $ANTLR start "ruleOrOperator"
    // InternalMSQLQueryParser.g:773:1: ruleOrOperator : ( ( OR ) ) ;
    public final void ruleOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:777:1: ( ( ( OR ) ) )
            // InternalMSQLQueryParser.g:778:2: ( ( OR ) )
            {
            // InternalMSQLQueryParser.g:778:2: ( ( OR ) )
            // InternalMSQLQueryParser.g:779:3: ( OR )
            {
             before(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 
            // InternalMSQLQueryParser.g:780:3: ( OR )
            // InternalMSQLQueryParser.g:780:4: OR
            {
            match(input,OR,FOLLOW_2); 

            }

             after(grammarAccess.getOrOperatorAccess().getOREnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "ruleAndOperator"
    // InternalMSQLQueryParser.g:789:1: ruleAndOperator : ( ( AND ) ) ;
    public final void ruleAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:793:1: ( ( ( AND ) ) )
            // InternalMSQLQueryParser.g:794:2: ( ( AND ) )
            {
            // InternalMSQLQueryParser.g:794:2: ( ( AND ) )
            // InternalMSQLQueryParser.g:795:3: ( AND )
            {
             before(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            // InternalMSQLQueryParser.g:796:3: ( AND )
            // InternalMSQLQueryParser.g:796:4: AND
            {
            match(input,AND,FOLLOW_2); 

            }

             after(grammarAccess.getAndOperatorAccess().getANDEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "ruleNotOperator"
    // InternalMSQLQueryParser.g:805:1: ruleNotOperator : ( ( NOT ) ) ;
    public final void ruleNotOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:809:1: ( ( ( NOT ) ) )
            // InternalMSQLQueryParser.g:810:2: ( ( NOT ) )
            {
            // InternalMSQLQueryParser.g:810:2: ( ( NOT ) )
            // InternalMSQLQueryParser.g:811:3: ( NOT )
            {
             before(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 
            // InternalMSQLQueryParser.g:812:3: ( NOT )
            // InternalMSQLQueryParser.g:812:4: NOT
            {
            match(input,NOT,FOLLOW_2); 

            }

             after(grammarAccess.getNotOperatorAccess().getNOTEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "ruleComparativeOperator"
    // InternalMSQLQueryParser.g:821:1: ruleComparativeOperator : ( ( rule__ComparativeOperator__Alternatives ) ) ;
    public final void ruleComparativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:825:1: ( ( ( rule__ComparativeOperator__Alternatives ) ) )
            // InternalMSQLQueryParser.g:826:2: ( ( rule__ComparativeOperator__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:826:2: ( ( rule__ComparativeOperator__Alternatives ) )
            // InternalMSQLQueryParser.g:827:3: ( rule__ComparativeOperator__Alternatives )
            {
             before(grammarAccess.getComparativeOperatorAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:828:3: ( rule__ComparativeOperator__Alternatives )
            // InternalMSQLQueryParser.g:828:4: rule__ComparativeOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparativeOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparativeOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // InternalMSQLQueryParser.g:837:1: ruleAdditiveOperator : ( ( rule__AdditiveOperator__Alternatives ) ) ;
    public final void ruleAdditiveOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:841:1: ( ( ( rule__AdditiveOperator__Alternatives ) ) )
            // InternalMSQLQueryParser.g:842:2: ( ( rule__AdditiveOperator__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:842:2: ( ( rule__AdditiveOperator__Alternatives ) )
            // InternalMSQLQueryParser.g:843:3: ( rule__AdditiveOperator__Alternatives )
            {
             before(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:844:3: ( rule__AdditiveOperator__Alternatives )
            // InternalMSQLQueryParser.g:844:4: rule__AdditiveOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // InternalMSQLQueryParser.g:853:1: ruleMultiplicativeOperator : ( ( rule__MultiplicativeOperator__Alternatives ) ) ;
    public final void ruleMultiplicativeOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:857:1: ( ( ( rule__MultiplicativeOperator__Alternatives ) ) )
            // InternalMSQLQueryParser.g:858:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            {
            // InternalMSQLQueryParser.g:858:2: ( ( rule__MultiplicativeOperator__Alternatives ) )
            // InternalMSQLQueryParser.g:859:3: ( rule__MultiplicativeOperator__Alternatives )
            {
             before(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 
            // InternalMSQLQueryParser.g:860:3: ( rule__MultiplicativeOperator__Alternatives )
            // InternalMSQLQueryParser.g:860:4: rule__MultiplicativeOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "rule__WhatDirective__Alternatives"
    // InternalMSQLQueryParser.g:868:1: rule__WhatDirective__Alternatives : ( ( ruleAllColumnsWhatDirective ) | ( ruleSingleColumnWhatDirective ) );
    public final void rule__WhatDirective__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:872:1: ( ( ruleAllColumnsWhatDirective ) | ( ruleSingleColumnWhatDirective ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Asterisk) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMSQLQueryParser.g:873:2: ( ruleAllColumnsWhatDirective )
                    {
                    // InternalMSQLQueryParser.g:873:2: ( ruleAllColumnsWhatDirective )
                    // InternalMSQLQueryParser.g:874:3: ruleAllColumnsWhatDirective
                    {
                     before(grammarAccess.getWhatDirectiveAccess().getAllColumnsWhatDirectiveParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAllColumnsWhatDirective();

                    state._fsp--;

                     after(grammarAccess.getWhatDirectiveAccess().getAllColumnsWhatDirectiveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:879:2: ( ruleSingleColumnWhatDirective )
                    {
                    // InternalMSQLQueryParser.g:879:2: ( ruleSingleColumnWhatDirective )
                    // InternalMSQLQueryParser.g:880:3: ruleSingleColumnWhatDirective
                    {
                     before(grammarAccess.getWhatDirectiveAccess().getSingleColumnWhatDirectiveParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSingleColumnWhatDirective();

                    state._fsp--;

                     after(grammarAccess.getWhatDirectiveAccess().getSingleColumnWhatDirectiveParserRuleCall_1()); 

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
    // $ANTLR end "rule__WhatDirective__Alternatives"


    // $ANTLR start "rule__AndOperand__Alternatives"
    // InternalMSQLQueryParser.g:889:1: rule__AndOperand__Alternatives : ( ( ruleNotExpression ) | ( ruleComparativeExpression ) );
    public final void rule__AndOperand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:893:1: ( ( ruleNotExpression ) | ( ruleComparativeExpression ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==NOT) ) {
                alt2=1;
            }
            else if ( (LA2_0==LeftParenthesis||(LA2_0>=RULE_BOOL && LA2_0<=RULE_STRING)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMSQLQueryParser.g:894:2: ( ruleNotExpression )
                    {
                    // InternalMSQLQueryParser.g:894:2: ( ruleNotExpression )
                    // InternalMSQLQueryParser.g:895:3: ruleNotExpression
                    {
                     before(grammarAccess.getAndOperandAccess().getNotExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNotExpression();

                    state._fsp--;

                     after(grammarAccess.getAndOperandAccess().getNotExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:900:2: ( ruleComparativeExpression )
                    {
                    // InternalMSQLQueryParser.g:900:2: ( ruleComparativeExpression )
                    // InternalMSQLQueryParser.g:901:3: ruleComparativeExpression
                    {
                     before(grammarAccess.getAndOperandAccess().getComparativeExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComparativeExpression();

                    state._fsp--;

                     after(grammarAccess.getAndOperandAccess().getComparativeExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__AndOperand__Alternatives"


    // $ANTLR start "rule__AtomicExpression__Alternatives"
    // InternalMSQLQueryParser.g:910:1: rule__AtomicExpression__Alternatives : ( ( ( rule__AtomicExpression__Group_0__0 ) ) | ( ruleColumnReference ) | ( ruleLiteral ) );
    public final void rule__AtomicExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:914:1: ( ( ( rule__AtomicExpression__Group_0__0 ) ) | ( ruleColumnReference ) | ( ruleLiteral ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case LeftParenthesis:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case RULE_BOOL:
            case RULE_INT:
            case RULE_STRING:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMSQLQueryParser.g:915:2: ( ( rule__AtomicExpression__Group_0__0 ) )
                    {
                    // InternalMSQLQueryParser.g:915:2: ( ( rule__AtomicExpression__Group_0__0 ) )
                    // InternalMSQLQueryParser.g:916:3: ( rule__AtomicExpression__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getGroup_0()); 
                    // InternalMSQLQueryParser.g:917:3: ( rule__AtomicExpression__Group_0__0 )
                    // InternalMSQLQueryParser.g:917:4: rule__AtomicExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:921:2: ( ruleColumnReference )
                    {
                    // InternalMSQLQueryParser.g:921:2: ( ruleColumnReference )
                    // InternalMSQLQueryParser.g:922:3: ruleColumnReference
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getColumnReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleColumnReference();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getColumnReferenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMSQLQueryParser.g:927:2: ( ruleLiteral )
                    {
                    // InternalMSQLQueryParser.g:927:2: ( ruleLiteral )
                    // InternalMSQLQueryParser.g:928:3: ruleLiteral
                    {
                     before(grammarAccess.getAtomicExpressionAccess().getLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getAtomicExpressionAccess().getLiteralParserRuleCall_2()); 

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
    // $ANTLR end "rule__AtomicExpression__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalMSQLQueryParser.g:937:1: rule__Literal__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntegerLiteral ) | ( ruleBooleanLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:941:1: ( ( ruleStringLiteral ) | ( ruleIntegerLiteral ) | ( ruleBooleanLiteral ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt4=1;
                }
                break;
            case RULE_INT:
                {
                alt4=2;
                }
                break;
            case RULE_BOOL:
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
                    // InternalMSQLQueryParser.g:942:2: ( ruleStringLiteral )
                    {
                    // InternalMSQLQueryParser.g:942:2: ( ruleStringLiteral )
                    // InternalMSQLQueryParser.g:943:3: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:948:2: ( ruleIntegerLiteral )
                    {
                    // InternalMSQLQueryParser.g:948:2: ( ruleIntegerLiteral )
                    // InternalMSQLQueryParser.g:949:3: ruleIntegerLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMSQLQueryParser.g:954:2: ( ruleBooleanLiteral )
                    {
                    // InternalMSQLQueryParser.g:954:2: ( ruleBooleanLiteral )
                    // InternalMSQLQueryParser.g:955:3: ruleBooleanLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_2()); 

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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__OrderDirection__Alternatives"
    // InternalMSQLQueryParser.g:964:1: rule__OrderDirection__Alternatives : ( ( ( ASC ) ) | ( ( DESC ) ) );
    public final void rule__OrderDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:968:1: ( ( ( ASC ) ) | ( ( DESC ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ASC) ) {
                alt5=1;
            }
            else if ( (LA5_0==DESC) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMSQLQueryParser.g:969:2: ( ( ASC ) )
                    {
                    // InternalMSQLQueryParser.g:969:2: ( ( ASC ) )
                    // InternalMSQLQueryParser.g:970:3: ( ASC )
                    {
                     before(grammarAccess.getOrderDirectionAccess().getASCENDINGEnumLiteralDeclaration_0()); 
                    // InternalMSQLQueryParser.g:971:3: ( ASC )
                    // InternalMSQLQueryParser.g:971:4: ASC
                    {
                    match(input,ASC,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrderDirectionAccess().getASCENDINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:975:2: ( ( DESC ) )
                    {
                    // InternalMSQLQueryParser.g:975:2: ( ( DESC ) )
                    // InternalMSQLQueryParser.g:976:3: ( DESC )
                    {
                     before(grammarAccess.getOrderDirectionAccess().getDESCENDINGEnumLiteralDeclaration_1()); 
                    // InternalMSQLQueryParser.g:977:3: ( DESC )
                    // InternalMSQLQueryParser.g:977:4: DESC
                    {
                    match(input,DESC,FOLLOW_2); 

                    }

                     after(grammarAccess.getOrderDirectionAccess().getDESCENDINGEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__OrderDirection__Alternatives"


    // $ANTLR start "rule__ComparativeOperator__Alternatives"
    // InternalMSQLQueryParser.g:985:1: rule__ComparativeOperator__Alternatives : ( ( ( LessThanSignEqualsSign ) ) | ( ( LessThanSign ) ) | ( ( EqualsSign ) ) | ( ( ExclamationMarkEqualsSign ) ) | ( ( GreaterThanSign ) ) | ( ( GreaterThanSignEqualsSign ) ) );
    public final void rule__ComparativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:989:1: ( ( ( LessThanSignEqualsSign ) ) | ( ( LessThanSign ) ) | ( ( EqualsSign ) ) | ( ( ExclamationMarkEqualsSign ) ) | ( ( GreaterThanSign ) ) | ( ( GreaterThanSignEqualsSign ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case LessThanSignEqualsSign:
                {
                alt6=1;
                }
                break;
            case LessThanSign:
                {
                alt6=2;
                }
                break;
            case EqualsSign:
                {
                alt6=3;
                }
                break;
            case ExclamationMarkEqualsSign:
                {
                alt6=4;
                }
                break;
            case GreaterThanSign:
                {
                alt6=5;
                }
                break;
            case GreaterThanSignEqualsSign:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMSQLQueryParser.g:990:2: ( ( LessThanSignEqualsSign ) )
                    {
                    // InternalMSQLQueryParser.g:990:2: ( ( LessThanSignEqualsSign ) )
                    // InternalMSQLQueryParser.g:991:3: ( LessThanSignEqualsSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getLESS_THAN_OR_EQUALEnumLiteralDeclaration_0()); 
                    // InternalMSQLQueryParser.g:992:3: ( LessThanSignEqualsSign )
                    // InternalMSQLQueryParser.g:992:4: LessThanSignEqualsSign
                    {
                    match(input,LessThanSignEqualsSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getLESS_THAN_OR_EQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:996:2: ( ( LessThanSign ) )
                    {
                    // InternalMSQLQueryParser.g:996:2: ( ( LessThanSign ) )
                    // InternalMSQLQueryParser.g:997:3: ( LessThanSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getLESS_THANEnumLiteralDeclaration_1()); 
                    // InternalMSQLQueryParser.g:998:3: ( LessThanSign )
                    // InternalMSQLQueryParser.g:998:4: LessThanSign
                    {
                    match(input,LessThanSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getLESS_THANEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMSQLQueryParser.g:1002:2: ( ( EqualsSign ) )
                    {
                    // InternalMSQLQueryParser.g:1002:2: ( ( EqualsSign ) )
                    // InternalMSQLQueryParser.g:1003:3: ( EqualsSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getEQUALEnumLiteralDeclaration_2()); 
                    // InternalMSQLQueryParser.g:1004:3: ( EqualsSign )
                    // InternalMSQLQueryParser.g:1004:4: EqualsSign
                    {
                    match(input,EqualsSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getEQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMSQLQueryParser.g:1008:2: ( ( ExclamationMarkEqualsSign ) )
                    {
                    // InternalMSQLQueryParser.g:1008:2: ( ( ExclamationMarkEqualsSign ) )
                    // InternalMSQLQueryParser.g:1009:3: ( ExclamationMarkEqualsSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_3()); 
                    // InternalMSQLQueryParser.g:1010:3: ( ExclamationMarkEqualsSign )
                    // InternalMSQLQueryParser.g:1010:4: ExclamationMarkEqualsSign
                    {
                    match(input,ExclamationMarkEqualsSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMSQLQueryParser.g:1014:2: ( ( GreaterThanSign ) )
                    {
                    // InternalMSQLQueryParser.g:1014:2: ( ( GreaterThanSign ) )
                    // InternalMSQLQueryParser.g:1015:3: ( GreaterThanSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getGREATER_THANEnumLiteralDeclaration_4()); 
                    // InternalMSQLQueryParser.g:1016:3: ( GreaterThanSign )
                    // InternalMSQLQueryParser.g:1016:4: GreaterThanSign
                    {
                    match(input,GreaterThanSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getGREATER_THANEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMSQLQueryParser.g:1020:2: ( ( GreaterThanSignEqualsSign ) )
                    {
                    // InternalMSQLQueryParser.g:1020:2: ( ( GreaterThanSignEqualsSign ) )
                    // InternalMSQLQueryParser.g:1021:3: ( GreaterThanSignEqualsSign )
                    {
                     before(grammarAccess.getComparativeOperatorAccess().getGREATER_THAN_OR_EQUALEnumLiteralDeclaration_5()); 
                    // InternalMSQLQueryParser.g:1022:3: ( GreaterThanSignEqualsSign )
                    // InternalMSQLQueryParser.g:1022:4: GreaterThanSignEqualsSign
                    {
                    match(input,GreaterThanSignEqualsSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparativeOperatorAccess().getGREATER_THAN_OR_EQUALEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__ComparativeOperator__Alternatives"


    // $ANTLR start "rule__AdditiveOperator__Alternatives"
    // InternalMSQLQueryParser.g:1030:1: rule__AdditiveOperator__Alternatives : ( ( ( PlusSign ) ) | ( ( HyphenMinus ) ) );
    public final void rule__AdditiveOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1034:1: ( ( ( PlusSign ) ) | ( ( HyphenMinus ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==PlusSign) ) {
                alt7=1;
            }
            else if ( (LA7_0==HyphenMinus) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMSQLQueryParser.g:1035:2: ( ( PlusSign ) )
                    {
                    // InternalMSQLQueryParser.g:1035:2: ( ( PlusSign ) )
                    // InternalMSQLQueryParser.g:1036:3: ( PlusSign )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 
                    // InternalMSQLQueryParser.g:1037:3: ( PlusSign )
                    // InternalMSQLQueryParser.g:1037:4: PlusSign
                    {
                    match(input,PlusSign,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditiveOperatorAccess().getADDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:1041:2: ( ( HyphenMinus ) )
                    {
                    // InternalMSQLQueryParser.g:1041:2: ( ( HyphenMinus ) )
                    // InternalMSQLQueryParser.g:1042:3: ( HyphenMinus )
                    {
                     before(grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1()); 
                    // InternalMSQLQueryParser.g:1043:3: ( HyphenMinus )
                    // InternalMSQLQueryParser.g:1043:4: HyphenMinus
                    {
                    match(input,HyphenMinus,FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditiveOperatorAccess().getSUBTRACTEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__AdditiveOperator__Alternatives"


    // $ANTLR start "rule__MultiplicativeOperator__Alternatives"
    // InternalMSQLQueryParser.g:1051:1: rule__MultiplicativeOperator__Alternatives : ( ( ( Asterisk ) ) | ( ( Solidus ) ) );
    public final void rule__MultiplicativeOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1055:1: ( ( ( Asterisk ) ) | ( ( Solidus ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Asterisk) ) {
                alt8=1;
            }
            else if ( (LA8_0==Solidus) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMSQLQueryParser.g:1056:2: ( ( Asterisk ) )
                    {
                    // InternalMSQLQueryParser.g:1056:2: ( ( Asterisk ) )
                    // InternalMSQLQueryParser.g:1057:3: ( Asterisk )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 
                    // InternalMSQLQueryParser.g:1058:3: ( Asterisk )
                    // InternalMSQLQueryParser.g:1058:4: Asterisk
                    {
                    match(input,Asterisk,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getMULTIPLYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMSQLQueryParser.g:1062:2: ( ( Solidus ) )
                    {
                    // InternalMSQLQueryParser.g:1062:2: ( ( Solidus ) )
                    // InternalMSQLQueryParser.g:1063:3: ( Solidus )
                    {
                     before(grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                    // InternalMSQLQueryParser.g:1064:3: ( Solidus )
                    // InternalMSQLQueryParser.g:1064:4: Solidus
                    {
                    match(input,Solidus,FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicativeOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__MultiplicativeOperator__Alternatives"


    // $ANTLR start "rule__SelectQuery__Group__0"
    // InternalMSQLQueryParser.g:1072:1: rule__SelectQuery__Group__0 : rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1 ;
    public final void rule__SelectQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1076:1: ( rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1 )
            // InternalMSQLQueryParser.g:1077:2: rule__SelectQuery__Group__0__Impl rule__SelectQuery__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SelectQuery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectQuery__Group__1();

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
    // $ANTLR end "rule__SelectQuery__Group__0"


    // $ANTLR start "rule__SelectQuery__Group__0__Impl"
    // InternalMSQLQueryParser.g:1084:1: rule__SelectQuery__Group__0__Impl : ( SELECT ) ;
    public final void rule__SelectQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1088:1: ( ( SELECT ) )
            // InternalMSQLQueryParser.g:1089:1: ( SELECT )
            {
            // InternalMSQLQueryParser.g:1089:1: ( SELECT )
            // InternalMSQLQueryParser.g:1090:2: SELECT
            {
             before(grammarAccess.getSelectQueryAccess().getSELECTKeyword_0()); 
            match(input,SELECT,FOLLOW_2); 
             after(grammarAccess.getSelectQueryAccess().getSELECTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__Group__0__Impl"


    // $ANTLR start "rule__SelectQuery__Group__1"
    // InternalMSQLQueryParser.g:1099:1: rule__SelectQuery__Group__1 : rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2 ;
    public final void rule__SelectQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1103:1: ( rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2 )
            // InternalMSQLQueryParser.g:1104:2: rule__SelectQuery__Group__1__Impl rule__SelectQuery__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SelectQuery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectQuery__Group__2();

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
    // $ANTLR end "rule__SelectQuery__Group__1"


    // $ANTLR start "rule__SelectQuery__Group__1__Impl"
    // InternalMSQLQueryParser.g:1111:1: rule__SelectQuery__Group__1__Impl : ( ( rule__SelectQuery__WhatClauseAssignment_1 ) ) ;
    public final void rule__SelectQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1115:1: ( ( ( rule__SelectQuery__WhatClauseAssignment_1 ) ) )
            // InternalMSQLQueryParser.g:1116:1: ( ( rule__SelectQuery__WhatClauseAssignment_1 ) )
            {
            // InternalMSQLQueryParser.g:1116:1: ( ( rule__SelectQuery__WhatClauseAssignment_1 ) )
            // InternalMSQLQueryParser.g:1117:2: ( rule__SelectQuery__WhatClauseAssignment_1 )
            {
             before(grammarAccess.getSelectQueryAccess().getWhatClauseAssignment_1()); 
            // InternalMSQLQueryParser.g:1118:2: ( rule__SelectQuery__WhatClauseAssignment_1 )
            // InternalMSQLQueryParser.g:1118:3: rule__SelectQuery__WhatClauseAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectQuery__WhatClauseAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectQueryAccess().getWhatClauseAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__Group__1__Impl"


    // $ANTLR start "rule__SelectQuery__Group__2"
    // InternalMSQLQueryParser.g:1126:1: rule__SelectQuery__Group__2 : rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3 ;
    public final void rule__SelectQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1130:1: ( rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3 )
            // InternalMSQLQueryParser.g:1131:2: rule__SelectQuery__Group__2__Impl rule__SelectQuery__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SelectQuery__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectQuery__Group__3();

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
    // $ANTLR end "rule__SelectQuery__Group__2"


    // $ANTLR start "rule__SelectQuery__Group__2__Impl"
    // InternalMSQLQueryParser.g:1138:1: rule__SelectQuery__Group__2__Impl : ( ( rule__SelectQuery__FromClauseAssignment_2 ) ) ;
    public final void rule__SelectQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1142:1: ( ( ( rule__SelectQuery__FromClauseAssignment_2 ) ) )
            // InternalMSQLQueryParser.g:1143:1: ( ( rule__SelectQuery__FromClauseAssignment_2 ) )
            {
            // InternalMSQLQueryParser.g:1143:1: ( ( rule__SelectQuery__FromClauseAssignment_2 ) )
            // InternalMSQLQueryParser.g:1144:2: ( rule__SelectQuery__FromClauseAssignment_2 )
            {
             before(grammarAccess.getSelectQueryAccess().getFromClauseAssignment_2()); 
            // InternalMSQLQueryParser.g:1145:2: ( rule__SelectQuery__FromClauseAssignment_2 )
            // InternalMSQLQueryParser.g:1145:3: rule__SelectQuery__FromClauseAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SelectQuery__FromClauseAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectQueryAccess().getFromClauseAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__Group__2__Impl"


    // $ANTLR start "rule__SelectQuery__Group__3"
    // InternalMSQLQueryParser.g:1153:1: rule__SelectQuery__Group__3 : rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4 ;
    public final void rule__SelectQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1157:1: ( rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4 )
            // InternalMSQLQueryParser.g:1158:2: rule__SelectQuery__Group__3__Impl rule__SelectQuery__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__SelectQuery__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectQuery__Group__4();

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
    // $ANTLR end "rule__SelectQuery__Group__3"


    // $ANTLR start "rule__SelectQuery__Group__3__Impl"
    // InternalMSQLQueryParser.g:1165:1: rule__SelectQuery__Group__3__Impl : ( ( rule__SelectQuery__WhereClauseAssignment_3 )? ) ;
    public final void rule__SelectQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1169:1: ( ( ( rule__SelectQuery__WhereClauseAssignment_3 )? ) )
            // InternalMSQLQueryParser.g:1170:1: ( ( rule__SelectQuery__WhereClauseAssignment_3 )? )
            {
            // InternalMSQLQueryParser.g:1170:1: ( ( rule__SelectQuery__WhereClauseAssignment_3 )? )
            // InternalMSQLQueryParser.g:1171:2: ( rule__SelectQuery__WhereClauseAssignment_3 )?
            {
             before(grammarAccess.getSelectQueryAccess().getWhereClauseAssignment_3()); 
            // InternalMSQLQueryParser.g:1172:2: ( rule__SelectQuery__WhereClauseAssignment_3 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==WHERE) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMSQLQueryParser.g:1172:3: rule__SelectQuery__WhereClauseAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectQuery__WhereClauseAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectQueryAccess().getWhereClauseAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__Group__3__Impl"


    // $ANTLR start "rule__SelectQuery__Group__4"
    // InternalMSQLQueryParser.g:1180:1: rule__SelectQuery__Group__4 : rule__SelectQuery__Group__4__Impl rule__SelectQuery__Group__5 ;
    public final void rule__SelectQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1184:1: ( rule__SelectQuery__Group__4__Impl rule__SelectQuery__Group__5 )
            // InternalMSQLQueryParser.g:1185:2: rule__SelectQuery__Group__4__Impl rule__SelectQuery__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__SelectQuery__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectQuery__Group__5();

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
    // $ANTLR end "rule__SelectQuery__Group__4"


    // $ANTLR start "rule__SelectQuery__Group__4__Impl"
    // InternalMSQLQueryParser.g:1192:1: rule__SelectQuery__Group__4__Impl : ( ( rule__SelectQuery__OrderByClauseAssignment_4 )? ) ;
    public final void rule__SelectQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1196:1: ( ( ( rule__SelectQuery__OrderByClauseAssignment_4 )? ) )
            // InternalMSQLQueryParser.g:1197:1: ( ( rule__SelectQuery__OrderByClauseAssignment_4 )? )
            {
            // InternalMSQLQueryParser.g:1197:1: ( ( rule__SelectQuery__OrderByClauseAssignment_4 )? )
            // InternalMSQLQueryParser.g:1198:2: ( rule__SelectQuery__OrderByClauseAssignment_4 )?
            {
             before(grammarAccess.getSelectQueryAccess().getOrderByClauseAssignment_4()); 
            // InternalMSQLQueryParser.g:1199:2: ( rule__SelectQuery__OrderByClauseAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ORDER) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMSQLQueryParser.g:1199:3: rule__SelectQuery__OrderByClauseAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectQuery__OrderByClauseAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectQueryAccess().getOrderByClauseAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__Group__4__Impl"


    // $ANTLR start "rule__SelectQuery__Group__5"
    // InternalMSQLQueryParser.g:1207:1: rule__SelectQuery__Group__5 : rule__SelectQuery__Group__5__Impl ;
    public final void rule__SelectQuery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1211:1: ( rule__SelectQuery__Group__5__Impl )
            // InternalMSQLQueryParser.g:1212:2: rule__SelectQuery__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectQuery__Group__5__Impl();

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
    // $ANTLR end "rule__SelectQuery__Group__5"


    // $ANTLR start "rule__SelectQuery__Group__5__Impl"
    // InternalMSQLQueryParser.g:1218:1: rule__SelectQuery__Group__5__Impl : ( Semicolon ) ;
    public final void rule__SelectQuery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1222:1: ( ( Semicolon ) )
            // InternalMSQLQueryParser.g:1223:1: ( Semicolon )
            {
            // InternalMSQLQueryParser.g:1223:1: ( Semicolon )
            // InternalMSQLQueryParser.g:1224:2: Semicolon
            {
             before(grammarAccess.getSelectQueryAccess().getSemicolonKeyword_5()); 
            match(input,Semicolon,FOLLOW_2); 
             after(grammarAccess.getSelectQueryAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__Group__5__Impl"


    // $ANTLR start "rule__WhatClause__Group__0"
    // InternalMSQLQueryParser.g:1234:1: rule__WhatClause__Group__0 : rule__WhatClause__Group__0__Impl rule__WhatClause__Group__1 ;
    public final void rule__WhatClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1238:1: ( rule__WhatClause__Group__0__Impl rule__WhatClause__Group__1 )
            // InternalMSQLQueryParser.g:1239:2: rule__WhatClause__Group__0__Impl rule__WhatClause__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__WhatClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhatClause__Group__1();

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
    // $ANTLR end "rule__WhatClause__Group__0"


    // $ANTLR start "rule__WhatClause__Group__0__Impl"
    // InternalMSQLQueryParser.g:1246:1: rule__WhatClause__Group__0__Impl : ( ( rule__WhatClause__WhatDirectivesAssignment_0 ) ) ;
    public final void rule__WhatClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1250:1: ( ( ( rule__WhatClause__WhatDirectivesAssignment_0 ) ) )
            // InternalMSQLQueryParser.g:1251:1: ( ( rule__WhatClause__WhatDirectivesAssignment_0 ) )
            {
            // InternalMSQLQueryParser.g:1251:1: ( ( rule__WhatClause__WhatDirectivesAssignment_0 ) )
            // InternalMSQLQueryParser.g:1252:2: ( rule__WhatClause__WhatDirectivesAssignment_0 )
            {
             before(grammarAccess.getWhatClauseAccess().getWhatDirectivesAssignment_0()); 
            // InternalMSQLQueryParser.g:1253:2: ( rule__WhatClause__WhatDirectivesAssignment_0 )
            // InternalMSQLQueryParser.g:1253:3: rule__WhatClause__WhatDirectivesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__WhatClause__WhatDirectivesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWhatClauseAccess().getWhatDirectivesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatClause__Group__0__Impl"


    // $ANTLR start "rule__WhatClause__Group__1"
    // InternalMSQLQueryParser.g:1261:1: rule__WhatClause__Group__1 : rule__WhatClause__Group__1__Impl ;
    public final void rule__WhatClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1265:1: ( rule__WhatClause__Group__1__Impl )
            // InternalMSQLQueryParser.g:1266:2: rule__WhatClause__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhatClause__Group__1__Impl();

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
    // $ANTLR end "rule__WhatClause__Group__1"


    // $ANTLR start "rule__WhatClause__Group__1__Impl"
    // InternalMSQLQueryParser.g:1272:1: rule__WhatClause__Group__1__Impl : ( ( rule__WhatClause__Group_1__0 )* ) ;
    public final void rule__WhatClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1276:1: ( ( ( rule__WhatClause__Group_1__0 )* ) )
            // InternalMSQLQueryParser.g:1277:1: ( ( rule__WhatClause__Group_1__0 )* )
            {
            // InternalMSQLQueryParser.g:1277:1: ( ( rule__WhatClause__Group_1__0 )* )
            // InternalMSQLQueryParser.g:1278:2: ( rule__WhatClause__Group_1__0 )*
            {
             before(grammarAccess.getWhatClauseAccess().getGroup_1()); 
            // InternalMSQLQueryParser.g:1279:2: ( rule__WhatClause__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Comma) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:1279:3: rule__WhatClause__Group_1__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__WhatClause__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getWhatClauseAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatClause__Group__1__Impl"


    // $ANTLR start "rule__WhatClause__Group_1__0"
    // InternalMSQLQueryParser.g:1288:1: rule__WhatClause__Group_1__0 : rule__WhatClause__Group_1__0__Impl rule__WhatClause__Group_1__1 ;
    public final void rule__WhatClause__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1292:1: ( rule__WhatClause__Group_1__0__Impl rule__WhatClause__Group_1__1 )
            // InternalMSQLQueryParser.g:1293:2: rule__WhatClause__Group_1__0__Impl rule__WhatClause__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__WhatClause__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhatClause__Group_1__1();

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
    // $ANTLR end "rule__WhatClause__Group_1__0"


    // $ANTLR start "rule__WhatClause__Group_1__0__Impl"
    // InternalMSQLQueryParser.g:1300:1: rule__WhatClause__Group_1__0__Impl : ( Comma ) ;
    public final void rule__WhatClause__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1304:1: ( ( Comma ) )
            // InternalMSQLQueryParser.g:1305:1: ( Comma )
            {
            // InternalMSQLQueryParser.g:1305:1: ( Comma )
            // InternalMSQLQueryParser.g:1306:2: Comma
            {
             before(grammarAccess.getWhatClauseAccess().getCommaKeyword_1_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getWhatClauseAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatClause__Group_1__0__Impl"


    // $ANTLR start "rule__WhatClause__Group_1__1"
    // InternalMSQLQueryParser.g:1315:1: rule__WhatClause__Group_1__1 : rule__WhatClause__Group_1__1__Impl ;
    public final void rule__WhatClause__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1319:1: ( rule__WhatClause__Group_1__1__Impl )
            // InternalMSQLQueryParser.g:1320:2: rule__WhatClause__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhatClause__Group_1__1__Impl();

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
    // $ANTLR end "rule__WhatClause__Group_1__1"


    // $ANTLR start "rule__WhatClause__Group_1__1__Impl"
    // InternalMSQLQueryParser.g:1326:1: rule__WhatClause__Group_1__1__Impl : ( ( rule__WhatClause__WhatDirectivesAssignment_1_1 ) ) ;
    public final void rule__WhatClause__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1330:1: ( ( ( rule__WhatClause__WhatDirectivesAssignment_1_1 ) ) )
            // InternalMSQLQueryParser.g:1331:1: ( ( rule__WhatClause__WhatDirectivesAssignment_1_1 ) )
            {
            // InternalMSQLQueryParser.g:1331:1: ( ( rule__WhatClause__WhatDirectivesAssignment_1_1 ) )
            // InternalMSQLQueryParser.g:1332:2: ( rule__WhatClause__WhatDirectivesAssignment_1_1 )
            {
             before(grammarAccess.getWhatClauseAccess().getWhatDirectivesAssignment_1_1()); 
            // InternalMSQLQueryParser.g:1333:2: ( rule__WhatClause__WhatDirectivesAssignment_1_1 )
            // InternalMSQLQueryParser.g:1333:3: rule__WhatClause__WhatDirectivesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__WhatClause__WhatDirectivesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getWhatClauseAccess().getWhatDirectivesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatClause__Group_1__1__Impl"


    // $ANTLR start "rule__AllColumnsWhatDirective__Group__0"
    // InternalMSQLQueryParser.g:1342:1: rule__AllColumnsWhatDirective__Group__0 : rule__AllColumnsWhatDirective__Group__0__Impl rule__AllColumnsWhatDirective__Group__1 ;
    public final void rule__AllColumnsWhatDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1346:1: ( rule__AllColumnsWhatDirective__Group__0__Impl rule__AllColumnsWhatDirective__Group__1 )
            // InternalMSQLQueryParser.g:1347:2: rule__AllColumnsWhatDirective__Group__0__Impl rule__AllColumnsWhatDirective__Group__1
            {
            pushFollow(FOLLOW_1);
            rule__AllColumnsWhatDirective__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AllColumnsWhatDirective__Group__1();

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
    // $ANTLR end "rule__AllColumnsWhatDirective__Group__0"


    // $ANTLR start "rule__AllColumnsWhatDirective__Group__0__Impl"
    // InternalMSQLQueryParser.g:1354:1: rule__AllColumnsWhatDirective__Group__0__Impl : ( Asterisk ) ;
    public final void rule__AllColumnsWhatDirective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1358:1: ( ( Asterisk ) )
            // InternalMSQLQueryParser.g:1359:1: ( Asterisk )
            {
            // InternalMSQLQueryParser.g:1359:1: ( Asterisk )
            // InternalMSQLQueryParser.g:1360:2: Asterisk
            {
             before(grammarAccess.getAllColumnsWhatDirectiveAccess().getAsteriskKeyword_0()); 
            match(input,Asterisk,FOLLOW_2); 
             after(grammarAccess.getAllColumnsWhatDirectiveAccess().getAsteriskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllColumnsWhatDirective__Group__0__Impl"


    // $ANTLR start "rule__AllColumnsWhatDirective__Group__1"
    // InternalMSQLQueryParser.g:1369:1: rule__AllColumnsWhatDirective__Group__1 : rule__AllColumnsWhatDirective__Group__1__Impl ;
    public final void rule__AllColumnsWhatDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1373:1: ( rule__AllColumnsWhatDirective__Group__1__Impl )
            // InternalMSQLQueryParser.g:1374:2: rule__AllColumnsWhatDirective__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AllColumnsWhatDirective__Group__1__Impl();

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
    // $ANTLR end "rule__AllColumnsWhatDirective__Group__1"


    // $ANTLR start "rule__AllColumnsWhatDirective__Group__1__Impl"
    // InternalMSQLQueryParser.g:1380:1: rule__AllColumnsWhatDirective__Group__1__Impl : ( () ) ;
    public final void rule__AllColumnsWhatDirective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1384:1: ( ( () ) )
            // InternalMSQLQueryParser.g:1385:1: ( () )
            {
            // InternalMSQLQueryParser.g:1385:1: ( () )
            // InternalMSQLQueryParser.g:1386:2: ()
            {
             before(grammarAccess.getAllColumnsWhatDirectiveAccess().getAllColumnsWhatDirectiveAction_1()); 
            // InternalMSQLQueryParser.g:1387:2: ()
            // InternalMSQLQueryParser.g:1387:3: 
            {
            }

             after(grammarAccess.getAllColumnsWhatDirectiveAccess().getAllColumnsWhatDirectiveAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AllColumnsWhatDirective__Group__1__Impl"


    // $ANTLR start "rule__FromClause__Group__0"
    // InternalMSQLQueryParser.g:1396:1: rule__FromClause__Group__0 : rule__FromClause__Group__0__Impl rule__FromClause__Group__1 ;
    public final void rule__FromClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1400:1: ( rule__FromClause__Group__0__Impl rule__FromClause__Group__1 )
            // InternalMSQLQueryParser.g:1401:2: rule__FromClause__Group__0__Impl rule__FromClause__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__FromClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FromClause__Group__1();

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
    // $ANTLR end "rule__FromClause__Group__0"


    // $ANTLR start "rule__FromClause__Group__0__Impl"
    // InternalMSQLQueryParser.g:1408:1: rule__FromClause__Group__0__Impl : ( FROM ) ;
    public final void rule__FromClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1412:1: ( ( FROM ) )
            // InternalMSQLQueryParser.g:1413:1: ( FROM )
            {
            // InternalMSQLQueryParser.g:1413:1: ( FROM )
            // InternalMSQLQueryParser.g:1414:2: FROM
            {
             before(grammarAccess.getFromClauseAccess().getFROMKeyword_0()); 
            match(input,FROM,FOLLOW_2); 
             after(grammarAccess.getFromClauseAccess().getFROMKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromClause__Group__0__Impl"


    // $ANTLR start "rule__FromClause__Group__1"
    // InternalMSQLQueryParser.g:1423:1: rule__FromClause__Group__1 : rule__FromClause__Group__1__Impl ;
    public final void rule__FromClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1427:1: ( rule__FromClause__Group__1__Impl )
            // InternalMSQLQueryParser.g:1428:2: rule__FromClause__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FromClause__Group__1__Impl();

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
    // $ANTLR end "rule__FromClause__Group__1"


    // $ANTLR start "rule__FromClause__Group__1__Impl"
    // InternalMSQLQueryParser.g:1434:1: rule__FromClause__Group__1__Impl : ( ( rule__FromClause__TableReferenceAssignment_1 ) ) ;
    public final void rule__FromClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1438:1: ( ( ( rule__FromClause__TableReferenceAssignment_1 ) ) )
            // InternalMSQLQueryParser.g:1439:1: ( ( rule__FromClause__TableReferenceAssignment_1 ) )
            {
            // InternalMSQLQueryParser.g:1439:1: ( ( rule__FromClause__TableReferenceAssignment_1 ) )
            // InternalMSQLQueryParser.g:1440:2: ( rule__FromClause__TableReferenceAssignment_1 )
            {
             before(grammarAccess.getFromClauseAccess().getTableReferenceAssignment_1()); 
            // InternalMSQLQueryParser.g:1441:2: ( rule__FromClause__TableReferenceAssignment_1 )
            // InternalMSQLQueryParser.g:1441:3: rule__FromClause__TableReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FromClause__TableReferenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFromClauseAccess().getTableReferenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromClause__Group__1__Impl"


    // $ANTLR start "rule__WhereClause__Group__0"
    // InternalMSQLQueryParser.g:1450:1: rule__WhereClause__Group__0 : rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 ;
    public final void rule__WhereClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1454:1: ( rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1 )
            // InternalMSQLQueryParser.g:1455:2: rule__WhereClause__Group__0__Impl rule__WhereClause__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__WhereClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereClause__Group__1();

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
    // $ANTLR end "rule__WhereClause__Group__0"


    // $ANTLR start "rule__WhereClause__Group__0__Impl"
    // InternalMSQLQueryParser.g:1462:1: rule__WhereClause__Group__0__Impl : ( WHERE ) ;
    public final void rule__WhereClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1466:1: ( ( WHERE ) )
            // InternalMSQLQueryParser.g:1467:1: ( WHERE )
            {
            // InternalMSQLQueryParser.g:1467:1: ( WHERE )
            // InternalMSQLQueryParser.g:1468:2: WHERE
            {
             before(grammarAccess.getWhereClauseAccess().getWHEREKeyword_0()); 
            match(input,WHERE,FOLLOW_2); 
             after(grammarAccess.getWhereClauseAccess().getWHEREKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__Group__0__Impl"


    // $ANTLR start "rule__WhereClause__Group__1"
    // InternalMSQLQueryParser.g:1477:1: rule__WhereClause__Group__1 : rule__WhereClause__Group__1__Impl ;
    public final void rule__WhereClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1481:1: ( rule__WhereClause__Group__1__Impl )
            // InternalMSQLQueryParser.g:1482:2: rule__WhereClause__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__Group__1__Impl();

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
    // $ANTLR end "rule__WhereClause__Group__1"


    // $ANTLR start "rule__WhereClause__Group__1__Impl"
    // InternalMSQLQueryParser.g:1488:1: rule__WhereClause__Group__1__Impl : ( ( rule__WhereClause__ExpressionAssignment_1 ) ) ;
    public final void rule__WhereClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1492:1: ( ( ( rule__WhereClause__ExpressionAssignment_1 ) ) )
            // InternalMSQLQueryParser.g:1493:1: ( ( rule__WhereClause__ExpressionAssignment_1 ) )
            {
            // InternalMSQLQueryParser.g:1493:1: ( ( rule__WhereClause__ExpressionAssignment_1 ) )
            // InternalMSQLQueryParser.g:1494:2: ( rule__WhereClause__ExpressionAssignment_1 )
            {
             before(grammarAccess.getWhereClauseAccess().getExpressionAssignment_1()); 
            // InternalMSQLQueryParser.g:1495:2: ( rule__WhereClause__ExpressionAssignment_1 )
            // InternalMSQLQueryParser.g:1495:3: rule__WhereClause__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WhereClause__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereClauseAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__Group__1__Impl"


    // $ANTLR start "rule__OrderByClause__Group__0"
    // InternalMSQLQueryParser.g:1504:1: rule__OrderByClause__Group__0 : rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1 ;
    public final void rule__OrderByClause__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1508:1: ( rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1 )
            // InternalMSQLQueryParser.g:1509:2: rule__OrderByClause__Group__0__Impl rule__OrderByClause__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__OrderByClause__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderByClause__Group__1();

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
    // $ANTLR end "rule__OrderByClause__Group__0"


    // $ANTLR start "rule__OrderByClause__Group__0__Impl"
    // InternalMSQLQueryParser.g:1516:1: rule__OrderByClause__Group__0__Impl : ( ORDER ) ;
    public final void rule__OrderByClause__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1520:1: ( ( ORDER ) )
            // InternalMSQLQueryParser.g:1521:1: ( ORDER )
            {
            // InternalMSQLQueryParser.g:1521:1: ( ORDER )
            // InternalMSQLQueryParser.g:1522:2: ORDER
            {
             before(grammarAccess.getOrderByClauseAccess().getORDERKeyword_0()); 
            match(input,ORDER,FOLLOW_2); 
             after(grammarAccess.getOrderByClauseAccess().getORDERKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group__0__Impl"


    // $ANTLR start "rule__OrderByClause__Group__1"
    // InternalMSQLQueryParser.g:1531:1: rule__OrderByClause__Group__1 : rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2 ;
    public final void rule__OrderByClause__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1535:1: ( rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2 )
            // InternalMSQLQueryParser.g:1536:2: rule__OrderByClause__Group__1__Impl rule__OrderByClause__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__OrderByClause__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderByClause__Group__2();

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
    // $ANTLR end "rule__OrderByClause__Group__1"


    // $ANTLR start "rule__OrderByClause__Group__1__Impl"
    // InternalMSQLQueryParser.g:1543:1: rule__OrderByClause__Group__1__Impl : ( BY ) ;
    public final void rule__OrderByClause__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1547:1: ( ( BY ) )
            // InternalMSQLQueryParser.g:1548:1: ( BY )
            {
            // InternalMSQLQueryParser.g:1548:1: ( BY )
            // InternalMSQLQueryParser.g:1549:2: BY
            {
             before(grammarAccess.getOrderByClauseAccess().getBYKeyword_1()); 
            match(input,BY,FOLLOW_2); 
             after(grammarAccess.getOrderByClauseAccess().getBYKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group__1__Impl"


    // $ANTLR start "rule__OrderByClause__Group__2"
    // InternalMSQLQueryParser.g:1558:1: rule__OrderByClause__Group__2 : rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3 ;
    public final void rule__OrderByClause__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1562:1: ( rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3 )
            // InternalMSQLQueryParser.g:1563:2: rule__OrderByClause__Group__2__Impl rule__OrderByClause__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__OrderByClause__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderByClause__Group__3();

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
    // $ANTLR end "rule__OrderByClause__Group__2"


    // $ANTLR start "rule__OrderByClause__Group__2__Impl"
    // InternalMSQLQueryParser.g:1570:1: rule__OrderByClause__Group__2__Impl : ( ( rule__OrderByClause__OrderDirectivesAssignment_2 ) ) ;
    public final void rule__OrderByClause__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1574:1: ( ( ( rule__OrderByClause__OrderDirectivesAssignment_2 ) ) )
            // InternalMSQLQueryParser.g:1575:1: ( ( rule__OrderByClause__OrderDirectivesAssignment_2 ) )
            {
            // InternalMSQLQueryParser.g:1575:1: ( ( rule__OrderByClause__OrderDirectivesAssignment_2 ) )
            // InternalMSQLQueryParser.g:1576:2: ( rule__OrderByClause__OrderDirectivesAssignment_2 )
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderDirectivesAssignment_2()); 
            // InternalMSQLQueryParser.g:1577:2: ( rule__OrderByClause__OrderDirectivesAssignment_2 )
            // InternalMSQLQueryParser.g:1577:3: rule__OrderByClause__OrderDirectivesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OrderByClause__OrderDirectivesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOrderByClauseAccess().getOrderDirectivesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group__2__Impl"


    // $ANTLR start "rule__OrderByClause__Group__3"
    // InternalMSQLQueryParser.g:1585:1: rule__OrderByClause__Group__3 : rule__OrderByClause__Group__3__Impl ;
    public final void rule__OrderByClause__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1589:1: ( rule__OrderByClause__Group__3__Impl )
            // InternalMSQLQueryParser.g:1590:2: rule__OrderByClause__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderByClause__Group__3__Impl();

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
    // $ANTLR end "rule__OrderByClause__Group__3"


    // $ANTLR start "rule__OrderByClause__Group__3__Impl"
    // InternalMSQLQueryParser.g:1596:1: rule__OrderByClause__Group__3__Impl : ( ( rule__OrderByClause__Group_3__0 )* ) ;
    public final void rule__OrderByClause__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1600:1: ( ( ( rule__OrderByClause__Group_3__0 )* ) )
            // InternalMSQLQueryParser.g:1601:1: ( ( rule__OrderByClause__Group_3__0 )* )
            {
            // InternalMSQLQueryParser.g:1601:1: ( ( rule__OrderByClause__Group_3__0 )* )
            // InternalMSQLQueryParser.g:1602:2: ( rule__OrderByClause__Group_3__0 )*
            {
             before(grammarAccess.getOrderByClauseAccess().getGroup_3()); 
            // InternalMSQLQueryParser.g:1603:2: ( rule__OrderByClause__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:1603:3: rule__OrderByClause__Group_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__OrderByClause__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getOrderByClauseAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group__3__Impl"


    // $ANTLR start "rule__OrderByClause__Group_3__0"
    // InternalMSQLQueryParser.g:1612:1: rule__OrderByClause__Group_3__0 : rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1 ;
    public final void rule__OrderByClause__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1616:1: ( rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1 )
            // InternalMSQLQueryParser.g:1617:2: rule__OrderByClause__Group_3__0__Impl rule__OrderByClause__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__OrderByClause__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderByClause__Group_3__1();

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
    // $ANTLR end "rule__OrderByClause__Group_3__0"


    // $ANTLR start "rule__OrderByClause__Group_3__0__Impl"
    // InternalMSQLQueryParser.g:1624:1: rule__OrderByClause__Group_3__0__Impl : ( Comma ) ;
    public final void rule__OrderByClause__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1628:1: ( ( Comma ) )
            // InternalMSQLQueryParser.g:1629:1: ( Comma )
            {
            // InternalMSQLQueryParser.g:1629:1: ( Comma )
            // InternalMSQLQueryParser.g:1630:2: Comma
            {
             before(grammarAccess.getOrderByClauseAccess().getCommaKeyword_3_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getOrderByClauseAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group_3__0__Impl"


    // $ANTLR start "rule__OrderByClause__Group_3__1"
    // InternalMSQLQueryParser.g:1639:1: rule__OrderByClause__Group_3__1 : rule__OrderByClause__Group_3__1__Impl ;
    public final void rule__OrderByClause__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1643:1: ( rule__OrderByClause__Group_3__1__Impl )
            // InternalMSQLQueryParser.g:1644:2: rule__OrderByClause__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderByClause__Group_3__1__Impl();

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
    // $ANTLR end "rule__OrderByClause__Group_3__1"


    // $ANTLR start "rule__OrderByClause__Group_3__1__Impl"
    // InternalMSQLQueryParser.g:1650:1: rule__OrderByClause__Group_3__1__Impl : ( ( rule__OrderByClause__OrderDirectivesAssignment_3_1 ) ) ;
    public final void rule__OrderByClause__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1654:1: ( ( ( rule__OrderByClause__OrderDirectivesAssignment_3_1 ) ) )
            // InternalMSQLQueryParser.g:1655:1: ( ( rule__OrderByClause__OrderDirectivesAssignment_3_1 ) )
            {
            // InternalMSQLQueryParser.g:1655:1: ( ( rule__OrderByClause__OrderDirectivesAssignment_3_1 ) )
            // InternalMSQLQueryParser.g:1656:2: ( rule__OrderByClause__OrderDirectivesAssignment_3_1 )
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderDirectivesAssignment_3_1()); 
            // InternalMSQLQueryParser.g:1657:2: ( rule__OrderByClause__OrderDirectivesAssignment_3_1 )
            // InternalMSQLQueryParser.g:1657:3: rule__OrderByClause__OrderDirectivesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OrderByClause__OrderDirectivesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrderByClauseAccess().getOrderDirectivesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__Group_3__1__Impl"


    // $ANTLR start "rule__OrderDirective__Group__0"
    // InternalMSQLQueryParser.g:1666:1: rule__OrderDirective__Group__0 : rule__OrderDirective__Group__0__Impl rule__OrderDirective__Group__1 ;
    public final void rule__OrderDirective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1670:1: ( rule__OrderDirective__Group__0__Impl rule__OrderDirective__Group__1 )
            // InternalMSQLQueryParser.g:1671:2: rule__OrderDirective__Group__0__Impl rule__OrderDirective__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__OrderDirective__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrderDirective__Group__1();

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
    // $ANTLR end "rule__OrderDirective__Group__0"


    // $ANTLR start "rule__OrderDirective__Group__0__Impl"
    // InternalMSQLQueryParser.g:1678:1: rule__OrderDirective__Group__0__Impl : ( ( rule__OrderDirective__ColumnReferenceAssignment_0 ) ) ;
    public final void rule__OrderDirective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1682:1: ( ( ( rule__OrderDirective__ColumnReferenceAssignment_0 ) ) )
            // InternalMSQLQueryParser.g:1683:1: ( ( rule__OrderDirective__ColumnReferenceAssignment_0 ) )
            {
            // InternalMSQLQueryParser.g:1683:1: ( ( rule__OrderDirective__ColumnReferenceAssignment_0 ) )
            // InternalMSQLQueryParser.g:1684:2: ( rule__OrderDirective__ColumnReferenceAssignment_0 )
            {
             before(grammarAccess.getOrderDirectiveAccess().getColumnReferenceAssignment_0()); 
            // InternalMSQLQueryParser.g:1685:2: ( rule__OrderDirective__ColumnReferenceAssignment_0 )
            // InternalMSQLQueryParser.g:1685:3: rule__OrderDirective__ColumnReferenceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OrderDirective__ColumnReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOrderDirectiveAccess().getColumnReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDirective__Group__0__Impl"


    // $ANTLR start "rule__OrderDirective__Group__1"
    // InternalMSQLQueryParser.g:1693:1: rule__OrderDirective__Group__1 : rule__OrderDirective__Group__1__Impl ;
    public final void rule__OrderDirective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1697:1: ( rule__OrderDirective__Group__1__Impl )
            // InternalMSQLQueryParser.g:1698:2: rule__OrderDirective__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrderDirective__Group__1__Impl();

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
    // $ANTLR end "rule__OrderDirective__Group__1"


    // $ANTLR start "rule__OrderDirective__Group__1__Impl"
    // InternalMSQLQueryParser.g:1704:1: rule__OrderDirective__Group__1__Impl : ( ( rule__OrderDirective__DirectionAssignment_1 )? ) ;
    public final void rule__OrderDirective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1708:1: ( ( ( rule__OrderDirective__DirectionAssignment_1 )? ) )
            // InternalMSQLQueryParser.g:1709:1: ( ( rule__OrderDirective__DirectionAssignment_1 )? )
            {
            // InternalMSQLQueryParser.g:1709:1: ( ( rule__OrderDirective__DirectionAssignment_1 )? )
            // InternalMSQLQueryParser.g:1710:2: ( rule__OrderDirective__DirectionAssignment_1 )?
            {
             before(grammarAccess.getOrderDirectiveAccess().getDirectionAssignment_1()); 
            // InternalMSQLQueryParser.g:1711:2: ( rule__OrderDirective__DirectionAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==DESC||LA13_0==ASC) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMSQLQueryParser.g:1711:3: rule__OrderDirective__DirectionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrderDirective__DirectionAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrderDirectiveAccess().getDirectionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDirective__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group__0"
    // InternalMSQLQueryParser.g:1720:1: rule__OrExpression__Group__0 : rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 ;
    public final void rule__OrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1724:1: ( rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1 )
            // InternalMSQLQueryParser.g:1725:2: rule__OrExpression__Group__0__Impl rule__OrExpression__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__OrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1();

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
    // $ANTLR end "rule__OrExpression__Group__0"


    // $ANTLR start "rule__OrExpression__Group__0__Impl"
    // InternalMSQLQueryParser.g:1732:1: rule__OrExpression__Group__0__Impl : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1736:1: ( ( ruleAndExpression ) )
            // InternalMSQLQueryParser.g:1737:1: ( ruleAndExpression )
            {
            // InternalMSQLQueryParser.g:1737:1: ( ruleAndExpression )
            // InternalMSQLQueryParser.g:1738:2: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__0__Impl"


    // $ANTLR start "rule__OrExpression__Group__1"
    // InternalMSQLQueryParser.g:1747:1: rule__OrExpression__Group__1 : rule__OrExpression__Group__1__Impl ;
    public final void rule__OrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1751:1: ( rule__OrExpression__Group__1__Impl )
            // InternalMSQLQueryParser.g:1752:2: rule__OrExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group__1__Impl();

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
    // $ANTLR end "rule__OrExpression__Group__1"


    // $ANTLR start "rule__OrExpression__Group__1__Impl"
    // InternalMSQLQueryParser.g:1758:1: rule__OrExpression__Group__1__Impl : ( ( rule__OrExpression__Group_1__0 )* ) ;
    public final void rule__OrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1762:1: ( ( ( rule__OrExpression__Group_1__0 )* ) )
            // InternalMSQLQueryParser.g:1763:1: ( ( rule__OrExpression__Group_1__0 )* )
            {
            // InternalMSQLQueryParser.g:1763:1: ( ( rule__OrExpression__Group_1__0 )* )
            // InternalMSQLQueryParser.g:1764:2: ( rule__OrExpression__Group_1__0 )*
            {
             before(grammarAccess.getOrExpressionAccess().getGroup_1()); 
            // InternalMSQLQueryParser.g:1765:2: ( rule__OrExpression__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==OR) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:1765:3: rule__OrExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__OrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getOrExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__0"
    // InternalMSQLQueryParser.g:1774:1: rule__OrExpression__Group_1__0 : rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 ;
    public final void rule__OrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1778:1: ( rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1 )
            // InternalMSQLQueryParser.g:1779:2: rule__OrExpression__Group_1__0__Impl rule__OrExpression__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__OrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__1();

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
    // $ANTLR end "rule__OrExpression__Group_1__0"


    // $ANTLR start "rule__OrExpression__Group_1__0__Impl"
    // InternalMSQLQueryParser.g:1786:1: rule__OrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1790:1: ( ( () ) )
            // InternalMSQLQueryParser.g:1791:1: ( () )
            {
            // InternalMSQLQueryParser.g:1791:1: ( () )
            // InternalMSQLQueryParser.g:1792:2: ()
            {
             before(grammarAccess.getOrExpressionAccess().getBinaryLogicalExpressionExpression1Action_1_0()); 
            // InternalMSQLQueryParser.g:1793:2: ()
            // InternalMSQLQueryParser.g:1793:3: 
            {
            }

             after(grammarAccess.getOrExpressionAccess().getBinaryLogicalExpressionExpression1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__1"
    // InternalMSQLQueryParser.g:1801:1: rule__OrExpression__Group_1__1 : rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 ;
    public final void rule__OrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1805:1: ( rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2 )
            // InternalMSQLQueryParser.g:1806:2: rule__OrExpression__Group_1__1__Impl rule__OrExpression__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__OrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2();

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
    // $ANTLR end "rule__OrExpression__Group_1__1"


    // $ANTLR start "rule__OrExpression__Group_1__1__Impl"
    // InternalMSQLQueryParser.g:1813:1: rule__OrExpression__Group_1__1__Impl : ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__OrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1817:1: ( ( ( rule__OrExpression__OperatorAssignment_1_1 ) ) )
            // InternalMSQLQueryParser.g:1818:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalMSQLQueryParser.g:1818:1: ( ( rule__OrExpression__OperatorAssignment_1_1 ) )
            // InternalMSQLQueryParser.g:1819:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalMSQLQueryParser.g:1820:2: ( rule__OrExpression__OperatorAssignment_1_1 )
            // InternalMSQLQueryParser.g:1820:3: rule__OrExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpression__Group_1__2"
    // InternalMSQLQueryParser.g:1828:1: rule__OrExpression__Group_1__2 : rule__OrExpression__Group_1__2__Impl ;
    public final void rule__OrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1832:1: ( rule__OrExpression__Group_1__2__Impl )
            // InternalMSQLQueryParser.g:1833:2: rule__OrExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__OrExpression__Group_1__2"


    // $ANTLR start "rule__OrExpression__Group_1__2__Impl"
    // InternalMSQLQueryParser.g:1839:1: rule__OrExpression__Group_1__2__Impl : ( ( rule__OrExpression__Expression2Assignment_1_2 ) ) ;
    public final void rule__OrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1843:1: ( ( ( rule__OrExpression__Expression2Assignment_1_2 ) ) )
            // InternalMSQLQueryParser.g:1844:1: ( ( rule__OrExpression__Expression2Assignment_1_2 ) )
            {
            // InternalMSQLQueryParser.g:1844:1: ( ( rule__OrExpression__Expression2Assignment_1_2 ) )
            // InternalMSQLQueryParser.g:1845:2: ( rule__OrExpression__Expression2Assignment_1_2 )
            {
             before(grammarAccess.getOrExpressionAccess().getExpression2Assignment_1_2()); 
            // InternalMSQLQueryParser.g:1846:2: ( rule__OrExpression__Expression2Assignment_1_2 )
            // InternalMSQLQueryParser.g:1846:3: rule__OrExpression__Expression2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__OrExpression__Expression2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrExpressionAccess().getExpression2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpression__Group__0"
    // InternalMSQLQueryParser.g:1855:1: rule__AndExpression__Group__0 : rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 ;
    public final void rule__AndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1859:1: ( rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1 )
            // InternalMSQLQueryParser.g:1860:2: rule__AndExpression__Group__0__Impl rule__AndExpression__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__AndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1();

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
    // $ANTLR end "rule__AndExpression__Group__0"


    // $ANTLR start "rule__AndExpression__Group__0__Impl"
    // InternalMSQLQueryParser.g:1867:1: rule__AndExpression__Group__0__Impl : ( ruleAndOperand ) ;
    public final void rule__AndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1871:1: ( ( ruleAndOperand ) )
            // InternalMSQLQueryParser.g:1872:1: ( ruleAndOperand )
            {
            // InternalMSQLQueryParser.g:1872:1: ( ruleAndOperand )
            // InternalMSQLQueryParser.g:1873:2: ruleAndOperand
            {
             before(grammarAccess.getAndExpressionAccess().getAndOperandParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndOperand();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getAndOperandParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__0__Impl"


    // $ANTLR start "rule__AndExpression__Group__1"
    // InternalMSQLQueryParser.g:1882:1: rule__AndExpression__Group__1 : rule__AndExpression__Group__1__Impl ;
    public final void rule__AndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1886:1: ( rule__AndExpression__Group__1__Impl )
            // InternalMSQLQueryParser.g:1887:2: rule__AndExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group__1__Impl();

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
    // $ANTLR end "rule__AndExpression__Group__1"


    // $ANTLR start "rule__AndExpression__Group__1__Impl"
    // InternalMSQLQueryParser.g:1893:1: rule__AndExpression__Group__1__Impl : ( ( rule__AndExpression__Group_1__0 )* ) ;
    public final void rule__AndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1897:1: ( ( ( rule__AndExpression__Group_1__0 )* ) )
            // InternalMSQLQueryParser.g:1898:1: ( ( rule__AndExpression__Group_1__0 )* )
            {
            // InternalMSQLQueryParser.g:1898:1: ( ( rule__AndExpression__Group_1__0 )* )
            // InternalMSQLQueryParser.g:1899:2: ( rule__AndExpression__Group_1__0 )*
            {
             before(grammarAccess.getAndExpressionAccess().getGroup_1()); 
            // InternalMSQLQueryParser.g:1900:2: ( rule__AndExpression__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==AND) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:1900:3: rule__AndExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__AndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getAndExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__0"
    // InternalMSQLQueryParser.g:1909:1: rule__AndExpression__Group_1__0 : rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 ;
    public final void rule__AndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1913:1: ( rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1 )
            // InternalMSQLQueryParser.g:1914:2: rule__AndExpression__Group_1__0__Impl rule__AndExpression__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__AndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__1();

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
    // $ANTLR end "rule__AndExpression__Group_1__0"


    // $ANTLR start "rule__AndExpression__Group_1__0__Impl"
    // InternalMSQLQueryParser.g:1921:1: rule__AndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1925:1: ( ( () ) )
            // InternalMSQLQueryParser.g:1926:1: ( () )
            {
            // InternalMSQLQueryParser.g:1926:1: ( () )
            // InternalMSQLQueryParser.g:1927:2: ()
            {
             before(grammarAccess.getAndExpressionAccess().getBinaryLogicalExpressionExpression1Action_1_0()); 
            // InternalMSQLQueryParser.g:1928:2: ()
            // InternalMSQLQueryParser.g:1928:3: 
            {
            }

             after(grammarAccess.getAndExpressionAccess().getBinaryLogicalExpressionExpression1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__1"
    // InternalMSQLQueryParser.g:1936:1: rule__AndExpression__Group_1__1 : rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 ;
    public final void rule__AndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1940:1: ( rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2 )
            // InternalMSQLQueryParser.g:1941:2: rule__AndExpression__Group_1__1__Impl rule__AndExpression__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__AndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2();

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
    // $ANTLR end "rule__AndExpression__Group_1__1"


    // $ANTLR start "rule__AndExpression__Group_1__1__Impl"
    // InternalMSQLQueryParser.g:1948:1: rule__AndExpression__Group_1__1__Impl : ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1952:1: ( ( ( rule__AndExpression__OperatorAssignment_1_1 ) ) )
            // InternalMSQLQueryParser.g:1953:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalMSQLQueryParser.g:1953:1: ( ( rule__AndExpression__OperatorAssignment_1_1 ) )
            // InternalMSQLQueryParser.g:1954:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalMSQLQueryParser.g:1955:2: ( rule__AndExpression__OperatorAssignment_1_1 )
            // InternalMSQLQueryParser.g:1955:3: rule__AndExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpression__Group_1__2"
    // InternalMSQLQueryParser.g:1963:1: rule__AndExpression__Group_1__2 : rule__AndExpression__Group_1__2__Impl ;
    public final void rule__AndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1967:1: ( rule__AndExpression__Group_1__2__Impl )
            // InternalMSQLQueryParser.g:1968:2: rule__AndExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__AndExpression__Group_1__2"


    // $ANTLR start "rule__AndExpression__Group_1__2__Impl"
    // InternalMSQLQueryParser.g:1974:1: rule__AndExpression__Group_1__2__Impl : ( ( rule__AndExpression__Expression2Assignment_1_2 ) ) ;
    public final void rule__AndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1978:1: ( ( ( rule__AndExpression__Expression2Assignment_1_2 ) ) )
            // InternalMSQLQueryParser.g:1979:1: ( ( rule__AndExpression__Expression2Assignment_1_2 ) )
            {
            // InternalMSQLQueryParser.g:1979:1: ( ( rule__AndExpression__Expression2Assignment_1_2 ) )
            // InternalMSQLQueryParser.g:1980:2: ( rule__AndExpression__Expression2Assignment_1_2 )
            {
             before(grammarAccess.getAndExpressionAccess().getExpression2Assignment_1_2()); 
            // InternalMSQLQueryParser.g:1981:2: ( rule__AndExpression__Expression2Assignment_1_2 )
            // InternalMSQLQueryParser.g:1981:3: rule__AndExpression__Expression2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AndExpression__Expression2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndExpressionAccess().getExpression2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__NotExpression__Group__0"
    // InternalMSQLQueryParser.g:1990:1: rule__NotExpression__Group__0 : rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1 ;
    public final void rule__NotExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:1994:1: ( rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1 )
            // InternalMSQLQueryParser.g:1995:2: rule__NotExpression__Group__0__Impl rule__NotExpression__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__NotExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NotExpression__Group__1();

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
    // $ANTLR end "rule__NotExpression__Group__0"


    // $ANTLR start "rule__NotExpression__Group__0__Impl"
    // InternalMSQLQueryParser.g:2002:1: rule__NotExpression__Group__0__Impl : ( ( rule__NotExpression__OperatorAssignment_0 ) ) ;
    public final void rule__NotExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2006:1: ( ( ( rule__NotExpression__OperatorAssignment_0 ) ) )
            // InternalMSQLQueryParser.g:2007:1: ( ( rule__NotExpression__OperatorAssignment_0 ) )
            {
            // InternalMSQLQueryParser.g:2007:1: ( ( rule__NotExpression__OperatorAssignment_0 ) )
            // InternalMSQLQueryParser.g:2008:2: ( rule__NotExpression__OperatorAssignment_0 )
            {
             before(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0()); 
            // InternalMSQLQueryParser.g:2009:2: ( rule__NotExpression__OperatorAssignment_0 )
            // InternalMSQLQueryParser.g:2009:3: rule__NotExpression__OperatorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNotExpressionAccess().getOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group__0__Impl"


    // $ANTLR start "rule__NotExpression__Group__1"
    // InternalMSQLQueryParser.g:2017:1: rule__NotExpression__Group__1 : rule__NotExpression__Group__1__Impl ;
    public final void rule__NotExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2021:1: ( rule__NotExpression__Group__1__Impl )
            // InternalMSQLQueryParser.g:2022:2: rule__NotExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__Group__1__Impl();

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
    // $ANTLR end "rule__NotExpression__Group__1"


    // $ANTLR start "rule__NotExpression__Group__1__Impl"
    // InternalMSQLQueryParser.g:2028:1: rule__NotExpression__Group__1__Impl : ( ( rule__NotExpression__ExpressionAssignment_1 ) ) ;
    public final void rule__NotExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2032:1: ( ( ( rule__NotExpression__ExpressionAssignment_1 ) ) )
            // InternalMSQLQueryParser.g:2033:1: ( ( rule__NotExpression__ExpressionAssignment_1 ) )
            {
            // InternalMSQLQueryParser.g:2033:1: ( ( rule__NotExpression__ExpressionAssignment_1 ) )
            // InternalMSQLQueryParser.g:2034:2: ( rule__NotExpression__ExpressionAssignment_1 )
            {
             before(grammarAccess.getNotExpressionAccess().getExpressionAssignment_1()); 
            // InternalMSQLQueryParser.g:2035:2: ( rule__NotExpression__ExpressionAssignment_1 )
            // InternalMSQLQueryParser.g:2035:3: rule__NotExpression__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NotExpression__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNotExpressionAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparativeExpression__Group__0"
    // InternalMSQLQueryParser.g:2044:1: rule__ComparativeExpression__Group__0 : rule__ComparativeExpression__Group__0__Impl rule__ComparativeExpression__Group__1 ;
    public final void rule__ComparativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2048:1: ( rule__ComparativeExpression__Group__0__Impl rule__ComparativeExpression__Group__1 )
            // InternalMSQLQueryParser.g:2049:2: rule__ComparativeExpression__Group__0__Impl rule__ComparativeExpression__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__ComparativeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparativeExpression__Group__1();

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
    // $ANTLR end "rule__ComparativeExpression__Group__0"


    // $ANTLR start "rule__ComparativeExpression__Group__0__Impl"
    // InternalMSQLQueryParser.g:2056:1: rule__ComparativeExpression__Group__0__Impl : ( ruleAdditiveExpression ) ;
    public final void rule__ComparativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2060:1: ( ( ruleAdditiveExpression ) )
            // InternalMSQLQueryParser.g:2061:1: ( ruleAdditiveExpression )
            {
            // InternalMSQLQueryParser.g:2061:1: ( ruleAdditiveExpression )
            // InternalMSQLQueryParser.g:2062:2: ruleAdditiveExpression
            {
             before(grammarAccess.getComparativeExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getComparativeExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparativeExpression__Group__1"
    // InternalMSQLQueryParser.g:2071:1: rule__ComparativeExpression__Group__1 : rule__ComparativeExpression__Group__1__Impl ;
    public final void rule__ComparativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2075:1: ( rule__ComparativeExpression__Group__1__Impl )
            // InternalMSQLQueryParser.g:2076:2: rule__ComparativeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpression__Group__1__Impl();

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
    // $ANTLR end "rule__ComparativeExpression__Group__1"


    // $ANTLR start "rule__ComparativeExpression__Group__1__Impl"
    // InternalMSQLQueryParser.g:2082:1: rule__ComparativeExpression__Group__1__Impl : ( ( rule__ComparativeExpression__Group_1__0 )* ) ;
    public final void rule__ComparativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2086:1: ( ( ( rule__ComparativeExpression__Group_1__0 )* ) )
            // InternalMSQLQueryParser.g:2087:1: ( ( rule__ComparativeExpression__Group_1__0 )* )
            {
            // InternalMSQLQueryParser.g:2087:1: ( ( rule__ComparativeExpression__Group_1__0 )* )
            // InternalMSQLQueryParser.g:2088:2: ( rule__ComparativeExpression__Group_1__0 )*
            {
             before(grammarAccess.getComparativeExpressionAccess().getGroup_1()); 
            // InternalMSQLQueryParser.g:2089:2: ( rule__ComparativeExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=ExclamationMarkEqualsSign && LA16_0<=GreaterThanSignEqualsSign)||(LA16_0>=LessThanSign && LA16_0<=GreaterThanSign)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:2089:3: rule__ComparativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ComparativeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getComparativeExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparativeExpression__Group_1__0"
    // InternalMSQLQueryParser.g:2098:1: rule__ComparativeExpression__Group_1__0 : rule__ComparativeExpression__Group_1__0__Impl rule__ComparativeExpression__Group_1__1 ;
    public final void rule__ComparativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2102:1: ( rule__ComparativeExpression__Group_1__0__Impl rule__ComparativeExpression__Group_1__1 )
            // InternalMSQLQueryParser.g:2103:2: rule__ComparativeExpression__Group_1__0__Impl rule__ComparativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__ComparativeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparativeExpression__Group_1__1();

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
    // $ANTLR end "rule__ComparativeExpression__Group_1__0"


    // $ANTLR start "rule__ComparativeExpression__Group_1__0__Impl"
    // InternalMSQLQueryParser.g:2110:1: rule__ComparativeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2114:1: ( ( () ) )
            // InternalMSQLQueryParser.g:2115:1: ( () )
            {
            // InternalMSQLQueryParser.g:2115:1: ( () )
            // InternalMSQLQueryParser.g:2116:2: ()
            {
             before(grammarAccess.getComparativeExpressionAccess().getComparativeExpressionExpression1Action_1_0()); 
            // InternalMSQLQueryParser.g:2117:2: ()
            // InternalMSQLQueryParser.g:2117:3: 
            {
            }

             after(grammarAccess.getComparativeExpressionAccess().getComparativeExpressionExpression1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComparativeExpression__Group_1__1"
    // InternalMSQLQueryParser.g:2125:1: rule__ComparativeExpression__Group_1__1 : rule__ComparativeExpression__Group_1__1__Impl rule__ComparativeExpression__Group_1__2 ;
    public final void rule__ComparativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2129:1: ( rule__ComparativeExpression__Group_1__1__Impl rule__ComparativeExpression__Group_1__2 )
            // InternalMSQLQueryParser.g:2130:2: rule__ComparativeExpression__Group_1__1__Impl rule__ComparativeExpression__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__ComparativeExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComparativeExpression__Group_1__2();

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
    // $ANTLR end "rule__ComparativeExpression__Group_1__1"


    // $ANTLR start "rule__ComparativeExpression__Group_1__1__Impl"
    // InternalMSQLQueryParser.g:2137:1: rule__ComparativeExpression__Group_1__1__Impl : ( ( rule__ComparativeExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2141:1: ( ( ( rule__ComparativeExpression__OperatorAssignment_1_1 ) ) )
            // InternalMSQLQueryParser.g:2142:1: ( ( rule__ComparativeExpression__OperatorAssignment_1_1 ) )
            {
            // InternalMSQLQueryParser.g:2142:1: ( ( rule__ComparativeExpression__OperatorAssignment_1_1 ) )
            // InternalMSQLQueryParser.g:2143:2: ( rule__ComparativeExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparativeExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalMSQLQueryParser.g:2144:2: ( rule__ComparativeExpression__OperatorAssignment_1_1 )
            // InternalMSQLQueryParser.g:2144:3: rule__ComparativeExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparativeExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComparativeExpression__Group_1__2"
    // InternalMSQLQueryParser.g:2152:1: rule__ComparativeExpression__Group_1__2 : rule__ComparativeExpression__Group_1__2__Impl ;
    public final void rule__ComparativeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2156:1: ( rule__ComparativeExpression__Group_1__2__Impl )
            // InternalMSQLQueryParser.g:2157:2: rule__ComparativeExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__ComparativeExpression__Group_1__2"


    // $ANTLR start "rule__ComparativeExpression__Group_1__2__Impl"
    // InternalMSQLQueryParser.g:2163:1: rule__ComparativeExpression__Group_1__2__Impl : ( ( rule__ComparativeExpression__Expression2Assignment_1_2 ) ) ;
    public final void rule__ComparativeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2167:1: ( ( ( rule__ComparativeExpression__Expression2Assignment_1_2 ) ) )
            // InternalMSQLQueryParser.g:2168:1: ( ( rule__ComparativeExpression__Expression2Assignment_1_2 ) )
            {
            // InternalMSQLQueryParser.g:2168:1: ( ( rule__ComparativeExpression__Expression2Assignment_1_2 ) )
            // InternalMSQLQueryParser.g:2169:2: ( rule__ComparativeExpression__Expression2Assignment_1_2 )
            {
             before(grammarAccess.getComparativeExpressionAccess().getExpression2Assignment_1_2()); 
            // InternalMSQLQueryParser.g:2170:2: ( rule__ComparativeExpression__Expression2Assignment_1_2 )
            // InternalMSQLQueryParser.g:2170:3: rule__ComparativeExpression__Expression2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ComparativeExpression__Expression2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparativeExpressionAccess().getExpression2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__0"
    // InternalMSQLQueryParser.g:2179:1: rule__AdditiveExpression__Group__0 : rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 ;
    public final void rule__AdditiveExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2183:1: ( rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1 )
            // InternalMSQLQueryParser.g:2184:2: rule__AdditiveExpression__Group__0__Impl rule__AdditiveExpression__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__AdditiveExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__1();

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
    // $ANTLR end "rule__AdditiveExpression__Group__0"


    // $ANTLR start "rule__AdditiveExpression__Group__0__Impl"
    // InternalMSQLQueryParser.g:2191:1: rule__AdditiveExpression__Group__0__Impl : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2195:1: ( ( ruleMultiplicativeExpression ) )
            // InternalMSQLQueryParser.g:2196:1: ( ruleMultiplicativeExpression )
            {
            // InternalMSQLQueryParser.g:2196:1: ( ruleMultiplicativeExpression )
            // InternalMSQLQueryParser.g:2197:2: ruleMultiplicativeExpression
            {
             before(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group__1"
    // InternalMSQLQueryParser.g:2206:1: rule__AdditiveExpression__Group__1 : rule__AdditiveExpression__Group__1__Impl ;
    public final void rule__AdditiveExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2210:1: ( rule__AdditiveExpression__Group__1__Impl )
            // InternalMSQLQueryParser.g:2211:2: rule__AdditiveExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group__1__Impl();

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
    // $ANTLR end "rule__AdditiveExpression__Group__1"


    // $ANTLR start "rule__AdditiveExpression__Group__1__Impl"
    // InternalMSQLQueryParser.g:2217:1: rule__AdditiveExpression__Group__1__Impl : ( ( rule__AdditiveExpression__Group_1__0 )* ) ;
    public final void rule__AdditiveExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2221:1: ( ( ( rule__AdditiveExpression__Group_1__0 )* ) )
            // InternalMSQLQueryParser.g:2222:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            {
            // InternalMSQLQueryParser.g:2222:1: ( ( rule__AdditiveExpression__Group_1__0 )* )
            // InternalMSQLQueryParser.g:2223:2: ( rule__AdditiveExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 
            // InternalMSQLQueryParser.g:2224:2: ( rule__AdditiveExpression__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==PlusSign||LA17_0==HyphenMinus) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:2224:3: rule__AdditiveExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__AdditiveExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getAdditiveExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__0"
    // InternalMSQLQueryParser.g:2233:1: rule__AdditiveExpression__Group_1__0 : rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 ;
    public final void rule__AdditiveExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2237:1: ( rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1 )
            // InternalMSQLQueryParser.g:2238:2: rule__AdditiveExpression__Group_1__0__Impl rule__AdditiveExpression__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__AdditiveExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__1();

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
    // $ANTLR end "rule__AdditiveExpression__Group_1__0"


    // $ANTLR start "rule__AdditiveExpression__Group_1__0__Impl"
    // InternalMSQLQueryParser.g:2245:1: rule__AdditiveExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditiveExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2249:1: ( ( () ) )
            // InternalMSQLQueryParser.g:2250:1: ( () )
            {
            // InternalMSQLQueryParser.g:2250:1: ( () )
            // InternalMSQLQueryParser.g:2251:2: ()
            {
             before(grammarAccess.getAdditiveExpressionAccess().getArithmeticExpressionExpression1Action_1_0()); 
            // InternalMSQLQueryParser.g:2252:2: ()
            // InternalMSQLQueryParser.g:2252:3: 
            {
            }

             after(grammarAccess.getAdditiveExpressionAccess().getArithmeticExpressionExpression1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__1"
    // InternalMSQLQueryParser.g:2260:1: rule__AdditiveExpression__Group_1__1 : rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 ;
    public final void rule__AdditiveExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2264:1: ( rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2 )
            // InternalMSQLQueryParser.g:2265:2: rule__AdditiveExpression__Group_1__1__Impl rule__AdditiveExpression__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__AdditiveExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__2();

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
    // $ANTLR end "rule__AdditiveExpression__Group_1__1"


    // $ANTLR start "rule__AdditiveExpression__Group_1__1__Impl"
    // InternalMSQLQueryParser.g:2272:1: rule__AdditiveExpression__Group_1__1__Impl : ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditiveExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2276:1: ( ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) ) )
            // InternalMSQLQueryParser.g:2277:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            {
            // InternalMSQLQueryParser.g:2277:1: ( ( rule__AdditiveExpression__OperatorAssignment_1_1 ) )
            // InternalMSQLQueryParser.g:2278:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalMSQLQueryParser.g:2279:2: ( rule__AdditiveExpression__OperatorAssignment_1_1 )
            // InternalMSQLQueryParser.g:2279:3: rule__AdditiveExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AdditiveExpression__Group_1__2"
    // InternalMSQLQueryParser.g:2287:1: rule__AdditiveExpression__Group_1__2 : rule__AdditiveExpression__Group_1__2__Impl ;
    public final void rule__AdditiveExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2291:1: ( rule__AdditiveExpression__Group_1__2__Impl )
            // InternalMSQLQueryParser.g:2292:2: rule__AdditiveExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__AdditiveExpression__Group_1__2"


    // $ANTLR start "rule__AdditiveExpression__Group_1__2__Impl"
    // InternalMSQLQueryParser.g:2298:1: rule__AdditiveExpression__Group_1__2__Impl : ( ( rule__AdditiveExpression__Expression2Assignment_1_2 ) ) ;
    public final void rule__AdditiveExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2302:1: ( ( ( rule__AdditiveExpression__Expression2Assignment_1_2 ) ) )
            // InternalMSQLQueryParser.g:2303:1: ( ( rule__AdditiveExpression__Expression2Assignment_1_2 ) )
            {
            // InternalMSQLQueryParser.g:2303:1: ( ( rule__AdditiveExpression__Expression2Assignment_1_2 ) )
            // InternalMSQLQueryParser.g:2304:2: ( rule__AdditiveExpression__Expression2Assignment_1_2 )
            {
             before(grammarAccess.getAdditiveExpressionAccess().getExpression2Assignment_1_2()); 
            // InternalMSQLQueryParser.g:2305:2: ( rule__AdditiveExpression__Expression2Assignment_1_2 )
            // InternalMSQLQueryParser.g:2305:3: rule__AdditiveExpression__Expression2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AdditiveExpression__Expression2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditiveExpressionAccess().getExpression2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Group_1__2__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0"
    // InternalMSQLQueryParser.g:2314:1: rule__MultiplicativeExpression__Group__0 : rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 ;
    public final void rule__MultiplicativeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2318:1: ( rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1 )
            // InternalMSQLQueryParser.g:2319:2: rule__MultiplicativeExpression__Group__0__Impl rule__MultiplicativeExpression__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__MultiplicativeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1();

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group__0__Impl"
    // InternalMSQLQueryParser.g:2326:1: rule__MultiplicativeExpression__Group__0__Impl : ( ruleAtomicExpression ) ;
    public final void rule__MultiplicativeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2330:1: ( ( ruleAtomicExpression ) )
            // InternalMSQLQueryParser.g:2331:1: ( ruleAtomicExpression )
            {
            // InternalMSQLQueryParser.g:2331:1: ( ruleAtomicExpression )
            // InternalMSQLQueryParser.g:2332:2: ruleAtomicExpression
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getAtomicExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomicExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getAtomicExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1"
    // InternalMSQLQueryParser.g:2341:1: rule__MultiplicativeExpression__Group__1 : rule__MultiplicativeExpression__Group__1__Impl ;
    public final void rule__MultiplicativeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2345:1: ( rule__MultiplicativeExpression__Group__1__Impl )
            // InternalMSQLQueryParser.g:2346:2: rule__MultiplicativeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group__1__Impl();

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
    // $ANTLR end "rule__MultiplicativeExpression__Group__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group__1__Impl"
    // InternalMSQLQueryParser.g:2352:1: rule__MultiplicativeExpression__Group__1__Impl : ( ( rule__MultiplicativeExpression__Group_1__0 )* ) ;
    public final void rule__MultiplicativeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2356:1: ( ( ( rule__MultiplicativeExpression__Group_1__0 )* ) )
            // InternalMSQLQueryParser.g:2357:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            {
            // InternalMSQLQueryParser.g:2357:1: ( ( rule__MultiplicativeExpression__Group_1__0 )* )
            // InternalMSQLQueryParser.g:2358:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 
            // InternalMSQLQueryParser.g:2359:2: ( rule__MultiplicativeExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Asterisk||LA18_0==Solidus) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMSQLQueryParser.g:2359:3: rule__MultiplicativeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__MultiplicativeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMultiplicativeExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0"
    // InternalMSQLQueryParser.g:2368:1: rule__MultiplicativeExpression__Group_1__0 : rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 ;
    public final void rule__MultiplicativeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2372:1: ( rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1 )
            // InternalMSQLQueryParser.g:2373:2: rule__MultiplicativeExpression__Group_1__0__Impl rule__MultiplicativeExpression__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__MultiplicativeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__1();

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__0__Impl"
    // InternalMSQLQueryParser.g:2380:1: rule__MultiplicativeExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__MultiplicativeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2384:1: ( ( () ) )
            // InternalMSQLQueryParser.g:2385:1: ( () )
            {
            // InternalMSQLQueryParser.g:2385:1: ( () )
            // InternalMSQLQueryParser.g:2386:2: ()
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getArithmeticExpressionExpression1Action_1_0()); 
            // InternalMSQLQueryParser.g:2387:2: ()
            // InternalMSQLQueryParser.g:2387:3: 
            {
            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getArithmeticExpressionExpression1Action_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1"
    // InternalMSQLQueryParser.g:2395:1: rule__MultiplicativeExpression__Group_1__1 : rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 ;
    public final void rule__MultiplicativeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2399:1: ( rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2 )
            // InternalMSQLQueryParser.g:2400:2: rule__MultiplicativeExpression__Group_1__1__Impl rule__MultiplicativeExpression__Group_1__2
            {
            pushFollow(FOLLOW_9);
            rule__MultiplicativeExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__2();

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__1__Impl"
    // InternalMSQLQueryParser.g:2407:1: rule__MultiplicativeExpression__Group_1__1__Impl : ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2411:1: ( ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) ) )
            // InternalMSQLQueryParser.g:2412:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            {
            // InternalMSQLQueryParser.g:2412:1: ( ( rule__MultiplicativeExpression__OperatorAssignment_1_1 ) )
            // InternalMSQLQueryParser.g:2413:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalMSQLQueryParser.g:2414:2: ( rule__MultiplicativeExpression__OperatorAssignment_1_1 )
            // InternalMSQLQueryParser.g:2414:3: rule__MultiplicativeExpression__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__2"
    // InternalMSQLQueryParser.g:2422:1: rule__MultiplicativeExpression__Group_1__2 : rule__MultiplicativeExpression__Group_1__2__Impl ;
    public final void rule__MultiplicativeExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2426:1: ( rule__MultiplicativeExpression__Group_1__2__Impl )
            // InternalMSQLQueryParser.g:2427:2: rule__MultiplicativeExpression__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Group_1__2__Impl();

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
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__2"


    // $ANTLR start "rule__MultiplicativeExpression__Group_1__2__Impl"
    // InternalMSQLQueryParser.g:2433:1: rule__MultiplicativeExpression__Group_1__2__Impl : ( ( rule__MultiplicativeExpression__Expression2Assignment_1_2 ) ) ;
    public final void rule__MultiplicativeExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2437:1: ( ( ( rule__MultiplicativeExpression__Expression2Assignment_1_2 ) ) )
            // InternalMSQLQueryParser.g:2438:1: ( ( rule__MultiplicativeExpression__Expression2Assignment_1_2 ) )
            {
            // InternalMSQLQueryParser.g:2438:1: ( ( rule__MultiplicativeExpression__Expression2Assignment_1_2 ) )
            // InternalMSQLQueryParser.g:2439:2: ( rule__MultiplicativeExpression__Expression2Assignment_1_2 )
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getExpression2Assignment_1_2()); 
            // InternalMSQLQueryParser.g:2440:2: ( rule__MultiplicativeExpression__Expression2Assignment_1_2 )
            // InternalMSQLQueryParser.g:2440:3: rule__MultiplicativeExpression__Expression2Assignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplicativeExpression__Expression2Assignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicativeExpressionAccess().getExpression2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_0__0"
    // InternalMSQLQueryParser.g:2449:1: rule__AtomicExpression__Group_0__0 : rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1 ;
    public final void rule__AtomicExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2453:1: ( rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1 )
            // InternalMSQLQueryParser.g:2454:2: rule__AtomicExpression__Group_0__0__Impl rule__AtomicExpression__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__AtomicExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Group_0__1();

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
    // $ANTLR end "rule__AtomicExpression__Group_0__0"


    // $ANTLR start "rule__AtomicExpression__Group_0__0__Impl"
    // InternalMSQLQueryParser.g:2461:1: rule__AtomicExpression__Group_0__0__Impl : ( LeftParenthesis ) ;
    public final void rule__AtomicExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2465:1: ( ( LeftParenthesis ) )
            // InternalMSQLQueryParser.g:2466:1: ( LeftParenthesis )
            {
            // InternalMSQLQueryParser.g:2466:1: ( LeftParenthesis )
            // InternalMSQLQueryParser.g:2467:2: LeftParenthesis
            {
             before(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,LeftParenthesis,FOLLOW_2); 
             after(grammarAccess.getAtomicExpressionAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_0__0__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_0__1"
    // InternalMSQLQueryParser.g:2476:1: rule__AtomicExpression__Group_0__1 : rule__AtomicExpression__Group_0__1__Impl rule__AtomicExpression__Group_0__2 ;
    public final void rule__AtomicExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2480:1: ( rule__AtomicExpression__Group_0__1__Impl rule__AtomicExpression__Group_0__2 )
            // InternalMSQLQueryParser.g:2481:2: rule__AtomicExpression__Group_0__1__Impl rule__AtomicExpression__Group_0__2
            {
            pushFollow(FOLLOW_22);
            rule__AtomicExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Group_0__2();

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
    // $ANTLR end "rule__AtomicExpression__Group_0__1"


    // $ANTLR start "rule__AtomicExpression__Group_0__1__Impl"
    // InternalMSQLQueryParser.g:2488:1: rule__AtomicExpression__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__AtomicExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2492:1: ( ( ruleExpression ) )
            // InternalMSQLQueryParser.g:2493:1: ( ruleExpression )
            {
            // InternalMSQLQueryParser.g:2493:1: ( ruleExpression )
            // InternalMSQLQueryParser.g:2494:2: ruleExpression
            {
             before(grammarAccess.getAtomicExpressionAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAtomicExpressionAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_0__1__Impl"


    // $ANTLR start "rule__AtomicExpression__Group_0__2"
    // InternalMSQLQueryParser.g:2503:1: rule__AtomicExpression__Group_0__2 : rule__AtomicExpression__Group_0__2__Impl ;
    public final void rule__AtomicExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2507:1: ( rule__AtomicExpression__Group_0__2__Impl )
            // InternalMSQLQueryParser.g:2508:2: rule__AtomicExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicExpression__Group_0__2__Impl();

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
    // $ANTLR end "rule__AtomicExpression__Group_0__2"


    // $ANTLR start "rule__AtomicExpression__Group_0__2__Impl"
    // InternalMSQLQueryParser.g:2514:1: rule__AtomicExpression__Group_0__2__Impl : ( RightParenthesis ) ;
    public final void rule__AtomicExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2518:1: ( ( RightParenthesis ) )
            // InternalMSQLQueryParser.g:2519:1: ( RightParenthesis )
            {
            // InternalMSQLQueryParser.g:2519:1: ( RightParenthesis )
            // InternalMSQLQueryParser.g:2520:2: RightParenthesis
            {
             before(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_0_2()); 
            match(input,RightParenthesis,FOLLOW_2); 
             after(grammarAccess.getAtomicExpressionAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicExpression__Group_0__2__Impl"


    // $ANTLR start "rule__IntegerType__Group__0"
    // InternalMSQLQueryParser.g:2530:1: rule__IntegerType__Group__0 : rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 ;
    public final void rule__IntegerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2534:1: ( rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1 )
            // InternalMSQLQueryParser.g:2535:2: rule__IntegerType__Group__0__Impl rule__IntegerType__Group__1
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
    // InternalMSQLQueryParser.g:2542:1: rule__IntegerType__Group__0__Impl : ( Int ) ;
    public final void rule__IntegerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2546:1: ( ( Int ) )
            // InternalMSQLQueryParser.g:2547:1: ( Int )
            {
            // InternalMSQLQueryParser.g:2547:1: ( Int )
            // InternalMSQLQueryParser.g:2548:2: Int
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
    // InternalMSQLQueryParser.g:2557:1: rule__IntegerType__Group__1 : rule__IntegerType__Group__1__Impl ;
    public final void rule__IntegerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2561:1: ( rule__IntegerType__Group__1__Impl )
            // InternalMSQLQueryParser.g:2562:2: rule__IntegerType__Group__1__Impl
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
    // InternalMSQLQueryParser.g:2568:1: rule__IntegerType__Group__1__Impl : ( () ) ;
    public final void rule__IntegerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2572:1: ( ( () ) )
            // InternalMSQLQueryParser.g:2573:1: ( () )
            {
            // InternalMSQLQueryParser.g:2573:1: ( () )
            // InternalMSQLQueryParser.g:2574:2: ()
            {
             before(grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_1()); 
            // InternalMSQLQueryParser.g:2575:2: ()
            // InternalMSQLQueryParser.g:2575:3: 
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
    // InternalMSQLQueryParser.g:2584:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2588:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalMSQLQueryParser.g:2589:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
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
    // InternalMSQLQueryParser.g:2596:1: rule__StringType__Group__0__Impl : ( String ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2600:1: ( ( String ) )
            // InternalMSQLQueryParser.g:2601:1: ( String )
            {
            // InternalMSQLQueryParser.g:2601:1: ( String )
            // InternalMSQLQueryParser.g:2602:2: String
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
    // InternalMSQLQueryParser.g:2611:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2615:1: ( rule__StringType__Group__1__Impl )
            // InternalMSQLQueryParser.g:2616:2: rule__StringType__Group__1__Impl
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
    // InternalMSQLQueryParser.g:2622:1: rule__StringType__Group__1__Impl : ( () ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2626:1: ( ( () ) )
            // InternalMSQLQueryParser.g:2627:1: ( () )
            {
            // InternalMSQLQueryParser.g:2627:1: ( () )
            // InternalMSQLQueryParser.g:2628:2: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_1()); 
            // InternalMSQLQueryParser.g:2629:2: ()
            // InternalMSQLQueryParser.g:2629:3: 
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
    // InternalMSQLQueryParser.g:2638:1: rule__BooleanType__Group__0 : rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 ;
    public final void rule__BooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2642:1: ( rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1 )
            // InternalMSQLQueryParser.g:2643:2: rule__BooleanType__Group__0__Impl rule__BooleanType__Group__1
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
    // InternalMSQLQueryParser.g:2650:1: rule__BooleanType__Group__0__Impl : ( Bool ) ;
    public final void rule__BooleanType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2654:1: ( ( Bool ) )
            // InternalMSQLQueryParser.g:2655:1: ( Bool )
            {
            // InternalMSQLQueryParser.g:2655:1: ( Bool )
            // InternalMSQLQueryParser.g:2656:2: Bool
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
    // InternalMSQLQueryParser.g:2665:1: rule__BooleanType__Group__1 : rule__BooleanType__Group__1__Impl ;
    public final void rule__BooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2669:1: ( rule__BooleanType__Group__1__Impl )
            // InternalMSQLQueryParser.g:2670:2: rule__BooleanType__Group__1__Impl
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
    // InternalMSQLQueryParser.g:2676:1: rule__BooleanType__Group__1__Impl : ( () ) ;
    public final void rule__BooleanType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2680:1: ( ( () ) )
            // InternalMSQLQueryParser.g:2681:1: ( () )
            {
            // InternalMSQLQueryParser.g:2681:1: ( () )
            // InternalMSQLQueryParser.g:2682:2: ()
            {
             before(grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_1()); 
            // InternalMSQLQueryParser.g:2683:2: ()
            // InternalMSQLQueryParser.g:2683:3: 
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


    // $ANTLR start "rule__SelectQuery__WhatClauseAssignment_1"
    // InternalMSQLQueryParser.g:2692:1: rule__SelectQuery__WhatClauseAssignment_1 : ( ruleWhatClause ) ;
    public final void rule__SelectQuery__WhatClauseAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2696:1: ( ( ruleWhatClause ) )
            // InternalMSQLQueryParser.g:2697:2: ( ruleWhatClause )
            {
            // InternalMSQLQueryParser.g:2697:2: ( ruleWhatClause )
            // InternalMSQLQueryParser.g:2698:3: ruleWhatClause
            {
             before(grammarAccess.getSelectQueryAccess().getWhatClauseWhatClauseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWhatClause();

            state._fsp--;

             after(grammarAccess.getSelectQueryAccess().getWhatClauseWhatClauseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__WhatClauseAssignment_1"


    // $ANTLR start "rule__SelectQuery__FromClauseAssignment_2"
    // InternalMSQLQueryParser.g:2707:1: rule__SelectQuery__FromClauseAssignment_2 : ( ruleFromClause ) ;
    public final void rule__SelectQuery__FromClauseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2711:1: ( ( ruleFromClause ) )
            // InternalMSQLQueryParser.g:2712:2: ( ruleFromClause )
            {
            // InternalMSQLQueryParser.g:2712:2: ( ruleFromClause )
            // InternalMSQLQueryParser.g:2713:3: ruleFromClause
            {
             before(grammarAccess.getSelectQueryAccess().getFromClauseFromClauseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFromClause();

            state._fsp--;

             after(grammarAccess.getSelectQueryAccess().getFromClauseFromClauseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__FromClauseAssignment_2"


    // $ANTLR start "rule__SelectQuery__WhereClauseAssignment_3"
    // InternalMSQLQueryParser.g:2722:1: rule__SelectQuery__WhereClauseAssignment_3 : ( ruleWhereClause ) ;
    public final void rule__SelectQuery__WhereClauseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2726:1: ( ( ruleWhereClause ) )
            // InternalMSQLQueryParser.g:2727:2: ( ruleWhereClause )
            {
            // InternalMSQLQueryParser.g:2727:2: ( ruleWhereClause )
            // InternalMSQLQueryParser.g:2728:3: ruleWhereClause
            {
             before(grammarAccess.getSelectQueryAccess().getWhereClauseWhereClauseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWhereClause();

            state._fsp--;

             after(grammarAccess.getSelectQueryAccess().getWhereClauseWhereClauseParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__WhereClauseAssignment_3"


    // $ANTLR start "rule__SelectQuery__OrderByClauseAssignment_4"
    // InternalMSQLQueryParser.g:2737:1: rule__SelectQuery__OrderByClauseAssignment_4 : ( ruleOrderByClause ) ;
    public final void rule__SelectQuery__OrderByClauseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2741:1: ( ( ruleOrderByClause ) )
            // InternalMSQLQueryParser.g:2742:2: ( ruleOrderByClause )
            {
            // InternalMSQLQueryParser.g:2742:2: ( ruleOrderByClause )
            // InternalMSQLQueryParser.g:2743:3: ruleOrderByClause
            {
             before(grammarAccess.getSelectQueryAccess().getOrderByClauseOrderByClauseParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderByClause();

            state._fsp--;

             after(grammarAccess.getSelectQueryAccess().getOrderByClauseOrderByClauseParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectQuery__OrderByClauseAssignment_4"


    // $ANTLR start "rule__WhatClause__WhatDirectivesAssignment_0"
    // InternalMSQLQueryParser.g:2752:1: rule__WhatClause__WhatDirectivesAssignment_0 : ( ruleWhatDirective ) ;
    public final void rule__WhatClause__WhatDirectivesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2756:1: ( ( ruleWhatDirective ) )
            // InternalMSQLQueryParser.g:2757:2: ( ruleWhatDirective )
            {
            // InternalMSQLQueryParser.g:2757:2: ( ruleWhatDirective )
            // InternalMSQLQueryParser.g:2758:3: ruleWhatDirective
            {
             before(grammarAccess.getWhatClauseAccess().getWhatDirectivesWhatDirectiveParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWhatDirective();

            state._fsp--;

             after(grammarAccess.getWhatClauseAccess().getWhatDirectivesWhatDirectiveParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatClause__WhatDirectivesAssignment_0"


    // $ANTLR start "rule__WhatClause__WhatDirectivesAssignment_1_1"
    // InternalMSQLQueryParser.g:2767:1: rule__WhatClause__WhatDirectivesAssignment_1_1 : ( ruleWhatDirective ) ;
    public final void rule__WhatClause__WhatDirectivesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2771:1: ( ( ruleWhatDirective ) )
            // InternalMSQLQueryParser.g:2772:2: ( ruleWhatDirective )
            {
            // InternalMSQLQueryParser.g:2772:2: ( ruleWhatDirective )
            // InternalMSQLQueryParser.g:2773:3: ruleWhatDirective
            {
             before(grammarAccess.getWhatClauseAccess().getWhatDirectivesWhatDirectiveParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWhatDirective();

            state._fsp--;

             after(grammarAccess.getWhatClauseAccess().getWhatDirectivesWhatDirectiveParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhatClause__WhatDirectivesAssignment_1_1"


    // $ANTLR start "rule__SingleColumnWhatDirective__ColumnReferenceAssignment"
    // InternalMSQLQueryParser.g:2782:1: rule__SingleColumnWhatDirective__ColumnReferenceAssignment : ( ruleColumnReference ) ;
    public final void rule__SingleColumnWhatDirective__ColumnReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2786:1: ( ( ruleColumnReference ) )
            // InternalMSQLQueryParser.g:2787:2: ( ruleColumnReference )
            {
            // InternalMSQLQueryParser.g:2787:2: ( ruleColumnReference )
            // InternalMSQLQueryParser.g:2788:3: ruleColumnReference
            {
             before(grammarAccess.getSingleColumnWhatDirectiveAccess().getColumnReferenceColumnReferenceParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnReference();

            state._fsp--;

             after(grammarAccess.getSingleColumnWhatDirectiveAccess().getColumnReferenceColumnReferenceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleColumnWhatDirective__ColumnReferenceAssignment"


    // $ANTLR start "rule__FromClause__TableReferenceAssignment_1"
    // InternalMSQLQueryParser.g:2797:1: rule__FromClause__TableReferenceAssignment_1 : ( ruleTableReference ) ;
    public final void rule__FromClause__TableReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2801:1: ( ( ruleTableReference ) )
            // InternalMSQLQueryParser.g:2802:2: ( ruleTableReference )
            {
            // InternalMSQLQueryParser.g:2802:2: ( ruleTableReference )
            // InternalMSQLQueryParser.g:2803:3: ruleTableReference
            {
             before(grammarAccess.getFromClauseAccess().getTableReferenceTableReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTableReference();

            state._fsp--;

             after(grammarAccess.getFromClauseAccess().getTableReferenceTableReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FromClause__TableReferenceAssignment_1"


    // $ANTLR start "rule__WhereClause__ExpressionAssignment_1"
    // InternalMSQLQueryParser.g:2812:1: rule__WhereClause__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__WhereClause__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2816:1: ( ( ruleExpression ) )
            // InternalMSQLQueryParser.g:2817:2: ( ruleExpression )
            {
            // InternalMSQLQueryParser.g:2817:2: ( ruleExpression )
            // InternalMSQLQueryParser.g:2818:3: ruleExpression
            {
             before(grammarAccess.getWhereClauseAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhereClauseAccess().getExpressionExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereClause__ExpressionAssignment_1"


    // $ANTLR start "rule__OrderByClause__OrderDirectivesAssignment_2"
    // InternalMSQLQueryParser.g:2827:1: rule__OrderByClause__OrderDirectivesAssignment_2 : ( ruleOrderDirective ) ;
    public final void rule__OrderByClause__OrderDirectivesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2831:1: ( ( ruleOrderDirective ) )
            // InternalMSQLQueryParser.g:2832:2: ( ruleOrderDirective )
            {
            // InternalMSQLQueryParser.g:2832:2: ( ruleOrderDirective )
            // InternalMSQLQueryParser.g:2833:3: ruleOrderDirective
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderDirectivesOrderDirectiveParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderDirective();

            state._fsp--;

             after(grammarAccess.getOrderByClauseAccess().getOrderDirectivesOrderDirectiveParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__OrderDirectivesAssignment_2"


    // $ANTLR start "rule__OrderByClause__OrderDirectivesAssignment_3_1"
    // InternalMSQLQueryParser.g:2842:1: rule__OrderByClause__OrderDirectivesAssignment_3_1 : ( ruleOrderDirective ) ;
    public final void rule__OrderByClause__OrderDirectivesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2846:1: ( ( ruleOrderDirective ) )
            // InternalMSQLQueryParser.g:2847:2: ( ruleOrderDirective )
            {
            // InternalMSQLQueryParser.g:2847:2: ( ruleOrderDirective )
            // InternalMSQLQueryParser.g:2848:3: ruleOrderDirective
            {
             before(grammarAccess.getOrderByClauseAccess().getOrderDirectivesOrderDirectiveParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderDirective();

            state._fsp--;

             after(grammarAccess.getOrderByClauseAccess().getOrderDirectivesOrderDirectiveParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderByClause__OrderDirectivesAssignment_3_1"


    // $ANTLR start "rule__OrderDirective__ColumnReferenceAssignment_0"
    // InternalMSQLQueryParser.g:2857:1: rule__OrderDirective__ColumnReferenceAssignment_0 : ( ruleColumnReference ) ;
    public final void rule__OrderDirective__ColumnReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2861:1: ( ( ruleColumnReference ) )
            // InternalMSQLQueryParser.g:2862:2: ( ruleColumnReference )
            {
            // InternalMSQLQueryParser.g:2862:2: ( ruleColumnReference )
            // InternalMSQLQueryParser.g:2863:3: ruleColumnReference
            {
             before(grammarAccess.getOrderDirectiveAccess().getColumnReferenceColumnReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnReference();

            state._fsp--;

             after(grammarAccess.getOrderDirectiveAccess().getColumnReferenceColumnReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDirective__ColumnReferenceAssignment_0"


    // $ANTLR start "rule__OrderDirective__DirectionAssignment_1"
    // InternalMSQLQueryParser.g:2872:1: rule__OrderDirective__DirectionAssignment_1 : ( ruleOrderDirection ) ;
    public final void rule__OrderDirective__DirectionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2876:1: ( ( ruleOrderDirection ) )
            // InternalMSQLQueryParser.g:2877:2: ( ruleOrderDirection )
            {
            // InternalMSQLQueryParser.g:2877:2: ( ruleOrderDirection )
            // InternalMSQLQueryParser.g:2878:3: ruleOrderDirection
            {
             before(grammarAccess.getOrderDirectiveAccess().getDirectionOrderDirectionEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrderDirection();

            state._fsp--;

             after(grammarAccess.getOrderDirectiveAccess().getDirectionOrderDirectionEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrderDirective__DirectionAssignment_1"


    // $ANTLR start "rule__OrExpression__OperatorAssignment_1_1"
    // InternalMSQLQueryParser.g:2887:1: rule__OrExpression__OperatorAssignment_1_1 : ( ruleOrOperator ) ;
    public final void rule__OrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2891:1: ( ( ruleOrOperator ) )
            // InternalMSQLQueryParser.g:2892:2: ( ruleOrOperator )
            {
            // InternalMSQLQueryParser.g:2892:2: ( ruleOrOperator )
            // InternalMSQLQueryParser.g:2893:3: ruleOrOperator
            {
             before(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOrOperator();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getOperatorOrOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__OrExpression__Expression2Assignment_1_2"
    // InternalMSQLQueryParser.g:2902:1: rule__OrExpression__Expression2Assignment_1_2 : ( ruleAndExpression ) ;
    public final void rule__OrExpression__Expression2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2906:1: ( ( ruleAndExpression ) )
            // InternalMSQLQueryParser.g:2907:2: ( ruleAndExpression )
            {
            // InternalMSQLQueryParser.g:2907:2: ( ruleAndExpression )
            // InternalMSQLQueryParser.g:2908:3: ruleAndExpression
            {
             before(grammarAccess.getOrExpressionAccess().getExpression2AndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExpression();

            state._fsp--;

             after(grammarAccess.getOrExpressionAccess().getExpression2AndExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpression__Expression2Assignment_1_2"


    // $ANTLR start "rule__AndExpression__OperatorAssignment_1_1"
    // InternalMSQLQueryParser.g:2917:1: rule__AndExpression__OperatorAssignment_1_1 : ( ruleAndOperator ) ;
    public final void rule__AndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2921:1: ( ( ruleAndOperator ) )
            // InternalMSQLQueryParser.g:2922:2: ( ruleAndOperator )
            {
            // InternalMSQLQueryParser.g:2922:2: ( ruleAndOperator )
            // InternalMSQLQueryParser.g:2923:3: ruleAndOperator
            {
             before(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAndOperator();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getOperatorAndOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AndExpression__Expression2Assignment_1_2"
    // InternalMSQLQueryParser.g:2932:1: rule__AndExpression__Expression2Assignment_1_2 : ( ruleAndOperand ) ;
    public final void rule__AndExpression__Expression2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2936:1: ( ( ruleAndOperand ) )
            // InternalMSQLQueryParser.g:2937:2: ( ruleAndOperand )
            {
            // InternalMSQLQueryParser.g:2937:2: ( ruleAndOperand )
            // InternalMSQLQueryParser.g:2938:3: ruleAndOperand
            {
             before(grammarAccess.getAndExpressionAccess().getExpression2AndOperandParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAndOperand();

            state._fsp--;

             after(grammarAccess.getAndExpressionAccess().getExpression2AndOperandParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpression__Expression2Assignment_1_2"


    // $ANTLR start "rule__NotExpression__OperatorAssignment_0"
    // InternalMSQLQueryParser.g:2947:1: rule__NotExpression__OperatorAssignment_0 : ( ruleNotOperator ) ;
    public final void rule__NotExpression__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2951:1: ( ( ruleNotOperator ) )
            // InternalMSQLQueryParser.g:2952:2: ( ruleNotOperator )
            {
            // InternalMSQLQueryParser.g:2952:2: ( ruleNotOperator )
            // InternalMSQLQueryParser.g:2953:3: ruleNotOperator
            {
             before(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNotOperator();

            state._fsp--;

             after(grammarAccess.getNotExpressionAccess().getOperatorNotOperatorEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__OperatorAssignment_0"


    // $ANTLR start "rule__NotExpression__ExpressionAssignment_1"
    // InternalMSQLQueryParser.g:2962:1: rule__NotExpression__ExpressionAssignment_1 : ( ruleComparativeExpression ) ;
    public final void rule__NotExpression__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2966:1: ( ( ruleComparativeExpression ) )
            // InternalMSQLQueryParser.g:2967:2: ( ruleComparativeExpression )
            {
            // InternalMSQLQueryParser.g:2967:2: ( ruleComparativeExpression )
            // InternalMSQLQueryParser.g:2968:3: ruleComparativeExpression
            {
             before(grammarAccess.getNotExpressionAccess().getExpressionComparativeExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparativeExpression();

            state._fsp--;

             after(grammarAccess.getNotExpressionAccess().getExpressionComparativeExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotExpression__ExpressionAssignment_1"


    // $ANTLR start "rule__ComparativeExpression__OperatorAssignment_1_1"
    // InternalMSQLQueryParser.g:2977:1: rule__ComparativeExpression__OperatorAssignment_1_1 : ( ruleComparativeOperator ) ;
    public final void rule__ComparativeExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2981:1: ( ( ruleComparativeOperator ) )
            // InternalMSQLQueryParser.g:2982:2: ( ruleComparativeOperator )
            {
            // InternalMSQLQueryParser.g:2982:2: ( ruleComparativeOperator )
            // InternalMSQLQueryParser.g:2983:3: ruleComparativeOperator
            {
             before(grammarAccess.getComparativeExpressionAccess().getOperatorComparativeOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparativeOperator();

            state._fsp--;

             after(grammarAccess.getComparativeExpressionAccess().getOperatorComparativeOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ComparativeExpression__Expression2Assignment_1_2"
    // InternalMSQLQueryParser.g:2992:1: rule__ComparativeExpression__Expression2Assignment_1_2 : ( ruleAdditiveExpression ) ;
    public final void rule__ComparativeExpression__Expression2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:2996:1: ( ( ruleAdditiveExpression ) )
            // InternalMSQLQueryParser.g:2997:2: ( ruleAdditiveExpression )
            {
            // InternalMSQLQueryParser.g:2997:2: ( ruleAdditiveExpression )
            // InternalMSQLQueryParser.g:2998:3: ruleAdditiveExpression
            {
             before(grammarAccess.getComparativeExpressionAccess().getExpression2AdditiveExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditiveExpression();

            state._fsp--;

             after(grammarAccess.getComparativeExpressionAccess().getExpression2AdditiveExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparativeExpression__Expression2Assignment_1_2"


    // $ANTLR start "rule__AdditiveExpression__OperatorAssignment_1_1"
    // InternalMSQLQueryParser.g:3007:1: rule__AdditiveExpression__OperatorAssignment_1_1 : ( ruleAdditiveOperator ) ;
    public final void rule__AdditiveExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:3011:1: ( ( ruleAdditiveOperator ) )
            // InternalMSQLQueryParser.g:3012:2: ( ruleAdditiveOperator )
            {
            // InternalMSQLQueryParser.g:3012:2: ( ruleAdditiveOperator )
            // InternalMSQLQueryParser.g:3013:3: ruleAdditiveOperator
            {
             before(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAdditiveOperator();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditiveOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AdditiveExpression__Expression2Assignment_1_2"
    // InternalMSQLQueryParser.g:3022:1: rule__AdditiveExpression__Expression2Assignment_1_2 : ( ruleMultiplicativeExpression ) ;
    public final void rule__AdditiveExpression__Expression2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:3026:1: ( ( ruleMultiplicativeExpression ) )
            // InternalMSQLQueryParser.g:3027:2: ( ruleMultiplicativeExpression )
            {
            // InternalMSQLQueryParser.g:3027:2: ( ruleMultiplicativeExpression )
            // InternalMSQLQueryParser.g:3028:3: ruleMultiplicativeExpression
            {
             before(grammarAccess.getAdditiveExpressionAccess().getExpression2MultiplicativeExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeExpression();

            state._fsp--;

             after(grammarAccess.getAdditiveExpressionAccess().getExpression2MultiplicativeExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditiveExpression__Expression2Assignment_1_2"


    // $ANTLR start "rule__MultiplicativeExpression__OperatorAssignment_1_1"
    // InternalMSQLQueryParser.g:3037:1: rule__MultiplicativeExpression__OperatorAssignment_1_1 : ( ruleMultiplicativeOperator ) ;
    public final void rule__MultiplicativeExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:3041:1: ( ( ruleMultiplicativeOperator ) )
            // InternalMSQLQueryParser.g:3042:2: ( ruleMultiplicativeOperator )
            {
            // InternalMSQLQueryParser.g:3042:2: ( ruleMultiplicativeOperator )
            // InternalMSQLQueryParser.g:3043:3: ruleMultiplicativeOperator
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplicativeOperator();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicativeOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__MultiplicativeExpression__Expression2Assignment_1_2"
    // InternalMSQLQueryParser.g:3052:1: rule__MultiplicativeExpression__Expression2Assignment_1_2 : ( ruleAtomicExpression ) ;
    public final void rule__MultiplicativeExpression__Expression2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:3056:1: ( ( ruleAtomicExpression ) )
            // InternalMSQLQueryParser.g:3057:2: ( ruleAtomicExpression )
            {
            // InternalMSQLQueryParser.g:3057:2: ( ruleAtomicExpression )
            // InternalMSQLQueryParser.g:3058:3: ruleAtomicExpression
            {
             before(grammarAccess.getMultiplicativeExpressionAccess().getExpression2AtomicExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomicExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicativeExpressionAccess().getExpression2AtomicExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicativeExpression__Expression2Assignment_1_2"


    // $ANTLR start "rule__TableReference__TableAssignment"
    // InternalMSQLQueryParser.g:3067:1: rule__TableReference__TableAssignment : ( ( RULE_ID ) ) ;
    public final void rule__TableReference__TableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:3071:1: ( ( ( RULE_ID ) ) )
            // InternalMSQLQueryParser.g:3072:2: ( ( RULE_ID ) )
            {
            // InternalMSQLQueryParser.g:3072:2: ( ( RULE_ID ) )
            // InternalMSQLQueryParser.g:3073:3: ( RULE_ID )
            {
             before(grammarAccess.getTableReferenceAccess().getTableTableCrossReference_0()); 
            // InternalMSQLQueryParser.g:3074:3: ( RULE_ID )
            // InternalMSQLQueryParser.g:3075:4: RULE_ID
            {
             before(grammarAccess.getTableReferenceAccess().getTableTableIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTableReferenceAccess().getTableTableIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getTableReferenceAccess().getTableTableCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TableReference__TableAssignment"


    // $ANTLR start "rule__ColumnReference__ColumnAssignment"
    // InternalMSQLQueryParser.g:3086:1: rule__ColumnReference__ColumnAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ColumnReference__ColumnAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:3090:1: ( ( ( RULE_ID ) ) )
            // InternalMSQLQueryParser.g:3091:2: ( ( RULE_ID ) )
            {
            // InternalMSQLQueryParser.g:3091:2: ( ( RULE_ID ) )
            // InternalMSQLQueryParser.g:3092:3: ( RULE_ID )
            {
             before(grammarAccess.getColumnReferenceAccess().getColumnColumnCrossReference_0()); 
            // InternalMSQLQueryParser.g:3093:3: ( RULE_ID )
            // InternalMSQLQueryParser.g:3094:4: RULE_ID
            {
             before(grammarAccess.getColumnReferenceAccess().getColumnColumnIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getColumnReferenceAccess().getColumnColumnIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getColumnReferenceAccess().getColumnColumnCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnReference__ColumnAssignment"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // InternalMSQLQueryParser.g:3105:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:3109:1: ( ( RULE_STRING ) )
            // InternalMSQLQueryParser.g:3110:2: ( RULE_STRING )
            {
            // InternalMSQLQueryParser.g:3110:2: ( RULE_STRING )
            // InternalMSQLQueryParser.g:3111:3: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__IntegerLiteral__ValueAssignment"
    // InternalMSQLQueryParser.g:3120:1: rule__IntegerLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntegerLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:3124:1: ( ( RULE_INT ) )
            // InternalMSQLQueryParser.g:3125:2: ( RULE_INT )
            {
            // InternalMSQLQueryParser.g:3125:2: ( RULE_INT )
            // InternalMSQLQueryParser.g:3126:3: RULE_INT
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntegerLiteralAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLiteral__ValueAssignment"


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment"
    // InternalMSQLQueryParser.g:3135:1: rule__BooleanLiteral__ValueAssignment : ( RULE_BOOL ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMSQLQueryParser.g:3139:1: ( ( RULE_BOOL ) )
            // InternalMSQLQueryParser.g:3140:2: ( RULE_BOOL )
            {
            // InternalMSQLQueryParser.g:3140:2: ( RULE_BOOL )
            // InternalMSQLQueryParser.g:3141:3: RULE_BOOL
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueBOOLTerminalRuleCall_0()); 
            match(input,RULE_BOOL,FOLLOW_2); 
             after(grammarAccess.getBooleanLiteralAccess().getValueBOOLTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000080000C0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000780504000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000070038000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000070038002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004400002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200000L});

}