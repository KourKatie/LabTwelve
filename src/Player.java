/**
 * Created by Katie on 7/25/2017.
 */
abstract class Player {
    private String playerName = "";
    private String roshamboValue = "";

    public String getRoshamboValue() {
        return roshamboValue;
    }

    public void setRoshamboValue(String roshamboValue) {
        this.roshamboValue = roshamboValue;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    abstract String generateRoshambo();
}
