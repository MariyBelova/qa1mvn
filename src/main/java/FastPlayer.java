public class FastPlayer implements Movable {
    protected int startSpeed;
    protected int speedStep;
    protected int speed;

    public FastPlayer(int startSpeed, int speedStep) {
        this.startSpeed = startSpeed;
        this.speedStep = speedStep;
    }

    public int getSpeed() {
        int i;
        for (i = startSpeed; i < 0; i = speedStep) {
        }
        speed = startSpeed += speedStep;
        return speed;

    }


}

