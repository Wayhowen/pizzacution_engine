/*
 * generated by Xtext 2.26.0
 */
package pizzacution.query.dsl.formatting2

import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import pizzacution.query.SelectQuery
import pizzacution.query.ThatClause

class LanguageFormatter extends AbstractFormatter2 {
	
	//@Inject extension LanguageGrammarAccess

	def dispatch void format(SelectQuery selectQuery, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		selectQuery.whatClause.format
		for (thatClause : selectQuery.thatClause) {
			thatClause.format
		}
	}

	def dispatch void format(ThatClause thatClause, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		thatClause.thatDirective.format
	}
	
	// TODO: implement for ThatDirective, CostClause, IsServedClause, AtClause, InClause
}