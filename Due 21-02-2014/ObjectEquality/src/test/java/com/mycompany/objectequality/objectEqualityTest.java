package com.mycompany.objectequality;

import org.junit.Test;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotSame;

public class objectEqualityTest {
    public objectEqualityTest(){
        
    }
    @Test
    public void equalTest()
    {
        App test = new App();
        assertSame("Hello",test.objectTest());
    }
    @Test
    public void notequalTest()
    {
        App test = new App();
        assertNotSame("Goodbye",test.objectTest());
    }
}
