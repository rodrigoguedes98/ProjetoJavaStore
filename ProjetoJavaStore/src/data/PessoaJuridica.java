package data;

public class PessoaJuridica extends Pessoa{
	
	private String CNPJ;
	private String RazaoSocial;
	
	public PessoaJuridica(String nome, String tipo, String endereco, Login login, String CNPJ, String RazaoSocial) {
		super(nome, tipo, endereco, login);
		this.CNPJ = CNPJ;
		this.RazaoSocial = RazaoSocial;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getRazaoSocial() {
		return RazaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}
	
	
}
