

package com.mycompany.fubtimeout;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class fubTest {
    
    public fubTest () {
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
    //Tests to see if calcFub will time out, it will fail; it runs indefinitely
    @Test(timeout=30)
    public void failTimeout(){
        App test = new App();
        test.calcFub(0,1);
    }
    
}
