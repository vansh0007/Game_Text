package Battleship;

import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import javax.swing.*;
import java.util.Collections;

import Battleship.BInterface;

/**
 *
 * @author vansh
 */
public class PlayerUI extends javax.swing.JFrame implements ActionListener {
	ArrayList<JButton> myButtons = new ArrayList<>();

	/**
	 * Creates new form PlayerUI
	 */
	public PlayerUI() {
		initComponents();

//		JButton[] buttonArray = new JButton[30];
//		buttonArray[0] = jButton70;
//		buttonArray[1] = jButton71;
//		buttonArray[2] = jButton72;
//		buttonArray[3] = jButton73;
//		buttonArray[4] = jButton74;
//		buttonArray[5] = jButton75;
//		buttonArray[6] = jButton76;
//		buttonArray[7] = jButton77;
//		buttonArray[8] = jButton78;
//		buttonArray[9] = jButton79;
//		buttonArray[10] = jButton80;
//		buttonArray[11] = jButton81;
//		buttonArray[12] = jButton82;
//		buttonArray[13] = jButton83;
//		buttonArray[14] = jButton84;
//		buttonArray[15] = jButton85;
//		buttonArray[16] = jButton86;
//		buttonArray[17] = jButton87;
//		buttonArray[18] = jButton88;
//		buttonArray[19] = jButton89;
//		buttonArray[20] = jButton90;
//		buttonArray[21] = jButton91;
//		buttonArray[22] = jButton92;
//		buttonArray[23] = jButton93;
//		buttonArray[24] = jButton94;
//		buttonArray[25] = jButton95;
//		buttonArray[26] = jButton96;
//		buttonArray[27] = jButton97;
//		buttonArray[28] = jButton98;
//		buttonArray[29] = jButton99;
//		
//		
//		
//       

		// JOptionPane.showMessageDialog(jInternalFrame2, "hi ");
	}

	static ArrayList<Integer> count = new ArrayList<Integer>();

	public static Icon getShip(int value) {
		if (value == 0) {
			Icon i = new ImageIcon(
					"C:\\Users\\vansh\\Documents\\NetBeansProjects\\JavaApplication14\\src\\javaapplication14\\image1.jpg");

			return i;// TODO add your handling code here:
		}

		if (value == 1) {
			Icon i = new ImageIcon("C:\\Users\\vansh\\Desktop\\cross.JPG");
			return i;

		}
		return null;
	}

	static boolean isClicked = false;

	public static String getString(String e) {
		return e;

	}
	// Random button for AI or Computer Turn.

