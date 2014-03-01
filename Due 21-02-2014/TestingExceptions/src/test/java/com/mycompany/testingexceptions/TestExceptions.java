
package com.mycompany.testingexceptions;
import org.junit.Test;
public class TestExceptions {
    public TestExceptions()
    {
        
    }
    @Test(expected=ArithmeticException.class)
    public void ExceptionCheck() throws Exception
    {
        App test = new App();
        double number = test.doubleVal();
        System.out.println(number);
    }
}
