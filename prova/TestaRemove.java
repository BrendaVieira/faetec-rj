package visao;

import modelo.Contato;
import controle.ContatoDao;

public class TestaRemove {
	public static void main(String[] args) {
		// pronto para gravar
		Contato contato = new Contato();
				
		contato.setId((long) 18);
				
		// grave nessa conex�o!!!
		ContatoDao bd = new ContatoDao();
				
		// m�todo elegante	
		if (bd.remove(contato)) {
			System.out.println("Apagado!");
	    } else {
	        System.out.println("Erro ao apagar contato!");
	    }
	}
}
