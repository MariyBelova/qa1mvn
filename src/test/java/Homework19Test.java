import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Homework19Test {
    @Test
    public void shouldFindNamesWinnerGreenLight() {
        String[] speedPlayers = {"Иван 15", "Мария 7", "Дмитрий 12"};
        Main.isGreenLight = true;
        Main.MAX_SPEED = 10;
        String[] expected = {"Иван", "Мария", "Дмитрий"};
        String[] actual = Homework19.speedWin(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNamesWinnerRedLight() {
        String[] speedPlayers = {"Иван 15", "Мария 7", "Дмитрий 12"};
        Main.isGreenLight = false;
        Main.MAX_SPEED = 10;
        String[] expected = {"Мария"};
        String[] actual = Homework19.speedWin(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNamesWinnerGreenLightZeroSpeed() {
        String[] speedPlayers = {"Иван 0", "Мария 0", "Дмитрий 0"};
        Main.isGreenLight = true;
        Main.MAX_SPEED = 10;
        String[] expected = {"Иван", "Мария", "Дмитрий"};
        String[] actual = Homework19.speedWin(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNamesWinnerRedLightZeroSpeed() {
        String[] speedPlayers = {"Иван 0", "Мария 0", "Дмитрий 0"};
        Main.isGreenLight = false;
        Main.MAX_SPEED = 10;
        String[] expected = {"Иван", "Мария", "Дмитрий"};
        String[] actual = Homework19.speedWin(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNamesWinnerGreenLightMaxSpeedZero() {
        String[] speedPlayers = {"Иван 0", "Мария 0", "Дмитрий 0"};
        Main.isGreenLight = true;
        Main.MAX_SPEED = 0;
        String[] expected = {"Иван", "Мария", "Дмитрий"};
        String[] actual = Homework19.speedWin(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNamesWinnerRedLightMaxSpeedZero() {
        String[] speedPlayers = {"Иван 0", "Мария 0", "Дмитрий 0"};
        Main.isGreenLight = false;
        Main.MAX_SPEED = 0;
        String[] expected = {"Иван", "Мария", "Дмитрий"};
        String[] actual = Homework19.speedWin(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNamesWinnerRedLightSameSpeed() {
        String[] speedPlayers = {"Иван 7", "Мария 7", "Дмитрий 7"};
        Main.isGreenLight = false;
        Main.MAX_SPEED = 10;
        String[] expected = {"Иван", "Мария", "Дмитрий"};
        String[] actual = Homework19.speedWin(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNamesWinnerRedLightOnePlayer() {
        String[] speedPlayers = {"Иван 7"};
        Main.isGreenLight = false;
        Main.MAX_SPEED = 10;
        String[] expected = {"Иван"};
        String[] actual = Homework19.speedWin(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNamesWinnerGreenLightOnePlayer() {
        String[] speedPlayers = {"Иван 7"};
        Main.isGreenLight = true;
        Main.MAX_SPEED = 10;
        String[] expected = {"Иван"};
        String[] actual = Homework19.speedWin(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }
}
