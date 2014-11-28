package ws2012.aufgabe04;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class Feld extends JButton {
	private int zahl;

	Feld(int zahl) {
		setPreferredSize(new Dimension(50, 50));
		setBackground(Color.CYAN);
		this.zahl = zahl;
		if (zahl != 0)
			setText("" + zahl);
	}
}