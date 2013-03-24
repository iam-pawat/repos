package com.pernix.log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogMsgBase {
	private static String getLogMsgBase() {
	    Date now = new Date();
		SimpleDateFormat simpleFormat =new SimpleDateFormat("yyyy.MM.dd, HH:mm:ss");
		return new String(simpleFormat.format(now));
	}
	public static String getBaseInfoMsg(){
		return String.format("%s %s ", getLogMsgBase(), "[INFO]");
	}
	
	public static String getBaseErrorMsg(){
		return String.format("%s %s ", getLogMsgBase(), "[ERROR]");
	}
	
	public static String getBaseWarningMsg(){
		return String.format("%s %s ", getLogMsgBase(), "[WARNING]");
	}
	
	public static String getBaseDebugMsg(){
		return String.format("%s %s ", getLogMsgBase(), "[DEBUG]");
	}

}
