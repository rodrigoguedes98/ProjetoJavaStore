package repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
	private static ConexaoMySQL instance = null;
	private Connection connection = null;
	
	
	private ConexaoMySQL() { 
		try {
			String driverName = "com.mysql.jdbc." + "Driver";
			Class.forName(driverName);
			String serverName = "127.0.0.1";
			String nomeBanco = "mydb";
			String url = "jdbc:mysql://" + serverName + "/"+ nomeBanco;
			String username = "root"; 
			String password = "root";
			connection = DriverManager.getConnection(url,username,password);
			if (connection != null) {
				System.out.println("Conex�o Estabelecida com o Banco");
			}else{
				System.err.println("Conex�o n�o foi Estabelecida com o Banco");
			}
			connection.setAutoCommit(true);	
		}catch (ClassNotFoundException e) {
			System.out.println("O driver especificado n�o foi encontrado");
		}catch (SQLException e) {
			System.out.println("Não foi possível se conectar ao banco de dados");
		}
		}
	public static ConexaoMySQL getInstance() {
		if (instance == null) {
			instance = new ConexaoMySQL();
		}
		return instance;
	}
	public java.sql.Connection getConnection(){
		return connection;
	}
}
