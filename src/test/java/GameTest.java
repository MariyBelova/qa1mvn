import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void shouldFindCntLosers() {
        int[] speedOfPlayers = new int[]{12, 7, 15};
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
        int[] speedOfPlayers = new int[]{15, 15, 15};
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
        int[] speedOfPlayers = new int[]{12, 0, 15};
        int[] expected = new int[]{12, 15};
        int[] actual = Game.loser(speedOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedOfLosersSame() {
        int[] speedOfPlayers = new int[]{15, 15, 15};
        int[] expected = new int[]{15, 15, 15};
        int[] actual = Game.loser(speedOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedOfWinners() {
        int[] speedOfPlayers = new int[]{12, 7, 15};
        int[] expected = new int[]{7};
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

    @Test
    public void shouldFindSpeedOfWinnersMaxSpeedRedLight() {
        int[] speedOfPlayers = new int[]{12, 7, 10};
        Main.isGreenLight = false;
        Main.MAX_SPEED = 10;
        int[] expected = new int[]{7, 10};
        int[] actual = Game.winner(speedOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedOfWinnersMaxSpeedZeroRedLight() {
        int[] speedOfPlayers = new int[]{12, 0, 15};
        Main.isGreenLight = false;
        Main.MAX_SPEED = 0;
        int[] expected = new int[]{0};
        int[] actual = Game.winner(speedOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedOfLosersMaxSpeedZeroRedLight() {
        int[] speedOfPlayers = new int[]{12, 0, 15};
        Main.isGreenLight = false;
        Main.MAX_SPEED = 0;
        int[] expected = new int[]{12, 15};
        int[] actual = Game.loser(speedOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedOfLosersMaxSpeedRedLight() {
        int[] speedOfPlayers = new int[]{12, 7, 10};
        Main.isGreenLight = false;
        Main.MAX_SPEED = 10;
        int[] expected = new int[]{12};
        int[] actual = Game.loser(speedOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedOfWinnersMaxSpeedGreenLight() {
        int[] speedOfPlayers = new int[]{12, 7, 10};
        Main.isGreenLight = true;
        Main.MAX_SPEED = 10;
        int[] expected = new int[]{12, 7, 10};
        int[] actual = Game.winner(speedOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedOfWinnersMaxSpeedZeroGreenLight() {
        int[] speedOfPlayers = new int[]{12, 0, 15};
        Main.isGreenLight = true;
        Main.MAX_SPEED = 0;
        int[] expected = new int[]{12, 0, 15};
        int[] actual = Game.winner(speedOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedOfLosersMaxSpeedZeroGreenLight() {
        int[] speedOfPlayers = new int[]{12, 0, 15};
        Main.isGreenLight = true;
        Main.MAX_SPEED = 0;
        int[] expected = new int[]{};
        int[] actual = Game.loser(speedOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedOfLosersMaxSpeedGreenLight() {
        int[] speedOfPlayers = new int[]{12, 7, 10};
        Main.isGreenLight = true;
        Main.MAX_SPEED = 10;
        int[] expected = new int[]{};
        int[] actual = Game.loser(speedOfPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }
}



