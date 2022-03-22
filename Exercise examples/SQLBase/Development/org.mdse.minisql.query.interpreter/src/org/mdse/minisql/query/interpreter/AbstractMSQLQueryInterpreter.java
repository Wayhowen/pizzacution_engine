package org.mdse.minisql.query.interpreter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.mdse.minisql.schema.Column;
import org.mdse.minisql.schema.Table;
import org.mdse.minisql.types.BooleanType;
import org.mdse.minisql.types.IntegerType;
import org.mdse.minisql.types.StringType;
import org.mdse.minisql.types.Type;

public abstract class AbstractMSQLQueryInterpreter {

	protected File getCSVFile(Table table) {
		Resource resource = table.eResource();
		URI resourceURI = resource.getURI();
		
		URI csvFileURI = resourceURI.trimFileExtension().appendFileExtension("csv");
		
		String csvFileURIString = null;
		
		if (csvFileURI.isFile()) {
			csvFileURIString = csvFileURI.toFileString();
		} else if (resourceURI.isPlatform()) {
			csvFileURIString = csvFileURI.toPlatformString(true);
		}
		
		if (csvFileURIString == null) {
			return null;
		}
		
		IPath relativeCSVFilePath = new Path(csvFileURIString);
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot workspaceRoot = workspace.getRoot();
		
		IFile file = workspaceRoot.getFile(relativeCSVFilePath);
		IPath absoluteCSVFilePath = file.getLocation();
		
		File csvFile = absoluteCSVFilePath.toFile();

//		System.out.println("Absolute CSV file Path: " + absoluteCSVFilePath);
//		System.out.println("CSV File: " + csvFile);
		
		
		return csvFile;
	}
	
	private List<String> getCSVHeader(Table table) {
		List<Column> columns = table.getColumns();
		List<String> header = new ArrayList<>();
		
		for (Column column : columns) {
			String columnName = column.getName();
			header.add(columnName);
		}
		
		return header;
	}
	
	private Object parseRawValue(String rawValue, Type type) throws MSQLQueryInterpreterException {
		if (rawValue == null) {
			throw new MSQLQueryInterpreterException("Null value cannot be parsed.");
		}
		
		if (type instanceof IntegerType) {
			return Integer.parseInt(rawValue);
		}
		
		if (type instanceof BooleanType) {
			return Boolean.parseBoolean(rawValue);
		}
		
		if (type instanceof StringType) {
			if (rawValue.startsWith("\"") && rawValue.endsWith("\"")) {
				return rawValue.substring(1, rawValue.length() - 1);
			}
			
			return rawValue;
		}
		
		throw new MSQLQueryInterpreterException("Cannot parse type " + type.eClass().getClass().getSimpleName());
	}
	
	protected List<RowData> loadCSVFile(File csvFile, Table table) throws MSQLQueryInterpreterException {
		List<RowData> tableData = new ArrayList<>();
		List<String> header = getCSVHeader(table);
		
		try {
			
			Reader in = new FileReader(csvFile);
			Iterable<CSVRecord> records = CSVFormat.RFC4180
					.withHeader(header.toArray(new String[0]))
					.withIgnoreEmptyLines()
					.withTrim()
					.parse(in);
			
			List<Column> columns = table.getColumns();
			
			for (CSVRecord record : records) {
				RowData rowData = new RowData();
				
				for (Column column : columns) {
					String columnName = column.getName();
					Type type = column.getType();
					
					String rawValue = record.get(columnName);
					Object value = parseRawValue(rawValue, type);
					
					rowData.setColumnData(column, value);
				}
				
				tableData.add(rowData);
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
			throw new MSQLQueryInterpreterException("CSV file \"" + csvFile + "\" not found.");
		} catch (IOException e) {
			e.printStackTrace();
			throw new MSQLQueryInterpreterException("Problem reading CSV file.");
		}
		
		return tableData;
	}
	
	protected static Integer asInteger(Object value) throws MSQLQueryInterpreterException {
		if (value instanceof Integer) {
			return (Integer) value;
		}
		
		throw new MSQLQueryInterpreterException("Value \"" + value + "\" is not of type Integer.");
	}
	
	protected static Boolean asBoolean(Object value) throws MSQLQueryInterpreterException {
		if (value instanceof Boolean) {
			return (Boolean) value;
		}
		
		throw new MSQLQueryInterpreterException("Value \"" + value + "\" is not of type Boolean.");
	}
	
	protected static class RowDataComparator implements Comparator<RowData> {
		private Column column;
		private boolean isAscending;
		
		public RowDataComparator(Column column, boolean isAscending) {
			this.column = column;
			this.isAscending = isAscending;
		}
		
		@Override
		public int compare(RowData rowData1, RowData rowData2) {
			Object columnData1 = rowData1.getColumnData(column);
			Object columnData2 = rowData2.getColumnData(column);
			
//			int result = doCompare(columnData1, columnData2);
//			
//			if (!isAscending) {
//				//If sorting in descending order, invert the result.
//				result = -result;
//			}
			
			if (isAscending) {
				return doCompare(columnData1, columnData2);
			} else {
				return doCompare(columnData2, columnData1);
			}
		}
		
		protected int doCompare(Object columnData1, Object columnData2) {
			//Workaround for Integer, Boolean and String not having a common super class that is still comparable.
			if (columnData1 instanceof String && columnData2 instanceof String) {
				String specificData1 = (String) columnData1;
				String specificData2 = (String) columnData2;
				
				return specificData1.compareTo(specificData2);
			}
			
			if (columnData1 instanceof Integer && columnData2 instanceof Integer) {
				Integer specificData1 = (Integer) columnData1;
				Integer specificData2 = (Integer) columnData2;
				
				return specificData1.compareTo(specificData2);
			}
			
			if (columnData1 instanceof Boolean && columnData2 instanceof Boolean) {
				Boolean specificData1 = (Boolean) columnData1;
				Boolean specificData2 = (Boolean) columnData2;
				
				return specificData1.compareTo(specificData2);
			}
			
			throw new InvalidParameterException("Column data is not comparable!");
		}
	}
}
