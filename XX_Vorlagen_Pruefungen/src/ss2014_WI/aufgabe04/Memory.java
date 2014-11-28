package ss2014_WI.aufgabe04;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Memory extends JFrame implements ActionListener {

	// attribute
	private MemoryFeld letzterKlick = null;
	private JLabel counter;
	private int paerchen = 0;

	// constructor
	Memory(int[][] nums) {
		// Lsg Konstructor
		
		
		
		
	}
	
	// weiteres
	
	
	
	
	
	
	
	
	
	

	// main 
	public static void main(String[] args) {
		int felder[][] = { { 1, 4, 8, 3 }, { 5, 2, 7, 4 }, { 3, 6, 2, 6 },
				{ 5, 7, 1, 8 } };

		new Memory(felder);
	}

}