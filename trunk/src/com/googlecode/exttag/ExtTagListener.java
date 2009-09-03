package com.googlecode.exttag;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ExtTagListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event) {
		String home = event.getServletContext().getInitParameter("home");
		if (home == null || home.trim().length() == 0) {
			home = "ext-3.0.0/"; // default config
			System.out
					.println("please config: <init-param><param-name>home</param-name><param-value>../ext-3.0.0</param-value></init-param> on "
							+ this.getClass().getName());
		} else {
			home = home.trim();
			if (!home.endsWith("/")) {
				home += "/";
			}
		}
		String styles = event.getServletContext().getInitParameter("styles");
		String scripts = event.getServletContext().getInitParameter("scripts");
		ExtConfig.init(event.getServletContext().getInitParameter("name"),
				home, "resources/css/ext-all.css," + styles,
				"adapter/ext/ext-base.js,ext-all-debug.js,ext-datetime.js,"
						+ scripts);
	}

	public void contextDestroyed(ServletContextEvent event) {
	}

}
