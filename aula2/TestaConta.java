
public class TestaConta {

	public static void main(String[] args) {
		
		Conta cc1 = new Conta();
		cc1.nome = "José";
		cc1.saldo = 1000.00;

		Conta cc2 = new Conta();
		cc2.nome = "Maria";
		cc2.saldo = 2000.00;
		
		Tesouro titulo = new Tesouro();
		titulo.prazo = 49;
		//System.out.println("O valor do juros e " + titulo.receberJuros(1000));
	}

}
