public class SpeedyGame extends Game {
    protected int MAX_SPEED;

    public int getMAX_SPEED() {
        return MAX_SPEED;
    }

    public int setMAX_SPEED() {
        return MAX_SPEED;
    }

    public SpeedyGame(boolean isGreenLight, int MAX_SPEED) {
        super(isGreenLight);
        this.MAX_SPEED = MAX_SPEED;
    }

    @Override
    public boolean isFailed(int speed) {
        if (isGreenLight == false && speed > MAX_SPEED) {
            return false;
        } else {
            return true;
        }

    }
}
