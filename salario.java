/* Crie um programa para cálculo do salário líquido em que três vaçores devem ser informados pelo
 * usuário na linha de comando: a quantidade de horas trabalhadas, o salário hora e o número de
 * dependentes. O programa deve mostrar na tela as informações contidas no lado esquerdo da tabela
 * seguinte. Os cálculos correspondentes aparecem no lado direito.
 * 
 * INFORMAÇÃO			CÁLCULO
 * Salário Bruto 		Horas trabalhadas * Salário Hora + (50 * Nº Dependentes)
 * 
 * Desconto INSS		Se Salário Bruto <= 1000 INSS = Salário Bruto * 8.5/100
 * 						Se Salário Bruto > 1000 INSS = Salário Bruto * 9/100
 * 
 * Desconto IR			Se Salário Bruto <= 500 IR = 0
 * 						Se Salário Bruto > 500 e <= 1000 IR = Salário Bruto * 5/100
 * 						Se Salário Bruto > 1000 IR = Salário Bruto * 7/100
 * 
 * Salário Líquido		Salário Bruto - INSS - IR
 * 
*/

//import javax.swing.JOptionPane;

package javinha;

import java.io.*;

public class salario {

	public static void main(String[] args) {
		
		//variáveis
		String s = "";
        //Scanner read = new Scanner(System.in);
        int quantidadeHoras, dependentes;
        float salarioHora, salarioBruto, inss, ir, salarioLiquido;
        DataInputStream dado;
		
		try{System.out.println("Entre com o valor da hora trabalhada: ");
        //sal = read.nextFloat();------- scanner read

		dado = new DataInputStream(System.in);
		s = dado.readLine();
		salarioHora=Float.parseFloat(s); //converte a entrada de texto em numero
		
		System.out.println("Entre com a quantidade de horas trabalhadas: ");
		dado = new DataInputStream(System.in);
		s = dado.readLine();
		quantidadeHoras=Integer.parseInt(s);
		
		System.out.println("Entre com o numero de dependentes: ");
		dado = new DataInputStream(System.in);
		s = dado.readLine();
		dependentes=Integer.parseInt(s);
		
		//calculo e resultado
        salarioBruto = (quantidadeHoras * salarioHora) + (50 * dependentes);
        System.out.println("Salario Bruto: " + salarioBruto);
        
        //desconto inss
		if(salarioBruto<=1000){
            inss = (float) (salarioBruto * 0.085);     // 8.5/100
		}
        else{
                inss = (float) (salarioBruto * 0.09);     // 9/100
			}
		System.out.println("Desconto INSS: " + inss);
		
        // desconto ir
        if (salarioBruto <= 500 ){
            ir = 0;
        }
        else{
            if((salarioBruto > 500 ) && (salarioBruto <= 1000)){
                ir = (float) (salarioBruto * 0.05); // 5/100
            }
            else {
                ir = (float) (salarioBruto * 0.01);  //
            }
            System.out.println("Desconto IR: " + ir);
        }

        salarioLiquido = salarioBruto - inss - ir;
        System.out.println("Salario Liquido: " + salarioLiquido);
        //JOptionPane.showMessageDialog(null,"O Salario Liquido e: " + salarioLiquido);
	}
		//captura erros
		catch(IOException e){
			System.out.println("Erro na entrada de dados" );
		}
		catch(NumberFormatException e){
			System.out.println("Erro na conversão. Digite números" );
		}	
	}
}
