package org.mdse.minisql.query.interpreter.eclipse.launch;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.mdse.minisql.query.SelectQuery;
import org.mdse.minisql.query.interpreter.MSQLQueryInterpreter;
import org.mdse.minisql.query.interpreter.MSQLQueryInterpreterException;
import org.mdse.minisql.query.interpreter.ResultData;
import org.mdse.minisql.query.interpreter.RowData;
import org.mdse.minisql.query.interpreter.eclipse.MSQLQueryEclipseUtil;

public class MSQLQueryLaunchShortcut implements ILaunchShortcut {

	@Override
	public void launch(ISelection selection, String mode) {
		//Load model
		IFile file = MSQLQueryEclipseUtil.getFirstIFileFromSelectionWithExtension("msqlquery", selection);
		SelectQuery query = (SelectQuery) MSQLQueryEclipseUtil.loadModel(file);

		interpretSelectQuery(query);
	}
	
	@Override
	public void launch(IEditorPart editor, String mode) {
		if (editor instanceof XtextEditor) {
			XtextEditor xtextEditor = (XtextEditor) editor;
			
			IXtextDocument document = xtextEditor.getDocument();
			document.readOnly(new IUnitOfWork<Void, XtextResource>() {
				public java.lang.Void exec(XtextResource state) throws Exception {
					List<EObject> contents = state.getContents();
					
					if (!contents.isEmpty()) {
						EObject root = contents.get(0);
						
						if (root instanceof SelectQuery) {
							SelectQuery query = (SelectQuery) root;
							interpretSelectQuery(query);
						}
					}
					
					return null;
				}
			});
			
			return;
		}
		
		String title = "Unsupported Launch Selection.";
		String message = "The file appears to not be a proper MiniSQL Query.";
		MessageDialog.openError(null, title, message);
	}
	
	protected void interpretSelectQuery(SelectQuery selectQuery) {
		try {
			MSQLQueryInterpreter interpreter = new MSQLQueryInterpreter();
			ResultData resultData = interpreter.interpret(selectQuery);
			
			printResultDataToConsole(resultData);
		} catch (MSQLQueryInterpreterException e) {
			String title = "Error";
			String message = e.getMessage();
			MessageDialog.openError(null, title, message);
		}
	}
	
	protected void printResultDataToConsole(ResultData resultData) {
		// Reroute output to console of runtime instance
		MessageConsole console = MSQLQueryEclipseUtil.findOrCreateConsole("MiniSQL Query Interpreter");
		console.clearConsole();
		console.activate();
		OutputStream consoleOutputStream = console.newOutputStream();
		
		//Print the actual query result
		println("Query result:", consoleOutputStream);
		
		List<RowData> tableData = resultData.getTableData();
		for (RowData rowData : tableData) {
			println(rowData.toString(), consoleOutputStream);
		}
		
		println(consoleOutputStream);
	}
	
	protected static void println(OutputStream out) {
		println("", out);
	}
	
	protected static void println(String message, OutputStream out) {
		message += System.lineSeparator();

		print(message, out);
	}
	
	protected static void print(String message, OutputStream out) {
		try {
			out.write(message.getBytes());
		} catch(IOException e) {
			System.err.println("Problem writing to output stream.");
			e.printStackTrace();
		}
	}
}
