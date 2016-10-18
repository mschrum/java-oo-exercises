
public class CarryRobot extends Robot{
	private String item;
	
	public CarryRobot (String name, int speed, int xPosition, int yPosition, String orientation){
		super(name,speed,xPosition,yPosition,orientation);
		this.item="";
	}
	
	public String getItem(){
		return this.item;
	}
	
	public void pickUp(String item){
		this.item=item;
	}
	
	public void putDown(){
		this.item="";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
