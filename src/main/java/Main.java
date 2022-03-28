import java.util.Arrays;

public class Main {
    public static boolean isGreenLight = false;
    public static int MAX_SPEED = 10;

    public static void main(String[] args) {

        int[] speedOfPlayers = {15, 7, 12};
        System.out.println("Количество выбывших игроков " + Game.cnt(speedOfPlayers));
        int[] losers1 = Game.loser(speedOfPlayers);
        int[] winners1 = Game.winner(speedOfPlayers);
        System.out.println("Скорости выбывших игроков:");
        System.out.println(Arrays.toString(losers1));
        System.out.println("Скорости не выбывших игроков:");
        System.out.println(Arrays.toString(winners1));

        String[] speedPlayers = {"Иван 15", "Мария 7", "Дмитрий 12" };
        String[] winners = Homework19.speedWin(speedPlayers);
        System.out.println("Имена не выбывших игроков:");
        System.out.println(Arrays.toString(winners));
    }


}
