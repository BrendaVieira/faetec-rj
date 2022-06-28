
package javinha;

import javax.swing.*;

public class salaario {

		public static void main(String[] args) {
			String s = "";
			int quantidadeHoras = 0, dependentes = 0;
	        float salarioHora = 0, salarioBruto = 0, inss = 0, ir = 0, salarioLiquido = 0;

			try{
				
				s = JOptionPane.showInputDialog(null,"Entre com o valor da hora trabalhada: ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
				salarioHora=Float.parseFloat(s); 
				
				s = JOptionPane.showInputDialog(null,"Entre com a quantidade de horas trabalhadas: ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
				quantidadeHoras=Integer.parseInt(s);
				
				s = JOptionPane.showInputDialog(null,"Entre com o numero de dependentes: ", "Entrada de dados", JOptionPane.QUESTION_MESSAGE);
				dependentes=Integer.parseInt(s);
				
				//calculo e resultado
		        salarioBruto = (quantidadeHoras * salarioHora) + (50 * dependentes);
		        JOptionPane.showMessageDialog(null,"Salario Bruto: " + salarioBruto);
		        //System.out.println("Salario Bruto: " + salarioBruto);
		        
		        //desconto inss
				if(salarioBruto<=1000){
		            inss = (float) (salarioBruto * 0.085);     // 8.5/100
				}
		        else{
		                inss = (float) (salarioBruto * 0.09);     // 9/100
					}
					JOptionPane.showMessageDialog(null,"Desconto INSS: " + inss);
					//System.out.println("Desconto INSS: " + inss);
					
				// desconto ir
		        if (salarioBruto <= 500 ){
		            ir = 0;
		        }
		        else{
		            if((salarioBruto > 500 ) && (salarioBruto <= 1000)){
		                ir = (float) (salarioBruto * 0.05);
		            }
		            else {
		                ir = (float) (salarioBruto * 0.01);
		            }
		            JOptionPane.showMessageDialog(null,"Desconto IR: " + ir);
		            //System.out.println("Desconto IR: " + ir);
		        }

		        salarioLiquido = salarioBruto - inss - ir;
		        JOptionPane.showMessageDialog(null,"Salario Liquido: " + salarioLiquido);
		        //System.out.println("Salario Liquido: " + salarioLiquido);
			}
				//captura erros
				catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null,"Erro na conversão. Digite números", "Saida de dados", JOptionPane.PLAIN_MESSAGE);	
				}	
			}
		}
