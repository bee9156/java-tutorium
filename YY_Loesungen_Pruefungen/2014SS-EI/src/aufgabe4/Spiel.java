package aufgabe4;

public class Spiel {
	public final String mannschaftA, mannschaftB;
	public final int toreA, toreB;
	
	Spiel (String a, String b, int t1, int t2){
		mannschaftA = a;
		mannschaftB = b;
		toreA = t1;
		toreB = t2;
	}
	
	public int getPunkte(String team) throws NoSuchTeamException{
		// Überprüfung ob team vorhanden
		if (!mannschaftA.equals(team) && !mannschaftB.equals(team)) throw new NoSuchTeamException("Team nicht vorhanden!");
		
		// tordiff berechnen
		int diff = toreA - toreB;
		
		// überprüfen welches team angefragt wurde
		if (team.equals(mannschaftB)){
			// es wurde anderes team gesucht
			diff *= -1;
		}
		
		
		if (diff > 0){
			// team hat gewonnen
			return 3;
		} else if(diff == 0){
			// unentschieden
			return 1;
		} else {
			// verloren
			return 0;
		}
	}
}
