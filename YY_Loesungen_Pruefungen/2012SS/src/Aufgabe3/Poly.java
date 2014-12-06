package Aufgabe3;

public class Poly {

	public static void main(String[] args) {
		Food[] menue = {
				new Soup(), new Meat("mausragout", 200),
				new Meat("kaenguruhschnitzel", 180),
				new Dessert("pudding"), new Dessert("waldfrucht") };
		
		int result = 0;
		
		for (Food f : menue) {
			result += f.berechneBrennwert();
		}
		
		System.out.println(result);
		

	}

}
