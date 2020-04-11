package com.mycompany.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    App app = new App();

    @Test
    public void testApp()
    {
        assertEquals("Hello world", app.greet("world"));
    }

    @Test
    public void testTrue()
    {
        assertTrue( true );
    }
}
