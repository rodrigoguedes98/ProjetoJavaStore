package negocio;
import BancoDados.ResultadoBusca;
import BancoDados.ResultadoBuscaProdutos;
import Exceptions.CampoNuloException;
import Exceptions.NaoAchouException;
import data.Produto;

public class FachadaProduto {
	
	private ProdutoController produtos;
	private static FachadaProduto instance;
	
	public FachadaProduto() {
		produtos = new ProdutoController();
	}
	
	public static FachadaProduto getInstance()
	{
		if (FachadaProduto.instance == null)
		{
			FachadaProduto.instance = new FachadaProduto();
		}
		return FachadaProduto.instance;
	}
	
	public void cadastrar(Produto produto) throws CampoNuloException
	{
		produtos.cadastrar(produto);
	}
	
	public ResultadoBuscaProdutos pesquisar(String nome, int check) throws NaoAchouException
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
