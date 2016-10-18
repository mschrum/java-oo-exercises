
public class AggressiveBehavior implements RobotBehavior{	
	@Override
	public int doNextMove() {
		System.out.println("\tAgressive Behaviour: if find another robot attack it");
		return 1;
	}
}
