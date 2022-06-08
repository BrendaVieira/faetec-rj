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
		
		//exibi��o do resultado
		System.out.println("Valor gasto em Janeiro = " + gastosJaneiro);
		System.out.println("Valor gasto em Fevereiro = " + gastosFevereiro);
		System.out.println("Valor gasto em Mar�o = " + gastosMarco);
		System.out.println("Valor gasto no Trimestre = " + gastosTrimestre);
		System.out.println("Valor m�dia mensal = " + mediaMensal);
		
	}

	/*     // fun��o alternativa pra encurtar exibi��o
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
	
	//exibi��o do resultado
	imprimir("Valor gasto em Janeiro = " + gastosJaneiro);
	imprimir("Valor gasto em Fevereiro = " + gastosFevereiro);
	imprimir("Valor gasto em Mar�o = " + gastosMarco);
	imprimir("Valor gasto no Trimestre = " + gastosTrimestre);
	imprimir("Valor m�dia mensal = " + mediaMensal);
	
}
	*/

}

