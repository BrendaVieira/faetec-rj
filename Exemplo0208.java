import javax.swing.*;

public class Exemplo0208 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		int x = 0;

		try{
			
			
			s = JOptionPane.showInputDialog(null,"Digite um número", "entrada de dados", JOptionPane.QUESTION_MESSAGE);
			x = Integer.parseInt(s);
			switch(x){
			case 0:
			     
			     JOptionPane.showMessageDialog(null,"zero", "saida de dados", JOptionPane.PLAIN_MESSAGE);
			     break;
			case 1:
			     
			     JOptionPane.showMessageDialog(null,"um", "saida de dados", JOptionPane.PLAIN_MESSAGE);
			     break;
		    case 2:    
			     
			     JOptionPane.showMessageDialog(null,"dois", "saida de dados", JOptionPane.PLAIN_MESSAGE);
			     break;
		    case 3:   
			     
			     JOptionPane.showMessageDialog(null,"três", "saida de dados", JOptionPane.PLAIN_MESSAGE);
			     break;
		    case 4:    
			     
			     JOptionPane.showMessageDialog(null,"quatro", "saida de dados", JOptionPane.PLAIN_MESSAGE);
			     break;
		    case 5:    
			     
			     JOptionPane.showMessageDialog(null,"cinco", "saida de dados", JOptionPane.PLAIN_MESSAGE);
			     break;
		    case 6:    
		         
		         JOptionPane.showMessageDialog(null,"seis", "saida de dados", JOptionPane.PLAIN_MESSAGE);
		        break;
		    case 7:   
		        
		        JOptionPane.showMessageDialog(null,"sete", "saida de dados", JOptionPane.PLAIN_MESSAGE);
		        break;
		    case 8:    
		        
		        JOptionPane.showMessageDialog(null,"oito", "saida de dados", JOptionPane.PLAIN_MESSAGE);
		        break;
		    case 9:   
		        
		        JOptionPane.showMessageDialog(null,"nove", "saida de dados", JOptionPane.PLAIN_MESSAGE);
		        break;
		    default: 
		    	JOptionPane.showMessageDialog(null,"número desconhecido.", "saida de dados", JOptionPane.PLAIN_MESSAGE);
		        break;
		       
			
	
		}  
		    
		} catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null,"erro de conversão.digite um numero inteiro.", "saida de dados", JOptionPane.PLAIN_MESSAGE);		
		}
	}
	
}
