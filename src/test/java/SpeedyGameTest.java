import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpeedyGameTest {
    @Test
    public void shouldFindFailedRedLight() {
        SpeedyGame speedyGame = new SpeedyGame(false, 10);
        boolean expected = true;
        boolean actual = speedyGame.isFailed(12);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindFailedGreenLight() {
        SpeedyGame speedyGame = new SpeedyGame(true, 10);
        boolean expected = false;
        boolean actual = speedyGame.isFailed(12);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindFailedRedLightZeroMaxSpeed() {
        SpeedyGame speedyGame = new SpeedyGame(false, 0);
        boolean expected = true;
        boolean actual = speedyGame.isFailed(12);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindFailedGreenLightZeroSpeed() {
        SpeedyGame speedyGame = new SpeedyGame(true, 10);
        boolean expected = false;
        boolean actual = speedyGame.isFailed(0);
        Assertions.assertEquals(expected, actual);
    }
}
