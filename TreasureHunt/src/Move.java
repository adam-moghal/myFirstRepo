import java.util.Scanner;

public class Move {

	
	
	public void movePlayer(Map m, ObjectPositions o) {
		Move makeMove = new Move();
		String direction = "";
		Scanner movePlayer = new Scanner(System.in);

		System.out.println("type direction to move player position");
		direction = movePlayer.nextLine();
		System.out.println(direction.toUpperCase());

		switch (direction.toUpperCase()) {
		case "NORTH":

			makeMove.moveNorth(m, o);
			System.out.println("moved North");

			movePlayer(m, o);

			break; // optional

		case "EAST":
			makeMove.moveEast(m, o);
			System.out.println("moved East");
			movePlayer(m, o);

			break; // optional
		case "SOUTH":
			makeMove.moveSouth(m, o);
			System.out.println("moved South");
			movePlayer(m, o);

			break; // optional

		case "WEST":
			makeMove.moveWest(m, o);
			System.out.println("moved West");
			movePlayer(m, o);

			break; // optional

		default:
			movePlayer(m, o);

		}

		
	}
	
	public void moveNorth(Map m, ObjectPositions o) {

		o.setPlayerPointY(o.getPlayerPointY() - 1);
		m = new Map(o.getTreasurePointX(),o.getTreasurePointY(),o.getPlayerPointX(),o.getPlayerPointY());
		foundTreasure(o);
		
	}
	public void moveEast(Map m, ObjectPositions o) {

		o.setPlayerPointX(o.getPlayerPointX() + 1);
		m = new Map(o.getTreasurePointX(),o.getTreasurePointY(),o.getPlayerPointX(),o.getPlayerPointY());
		foundTreasure(o);

	}
	public void moveSouth( Map m, ObjectPositions o) {

		o.setPlayerPointY(o.getPlayerPointY() + 1);
		m = new Map(o.getTreasurePointX(),o.getTreasurePointY(),o.getPlayerPointX(),o.getPlayerPointY());
		foundTreasure(o);

	}
	public void moveWest( Map m, ObjectPositions o) {

		
		o.setPlayerPointX(o.getPlayerPointX() - 1);
		m = new Map(o.getTreasurePointX(),o.getTreasurePointY(),o.getPlayerPointX(),o.getPlayerPointY());
		foundTreasure(o);

	}
	
	public void checkBounds(ObjectPositions o, int y) {
	
		
	}
	
	public void foundTreasure(ObjectPositions o) {
		
		if(o.getPlayerPointX() == o.getTreasurePointX() && o.getPlayerPointY() == o.getTreasurePointY()) {
			
			
			System.out.println("TREASURE FOUND!");
		}
		
		
	}
	
	
	
}
