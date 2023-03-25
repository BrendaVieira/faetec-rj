package controle;

import java.sql.SQLException;

@SuppressWarnings("serial")
public class DAOException extends RuntimeException{

	public DAOException(SQLException e) {
		System.out.println(e.getMessage());
	}
	
}
