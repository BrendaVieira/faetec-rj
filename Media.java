package aulanoite;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		String nome = "";
		
		//variaveis
		double nota1, nota2, nota3, media = 0.0;
		
		imprimir("Digite seu nome: ");
		Scanner ler = new Scanner(System.in);
		nome = ler.nextLine();
		//imprimir("Seu nome é " + nome);
		
		imprimir("Digite a nota 1: ");
		Scanner n1 = new Scanner(System.in);
		nota1 = n1.nextDouble();
		
		imprimir("Digite a nota 2: ");
		Scanner n2 = new Scanner(System.in);
		nota2 = n2.nextDouble();
		
		imprimir("Digite a nota 3: ");
		Scanner n3 = new Scanner(System.in);
		nota3 = n3.nextDouble();
		
		//calculo e resultado
		media = (nota1 + nota2 + nota3)/3;
		System.out.println("A média do aluno " + nome + "é" + media);
		//nesse caso não usar imprimir por conta da linha, printf só para entrada de dados
		
		if (media >= 7.0){
			System.out.println("Aprovado");
		}else{
			if (media >= 5.0){
				System.out.println("Recuperação");
			}else{
				System.out.println("Reprovado");
			}
		}
		
	}
	
	public static void imprimir(String msg){
		System.out.printf(msg);
	}

}
