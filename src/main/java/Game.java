public class Game {
    protected boolean isGreenLight;

    public Game(boolean isGreenLight) {
        this.isGreenLight = isGreenLight;
    }

    public boolean getIsGreenLight() {
        return isGreenLight;
    }

    public boolean setIsGreenLight() {
        return isGreenLight;
    }

    public boolean isFailed(int speed) {
        if (isGreenLight == false && speed > 0) {
            return true;
        } else {
            return false;
        }

    }
}


