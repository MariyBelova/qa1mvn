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

    public int loser(Movable p1, Movable p2, int rounds) {
        if (cntAttempt(p1.getSpeed()) > cntAttempt(p2.getSpeed())) {
            return -1;
        }
        if (cntAttempt(p1.getSpeed()) < cntAttempt(p2.getSpeed()))
            return 1;
        if (cntAttempt(p1.getSpeed()) == cntAttempt(p2.getSpeed()))
            return 0;
        return rounds;

    }

}








