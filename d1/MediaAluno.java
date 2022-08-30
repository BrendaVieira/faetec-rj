import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "";
		double nota1, nota2, nota3, media = 0.0;
		
		System.out.printf("Digite seu nome: ");
		Scanner ler = new Scanner(System.in);
		nome = ler.nextLine();
		
		System.out.printf("Digite a nota 1: ");
		Scanner n1 = new Scanner(System.in);
		nota1 = n1.nextDouble();
		
		System.out.printf("Digite a nota 2: ");
		Scanner n2 = new Scanner(System.in);
		nota2 = n2.nextDouble();
		
		System.out.printf("Digite a nota 3: ");
		Scanner n3 = new Scanner(System.in);
		nota3 = n3.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("A média do aluno " + nome + " é " + media);
		
		if (media >= 7.0)
			System.out.println("Aprovado");
		else if (media >= 5.0)
			System.out.println("Recuperação");
		else
			System.out.println("Reprovado");
	}
}
