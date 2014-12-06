package tut_Basisklassen;

public class Student extends Mensch {
	// konstanten
	private final int MATRIKEL_DIGITS = 8;
	
	// Attribute
	private int matrikelnummer;
	
	// Konstruktoren
	Student (String vorname, String nachname, int alter, int m){
		super(vorname, nachname, alter);
		setMatrikelNR(m);
	}
	
	// setter
	public void setMatrikelNR(int m){
		if (m > 0 && m < Math.pow(10, MATRIKEL_DIGITS +1) -1){
			matrikelnummer = m;
		}
	}
	
	// getter
	public String getMatrikelNR() {
		String result = "";
		for ( int i = 0, d = (int) Math.pow(10, MATRIKEL_DIGITS-1); (matrikelnummer % d == matrikelnummer) && i < MATRIKEL_DIGITS; i++, d /= 10){
			result += "0";
		}
		
		result += matrikelnummer;
		
		return result;
	}
}
