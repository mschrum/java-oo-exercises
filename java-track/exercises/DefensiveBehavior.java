
public class DefensiveBehavior implements RobotBehavior{
	@Override
	public int doNextMove() {
		System.out.println("\tDefensive Behaviour: if find another robot run from it");
		return -1;
	}

}
