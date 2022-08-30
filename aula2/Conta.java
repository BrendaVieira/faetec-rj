public class Conta {
	String nome;
	double saldo;
	
	public void deposito(double valor) {
		if (valor< 0.0) {
			System.out.println("O valor do depósito não pode ser negativo.");
		} else {
			saldo += valor;
		}
	}
	
	public void saque(double valor) {
		if (valor > saldo) {
			System.out.println("O saldo é insuficiente.");
		} else if (valor < 0.0) {
			System.out.println("O valor do saque não pode ser negativo.");
		} else {
			saldo -= valor;
		}
		System.out.println("O valor atual é " + saldo);
	}
}
