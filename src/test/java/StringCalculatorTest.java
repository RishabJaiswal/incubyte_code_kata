import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        int result = calculator.add("1,2");
        assertEquals(3, result);
    }

    @Test
    @DisplayName("given any number of inputs, " +
            "when doing add operation, " +
            "then returned value is the sum of the given inputs")
    void addOnAnyInputs_returns_sum() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1"));
        assertEquals(3, calculator.add("1,2"));
        assertEquals(6, calculator.add("1,2,3"));
        assertEquals(10, calculator.add("1,2,3,4"));
        assertEquals(15, calculator.add("1,2,3,4,5"));
    }

    @Test
    @DisplayName("given any number of inputs with new line or comma, " +
            "when doing add operation, " +
            "then returned value is the sum of the given inputs")
    void addOnAnyInputsWithValidDelimiter_returns_sum() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1"));
        assertEquals(3, calculator.add("1\n2"));
        assertEquals(6, calculator.add("1\n2,3"));
        assertEquals(10, calculator.add("1,2\n3,4"));
        assertEquals(15, calculator.add("1,2,3,4\n5"));
    }

    @Test
    @DisplayName("given any number of inputs with a given delimiter, " +
            "when doing add operation, " +
            "then returned value is the sum of the given inputs")
    void addOnAnyInputsWithGivenDelimiter_returns_sum() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("//'\n1"));
        assertEquals(3, calculator.add("//'\n1'2"));
        assertEquals(6, calculator.add("//#\n1\n2#3"));
        assertEquals(10, calculator.add("//#\n1,2\n3#4"));
        assertEquals(15, calculator.add("//#\n1,2,3,4\n5"));
    }

    @Test
    @DisplayName("given any number of inputs with a negative number, " +
            "when doing add operation, " +
            "then an exception is thrown")
    void addOnAnyNegativeInputs_throws_exception() {
        StringCalculator calculator = new StringCalculator();
        Exception exception = assertThrows(
                NumberFormatException.class,
                () -> calculator.add("//'\n1'-2'-3")
        );

        //assert exception message
        assertEquals("[-2, -3]", exception.getMessage());
    }

    @Test
    @DisplayName("given inputs some are greater than 1000, " +
            "when doing add operation, " +
            "then returned value is the sum of the inputs that are less than 1001")
    void addOnAnyInputs_returns_sumOfInputsLessThan1001() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1,2000"));
        assertEquals(4, calculator.add("1,1001,3"));
        assertEquals(1008, calculator.add("1,999,1001,8"));
    }

    @Test
    @DisplayName("given inputs with a given delimiter of any length, " +
            "when doing add operation, " +
            "then returned value is the sum of the given inputs after the delimiter")
    void addOnInputsWithGivenDelimiter_returns_sum() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("//''\n1"));
        assertEquals(3, calculator.add("//--\n1--2"));
        assertEquals(6, calculator.add("//***\n1***2***3"));
        assertEquals(10, calculator.add("//####\n1,2\n3####4"));
        assertEquals(15, calculator.add("//**\n1,2,3,4\n5"));
    }
}
