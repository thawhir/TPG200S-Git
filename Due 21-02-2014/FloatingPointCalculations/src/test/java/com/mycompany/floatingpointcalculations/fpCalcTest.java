package com.mycompany.floatingpointcalculations;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class fpCalcTest {
    public fpCalcTest(){
        
    }
    @Test
    public void testFpAdd()
    {
        App test = new App();
        assertEquals("Addition Failed.",7.252,test.fpAdd(3.65,3.65),0.165);
    }
}
