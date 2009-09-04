package com.googlecode.exttag.tags.ext.grid;

import com.googlecode.exttag.ComponentTag;
import com.googlecode.exttag.Description;

@Description("A specific Ext.data.Record type that represents a name/value pair and is made to work with the Ext.grid.PropertyGrid. Typically, PropertyRecords do not need to be created directly as they can be created implicitly by simply using the appropriate data configs either via the Ext.grid.PropertyGrid.source config property or by calling Ext.grid.PropertyGrid.setSource. However, if the need arises, these records can also be created explicitly as shwon below. Example usage:"
		+ "var rec = new Ext.grid.PropertyRecord({"
		+ "    name: 'Birthday',"
		+ "    value: new Date(Date.parse('05/26/1972'))"
		+ "});"
		+ "// Add record to an already populated grid"
		+ "grid.store.addSorted(rec);")
public class PropertyRecord extends ComponentTag {

}
