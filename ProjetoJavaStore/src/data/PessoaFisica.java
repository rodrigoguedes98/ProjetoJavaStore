package data;

public class PessoaFisica extends Pessoa {

	private String CPF;
	private String RG;
	
	
	public PessoaFisica(String nome, String tipo, String endereco, Login login,String CPF, String RG) {
		super(nome, tipo, endereco, login);
		this.CPF = CPF;
		this.RG = RG;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public String getRG() {
		return RG;
	}


	public void setRG(String rG) {
		RG = rG;
	}
	
	

}
