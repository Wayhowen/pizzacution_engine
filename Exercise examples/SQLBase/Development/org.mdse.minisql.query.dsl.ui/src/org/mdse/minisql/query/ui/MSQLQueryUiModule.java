/*
 * generated by Xtext 2.20.0
 */
package org.mdse.minisql.query.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ide.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.mdse.minisql.query.ide.MSQLQueryAntlrTokenToAttributeIdMapper;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
public class MSQLQueryUiModule extends AbstractMSQLQueryUiModule {

	public MSQLQueryUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return MSQLQueryAntlrTokenToAttributeIdMapper.class;
	}
}
