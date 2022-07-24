import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.*;

class dragonTest {
    static final String BADDRAGON = "You approach the cave...\n" +
            "It is dark and spooky\n" +
            "A large dragon jumps out in front of you! He opens his jaws and...\n" +
            "Gobbles you down in one bite!";
    static final String GOODDRAGON = "You approach the cave...\n" +
            "It is dark and spooky\n" +
            "A large dragon sits upon a mound of gold.\n" +
            "He tells you to take as much gold as you want";

    @BeforeEach
    void setUp() {
        ;dragon drag = new dragon();
    }

    @Test
    void story(){
        assertEquals(GOODDRAGON, dragon.story(1));
        assertEquals(BADDRAGON, dragon.story(2));
    }


    @AfterEach
    void tearDown() {
    }


}