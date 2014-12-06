package Aufgabe3;

public abstract class Food {
	private String name;
	private int gewicht;
	
	public Food (String n, int g) {
		name = n;
		gewicht = g;
	}
	
	public abstract int berechneBrennwert();
	
	public String getName() {
		return name;
	}
	
	public int getGewicht() {
		return gewicht;
	}
}
