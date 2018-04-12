package Comum;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

	public interface IServiçoRemoto extends Remote {
		
		void sendMessage(Pessoa pes) throws RemoteException;
		List<Pessoa> retrievePessoa() throws RemoteException;
		void sendPessoa(Pessoa pes) throws RemoteException;
}
