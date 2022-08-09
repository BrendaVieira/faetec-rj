package aulanoite;

public class Casting02 {

	public static void main(String[] args) {
		long currentWorldPop = 7000000000l; // numero longo colocar o L
		System.out.println("Current World Population: " + currentWorldPop);

		int africaPop = 221_000_000;
		int asiaPop = 1_402_000_000;
		int europePop = 547_000_000;
		int americaPop = 339_000_000;
		int oceaniaPop = 13_000_000;
		
		System.out.println("World Population in 1950: " +(int)(+africaPop +asiaPop +europePop +americaPop +oceaniaPop));
		
		double percentAsia = 0.6;
		double currentAsiaPop = currentWorldPop*percentAsia;
		System.out.println("Current Asia Population: " + currentAsiaPop);
	}

}
