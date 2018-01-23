package BancoDados;

public class ResultadoBuscaProdutos {
	private int id;
    private String nome;
    private String idProduto;
    private String descricao;
    private String categoria;
    private int quantidade;
    private float valor;
    
	public ResultadoBuscaProdutos(int id, String nome, String idProduto, String descricao, String categoria,
			int quantidade, float valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.idProduto = idProduto;
		this.descricao = descricao;
		this.categoria = categoria;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	public ResultadoBuscaProdutos() {
		
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
    
    
}
