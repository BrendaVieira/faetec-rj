package media;

public class Conta {
   int numero;
   String cliente;
   double saldo;


	public static void main(String[] args) {
		// TODO Auto-generated method stu
        Conta conta = new Conta();
        conta.numero = 999;
        conta.cliente = "Jose";
        conta.saldo = 1000;

       System.out.println(conta.numero);
       System.out.println(conta.cliente);
       System.out.println(conta.saldo);
    }
}
