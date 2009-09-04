package com.googlecode.exttag.tags.ext;

import com.googlecode.exttag.ComponentTag;
import com.googlecode.exttag.Description;

/**
 * 
 * @author oscar.xie
 * 
 */
@Description("Represents an HTML fragment template. Templates can be precompiled for greater performance. For a list of available format functions, see Ext.util.Format."
		+ "Usage: "
		+ "var t = new Ext.Template("
		+ "    '<div name='{id}'>',"
		+ "        '<span class='{cls}'>{name:trim} {value:ellipsis(10)}</span>',"
		+ "    '</div>'"
		+ ");"
		+ "t.append('some-element', {id: 'myid', cls: 'myclass', name: 'foo', value: 'bar'});"
		+ "For more information see this blog post with examples: DomHelper - Create Elements using DOM, HTML fragments and Templates. ")
public class Template extends ComponentTag {

}
