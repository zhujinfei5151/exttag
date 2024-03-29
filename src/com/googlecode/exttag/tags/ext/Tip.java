package com.googlecode.exttag.tags.ext;

import com.googlecode.exttag.Description;
import com.googlecode.exttag.tags.AbstractMapTag;

/**
 * 
 * @author oscar.xie
 * 
 */
@Description("This is the base class for Ext.QuickTip and Ext.Tooltip that provides the basic layout and positioning that all tip-based classes require. This class can be used directly for simple, statically-positioned tips that are displayed programmatically, or it can be extended to provide custom tip implementations. ")
public class Tip extends AbstractMapTag {
	private Boolean closable;
	private String defaultAlign;
	private Integer maxWidth;
	private Integer minWidth;
	private Boolean shadow;

	public Boolean isClosable() {
		return closable;
	}

	@Description("closable : Boolean  "
			+ "True to render a close tool button into the tooltip header (defaults to false).")
	public void setClosable(Boolean closable) {
		this.closable = closable;
	}

	public String getDefaultAlign() {
		return defaultAlign;
	}

	@Description("defaultAlign : String  "
			+ "Experimental. The default Ext.Element.alignTo anchor position value for this tip relative to its element of origin (defaults to 'tl-bl?'). ")
	public void setDefaultAlign(String defaultAlign) {
		this.defaultAlign = defaultAlign;
	}

	public Integer getMaxWidth() {
		return maxWidth;
	}

	@Description("maxWidth : Number  "
			+ "The maximum width of the tip in pixels (defaults to 300). ")
	public void setMaxWidth(Integer maxWidth) {
		this.maxWidth = maxWidth;
	}

	public Integer getMinWidth() {
		return minWidth;
	}

	@Description("minWidth : Number  "
			+ "The minimum width of the tip in pixels (defaults to 40). ")
	public void setMinWidth(Integer minWidth) {
		this.minWidth = minWidth;
	}

	public Boolean isShadow() {
		return shadow;
	}

	@Description("shadow : Boolean/String  "
			+ "True or 'sides' for the default effect, 'frame' for 4-way shadow, and 'drop' for bottom-right shadow (defaults to 'sides'). ")
	public void setShadow(Boolean shadow) {
		this.shadow = shadow;
	}
}
