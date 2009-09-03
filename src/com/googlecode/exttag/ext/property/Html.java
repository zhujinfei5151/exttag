package com.googlecode.exttag.ext.property;

import com.googlecode.exttag.ComponentTag;

public class Html extends ComponentTag {

	@Override
	protected String getComponentDefine() {
		String html = "";
		if (bodyContent != null)
			html = filter(bodyContent.getString());
		html = html.replace("\\", "\\\\");
		html = html.replace("\t", "\\t");
		html = html.replace("\f", "\\f");
		html = html.replace("\r", "\\r");
		html = html.replace(" ", "\\n ");
		html = html.replace("\"", "\\\"");
		html = html.replace("\'", "\\\'");
		return "\"" + html + "\"";
	}

	@Override
	protected String getDefaultKey() {
		return "html";
	}

}
