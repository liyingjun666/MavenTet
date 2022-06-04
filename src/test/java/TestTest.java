import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void Test(){
        System.out.println("This is test");
    }
    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithEception(){
        int i = 1/ 0 ;
        System.out.println("After division the value of i is"+ i);
    }

}