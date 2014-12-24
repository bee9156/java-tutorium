import java.util.LinkedList;
import java.util.List;


public class KassenZettel {
	private int id;
	private List<KassenzItem> list;
	
	KassenZettel(int id){
		this.id = id;
		list = new LinkedList<KassenzItem>();
	}
	
	public void addItem(KassenzItem k){
		list.add(k);
	}
	
	public void print(){
		double result = 0;
		
		System.out.printf("Einkauf ID: %d\n", id);
		System.out.printf("---------------------------------------------------------\n");
		System.out.println("Artikelname\tEinzelpreis\tAnzahl\tGesamtpreis");
		
		for(KassenzItem k: list){
			result = result + k.getAnzahl()* k.getPreis();
			System.out.println(k);
		}
		

		System.out.printf("---------------------------------------------------------\n");
		System.out.printf("Einkaufssumme:\t\t\t\t%.2f\n", result);
	}
	
	/*
	 * Artikelname		Einzelpreis	Anzahl Gesamtpreis
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
