import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		//área de declaração de variaveis
		String nome = "";
		int i = 1, n = 1;
		double nota1, nota2, nota3, media = 0.0;
		Scanner ler = new Scanner(System.in);
		Scanner n1 = new Scanner(System.in);
		Scanner n2 = new Scanner(System.in);
		Scanner n3 = new Scanner(System.in);
		Scanner qtdAlunos = new Scanner(System.in);
		
		imprimir("Digite a quantidade de alunos: ");
		n = qtdAlunos.nextInt();
		
		while (i <= n) {

			// área de leitura
			imprimir("Digite o nome do " + i + "o aluno:");
			nome = ler.nextLine();

			imprimir("Digite a nota 1 do " + i + "o aluno:");
			nota1 = n1.nextDouble();

			imprimir("Digite a nota 2 do " + i + "o aluno:");
			nota2 = n2.nextDouble();

			imprimir("Digite a nota 3 do " + i + "o aluno:");
			nota3 = n3.nextDouble();

			// área de calculo e impressão
			media = (nota1 + nota2 + nota3) / 3;
			System.out.println("A média do aluno " + nome + " é " + media);

			// área de resultado
			if (media >= 7.0) {
				System.out.println("Aprovado");
			} else {
				if (media >= 5.0) {
					System.out.println("Recuperação");
				} else {
					System.out.println("Reprovado");
				}
			}
			
			i++;
		}
	}

	public static void imprimir(String msg) {
		System.out.printf(msg);
	}
	
}
