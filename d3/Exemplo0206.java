import java.io.*;

public class Exemplo0206 {

	public static void main(String[] args) {

		String S = "";
		float nota1 = 0, nota2 = 0, trabalho = 0, media = 0;
		DataInputStream dado;
		try {
			System.out.println("digite a nota 1 ");
			dado = new DataInputStream(System.in);
			S = dado.readLine();
			nota1 = Float.parseFloat(S);
			System.out.println("digite a nota 2");
			dado = new DataInputStream(System.in);
			nota2 = Float.parseFloat(S);
			System.out.println("digite a nota do trabalho");
			dado = new DataInputStream(System.in);
			S = dado.readLine();
			trabalho = Float.parseFloat(S);
			media = (nota1 + nota2 + trabalho) / 3;
			System.out.println("media:" + media);
		} catch (IOException e) {
			System.out.println("erro de entrada de dados");
		} catch (NumberFormatException e) {
			System.out.println("erro de conversão.digite um numero");
			 //System.out.println (e.getmessage())
			 //(e.printStackTrace();

		}
	}
}
