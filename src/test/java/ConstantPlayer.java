abstract class ConstantPlayer implements Movable {

    private int speed;

    public ConstantPlayer(int speed) {
        this.speed = speed;

    }

    public int getSpeed() {
        return speed;
    }

}
