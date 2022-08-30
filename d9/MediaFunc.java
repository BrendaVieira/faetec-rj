import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class MediaFunc {
	public static void main (String arg[]) {
		String nome;
		double n1, n2;
		DecimalFormat df = new DecimalFormat("0.0");
		nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ", "Média", JOptionPane.QUESTION_MESSAGE);
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota 1", "Exercício 2", JOptionPane.QUESTION_MESSAGE));
		n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota 2", "Exercício 2", JOptionPane.QUESTION_MESSAGE));
		JOptionPane.showMessageDialog(null, "O valor da média é " + df.format(CalculoMedia(n1, n2)), "Média", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static double CalculoMedia(double num1, double num2) {
		double resultado;
		resultado = (num1 + num2) / 2;
		return resultado;
	}
}