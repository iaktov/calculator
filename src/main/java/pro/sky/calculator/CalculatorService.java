package pro.sky.calculator;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorInterface {



    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String addition(Float num1, Float num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException();
        } else {
            return num1 + " + " +  num2  + " = " + (num1 + num2);
        }

    }

    @Override
    public String subtraction(Float num1, Float num2) {
        if (num1 == null || num2 == null) {
            return "Вы забыли ввести число";
        } else {
            return num1 + " - " +  num2  + " = " + (num1 - num2) ;
        }

    }

    @Override
    public String multiply(Float num1, Float num2) {
        if (num1 == null || num2 == null) {
            return "Вы забыли ввести число";
        } else {
            return num1 + " * " +  num2  + " = " + (num1 * num2);
        }

    }


    @Override
    public String division(Float num1, Float num2) {
        if (num1 == null || num2 == null) {
            return "Вы забыли ввести число";
        } else if (Float.compare(num2, 0) == 0) {
            return "Делить на ноль нельзя, попробуйте ввести другое число";
        } else {
            return num1 + " / " +  num2  + " = " + (num1 / num2);
        }
    }
}