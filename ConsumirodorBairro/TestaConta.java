
public class TestaConta {

	public static void main(String[] args) {
	ContaCorrente cc = new ContaCorrente();
	System.out.println(cc);
	
	cc.deposita(-100);
	try {
		cc.saca(100);	
	}catch (SaldoInsuficienteException e){
		System.out.println(e.getMessage());
		
	}
	}

}