	public static void randomGenerator() {

		int abc = (int) (Math.random() * ((32 - 1) + 1) + 1);



		if (count.contains(abc)){
			
			randomGenerator();
			
		}
		else

			switch (abc) {

			case 1:
				count.add(1);
				jButton38.doClick();
				break;

			case 2:
				count.add(2);
				jButton39.doClick();
				break;

			case 3:
				count.add(3);
				jButton40.doClick();
				break;

			case 4:
				count.add(4);
				jButton41.doClick();
				break;

			case 5:
				count.add(5);
				jButton42.doClick();
				break;

			case 6:
				count.add(6);
				jButton43.doClick();
				break;

			case 7:
				count.add(7);
				jButton44.doClick();
				break;

			case 8:
				count.add(8);
				jButton45.doClick();

				break;
			case 9:
				jButton46.doClick();
				count.add(9);
				break;
			case 10:
				jButton47.doClick();
				count.add(10);
				break;
			case 11:
				jButton48.doClick();
				count.add(11);
				break;
			case 12:
				jButton49.doClick();
				count.add(12);
				break;
			case 13:
				jButton50.doClick();
				count.add(13);
				break;
			case 14:
				jButton51.doClick();
				count.add(14);
				break;
			case 15:
				jButton52.doClick();
				count.add(15);
				break;
			case 16:
				jButton53.doClick();
				count.add(16);
				break;
			case 17:
				jButton54.doClick();
				count.add(17);
				break;
			case 18:
				jButton55.doClick();
				count.add(18);
				break;
			case 19:
				jButton56.doClick();
				count.add(19);
				break;
			case 20:
				jButton57.doClick();
				count.add(20);
				break;
			case 21:
				jButton58.doClick();
				count.add(21);
				break;
			case 22:
				jButton59.doClick();
				count.add(22);
				break;
			case 23:
				jButton60.doClick();
				count.add(23);
				break;
			case 24:
				jButton61.doClick();
				count.add(24);
				break;
			case 25:
				jButton62.doClick();
				count.add(25);
				break;
			case 26:
				jButton63.doClick();
				count.add(26);
				break;
			case 27:
				jButton64.doClick();
				count.add(27);
				break;
			case 28:
				jButton65.doClick();
				count.add(28);
				break;
			case 29:
				jButton66.doClick();
				count.add(29);
				break;
			case 30:
				jButton67.doClick();
				count.add(30);
				break;
			case 31:
				jButton68.doClick();
				count.add(31);
				break;
			case 32:
				jButton37.doClick();
				count.add(32);
				break;
			}
	 
//		System.out.println(count);
//		System.out.println(" Player 1: "+ Player.Player1_Score);
//		System.out.println(" Player 2: "+ Player.Player2_Score);
		if(pressed==32) {
			if(Player.getPlayer1_Score()>Player.Player2_Score) {
				
				JOptionPane.showMessageDialog(jInternalFrame2, "Congratulations, You won ! " );
				 int confirmed = JOptionPane.showConfirmDialog(null, "Exit Program?","EXIT",JOptionPane.YES_NO_OPTION);
			        if(confirmed == JOptionPane.YES_OPTION)
			        {
			        	jInternalFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        }
				 
				
			}
			else if(Player.getPlayer2_Score()>Player.Player1_Score) {
				
				JOptionPane.showMessageDialog(jInternalFrame2, " I WON , Better Luck next time ! ");
				 int confirmed = JOptionPane.showConfirmDialog(null, "Exit Program?","EXIT",JOptionPane.YES_NO_OPTION);
			        if(confirmed == JOptionPane.YES_OPTION)
			        {
			        	jInternalFrame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			        }
				
			
		}
			else
				{JOptionPane.showMessageDialog(jInternalFrame2, " WOOOOH! Close Match  ");
				 int confirmed = JOptionPane.showConfirmDialog(null, "Exit Program?","EXIT",JOptionPane.YES_NO_OPTION);
			        if(confirmed == JOptionPane.YES_OPTION)
			        {
			        	jInternalFrame1.dispose();
			        }}
			 
		}
		
		
		}

		 
		
	

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();

		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jPanel1 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jSeparator2 = new javax.swing.JSeparator();
		jInternalFrame1 = new javax.swing.JInternalFrame();
		jButton69 = new javax.swing.JButton();
		jButton70 = new javax.swing.JButton();
		jButton71 = new javax.swing.JButton();
		jButton72 = new javax.swing.JButton();
		jButton73 = new javax.swing.JButton();
		jButton74 = new javax.swing.JButton();
		jButton75 = new javax.swing.JButton();
		jButton76 = new javax.swing.JButton();
		jButton77 = new javax.swing.JButton();
		jButton78 = new javax.swing.JButton();
		jButton79 = new javax.swing.JButton();
		jButton80 = new javax.swing.JButton();
		jButton81 = new javax.swing.JButton();
		jButton82 = new javax.swing.JButton();
		jButton83 = new javax.swing.JButton();
		jButton84 = new javax.swing.JButton();
		jButton85 = new javax.swing.JButton();
		jButton86 = new javax.swing.JButton();
		jButton87 = new javax.swing.JButton();
		jButton88 = new javax.swing.JButton();
		jButton89 = new javax.swing.JButton();
		jButton90 = new javax.swing.JButton();
		jButton91 = new javax.swing.JButton();
		jButton92 = new javax.swing.JButton();
		jButton93 = new javax.swing.JButton();
		jButton94 = new javax.swing.JButton();
		jButton95 = new javax.swing.JButton();
		jButton96 = new javax.swing.JButton();
		jButton97 = new javax.swing.JButton();
		jButton98 = new javax.swing.JButton();
		jButton99 = new javax.swing.JButton();
		jButton100 = new javax.swing.JButton();
		jInternalFrame2 = new javax.swing.JInternalFrame();
		jButton37 = new javax.swing.JButton();
		jButton38 = new javax.swing.JButton();
		jButton39 = new javax.swing.JButton();
		jButton40 = new javax.swing.JButton();
		jButton41 = new javax.swing.JButton();
		jButton42 = new javax.swing.JButton();
		jButton43 = new javax.swing.JButton();
		jButton44 = new javax.swing.JButton();
		jButton45 = new javax.swing.JButton();
		jButton46 = new javax.swing.JButton();
		jButton47 = new javax.swing.JButton();
		jButton48 = new javax.swing.JButton();
		jButton49 = new javax.swing.JButton();
		jButton50 = new javax.swing.JButton();
		jButton51 = new javax.swing.JButton();
		jButton52 = new javax.swing.JButton();
		jButton53 = new javax.swing.JButton();
		jButton54 = new javax.swing.JButton();
		jButton55 = new javax.swing.JButton();
		jButton56 = new javax.swing.JButton();
		jButton57 = new javax.swing.JButton();
		jButton58 = new javax.swing.JButton();
		jButton59 = new javax.swing.JButton();
		jButton60 = new javax.swing.JButton();
		jButton61 = new javax.swing.JButton();
		jButton62 = new javax.swing.JButton();
		jButton66 = new javax.swing.JButton();
		jButton63 = new javax.swing.JButton();
		jButton64 = new javax.swing.JButton();
		jButton65 = new javax.swing.JButton();
		jButton67 = new javax.swing.JButton();
		jButton68 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setText("Player 1");

