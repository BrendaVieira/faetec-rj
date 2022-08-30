
public class BalancoTrimestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gastosJaneiro = 15000;
		int gastosfevereiro = 23000;
		int gastosMarco = 17000;
		
		int gastrosTrimestre = gastosJaneiro + gastosfevereiro + gastosMarco;
		
		double mediaMensal = 0.0;
		
		mediaMensal = (gastosJaneiro + gastosfevereiro + gastosMarco)/3;
		
		System.out.println("Valor gasto em Janeiro: " + gastosJaneiro);
		System.out.println("Valor gasto em Fevereiro: " + gastosfevereiro);
		System.out.println("Valor gasto em Março: " + gastosMarco);
		System.out.println("Valor gasto no Trimestre: " +gastrosTrimestre);
		System.out.println("Valor da média mensal = " + mediaMensal);
	}

}
