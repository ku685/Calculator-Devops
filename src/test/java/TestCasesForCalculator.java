
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




}
