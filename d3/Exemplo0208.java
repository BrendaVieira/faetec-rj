import javax.swing.*;

public class Exemplo0208 {

	public static void main(String[] args) {
		String s = "";
		int x = 0;
		try {
			s = JOptionPane.showInputDialog(null, "Entre com um valor inteiro: ", "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);
			x = Integer.parseInt(s);
			switch (x) {
			case 0:
				JOptionPane.showMessageDialog(null, "Zero.", "Saída de Dados", JOptionPane.PLAIN_MESSAGE);
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "Um.", "Saída de Dados", JOptionPane.PLAIN_MESSAGE);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Dois.", "Saída de Dados", JOptionPane.PLAIN_MESSAGE);
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Três.", "Saída de Dados", JOptionPane.PLAIN_MESSAGE);
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Quatro.", "Saída de Dados", JOptionPane.PLAIN_MESSAGE);
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Cinco.", "Saída de Dados", JOptionPane.PLAIN_MESSAGE);
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Seis.", "Saída de Dados", JOptionPane.PLAIN_MESSAGE);
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Sete.", "Saída de Dados", JOptionPane.PLAIN_MESSAGE);
				break;
			case 8:
				JOptionPane.showMessageDialog(null, "Oito.", "Saída de Dados", JOptionPane.PLAIN_MESSAGE);
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Nove.", "Saída de Dados", JOptionPane.PLAIN_MESSAGE);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Número desconhecido.", "Saída de Dados", JOptionPane.PLAIN_MESSAGE);
				break;
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Erro de conversão. Digite um número inteiro.", "Saída de Dados", JOptionPane.PLAIN_MESSAGE);
			// System.out.println (e.getmessage())
			// (e.printStackTrace();
		}
	}

}
