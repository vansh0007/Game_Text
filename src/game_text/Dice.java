package game_text;

public class Dice {

	public static int diceValue() {

		return (int) (Math.random() * ((6 - 1) + 1) + 1);

	}

}
