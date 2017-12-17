package data;

public class Produto {
		
	private String nome;
	private String tipo;
	private double valor;
	private long quantidade;
	private static long codigo = 1;
	
	
	
	
	public Produto() {
		super();
	}


	public Produto(String nome, String tipo, double valor, long quantidade) {
		this.nome = nome;
		this.tipo = tipo;
		this.valor = valor;
		this.quantidade = quantidade;
		this.codigo++;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getValor() {
		return this.valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public long getQuantidade() {
		return quantidade;
	}
	
	public static long getCodigo() {
		return codigo;
	}
	
	
	
}	
