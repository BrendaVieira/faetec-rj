
public class ContaCorrente {
	double saldo;
	
	public void deposita (double valor) {
		if(valor<0) {
			throw new ValorInvalidoException(valor);
		}else{
			this.saldo+= valor;
		}
	}
	
	void saca(double valor) {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente," + "Tente um valor menor");
		}else{
			this.saldo-=valor;
		}
	}
		
		public String toString() {
			return "uma conta com valor:" + this.saldo;
		}
}
