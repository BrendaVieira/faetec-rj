package visao; //telas que vao passar para o controle e devolver, nao fica gavado no banco (esse codigo é um teste)

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import controle.ConnectionFactory;

public class JDBCInsere {

	public static void main(String[] args) throws SQLException {
//		conectando
		//Connection	con	=	new	ConnectionFactory().getConnection();
		Connection	con	=	null;
		try	{
		con	=	new	ConnectionFactory().getConnection();
		//	faz	um	monte	de	operações.
		//	que	podem	lançar	exceptions	runtime	e	SQLException
		
		//	cria	um	preparedStatement
		String	sql	=	"insert	into contatos"	+ "	(nome,email,endereco,dataNascimento)" + " values	(?,?,?,?)";
		PreparedStatement	stmt	=	con.prepareStatement(sql);
		
		//	preenche	os	valores
		stmt.setString(1,	"Caelum");
		stmt.setString(2,	"contato@caelum.com.br");
		stmt.setString(3,	"R.	Vergueiro	3185	cj57");
		stmt.setDate(4,	new	java.sql.Date(
			Calendar.getInstance().getTimeInMillis()));
		
		//	executa
		stmt.execute();
		stmt.close();
		
		System.out.println("Gravado!");
		
		}
		catch(SQLException	e)	{
			System.out.println(e);
	}	finally	{
			con.close();
		}
	}
}