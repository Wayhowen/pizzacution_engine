package org.mdse.minisql.query.converters;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

public class BOOLValueConverter extends AbstractLexerBasedConverter<Boolean> {
	@Override
	protected String toEscapedString(Boolean value) {
		if (value == null) {
			return "";
		}
		
		if (value == true) {
			return "TRUE";
		}
		
		if (value == false) {
			return "FALSE";
		}
		
		throw new ValueConverterException("Illegal Boolean value encountered.", null, null);
	}

	@Override
	public Boolean toValue(String rawValue, INode node) {
		if (Strings.isEmpty(rawValue)) {
			throw new ValueConverterException("Cannot convert empty string to Boolean.", node, null);
		}

		if (rawValue.equalsIgnoreCase("TRUE")) {
			return true;
		}
		
		if (rawValue.equalsIgnoreCase("FALSE")) {
			return false;
		}
		
		throw new ValueConverterException("Illegal literal \"" + rawValue + "\" for Boolean value encountered.", node, null);
	}

}