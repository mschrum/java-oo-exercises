import java.util.ArrayList;

public class Laptop extends Computer {

	private boolean isClosed;
	
	public Laptop(int memory, double size, double processor, String brand){
		super(memory,size,processor,brand);
		this.isClosed=true;
	}
	
	public void	close(){
		this.isClosed=true;
	}
	
	public void open(){
		this.isClosed=false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop l = new Laptop(8,15,10000,"Apple");
		Tablet t = new Tablet(4,10,1000, "Lenovo");
		Computer c = new Computer(2,12,100,"HP");
		
		System.out.println(l.getBrand());
		System.out.println(t.getBrand());
		System.out.println(c.getBrand());
		
		ArrayList<Computer> computers = new ArrayList<Computer>();
		computers.add(c);
		computers.add(t);
		computers.add(l);
	}

}
