package ss2013.aufgabe03;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class JungleWalk implements Iterable<JunglePair> {
	// attributes + weitere bei Bedarf
	private String girls[];
	private String boys[];
	
	
	
	
	
	// constructor
	public JungleWalk(String[] thegirls, String[] theboys) {
		// Lsg Konstruktor
		
		
		
		
	}

	// inherited methods
	@Override
	public Iterator<JunglePair> iterator() {
		return new Iterator<JunglePair>() {
			// freakish inner class stuff happening here
			// inner attributes
			
			
			
			
			@Override
			public boolean hasNext() {
				// Lsg has Next
				
				
				
				
			}

			@Override
			public JunglePair next() {
				if(	// Lsg next
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
				} else {
					throw new NoSuchElementException("No more Pairs to generate");
				}
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				// nicht benötigt (nur für eclipse)
			}
		}; // inner bullshit end
	}
	
// für ausgabe
	public static void main(String[] args) {
		System.out.printf("Pairs4Walks:\n");
		String[] thegirls = new String[] {"Amber", "Betty", "Cindy", "Diana" };
		String[] theboys = new String[] {"Kodo", "Luke", "Mike" };
		for (JunglePair p: new JungleWalk(thegirls, theboys)) {
			System.out.println(p);
		}
	}

}