package ws2012.aufgabe04;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Sudoku extends JFrame {
	private JPanel[][] panels = new JPanel[3][3];
	
	
	// Lsg ab hier:
	
	
	
	
	
	
	
	
	// zum ausführen:
	public static void main (String[] args) {
		new Sudoku(new int [][] {
				{0,1,8,7,0,0,0,0,0},
				{0,2,0,6,0,0,4,8,5},
				{0,3,4,5,0,0,7,0,2},
				{0,0,0,0,0,0,6,3,1},
				{0,0,0,0,0,0,0,0,0},
				{1,8,5,0,0,0,0,0,0},
				{2,0,7,0,0,3,1,4,0},
				{3,4,6,0,0,8,0,7,0},
				{0,0,0,0,0,2,5,6,0}
		});
	}
}