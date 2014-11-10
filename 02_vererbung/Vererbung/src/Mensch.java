
public class Mensch {
	public String name;
	public double hoehe;
	public double gewicht;
	private boolean dummy;
	protected boolean d2;
	int t;
	
	
	// Konstruktoren
	Mensch(){
		name = "";
		hoehe = 0;
		gewicht = 0;
		dummy = false;
		d2 = true;
		t = 0;
	}
	Mensch(String name, double gewicht, boolean d){
		this();
		this.name = name;
		this.gewicht = gewicht;
		dummy = d;
	}
}
