import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    @Test
    @DisplayName("given a single empty input, " +
            "when doing add operation, " +
            "then returned value is 0")
    void addOnEmptySingleInput_returns_zero() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("");
        assertEquals(0, result);
    }

    @Test
    @DisplayName("given a single non-empty input, " +
            "when doing add operation, " +
            "then returned value is given input")
    void addOnNonEmptySingleInput_returns_input() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1");
        assertEquals(1, result);
    }

    @Test
    @DisplayName("given 2 non-empty inputs, " +
            "when doing add operation, " +
            "then returned value is the sum of 2 inputs")
    void addOnTwoNonEmptyInputs_returns_sum() {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1", "2");
        assertEquals(3, result);
    }

    @Test
    @DisplayName("given any number of inputs, " +
            "when doing add operation, " +
            "then returned value is the sum of the given inputs")
    void addOnAnyInputs_returns_sum() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1"));
        assertEquals(3, calculator.add("1", "2"));
        assertEquals(6, calculator.add("1", "2", "3"));
        assertEquals(10, calculator.add("1", "2", "3", "4"));
        assertEquals(15, calculator.add("1", "2", "3", "4", "5"));
    }
}
