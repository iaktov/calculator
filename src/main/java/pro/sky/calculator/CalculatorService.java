package pro.sky.calculator;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements CalculatorInterface {



    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }


}