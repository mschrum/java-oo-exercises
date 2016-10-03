import static org.junit.Assert.*;

import org.junit.Test;

public class ComputerTester {

	@Test
	public void testAddMemory() {
		Computer c =  new Computer(4,100, 100, "Lenovo");
		assertTrue ("Problem setting memory in the construsctor", c.getMemory()==4);
		c.addMemory(2);
		assertTrue ("Problem adding memory", c.getMemory()==6);
	}

	@Test
	public void testAddMemoryMax() {
		Computer c =  new Computer(8,100, 100, "Lenovo");
		assertTrue ("Problem setting memory in the construscto", c.getMemory()==8);
		c.addMemory(2);
		assertTrue ("Problem adding memory when hit max", c.getMemory()==8);
	}

}
