
public class Pixel {
	// Attribute
	private double px;
	private double py;
	private int farbe;
	
	
	// Konstruktoren
	public Pixel(){
		setX(0);
		setY(0);
		setFarbe(0);
	}
	
	public Pixel(double x, double y, int f){
		setX(x);
		setY(y);
		setFarbe(f);
	}
	
	// getter
	/*
	 * Getter dienen nur dem Auslesen der eigenen Attribute
	 * 
	 * Sollen die Attribute ausgelesen werden, so muss der Aufruf so erfolgen:
	 * 
	 * o.getX();
	 * 
	 * Wobei o für das gewünschte Objekt anzupassen ist (für das eigene Objekt: this, 
	 * für ein anderes: other, bzw. dessen namen)
	 * 
	 * Hinweis: es werden nie Parameter übergeben
	 * 
	 * Schreibweise:
	 * public <Rückgabedatentyp (siehe Attribut)> get<Attributname>()
	 */
	public double getX(){
		return px;
	}
	
	public double getY(){
		return py;
	}
	
	public int getFarbe(){
		return farbe;
	}
	
	// setter
	/*
	 * Setter dienen dem beschreiben der Attribute.
	 * 
	 * Sollen die attribute eines Objektes beschrieben werden, so muss der Aufruf so erfolgen:
	 * 
	 * o.setX(x);
	 * 
	 * Wobei o für das entsprechende Objekt steht (siehe oben) und x = Variablenname, welcher geschrieben werden soll
	 * 
	 * Hinweis: es werden Daten zurückgegeben:	Rückgabedatentyp void (void = nichts)
	 * 
	 * Schreibweise:
	 * public void set<Attributname>(<Attributdytentyp> Variablenname(lokal, abgekürzt))
	 * 
	 */
	public void setX(double x){
		px = x;
	}
	
	public void setY(double y){
		py = y;
	}
	
	public void setFarbe(int f){
		farbe = f;
	}
	
	public void set(double x, double y, int f){
		setX(x);
		setY(y);
		setFarbe(f);
	}
	
	public void set(Pixel other){
		setX(other.getX());
		setY(other.getY());
		setFarbe(other.getFarbe());
	}
	
	// methoden
	public void mirrorX(){
		setX(getX() * -1);
		// alternativ:
		// px *= -1;
	}
	
	public void mirrorY(){
		setY(getY() * -1);
		// alternativ:
		// py *= -1;
	}
}
