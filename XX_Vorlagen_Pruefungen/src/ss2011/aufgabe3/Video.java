package ss2011.aufgabe3;

import java.util.LinkedList;
import java.util.List;

public class Video {

	private List<String>
		szenen		= new LinkedList<String>(),
		werbefrei 	= new LinkedList<String>(),
		werbung		= new LinkedList<String>();
	
	// Implementierung add
	
	
	
	
	
	// Implementierung schneiden
	
	
	
	
	
	// implementierung werbeeinnahmen
	
	
	
	public static void main(String[] args) {
		Video video = new Video();
		video.add("Bier");		video.add("Szene A");
		video.add("Kaffee");	video.add("Zahnpasta");
		video.add("Szene B");	video.add("Szene B");
		video.add("Waschmittel");
		video.schneiden();
		System.out.println("Szenen	 : " + video.szenen);
		System.out.println("Werbefrei: " + video.werbefrei);
		System.out.println("Werbug	 : " + video.werbung);
		System.out.println("Werbeeinnahmen: " + video.werbeeinnahmen() + " €");
		
	}

}
