package com.googlecode.exttag.tags.ext.layout;

import com.googlecode.exttag.Description;
import com.googlecode.exttag.tags.AbstractMapTag;

@Description("Every layout is composed of one or more Ext.Container elements internally, and ContainerLayout provides the basic foundation for all other layout classes in Ext. It is a non-visual class that simply provides the base logic required for a Container to function as a layout. This class is intended to be extended and should generally not need to be created directly via the new keyword. ")
public class ContainerLayout extends AbstractMapTag {
	private String extraCls;
	private Boolean renderHidden;

	public String getExtraCls() {
		return extraCls;
	}

	@Description("extraCls : String  "
			+ "An optional extra CSS class that will be added to the container (defaults to ''). This can be useful for adding customized styles to the container or any of its children using standard CSS rules. ")
	public void setExtraCls(String extraCls) {
		this.extraCls = extraCls;
	}

	public Boolean isRenderHidden() {
		return renderHidden;
	}

	@Description("renderHidden : Boolean  "
			+ "True to hide each contained item on render (defaults to false). ")
	public void setRenderHidden(Boolean renderHidden) {
		this.renderHidden = renderHidden;
	}
}
