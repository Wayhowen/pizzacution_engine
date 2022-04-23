/*
 * generated by Xtext 2.26.0
 */
package pizzacution.query.dsl.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import pizzacution.query.SelectQuery
import pizzacution.query.dsl.services.QueryLanguageGrammarAccess

class QueryLanguageFormatter extends AbstractFormatter2 {
	
	@Inject extension QueryLanguageGrammarAccess

	def dispatch void format(SelectQuery selectQuery, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		selectQuery.whatClause.format
	}
	
}
