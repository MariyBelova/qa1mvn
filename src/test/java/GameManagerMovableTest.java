import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameManagerMovableTest {
    @Test
    public void shouldFindLoserP1RedLightGame() {
        Game game = new Game(false);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new FastPlayer(5, 5);
        Movable p2 = new ConstantPlayer(0);
        int rounds = 3;
        int expected = -1;
        int actual = gameManager.loser(p1, p2, rounds);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindLoserP1GreenLightGame() {
        Game game = new Game(true);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new FastPlayer(5, 5);
        Movable p2 = new ConstantPlayer(0);
        int rounds = 2;
        int expected = 0;
        int actual = gameManager.loser(p1, p2, rounds);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindLoserP2RedLightGame() {
        Game game = new Game(false);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new FastPlayer(0, 0);
        Movable p2 = new ConstantPlayer(10);
        int rounds = 1;
        int expected = 1;
        int actual = gameManager.loser(p1, p2, rounds);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindLoserP2GreenLightGame() {
        Game game = new Game(true);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new FastPlayer(0, 0);
        Movable p2 = new ConstantPlayer(10);
        int rounds = 1;
        int expected = 0;
        int actual = gameManager.loser(p1, p2, rounds);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAllLoserRedLightGame() {
        Game game = new Game(false);
        GameManager gameManager = new GameManager(game);
        Movable p1 = new FastPlayer(0, 10);
        Movable p2 = new ConstantPlayer(10);
        int rounds = 5;
        int expected = 0;
        int actual = gameManager.loser(p1, p2, rounds);
        Assertions.assertEquals(expected, actual);
    }
}
