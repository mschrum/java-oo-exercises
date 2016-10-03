package studio1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BaseballPlayerTest {
	BaseballPlayer a = new BaseballPlayer("Jim", 15, "Right", 30, 40, 80);
	
	@Test
	public void testHit() {
		a.hit();		
		assertTrue("Problem adding a hit", a.getNumHseason()==31);
		assertTrue("Problem adding a hit", a.getNumHgame()==1);
	}
	
	@Test
	public void testRBI() {
		a.rbi();		
		assertTrue("Problem adding a rbi", a.getNumRBIseason()==41);
		assertTrue("Problem adding a rbi", a.getNumRBIgame()==1);
	}
	
	@Test
	public void testCompleteGame() {
		a.completeGame();		
		assertTrue("Problem adding completed game", a.getNumPlayed()==81);
	}

}
