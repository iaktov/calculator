package pro.sky.calculator;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorInterface {



    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public float addition(Float num1, Float num2) {
        return num1 + num2;
    }

    @Override
    public float subtraction(Float num1, Float num2) {
        return num1 - num2;
    }

    @Override
    public float multiply(Float num1, Float num2) {
        return num1 * num2;

    }


    @Override
    public float division(Float num1, Float num2) {
        return num1 / num2;
    }
}