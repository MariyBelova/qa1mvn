import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {@Test
public void shouldFindCntLosers() {
    int[] speedOfPlayers = new int[]{2, 0, 5};
    int expected = 2;
    int actual = Game.cnt(speedOfPlayers);
    Assertions.assertEquals(expected, actual);
}

    @Test
    public void shouldFindCntLosersZero() {
        int[] speedOfPlayers = new int[]{0, 0, 0};
        int expected = 0;
        int actual = Game.cnt(speedOfPlayers);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindCntLosersSame() {
        int[] speedOfPlayers = new int[]{5, 5, 5};
        int expected = 3;
        int actual = Game.cnt(speedOfPlayers);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindCntLosersMinus() {
        int[] speedOfPlayers = new int[]{-1, -2, -3};
        int expected = 0;
        int actual = Game.cnt(speedOfPlayers);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedOfLosers() {
        int[] speedOfPlayers = new int[]{2, 0, 5};
        int[] expected = new int[]{2, 5};
        int[] actual = Game.loser(speedOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedOfLosersSame() {
        int[] speedOfPlayers = new int[]{5, 5, 5};
        int[] expected = new int[]{5, 5, 5};
        int[] actual = Game.loser(speedOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedOfWinners() {
        int[] speedOfPlayers = new int[]{2, 0, 5};
        int[] expected = new int[]{0};
        int[] actual = Game.winner(speedOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedOfWinnersZero() {
        int[] speedOfPlayers = new int[]{0, 0, 0};
        int[] expected = new int[]{0, 0, 0};
        int[] actual = Game.winner(speedOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }
}

