package aufgabe3;

import java.util.List;
import java.util.NavigableSet;
import java.util.TreeMap;

public class ReportGenerator {
	
	static void printReport(Reportable r){
		// header
		System.out.println(r.getHeader());
		
		// legende
		for (String s: r.getLegend()){
			System.out.print(String.format("%s\t", s));
		}
		
		System.out.print("\n");
		
		// inhalte
		for (String s: r.getLines().keySet()){
			System.out.print(String.format("%s\t", s));
			
			for (Integer i: r.getLines().get(s)){
				System.out.print(String.format("%d\t", i));
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		Statistics roboStat = new Statistics("Zahl der Industrieroboter in Tausend", new String[] {"Land", "2010", "2011", "2012"});
		roboStat.addLine("Japan", new int[] {308, 307, 311});
		roboStat.addLine("USA", new int[] {180, 193, 207});
		roboStat.addLine("D", new int[] {148, 157, 162});
		printReport(roboStat);
	}

}
