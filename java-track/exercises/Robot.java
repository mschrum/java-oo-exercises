
public class Robot {
	private String name;
	private int speed;
	private int xPosition;
	private int yPosition;
	private int orientation;

	public Robot(String name, int speed, int xPosition, int yPosition){
		this.name=name;
		this.speed=speed;
		this.xPosition=xPosition;
		this.yPosition=yPosition;
		this.orientation=180;
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
	public int getOrientation(){
		return this.orientation;
	}
	//can move
	//can rotate
	public void setOrientation(int newOrientation){
		this.orientation=newOrientation;
	}
	//calc distance from another robot
	//distance = sqrt((x1-x2)^2+(y1-y2)^2)
	//To String
	public String toString(){
		return "Name: " + this.name + " Speed: " + this.speed + " Position: " + this.xPosition + "," + this.yPosition + " Orientation: " + this.orientation;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot myRobot = new Robot("Melissa", 2, 0, 3);
		System.out.println(myRobot);
	}

}
