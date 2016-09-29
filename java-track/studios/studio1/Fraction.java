package studio1;

public class Fraction {
		private int numerator;
		private int denominator;
		
	public Fraction (int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}
	public static void main(String[] args) {
		Fraction f1 = new Fraction(1,4);
		Fraction f2 = new Fraction(3,4);
		System.out.println(f1);
		System.out.println(f2);

	}

}
