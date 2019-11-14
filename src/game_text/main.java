package game_text;

import java.util.Scanner;

import Battleship.BInterface;
import Battleship.PlayerUI;

public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter 1 for Text Game and 2 for Battleship");
		int choice = Integer.parseInt(scan.nextLine());
		if (choice == 1) {

			Ui ui = new Ui();
			ui.onScreen();
		}

		if (choice == 2) {

			PlayerUI obj = new PlayerUI();
            obj.start();
		}

	}

}
