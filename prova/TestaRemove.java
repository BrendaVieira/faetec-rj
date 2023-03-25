package visao;

import modelo.Contato;
import controle.ContatoDao;

public class TestaRemove {
	public static void main(String[] args) {
		// pronto para gravar
		Contato contato = new Contato();
				
		contato.setId((long) 18);
				
		// grave nessa conexão!!!
		ContatoDao bd = new ContatoDao();
				
		// método elegante	
		if (bd.remove(contato)) {
			System.out.println("Apagado!");
	    } else {
	        System.out.println("Erro ao apagar contato!");
	    }
	}
}
