package Game;

import java.util.Scanner;

public class Input {

    private String player1Symbol;
    private String player2Symbol;


    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);

    public String getPlayer1Symbol() {
        return player1Symbol;
    }

    public String getPlayer2Symbol() {
        return player2Symbol;
    }

    // method responsible for choose player number which is answer from menu
    public int playerSelectionNumberFromMenu() {
        Display.printMessage("What do you choose?");
        return scanner.nextInt();
    }

    // method responsible for player1 choose (paper, scissors or rock) which is symbol selection in game and return number
    public int player1Choose() {
        int numPlayer1 = 0;
        do {
            Display.printMessage("\nPLAYER 1\nEnter your choose (paper, scissors or rock)?");
            player1Symbol = scanner1.nextLine();
            if (player1Symbol.equalsIgnoreCase("paper")) {
                numPlayer1 = 1;
            } else if (player1Symbol.equalsIgnoreCase("scissors")) {
                numPlayer1 = 2;
            } else if (player1Symbol.equalsIgnoreCase("rock")) {
                numPlayer1 = 3;
            } else {
                Display.printMessage("Wrong selection!");
            }
        } while (!player1Symbol.equals("paper") && !player1Symbol.equals("rock") && !player1Symbol.equals("scissors"));
        return numPlayer1;
    }

    // method responsible for player2 choose (paper, scissors or rock) which is symbol selection in game and return number
    public int player2Choose() {
        int numPlayer2 = 0;
        do {
            Display.printMessage("\nPLAYER 2\nEnter your choose (paper, scissors or rock)?");
            player2Symbol = scanner1.nextLine();
            if (player2Symbol.equalsIgnoreCase("paper")) {
                numPlayer2 = 1;
            } else if (player2Symbol.equalsIgnoreCase("scissors")) {
                numPlayer2 = 2;
            } else if (player2Symbol.equalsIgnoreCase("rock")) {
                numPlayer2 = 3;
            } else {
                Display.printMessage("Wrong selection!");
            }
        } while (!player2Symbol.equals("paper") && !player2Symbol.equals("rock") && !player2Symbol.equals("scissors"));
        return numPlayer2;
    }

    public boolean askingPlayerWantPlayAgain(){
        boolean isPlayerWantAgain = false;
        boolean isWrongAnswer = false;
        Display.printMessage("\nDo you want play again (yes/no)?");
        String answer = scanner2.nextLine();
        do {
            if (answer.equalsIgnoreCase("yes")) {
                isPlayerWantAgain = true;
            } else if (answer.equalsIgnoreCase("no")) {
                isPlayerWantAgain = false;
            } else {
                System.out.println("Wrong answer!");
                isWrongAnswer = true;
            }
        }while (isWrongAnswer);
             return isPlayerWantAgain;
    }
}
