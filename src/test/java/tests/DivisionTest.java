package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivisionTest extends BaseTest {

    @DataProvider
    public Object[][] useDataProvider() {
        return new Object[][]{
                {2, 2, 1},
                {1, 3, 0.33},
                {0.3557, 0.1899, 1.87},
        };
    }

    @Test(dataProvider = "useDataProvider", priority = 2, retryAnalyzer = Retry.class,
            description = "division")
    public void testDataProvider(double a, double b, double expectedNumber) {
        Assert.assertEquals(calc.division(a, b), expectedNumber);
    }
}


