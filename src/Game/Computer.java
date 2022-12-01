package Game;

import java.util.Random;

public class Computer {

    private String computerSymbol;
    private int computerNumber;

    // method return number from random draw - imitation computer choose
    public int getChooseFromComputer() {
        Random random = new Random();
        return this.computerNumber = random.nextInt(1, 4);
    }

    // method return string which is game symbol as like chosen computer number
    public String getSymbolFromComputer(int computerChoose) {

        switch (computerNumber) {
            case 1:
                computerSymbol = "paper";
                break;
            case 2:
                computerSymbol = "scissors";
                break;
            default:
                computerSymbol = "rock";
        }
        return computerSymbol;
    }
}
