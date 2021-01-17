package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiplicationTest extends BaseTest {

    @DataProvider
    public Object[][] useDataProvider() {
        return new Object[][]{
                {2, 3, 6},
                {0, 1, 0},
                {0.1, 1, 0.1},
        };
    }

    @Test(dataProvider = "useDataProvider", priority = 1, retryAnalyzer = Retry.class,
            description = "multiplication", invocationCount = 4)
    public void testDataProvider(double a, double b, double expectedNumber) {
        Assert.assertEquals(calc.multiplication(a, b), expectedNumber);
    }
}

