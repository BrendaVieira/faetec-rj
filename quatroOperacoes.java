/*1 - Fa�a um programa em Java para ler dois n�meros reais e positivos.
 * Atrav�s do procedimento calcular as quatro opera��es aritm�ticas. */



package aulanoite;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class quatroOperacoes {

	public static void main(String[] args) {
		
		double num1 = 0, num2 = 0;
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro numero", "entrada de dados", JOptionPane.QUESTION_MESSAGE));
		num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo numero", "entrada de dados", JOptionPane.QUESTION_MESSAGE));
		
		Adicao(num1,num2);
		Subtracao(num1,num2);
		Multiplicacao(num1,num2);
		Divisao(num1,num2);
		}
	
		public static void Adicao(double n1, double n2){
			DecimalFormat df = new DecimalFormat("0.0");
			double resultado = n1 + n2;
			JOptionPane.showMessageDialog(null, "O valor da soma � " + df.format(resultado), "Adi��o", JOptionPane.PLAIN_MESSAGE);	
		}
		
		public static void Subtracao(double n1, double n2){
			DecimalFormat df = new DecimalFormat("0.0");
			double resultado = n1 - n2;
			JOptionPane.showMessageDialog(null, "O valor da soma �" + df.format(resultado), "Subtra��o", JOptionPane.PLAIN_MESSAGE);
		}
		
		public static void Multiplicacao(double n1, double n2){
			DecimalFormat df = new DecimalFormat("0.0");
			double resultado = n1 * n2;
			JOptionPane.showMessageDialog(null, "O valor da soma �" + df.format(resultado), "Multiplica��o", JOptionPane.PLAIN_MESSAGE);
			
		}
		
		public static void Divisao(double n1, double n2){
			DecimalFormat df = new DecimalFormat("0.0");
			double resultado = n1 / n2;
			JOptionPane.showMessageDialog(null, "O valor da soma �" + df.format(resultado), "Divis�o", JOptionPane.PLAIN_MESSAGE);
			
		}
		
		
		
		
		
		
		
		
		
	}