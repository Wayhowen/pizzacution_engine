package org.mdse.minisql.query.interpreter;

import java.util.ArrayList;
import java.util.List;

public class ResultData {
	private List<RowData> tableData;
	
	public ResultData() {
		tableData = new ArrayList<>();
	}
	
	public ResultData(List<RowData> tableData) {
		this.tableData = tableData;
	}
	
	public List<RowData> getTableData() {
		return tableData;
	}
}
