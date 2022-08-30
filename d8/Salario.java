import java.text.DecimalFormat;

import javax.swing.*;

public class Salario {
	public static void main(String arghs[]) {
		Ler();
	}
	
	public static void Ler() {
		String nome;
		double salario;
		DecimalFormat df = new DecimalFormat("0.00");
		nome = JOptionPane.showInputDialog(null, "Digite o nome do funcionário:", "Salário", JOptionPane.QUESTION_MESSAGE);
		salario = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o salário do funcionário:", "Exercício 3", JOptionPane.QUESTION_MESSAGE));
		JOptionPane.showMessageDialog(null, "O valor do FGTS é " + df.format(CalculoFGTS(salario)), "FGTS", JOptionPane.PLAIN_MESSAGE);
	    CalculoINSS(salario);
	}
	
	public static double CalculoFGTS(double sal) {
		double fgts;
		fgts = sal * 0.08;
		return fgts;
	}
	
	public static void CalculoINSS(double sal) {
		DecimalFormat df = new DecimalFormat("0.00");
		double inss;
		if (sal <= 1247.70) {
			inss = sal * 0.08;
		} else {
			if ((sal >= 1247.71) && (sal <= 2079.50)) {
				inss = sal * 0.09;
			} else {
				if ((sal >= 2079.51) && (sal <= 4159.00)) {
					inss = sal * 0.11;
				} else {
					inss = sal * 0.12;
				}
			}
		}
			
		JOptionPane.showMessageDialog(null, "O valor do INSS é " + df.format(inss), "INSS", JOptionPane.PLAIN_MESSAGE);
	}
}