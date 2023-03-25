package visao;

import java.util.List;

import modelo.Contato;
import controle.ContatoDao;
import java.text.SimpleDateFormat;

public class TestaLista {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();
		
		List<Contato> contatos = dao.getLista();
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		for (Contato contato : contatos) {
			System.out.println("Id: " + contato.getId());
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de Nascimento: " + formato.format(contato.getDataNascimento().getTime()) + "\n");
			//System.out.println("Data de Nascimento: " + contato.getDataNascimento().getTime() + "\n");
		}

	}

}
