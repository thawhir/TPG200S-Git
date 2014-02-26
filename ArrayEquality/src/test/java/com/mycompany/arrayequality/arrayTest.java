
package com.mycompany.arrayequality;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
public class arrayTest {
    public arrayTest(){
        
    }
    @Test
    public void assertArrayTest(){
        App test = new App();
        String [] expected = {"Hello","World"};
        assertArrayEquals("Compared arrays are not the same.",expected,test.actualArray());
    }
    
}
