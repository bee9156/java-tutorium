package ws2011.aufgabe2;

public class Kandidat implements Comparable<Kandidat> {
	private String name;
	private int WertungA, WertungB, WertungC;

	public Kandidat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setWertungen(int WertungA, int WertungB, int WertungC) {
		// Implementierung setWertungen
	}
	
	public int compareTo(Kandidat k){
		// Implementierung compareTo
	}

	public double berechneGesamtwertung() {
		int[] tmp = new int[] { WertungA, WertungB, WertungC };
		// Implementierung
		
		
		
		
	}
	
	
	// getter nur für Umsetzung main notwendig, nicht zu bearbeiten
	public int getWertungA(){
		return WertungA;
	}
	public int getWertungB(){
		return WertungB;
	}
	public int getWertungC(){
		return WertungB;
	}
}
