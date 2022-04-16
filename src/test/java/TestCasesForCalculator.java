
import static org.junit.Assert.*;
import org.junit.Test;

public class TestCasesForCalculator {
    private static final double BETA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 720, calculator.factorial(6), BETA);
        assertEquals("Finding factorial of a number for True Positive", 6, calculator.factorial(3), BETA);
        assertEquals("Finding factorial of a number for True Positive", 2, calculator.factorial(2), BETA);
        assertEquals("Finding factorial of a number for True Positive", 24, calculator.factorial(4), BETA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 121, calculator.factorial(7), BETA);
        assertNotEquals("Finding factorial of a number for False Positive", 25, calculator.factorial(4), BETA);
        assertNotEquals("Finding factorial of a number for False Positive", 12, calculator.factorial(3), BETA);
        assertNotEquals("Finding factorial of a number for False Positive", 25, calculator.factorial(6), BETA);
    }

    @Test
    public void squarerootTruePositive(){
        assertEquals("Finding squarerrot of a number for True Positive", 3, calculator.squareroot(9), BETA);
        assertEquals("Finding squareroot of a number for True Positive", 11, calculator.squareroot(121), BETA);
        assertEquals("Finding squarerrot of a number for True Positive", 4, calculator.squareroot(16), BETA);
        assertEquals("Finding squareroot of a number for True Positive", 5, calculator.squareroot(25), BETA);
    }

    @Test
    public void squarerootFalsePositive(){
        assertNotEquals("Finding squareroot of a number for False Positive", 122, calculator.squareroot(7), BETA);
        assertNotEquals("Finding squarerrot of a number for False Positive", 25, calculator.squareroot(4), BETA);
        assertNotEquals("Finding squareroot of a number for False Positive", 6, calculator.squareroot(5), BETA);
        assertNotEquals("Finding squarerrot of a number for False Positive", 7, calculator.squareroot(6), BETA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power of a number for True Positive", 27, calculator.power(3,3), BETA);
        assertEquals("Finding power of a number for True Positive", 32, calculator.power(2,5), BETA);
        assertEquals("Finding power of a number for True Positive", 27, calculator.power(27,1), BETA);
        assertEquals("Finding power of a number for True Positive", 32, calculator.power(32,1), BETA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power of a number for False Positive", 122, calculator.power(3,3), BETA);
        assertNotEquals("Finding power of a number for False Positive", 25, calculator.power(2,5), BETA);
        assertNotEquals("Finding power of a number for False Positive", 122, calculator.power(3,1), BETA);
        assertNotEquals("Finding power of a number for False Positive", 25, calculator.power(2,2), BETA);
    }

    @Test
    public void LogarithmTruePositive(){
        assertEquals("Finding logarithm of a number for True Positive", 0, calculator.naturalLog(1), BETA);

    }

    @Test
    public void LogarithmFalsePositive(){
        assertNotEquals("Finding logarithm of a number for False Positive", 122, calculator.naturalLog(4), BETA);
        assertNotEquals("Finding logarithm of a number for False Positive", 25, calculator.naturalLog(5), BETA);
        assertNotEquals("Finding logarithm of a number for False Positive", 122, calculator.naturalLog(7), BETA);
        assertNotEquals("Finding logarithm of a number for False Positive", 25, calculator.naturalLog(8), BETA);
    }

}
