package ss2011.aufgabe01c;

public class Rechteck implements Comparable<Rechteck> {
	private int laenge, breite;

	public Rechteck(int laenge, int breite) {
		this.laenge = laenge;
		this.breite = breite;
	}

	public int flaeche() {
		return laenge * breite;
	}

	public int umfang() {
		return 2 * (laenge + breite);
	}

	public String toString() {
		return "F: " + flaeche() + ", U: " + umfang();
	}
	
	// Implementierung Comparable:
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// Implementierung der main

	}

}
