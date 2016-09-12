package tp.rmi.common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ReceiveCallback extends Remote {

	//Notifier le client de l'arrivé d'un nouveau message.
	void newMessage(String message) throws RemoteException;

}
