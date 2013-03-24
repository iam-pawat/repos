package org.tinyradius.util;

import com.pernix.log.ILog;

public class LogExtHelper implements ILog {
	private ILog logger;

	public LogExtHelper(ILog log) {
		this.logger = log;
	}

	public void Error(String message) {
		if (logger != null) {
			logger.Error(message);
		}
	}

	public void Debug(String message) {
		if (logger != null) {
			logger.Debug(message);
		}
	}

	public void Info(String message) {
		if (logger != null) {
			logger.Info(message);
		}
	}

	public void Warning(String message) {
		if (logger != null) {
			logger.Warning(message);
		}
	}
}
