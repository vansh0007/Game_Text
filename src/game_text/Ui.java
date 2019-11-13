package game_text;

import game_text.Logic;
import java.util.ArrayList;
import java.util.Scanner;

public class Ui {
	String starts;
	Scanner scan = new Scanner(System.in);
	static ArrayList<String> namelist = new ArrayList();

	public void onScreen() throws InterruptedException {

		System.out.println("Enter Player1 Name");
		String playerName1 = scan.nextLine();
		Player player = new Player(playerName1);

		System.out.println("Enter Player2 Name");

		String playerName2 = scan.nextLine();

		Player.setName(playerName2);
		System.out.println("----------------------------------------------------------------------");
		System.out.println(" -------------------------------------------------------------------- ");
		System.out.println("  ------------------------------------------------------------------");
		System.out.println("                  ---------------GAME BEGINS-----------------      ");

		namelist.add(playerName1);
		namelist.add(playerName2);

		if (Logic.randomTurns() == 1) {

			starts = namelist.get(1);
		} else
			starts = namelist.get(0);

		System.out.println(starts +"  "+ "begins the game:");
		Logic.gamePlay();

	}

}
