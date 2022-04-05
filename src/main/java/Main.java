public class Main {

    public static void main(String[] args) {
        Game game = new Game(false);
        game.isFailed(7);
        System.out.println(game.getIsGreenLight());
        game.getIsGreenLight();
        game.setIsGreenLight();
        SpeedyGame speedyGame = new SpeedyGame(false, 10);
        speedyGame.isFailed(7);
        System.out.println(speedyGame.getIsGreenLight());
        speedyGame.getMAX_SPEED();
        speedyGame.setMAX_SPEED();


    }


}
