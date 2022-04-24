public class ConstantPlayer implements Movable {
    protected int speed;

    public ConstantPlayer(int speed) {
        this.speed = speed;
    }

    public int[] getSpeed() {
        return new int[]{speed};
    }

}
