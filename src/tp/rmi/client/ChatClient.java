package tp.rmi.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import tp.rmi.common.ChatRemote;
import tp.rmi.common.ReceiveCallback;

public class ChatClient {
	static ReceiveCallback callback;
	static String t;

	public static void main(String[] args) throws NotBoundException, IOException {
		callback = new Afficheur();
		
		//identifier objet distant
		ChatRemote chat = (ChatRemote) Naming.lookup("//localhost/chat");

		chat.registerCallback(callback);

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

		while (!(t = read.readLine()).equals("fin")) {
			chat.send("NOM", t);
		}
	}
}
