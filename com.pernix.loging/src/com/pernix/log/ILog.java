package com.pernix.log;

public interface ILog {
	public void Debug(String message);
	public void Error(String message);
	public void Info(String message);
	public void Warning(String message);
}
