public class GameManager {
    protected Game game;

    public GameManager(Game game) {
        this.game = game;
    }

    public int cntAttempt(int[] speeds) {
        int cnt = 0;
        for (int speed : speeds) {
            if (!game.isFailed(speed)) {
                cnt++;
            }
        }
        return cnt;
    }

}






