package ss2014_WI.aufgabe04;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class MemoryFeld extends JButton {

	private int wert;

	MemoryFeld(int wert) {
		setText("M");
		this.wert = wert;
	}

	int getWert() {
		return wert;
	}
}