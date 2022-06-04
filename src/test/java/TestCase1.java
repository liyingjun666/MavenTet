import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestCase1 {
//    @Test(enabled = false)
//    public void TestNgLearn1(){
//        System.out.println("this is TestNG test case1");
//    }
//    @Test
//    public void TetsNgLearen2(){
//        System.out.println("this is TestNG test case2");
//    }
//    // time in mulliseconds
//    @Test(timeOut = 5000)
//    public void testThisShouldPass()throws InterruptedException{
//        Thread.sleep(4000);
//    }
//    @Test(timeOut = 1000)
//    public void testThisShouldFail(){
//        while (true){
//            // do nothing
//        }
//    }
    @Test(enabled = true)
    public void TestNgLearn1(){
        System.out.println("this is TestNG test case1");
    }
    @Test(dependsOnMethods = {"TestNgLearn1"})
    public void TestNglearn2(){
        System.out.println("this is TestNG case2");
    }
    @Test(enabled = true)
    public void TestNgle(){
        System.out.println("this is TestNG test case1");
        Assert.assertFalse(true);
    }
    @Test(dependsOnMethods = {"TestNgLearn1"})
    public void TestNgLearn2(){
        System.out.println("this is TestNG  test case2");

    }


}