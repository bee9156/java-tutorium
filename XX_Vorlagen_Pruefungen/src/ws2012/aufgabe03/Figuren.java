package ws2012.aufgabe03;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Figuren {
	public static void main(String[] args) {
		
		List<Figur> figuren = new LinkedList<Figur>();
		
		figuren.add(new Viereck(2,2,10,4,9,8,4,9));
		figuren.add(new Dreieck(1,2,4,1,3,5));
		
		Collections.sort(figuren);
		
		for (Figur f : figuren) System.out.println(f.toString());
	}
}
