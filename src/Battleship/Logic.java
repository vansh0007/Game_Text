/**
 * 
 */
package Battleship;

import java.util.ArrayList;
import javax.swing.*;

/**
 * @author vansh
 *
 */
public class Logic {

	static ArrayList<Integer> turn = new ArrayList();

	public static void randomTurns() throws InterruptedException {

		for (int i = 1; i < 65; i++) {

			turn.add(i);
		}

		for (int i = 0; i < turn.size(); i++) {

			if (i % 2 == 0) {

				Thread.sleep(1000);
			}

		}

		PlayerUI.pt.remove(0);

	}

}
