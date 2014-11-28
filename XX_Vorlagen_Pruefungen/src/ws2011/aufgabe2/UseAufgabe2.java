package ws2011.aufgabe2;

public class UseAufgabe2 {

	public static void main(String[] args) {
		Kandidat[] kandidaten = new Kandidat[] { new Kandidat("FlashMaster R"),
				new Kandidat("Zap Doodle"), new Kandidat("Zoe Maja"),
				new Kandidat("Il Bello") };

		kandidaten[0].setWertungen(9, 8, 9);
		kandidaten[1].setWertungen(6, 6, 7);
		kandidaten[2].setWertungen(6, 7, 6);
		kandidaten[3].setWertungen(4, 6, 6);

		System.out.println("Rangliste der Kandidaten:");
		System.out.println("Name			A B C 	Gesamt");
		for (Kandidat k : kandidaten) {
			System.out.println(String.format("%s		%d %d %d	%.01f", k.getName(), k.getWertungA(), k.getWertungB(), k.getWertungC(), k.berechneGesamtwertung()));
		}

	}

}
