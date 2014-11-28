package ws2011.aufgabe3;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AuftragsListe {

	private List<AuftragsPosition> aliste = new LinkedList<AuftragsPosition>();
	
	public static void main(String[] args) {
		AuftragsListe al = new AuftragsListe();

		al.add(new AuftragsPosition(3456, ProduktTyp.BOELLER, 10));
		al.add(new AuftragsPosition(3457, ProduktTyp.KERZE, 5));
		al.add(new AuftragsPosition(3458, ProduktTyp.RAKETE, 4));
		al.add(new AuftragsPosition(3459, ProduktTyp.BOELLER, 5));
		al.add(new AuftragsPosition(3460, ProduktTyp.KERZE, 3));
		al.add(new AuftragsPosition(3461, ProduktTyp.RAKETE, 8));
		
		Map<ProduktTyp, List<AuftragsPosition>> auftragsMap = al.gruppiereAuftraege();
		
		for (ProduktTyp typ : auftragsMap.keySet()){
			System.out.printf("%3d Stueck vom Typ %s\n", AuftragsListe.berechneStueckzahl(auftragsMap.get(typ)), typ);
		}
	}
	
	
	public void add(AuftragsPosition apos) {
		// Implementierung
	}
	
	public static int berechneStueckzahl(List<AuftragsPosition> al) {
		// Implementierung
	}
	
	public Map<ProduktTyp, List<AuftragsPosition>> gruppiereAuftraege() { Map<ProduktTyp, List<AuftragsPosition>> map =
		new TreeMap<ProduktTyp, List<AuftragsPosition>>();
		
		// Implementierung
	
		// Ende Implementierung
		return map;
	}

}
