package com.pernix.log;

import java.awt.Color;

import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

public class JTextAreaLog extends JTextPane implements ILog {
	private static final long serialVersionUID = 3579830156835534334L;
	public JTextAreaLog() {
		this.setEditable(false);
	}
	
	private void writeLog(String message, AttributeSet arrts){
		try {
			this.getDocument().insertString(0, String.format("%s %s", message, "\n"), arrts);
		} catch (BadLocationException e) {
			;
		}
	}

	@Override
	public void Debug(String message) {
		SimpleAttributeSet attrs = new SimpleAttributeSet();
		
		StyleConstants.setForeground(attrs, new Color(0,102,0));
		message = String.format("%s =>%s", LogMsgBase.getBaseDebugMsg(), message);
		this.writeLog(message, attrs);
	}

	@Override
	public void Error(String message) {
		SimpleAttributeSet attrs = new SimpleAttributeSet();
		StyleConstants.setForeground(attrs, Color.RED);
		message = String.format("%s =>%s", LogMsgBase.getBaseErrorMsg(), message);
		this.writeLog(message, attrs);
	}

	@Override
	public void Info(String message) {
		SimpleAttributeSet attrs = new SimpleAttributeSet();
		StyleConstants.setForeground(attrs, Color.GRAY);
		message = String.format("%s =>%s", LogMsgBase.getBaseInfoMsg(), message);
		this.writeLog(message, attrs);
	}

	@Override
	public void Warning(String message) {
		SimpleAttributeSet attrs = new SimpleAttributeSet();
		StyleConstants.setForeground(attrs, Color.ORANGE);
		message = String.format("%s =>%s", LogMsgBase.getBaseWarningMsg(), message);
		this.writeLog(message, attrs);
	}

}
