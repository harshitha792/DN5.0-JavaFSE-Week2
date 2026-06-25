import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAddAAA() {

        // Arrange
        Calculator calc = new Calculator();

        // Act
        int result = calc.add(2,3);

        // Assert
        assertEquals(5, result);
    }
}