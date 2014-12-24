
public class KassenzItem implements Comparable<KassenzItem> {

	private int anzahl;
	private double preis;
	public String name;
	
	KassenzItem(String n, double p, int a){
		anzahl = a;
		preis = p;
		name = n;
	}
	
	public int getAnzahl(){
		return anzahl;
	}
	
	public double getPreis(){
		return preis;
	}
	
	public int compareTo(KassenzItem k){
		return anzahl - k.anzahl;
	}
	
	public String toString(){
		return "" + name + "\t\t" + getPreis() + "\t\t"  + getAnzahl() + "\t"  + getPreis()*getAnzahl();
	}
}
