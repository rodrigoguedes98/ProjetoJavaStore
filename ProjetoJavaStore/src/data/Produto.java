package data;

public class Produto {
		
	private String nome;
	private String categoria;
	private String idProduto;
	private String descricao;
	private double valor;
	private int quantidade;

	public Produto() {
	}

	public Produto(String nome, String idProduto, String descricao,String categoria, int quantidade, double valor) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.idProduto = idProduto;
		this.descricao = descricao;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}	
