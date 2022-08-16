/*1 - Faça um programa em Java para ler dois números reais e positivos.
 * Através do procedimento calcular as quatro operações aritméticas. */



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
			JOptionPane.showMessageDialog(null, "O valor da soma é " + df.format(resultado), "Adição", JOptionPane.PLAIN_MESSAGE);	
		}
		
		public static void Subtracao(double n1, double n2){
			DecimalFormat df = new DecimalFormat("0.0");
			double resultado = n1 - n2;
			JOptionPane.showMessageDialog(null, "O valor da soma é" + df.format(resultado), "Subtração", JOptionPane.PLAIN_MESSAGE);
		}
		
		public static void Multiplicacao(double n1, double n2){
			DecimalFormat df = new DecimalFormat("0.0");
			double resultado = n1 * n2;
			JOptionPane.showMessageDialog(null, "O valor da soma é" + df.format(resultado), "Multiplicação", JOptionPane.PLAIN_MESSAGE);
			
		}
		
		public static void Divisao(double n1, double n2){
			DecimalFormat df = new DecimalFormat("0.0");
			double resultado = n1 / n2;
			JOptionPane.showMessageDialog(null, "O valor da soma é" + df.format(resultado), "Divisão", JOptionPane.PLAIN_MESSAGE);
			
		}
		
		
		
		
		
		
		
		
		
	}