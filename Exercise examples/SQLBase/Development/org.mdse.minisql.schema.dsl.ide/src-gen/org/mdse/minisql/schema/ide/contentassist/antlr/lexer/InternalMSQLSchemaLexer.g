/*
 * generated by Xtext 2.20.0
 */
lexer grammar InternalMSQLSchemaLexer;

@header {
package org.mdse.minisql.schema.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

String : ('S'|'s')('T'|'t')('R'|'r')('I'|'i')('N'|'n')('G'|'g');

TABLE : ('T'|'t')('A'|'a')('B'|'b')('L'|'l')('E'|'e');

Bool : ('B'|'b')('O'|'o')('O'|'o')('L'|'l');

Int : ('I'|'i')('N'|'n')('T'|'t');

Comma : ',';

Colon : ':';

LeftCurlyBracket : '{';

RightCurlyBracket : '}';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
