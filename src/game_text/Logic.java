package game_text;

public class Logic extends Thread {
	static int sum = 0;
	static int var;

	static int randomTurns() {

		Double turn = Math.random();
		if (turn % 2 == 0) {

			return 0;
		} else
			return 1;
	}

	public static void gamePlay() throws InterruptedException {
		
		Logic t1 = new Logic();
		t1.run();

		if (Player.getName().equals(Ui.namelist.get(0))) {

			Player.setName(Ui.namelist.get(1));
		} else {
			Player.setName(Ui.namelist.get(0));
		}

		
		Logic t2 = new Logic();
		t2.run();
		 

	}
	
	
	 
		 
		
	 

	@Override
	public void run() {
 
		while (sum < 50) {
			  var = Dice.diceValue();

			sum += var;
			try {
				 Data.getInstance().getConnection();
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out
					.println(Player.getName() + " " + "The Dice thrown is : " + " " + var + " " + " the sum is:" + sum);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		sum = 0;
		// TODO Auto-generated method stub

	}

}
