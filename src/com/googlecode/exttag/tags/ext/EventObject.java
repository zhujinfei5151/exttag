package com.googlecode.exttag.tags.ext;

import com.googlecode.exttag.Description;
import com.googlecode.exttag.tags.AbstractMapTag;

/**
 * 
 * @author oscar.xie
 * 
 */
@Description("EventObject exposes the Yahoo! UI Event functionality directly on the object passed to your event handler. It exists mostly for convenience. It also fixes the annoying null checks automatically to cleanup your code Example:"
		+ "function handleClick(e){ // e is not a standard event object, it is a Ext.EventObject"
		+ "    e.preventDefault();"
		+ "    var target = e.getTarget();"
		+ "    ..."
		+ " }"
		+ " var myDiv = Ext.get('myDiv');"
		+ " myDiv.on('click', handleClick);"
		+ " //or"
		+ " Ext.EventManager.on('myDiv', 'click', handleClick);"
		+ " Ext.EventManager.addListener('myDiv', 'click', handleClick);")
public class EventObject extends AbstractMapTag {

}
