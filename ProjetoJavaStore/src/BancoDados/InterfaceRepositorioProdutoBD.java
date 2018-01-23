package BancoDados;

import Exceptions.NaoAchouException;

public interface InterfaceRepositorioProdutoBD  <Produto>{
	
	public void inserir(Produto produto);
	
	public void atualizar(ResultadoBuscaProdutos produto);
	
	public ResultadoBuscaProdutos buscar(String nome,int check) throws NaoAchouException;
	
	public void remover(ResultadoBuscaProdutos produto);
}
