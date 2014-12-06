package Aufgabe2;

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

	@Override
	public int compareTo(Wein w) {
		if (this.preis - w.preis != 0) {
			return Double.compare(this.preis, w.preis)*-1;
		} else {
			return w.name.compareTo(this.name);
		}
	}

	
	public static void main(String[] args) {
		List<Wein> wl = new LinkedList<Wein>();
		
		wl.add(new Wein("Vino de Durchschnitt", 9.99));
		wl.add(new Wein("Premiumwein", 19.99));
		wl.add(new Wein("Fusel", 1.99));
		wl.add(new Wein("anderer Fusel", 1.99));
		
		Collections.sort(wl);
		
		for (Wein w : wl) {
			System.out.println(String.format("%s: %.02f€", w.name, w.preis));
		}
		
	}

}
