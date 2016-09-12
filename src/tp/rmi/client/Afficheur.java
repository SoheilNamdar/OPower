package tp.rmi.client;

import java.io.Serializable;
import java.rmi.RemoteException;
import tp.rmi.common.ReceiveCallback;

public class Afficheur implements ReceiveCallback,Serializable {

	private static final long serialVersionUID = 1L;
	
	protected Afficheur() throws RemoteException{
		super();
	}
	
	@Override
	public void newMessage(String message) throws RemoteException {
		System.out.println(message);
	}
}
