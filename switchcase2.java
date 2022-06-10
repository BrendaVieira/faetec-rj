package aulajava;

import javax.swing.*;

public class switchcase2 {

	public static void main(String[] args) {
		
		//vari�veis
		String s = "";
		int x = 0;
		
		try{
			//JOption.Pane cria um titulo e faz a leitura do texto (cixa de texto)
			s = JOptionPane.showInputDialog(null, "Digite um n�mero inteiro", "entrada de dados", JOptionPane.QUESTION_MESSAGE);
			x = Integer.parseInt(s); //converte a entrada de texto em numero inteiro
	
			switch(x){    //switch reduz os usos de if else
			case 0: System.out.println("zero");break; //break interrompe sen�o imprime todos
			case 1: System.out.println("um");break;
			case 2: System.out.println("dois");break;
			case 3: System.out.println("tr�s");break;
			case 4: System.out.println("quatro");break;
			case 5: System.out.println("cinco");break;
			case 6: System.out.println("seis");break;
			case 7: System.out.println("sete");break;
			case 8: System.out.println("oito");break;
			case 9: System.out.println("nove");break;
			default: System.out.println("N�mero desconhecido");break; //default captura erro de entrada
			}
			}
		
		//captura erros
			catch(NumberFormatException e){
				System.out.println("Erro na convers�o. Digite n�meros" );
				System.out.println(e.getMessage());
				e.printStackTrace();
			}	
	}
}
