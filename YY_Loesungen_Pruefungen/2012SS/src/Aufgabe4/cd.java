package Aufgabe4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class cd {

	static void printMap(Map<String, Integer> m){
		Set<String> set = m.keySet();
		
		for (String s : set){
			System.out.printf("%s ==> %d\n", s, m.get(s));
		}
	}
	
	static void printNotenliste(Map<String, Integer> notenliste){
		int[] ns = {0,0,0,0,0};
		
		for (String s : notenliste.keySet()){
			ns[notenliste.get(s) -1]++;
		}
		
		for (int i = 0; i < 5; i++){
			System.out.printf("%d:   %d\n", i+1, ns[i]);
		}
	}
	
	public static void main(String[] args) {
		HashMap<String, Integer> nl = new HashMap<String, Integer>();

		nl.put("Hugo", 2);
		nl.put("Egon", 5);
		nl.put("Eva", 1);
		nl.put("Hans", 1);
		nl.put("Kurt", 3);
		nl.put("Anna", 1);
		
		printMap(nl);
		
		printNotenliste(nl);
	}

}
