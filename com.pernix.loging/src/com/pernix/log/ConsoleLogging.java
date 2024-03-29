package com.pernix.log;
// for logging to console
public class ConsoleLogging implements ILog {
//5555
	private void writeLog(String message){
		System.out.println(message + "");
	}
	@Override
	public void Debug(String message) {
		message = String.format("%s =>%s", LogMsgBase.getBaseDebugMsg(), message);
		this.writeLog(message);
	}

	@Override
	public void Error(String message) {
		message = String.format("%s =>%s", LogMsgBase.getBaseErrorMsg(), message);
		this.writeLog(message);
	}

	@Override
	public void Info(String message) {
		message = String.format("%s =>%s", LogMsgBase.getBaseInfoMsg(), message);
		this.writeLog(message);
	}

	@Override
	public void Warning(String message) {
		message = String.format("%s =>%s", LogMsgBase.getBaseWarningMsg(), message);
		this.writeLog(message);
	}

}
