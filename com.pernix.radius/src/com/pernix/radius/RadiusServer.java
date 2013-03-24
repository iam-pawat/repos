package com.pernix.radius;

import java.net.InetSocketAddress;

import org.tinyradius.packet.AccessRequest;
import org.tinyradius.packet.RadiusPacket;
import org.tinyradius.util.RadiusException;

import com.pernix.log.ILog;

public class RadiusServer extends org.tinyradius.util.RadiusServer {
	private ILog logger;
	public RadiusServer(ILog log) {
		super(log);
		this.logger = log;
	}
    @Override
    public void start(boolean listenAuth, boolean listenAcct) {
    	super.start(listenAuth, listenAcct);
    	logger.Info("Radius Server Started...");
    }
	@Override
	public String getSharedSecret(InetSocketAddress client) {
		if (client.getAddress().getHostAddress().equals("127.0.0.1"))
			return "testing123";
		else
			return null;
	}

	@Override
	public String getUserPassword(String userName) {
		if (userName.equals("mw"))
			return "test";
		else
			return null;
	}

	public RadiusPacket accessRequestReceived(AccessRequest accessRequest,
			InetSocketAddress client) throws RadiusException {
	    String message = "Received Access-Request:\n" + accessRequest;
		System.out.println(message);
		logger.Debug(message);
		RadiusPacket packet = super
				.accessRequestReceived(accessRequest, client);
		if (packet.getPacketType() == RadiusPacket.ACCESS_ACCEPT)
			packet.addAttribute("Reply-Message",
					"Welcome " + accessRequest.getUserName() + "!");
		if (packet == null)
			System.out.println("Ignore packet.");
		else
			System.out.println("Answer:\n" + packet);
		return packet;
	}

}
