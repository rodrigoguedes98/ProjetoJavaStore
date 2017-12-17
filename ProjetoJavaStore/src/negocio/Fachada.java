package negocio;

import data.Produto;

public class Fachada {
	
	private ProdutoController controladorProduto;
	
	public Fachada() {
		this.controladorProduto = new ProdutoController();
	}

	public void cadastrarProduto(Produto p) {
		controladorProduto.cadastrarProduto(p);
	}
	
	
	
	
	
	
}
