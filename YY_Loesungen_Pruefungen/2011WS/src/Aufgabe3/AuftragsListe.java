package Aufgabe3;

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

		Map<ProduktTyp, List<AuftragsPosition>> auftragsMap = al
				.gruppiereAuftraege();

		for (ProduktTyp typ : auftragsMap.keySet()) {
			System.out
					.printf("%3d Stueck vom Typ %s\n", AuftragsListe
							.berechneStueckzahl(auftragsMap.get(typ)), typ);
		}
	}

	public static int berechneStueckzahl2(List<AuftragsPosition> al) {
		int result = 0;

		for (AuftragsPosition l : al) {
			result = l.getAnzahl() + result;
		}

		return result;
	}

	public Map<ProduktTyp, List<AuftragsPosition>> gruppiereAuftraege2() {
		Map<ProduktTyp, List<AuftragsPosition>> map = new TreeMap<ProduktTyp, List<AuftragsPosition>>();

		for (AuftragsPosition a: aliste){
			// entweder anlegen oder nicht
			if (!map.containsKey(a.getTyp())) {
				// lege liste an
				map.put(a.getTyp(), new LinkedList<AuftragsPosition>());
			}
			
			
			// pauschal hinzufügen
			map.get(a.getTyp()).add(a);
		}
		
		
		return map;
	}

	public void add(AuftragsPosition apos) {
		if (apos == null)
			return;

		// ab hier ist apos def. nicht == null
		aliste.add(apos);
	}

	public static int berechneStueckzahl(List<AuftragsPosition> al) {
		int sum = 0;

		for (AuftragsPosition ap : al) {
			sum += ap.getAnzahl();
		}

		return sum;
	}

	public Map<ProduktTyp, List<AuftragsPosition>> gruppiereAuftraege() {
		Map<ProduktTyp, List<AuftragsPosition>> map = new TreeMap<ProduktTyp, List<AuftragsPosition>>();

		for (AuftragsPosition ap : this.aliste) {
			if (!map.containsKey(ap.getTyp())) {
				// ProduktTyp nicht vorhanden, liste anlegen
				map.put(ap.getTyp(), new LinkedList<AuftragsPosition>());
			}

			// ab hier ist sichergestellt das die benötigte Liste vorhanden ist
			// pauschal die aktuelle Auftragsposition hinzufügen

			map.get(ap.getTyp()).add(ap);
		}

		return map;
	}

}
