import java.util.ArrayList;
import java.util.Scanner;
public class RobotMenu {
	private ArrayList<Robot> robots;
	private Scanner s;
	public static void main(String[] args) {
		int x=0;
		RobotMenu rm= new RobotMenu();
		do {
			x=rm.StartMenu();
			rm.processInput(x);
		} while (x!=6);

	}
	public RobotMenu() {
		s= new Scanner(System.in);
		robots= new ArrayList<Robot>();
	}

	public int StartMenu() {
		System.out.println("Welcome to the Robot Menu!");
		System.out.println("1. Create a robot");
		System.out.println("2. Display the list of available robots");
		System.out.println("3. Move a robot");
		System.out.println("4. Rotate a robot");
		System.out.println("5. Compute the distance between two robots");
		System.out.println("6. Exit");
		System.out.println("Please Select an option");
		int selection= s.nextInt();
		while(selection<0||selection >6){
			System.out.println("Invalid selection, please try again");
			selection= s.nextInt();
		}
		return selection;
	}

	public void	processInput(int selection) {
		if (selection == 1) {
			createRobot();
		}
		else if (selection == 2) {
			displayRobot();
		}
		else if (selection == 3){
			displayRobot();
			Robot r = selectRobot();
			System.out.println("Please enter a speed");
			int speed = s.nextInt();
			while (speed<1){
				System.out.println("Invalid value. Please enter a posiive value");
				speed = s.nextInt();
			}
			r.move(speed);;
			System.out.println("Here is the robot's stats after moving");
			System.out.println(r);
		}
		else if (selection == 4){
			displayRobot();
			Robot r = selectRobot();
			System.out.println("In which direction would you like to point the robot?");
			String rot = s.next();
			r.rotate(rot);
			System.out.println("Here is the robots stats after rotating");
			System.out.println(r);
		}
		else if (selection == 5){
			displayRobot();
			Robot r = selectRobot();
			displayRobot();
			Robot t = selectRobot();
			r.distance(t);
		}
	}

	private void displayRobot(){
		for (int i=0; i< robots.size(); i++){
			System.out.println((i+1) + ".)" + robots.get(i));
		}
	}

	private Robot selectRobot(){
		System.out.println("Please select a robot: ");
		int selection = s.nextInt();
		while(selection < 1 || selection > robots.size()){
			System.out.println("Invalid selection please try again: ");	
			selection = s.nextInt();
		}
		return robots.get(selection-1);
	}

	private void createRobot(){
		System.out.println("Please enter a name for the robot");
		String name = s.next();

		System.out.println("Please enter the speed for the robot has");
		int speed = s.nextInt();
		while(speed<1){
			System.out.println("Invalid value, please enter a positive value for memory");
			speed = s.nextInt();
		}

		System.out.println("Please enter a x position for the robot");
		int xPosition = s.nextInt();

		System.out.println("Please enter a y position for the computer");
		int yPosition =s.nextInt();

		System.out.println("Please enter an orientation for the robot");
		String orientation = s.next();
		robots.add(new Robot(name, speed, xPosition, yPosition, orientation));
	}
}
