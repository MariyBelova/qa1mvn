import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameManagerTest {
    @Test
    public void shouldFindСntAttemptGreenLightGame() {
        Game game = new Game(true);
        GameManager gameManager = new GameManager(game);
        int[] speeds = {3, 7, 0, 5, 0};
        int expected = 5;
        int actual = gameManager.cntAttempt(speeds);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindСntAttemptRedLightGame() {
        Game game = new Game(false);
        GameManager gameManager = new GameManager(game);
        int[] speeds = {3, 7, 0, 5, 0};
        int expected = 2;
        int actual = gameManager.cntAttempt(speeds);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindСntAttemptRedLightGameZeroSpeed() {
        Game game = new Game(false);
        GameManager gameManager = new GameManager(game);
        int[] speeds = {0};
        int expected = 1;
        int actual = gameManager.cntAttempt(speeds);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindСntAttemptGreenLightGameZeroSpeed() {
        Game game = new Game(true);
        GameManager gameManager = new GameManager(game);
        int[] speeds = {0};
        int expected = 1;
        int actual = gameManager.cntAttempt(speeds);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindСntAttemptGreenLightSpeedySpeedyGame() {
        Game game = new SpeedyGame(true, 10);
        GameManager gameManager = new GameManager(game);
        int[] speeds = {3, 7, 0, 10, 11};
        int expected = 5;
        int actual = gameManager.cntAttempt(speeds);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindСntAttemptRedLightSpeedySpeedyGame() {
        Game game = new SpeedyGame(false, 10);
        GameManager gameManager = new GameManager(game);
        int[] speeds = {3, 7, 0, 10, 11};
        int expected = 4;
        int actual = gameManager.cntAttempt(speeds);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindСntAttemptGreenLightSpeedyGameZeroMaxSpeed() {
        Game game = new SpeedyGame(true, 0);
        GameManager gameManager = new GameManager(game);
        int[] speeds = {3, 7, 0, 5, 0};
        int expected = 5;
        int actual = gameManager.cntAttempt(speeds);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindСntAttemptRedLightSpeedyGameZeroMaxSpeed() {
        Game game = new SpeedyGame(false, 0);
        GameManager gameManager = new GameManager(game);
        int[] speeds = {3, 7, 0, 5, 0};
        int expected = 2;
        int actual = gameManager.cntAttempt(speeds);
        Assertions.assertEquals(expected, actual);
    }
}
