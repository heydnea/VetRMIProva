package Comum;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class ServicoRemoto extends UnicastRemoteObject implements IServiçoRemoto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ServicoRemoto() throws RemoteException {
		super();
	}

	@Override
	public void sendPessoa(Pessoa pes) throws RemoteException {
		Pessoa.setLstPessoa(pes);
	}

	@Override
	public List<Pessoa> retrievePessoa() throws RemoteException {
		return Pessoa.getLstPessoa();
		
	}
}

