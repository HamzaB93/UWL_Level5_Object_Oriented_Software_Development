package helloWorld;

import java.rmi.*;
import java.rmi.server.*;

public class Hello extends UnicastRemoteObject implements HelloInterface 
{
	private String message; // Strings are serialisable

	public Hello (String msg) throws RemoteException {
		message = msg;
	}

	public String say() throws RemoteException {
		return message;
	}
}

class HelloServer {
	public static void main (String[] argv) {
		try {
			Naming.rebind("rmi://localhost/HelloServer", new Hello("Hello, world!"));
			System.out.println("Hello Server is ready.");
		}
		catch (Exception e) {
			System.out.println("Hello Server failed: " + e);
		}
	}
}