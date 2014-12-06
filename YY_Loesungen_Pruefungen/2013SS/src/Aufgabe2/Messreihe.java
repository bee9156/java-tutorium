package Aufgabe2;

public class Messreihe implements Comparable<Messreihe> {
	// attributes
	public String city;
	public double[] temps;
	
	// constuctor
	public Messreihe(String s, double[] t) {
		city = s;
		temps = t;
	}
	
	// custom methods
	public double mittelwert() {
		double mw = 0.0;
		for (int i = 0; i < temps.length; i++) {
			mw += temps[i];
		}
		
		mw /= temps.length;
		
		return mw;
	}
	
	public String toString() {
		return java.lang.String.format("%s:%.02f", city, this.mittelwert());
	}
	
	// inherited methods
	@Override
	public int compareTo(Messreihe other) {
		return this.city.compareTo(other.city);
	}
}
