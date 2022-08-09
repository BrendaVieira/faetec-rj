package aulanoite;

public class Parsing01 {

	public static void main(String[] args) {
		String shirtPrince = "15";
		String taxRate = "0.05";
		String gibberish = "887ds7nds87dsfs";
		System.out.println((double)Integer.parseInt(shirtPrince)*Double.parseDouble(taxRate));
		System.out.println(Double.parseDouble(taxRate));
		System.out.println(gibberish);
	}

}
