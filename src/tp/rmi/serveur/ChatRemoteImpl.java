package tp.rmi.serveur;

import tp.rmi.common.ChatRemote;
import tp.rmi.common.ReceiveCallback;
import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class ChatRemoteImpl extends UnicastRemoteObject implements ChatRemote, Remote, Serializable {
	
	private static final long serialVersionUID = 1L;

	protected ChatRemoteImpl() throws RemoteException {
		super();
		
	}

	@Override
	public String echo(String name, String message) throws RemoteException {
		
		return null;
	}

	@Override
	public void send(String name, String message) throws RemoteException {
		
		
	}

	@Override
	public void registerCallback(ReceiveCallback callback) throws RemoteException {
		
		
	}
	

}
