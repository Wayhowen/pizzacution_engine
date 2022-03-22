package org.mdse.minisql.query.ide;

import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;

public class MSQLQueryAntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		//Make BOOL values recognized as keywords.
		if ("RULE_BOOL".equals(tokenName)) {
			return HighlightingStyles.KEYWORD_ID;
		}
		
		return super.calculateId(tokenName, tokenType);
	}

}
