package me.kkuai.kuailian.service.socket;

import me.kkuai.kuailian.service.socket.protocol.Protocol;

/**
 * all to listening data from socket need to implement this interface
 * @author ice
 *
 */

public interface SocketListener
{
	public static final String SOCKET_CONNECTION_FAILED = "com.jiayuan.service.socket.SocketService.connection_failed";
	public static final String SOCKET_CONNECTION_READY = "com.jiayuan.service.socket.SocketService.connection_ready";
	
	/**
	 * call on related data received from server
	 * @param p
	 */
	public void onDataReceived(Protocol p);
	
	/**
	 * notify on connection status changed
	 * @param newStatus
	 */
	public void onConnectionStatusChanged(String newStatus);
}
