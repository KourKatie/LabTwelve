/**
 * Created by Katie on 7/25/2017.
 */

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class RoshamboApp {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        firstPlayer firstPlayer = new firstPlayer();
        secondPlayer secondPlayer = new secondPlayer();

        String userName = "";
        String playerChoice = "";
        String opponent = "";
        String firstPlayerChoice = "";
        String secondPlayerChoice = "";
        String playAgain = "";

        System.out.println("Welcome to Rock, Paper, Scissors!");

        System.out.print("Please enter your name: ");
        userName = scnr.next();

        System.out.println("Welcome " + userName + "!");

        do {
            System.out.print("Choose your opponent (Player one or Player two):");
            opponent = scnr.next();

            System.out.print("Rock, Paper, or Scissors (r/p/s)? ");
            playerChoice = scnr.next();

            playerChoice = getPlayerChoice(playerChoice);

            if (opponent.equalsIgnoreCase("one")) {
                firstPlayerChoice = firstPlayer.generateRoshambo();
                System.out.println(firstPlayerChoice);
            }

            if (opponent.equalsIgnoreCase("two")) {
                secondPlayerChoice = secondPlayer.generateRoshambo();
                System.out.println(secondPlayerChoice);
            }

            getResult(playerChoice, firstPlayerChoice, secondPlayerChoice);

            System.out.print("Do you want to play again (y/n)?");
            playAgain = scnr.next();
            scnr.nextLine();

        } while(playAgain.equalsIgnoreCase("y"));

        System.out.println("Thanks for playing!");

    }

    private static String getPlayerChoice(String playerChoice) {
        if (playerChoice.contains("r")) {
            playerChoice = "ROCK";
            System.out.println(Roshambo.ROCK);
        }
        if (playerChoice.contains("s")) {
            playerChoice = "SCISSORS";
            System.out.println(Roshambo.SCISSORS);
        }
        if (playerChoice.contains("p")) {
            playerChoice = "PAPER";
            System.out.println(Roshambo.PAPER);
        }
        return playerChoice;
    }

    private static void getResult(String playerChoice, String firstPlayerChoice, String secondPlayerChoice) {
        if (playerChoice.equalsIgnoreCase(firstPlayerChoice) || playerChoice.equalsIgnoreCase(secondPlayerChoice)) {
            System.out.println("Tie!");
        }
        else if (playerChoice.equals("PAPER") && (firstPlayerChoice.equals("SCISSORS")
                || secondPlayerChoice.equals("SCISSORS"))) {
            System.out.println("Opponent wins!");
        }
        else if (playerChoice.equals("PAPER") && (firstPlayerChoice.equals("ROCK")
                || secondPlayerChoice.equals("ROCK"))) {
            System.out.println("You Won!");
        }
        else if (playerChoice.equalsIgnoreCase("SCISSORS") && (firstPlayerChoice.equals("ROCK")
                || secondPlayerChoice.equals("ROCK"))) {
            System.out.println("Opponent wins!");
        }
        else if ((playerChoice.equalsIgnoreCase("SCISSORS") && (firstPlayerChoice.equals("PAPER")
                || secondPlayerChoice.equals("PAPER")))) {
            System.out.println("You won!");
        }
        else if (playerChoice.equalsIgnoreCase("ROCK") && (firstPlayerChoice.equals("PAPER")
                || secondPlayerChoice.equals("PAPER"))) {
            System.out.println("Opponent wins!");
        }
        else if (playerChoice.equalsIgnoreCase("ROCK") && (firstPlayerChoice.equals("SCISSORS")
                || secondPlayerChoice.equals("SCISSORS"))) {
            System.out.println("You won!");
        }
    }
}
