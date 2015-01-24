package aufgabe4;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Spieldauer extends JFrame implements ActionListener{
	private int minuten = 0, sekunden = 0;		// Restspielzeit
	private JLabel restAnzeige;
	private JButton startButton, resetButton, verlButton;
	private Thread countThread;
	private boolean running = false;
	
	private final int defaultTime = 45;
	
	Spieldauer(){
		// standardmist
		super("Spieldauer");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// wir verwenden ein Gridlayout
		setLayout(new GridLayout(4,1));
		
		// Zeitanzeige
		minuten = defaultTime;
		restAnzeige = new JLabel();
		updateDisplay();
		add(restAnzeige);
		
		// Button werden von oben nach unten angelegt
		verlButton = new JButton("+1 Minute");
		verlButton.addActionListener(this);
		verlButton.setActionCommand("AC_V");
		add(verlButton);
		
		startButton = new JButton("Start");
		startButton.addActionListener(this);
		startButton.setActionCommand("AC_S");
		add(startButton);
		
		resetButton = new JButton("Reset");
		resetButton.addActionListener(this);
		resetButton.setActionCommand("AC_R");
		add(resetButton);
		
		
		// standardmist
		setVisible(true);
		pack();
	}
	
	public void decrement(){
		int time = minuten * 60 + sekunden;
		time--;
		
		if (time > 0){
			minuten = time / 60;
			sekunden = time % 60;
			updateDisplay();
		} else {
			restAnzeige.setText("Spielende");
			running = false;
		}
	}
	
	public void updateDisplay(){
		restAnzeige.setText(String.format("%02d:%02d", minuten, sekunden));
	}
	
	private boolean isRunning(){
		return running;
	}
	
	private class CountThread extends Thread {
		public void run(){
			while (true){
				try {
					sleep(1000);
					if (isRunning()){
						decrement();
					} else {
						break;
					}
				} catch (InterruptedException e){
					// Fehlerbehandlung meist optional, aber wir loggen es in der Konsole
					System.out.println("Sleep wurde unterbrochen");
				}
			}
		}
	}
	
	public void actionPerformed(ActionEvent ae){
		switch (ae.getActionCommand()){
		case "AC_V":
			minuten++;
			updateDisplay();
			break;
		case "AC_S":
			// sicherstellen das alter Thread beendet wurde
			running = false;
			
			// starten
			running = true;
			countThread = new CountThread();
			countThread.start();
			break;
		case "AC_R":
			running = false;
			
			minuten = defaultTime;
			sekunden = 0;
			updateDisplay();
			break;
		}
	}
		
	

	public static void main(String[] args) {
		new Spieldauer();
	}

}
