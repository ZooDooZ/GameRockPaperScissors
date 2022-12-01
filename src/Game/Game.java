package Game;

import java.util.InputMismatchException;

public class Game {

    private int player1Points;
    private int player2Points;
    private int computerPoints;
    private Input input = new Input();
    private Computer computer = new Computer();

    // method responsible for start game - include other methods
    public void startGame() {
        Display.printStartLabel();
        playerChooseFromMenu();
    }

    // method responsible for player choose in menu
    public void playerChooseFromMenu() {
        boolean isGoodChoice = true;
        int playerChoose = 0;

        while (isGoodChoice) {
            try {
                Display.printMenu();
                playerChoose = input.playerSelectionNumberFromMenu();
                if (playerChoose == 1) {
                    Display.printInformationAboutGame();
                } else if (playerChoose == 2) {
                    logicGameWithComputer();
                    Display.printEndOfGameWithComputer(player1Points,computerPoints);
                    isGoodChoice = input.askingPlayerWantPlayAgain();
                } else if (playerChoose == 3) {
                    logicGameWithOtherPlayer();
                    isGoodChoice = input.askingPlayerWantPlayAgain();
                } else if (playerChoose == 4) {
                    Display.printInformationAboutGameAuthor();
                } else if (playerChoose == 5) {
                    Display.printMessage("Thanks for coming over here!\n" +
                            "See you next time!");
                    System.exit(0);
                } else {
                    Display.printMessage("Wrong selection!");
                }
            } catch (InputMismatchException e) {
                Display.printMessage("Wrong selection!");
            }
            input.scanner.nextLine();
        }
        Display.printMessage("Thanks for coming over here!\n" +
                "See you next time!");
        System.exit(0);
    }

    // method responsible for game logic with computer, compare numbers player and computer
    public void logicGameWithComputer() {
        player1Points = 0;

        Display.printMessage("\n====== START GAME - PLAYER vs COMPUTER ======");
        do {
            int computerChoose = computer.getChooseFromComputer();
            int player1Choose = input.player1Choose();

            if (player1Choose == 1 && computerChoose == 3
                    || player1Choose == 2 && computerChoose == 1
                    || player1Choose == 3 && computerChoose == 2) {
                Display.printMessage("\nPLAYER 1: " + input.getPlayer1Symbol() +
                        " vs " + computer.getSymbolFromComputer(computerChoose) + " :COMPUTER");
                Display.printMessage("Point for PLAYER 1!");
                player1Points++;
            } else if (player1Choose == 2 && computerChoose == 3
                    || player1Choose == 1 && computerChoose == 2
                    || player1Choose == 3 && computerChoose == 1) {
                Display.printMessage("\nPLAYER 1: " + input.getPlayer1Symbol() +
                        " vs " + computer.getSymbolFromComputer(computerChoose) + " :COMPUTER");
                Display.printMessage("Point for COMPUTER");
                computerPoints++;
            } else {
                Display.printMessage("PLAYER 1: " + input.getPlayer1Symbol() +
                        " vs " + computer.getSymbolFromComputer(computerChoose) + " :COMPUTER");
                Display.printMessage("DRAW! No point!");
            }
            Display.printMessage("\n==== SCORE BOARD ====" +
                    "\nPlayer 1: " + player1Points +
                    "\nComputer: " + computerPoints);
        } while (player1Points != 3 && computerPoints != 3);
    }

    // method responsible for game logic with other player, compare numbers player1 and player2
    public void logicGameWithOtherPlayer() {
        player1Points = 0;

        Display.printMessage("\n====== START GAME - PLAYER vs PLAYER ======");
        do {
            int player1Choose = input.player1Choose();
            int player2Choose = input.player2Choose();

            if (player1Choose == 1 && player2Choose == 3
                    || player1Choose == 2 && player2Choose == 1
                    || player1Choose == 3 && player2Choose == 2) {
                Display.printMessage("\nPLAYER 1: " + input.getPlayer1Symbol() +
                        " vs " + input.getPlayer2Symbol() + " :PLAYER 2");
                Display.printMessage("Point for PLAYER 1!");
                player1Points++;
            } else if (player1Choose == 2 && player2Choose == 3
                    || player1Choose == 1 && player2Choose == 2
                    || player1Choose == 3 && player2Choose == 1) {
                Display.printMessage("\nPLAYER 1: " + input.getPlayer1Symbol() +
                        " vs " + input.getPlayer2Symbol() + " :PLAYER 2");
                Display.printMessage("Point for PLAYER 2!");
                player2Points++;
            } else {
                Display.printMessage("PLAYER 1: " + input.getPlayer1Symbol() +
                        " vs " + input.getPlayer2Symbol() + " :PLAYER 2");
                Display.printMessage("DRAW! No point!");
            }
            Display.printEndOfGameWithOtherPlayer(player1Points, player2Points);
        } while (player1Points != 3 && player2Points != 3);
    }
}
