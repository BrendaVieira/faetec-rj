package visao;

import java.util.Calendar;

import modelo.Contato;
import controle.ContatoDao;

public class TestaAltera {

	public static void main(String[] args) {
		// pronto para gravar
		Contato contato = new Contato();
				
		contato.setId((long) 10);
		contato.setNome("Caelum cccc");
		contato.setEmail("coccccc@caelum.com.br");
		contato.setEndereco("R. Verccccc cj87");
		contato.setDataNascimento(Calendar.getInstance());
				
		// grave nessa conexão!!!
		ContatoDao bd = new ContatoDao();
				
		// método elegante	
		if (bd.altera(contato)) {
			System.out.println("Alterado!");
		} else {
			System.out.println("Erro ao alterar contato!");
		}
	}

}
