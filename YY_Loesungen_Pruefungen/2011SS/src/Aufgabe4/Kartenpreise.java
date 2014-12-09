package Aufgabe4;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Kartenpreise extends JFrame{
	
	public Kartenpreise(){
		// std kram
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Element Text hinzufügen
		add(new JLabel("Kartenpreise"), BorderLayout.NORTH);
		
		// Element untern hinzufügen
		JPanel unten = new JPanel(new GridLayout(3, 2));
		add(unten, BorderLayout.CENTER);
		
		
		// Elemente vom unteren Bereich
		unten.add(new JLabel("Einzelpreis:"));
		
		/*
		
		Restlicher Code folgt das nächste mal
		*/
		
		// std rest
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args){
		new Kartenpreise();
	}

}
