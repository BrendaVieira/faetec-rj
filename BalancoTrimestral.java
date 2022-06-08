package aulanoite;

public class BalancoTrimestral {

	public static void main(String[] args) {
		
		//variaveis
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		
		//calculo
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		
		double mediaMensal = gastosTrimestre/3;
		
		//exibição do resultado
		System.out.println("Valor gasto em Janeiro = " + gastosJaneiro);
		System.out.println("Valor gasto em Fevereiro = " + gastosFevereiro);
		System.out.println("Valor gasto em Março = " + gastosMarco);
		System.out.println("Valor gasto no Trimestre = " + gastosTrimestre);
		System.out.println("Valor média mensal = " + mediaMensal);
		
	}

	/*     // função alternativa pra encurtar exibição
    public static void imprimir(String mensagem){
	System.out.println(mensagem);
	}
	
	public static void main(String[] args) {
	
	//variaveis
	int gastosJaneiro = 15000;
	int gastosFevereiro = 23000;
	int gastosMarco = 17000;
	
	//calculo
	int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
	
	double mediaMensal = gastosTrimestre/3;
	
	//exibição do resultado
	imprimir("Valor gasto em Janeiro = " + gastosJaneiro);
	imprimir("Valor gasto em Fevereiro = " + gastosFevereiro);
	imprimir("Valor gasto em Março = " + gastosMarco);
	imprimir("Valor gasto no Trimestre = " + gastosTrimestre);
	imprimir("Valor média mensal = " + mediaMensal);
	
}
	*/

}