		String name = (BInterface.namelist.get(0));
		jLabel2.setText(name);

		jLabel3.setText("Player 2 ");

		jLabel4.setText(BInterface.namelist.get(1));

		jPanel1.setBackground(new java.awt.Color(199, 93, 93));
		jPanel1.setLayout(null);

		jLabel5.setText("Player 1 Score:" + " " + Player.Player1_Score);

		jLabel6.setText("Player 2 Score:" + " " + Player.Player2_Score);

		jInternalFrame1.setVisible(true);
		jInternalFrame1.getContentPane().setLayout(new java.awt.GridLayout(8, 8));

		jButton69.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton69ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton69);

		jButton70.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton70ActionPerformed(evt);

			}
		});
		jInternalFrame1.getContentPane().add(jButton70);

		jButton71.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton71ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton71);

		jButton72.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton72ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton72);

		jButton73.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton73ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton73);

		jButton74.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton74ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton74);

		jButton75.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton75ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton75);

		jButton76.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton76ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton76);

		jButton77.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton77ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton77);

		jButton78.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton78ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton78);

		jButton79.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton79ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton79);

		jButton80.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton80ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton80);

		jButton81.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton81ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton81);

		jButton82.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton82ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton82);

		jButton83.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton83ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton83);

		jButton84.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton84ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton84);

		jButton85.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton85ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton85);

		jButton86.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton86ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton86);

		jButton87.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton87ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton87);

		jButton88.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton88ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton88);

		jButton89.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton89ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton89);

		jButton90.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton90ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton90);

		jButton91.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton91ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton91);

		jButton92.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton92ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton92);

		jButton93.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton93ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton93);

		jButton94.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton94ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton94);

		jButton95.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton95ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton95);

		jButton96.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton96ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton96);

		jButton97.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton97ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton97);

		jButton98.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton98ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton98);

		jButton99.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton99ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton99);

		jButton100.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton100ActionPerformed(evt);
			}
		});
		jInternalFrame1.getContentPane().add(jButton100);

		jInternalFrame2.setVisible(true);
		jInternalFrame2.getContentPane().setLayout(new java.awt.GridLayout(8, 8));

		jButton37.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton37ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton37);

		jButton38.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton38ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton38);

		jButton39.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton39ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton39);

		jButton40.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton40ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton40);

		jButton41.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton41ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton41);

		jButton42.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton42ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton42);

		jButton43.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton43ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton43);

		jButton44.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton44ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton44);

		jButton45.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton45ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton45);

		jButton46.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton46ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton46);

		jButton47.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton47ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton47);

		jButton48.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton48ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton48);

		jButton49.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton49ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton49);

		jButton50.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton50ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton50);

		jButton51.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton51ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton51);

		jButton52.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton52ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton52);

		jButton53.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton53ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton53);

		jButton54.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton54ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton54);

		jButton55.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton55ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton55);

		jButton56.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton56ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton56);

		jButton57.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton57ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton57);

		jButton58.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton58ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton58);

		jButton59.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton59ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton59);

		jButton60.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton60ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton60);

		jButton61.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton61ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton61);

		jButton62.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton62ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton62);

		jButton66.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton66ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton66);

		jButton63.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton63ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton63);

		jButton64.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton64ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton64);

		jButton65.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton65ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton65);

		jButton67.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton67ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton67);

		jButton68.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton68ActionPerformed(evt);
			}
		});
		jInternalFrame2.getContentPane().add(jButton68);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jSeparator2)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 149,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108,
										Short.MAX_VALUE)
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 202,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(121, 121, 121)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup()
												.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(
												jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGap(33, 33, 33))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
										.addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 374,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(28, 28, 28))))
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(20, 20, 20)
								.addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, 374,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(405, Short.MAX_VALUE))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGroup(layout.createSequentialGroup().addContainerGap()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
						.addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 393,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(20, 20, 20))
				.addGroup(
						layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addContainerGap(158, Short.MAX_VALUE)
												.addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE,
														393, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(21, 21, 21))));

		pack();
	}// </editor-fold>

	public static void doFunction(JButton j1, int i) {

		Icon icon = new ImageIcon(
				"C:\\Users\\vansh\\Documents\\NetBeansProjects\\JavaApplication14\\src\\javaapplication14\\image1.jpg");
		Icon ic = new ImageIcon("C:\\Users\\vansh\\Desktop\\cross.JPG");

		if (i == 1) {

			j1.setIcon(icon);
			Player.Player2_Score++;
			JOptionPane.showMessageDialog(jInternalFrame2, "  I M Pro Dude:");
			 
			
		}

		else
			j1.setIcon(ic);
			//j1.setEnabled(false);

	}

	private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton37, 1);
	}

	private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton38, 0);
		// TODO add your handling code here:
	}
	
	

	private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton39, 0);
	}

	private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton40, 0);
	}

	private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton41, 0);
	}

	private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton42, 1);
	}

	private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton43, 0);
		// TODO add your handling code here:
	}

	private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton44, 1);
	}

	private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton45, 0);
	}

	private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton46, 1);
	}

	private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton47, 1);
	}

	private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton48, 0);
	}

	private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton49, 1);
	}

	private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton50, 0);
	}

	private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton51, 1);
	}

	private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton52, 1);
	}

	private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton53, 0);
	}

	private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton54, 1);
	}

	private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {
		 doFunction(jButton55, 1);
	}

	private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton56, 0);
		// TODO add your handling code here:
	}

	private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton57, 0);
		
	}

	private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton58, 1); // TODO add your handling code here:
	}

	private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {

		doFunction(jButton59, 0);
	}

	private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton60, 0);
	}

	private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton61, 0); // TODO add your handling code here:
	}

	private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {

		doFunction(jButton62, 0);
	}

	private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {

		doFunction(jButton63, 0); // TODO add your handling code here:
	}

	private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {

		doFunction(jButton64, 0); // TODO add your handling code here:
	}

	private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton65, 0);}

	private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton66, 1);
	}

	private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton67, 1);
	}

	private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {
		doFunction(jButton68, 1);
	}

	 

	static ArrayList<Integer> pt = new ArrayList<Integer>();

	private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton70);

	}
	private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {
		 buttonClicked(jButton69);
	}
		
		
		
	 

	public static void mainHandler()   {

		int coin = (int) (Math.round(Math.random()));
		if (coin == 0) {
			JOptionPane.showMessageDialog(jInternalFrame2, "  HA! ITs my turn LOOSER:");
			randomGenerator();
			scoreUpdate();
			
			 
		} else
			JOptionPane.showMessageDialog(jInternalFrame2, "  Go On Start your turn. Dont waste my time: ");
		  
	}
	
	public  static void scoreUpdate() {
		
		jLabel5.setText(""+Player.getPlayer1_Score());
		jLabel6.setText(""+ Player.getPlayer2_Score());
		
	}
	
