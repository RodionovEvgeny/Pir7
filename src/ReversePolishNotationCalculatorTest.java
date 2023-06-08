import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversePolishNotationCalculatorTest {
    ReversePolishNotationCalculator reversePolishNotationCalculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        assertEquals(5, reversePolishNotationCalculator.calculatePolishNotation("3 2 +"));
    }

    @Test
    public void shouldCalculateSubtraction() {
        assertEquals(1, reversePolishNotationCalculator.calculatePolishNotation("3 2 -"));
    }

    @Test
    public void shouldCalculateMultiplication() {
        assertEquals(6, reversePolishNotationCalculator.calculatePolishNotation("3 2 *"));
    }

    @Test
    public void multipleSpaceProcessing() {
        assertEquals(6, reversePolishNotationCalculator.calculatePolishNotation("  3  2   *  "));
    }

    @Test
    public void multipleOperandsProcessing() {
        assertEquals(3, reversePolishNotationCalculator.calculatePolishNotation("3 4 1 2 + - *"));
    }

    @Test
    public void negativeValuesProcessing() {
        assertEquals(-5, reversePolishNotationCalculator.calculatePolishNotation("-3 -2 +"));
    }
}
