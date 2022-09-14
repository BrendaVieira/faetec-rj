package javinha;

/*
Programa em que calcula o IMC - Índice de Massa Corpórea, de uma pessoa.

Dado o seu peso e altura usando a fórmula do IMC = peso divido pelo quadrado da

altura e em seguida mostra a mensagem de acordo com a tabela;

IMC 

Abaixo de 19 Muito Magro

19 - 24 Peso Saudável

25 - 29 Sobrepeso

30 - 34 Obesidade Grau 1

35 - 39 Obesidade Grau 2

Acima ou igual a 40 Obesidade Grau 3
*/

import javax.swing.*;


public class IMC{

		public static void main(String args[]){

		float peso=0, altura=0, imc=0;
		
		String entrada = new String();
		 
		
		entrada = JOptionPane.showInputDialog(null,"Digite o Peso(kg): ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
		peso = Float.parseFloat(entrada);
		
		 
		
		entrada = JOptionPane.showInputDialog(null,"Digita a Altura(M): ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
		altura = Float.parseFloat(entrada);
		
		imc = (peso)/(altura*altura);
		
		
		if (imc <=19){
			JOptionPane.showMessageDialog(null, "Muito Magro. IMC: " +imc);
		}
		
		if (imc >=19 && imc <=24){
			JOptionPane.showMessageDialog(null, "Peso Saudável. IMC: " +imc);
		}
		
		if (imc >=25 && imc <=29){
			JOptionPane.showMessageDialog(null, "Sobrepeso. IMC: " +imc);
		}
		
		if (imc >=30 && imc <=34){
			JOptionPane.showMessageDialog(null, "Obesidade Grau 1. IMC: " +imc);
		}
		
		if (imc >=35 && imc <=39){
			JOptionPane.showMessageDialog(null, "Obesidade Grau 2. IMC: " +imc);
		}
		
		if (imc >=40){
			JOptionPane.showMessageDialog(null, "Obesidade Grau 3. IMC: " +imc);
		}
	
	}
	
}
