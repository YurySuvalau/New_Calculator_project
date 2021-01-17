package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DifferenceTest extends BaseTest {

    @DataProvider
    public Object[][] useDataProvider() {
        return new Object[][]{
                {2, 2, 0},
                {1.2222, 3, -1.78},
                {3.4, 3, 0.4},
        };
    }

    @Test(dataProvider = "useDataProvider", priority = 4, retryAnalyzer = Retry.class,
            description = "difference", invocationCount = 2)
    public void testDataProvider(double a, double b, double expectedNumber) {
        Assert.assertEquals(calc.difference(a, b), expectedNumber);
    }
}