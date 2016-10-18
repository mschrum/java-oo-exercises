package interfaces;

public class Rectangle implements Measurable{

	private float height;
	private float width;
	
	public Rectangle (float h, float w){
		this.height=h;
		this.width=w;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return this.height*this.width;
	}

	@Override
	public float getPerimiter() {
		// TODO Auto-generated method stub
		return 2*this.height+2*this.width;
	}
	
	
}
