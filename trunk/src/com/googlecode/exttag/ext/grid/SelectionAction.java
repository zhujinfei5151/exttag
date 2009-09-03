package com.googlecode.exttag.ext.grid;

public class SelectionAction extends GridAction {

	@Override
	protected String getParamsName() {
		return "selected";
	}

	@Override
	protected String getDataFunction() {
		return "getSelectionModel().getSelections()";
	}
	
}
