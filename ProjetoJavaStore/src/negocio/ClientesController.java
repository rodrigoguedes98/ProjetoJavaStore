package negocio;

import BancoDados.RepositorioPessoaDAO;
import BancoDados.ResultadoBusca;
import Exceptions.NaoAchouException;
import data.Pessoa;

public class ClientesController {
	private RepositorioPessoaDAO repositorioPessoa;
	
	public ClientesController() {
		repositorioPessoa = new RepositorioPessoaDAO();
	}
	
	public void cadastrar(Pessoa cliente,int i) 
	{
		if(cliente != null){
			repositorioPessoa.inserir(cliente,i);	
		}
	}
	
	public void atualizar(ResultadoBusca cliente)
	{
		if(cliente != null){
		repositorioPessoa.atualizar(cliente);
		}
	}
	public ResultadoBusca pesquisar(String cliente,int check) throws NaoAchouException
	{
		ResultadoBusca resultado = null;
		if(cliente == null){
			resultado = repositorioPessoa.buscar(cliente,check);
		}
		return resultado;
	}
	public void remover (ResultadoBusca cliente) 
	{
		if(cliente != null){
		repositorioPessoa.remover(cliente);
		}
	}

	

}
