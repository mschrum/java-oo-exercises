
public class Robot {
	private String name;
	private int speed;
	private int xPosition;
	private int yPosition;
	private String orientation;

	public Robot(String name, int speed, int xPosition, int yPosition, String orientation){
		this.name=name;
		this.speed=speed;
		this.xPosition=xPosition;
		this.yPosition=yPosition;
		this.orientation=orientation;
	}
	public Robot(String name, int speed, int xPosition, int yPosition){
		this.name=name;
		this.speed=speed;
		this.xPosition=xPosition;
		this.yPosition=yPosition;
		this.orientation="East";
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
	public void distance (Robot r2) {
		double diffX = Math.abs(r2.getxPosition() - this.xPosition);
		double diffY = Math.abs(r2.getyPosition() - this.yPosition);
		double dX2= Math.pow(diffX, 2);
		double dY2= Math.pow(diffY, 2);
		double sum = dY2 + dX2;
		double distance = Math.round(Math.sqrt(sum)*100)/100.00;
		System.out.println("The distance between " + this.name +"'s robot and " + r2.getName() + "'s robot is " + distance );
	}
	//To String
	public String toString(){
		return "Name: " + this.name + " Speed: " + this.speed + " Position: " + this.xPosition + "," + this.yPosition + " Orientation: " + this.orientation;
	}
	public static void main(String[] args) {
		Robot myRobot = new Robot("Melissa", 2, 0, 3, "north");
		Robot yourRobot = new Robot("John", 1, 0, 0, "West");
		System.out.println(myRobot);
		myRobot.move(3);
		System.out.println(myRobot);
		myRobot.rotate("South");
		myRobot.move(2);
		System.out.println(myRobot);
		myRobot.move();
		System.out.println(myRobot);
		myRobot.rotate("west");
		myRobot.move(1);
		System.out.println(myRobot);
		System.out.println(yourRobot);
		myRobot.distance(yourRobot);
	}

}
