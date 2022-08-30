import javax.swing.*;

public class MediaTurma {

	public static void main(String[] args) {
		//área de declaração de variaveis
		String s = "", nome = "", nomemaior = "", nomemenor = "";
		double nota1, nota2, nota3, media = 0.0, menormd = 99999.99, maiormd = 0.0, mediaturma = 0.0;
		String titulo = "Cálculo da Média";
		int contador = 1, qtdalunos = 1;
		
		s = JOptionPane.showInputDialog(null, "Digite a quantidade de alunos: ", titulo, JOptionPane.QUESTION_MESSAGE); 
		qtdalunos = Integer.parseInt(s);
		
		while (contador <= qtdalunos) {

			// área de leitura
			nome = JOptionPane.showInputDialog(null, "Digite o nome do " + contador + "o aluno:", titulo, JOptionPane.QUESTION_MESSAGE);

			s = JOptionPane.showInputDialog(null, "Digite a nota 1 do " + contador + "o aluno:", titulo, JOptionPane.QUESTION_MESSAGE);
			nota1 = Double.parseDouble(s);

			s = JOptionPane.showInputDialog(null, "Digite a nota 2 do " + contador + "o aluno:", titulo, JOptionPane.QUESTION_MESSAGE);
			nota2 = Double.parseDouble(s);

			s = JOptionPane.showInputDialog(null, "Digite a nota 3 do " + contador + "o aluno:", titulo, JOptionPane.QUESTION_MESSAGE);
			nota3 = Double.parseDouble(s);

			// cálculo da média
			media = (nota1 + nota2 + nota3) / 3;
			
			// cálculo da média da turma
			mediaturma = mediaturma + media;
			
			// área de impressão
			mensagem(titulo, "A média do aluno " + nome + " é " + media);

			// resultado do aluno
			if (media >= 7.0) {
				mensagem(titulo,"A situação do aluno " + nome + " é Aprovado");
			} else {
				if (media >= 5.0) {
					mensagem(titulo,"A situação do aluno " + nome + " é Recuperação");
				} else {
					mensagem(titulo,"A situação do aluno " + nome + " é Reprovado");
				}
			}
			
			// verificação da maior média
			if (media > maiormd) {
				maiormd = media;
				nomemaior = nome;
			}
			
			// verificação da menor média
			if (media < menormd) {
				menormd = media;
				nomemenor = nome;
			}
			
			contador++;
		}
		
		// cálculo da média da turma
		mediaturma = mediaturma / qtdalunos;
		
		JOptionPane.showMessageDialog(null, "O aluno de maior média é o " + nomemaior + " com média " + maiormd, titulo, JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "O aluno de menor média é o " + nomemenor + " com média " + menormd, titulo, JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "O média da turma é " + mediaturma, titulo, JOptionPane.PLAIN_MESSAGE);
	}

	public static void mensagem(String titulo, String msg) {
		JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.PLAIN_MESSAGE);
	}
	
}