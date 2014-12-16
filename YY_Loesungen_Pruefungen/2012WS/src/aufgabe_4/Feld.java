package aufgabe_4;

import java.awt.*;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Feld extends JButton {
	private int zahl;
	
	Feld (int zahl) {
		setPreferredSize(new Dimension(50, 50));
		setBackground(Color.DARK_GRAY);
		this.zahl = zahl;
		if (zahl != 0) setText("" + zahl);
		this.setForeground(Color.WHITE);
	}

	// 4b
	public void increment(){
		zahl++;
		zahl%=10;
		
		if (zahl != 0) {
			setText("" + zahl);
		} else {
			setText("");
		}
	}
}
