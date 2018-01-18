package BancoDados;

import data.Pessoa;

public interface RepositorioPessoa
{
	public void inserir(Pessoa cliente, int i);
	
	public void atualizar(ResultadoBusca cliente);
	
	public ResultadoBusca buscar(String nome,int check);
	
	public void remover(ResultadoBusca cliente);

}
