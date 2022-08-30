import javax.swing.*;

public class MediaTurma {

	public static void main(String[] args) {
		//�rea de declara��o de variaveis
		String s = "", nome = "", nomemaior = "", nomemenor = "";
		double nota1, nota2, nota3, media = 0.0, menormd = 99999.99, maiormd = 0.0, mediaturma = 0.0;
		String titulo = "C�lculo da M�dia";
		int contador = 1, qtdalunos = 1;
		
		s = JOptionPane.showInputDialog(null, "Digite a quantidade de alunos: ", titulo, JOptionPane.QUESTION_MESSAGE); 
		qtdalunos = Integer.parseInt(s);
		
		while (contador <= qtdalunos) {

			// �rea de leitura
			nome = JOptionPane.showInputDialog(null, "Digite o nome do " + contador + "o aluno:", titulo, JOptionPane.QUESTION_MESSAGE);

			s = JOptionPane.showInputDialog(null, "Digite a nota 1 do " + contador + "o aluno:", titulo, JOptionPane.QUESTION_MESSAGE);
			nota1 = Double.parseDouble(s);

			s = JOptionPane.showInputDialog(null, "Digite a nota 2 do " + contador + "o aluno:", titulo, JOptionPane.QUESTION_MESSAGE);
			nota2 = Double.parseDouble(s);

			s = JOptionPane.showInputDialog(null, "Digite a nota 3 do " + contador + "o aluno:", titulo, JOptionPane.QUESTION_MESSAGE);
			nota3 = Double.parseDouble(s);

			// c�lculo da m�dia
			media = (nota1 + nota2 + nota3) / 3;
			
			// c�lculo da m�dia da turma
			mediaturma = mediaturma + media;
			
			// �rea de impress�o
			mensagem(titulo, "A m�dia do aluno " + nome + " � " + media);

			// resultado do aluno
			if (media >= 7.0) {
				mensagem(titulo,"A situa��o do aluno " + nome + " � Aprovado");
			} else {
				if (media >= 5.0) {
					mensagem(titulo,"A situa��o do aluno " + nome + " � Recupera��o");
				} else {
					mensagem(titulo,"A situa��o do aluno " + nome + " � Reprovado");
				}
			}
			
			// verifica��o da maior m�dia
			if (media > maiormd) {
				maiormd = media;
				nomemaior = nome;
			}
			
			// verifica��o da menor m�dia
			if (media < menormd) {
				menormd = media;
				nomemenor = nome;
			}
			
			contador++;
		}
		
		// c�lculo da m�dia da turma
		mediaturma = mediaturma / qtdalunos;
		
		JOptionPane.showMessageDialog(null, "O aluno de maior m�dia � o " + nomemaior + " com m�dia " + maiormd, titulo, JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "O aluno de menor m�dia � o " + nomemenor + " com m�dia " + menormd, titulo, JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "O m�dia da turma � " + mediaturma, titulo, JOptionPane.PLAIN_MESSAGE);
	}

	public static void mensagem(String titulo, String msg) {
		JOptionPane.showMessageDialog(null, msg, titulo, JOptionPane.PLAIN_MESSAGE);
	}
	
}