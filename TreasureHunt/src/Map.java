import java.lang.reflect.Array;

public class Map {

	private int[][] map = new int [5][5];
	private int treasurePoint = 9;
	private int playerPoint = 1;
	private int treasurePointX;
	private int treasurePointY;
	private int playerPointX;
	private int playerPointY;


	public Map() {}

	public Map(int treasurePointX, int treasurePointY, int playerPointY, int playerPointX) {
		super();
		
		map[treasurePointY -1][treasurePointX -1 ] = treasurePoint;
		map[playerPointX -1][playerPointY - 1  ] = playerPoint;

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {

				System.out.print(map[i][j] + " ");
			}
			System.out.println("");
		}
		
		this.treasurePointX = treasurePointX;
		this.treasurePointY = treasurePointY;
		this.playerPointX = playerPointX;
		this.playerPointY = playerPointY;
	}




	public int[][] getMap() {
		return map;
	}



	public void setMap(int[][] map) {
		this.map = map;
	}


	public int getTreasurePointX() {
		return treasurePointX;
	}

	public void setTreasurePointX(int treasurePointX) {
		this.treasurePointX = treasurePointX;
	}

	public int getTreasurePointY() {
		return treasurePointY;
	}

	public void setTreasurePointY(int treasurePointY) {
		this.treasurePointY = treasurePointY;
	}

	public int getPlayerPointX() {
		return playerPointX;
	}

	public void setPlayerPointX(int playerPointX) {
		this.playerPointX = playerPointX;
	}

	public int getPlayerPointY() {
		return playerPointY;
	}


	public void setPlayerPointY(int playerPointY) {
		this.playerPointY = playerPointY;
	}


}
