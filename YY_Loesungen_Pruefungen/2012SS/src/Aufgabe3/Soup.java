package Aufgabe3;

public class Soup extends Food {

	public Soup() {
		super("Soup", 100);
	}
	@Override
	public int berechneBrennwert() {
		return 50;
	}

}
