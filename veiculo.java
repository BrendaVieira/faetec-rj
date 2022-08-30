package aulaJava;

public class veiculo {
	
	String nome;
	float velocidade;
	
	public void acelera(){
		velocidade++;
		System.out.println(velocidade);
	}
	public void freia(){
		if(velocidade>0){
			velocidade--;
		}
		System.out.println(velocidade);
	}
}
public class tveiculo {

	public static void main(String[] args) {
		
		veiculo v1= new veiculo();
		v1. nome = "fiat"
		v1.velocidade = 0.0f;
		v1.acelera();
		v1.acelera();
		v1.freia();
		v1.freia();
		v1.freia();
	}
	}
