package interfaces;

import java.util.ArrayList;

public class Circle implements Measurable {

	private float radius;
	
	public Circle (float r){
		this.radius=r;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return (float)Math.PI*this.radius*this.radius;
	}

	@Override
	public float getPerimiter() {
		// TODO Auto-generated method stub
		return 2*(float)Math.PI*this.radius;
	}
	
	public static void main (String[] args) {
		Rectangle r = new Rectangle(7,8);
		Circle c = new Circle(5);
		
		ArrayList <Measurable> shapes= new ArrayList<Measurable>();
		shapes.add(r);
		shapes.add(c);
		
		for (int i=0; i<shapes.size(); i++){
			Measurable shape = shapes.get(i);
			System.out.println(shape.getArea());
		}
	}
	
}
