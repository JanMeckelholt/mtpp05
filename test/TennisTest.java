import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TennisTest {
    @Test
    public void testSomething() {
    Player player = new Player ("Klaus", 0);
        Assertions.assertEquals(player.getName(), "Klaus");
        Assertions.assertNotEquals(player.getName(), "Peter");

    }
}