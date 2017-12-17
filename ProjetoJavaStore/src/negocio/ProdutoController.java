package negocio;

import data.Produto;
import repositorio.RepositorioProduto;

public class ProdutoController {
	
	private RepositorioProduto repProduto;
	
	public ProdutoController(){
		repProduto = repProduto.getInstance();
	}
	
	public void cadastrarProduto(Produto p){
		if(p != null){
			repProduto.cadastar(p);
		}
	}
	
	
}
