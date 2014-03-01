
package com.mycompany.nullness;
import org.junit.Test;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;

public class TestNullness {
    public TestNullness(){
        
    }
    @Test
    public void nullAssert()
    {
        App test = new App();
        assertNull(test.nullString());
    }
    @Test
    public void notnullAssert()
    {
        App test = new App();
        assertNotNull(test.notnullString());
    }
}
