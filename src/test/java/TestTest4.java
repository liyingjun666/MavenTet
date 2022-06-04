import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestTest4 {
    @Test(groups = "group1")
    public void testDCO3(){
        System.out.println("testDCO3");
        Assert.assertTrue(true);
    }

    @Test(groups = "group1")
    public void testDCO4(){
        System.out.println("testDCO4");
        Assert.assertTrue(true);
    }

    @Test(groups = "group2")
    public void testDCO5(){
        System.out.println("testDCO5");
        Assert.assertTrue(true);
    }

    @BeforeTest
    public void beforetest(){
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");
    }

    @BeforeGroups(groups = "group1")
    public void beforeGroups(){
        System.out.println("beforeGroups");
    }

    @AfterGroups(groups = "group1")
    public void afterGroups(){
        System.out.println("afterGroups");
    }

    @BeforeMethod
    public void  beforeMethod(){
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod");
    }




}