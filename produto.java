package aulaJava;

public class produto {
	
	int codigo, quantidade;
	String nome;
	double preco;
	
	public void mostraPreco{
		System.out.println("O preco do produto e " + preco);
	}
	public double atualizaPreco(int read){
		double novoPreco;
		novoPreco=preco*(1+read/100);
		return novoPreco;
	}
}
public class telaProduto{
	public class static void main(String Args[]){}
	produto p1=new produto();
	p1.codigo=1;
	p1.nome="bola";
	p1.quantidade=10;
	p1.preco=50.00;
	
	p1.mostraPreco();
	System.out.println("O novo preco e " + p1.atualizaPreco(1s));
}
}