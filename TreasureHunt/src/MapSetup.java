import java.util.Random;
import java.util.Scanner;

public class MapSetup {

	public  void setupGame(Map m, ObjectPositions o) {

		Scanner input = new Scanner(System.in);

		Random ran = new Random();
		int x = ran.nextInt(1) + 5;
		o.setTreasurePointX(x);
		x = ran.nextInt(1) + 5;
		o.setTreasurePointY(x);

		System.out.println("input player point X coordinate between 1 and 5:");
		o.setPlayerPointX(input.nextInt());
		System.out.println("input " + o.getPlayerPointX());

		System.out.println("input Player point Y coordinate between 1 and 5:");
		o.setPlayerPointY(input.nextInt());
		System.out.println("input " + o.getPlayerPointY());

		m = new Map(o.getTreasurePointX(), o.getTreasurePointY(), o.getPlayerPointX(), o.getPlayerPointY());

	}
}
