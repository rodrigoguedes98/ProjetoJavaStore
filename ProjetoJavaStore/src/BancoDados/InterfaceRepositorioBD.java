package BancoDados;

import Exceptions.NaoAchouException;

public interface InterfaceRepositorioBD <Pessoa>{
	
	public void inserir(Pessoa cliente, int i);
	
	public void atualizar(ResultadoBusca cliente);
	
	public ResultadoBusca buscar(String nome,int check) throws NaoAchouException;
	
	public void remover(ResultadoBusca cliente);
}
