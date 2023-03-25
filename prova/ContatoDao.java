package controle;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import modelo.Contato;

public class ContatoDao {
	
	// a conex�o com o banco de dados
	private Connection connection;
	
	public ContatoDao() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public long calculaChave() {
		long chave = 0;
		
		String sql = "select ifnull(max(id),0) as id from contatos";
		
		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);	
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
                chave = rs.getLong("id") + 1;
            } 
            else {
                chave = 1;
            }
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			throw new DAOException(e);
		}
		return chave;
	}
	
	public boolean adiciona(Contato contato) {
		boolean flag = false;
		
		String sql = "insert into contatos " +
				     "(nome,email,endereco,dataNascimento)" +
				     " values (?,?,?,?)";
		
		try {
			// prepared statement para inser��o
			PreparedStatement stmt = connection.prepareStatement(sql);
			
			// seta os valores
			stmt.setString(1,contato.getNome());
			stmt.setString(2,contato.getEmail());
			stmt.setString(3,contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			
			// executa
			stmt.execute();
			stmt.close();
			flag = true;
			} catch (SQLException e) {
			    throw new DAOException(e);
		}
		return flag;
	}
	
	public List<Contato> getLista() {
		
		String sql = "select * from contatos";
		
		try {
			List<Contato> contatos = new ArrayList<Contato>();
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				// criando o objeto Contato
				Contato contato = new Contato();
				
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));
				
				// montando a data atrav�s do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);
				
				// adicionando o objeto � lista
				contatos.add(contato);
			}
			rs.close();
			stmt.close();
			
			return contatos;
			
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}
		
	public boolean altera(Contato contato) {
		boolean flag = false;
		
		String sql = "update contatos set nome=?, email=?,"
				+ "endereco=?, dataNascimento=? where id=?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
			stmt.setLong(5, contato.getId());
			stmt.execute();
			stmt.close();
			flag = true;
		} catch (SQLException e) {
			throw new DAOException(e);
		}
		return flag;
	}
	
	public boolean remove(Contato contato) {
		boolean flag = false;
		
		String sql = "delete from contatos where id=?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1, contato.getId());
			stmt.execute();
			flag = true;
		} catch (SQLException e) {
			throw new DAOException(e);
		}
		return flag;
	}
	
	public Contato pesquisa(Contato contato) {
		
		String sql = "select * from contatos where id=?";
		
		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);
			
			stmt.setLong(1, contato.getId());
			
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				// criando o objeto Contato			
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));
				
				// montando a data atrav�s do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);
			}
			rs.close();
			stmt.close();
			
			return contato;
			
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}
	
	public Contato pesquisaNome() {
		
		// criando o objeto Contato
		Contato contato = new Contato();
		
		String sql = "select * from contatos where nome like='C%'";
		
		try {
			PreparedStatement stmt = this.connection.prepareStatement(sql);
					
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {			
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));
				
				// montando a data atrav�s do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);
			}
			rs.close();
			stmt.close();
			
			return contato;
			
		} catch (SQLException e) {
			throw new DAOException(e);
		}
	}
	
}
