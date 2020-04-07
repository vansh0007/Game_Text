package Battleship;

import java.util.ArrayList;
import java.util.Scanner;

import game_text.Player;

public class BInterface {
	static	ArrayList<String> namelist = new ArrayList();
	 
	public static void start() throws InterruptedException {

	 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Player1 Name");
		String playerName1 = scan.nextLine();
		Player player = new Player(playerName1);

		System.out.println("Enter Player2 Name");

		String playerName2 = scan.nextLine();
		namelist.add(playerName1);
		namelist.add(playerName2);

		PlayerUI obj = new PlayerUI();
		obj.start();
		 obj.mainHandler();

	}
}
