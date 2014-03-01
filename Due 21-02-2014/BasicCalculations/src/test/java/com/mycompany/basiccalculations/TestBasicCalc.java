

package com.mycompany.basiccalculations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

public class TestBasicCalc {
    
    public TestBasicCalc() {
    }
    @BeforeClass
    public static void setUpClass () throws Exception {
    }
    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    @Before
    public void setUp(){
    }
    @After
    public void tearDown() {
    }
    @Test
    public void testAdd(){
        App test = new App();
        assertEquals("Addition Failed.",3,test.add(1,2));
    }
    @Ignore("Unused expression")
    @Test
    public void ignoredTest(){
        App test = new App();
        assertEquals("Addtion Failed.",4,test.add(2,2));
    }
}
