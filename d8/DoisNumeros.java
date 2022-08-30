import java.text.DecimalFormat;
import javax.swing.*;

public class DoisNumeros {
	public static void main(String args[]) {
		double n1, n2;
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"N�mero 1", "Exerc�cio 1", JOptionPane.QUESTION_MESSAGE));
		n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"N�mero 1", "Exerc�cio 1", JOptionPane.QUESTION_MESSAGE));
		
		Adicao(n1,n2);
		Subtracao(n1,n2);
		Multiplicacao(n1,n2);
		Divisao(n1,n2);
	}
	
	public static void Adicao(double num1, double num2) {
		DecimalFormat df = new DecimalFormat("0.0");
		double resultado;
		resultado = num1 + num2;
		JOptionPane.showMessageDialog(null, "O valor da soma � " + df.format(resultado), "Adi��o", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void Subtracao(double num1, double num2) {
		DecimalFormat df = new DecimalFormat("0.0");
		double resultado;
		resultado = num1 - num2;
		JOptionPane.showMessageDialog(null, "O valor da subtracao � " + df.format(resultado), "Subtra��o", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void Multiplicacao(double num1, double num2) {
		DecimalFormat df = new DecimalFormat("0.0");
		double resultado;
		resultado = num1 * num2;
		JOptionPane.showMessageDialog(null, "O valor da multiplica��o � " + df.format(resultado), "Multiplica��o", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void Divisao(double num1, double num2) {
		DecimalFormat df = new DecimalFormat("0.0");
		double resultado;
		resultado = num1 / num2;
		JOptionPane.showMessageDialog(null, "O valor da divis�o � " + df.format(resultado), "Divis�o", JOptionPane.PLAIN_MESSAGE);
	}
}