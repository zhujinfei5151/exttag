package com.googlecode.exttag.ext.data;

import com.googlecode.exttag.ComponentTag;
import com.googlecode.exttag.Description;

@Description("@Description('Instances of this class encapsulate both record definition information, and record value information for use in Ext.data.Store objects, or any code which needs to access Records cached in an Ext.data.Store object."
		+ "Constructors for this class are generated by passing an Array of field definition objects to create. Instances are usually only created by Ext.data.Reader implementations when processing unformatted data objects."
		+ "Record objects generated by this constructor inherit all the methods of Ext.data.Record listed below.")
public class Record extends ComponentTag {

	@Override
	protected String getComponentConstructor() {
		return super.getExtClassName() + ".create";
	}

	@Override
	protected String getDefaultKey() {
		return "unknow";
	}

	@Override
	protected boolean isList() {
		return true;
	}

}
