package aufgabe_4;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Sudoku extends JFrame implements ActionListener{
	private JPanel[][] panels = new JPanel[3][3];
	
	Sudoku(int[][] content){
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(3,3, 10, 10));	// 10 weil in Angabe nicht gefunden
		
		for(int row = 0; row < 3; row++){
			
			for(int col = 0; col < 3; col++){
				// hier erschaffen
				JPanel currentPanel = new JPanel(new GridLayout(3,3));
				
				// hier befüllen
				for(int row2 = 0; row2 < 3; row2++){
					for(int col2 = 0; col2 < 3; col2++){
						// wir brauchen col & row für offsetberechnung!
						Feld currentFeld = new Feld(content[row*3+row2][col*3+col2]);
						
						// überprüfen ob Feld veränderbar sein darf (4b)
						if (content[row*3+row2][col*3+col2] == 0){
							currentFeld.addActionListener(this);
						}
						
						// Feld hinzufügen
						currentPanel.add(currentFeld);
					}
				}
				
				// hier ablegen
				panels[row][col] = currentPanel;
				this.add(currentPanel);
			}
			
		}
		
		
		pack();
		setVisible(true);
	}
	

	public static void main(String[] args) {
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

	// 4b: Feld drücken
	public void actionPerformed(ActionEvent e){
		// Herausfinden welches Feld gedrückt wurde
		Feld pushed = (Feld) e.getSource();
		
		// Feld inkrementieren
		pushed.increment();
	}
}
