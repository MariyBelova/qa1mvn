import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void shouldFindFailedRedLight() {
        Game game = new Game(false);
        boolean expected = true;
        boolean actual = game.isFailed(7);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindFailedGreenLight() {
        Game game = new Game(true);
        boolean expected = false;
        boolean actual = game.isFailed(7);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindFailedRedLightZeroSpeed() {
        Game game = new Game(false);
        boolean expected = false;
        boolean actual = game.isFailed(0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindFailedGreenLightZeroSpeed() {
        Game game = new Game(true);
        boolean expected = false;
        boolean actual = game.isFailed(0);
        Assertions.assertEquals(expected, actual);
    }

}



