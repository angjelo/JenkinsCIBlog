package junitdemo.junitdemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testPrintHelloWorld() {
        assertEquals("Hello World 2", App.getHelloWorld2());
    }
}
