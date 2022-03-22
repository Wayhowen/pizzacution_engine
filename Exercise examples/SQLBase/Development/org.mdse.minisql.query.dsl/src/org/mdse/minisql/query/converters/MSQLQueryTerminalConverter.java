package org.mdse.minisql.query.converters;

import javax.inject.Inject;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

public class MSQLQueryTerminalConverter extends DefaultTerminalConverters {
	@Inject
	private BOOLValueConverter boolValueConverter;

	@ValueConverter(rule = "BOOL")
	public IValueConverter<Boolean> BOOL() {
		return boolValueConverter;
	}
}
