package visao;

import java.util.Calendar;

import controle.ContatoDao;
import modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		// pronto para gravar
		Contato contato = new Contato();
		
		contato.setNome("Caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("R. Vergueiro 3185 cj87");
		contato.setDataNascimento(Calendar.getInstance());
		
		// grave nessa conexão!!!
		ContatoDao bd = new ContatoDao();
		
		// método elegante
		if (bd.adiciona(contato)) {
		   System.out.println("Gravado!");
    	} else {
    		 System.out.println("Erro ao gravar contato!");
    	}
	}

}
