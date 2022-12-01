package Game;

import java.io.IOException;

public class Display {

    private static Input input = new Input();

    // method responsible for print first screen of the game
    public static void printStartLabel() {
        System.out.println("\n===========ROCK-PAPER-SCISSORS GAME===========");
        System.out.println("Hello and welcome to the game from childhood ;)\n" +
                "Do you remeber this game? ;)");
    }

    // method responsible for print menu
    public static void printMenu() {
        System.out.println("\n================MENU================");
        System.out.println("1. Information about game.");
        System.out.println("2. Start game with Computer");
        System.out.println("3. Start game with other player.");
        System.out.println("4. Information about game author.");
        System.out.println("5. Exit game.");
        System.out.println("====================================");
    }
    // method responsible for print message
    public static void printMessage(String message) {
        System.out.println(message);
    }

    // method responsible for print rules of the game
    public static void printInformationAboutGame() {
        System.out.println("RULES of Rock-Paper-Scissors\n");
        System.out.println("Rules are simple! No matter if you playing with computer or with other player.\n" +
                        "In game you have three option to choose:\n" +
                        "- 'rock'\n" +
                        "- 'paper'\n" +
                        "- 'scissors'\n"+
                "When your choise is:\n" +
                        "- 'rock' you win with 'scissors'\n" +
                        "- 'scissors' you win with 'paper'\n" +
                        "- 'paper' you win with 'rock'\n" +
                "After one compare when you win, you will get 1 point.\n" +
                "The goal of the game is win three times and collect 3 points.\n" +
                "Easy? Of course it easy!!!");
    }

    // method responsible for print information about game author
    public static void printInformationAboutGameAuthor(){
        System.out.println("Author of the game: Filip Sokolowski - Java Developer");
    }

    public static void printEndOfGameWithComputer(int player1Points, int computerPoints){
        System.out.println("-----------------------------------");
        System.out.println("             GAME RESULT           ");
        System.out.println("PLAYER: " + player1Points);
        System.out.println("COMPUTER: " + computerPoints);
        System.out.println("-----------------------------------");
        if(player1Points > computerPoints){
            System.out.println("\n****************************************");
            System.out.println("  PLAYER WIN !!! - CONGRATULATIONS !!!");
            System.out.println("****************************************");
        } else {
            System.out.println("\n****************************************");
            System.out.println("  COMPUTER WIN !!! - Try again next time !");
            System.out.println("****************************************");
        }
    }

    public static void printEndOfGameWithOtherPlayer(int player1Points, int player2Points){
        System.out.println("-----------------------------------");
        System.out.println("             GAME RESULT           ");
        System.out.println("PLAYER 1: " + player1Points);
        System.out.println("PLAYER 2: " + player2Points);
        System.out.println("-----------------------------------");
        while(player1Points == 3 || player2Points == 3) {
            if (player1Points > player2Points) {
                System.out.println("\n****************************************");
                System.out.println("  PLAYER 1 WIN !!! - CONGRATULATIONS !!!");
                System.out.println("****************************************");
                break;
            } else {
                System.out.println("\n****************************************");
                System.out.println("  PLAYER 2 WIN !!! - CONGRATULATIONS !!!");
                System.out.println("****************************************");
                break;
            }
        }
    }
}
