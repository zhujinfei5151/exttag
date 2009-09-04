package com.googlecode.exttag;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ExtTagListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event) {
		String home = event.getServletContext().getInitParameter("ext-home");
		if (home == null || home.trim().length() == 0) {
			home = "ext-3.0.0/";
		} else {
			home = home.trim();
			if (! home.endsWith("/")) {
				home += "/";
			}
		}
		String styles = event.getServletContext().getInitParameter("ext-styles");
		if (styles == null || styles.trim().length() == 0) {
		    styles = "resources/css/ext-all.css";
		} else {
		    styles = styles.trim();
		}
		String scripts = event.getServletContext().getInitParameter("ext-scripts");
		if (scripts == null || scripts.trim().length() == 0) {
		    scripts = "adapter/ext/ext-base.js,ext-all.js";
		} else {
		    scripts = scripts.trim();
		}
		ExtConfig.init(home, styles,  scripts);
	}

	public void contextDestroyed(ServletContextEvent event) {
	}

}
