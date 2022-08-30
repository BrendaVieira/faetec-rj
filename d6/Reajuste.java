import javax.swing.*;

public class Reajuste{
	public static void main(String args[]){
		int codprod = 0, codreaj = 0;
		double valorprod = 0.0, novovalor = 0.0;
		String s = "";
		
		s = JOptionPane.showInputDialog(null, "Digite o código do produto: ", "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);
		codprod = Integer.parseInt(s);
		
		s = JOptionPane.showInputDialog(null, "Digite o valor do produto: ", "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);
		valorprod = Double.parseDouble(s);
		
		s = JOptionPane.showInputDialog(null, "Digite o código de aumento: ", "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);
		codreaj = Integer.parseInt(s);
		
		switch (codreaj) {
		case 1 :
			novovalor = valorprod * 1.15;
			break;
		case 3 :
			novovalor = valorprod * 1.20;
			break;
		case 4 :
			novovalor = valorprod * 1.35;
			break;
		case 8 :
			novovalor = valorprod * 1.40;
			break;
		default :
			novovalor = valorprod;
			break;
		}
		
		JOptionPane.showMessageDialog(null, "O novo valor do produto " + codprod + " é " + novovalor, "Saída de Dados", JOptionPane.PLAIN_MESSAGE);
	}
}