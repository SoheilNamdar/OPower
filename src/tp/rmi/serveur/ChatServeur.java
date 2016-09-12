package tp.rmi.serveur;


import java.net.MalformedURLException;
import java.nio.file.Paths;
import java.rmi.Naming;
import java.rmi.RemoteException;

import tp.rmi.common.ChatRemote;

public class ChatServeur {

	public static void main(String[] args) throws MalformedURLException, RemoteException {
		String pathToClasses = Paths.get("bin").toUri().toURL().toString();
		System.out.println(pathToClasses);
		System.setProperty("java.rmi.server.codebase", pathToClasses);
		System.setProperty("java.rmi.server.hostname", "192.168.56.1");
		
		//identifier objet distant
		ChatRemote chat = new ChatRemoteImpl();
		//Naming: representant de rmiregistery qui est une annuaire d'objets
		//Enregistrement de l'objet sur ma machine
		Naming.rebind("//localhost/chat", chat);
		System.out.println(chat+" enregistré");
		System.out.println("On voit bien ou sont les classes");
		System.out.println("Félicitation! L'objet a bien été enregistré");

	}

}
