package Aufgabe3;

public class Meat extends Food {

	public Meat (String n, int g) {
		super(n, g);
	}
	
	@Override
	public int berechneBrennwert() {
		return this.getName().length()*this.getGewicht();
	}

}
