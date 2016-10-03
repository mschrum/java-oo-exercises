package studio1;

public class BaseballPlayer {
	private String name;
	private int number;
	private String batSide;
	private int numHgame;
	private int numHseason;
	private int numRBIgame;
	private int numRBIseason;
	private int numPlayed;

	public BaseballPlayer(String name, int number, String batSide, int numHseason,
			int numRBIseason, int numPlayed) {
		this.name = name;
		this.number = number;
		this.batSide = batSide;
		this.numHgame = 0;
		this.numHseason = numHseason;
		this.numRBIgame = 0;
		this.numRBIseason = numRBIseason;
		this.numPlayed = numPlayed;
	}
		
	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public String getBatSide() {
		return batSide;
	}

	public int getNumHgame() {
		return numHgame;
	}

	public int getNumHseason() {
		return numHseason;
	}

	public int getNumRBIgame() {
		return numRBIgame;
	}

	public int getNumRBIseason() {
		return numRBIseason;
	}

	public int getNumPlayed() {
		return numPlayed;
	}

	public void hit () {
		this.numHgame+=1;
		this.numHseason+=1;
	}

	public void rbi () {
		this.numRBIgame +=1;
		this.numRBIseason +=1;
	}
	
	public void completeGame () {
		this.numPlayed+=1;
	}
	
	public String toString () {
		return this.name + " number " + this.number + ". Has " + this.numHseason + " hits this season and " + this.numRBIseason + " RBI's.";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
