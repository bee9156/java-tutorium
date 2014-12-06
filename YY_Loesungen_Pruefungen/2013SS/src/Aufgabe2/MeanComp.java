package Aufgabe2;

import java.util.Comparator;

public class MeanComp implements Comparator<Messreihe> {

	@Override
	public int compare(Messreihe o1, Messreihe o2) {
		return Double.compare(o1.mittelwert(), o2.mittelwert()) *-1;
	}
}
