package Servidor;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import Comum.Pessoa;

public class Servico {

	public Servico() throws RemoteException {
		try {
			LocateRegistry.createRegistry(8282);
			Naming.rebind("rmi://localhost:8282/pessoa", (Remote) new Pessoa());
			System.out.println("Rodando...");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws RemoteException{
		new Servico();
	}
}	
