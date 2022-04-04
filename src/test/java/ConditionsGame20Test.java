import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionsGame20Test {
    @Test
    public void shouldFindNamesWinnerRedLightSameSpeed() {
        ConditionsGame20 ConditionsGame20 = new ConditionsGame20(false, 10);
        String[] speedPlayers = {"Иван 7", "Мария 7", "Дмитрий 7"};
        String[] expected = {"Иван", "Мария", "Дмитрий"};
        String[] actual = ConditionsGame20.speedWin(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNamesWinnerRedLight() {
        ConditionsGame20 ConditionsGame20 = new ConditionsGame20(false, 10);
        String[] speedPlayers = {"Иван 15", "Мария 7", "Дмитрий 12"};
        String[] expected = {"Мария"};
        String[] actual = ConditionsGame20.speedWin(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNamesWinnerGreenLightZeroSpeed() {
        ConditionsGame20 ConditionsGame20 = new ConditionsGame20(true, 10);
        String[] speedPlayers = {"Иван 0", "Мария 0", "Дмитрий 0"};
        String[] expected = {"Иван", "Мария", "Дмитрий"};
        String[] actual = ConditionsGame20.speedWin(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNamesWinnerRedLightZeroSpeed() {
        ConditionsGame20 ConditionsGame20 = new ConditionsGame20(false, 10);
        String[] speedPlayers = {"Иван 0", "Мария 0", "Дмитрий 0"};
        String[] expected = {"Иван", "Мария", "Дмитрий"};
        String[] actual = ConditionsGame20.speedWin(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNamesWinnerGreenLightMaxSpeedZero() {
        ConditionsGame20 ConditionsGame20 = new ConditionsGame20(true, 0);
        String[] speedPlayers = {"Иван 0", "Мария 0", "Дмитрий 0"};
        String[] expected = {"Иван", "Мария", "Дмитрий"};
        String[] actual = ConditionsGame20.speedWin(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNamesWinnerRedLightMaxSpeedZero() {
        ConditionsGame20 ConditionsGame20 = new ConditionsGame20(false, 0);
        String[] speedPlayers = {"Иван 0", "Мария 0", "Дмитрий 0"};
        String[] expected = {"Иван", "Мария", "Дмитрий"};
        String[] actual = ConditionsGame20.speedWin(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFindNamesWinnerRedLightOnePlayer() {
        ConditionsGame20 ConditionsGame20 = new ConditionsGame20(false, 10);
        String[] speedPlayers = {"Иван 7"};
        String[] expected = {"Иван"};
        String[] actual = ConditionsGame20.speedWin(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindNamesWinnerGreenLightOnePlayer() {
        ConditionsGame20 ConditionsGame20 = new ConditionsGame20(true, 10);
        String[] speedPlayers = {"Иван 7"};
        String[] expected = {"Иван"};
        String[] actual = ConditionsGame20.speedWin(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }
}

