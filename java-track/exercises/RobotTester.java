import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTester {

	@Test
	public void testMove() {
	Robot r = new Robot("Melissa", 2, 0, 0);
	assertTrue ("Problem setting speed in constructor", r.getSpeed()==2);
	assertTrue ("Problem setting x position in constructor", r.getxPosition()==0);
	assertTrue ("Problem setting y position in constructor", r.getyPosition()==0);
	r.move();
	assertTrue ("Problem moving robot", r.getxPosition()==2 && r.getyPosition()==0);	
	}
	
	@Test
	public void testRotate() {
	Robot r = new Robot("Melissa", 2, 0, 0);
	r.rotate("North");
	assertTrue ("Problem rotating robot", r.getOrientation().equals("North"));	
	}
	
	@Test
	public void testDistance() {
	Robot r = new Robot("Melissa", 2, 4, 0);
	Robot a = new Robot("John", 2, 0, 3);
	assertTrue ("Problem measuring distance between robots", r.distance(a)==5);	
	}
	
	@Test
	public void testCarry() {
	CarryRobot r = new CarryRobot("Melissa", 2, 4, 0,"North");
	String item="Orange";
	r.pickUp(item);
	assertEquals ("Problem picking up item", r.getItem(),item);
	item="Apple";
	r.pickUp(item);
	assertEquals ("Problem picking up item", r.getItem(),item);
	r.putDown();
	assertEquals ("Problem putting down item", r.getItem(),"");
	}
	
	@Test
	public void testAttack() {
	AttackRobot r = new AttackRobot("Melissa", 2, 4, 0,"North");
	Robot s = new Robot("John", 2, 0, 3);
	r.causeDamage(s);
	assertEquals ("Problem causing damage to s", s.getHP(),19);
	r.setAttackPower(4);
	r.causeDamage(s);
	assertEquals ("Problem causing damage to s", s.getHP(),15);
	r.causeDamage(r);
	assertEquals ("Problem causing damage to self", r.getHP(),16);
	}

}
