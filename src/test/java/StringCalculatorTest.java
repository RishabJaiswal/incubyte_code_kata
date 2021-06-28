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
}
