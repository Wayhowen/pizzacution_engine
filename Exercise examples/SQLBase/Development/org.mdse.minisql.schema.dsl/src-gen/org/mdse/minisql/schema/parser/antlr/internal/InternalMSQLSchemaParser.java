package org.mdse.minisql.schema.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mdse.minisql.schema.services.MSQLSchemaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMSQLSchemaParser extends AbstractInternalAntlrParser {
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

        public InternalMSQLSchemaParser(TokenStream input, MSQLSchemaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Table";
       	}

       	@Override
       	protected MSQLSchemaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTable"
    // InternalMSQLSchemaParser.g:57:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalMSQLSchemaParser.g:57:46: (iv_ruleTable= ruleTable EOF )
            // InternalMSQLSchemaParser.g:58:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalMSQLSchemaParser.g:64:1: ruleTable returns [EObject current=null] : (otherlv_0= TABLE ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftCurlyBracket ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= Comma ( (lv_columns_5_0= ruleColumn ) ) )* otherlv_6= RightCurlyBracket ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_columns_3_0 = null;

        EObject lv_columns_5_0 = null;



        	enterRule();

        try {
            // InternalMSQLSchemaParser.g:70:2: ( (otherlv_0= TABLE ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftCurlyBracket ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= Comma ( (lv_columns_5_0= ruleColumn ) ) )* otherlv_6= RightCurlyBracket ) )
            // InternalMSQLSchemaParser.g:71:2: (otherlv_0= TABLE ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftCurlyBracket ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= Comma ( (lv_columns_5_0= ruleColumn ) ) )* otherlv_6= RightCurlyBracket )
            {
            // InternalMSQLSchemaParser.g:71:2: (otherlv_0= TABLE ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftCurlyBracket ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= Comma ( (lv_columns_5_0= ruleColumn ) ) )* otherlv_6= RightCurlyBracket )
            // InternalMSQLSchemaParser.g:72:3: otherlv_0= TABLE ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftCurlyBracket ( (lv_columns_3_0= ruleColumn ) ) (otherlv_4= Comma ( (lv_columns_5_0= ruleColumn ) ) )* otherlv_6= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,TABLE,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTABLEKeyword_0());
            		
            // InternalMSQLSchemaParser.g:76:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMSQLSchemaParser.g:77:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMSQLSchemaParser.g:77:4: (lv_name_1_0= RULE_ID )
            // InternalMSQLSchemaParser.g:78:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMSQLSchemaParser.g:98:3: ( (lv_columns_3_0= ruleColumn ) )
            // InternalMSQLSchemaParser.g:99:4: (lv_columns_3_0= ruleColumn )
            {
            // InternalMSQLSchemaParser.g:99:4: (lv_columns_3_0= ruleColumn )
            // InternalMSQLSchemaParser.g:100:5: lv_columns_3_0= ruleColumn
            {

            					newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_columns_3_0=ruleColumn();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					add(
            						current,
            						"columns",
            						lv_columns_3_0,
            						"org.mdse.minisql.schema.MSQLSchema.Column");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMSQLSchemaParser.g:117:3: (otherlv_4= Comma ( (lv_columns_5_0= ruleColumn ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Comma) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMSQLSchemaParser.g:118:4: otherlv_4= Comma ( (lv_columns_5_0= ruleColumn ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTableAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMSQLSchemaParser.g:122:4: ( (lv_columns_5_0= ruleColumn ) )
            	    // InternalMSQLSchemaParser.g:123:5: (lv_columns_5_0= ruleColumn )
            	    {
            	    // InternalMSQLSchemaParser.g:123:5: (lv_columns_5_0= ruleColumn )
            	    // InternalMSQLSchemaParser.g:124:6: lv_columns_5_0= ruleColumn
            	    {

            	    						newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_columns_5_0=ruleColumn();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTableRule());
            	    						}
            	    						add(
            	    							current,
            	    							"columns",
            	    							lv_columns_5_0,
            	    							"org.mdse.minisql.schema.MSQLSchema.Column");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // InternalMSQLSchemaParser.g:150:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalMSQLSchemaParser.g:150:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalMSQLSchemaParser.g:151:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalMSQLSchemaParser.g:157:1: ruleColumn returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMSQLSchemaParser.g:163:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) ) ) )
            // InternalMSQLSchemaParser.g:164:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalMSQLSchemaParser.g:164:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) ) )
            // InternalMSQLSchemaParser.g:165:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_type_2_0= ruleType ) )
            {
            // InternalMSQLSchemaParser.g:165:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMSQLSchemaParser.g:166:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMSQLSchemaParser.g:166:4: (lv_name_0_0= RULE_ID )
            // InternalMSQLSchemaParser.g:167:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_0_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getColumnRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getColonKeyword_1());
            		
            // InternalMSQLSchemaParser.g:187:3: ( (lv_type_2_0= ruleType ) )
            // InternalMSQLSchemaParser.g:188:4: (lv_type_2_0= ruleType )
            {
            // InternalMSQLSchemaParser.g:188:4: (lv_type_2_0= ruleType )
            // InternalMSQLSchemaParser.g:189:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getTypeTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.mdse.minisql.types.MSQLTypes.Type");
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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleType"
    // InternalMSQLSchemaParser.g:210:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMSQLSchemaParser.g:210:45: (iv_ruleType= ruleType EOF )
            // InternalMSQLSchemaParser.g:211:2: iv_ruleType= ruleType EOF
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
    // InternalMSQLSchemaParser.g:217:1: ruleType returns [EObject current=null] : (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_BooleanType_2= ruleBooleanType ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerType_0 = null;

        EObject this_StringType_1 = null;

        EObject this_BooleanType_2 = null;



        	enterRule();

        try {
            // InternalMSQLSchemaParser.g:223:2: ( (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_BooleanType_2= ruleBooleanType ) )
            // InternalMSQLSchemaParser.g:224:2: (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_BooleanType_2= ruleBooleanType )
            {
            // InternalMSQLSchemaParser.g:224:2: (this_IntegerType_0= ruleIntegerType | this_StringType_1= ruleStringType | this_BooleanType_2= ruleBooleanType )
            int alt2=3;
            switch ( input.LA(1) ) {
            case Int:
                {
                alt2=1;
                }
                break;
            case String:
                {
                alt2=2;
                }
                break;
            case Bool:
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
                    // InternalMSQLSchemaParser.g:225:3: this_IntegerType_0= ruleIntegerType
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
                    // InternalMSQLSchemaParser.g:234:3: this_StringType_1= ruleStringType
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
                    // InternalMSQLSchemaParser.g:243:3: this_BooleanType_2= ruleBooleanType
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
    // InternalMSQLSchemaParser.g:255:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // InternalMSQLSchemaParser.g:255:52: (iv_ruleIntegerType= ruleIntegerType EOF )
            // InternalMSQLSchemaParser.g:256:2: iv_ruleIntegerType= ruleIntegerType EOF
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
    // InternalMSQLSchemaParser.g:262:1: ruleIntegerType returns [EObject current=null] : (otherlv_0= Int () ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMSQLSchemaParser.g:268:2: ( (otherlv_0= Int () ) )
            // InternalMSQLSchemaParser.g:269:2: (otherlv_0= Int () )
            {
            // InternalMSQLSchemaParser.g:269:2: (otherlv_0= Int () )
            // InternalMSQLSchemaParser.g:270:3: otherlv_0= Int ()
            {
            otherlv_0=(Token)match(input,Int,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getIntegerTypeAccess().getIntKeyword_0());
            		
            // InternalMSQLSchemaParser.g:274:3: ()
            // InternalMSQLSchemaParser.g:275:4: 
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
    // InternalMSQLSchemaParser.g:285:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalMSQLSchemaParser.g:285:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalMSQLSchemaParser.g:286:2: iv_ruleStringType= ruleStringType EOF
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
    // InternalMSQLSchemaParser.g:292:1: ruleStringType returns [EObject current=null] : (otherlv_0= String () ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMSQLSchemaParser.g:298:2: ( (otherlv_0= String () ) )
            // InternalMSQLSchemaParser.g:299:2: (otherlv_0= String () )
            {
            // InternalMSQLSchemaParser.g:299:2: (otherlv_0= String () )
            // InternalMSQLSchemaParser.g:300:3: otherlv_0= String ()
            {
            otherlv_0=(Token)match(input,String,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getStringTypeAccess().getStringKeyword_0());
            		
            // InternalMSQLSchemaParser.g:304:3: ()
            // InternalMSQLSchemaParser.g:305:4: 
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
    // InternalMSQLSchemaParser.g:315:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalMSQLSchemaParser.g:315:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalMSQLSchemaParser.g:316:2: iv_ruleBooleanType= ruleBooleanType EOF
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
    // InternalMSQLSchemaParser.g:322:1: ruleBooleanType returns [EObject current=null] : (otherlv_0= Bool () ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMSQLSchemaParser.g:328:2: ( (otherlv_0= Bool () ) )
            // InternalMSQLSchemaParser.g:329:2: (otherlv_0= Bool () )
            {
            // InternalMSQLSchemaParser.g:329:2: (otherlv_0= Bool () )
            // InternalMSQLSchemaParser.g:330:3: otherlv_0= Bool ()
            {
            otherlv_0=(Token)match(input,Bool,FOLLOW_2); 

            			newLeafNode(otherlv_0, grammarAccess.getBooleanTypeAccess().getBoolKeyword_0());
            		
            // InternalMSQLSchemaParser.g:334:3: ()
            // InternalMSQLSchemaParser.g:335:4: 
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000000D0L});

}