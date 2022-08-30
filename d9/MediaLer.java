import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class MediaLer {

	public static void main(String[] args) {
		Ler();
	}

	public static void Ler() {
		DecimalFormat df = new DecimalFormat("0.0");
		String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ", "Média", JOptionPane.QUESTION_MESSAGE);
		double n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota 1", "Media", JOptionPane.QUESTION_MESSAGE));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Nota 2", "Media", JOptionPane.QUESTION_MESSAGE));
		JOptionPane.showMessageDialog(null, "O valor da média é " + df.format(CalculoMedia(n1, n2)), "Média", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static double CalculoMedia(double num1, double num2) {
		double resultado;
		resultado = (num1 + num2) / 2;
		return resultado;
	}
}
