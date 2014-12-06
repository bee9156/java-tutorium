package Aufgabe3;

public class AuftragsPosition {
	@SuppressWarnings("unused")
	private int nummer;
	private ProduktTyp typ;
	private int anzahl;
	
	public AuftragsPosition(int nummer, ProduktTyp typ, int anzahl) {
		this.nummer = nummer;
		this.typ = typ;
		this.anzahl = anzahl;
	}
	
	public ProduktTyp getTyp() {return typ; }
	public int getAnzahl() {return anzahl; }
}
