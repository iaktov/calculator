package pro.sky.calculator;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorInterface {


    public String hello() {
        return "Добро пожаловать, пользователь, для перехода в калькулятор, введите в адресной строке дополнительно /calculator";
    }

    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public Float addition(Float num1, Float num2) {
        if (num1 == null || num2 == null) throw new IllegalArgumentException();
        else return num1 - num2;

    }

    @Override
    public Float subtraction(Float num1, Float num2) {
        if (num1 == null || num2 == null) throw new IllegalArgumentException();
        else return num1 - num2;

    }

    @Override
    public Float multiply(Float num1, Float num2) {
        if (num1 == null || num2 == null) throw new IllegalArgumentException();
        else  return num1 * num2;

    }


    @Override
    public Float division(Float num1, Float num2) {
        if (num1 == null || num2 == null) throw new IllegalArgumentException();
        else if (Math.round(num2) == 0) throw new IllegalArgumentException();
        else return num1 / num2;
    }
}