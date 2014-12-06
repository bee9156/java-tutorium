package Aufgabe3;

public class Dessert extends Food {
	
	public Dessert (String n) {
		super(n, 200);
	}

	@Override
	public int berechneBrennwert() {
		int result = this.getGewicht();
		
		if (this.getName().contains("apfel") || this.getName().contains("frucht")){
			result *= 2;
		}
		
		return result;
	}

}
