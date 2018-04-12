package Comum;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {


	private int id;
	private String nome;
	private String cpf;
	
	public Pessoa() {
		
	}
	
	public Pessoa(int id, String nome, String cpf) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public static void setLstPessoa(Pessoa pes) {
		LstPessoa.add(pes);
		Pessoa pess = new Pessoa();
		
		pessoa.setPes(pes.getPessoa());
		pessoa.setNome(msg.getUser());
		
		//new DB().insert(chat);
		
	}
}
