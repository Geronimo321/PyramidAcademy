import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class GameTest {
    Game game;
    @BeforeEach
    void setUp() {
        game = new Game("George");
    }
    @Test
    void getName(){
        assertEquals("George", game.getName(), "getName failed");
    }

    @Test
    void getAttempts(){
        assertEquals(0, game.getAttempts(), "getAttempts failed");
    }


    @AfterEach
    void tearDown() {
    }

}