
public class AttackRobot extends Robot{
	private int attackPower;
	
	public AttackRobot(String name, int speed, int xPosition, int yPosition, String orientation){
		super(name,speed,xPosition,yPosition,orientation);
		this.attackPower=1;
	}
	
	public void setAttackPower(int attackPower){
		this.attackPower=attackPower;
	}
	
	public int getAttackPower(){
		return this.attackPower;
	}
	
	public void causeDamage(Robot r){
		r.setHP(r.getHP()-this.attackPower);
	}
	
	public void causeDamage(AttackRobot r){
		r.setHP(r.getHP()-this.attackPower);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
