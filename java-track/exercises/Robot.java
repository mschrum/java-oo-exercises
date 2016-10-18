
public class Robot {
	private String name;
	private int speed;
	private int xPosition;
	private int yPosition;
	private String orientation;
	private int HP;
	private RobotBehavior behavior;

	public Robot(String name, int speed, int xPosition, int yPosition, String orientation){
		this.name=name;
		this.speed=speed;
		this.xPosition=xPosition;
		this.yPosition=yPosition;
		this.orientation=orientation;
		this.HP=20;
	}
	public Robot(String name, int speed, int xPosition, int yPosition){
		this.name=name;
		this.speed=speed;
		this.xPosition=xPosition;
		this.yPosition=yPosition;
		this.orientation="East";
		this.HP=20;
	}
	//Getters
	public String getName (){
		return this.name;
	}
	public int getSpeed(){
		return this.speed;
	}
	public int getxPosition(){
		return this.xPosition;
	}
	public int getyPosition(){
		return this.yPosition;
	}
	public String getOrientation(){
		return this.orientation;
	}
	public int getHP(){
		return this.HP;
	}
	public void setHP(int HP){
		this.HP=HP;
	}
	
	//RobotBehavior Interface interaction
	public RobotBehavior getBehavior(){
		return this.behavior;	
	}	
	public void setBehavior(RobotBehavior behavior){
		this.behavior=behavior;	
	}
	public void fightMove(){
		System.out.println(this.name + ": Based on current position " +
					 "the behaviour object decide the next move:");
		int command = behavior.doNextMove();
		// ... send the command to mechanisms
		System.out.println("\tThe result returned by behaviour object is sent to the movement mechanisms for the robot "  + this.name);
	}
	//can move
	public void move (int newSpeed) {
		this.speed = newSpeed;
		if (this.orientation.equals("North")||this.orientation.equals("north")) {
			this.yPosition+=this.speed;
		}
		else if (this.orientation.equals("South")||this.orientation.equals("south")){
			this.yPosition-=this.speed;
		}
		else if (this.orientation.equals("East")||this.orientation.equals("east")){
			this.xPosition+=this.speed;
		}
		else if (this.orientation.equals("West")||this.orientation.equals("west")){
			this.xPosition-=this.speed;
		}
		else{
			return;
		}
	}
	public void move () {
		if (this.orientation.equals("North")||this.orientation.equals("north")) {
			this.yPosition+=this.speed;
		}
		else if (this.orientation.equals("South")||this.orientation.equals("south")){
			this.yPosition-=this.speed;
		}
		else if (this.orientation.equals("East")||this.orientation.equals("east")){
			this.xPosition+=this.speed;
		}
		else if (this.orientation.equals("West")||this.orientation.equals("west")){
			this.xPosition-=this.speed;
		}
		else{
			return;
		}
	}
	//can rotate sets orientation
	public void rotate (String newOrientation){
		this.orientation=newOrientation;
	}
	//calc distance from another robot
	public double distance (Robot r2) {
		double diffX = Math.abs(r2.getxPosition() - this.xPosition);
		double diffY = Math.abs(r2.getyPosition() - this.yPosition);
		double dX2= Math.pow(diffX, 2);
		double dY2= Math.pow(diffY, 2);
		double sum = dY2 + dX2;
		double distance = Math.round(Math.sqrt(sum)*100)/100.00;
		System.out.println("The distance between " + this.name +"'s robot and " + r2.getName() + "'s robot is " + distance );
		return distance;
	}
	
	//To String
	public String toString(){
		return "Name: " + this.name + " Speed: " + this.speed + " Position: " + this.xPosition + "," + this.yPosition + " Orientation: " + this.orientation;
	}
	public static void main(String[] args) {
		Robot r1 = new Robot("Mike",2,3,4);
		Robot r2 = new Robot("George",3,2,1);

		r1.setBehavior(new AggressiveBehavior());
		r2.setBehavior(new DefensiveBehavior());
		
		r1.fightMove();
		r2.fightMove();
		

		System.out.println("\r\nNew behaviours: " +
				"\r\n\tMike gets really scared" +
				"\r\n\tGeorge becomes really mad because" +
				"it's always attacked by other robots");

		r1.setBehavior(new AggressiveBehavior());
		r2.setBehavior(new DefensiveBehavior());

		r1.fightMove();
		r2.fightMove();
	}

}
