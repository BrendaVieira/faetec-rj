package visao; 		//main e execu��o
import java.sql.Connection;
import java.sql.SQLException;

import controle.ConnectionFactory;

public class TextaConexao {

	public static void main(String[] args) throws SQLException {  //throws tratamento de erros
		Connection	connection	=	new	ConnectionFactory().getConnection(); //variavel pra chamada da fun��o
		System.out.println("Conex�o	aberta!");
		connection.close();
	}

}
