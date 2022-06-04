import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestTest3<pub> {
    @Test(groups = "group1")
    public void testcCO3(){
        System.out.println("testCO3");
        Assert.assertTrue(true);
    }

    @Test(groups = "group1")
    public void testCO4(){
        System.out.println("testCO4");
        Assert.assertTrue(true);
    }

    @Test(groups = "group1")
    public void testCO5(){
        System.out.println("testCO5");
        Assert.assertTrue(true);
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }

    @BeforeClass
    public void  beforeClass(){
        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void  afterSuite(){
        System.out.println("afterSuite");
    }

    @BeforeGroups(groups = {"group1","group2"})
    public void beforeGroups(){
        System.out.println("beforeGroups");
    }

    @AfterGroups(groups = {"group1","group2"})
    public void afterGroups(){
        System.out.println("afterGroups");
    }


    @BeforeMethod
    public void beforeMethod() {
        System.out.println("beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod");
    }

}