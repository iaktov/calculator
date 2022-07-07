package pro.sky.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator.Service.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceImplTestParams {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldReturnAddition(Float num1, Float num2) {
        assertEquals(num1 + num2, out.addition(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldReturnSubtraction(Float num1, Float num2) {
        assertEquals(num1 - num2, out.subtraction(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldReturnMultiply(Float num1, Float num2) {
        assertEquals(num1 * num2, out.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldReturnDivision(Float num1, Float num2) {
        assertEquals(num1 / num2, out.division(num1, num2));
    }

    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(10.0f, 12.0f),
                Arguments.of(5.0f, 3.0f),
                Arguments.of(2.0f, 5.0f),
                Arguments.of(10.0f, 2.0f)
        );
    }
}