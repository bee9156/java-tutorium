package aufgabe4;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TabellenApp {

	public static void main(String[] args) {
		List<Spiel> spiele = new LinkedList<Spiel>();
		spiele.add(new Spiel("Deutschland", "Portugal", 4, 0));
		spiele.add(new Spiel("Ghana", "USA", 1, 2));
		spiele.add(new Spiel("Deutschland", "Ghana", 2, 2));
		spiele.add(new Spiel("USA", "Portugal", 2, 2));
		spiele.add(new Spiel("USA", "Deutschland", 0, 1));
		spiele.add(new Spiel("Portugal", "Ghana", 2, 1));
		
		Map<String, Integer> punkte = new HashMap<>();
		Map<String, Integer> tordiff = new HashMap<>();
		
		for (Spiel sp: spiele){
			int pA = 0, pB, tdiff = sp.toreA - sp.toreB;
			int td_tmp = tdiff;
			
			if (punkte.containsKey(sp.mannschaftA)){
				pA += punkte.get(sp.mannschaftA);
			}
			
			try {
				pA += sp.getPunkte(sp.mannschaftA);
			} catch (NoSuchTeamException e){
				e.printStackTrace();
			}
			
			punkte.put(sp.mannschaftA, pA);

			if (punkte.containsKey(sp.mannschaftB)){
				pB = punkte.get(sp.mannschaftB);
			} else {
				pB = 0;
			}
			
			try {
				punkte.put(sp.mannschaftB, sp.getPunkte(sp.mannschaftB) + pB);
			} catch (NoSuchTeamException e){
				e.printStackTrace();
			}
			
			if (tordiff.containsKey(sp.mannschaftA)){
				td_tmp += tordiff.get(sp.mannschaftA);
			}
			
			tordiff.put(sp.mannschaftA, td_tmp);
			
			if (tordiff.containsKey(sp.mannschaftB)){
				tordiff.put(sp.mannschaftB, (tordiff.get(sp.mannschaftB) - tdiff));
			} else {
				tordiff.put(sp.mannschaftB, tdiff * -1);
			}
		}

		// ausgabe - aber nicht verlangt
		for (String s: punkte.keySet()){
			System.out.println("" + s + ": " + punkte.get(s) + " Punkte");
		}
		
		for (String s: tordiff.keySet()){
			System.out.println("" + s + " - Diff: " + tordiff.get(s));
		}
	}

}
