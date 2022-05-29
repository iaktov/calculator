package pro.sky.calculator;

public interface CalculatorInterface {
    default float addition(Float num1, Float num2) {
        return num1 + num2;
    }

    default float subtraction(Float num1, Float num2) {
        return num1 - num2;
    }

    default float multiply(Float num1, Float num2) {
        return num1 * num2;
    }

    default float division(Float num1, Float num2) {
        return num1 / num2;
    }
}
