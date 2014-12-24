
public class app {

	public static void main(String[] args) {
		KassenZettel k = new KassenZettel(69);
		
		k.addItem(new KassenzItem("Wurst", 1.95, 5));
		k.addItem(new KassenzItem("Käse", 2.97, 2));
		k.addItem(new KassenzItem("Brot", 0.99, 8));
		k.addItem(new KassenzItem("Wasser", 0.49, 6));
		
		k.print();
	}

}
