package aulanoite;

public class ContagemRegressiva {

	public static void main(String[] args) {
		
		System.out.println("Contagem Regressiva para Lançamento: ");
		
		for(int i = 10; i >= 0; i--){ 							// de 10 a 0
			System.out.println(i);
		}
		System.out.println("Decolar!");
		
		for(int i = 0; i <= 5; i++){ 							// de 0 a 5
			System.out.println(i);
		}	
		for(int i = 0; i <= 20; i+=2){ 							// de 0 a 20 pulando de 2 em 2
			System.out.println(i);
		}
		for(int i = 0; i <= 5; i++){ 							// quadrados de 0 a 5
			System.out.println("i ao quadrado = " + i * i);
		}
		/*
		for(;;){												// loop infinito
			System.out.println("Bem vindo ao Java");
		}*/
		
		final int N = 100;
		int total = 0;
		
		for(int i = 1; i < N; i++){ 
			int value = readInt("?");
			total += value;
		}
		System.out.println("O total e " + total);
	}

	private static int readInt(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
}
