package Aufgabe2;

import java.util.Comparator;

public class WertungsComparator implements Comparator<Kandidat> {

	@Override
	public int compare(Kandidat k1, Kandidat k2) {
		if (k1.berechneGesamtwertung() - k2.berechneGesamtwertung() != 0) {
			return Double.compare(k1.berechneGesamtwertung(), k2.berechneGesamtwertung()) * -1;
		} else {
			return k1.getName().compareTo(k2.getName());
		}
	}
}
