import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestCase3 {
    @DataProvider(name = "providerNumbers")
    public Object[][] providerDara(){
        return new Object[][]{{10,20},{45,79},{5616,46}};
    }
    @Test(dataProvider = "providerNumbers")
    public void TestNgLearn1(int param1,int param2){
        System.out.println("this is test case1,and param1 is :"+param1+"; param2 is "+param2);
        Assert.assertFalse(false);
    }
    @Test(dependsOnMethods = {"TestNgLearn1"})
    public void TestNgLearn2(){
        System.out.println("this is TestNG test case2");
    }
}