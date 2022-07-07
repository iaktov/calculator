package pro.sky.calculator.Service;


import org.springframework.stereotype.Service;
import pro.sky.calculator.Exception.ZeroDivideException;
import pro.sky.calculator.Interface.CalculatorInterface;

@Service
public class CalculatorServiceImpl implements CalculatorInterface {



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
        if (Float.compare(num2, 0) == 0) {
            throw new ZeroDivideException();
        } else
            return num1 / num2;
    }
}