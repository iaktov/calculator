package pro.sky.calculator;

import org.junit.jupiter.api.Test;
import pro.sky.calculator.Service.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceImplTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();


    @Test
    public void shouldReturnDivision() {
        Float num1 = 5.0f;
        Float num2 = 2.0f;
        Float result = out.division(num1, num2);
        assertEquals(2.5f, result);
    }

    @Test
    public void shouldReturnAddition() {
        Float num1 = 5.0f;
        Float num2 = 2.0f;
        Float result = out.addition(num1, num2);
        assertEquals(7.0f, result);
    }

    @Test
    public void shouldReturnSubtraction() {
        Float num1 = 5.0f;
        Float num2 = 2.0f;
        Float result = out.subtraction(num1, num2);
        assertEquals(3.0f, result);
    }

    @Test
    public void shouldReturnMultiply() {
        Float num1 = 5.0f;
        Float num2 = 2.0f;
        Float result = out.multiply(num1, num2);
        assertEquals(10.0f, result);
    }

    @Test
    public void shouldIllegalArgumentExceptionDivisionByZero() {
        Float num1 = 5.0f;
        Float num2 = 0.0f;
        assertThrows(IllegalArgumentException.class, () -> out.division(num1, num2));
    }
}
