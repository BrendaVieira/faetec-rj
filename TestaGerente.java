package aula241;

public class TestaGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("Jo�o da Silva");
		gerente.setSalario(5000.0);
		gerente.setSenha(4321);
		
		System.out.println(gerente.getBonificacao());
	}
}

