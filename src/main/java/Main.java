public class Main {

    public static void main(String[] args) {
        Game game = new Game(false);
        game.isFailed(7);
        System.out.println(game.getIsGreenLight());
        game.getIsGreenLight();
        game.setIsGreenLight();
        SpeedyGame speedyGame = new SpeedyGame(false, 10);
        speedyGame.isFailed(7);

        Movable player = new FastPlayer(10, 5);
        player.getSpeed(); // 10
        System.out.println(player.getSpeed());
        player.getSpeed(); // 15
        System.out.println(player.getSpeed());
        player.getSpeed(); // 20
        System.out.println(player.getSpeed());
        player.getSpeed(); // 25
        System.out.println(player.getSpeed());

    }


}
