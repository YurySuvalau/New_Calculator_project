package tests;

import calculator.Calc;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class BaseTest {
    Calc calc = new Calc();

    @BeforeMethod()
    public void clearData() {
        calc.sum(0, 0);
        calc.difference(0, 0);
        calc.division(0, 0);
        calc.multiplication(0, 0);
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod is working");
    }
}

