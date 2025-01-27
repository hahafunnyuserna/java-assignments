package java.stuff;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    @Test void testGreeting()
    {
        HelloWorld helloWorld = new HelloWorld();
        assertNotNull(helloWorld.getGreeting());
    }
}
