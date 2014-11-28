package ws2012.aufgabe02;

enum Level {NOVICE, EXPERIENCED, EXPERT, MASTER, GRANDMASTER}

public abstract class Player implements Comparable<Player> {

	private int value;
	private Level level;
	
	Player(int value, Level level) {
		this.value = value;
		this.level = level;
	}
	
	int getValue() { return value; }
	Level getLevel() {return level; }

	// lsg ab hier
	
	
	
	
	
	
	
	
}
