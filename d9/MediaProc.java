import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class MediaProc {
	public static void main (String arg[]) {
		String nome;
		double n1, n2;
		nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ", "Média", JOptionPane.QUESTION_MESSAGE);
		n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota 1", "Exercício 2", JOptionPane.QUESTION_MESSAGE));
		n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota 1", "Exercício 2", JOptionPane.QUESTION_MESSAGE));
		CalculoMedia(n1, n2);
	}
	
	public static void CalculoMedia(double num1, double num2) {
		DecimalFormat df = new DecimalFormat("0.0");
		double resultado;
		resultado = (num1 + num2) / 2;
		JOptionPane.showMessageDialog(null, "O valor da média é " + df.format(resultado), "Média", JOptionPane.PLAIN_MESSAGE);
	}
}