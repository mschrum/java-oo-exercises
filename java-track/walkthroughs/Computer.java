
public class Computer {
	//Has-a
	private int memory;
	protected double size;
	private double processor;
	private String brand;

	//Constructor
	public Computer(int memory, double size, double processor, String brand) {
		if (memory<0){
			throw new IllegalArgumentException();
		}
		this.memory=memory;
		this.size=size;
		this.processor=processor;
		this.brand=brand;
	}
	//Getters
	public String getBrand(){
		return this.brand;
	}
	public double getSize(){
		return this.size;
	}
	public double getProcessor(){
		return this.processor;
	}
	public int getMemory(){
		return this.memory;
	}
	//mutators
	public void addMemory(int newMemory){
		if(this.memory+newMemory>8){
			return;
		}
		else{
			this.memory+=newMemory;
		}
	}
	//Setters
	public void setProcessor(double newProcessor){
		this.processor=newProcessor;
	}
	//To String Object Descriptor
	public String toString() {
		return "Memory: " + this.memory + " Processor: " + this.processor + " Size: " + this.size + " Brand: " + this.brand;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Computer myComputer = new Computer(8, 2.4, 15.5, "Lenovo");
		System.out.println(myComputer.getBrand());
		}
		catch(IllegalArgumentException e){
			System.out.println("Cannot create Computer");
			e.printStackTrace();
		}
		
	}

}
