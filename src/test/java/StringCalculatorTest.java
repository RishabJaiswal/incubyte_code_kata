import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    @Test
    @DisplayName("Initializing code kata")
    void givesKata(){
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.calculate());
    }
}
