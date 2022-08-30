import java.text.DecimalFormat;
import javax.swing.*;

public class DoisNumeros {
	public static void main(String args[]) {
		double n1, n2;
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Número 1", "Exercício 1", JOptionPane.QUESTION_MESSAGE));
		n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Número 1", "Exercício 1", JOptionPane.QUESTION_MESSAGE));
		
		Adicao(n1,n2);
		Subtracao(n1,n2);
		Multiplicacao(n1,n2);
		Divisao(n1,n2);
	}
	
	public static void Adicao(double num1, double num2) {
		DecimalFormat df = new DecimalFormat("0.0");
		double resultado;
		resultado = num1 + num2;
		JOptionPane.showMessageDialog(null, "O valor da soma é " + df.format(resultado), "Adição", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void Subtracao(double num1, double num2) {
		DecimalFormat df = new DecimalFormat("0.0");
		double resultado;
		resultado = num1 - num2;
		JOptionPane.showMessageDialog(null, "O valor da subtracao é " + df.format(resultado), "Subtração", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void Multiplicacao(double num1, double num2) {
		DecimalFormat df = new DecimalFormat("0.0");
		double resultado;
		resultado = num1 * num2;
		JOptionPane.showMessageDialog(null, "O valor da multiplicação é " + df.format(resultado), "Multiplicação", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void Divisao(double num1, double num2) {
		DecimalFormat df = new DecimalFormat("0.0");
		double resultado;
		resultado = num1 / num2;
		JOptionPane.showMessageDialog(null, "O valor da divisão é " + df.format(resultado), "Divisão", JOptionPane.PLAIN_MESSAGE);
	}
}