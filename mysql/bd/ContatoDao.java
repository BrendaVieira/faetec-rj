package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import modelo.Contato;

public class ContatoDao {
//	a	conex�o	com	o	banco	de	dados
	private	Connection	connection;
	public	ContatoDao() {
			this.connection	=	new	ConnectionFactory().getConnection();
	}
	public	void	adiciona(Contato	contato) { //vem do testainsere como parametro
		String	sql	=	"insert	into	contatos	"	+
										"(nome,email,endereco,dataNascimento)"	+
										"	values	(?,?,?,?)";
		try	{
		
			//	prepared	statement	para	inser��o
			PreparedStatement	stmt	=	connection.prepareStatement(sql);
			
			//	seta	os	valores
			stmt.setString(1,contato.getNome());
			stmt.setString(2,contato.getEmail());
			stmt.setString(3,contato.getEndereco());
			stmt.setDate(4,	 (java.sql.Date) new	Date(contato.getDataNascimento().getTimeInMillis()));
			//	executa
			stmt.execute();
			stmt.close();
			}
			catch	(SQLException	e)	{
			throw new	RuntimeException(e);
		}
	}
}
