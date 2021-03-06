package negocio;

import BancoDados.ResultadoBusca;
import BancoDados.ResultadoBuscaProdutos;
import Exceptions.CampoNuloException;
import Exceptions.NaoAchouException;
import data.Pessoa;
import data.Produto;

public class Fachada {
	private ProdutoController produtos;
	private ClientesController clientes;
	private static Fachada instance;
	
	public Fachada() {
		clientes = new ClientesController();
		produtos =  new ProdutoController();
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
	public void cadastrar(Produto produto) throws CampoNuloException
	{
		produtos.cadastrar(produto);
	}
	
	public ResultadoBuscaProdutos pesquisarProduto(String nome, int check) throws NaoAchouException
	{
		return produtos.pesquisar(nome, check);
	}
	
	public void atualizar(ResultadoBuscaProdutos resultado)
	{
		produtos.atualizar(resultado);
	}
	
	public void remover (ResultadoBuscaProdutos resultado) 
	{
		produtos.remover(resultado);
	}
	
	
}
