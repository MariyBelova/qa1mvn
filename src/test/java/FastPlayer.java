public class FastPlayer implements Movable {
    private int speed;
    private int startSpeed;
    private int speedStep;

    public FastPlayer(int startSpeed, int speedStep) {
        this.startSpeed = startSpeed;
        this.speedStep = speedStep;

    }

    public int getSpeed() {
        return speed = startSpeed + speedStep;
    }


}
