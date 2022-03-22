package org.mdse.minisql.query.interpreter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.mdse.minisql.schema.Column;

public class RowData {
	private Map<Column, Object> rowData;
	
	public RowData() {
		rowData = new LinkedHashMap<>();
	}
	
	public void setColumnData(Column column, Object data) {
		rowData.put(column, data);
	}

	public Object getColumnData(Column column) {
		return rowData.get(column);
	}
	
	public void clearColumnData(Column column) {
		rowData.remove(column);
	}
	
	@Override
	public String toString() {
		String output = "";
		boolean isFirst = true;
		
		for (Entry<Column, Object> entry : rowData.entrySet()) {
			Column column = entry.getKey();
			Object value = entry.getValue();
			
			if (!isFirst) {
				output += " | ";
			}
			
			output += column.getName() + " = " + value;
			
			isFirst = false;
		}
		
		return output;
	}
}
