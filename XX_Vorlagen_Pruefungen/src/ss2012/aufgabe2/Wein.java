package ss2012.aufgabe2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Wein implements Comparable<Wein> {
	private String name;
	private double preis;
	
	public Wein(String name, double preis){
		this.name = name;
		this.preis = preis;
	}
	
	
	// Lösung gehört hier her
	
	
	


	// nur zum ausführen
	public static void main(String[] args) {
		List<Wein> wl = new LinkedList<Wein>();
		
		wl.add(new Wein("Vino de Durchschnitt", 9.99));
		wl.add(new Wein("Premiumwein", 19.99));
		wl.add(new Wein("Fusel", 1.99));
		wl.add(new Wein("anderer Fusel", 1.99));
		
		Collections.sort(wl);
		
		for (Wein w : wl) {
			System.out.printf("%s: %.02f€\n", w.name, w.preis);
		}
		
	}
}
