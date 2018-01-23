package negocio;

import BancoDados.RepositorioPessoaDAO;
import BancoDados.ResultadoBusca;
import Exceptions.CampoNuloException;
import Exceptions.NaoAchouException;
import data.Pessoa;
import data.PessoaFisica;

public class ClientesController {
	private RepositorioPessoaDAO repositorioPessoa;
	
	public ClientesController() {
		repositorioPessoa = new RepositorioPessoaDAO();
	}
	
	public void cadastrar(Pessoa cliente,int i) throws CampoNuloException 
	{
		if(cliente.getNome() != null && cliente.getLogin().getLogin() != null && cliente.getLogin().getSenha() != null){
			if(cliente instanceof PessoaFisica){
				if(((PessoaFisica)cliente).getCPF() != null && ((PessoaFisica)cliente).getRG() != null)  {
					repositorioPessoa.inserir(cliente,i);	
				}else {
					throw new CampoNuloException("CPF ou RG");
				}	
			}	
		}else {
			throw new CampoNuloException("Nome, Login ou Senha");
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
