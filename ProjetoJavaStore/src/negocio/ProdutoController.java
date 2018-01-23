package negocio;

import BancoDados.RepositorioProdutosDAO;
import BancoDados.ResultadoBuscaProdutos;
import Exceptions.CampoNuloException;
import Exceptions.NaoAchouException;
import data.Produto;

public class ProdutoController {

private RepositorioProdutosDAO repositorioProduto;
	
	public ProdutoController() {
		repositorioProduto = new RepositorioProdutosDAO();
	}
	
	public void cadastrar(Produto produto) throws CampoNuloException {
		if(produto.getNome() != null && produto.getCategoria()!= null && produto.getDescricao() != null && produto.getIdProduto() != null){
				if( produto.getQuantidade() > 0 && produto.getValor() > 0)  {
					repositorioProduto.inserir(produto);	
				}else {
					throw new CampoNuloException("Quantidade ou Valor");
				}	
			
		}else {
			throw new CampoNuloException("Nome, Descrição, Categoria ou Id Produto");
		}
	}
	
	public void atualizar(ResultadoBuscaProdutos resultado){
		if(resultado != null){
		repositorioProduto.atualizar(resultado);
		}
	}
	
	public ResultadoBuscaProdutos pesquisar(String nome,int check) throws NaoAchouException{
		ResultadoBuscaProdutos resultado = null;
		if(nome != null){
			resultado = repositorioProduto.buscar(nome,check);
		}
		return resultado;
	}
	
	public void remover (ResultadoBuscaProdutos resultado) {
		if(resultado != null){
		repositorioProduto.remover(resultado);
		}
	}
	
}
