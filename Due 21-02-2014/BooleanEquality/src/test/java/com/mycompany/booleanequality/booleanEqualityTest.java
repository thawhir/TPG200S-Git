
package com.mycompany.booleanequality;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class booleanEqualityTest {
    public booleanEqualityTest(){
        
    }
    @Test
    public void trueTest()
    {
        App test = new App();
        assertTrue("Boolean condition is not true.",test.truebool()==true);
    }
    @Test
    public void falseTest()
    {
        App test = new App();
        assertFalse("Boolean condition is not false.",test.falsebool()==true);
    }
}
