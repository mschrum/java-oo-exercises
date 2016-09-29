package studio1;

public class Rectangle {
	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getArea(){
		return this.length*this.width;
	}

	public int getPerimiter() {
		return (2*this.length)+(2*this.width);
	}

	public boolean isSquare () {
		if (this.length!=this.width) {
			return false;
		}
		else {
			return true;
		}
	}
	public void compareArea(Rectangle r2) {
		if (this.getArea()>r2.getArea()) {
			System.out.println ("R1 is larger");
		}
		else if (this.getArea()<r2.getArea()) {
			System.out.println("R2 is larger");
		}
		else System.out.println("The rectangle's are is equal");	
	}
	public String toString () {
		return "It is " + this.isSquare() + " that this rectangle is a square.";
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(3,2);
		Rectangle r2 = new Rectangle (3,3);
		r1.compareArea(r2);
		System.out.println(r1);
		System.out.println(r2);
	}

}
