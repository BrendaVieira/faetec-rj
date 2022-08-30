package aulaJava;

public class cliente {
	
	int codigo;
	String nome, cidade;
	
	public void cliente(){
		cidade="indaiatuba";
	}
}
	public class tcliente{
	public static void main(String[] args) {
		cliente c1=new cliente();
		c1.nome="jose";
		c1.codigo=2;
	}
}
