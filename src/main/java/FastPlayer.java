public class FastPlayer implements Movable {
    protected int startSpeed;
    protected int speedStep;
    protected int speed;

    public FastPlayer(int startSpeed, int speedStep) {
        this.startSpeed = startSpeed;
        this.speedStep = speedStep;
    }

    public int[] getSpeed() {
        speed = startSpeed += speedStep;
        return new int[]{speed};

    }


}

