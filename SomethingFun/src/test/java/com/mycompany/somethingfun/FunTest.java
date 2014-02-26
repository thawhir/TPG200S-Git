
package com.mycompany.somethingfun;
import org.junit.AfterClass;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class FunTest {
    public FunTest(){
        
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
    public void funEquals(){
        App test = new App();
        assertTrue("canCast() did not return the expected value",test.canCast(100, 50)==true);
    }
}
