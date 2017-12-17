package repositorio;

import java.util.ArrayList;
import data.Produto;

public class RepositorioProduto implements InterfaceRepositorio<Produto> {

	private static RepositorioProduto instance;
	private static int index = 0;
	private Produto[] repProduto;
	
	
	private RepositorioProduto() {
		this.repProduto = new Produto[100];
	}
	//Padr�o de projeto Singleton
	public static RepositorioProduto getInstance(){
		if(instance == null){
			instance = new RepositorioProduto();
		}
			return instance;
	}
	
	@Override
	public void cadastar(Produto produto) {
		if(index != 99){
			this.repProduto[index++] = produto;
		}
	}

	@Override
	public Produto buscar(String nome){
		Produto produtoRetorno = null;
		for(int i = 0; i < repProduto.length; i++){
			if(repProduto[i].getNome().equals(nome)){
				produtoRetorno = repProduto[i];
			}
		}
		return produtoRetorno;
	}
	
	
	
	public int buscarIndex(String nome) {
		int index = -1;
		for(int i = 0; i < repProduto.length; i++){
			if(repProduto[i].getNome().equals(nome)){
				index = i;
			}
		}
		return index;
	}

	@Override
	public void atualizar(Produto produto) {
		if(produto != null){
			
		}
	}

	@Override
	public void deletar(Produto produto) {
		if (produto != null) {
			if(this.buscarIndex(produto.getNome()) != -1){
				repProduto[this.buscarIndex(produto.getNome())] = repProduto[index];
				repProduto[index--] = null;
			}
		}
	}

}
