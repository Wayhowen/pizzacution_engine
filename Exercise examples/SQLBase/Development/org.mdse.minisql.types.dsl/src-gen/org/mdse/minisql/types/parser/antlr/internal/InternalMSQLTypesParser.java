package org.mdse.minisql.types.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mdse.minisql.types.services.MSQLTypesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMSQLTypesParser extends AbstractInternalAntlrParser {
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

        public InternalMSQLTypesParser(TokenStream input, MSQLTypesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Type";
       	}

       	@Override
       	protected MSQLTypesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleType"
    // InternalMSQLTypes.g:64:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMSQLTypes.g:64:45: (iv_ruleType= ruleType EOF )
            // InternalMSQLTypes.g:65:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // InternalMSQLTypes.g:71:1: ruleType returns [EObject current=null] : (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_BooleanType_2= ruleBooleanType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerType_0 = null;

        EObject this_StringType_1 = null;

        EObject this_BooleanType_2 = null;



        	enterRule();

        try {
            // InternalMSQLTypes.g:77:2: ( (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_BooleanType_2= ruleBooleanType ) )
            // InternalMSQLTypes.g:78:2: (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_BooleanType_2= ruleBooleanType )
            {
            // InternalMSQLTypes.g:78:2: (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_BooleanType_2= ruleBooleanType )
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
                    // InternalMSQLTypes.g:79:3: this_IntegerType_0= ruleIntegerType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getIntegerTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerType_0=ruleIntegerType();

                    state._fsp--;


                    			current = this_IntegerType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMSQLTypes.g:88:3: this_StringType_1= ruleStringType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getStringTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringType_1=ruleStringType();

                    state._fsp--;


                    			current = this_StringType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMSQLTypes.g:97:3: this_BooleanType_2= ruleBooleanType
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getBooleanTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanType_2=ruleBooleanType();

                    state._fsp--;


                    			current = this_BooleanType_2;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleIntegerType"
    // InternalMSQLTypes.g:109:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // InternalMSQLTypes.g:109:52: (iv_ruleIntegerType= ruleIntegerType EOF )
            // InternalMSQLTypes.g:110:2: iv_ruleIntegerType= ruleIntegerType EOF
            {
             newCompositeNode(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerType=ruleIntegerType();

            state._fsp--;

             current =iv_ruleIntegerType; 
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
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // InternalMSQLTypes.g:116:1: ruleIntegerType returns [EObject current=null] : (otherlv_0= 'Int' () ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMSQLTypes.g:122:2: ( (otherlv_0= 'Int' () ) )
            // InternalMSQLTypes.g:123:2: (otherlv_0= 'Int' () )
            {
            // InternalMSQLTypes.g:123:2: (otherlv_0= 'Int' () )
            // InternalMSQLTypes.g:124:3: otherlv_0= 'Int' ()
            {
            otherlv_0=(Token)match(input,11,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getIntegerTypeAccess().getIntKeyword_0());
            		
            // InternalMSQLTypes.g:128:3: ()
            // InternalMSQLTypes.g:129:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_1(),
            					current);
            			

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
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleStringType"
    // InternalMSQLTypes.g:139:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalMSQLTypes.g:139:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalMSQLTypes.g:140:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalMSQLTypes.g:146:1: ruleStringType returns [EObject current=null] : (otherlv_0= 'String' () ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMSQLTypes.g:152:2: ( (otherlv_0= 'String' () ) )
            // InternalMSQLTypes.g:153:2: (otherlv_0= 'String' () )
            {
            // InternalMSQLTypes.g:153:2: (otherlv_0= 'String' () )
            // InternalMSQLTypes.g:154:3: otherlv_0= 'String' ()
            {
            otherlv_0=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getStringTypeAccess().getStringKeyword_0());
            		
            // InternalMSQLTypes.g:158:3: ()
            // InternalMSQLTypes.g:159:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringTypeAccess().getStringTypeAction_1(),
            					current);
            			

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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleBooleanType"
    // InternalMSQLTypes.g:169:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalMSQLTypes.g:169:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalMSQLTypes.g:170:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalMSQLTypes.g:176:1: ruleBooleanType returns [EObject current=null] : (otherlv_0= 'Bool' () ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMSQLTypes.g:182:2: ( (otherlv_0= 'Bool' () ) )
            // InternalMSQLTypes.g:183:2: (otherlv_0= 'Bool' () )
            {
            // InternalMSQLTypes.g:183:2: (otherlv_0= 'Bool' () )
            // InternalMSQLTypes.g:184:3: otherlv_0= 'Bool' ()
            {
            otherlv_0=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanTypeAccess().getBoolKeyword_0());
            		
            // InternalMSQLTypes.g:188:3: ()
            // InternalMSQLTypes.g:189:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_1(),
            					current);
            			

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
    // $ANTLR end "ruleBooleanType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});

}