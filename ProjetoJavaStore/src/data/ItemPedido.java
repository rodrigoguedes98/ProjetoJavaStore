package data;

public class ItemPedido {
	private Produto produto;
	private long quantidade;
	private double valorTotal;
	
	public ItemPedido(Produto produto,long quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
		this.valorTotal = produto.getValor()*this.quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(long quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	
	
	
}
