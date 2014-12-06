package aufgabe03;
import java.util.LinkedList;
import java.util.List;


public class Video {
	private List<String>
		szenen = new LinkedList<String>(),
		werbefrei = new LinkedList<String>(),
		werbung = new LinkedList<String>();
	
	public static void main(String[] args){
		Video video = new Video();
		video.add("Bier");
		video.add("Szene A");
		video.add("Kaffee");
		video.add("Zahnpasta");
		video.add("Szene B");
		video.add("Szene C");
		video.add("Waschmittel");
		video.schneiden();
		System.out.println("Szenen		: " + video.szenen);
		System.out.println("Werbefrei	: " + video.werbefrei);
		System.out.println("Werbung		: " + video.werbung);
		System.out.println("Werbeeinnahmen		: " + video.werbeeinnahmen() + " €");

	}
	
	public void add(String s){
		szenen.add(s);
	}
	
	public void schneiden(){
		for(String s: szenen){
			if (s.contains("Szene")){
				werbefrei.add(s);
			} else {
				werbung.add(s);
			}
		}
	}
	
	public int werbeeinnahmen(){
		int result = 0;
		
		for(String s: werbung){
			
			result += s.length()/4;
			
			if (s.length()%4 != 0){
				result++;
			}
		}
		
		result *= 10;
		
		return result;
	}
	
	
}
