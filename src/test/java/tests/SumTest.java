package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest extends BaseTest {

    @DataProvider
    public Object[][] useDataProvider() {
        return new Object[][]{
                {3, 3, 6},
                {0.3, 1, 1.3},
                {-0.1, 1, 0.9},
                {-1, -1, -2},
                {0.09, 0.011, 0.1},
        };
    }

    @Test(dataProvider = "useDataProvider", priority = 3, retryAnalyzer = Retry.class,
            description = "sum")
    public void testDataProvider(double a, double b, double expectedNumber) {
        Assert.assertEquals(calc.sum(a, b), expectedNumber);
    }
}
