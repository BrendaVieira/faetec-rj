import java.io.*;
public class Exemplo0207 {

	public static void main(String[] args) {
		
		String s = "";
		int x = 0;
		DataInputStream dado;
		try{
			System.out.println("Digite um número");
			dado = new DataInputStream(System.in);
			s = dado.readLine();
			x = Integer.parseInt(s);
			switch(x){
			case 0:
			     System.out.println("zero");
			     break;
			case 1:
			     System.out.println("um");
			     break;
		    case 2:    
			     System.out.println("dois");
			     break;
		    case 3:   
			     System.out.println("três");
			     break;
		    case 4:    
			     System.out.println("quatro");
			     break;
		    case 5:    
			     System.out.println("cinco");
			     break;
		    case 6:    
		         System.out.println("seis");
		        break;
		    case 7:   
		        System.out.println("sete");
		        break;
		    case 8:    
		        System.out.println("oito");
		        break;
		    case 9:   
		        System.out.println("nove");
		        break;
		    default: System.out.println("número desconhecido"); 
		        break;
		       
			}
	
		} catch(IOException e) {
		    System.out.println("erro de entrada de dados");
		} catch(NumberFormatException e){
		    System.out.println("erro de conversão.digite um número");			
			}
		}
	
		

	}


