package com.pernix.chat;

import java.io.Serializable;

public class ChatMessage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private MessageType type;
	private String message;
	
	public ChatMessage(MessageType type, String message) {
		this.type = type;
		this.message = message;
	}
}
