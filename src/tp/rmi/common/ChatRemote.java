package tp.rmi.common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

//objets distants utilisent l'interface, les autres methodes ne sont pas accessible à distant
//ts les interfaces contient java.rmi.Remote pour les objets distants
//methodes contient throws java.rmi.RemoteException
//methodes de interface contient throws RemoteException;
public interface ChatRemote extends Remote {
	public String echo(String name, String message) throws RemoteException;

	public void send(String name, String message) throws RemoteException;

	public void registerCallback(ReceiveCallback callback) throws RemoteException;
	
}
