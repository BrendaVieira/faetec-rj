
public class Tesouro {
   String nome;
   double saldo, juros;
   int prazo, mesrest;

   public void calculaTaxa(int p) {
	   double taxa = 0;
	   
	   if (p >= 0 && p <= 11) {
		   taxa = 0.5;
	   } else if (p >= 12 && p <= 23) {
		   taxa = 1.0;
	   } else if (p >= 24 && p <= 35) {
		   taxa = 1.5;
	   } else if (p >= 36 && p <= 47) {
		   taxa = 2.0;
	   } else if (p >= 48 && p <= 60) {
		   taxa = 2.5;
	   } else {
		   System.out.println("Prazo Inválido!");
		   p = 0;
	   }
	   taxa = taxa/100;
	   prazo = p;
	   mesrest = p;
   }
   
   public void receberJuros() {
	   if (mesrest > 0) {
		   saldo += saldo * juros / 12;
		   mesrest--;
		   System.out.println("Saldo" + saldo);
		   System.out.println("Taxa" + juros);
		   System.out.println("Meses restantes" + mesrest);
	   } else {
		   System.out.println("Título vencido!"); 
	   }
   }

}
