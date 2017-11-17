import java.lang.reflect.Array;
import java.util.*;

public class TreasureHunt {

	public static void main(String[] args) {
		ObjectPositions o = new ObjectPositions();
		Map m = new Map();
		MapSetup setup = new MapSetup();
		Move movePlayer = new Move();
		
		setup.setupGame(m, o);
		movePlayer.movePlayer(m, o);


	}


	public static void checkGame(ObjectPositions a) {

		if (a.getTreasurePointX() == a.getPlayerPointX() && a.getTreasurePointY() == a.getPlayerPointY()) {
			System.out.println("win");
		} else {

			System.out.println("lose");
		}

	}
}



	
