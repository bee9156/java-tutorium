package ss2014_WI.aufgabe04;

public class Umdreher extends Thread {

	private MemoryFeld f1, f2;

	Umdreher(MemoryFeld f1, MemoryFeld f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) { /* ignore */
		}

		f1.setText("M");
		f2.setText("M");
	}
}