/**
 * Created by Katie on 7/26/2017.
 */
import java.util.Random;

public class secondPlayer extends Player {

    @Override
    String generateRoshambo() {
        Random randGen = new Random();

        int answerTwo = randGen.nextInt(3) + 1;
        String playerTwoChoice = "";

        if (answerTwo == 1) {
            playerTwoChoice = Roshambo.ROCK.toString();
        }
        if (answerTwo == 2) {
            playerTwoChoice = Roshambo.PAPER.toString();
        }
        if (answerTwo == 3) {
            playerTwoChoice = Roshambo.SCISSORS.toString();
        }

        return playerTwoChoice;
    }
}
