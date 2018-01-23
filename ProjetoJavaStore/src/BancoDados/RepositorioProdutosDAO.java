package BancoDados;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import Exceptions.NaoAchouException;
import data.Produto;

public class RepositorioProdutosDAO implements InterfaceRepositorioProdutoBD <Produto>{

	public void inserir(Produto produto) {
		try {
            String cmd = "insert into produtos(nome,idproduto,descricao,categoria,quantidade,valor) values('"+produto.getNome()+"','" +produto.getIdProduto()+ "','" +produto.getDescricao()+ "','"+produto.getCategoria()+"',"+produto.getQuantidade()+","+produto.getValor()+")";
	Connection con = ConexaoMySQL.getInstance().getConnection();
	con.createStatement().executeUpdate(cmd);
	}catch(SQLException ex) {
		ex.printStackTrace();
	}
	System.out.println("Sucesso!");
		
	}

	public void atualizar(ResultadoBuscaProdutos resultado) {
		try {
            String cmd = "update produtos set nome = '"+resultado.getNome()+"', idproduto = "+resultado.getIdProduto()+", descricao = '"+resultado.getDescricao()+"' , categoria = '"+resultado.getCategoria()+"', quantidade = "+resultado.getQuantidade()+", valor = "+resultado.getValor()+" where id = "+resultado.getId()+"";
           Connection con = ConexaoMySQL.getInstance().getConnection();
           con.createStatement().executeUpdate(cmd);
       } catch (SQLException ex) {
           ex.printStackTrace();
       }
		
	}

	public ResultadoBuscaProdutos buscar(String nome, int check) throws NaoAchouException {
		 ResultadoBuscaProdutos resultado = new ResultadoBuscaProdutos ();
         boolean achou = false;
         try {
             Connection con = ConexaoMySQL.getInstance().getConnection();
             String cmd = "Select * from produtos";
             ResultSet res= con.createStatement().executeQuery(cmd);
             if(check==1){
                 while (res.next() && !achou){
                     String name = res.getString("nome");
                     if(nome.equals(name)){
                         resultado.setId(res.getInt("id"));
                         resultado.setNome(res.getString("nome"));
                         resultado.setCategoria(res.getString("categoria"));
                         resultado.setDescricao(res.getString("descricao"));
                         resultado.setQuantidade(res.getInt("quantidade"));
                         resultado.setValor(res.getFloat("valor"));
                         resultado.setIdProduto(res.getString("idproduto"));
                         achou = true;
                     }
                 }
                 if(!achou){
                 	throw new NaoAchouException(nome);
                 }
             }else if (check == 2){
                 while (res.next() && !achou){
                     String id = res.getString("idproduto");
                     if(nome.equals(id)){
                    	 resultado.setId(res.getInt("id"));
                         resultado.setNome(res.getString("nome"));
                         resultado.setCategoria(res.getString("categoria"));
                         resultado.setDescricao(res.getString("descricao"));
                         resultado.setQuantidade(res.getInt("quantidade"));
                         resultado.setValor(res.getFloat("valor"));
                         resultado.setIdProduto(res.getString("idproduto"));
                         achou = true;
                     }
                 }
                 if(!achou){
                 	throw new NaoAchouException(nome);
                 }
             }
         } catch (SQLException ex) {
             ex.printStackTrace();
         }
             return resultado;  
	}

	public void remover(ResultadoBuscaProdutos resultado) {
		 try {
	            Connection con = ConexaoMySQL.getInstance().getConnection();
	            String cmd = "delete from produtos where id = "+resultado.getId()+"";
	            con.createStatement().executeUpdate(cmd);
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	        }
	}

	

}
