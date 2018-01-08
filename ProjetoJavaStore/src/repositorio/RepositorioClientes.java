package repositorio;
import data.Pessoa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class RepositorioClientes implements InterfaceRepositorio<Pessoa> {

	private static RepositorioClientes instance;
	private static int index = 0;
	private Pessoa[] repClientes;
	
	
	private RepositorioClientes() {
		this.repClientes = new Pessoa[100];
	}
	//Padrï¿½o de projeto Singleton
	public static RepositorioClientes getInstance(){
		if(instance == null){
			instance = new RepositorioClientes();
		}
			return instance;
	}
	
	@Override
	public void cadastar(Pessoa cliente) {
		if(index != 99){
			this.repClientes[index++] = cliente;
		}
	}

	@Override
	public Pessoa buscar(String nome){
		Pessoa clienteRetorno = null;
		for(int i = 0; i < repClientes.length; i++){
			if(repClientes[i].getNome().equals(nome)){
				clienteRetorno = repClientes[i];
			}
		}
		return clienteRetorno;
	}
	
	
	
	public int buscarIndex(String nome) {
		int index = -1;
		for(int i = 0; i < repClientes.length; i++){
			if(repClientes[i].getNome().equals(nome)){
				index = i;
			}
		}
		return index;
	}

	@Override
	public void atualizar(Pessoa cliente) {
		if(cliente != null){
			
		}
	}

	@Override
	public void deletar(Pessoa cliente) {
		if (cliente != null) {
			if(this.buscarIndex(cliente.getNome()) != -1){
				repClientes[this.buscarIndex(cliente.getNome())] = repClientes[index];
				repClientes[index--] = null;
			}
		}
	}

	//começo
	//Comandos do BD
	/*comando de inserir no BD
	private void jButtonActionPerformed(java.awt.event.ActionEvent evt){
		try {
			String cmd = "insert into cliente(nome,CNPJ_CPF,razaoSocial_RG,endereco,login,senha) values('"+jTextFieldNome.getText()+"','"+jTextFieldCNPJ_CPF.getText()+"','"+jTextFieldRazaoSocial_RG.getText()+"','"+jTextFieldEndereco.getText()+"','"+jTextFieldLogin.getText()+"','"+jTextFieldSenha.getText()+"')";
			Connection con = ConexaoMySQL.getInstance().getConnection();
			con.createStatement().executeUpdate(cmd);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	 * 
	 *COMANDO DE DELETE
	 *
	 private void loadCombo(){
		try {
			Connection con = ConexaoMySQL.getInstance().getConnection();
			String cmd = "Select * from cliente";
			ResultSet res = con.createStatement().executeQuery(cmd);	
			while(res.next()) {
				String nomeDB = res.getString("nome");
				//((DefaultComboBoxModel)jComboBox2.getModel()).addElement(nomeDB);//carregar o comb box com todos os nomes do db
			}
		}catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	 *
	 *
	 *private void jButtonActionPerformed(java.awt.event.ActionEvent evt){
		try {
			String cmd = "delete into cliente(nome,CNPJ_CPF,razaoSocial_RG,endereco,login,senha) values('"+jTextFieldNome.getText()+"','"+jTextFieldCNPJ_CPF.getText()+"','"+jTextFieldRazaoSocial_RG.getText()+"','"+jTextFieldEndereco.getText()+"','"+jTextFieldLogin.getText()+"','"+jTextFieldSenha.getText()+"')";
			Connection con = ConexaoMySQL.getInstance().getConnection();
			con.createStatement().executeUpdate(cmd);
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	 * 
	 * 
	 * 
	 * 
	 * */
	//fim
}
