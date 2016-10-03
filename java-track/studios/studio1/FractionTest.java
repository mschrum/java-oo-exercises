package studio1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FractionTest {

	@Test
	public void testAdd() {
		Fraction f = new Fraction(1,2);
		Fraction g = new Fraction(1,2);
		Fraction h = new Fraction(1,3);
		Fraction j = f.add(g);
		Fraction k = g.add(h);
		assertTrue ("Problem adding fractions", j.getNumerator()==4 && j.getDenominator()==4);
		assertTrue ("Problem adding fractions", k.getNumerator()==5 && k.getDenominator()==6);		
	}
	
	@Test
	public void testMult() {
		Fraction f = new Fraction(1,2);
		Fraction g = new Fraction(1,2);
		Fraction h = new Fraction(1,3);
		Fraction j = f.mult(g);
		Fraction k = g.mult(h);
		assertTrue ("Problem multiplying fractions", j.getNumerator()==1 && j.getDenominator()==4);
		assertTrue ("Problem multiplying fractions", k.getNumerator()==1 && k.getDenominator()==6);		
	}
	
	@Test
	public void testRecip() {
		for (int i = -10; i<11; i++){
			for (int j = -10; j<11; j++){
				Fraction f = new Fraction(i,j);
				Fraction fr = f.recip();
				assertTrue("Problem calculating recip of f", fr.getNumerator()==f.getDenominator() && fr.getDenominator()== f.getNumerator());
			}
		}
	}

}
