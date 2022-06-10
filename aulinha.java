package aulajava;

import java.io.*;

public class aulinha {

	public static void main(String[] args) {
		
		//variáveis
		String s = "";
		float nota1=0,nota2=0,trabalho=0,media=0;
		DataInputStream dado;
		
		try{
			System.out.println("Entre com a nota 1: ");
			dado = new DataInputStream(System.in);
			s = dado.readLine();
			nota1=Float.parseFloat(s); //converte a entrada de texto em numero
			
			System.out.println("Entre com a nota 2: ");
			dado = new DataInputStream(System.in);
			s = dado.readLine();
			nota2=Float.parseFloat(s);
			
			System.out.println("Entre com a nota do trabalho: ");
			dado = new DataInputStream(System.in);
			s = dado.readLine();
			trabalho=Float.parseFloat(s);
			
			//calculo e resultado
			media = (nota1+nota2+trabalho)/3;
			
			System.out.println("Media: " + media);
			
			if(media >= 7.0){
				System.out.println("Aprovado");
			}else{
				if(media >= 5.0){
					System.out.println("Recuperação");
				}else{
					System.out.println("Reprovado");
				}
			}
		}
		//captura erros
		catch(IOException e){
			System.out.println("Erro na entrada de dados" );
		}
		catch(NumberFormatException e){
			System.out.println("Erro na conversão. Digite números" );
		}	
	}
}