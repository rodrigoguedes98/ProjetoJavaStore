import java.sql.Connection;

import repositorio.ConexaoMySQL;

public class ClasseParaApagarDepois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = ConexaoMySQL.getInstance().getConnection();
	}

}
