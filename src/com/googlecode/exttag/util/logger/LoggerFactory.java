package com.googlecode.exttag.util.logger;

/**
 * 日志输出器工厂
 * @author <a href="mailto:liangfei0201@gmail.com">liangfei</a>
 */
public class LoggerFactory {

	private LoggerFactory() {}

	static { // 查找常用的日志框架
		setLoggerProvider(findLoggerProvider());
	}

	private static LoggerProvider findLoggerProvider() {
	    try {
            LoggerProvider loggerProvider = new Log4jLoggerProvider();
            Logger logger = loggerProvider.getLogger(LoggerFactory.class.getName());
            logger.info("Using " + loggerProvider.getClass().getName());
            return loggerProvider;
        } catch (Throwable e) {
            LoggerProvider loggerProvider = new JdkLoggerProvider();
            Logger logger = loggerProvider.getLogger(LoggerFactory.class.getName());
            logger.info("Using " + loggerProvider.getClass().getName());
            return loggerProvider;
        }
	}

	private static LoggerProvider loggerProvider;

	/**
	 * 设置日志输出器供给器
	 * @param loggerProvider 日志输出器供给器
	 */
	public static synchronized void setLoggerProvider(LoggerProvider loggerProvider) {
		if (loggerProvider != null)
			LoggerFactory.loggerProvider = loggerProvider;
	}

	/**
	 * 获取日志输出器
	 * @param key 分类键
	 * @return 日志输出器, 后验条件: 不返回null.
	 */
	public static Logger getLogger(Class<?> key) {
		return getLogger(key == null ? null : key.getName());
	}

	/**
	 * 获取日志输出器
	 * @param key 分类键
	 * @return 日志输出器, 后验条件: 不返回null.
	 */
	public static Logger getLogger(String key) {
		return loggerProvider.getLogger(key);
	}

}
