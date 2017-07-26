/**
 * Created by Katie on 7/25/2017.
 */
public class firstPlayer extends Player {

    @Override
    String generateRoshambo() {
        String answer = Roshambo.ROCK.toString();
        return answer;
    }
}
