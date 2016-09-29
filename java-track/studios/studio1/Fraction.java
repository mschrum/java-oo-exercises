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
	
	//add
	public Fraction add(Fraction f2) {
		int newNum=this.numerator+f2.getNumerator();
		int newDen=this.denominator+f2.getDenominator();
		Fraction newFraction=new Fraction(newNum,newDen);
		return newFraction;
	}
	//mult
	public Fraction mult(Fraction f2){
		int newNum=this.numerator*f2.getNumerator();
		int newDen=this.denominator*f2.getDenominator();
		Fraction newFraction=new Fraction(newNum, newDen);
		return newFraction;
	}
	//recip
	public Fraction recip(){
		Fraction newFraction = new Fraction(this.denominator,this.numerator);
		return newFraction;
	}
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}
	public static void main(String[] args) {
		Fraction f1 = new Fraction(1,4);
		Fraction f2 = new Fraction(3,4);
		System.out.println("A fraction " + f1);
		System.out.println("Another fraction " + f2);
		System.out.println("The sum of " + f1 + " and " + f2 + " is: " + f1.add(f2));
		System.out.println("The product of " + f1 + " and " + f2 + " is: " +f1.mult(f2));
		System.out.println("The reciprocal of " + f1 + " is: " + f1.recip());
		System.out.println("The reciprocal of " + f2 + " is: " + f2.recip());

	}

}
