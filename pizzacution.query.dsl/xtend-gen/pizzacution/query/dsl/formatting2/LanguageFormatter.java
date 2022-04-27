/**
 * generated by Xtext 2.26.0
 */
package pizzacution.query.dsl.formatting2;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import pizzacution.query.SelectQuery;
import pizzacution.query.ThatClause;
import pizzacution.query.ThatDirective;
import pizzacution.query.WhatClause;

@SuppressWarnings("all")
public class LanguageFormatter extends AbstractFormatter2 {
  protected void _format(final SelectQuery selectQuery, @Extension final IFormattableDocument document) {
    document.<WhatClause>format(selectQuery.getWhatClause());
    EList<ThatClause> _thatClause = selectQuery.getThatClause();
    for (final ThatClause thatClause : _thatClause) {
      document.<ThatClause>format(thatClause);
    }
  }
  
  protected void _format(final ThatClause thatClause, @Extension final IFormattableDocument document) {
    document.<ThatDirective>format(thatClause.getThatDirective());
  }
  
  public void format(final Object selectQuery, final IFormattableDocument document) {
    if (selectQuery instanceof XtextResource) {
      _format((XtextResource)selectQuery, document);
      return;
    } else if (selectQuery instanceof SelectQuery) {
      _format((SelectQuery)selectQuery, document);
      return;
    } else if (selectQuery instanceof ThatClause) {
      _format((ThatClause)selectQuery, document);
      return;
    } else if (selectQuery instanceof EObject) {
      _format((EObject)selectQuery, document);
      return;
    } else if (selectQuery == null) {
      _format((Void)null, document);
      return;
    } else if (selectQuery != null) {
      _format(selectQuery, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(selectQuery, document).toString());
    }
  }
}
