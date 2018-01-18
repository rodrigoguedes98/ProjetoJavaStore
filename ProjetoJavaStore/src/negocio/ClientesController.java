package negocio;

import BancoDados.RepositorioPessoaDAO;
import BancoDados.ResultadoBusca;
import data.Pessoa;

public class ClientesController {
	private RepositorioPessoaDAO repositorioPessoa;
	
	public ClientesController() {
		repositorioPessoa = new RepositorioPessoaDAO();
	}
	
	public void cadastrar(Pessoa cliente,int i) 
	{
		repositorioPessoa.inserir(cliente,i);
	}
	
	public void atualizar(ResultadoBusca cliente)
	{
		repositorioPessoa.atualizar(cliente);
	}
	public ResultadoBusca pesquisar(String cliente,int check)
	{
		return repositorioPessoa.buscar(cliente,check);
	}
	public void remover (ResultadoBusca cliente) 
	{
		repositorioPessoa.remover(cliente);
	}

	

}
