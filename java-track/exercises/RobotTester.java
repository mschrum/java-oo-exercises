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

}