static int pressed = 0;
	public static int buttonClicked(JButton j1) {
        pressed++;
		int value = (int) (Math.round(Math.random()));
		j1.setIcon(getShip(value));
		pt.add(1);

		if (value == 1) {



			JOptionPane.showMessageDialog(jInternalFrame2, "OOPS !  You missed: ");
			j1.setEnabled(false);
			scoreUpdate();

			JOptionPane.showMessageDialog(jInternalFrame2, "Hmm ! its my turn now: ");
			randomGenerator();
			scoreUpdate();
			return value;

		} else
			JOptionPane.showMessageDialog(jInternalFrame2, "Wohoo !  Nice Shot: ");
		JOptionPane.showMessageDialog(jInternalFrame2, "Watchout ! its my turn now: ");
		   Player.Player1_Score++;
		   scoreUpdate();
		   randomGenerator();
		   scoreUpdate();
		return value;

	}

	private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton71);
		// TODO add your handling code here:
	}

	private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton72);
		// TODO add your handling code here:
	}

	private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton73);
		// TODO add your handling code here:
	}

	private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton74);
		// TODO add your handling code here:
	}

	private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton75);
		// TODO add your handling code here:
	}

	private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton76);
		// TODO add your handling code here:
	}

	private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton77);
		// TODO add your handling code here:
	}

	private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton78);
		// TODO add your handling code here:
		// jButton78.setIcon(getShip());
	}

	private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton79);
		// jButton79.setIcon(getNull());
		// TODO add your handling code here:
	}

	private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton80);
		// TODO add your handling code here:
	}

	private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton81);
		// TODO add your handling code here:
	}

	private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton82);
		// TODO add your handling code here:
	}

	private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton83);
		// TODO add your handling code here:
	}

	private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton84);
		// TODO add your handling code here:
	}

	private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton85);
		// TODO add your handling code here:
	}

	private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton86);
		// TODO add your handling code here:
	}

	private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton87);// TODO add your handling code here:
	}

	private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton88);
		// TODO add your handling code here:
	}

	private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton89);
		// TODO add your handling code here:
	}

	private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton90);
		// TODO add your handling code here:
	}

	private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton91);
		// TODO add your handling code here:
	}

	private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton92);
		// TODO add your handling code here:
	}

	private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton93);
		// TODO add your handling code here:
	}

	private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton94);
		// TODO add your handling code here:
	}

	private void jButton95ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton95);
		// TODO add your handling code here:
	}

	private void jButton96ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton96);
		// TODO add your handling code here:
	}

	private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton97);
		// TODO add your handling code here:
	}

	private void jButton98ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton98);
		// TODO add your handling code here:
	}

	private void jButton99ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton99);
		// TODO add your handling code here:
	}

	private void jButton100ActionPerformed(java.awt.event.ActionEvent evt) {
		buttonClicked(jButton100);
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void start() {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(PlayerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(PlayerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(PlayerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(PlayerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new PlayerUI().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private static javax.swing.JButton jButton37;
	private javax.swing.JButton jButton100;
	private static javax.swing.JButton jButton38;
	private static javax.swing.JButton jButton39;
	private static javax.swing.JButton jButton40;
	private static javax.swing.JButton jButton41;
	private static javax.swing.JButton jButton42;
	private static javax.swing.JButton jButton43;
	private static javax.swing.JButton jButton44;
	private static javax.swing.JButton jButton45;
	private static javax.swing.JButton jButton46;
	private static javax.swing.JButton jButton47;
	private static javax.swing.JButton jButton48;
	private static javax.swing.JButton jButton49;
	private static javax.swing.JButton jButton50;
	private static javax.swing.JButton jButton51;
	private static javax.swing.JButton jButton52;
	private static javax.swing.JButton jButton53;
	private static javax.swing.JButton jButton54;
	private static javax.swing.JButton jButton55;
	private static javax.swing.JButton jButton56;
	private static javax.swing.JButton jButton57;
	private static javax.swing.JButton jButton58;
	private static javax.swing.JButton jButton59;
	private static javax.swing.JButton jButton60;
	private static javax.swing.JButton jButton61;
	private static javax.swing.JButton jButton62;
	private static javax.swing.JButton jButton63;
	private static javax.swing.JButton jButton64;
	private static javax.swing.JButton jButton65;
	private static javax.swing.JButton jButton66;
	private static javax.swing.JButton jButton67;
	private static javax.swing.JButton jButton68;
	private static javax.swing.JButton jButton69;
	private javax.swing.JButton jButton70;
	private javax.swing.JButton jButton71;
	private javax.swing.JButton jButton72;
	private javax.swing.JButton jButton73;
	private javax.swing.JButton jButton74;
	private javax.swing.JButton jButton75;
	private javax.swing.JButton jButton76;
	private javax.swing.JButton jButton77;
	private javax.swing.JButton jButton78;
	private javax.swing.JButton jButton79;
	private javax.swing.JButton jButton80;
	private javax.swing.JButton jButton81;
	private javax.swing.JButton jButton82;
	private javax.swing.JButton jButton83;
	private javax.swing.JButton jButton84;
	private javax.swing.JButton jButton85;
	private javax.swing.JButton jButton86;
	private javax.swing.JButton jButton87;
	private javax.swing.JButton jButton88;
	private javax.swing.JButton jButton89;
	private javax.swing.JButton jButton90;
	private javax.swing.JButton jButton91;
	private javax.swing.JButton jButton92;
	private javax.swing.JButton jButton93;
	private javax.swing.JButton jButton94;
	private javax.swing.JButton jButton95;
	private javax.swing.JButton jButton96;
	private javax.swing.JButton jButton97;
	private javax.swing.JButton jButton98;
	private javax.swing.JButton jButton99;
	public static javax.swing.JInternalFrame jInternalFrame1;
	public static javax.swing.JInternalFrame jInternalFrame2;
	private  static javax.swing.JLabel jLabel1;
	private static javax.swing.JLabel jLabel2;
	private static javax.swing.JLabel jLabel3;
	private static javax.swing.JLabel jLabel4;
	private static javax.swing.JLabel jLabel5;
	private static javax.swing.JLabel jLabel6;
	private  static javax.swing.JPanel jPanel1;
	private javax.swing.JSeparator jSeparator2;
	// End of variables declaration

	public int randomValue() {

		int rand = (int) (Math.random() * 1) + 0;
		return rand;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String f = e.paramString(); // TODO Auto-generated method stub
		System.out.println(f);

	}
}
