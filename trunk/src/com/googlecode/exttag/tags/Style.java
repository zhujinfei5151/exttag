package com.googlecode.exttag.tags;

import javax.servlet.jsp.JspException;

import com.googlecode.exttag.ExtScope;
import com.googlecode.exttag.ExtTag;

public class Style extends ExtTag {

	private static final long serialVersionUID = 1L;

	@Override
	public int doStartTag() throws JspException {
		super.pushExtScope(new ExtScope("style", ExtScope.IN_ROOT));
		return EVAL_BODY_BUFFERED;
	}

	@Override
	public int doEndTag() throws JspException {
		if (bodyContent != null) {
			defineStyle(filter(bodyContent.getString()));
		}
		super.popExtScope();
		return EVAL_PAGE;
	}

}