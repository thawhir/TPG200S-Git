
package com.mycompany.testsforeveryone;
import org.junit.Test;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class TestEveryone {
    public TestEveryone(){
        
    }
    @Test
    public void testName()
    {
        App test = new App();
        assertNotNull("Your name doesn't have a value.",test.name());
    }
    @Test
    public void testAge()
    {
        App test = new App();
        assertEquals("Your age doesn't equal the expected value.",20,test.age());
    }
    @Test
    public void testHeight()
    {
        App test = new App();
        assertEquals("Your height doesn't equal the expected value.",1.65,test.height(),0.50);
    }
    @Test
    public void testComment()
    {
        App test = new App();
        assertNull("Value expected to contain null had a value.",test.comment());
    }
}
