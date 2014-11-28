package ss2013.aufgabe02;

import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("serial")
public class Wetterdaten extends ArrayList<Messreihe> {

	public static void main(String[] args) {
		Wetterdaten wd = new Wetterdaten();
		
		wd.add(new Messreihe("London", new double[] {21.2, 26.4, 29.8, 24.2}));
		wd.add(new Messreihe("Berlin", new double[] {24.0, 32.0, 36.0}));
		wd.add(new Messreihe("Paris", new double[] {24.1, 28.9}));
		wd.add(new Messreihe("Rom", new double[] {25.3, 30.4, 34.3, 33.8}));
		
		System.out.printf("Aufsteigend\nnach Namen\n");
		Collections.sort(wd);
		for (Messreihe mr : wd) {
			System.out.println(mr);
		}
		
		System.out.printf("\nAbsteigend\nnach Mittelwerten\n");
		Collections.sort(wd, new MeanComp());
		for (Messreihe mr : wd) {
			System.out.println(mr);
		}
	}
}