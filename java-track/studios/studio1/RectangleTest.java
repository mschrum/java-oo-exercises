package studio1;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTest {

	@Test
	public void testGetArea() {
		Rectangle r = new Rectangle(3,4);
		assertTrue ("Problem calculaing area", r.getArea()==12);
	}
	
	@Test
	public void testGetPerimiter() {
		Rectangle r = new Rectangle(3,4);
		assertTrue ("Problem calculaing preimiter", r.getPerimiter()==14);
	}
	
	@Test
	public void testIsSquare() {
		Rectangle r = new Rectangle(3,4);
		assertFalse ("Problem checking if rectangle is square", r.isSquare());
		Rectangle t = new Rectangle(4,4);
		assertTrue ("Problem checking if rectangle is square", t.isSquare());
	}
	
	@Test
	public void testCompareArea() {
		Rectangle r = new Rectangle(3,4);
		Rectangle t = new Rectangle(4,4);
		Rectangle s = new Rectangle(2,8);
		assertTrue ("Problem checking if rectangle is square", r.compareArea(t).equals("Second"));
		assertTrue ("Problem checking if rectangle is square", r.compareArea(s).equals("Second"));
		assertTrue ("Problem checking if rectangle is square", s.compareArea(t).equals("Equal"));
	}
}
