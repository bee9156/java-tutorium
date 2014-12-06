package Aufgabe2;

public class Kandidat implements Comparable<Kandidat> {

	// attribs
	private String name;
	private int WertungA, WertungB, WertungC;

	public Kandidat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setWertungen(int WertungA, int WertungB, int WertungC) {
		this.WertungA = WertungA;
		this.WertungB = WertungB;
		this.WertungC = WertungC;
	}

	@Override
	public int compareTo(Kandidat k) {
		return this.getName().compareTo(k.getName());
	}

	public double berechneGesamtwertung() {
		int[] tmp = new int[] { WertungA, WertungB, WertungC };
		
		int sum = 0;
		int smallest = 99;
		
		for (Integer i : tmp){
			sum += i;
			if (i < smallest){
				smallest = i;
			}
		}
		
		sum -= smallest;
		
		double result = (double) sum/2;
		
		return result;
	}

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
			System.out.println(String.format("%s		%d %d %d	%.01f", k.name, k.WertungA, k.WertungB, k.WertungC, k.berechneGesamtwertung()));
		}

	}

}
