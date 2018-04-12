package cliente;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import javax.swing.JOptionPane;

public class AppPrincipal {
	
	public static void main( String [] args ) {
	
		
	String nome = "";
	String cpf = "";
	nome = JOptionPane
			.showInputDialog("Bem vindo, informe seu nome: ");
	try {
		
		while (nome != "0") {
			nome = JOptionPane.showInputDialog("Chat - " + nome
					+ "Entre com a mensagem. (Entre com 0 para sair)");
			IServiço objServico = (IServiço) Naming
					.lookup("rmi://localhost:8282/chat");
			
			Pessoa pes = new Pessoa(id, nome, cpf);
			
			System.out.println(returnMessage(objServico.retrieveMessage()));
		}
	}catch (MalformedURLException e) {
		e.printStackTrace();
	}catch (RemoteException e) {
		e.printStackTrace();
	}catch (NotBoundException e) {
		e.printStackTrace();
	}catch (Exception e) {
		e.printStackTrace();
	}
						
}
	
	private static String returnMessage(List<Pessoa> lst) {
		
		String valor = "";
		for (Pessoa pessoa : lst) {
			valor += pessoa.getUser()+ ": " + pessoa.getPessoa()
			+ "\n";
		}
		return valor;
	}
}
