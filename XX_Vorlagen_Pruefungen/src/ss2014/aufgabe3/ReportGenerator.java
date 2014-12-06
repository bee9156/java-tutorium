package ss2014.aufgabe3;

public class ReportGenerator {
	static void printReport(Reportable r){
		/* ... */
	}

	public static void main(String[] args) {
		Statistics roboStat = new Statistics("Zahl der Industrieroboter in Tausend", new String[] {"Land", "2010", "2011", "2012"});
		roboStat.addLine("Japan", new int[] {308, 307, 311});
		roboStat.addLine("USA", new int[] {180, 193, 207});
		roboStat.addLine("D", new int[] {148, 157, 162});
		printReport(roboStat);
	}

}
