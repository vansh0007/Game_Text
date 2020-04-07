/**
 * 
 */
package Battleship;

/**
 * @author vansh
 *
 */
public class Player {

	public static String name;
	public static int  Player1_Score=0;
	public static int getPlayer1_Score() {
		return Player1_Score;
	}

	public static void setPlayer1_Score(int player1_Score) {
		Player1_Score = player1_Score;
	}

	public static int getPlayer2_Score() {
		return Player2_Score;
	}

	public static void setPlayer2_Score(int player2_Score) {
		Player2_Score = player2_Score;
	}

	public static int  Player2_Score=0;
	

	public Player(String name) {

		name = name;

	}

	public static String getName() {

		return name;

	}

	public static void setName(String name1) {

		name = name1;

	}

	 
}
