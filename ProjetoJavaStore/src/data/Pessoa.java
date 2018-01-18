package data;

public class Pessoa {
		
	private String nome;
	private String endereco;
	private Login login;
	
	
	public Pessoa(String nome, String endereco, Login login) {
		this.nome = nome;
		this.endereco = endereco;
		this.login = login;
	}

	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public Login getLogin() {
		return login;
	}


	public void setLogin(Login login) {
		this.login = login;
	}
	
	
	
	
	
}
