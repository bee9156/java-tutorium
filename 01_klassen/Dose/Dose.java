
public class Dose {
	// Attribute
	private int hoehe;
	private int radius;
	private String inhalt;
	private double vol;

	// Konstruktoren
	protected Dose(){
		// Hier stellen wir sicher das alle Werte definiert sind
		radius = 0;
		hoehe = 0;
		inhalt = "";
		vol = 0.0;
	}
	
	Dose(int r, int hoehe){
		this();		// Aufruf des eigenen Konstruktors ohne Parameter - Standardwertvergabe
		radius = r;
		this.hoehe = hoehe;
		
		calcVol();
	}
	
	public Dose(String s){
		this();
		setInhalt(s);
	}
	
	Dose(int r, int h, String i){
		this(r, h);
		setInhalt(i);
	}
	
	
	// Getter /  Setter
	public int getHoehe(){
		return hoehe;
	}
	
	public int getRadius(){
		return radius;
	}
	
	public String getInhalt() {
		return inhalt;
	}
	
	public void setHoehe(int hoehe){
		this.hoehe = hoehe;
	}
	
	public void setRadius(int r){
		radius = r;
	}
	
	public void setInhalt(String i){
		inhalt = i;
	}
	

	// allgemeine Methoden
	public void trinke(double schluckgroesse){
		if (schluckgroesse < vol && schluckgroesse >= 0) {
			// trinke
		} else {
			// geht nicht
		}
		
		if (vol - schluckgroesse > 0 && schluckgroesse > 0){
			// trinke
		}
	}
	
	public double leere(){
		double tmp = vol;
		
		vol = 0; // jetzt ist die dose leer
		
		return tmp;
	}
	
	public double pruefeRestinhalt(){
		return vol;
	}
	
	// Hilfsmethoden
	
	private void calcVol(){
		vol = Math.PI * radius * radius * hoehe;
	}
}
