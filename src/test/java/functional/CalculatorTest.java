package functional;

import engine.calculator.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class CalculatorTest {

    Calculator test= new Calculator();

    @Test
    public void addTest(){
        int addValue = test.addition(10, 12);
        Assert.assertEquals(22, addValue);
    }

    @Test
    public void subTest(){
        int subValue = test.subtraction(10, 12);
        Assert.assertEquals(-2, subValue);
    }

    @Test
    public void multiplyTest(){
        int multiply = test.multiply(10, 12);
        Assert.assertEquals(120, multiply);
    }

    @Test
    public void divisionTest(){
        int divide = test.divide(10, 10);
        Assert.assertEquals(1, divide);
    }
}

