
import static org.junit.Assert.*;
import org.junit.Test;

public class TestCasesForCalculator {
    private static final double BETA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 720, calculator.factorial(6), BETA);
        assertEquals("Finding factorial of a number for True Positive", 6, calculator.factorial(3), BETA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 121, calculator.factorial(7), BETA);
        assertNotEquals("Finding factorial of a number for False Positive", 25, calculator.factorial(4), BETA);
    }

    @Test
    public void squarerootTruePositive(){
        assertEquals("Finding squarerrot of a number for True Positive", 3, calculator.squareroot(9), BETA);
        assertEquals("Finding squareroot of a number for True Positive", 11, calculator.squareroot(121), BETA);
    }

    @Test
    public void squarerootFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 122, calculator.squareroot(7), BETA);
        assertNotEquals("Finding factorial of a number for False Positive", 25, calculator.squareroot(4), BETA);
    }



}
