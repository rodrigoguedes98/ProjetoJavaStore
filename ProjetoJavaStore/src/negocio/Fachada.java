package negocio;

import BancoDados.ResultadoBusca;
import Exceptions.CampoNuloException;
import Exceptions.NaoAchouException;
import data.Pessoa;


public class Fachada {
	
	private ClientesController clientes;
	private static Fachada instance;
	
	public Fachada() {
		clientes = new ClientesController();
	}
	
	public static Fachada getInstance()
	{
		if (Fachada.instance == null)
		{
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}
	
	public void cadastrar(Pessoa cliente,int i) throws CampoNuloException
	{
		clientes.cadastrar(cliente, i);
	}
	
	public ResultadoBusca pesquisar(String Nomecliente, int check) throws NaoAchouException
	{
		return clientes.pesquisar(Nomecliente, check);
		
	}
	
	public void atualizar(ResultadoBusca cliente)
	{
		clientes.atualizar(cliente);
	}

	public void remover (ResultadoBusca cliente) 
	{
		clientes.remover(cliente);
	}	
	
}
