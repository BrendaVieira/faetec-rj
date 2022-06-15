/*
 * 
 * 
 * 
 * 
*/

//import javax.swing.JOptionPane;
import java.io.*;

public class salario{
    public static void main(String[] args) {

        //variaveis
        String s = "";
        //Scanner read = new Scanner(System.in);
        int quantidadeHoras, dependentes;
        float salarioHora, salarioBruto, inss, ir, salarioLiquido;
        DataInputStream dado;
		
		try{
            
			System.out.println("Entre com o valor da hora trabalhada: ");
            //sal = read.nextFloat();------- scanner read

			dado = new DataInputStream(System.in);
			s = dado.readLine();
			salarioHora=Float.parseFloat(s); //converte a entrada de texto em numero
			
			System.out.println("Entre com a quantidade de horas trabalhadas: ");
			dado = new DataInputStream(System.in);
			s = dado.readLine();
			quantidadeHoras=Float.parseFloat(s);
			
			System.out.println("Entre com o numero de dependentes: ");
			dado = new DataInputStream(System.in);
			s = dado.readLine();
			dependentes=Float.parseFloat(s);
			
			//calculo e resultado
            salarioBruto = (quantidadeHoras * salarioHora) + (50 * dependentes);
			
            //desconto inss
			if(salarioBruto<=1000){
                inss = (salarioBruto * 0.085);     // 8.5/100
			}
            else{
                    inss = (salarioBruto * 0.09);     // 9/100
				}
            
            // desconto ir
            if (salarioBruto <= 500 ){
                ir = 0;
            }
            else{
                if((salarioBruto > 500 ) && (salarioBruto <= 1000)){
                    ir = (salarioBruto * 0.05); // 5/100
                }
                else {
                    ir = (salarioBruto * 0.01);  //
                }
            }
			}

            salarioLiquido = salarioBruto - inss - ir;
            System.out.println("O Salario Liquido e: " + salarioLiquido);
            //JOptionPane.showMessageDialog(null,"O Salario Liquido e: " + salarioLiquido);
		}

		//captura erros
		catch(IOException e){
			System.out.println("Erro na entrada de dados" );
		}
		catch(NumberFormatException e){
			System.out.println("Erro na convers�o. Digite n�meros" );
		}	
	}