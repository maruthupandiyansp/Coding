/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analysisofalgorthims.DiceGame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author maruthupandiyansp
 */
public class DiceGame {

    Random randomObj = new Random();
    Scanner fromConsole = new Scanner(System.in);
    int rollVal = 0;
    int noOfPlayers = 0;
    String want2Play = "N";

    /*public void main(String[] args) {
        // TODO Auto-generated method stub
        // rollDice ();
        gameController();
    }*/

    public void gameController() {
        startGame();
        boolean isGameOver = false;
        //int iWinnerIs = 0;
        int[] myPlayerPoints;
        if (want2Play.equalsIgnoreCase("Y")) {
            getNoOfPlayers();
            if (noOfPlayers > 0) {
                myPlayerPoints = new int[noOfPlayers];

                // Run the loop for each player.
                do {
                    for (int i = 0; i < noOfPlayers; i++) {
                        int temp = myPlayerPoints[i];
                        myPlayerPoints[i] += startRolling(i + 1, temp);
                        System.out.println("Points for Player[" + (i + 1) + "] is: " + myPlayerPoints[i]);
                        // System.out.println("rollVal: " + rollVal);
                        if (myPlayerPoints[i] > 9) {
                            System.out.println("You Winner!!!");
                            isGameOver = true;
                            //iWinnerIs = i;
                            break;
                        }
                    }
                } while (!isGameOver);

                // Print Player points
                for (int j = 0; j < noOfPlayers; j++) {
                    System.out.println("Points for Player[" + (j + 1) + "] is: " + myPlayerPoints[j]);
                }
            } else {
                System.out.println("Game Ending... At least 1 Player should be there to play the game...");
            }
        } else {
            System.out.println("Thank you checking!!!");
            want2Play = "N";
        }
    }

    public void startGame() {
        try {
            System.out.println("Do you want to play Dice? Y/N");
            want2Play = fromConsole.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getNoOfPlayers() {
        String retry = "N";

        try {
            do {
                System.out.println("How many Players do you want to play? Max 4: ");
                noOfPlayers = fromConsole.nextInt();
                if (noOfPlayers == 0) {
                    System.out.println("Should play at least 1 player. Do you want to retry? Y/N");
                    retry = fromConsole.next();
                }
            } while (noOfPlayers < 1 && retry.equalsIgnoreCase("Y"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
	 * R = Roll; H = Hold; any other Key = Quit RollVal == 1 then lose all the
	 * points on current roll rollVal = -1, when Quit the Game
     */
    public int startRolling(int iPlayer, int iCurrentScore) {
        String want2Roll;
        int rollSum = 0;
        rollVal = 0;
        try {
            do {
                System.out.println();
                System.out.println(
                        "Start Rolling for Player[" + iPlayer + "] & current Score is: " + (iCurrentScore + rollSum));
                System.out.println(" \"R\" to Roll, \"H\" to hold & anyother key to Quit: ");
                want2Roll = fromConsole.next();
                if (want2Roll != null && want2Roll.equalsIgnoreCase("R")) {
                    rollVal = rollDice();
                } else if (want2Roll != null && want2Roll.equalsIgnoreCase("H")) {
                    break;
                } else {
                    rollVal = -1;
                    break;
                }
                rollSum += rollVal;

            } while (rollVal != 1 && (rollSum + iCurrentScore) < 10);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (rollVal == 1) {
            rollSum = 0;
        }

        return rollSum;
    }

    public int rollDice() {
        int rollValue = randomObj.nextInt(6) + 1;
        System.out.println(rollValue);
        return rollValue;
    }

}
