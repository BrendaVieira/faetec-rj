/*2- Faça um programa em Java para ler nome e duas notas, calcular e mostrar através de
 * procedimento com passagem de parâmetros por valor a média.
 * */

package aulanoite;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class media {

	public static void main(String[] args) {
		
double nota1 = 0, nota2 = 0, media = 0;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 1", "entrada de dados", JOptionPane.QUESTION_MESSAGE));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota 2", "entrada de dados", JOptionPane.QUESTION_MESSAGE));
	
		Media (nota1,nota2);
	}
		public static void Media(double nota1, double nota2){
			DecimalFormat df = new DecimalFormat("0.0");
			double resultado = (nota1 + nota2) / 2;
			JOptionPane.showMessageDialog(null, "O valor da média é " + df.format(resultado), "Media", JOptionPane.PLAIN_MESSAGE);	
		}
	}