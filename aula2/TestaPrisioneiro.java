
public class TestaPrisioneiro {

	public static void main(String[] args) {
		
		Prisioneiro bubba = new Prisioneiro();
		bubba.nome = "Bubba";
		bubba.altura = 2.08;
		bubba.sentenca = 4;
		System.out.println(bubba);
		
		Prisioneiro twitch = new Prisioneiro();
		twitch.nome = "Twitch";
		twitch.altura = 1.73;
		twitch.sentenca = 3;
		System.out.println(twitch);
		
		System.out.println(bubba == twitch);
		
		//twitch.nome = "Bubba";
		//twitch.altura = 2.08;
		//twitch.sentenca = 4;
		bubba = twitch;
		
		System.out.println(bubba == twitch);
	}

}
