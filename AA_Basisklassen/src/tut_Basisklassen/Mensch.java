package tut_Basisklassen;

public class Mensch {
	// Attribute
	private String vorname;
	private String nachname;
	private int alter;
	
	// Konstruktoren
	Mensch(){
		vorname = "";
		nachname = "";
		alter = 0;
	}
	
	Mensch(String v, String n){
		this();
		setVorname(v);
		setNachname(n);
	}
	
	Mensch(String v, String n, int a){
		this(v, n);
		setAlter(a);
	}
	
	
	// setter
	public void setVorname(String v){
		vorname = v;
	}
	
	public void setNachname(String n){
		nachname = n;
	}
	
	public void setAlter(int a){
		if (a > 0 && a < 150){
			alter = a;
		}
	}
	
	
	// getter
	public String getVorname(){
		return vorname;
	}
	
	public String getNachname() {
		return nachname;
	}
	
	public int getAlter() {
		return alter;
	}
}
