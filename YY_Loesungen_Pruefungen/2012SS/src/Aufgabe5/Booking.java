package Aufgabe5;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Booking extends JFrame implements ActionListener{

	public Booking (){
		// std kram
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// layout festlegen
		setLayout(new FlowLayout());

		
		
		// elemente hinzufügen
		JButton bb = new JButton("Buchen");
		bb.addActionListener(this);
		bb.setActionCommand("AC_B");
		add(bb);
		
		JButton ba = new JButton("Abbrechen");
		ba.addActionListener(this);
		add(ba);
		
		
		// std kram rest
		pack();
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if (e.getActionCommand().equals("AC_B")) {
			// buchen
			System.out.println("wurde gebucht");
		} else {
			// abbruch
			System.exit(NORMAL);
		}
	}
	
	public static void main(String[] args){
		new Booking();
	}
}
