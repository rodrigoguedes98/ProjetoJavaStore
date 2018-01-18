package BancoDados;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Exceptions.NaoAchouException;
import data.Pessoa;
import data.PessoaFisica;
import data.PessoaJuridica;

public class RepositorioPessoaDAO implements InterfaceRepositorioBD <Pessoa>
{

	public void inserir(Pessoa cliente, int i) 
	{
		
           if(cliente instanceof PessoaFisica && i==0){
             try {
                String cmd = "insert into clientes(nome,juridico,idcliente,razaoSocial_Rg,endereco,login,senha) values('"+cliente.getNome()+"',"+0+",'" + ((PessoaFisica)cliente).getCPF() + "','" + ((PessoaFisica)cliente).getRG()+ "','" + cliente.getEndereco()+"','"+cliente.getLogin().getLogin()+"','"+cliente.getLogin().getSenha()+"')";
		Connection con = ConexaoMySQL.getInstance().getConnection();
		con.createStatement().executeUpdate(cmd);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		System.out.println("Sucesso!");
	}
           else if(i==1 && cliente instanceof PessoaJuridica ){
            
            try {
                String cmd = "insert into clientes(nome,juridico,idcliente,razaoSocial_Rg,endereco,login,senha) values('"+cliente.getNome()+"',"+1+",'" + ((PessoaJuridica)cliente).getCNPJ() + "','" + ((PessoaJuridica)cliente).getRazaoSocial()+ "','" + cliente.getEndereco()+"','"+cliente.getLogin().getLogin()+"','"+cliente.getLogin().getSenha()+"')";
		Connection con = ConexaoMySQL.getInstance().getConnection();
		con.createStatement().executeUpdate(cmd);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		System.out.println("Sucesso!");
            
        }
        }
            

	public ResultadoBusca buscar(String nome,int check) throws NaoAchouException{
            ResultadoBusca resultado = new ResultadoBusca ();
            boolean achou = false;
    
		try {
            Connection con = ConexaoMySQL.getInstance().getConnection();
            String cmd = "Select * from clientes";
            ResultSet res= con.createStatement().executeQuery(cmd);
            if(check==1){
                while (res.next() && !achou){
                    String login = res.getString("login");
                    if(nome.equals(login)){
                        resultado.setId(res.getInt("id"));
                        resultado.setNome(res.getString("nome"));
                        resultado.setJuridico(res.getInt("juridico"));
                        resultado.setIdcliente(res.getString("idcliente"));
                        resultado.setRazaoSocial_Rg(res.getString("razaoSocial_Rg"));
                        resultado.setLogin(res.getString("login"));
                        resultado.setSenha(res.getString("senha"));

                        /* if (TelaFuncionario.equals("alterar")){
                        AlterarCliente frame = new AlterarCliente();
                        frame.setBusca(login);
                        frame.setCheck(check);
                        frame.setVisible(true);  
                        frame.carregar();
                        }else if (TelaFuncionario.equals("deletar")){
                        DeletarCliente frame = new DeletarCliente();
                        frame.setBusca(login);
                        frame.setCheck(check);
                        frame.setVisible(true);
                        frame.carregar();
                        } */
                        achou = true;
                    }
                }
                if(!achou){
                	throw new NaoAchouException(nome);
                }
                //Não encontrou o cara
            }else if (check == 2){
                while (res.next() && !achou){
                    String id = res.getString("idcliente");
                    if(nome.equals(id)){
                        resultado.setId(res.getInt("id"));
                        resultado.setNome(res.getString("nome"));
                        resultado.setJuridico(res.getInt("juridico"));
                        resultado.setIdcliente(res.getString("idcliente"));
                        resultado.setRazaoSocial_Rg(res.getString("razaoSocial_Rg"));
                        resultado.setLogin(res.getString("login"));
                        resultado.setSenha(res.getString("senha"));
                        /*if (TelaFuncionario.equals("alterar")){
                        AlterarCliente frame = new AlterarCliente();
                        frame.setBusca(id);
                        frame.setCheck(check);
                        frame.setVisible(true);  
                        frame.carregar();
                        }else if (TelaFuncionario.equals("deletar")){
                        DeletarCliente frame = new DeletarCliente();
                        frame.setBusca(id);
                        frame.setCheck(check);
                        frame.setVisible(true);
                        frame.carregar();
                        }*/
                        achou = true;
                    }
                }
                if(!achou){
                	throw new NaoAchouException(nome);
                }
            }else if (check==3){
                while (res.next() && !achou){
                    String name = res.getString("nome");
                    if(nome.equals(name)){
                        resultado.setId(res.getInt("id"));
                        resultado.setNome(res.getString("nome"));
                        resultado.setJuridico(res.getInt("juridico"));
                        resultado.setIdcliente(res.getString("idcliente"));
                        resultado.setRazaoSocial_Rg(res.getString("razaoSocial_Rg"));
                        resultado.setLogin(res.getString("login"));
                        resultado.setSenha(res.getString("senha"));
                        /* if (TelaFuncionario.equals("alterar")){
                        AlterarCliente frame = new AlterarCliente();
                        frame.setBusca(nome);
                        frame.setCheck(check);
                        frame.setVisible(true);  
                        frame.carregar();
                        }else if (TelaFuncionario.equals("deletar")){
                        DeletarCliente frame = new DeletarCliente();
                        frame.setBusca(nome);
                        frame.setCheck(check);
                        frame.setVisible(true);
                        frame.carregar();
                        }*/
                        achou = true;
                        //Se ele não achar ele não vai mudar o stat
                    }
                }
                if(!achou){
                	throw new NaoAchouException(nome);
                }
                //Não encontrou o cara
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
            return resultado;        
	}


	public void atualizar(ResultadoBusca resultado) 
	{
		try {
             String cmd = "update clientes set nome = '"+resultado.getNome()+"', juridico = "+resultado.getJuridico()+", idcliente = '"+resultado.getIdcliente()+"' , razaoSocial_Rg = '"+resultado.getRazaoSocial_Rg()+"', endereco = '"+resultado.getEndereco()+"', login = '"+resultado.getLogin()+"', senha = '"+resultado.getSenha()+"' where id = "+resultado.getId()+"";
            Connection con = ConexaoMySQL.getInstance().getConnection();
            con.createStatement().executeUpdate(cmd);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
	}

	public void remover(ResultadoBusca resultado) 
	{
		 try {
            Connection con = ConexaoMySQL.getInstance().getConnection();
            String cmd = "delete from pessoa where idcliente = "+resultado.getId()+"";
            con.createStatement().executeUpdate(cmd);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
	}
}
