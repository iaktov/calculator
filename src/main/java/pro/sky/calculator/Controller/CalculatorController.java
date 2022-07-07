package pro.sky.calculator.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.Service.CalculatorServiceImpl;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {


    private final CalculatorServiceImpl calculatorServiceImpl;
    private String lineOutput(Float a, Float b, String operation) {
        return a + " " + operation + " " + b + " = ";
    }

    public CalculatorController(CalculatorServiceImpl calculatorServiceImpl) {
        this.calculatorServiceImpl = calculatorServiceImpl;
    }


    @GetMapping
    public String welcome() {

        return calculatorServiceImpl.welcome();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "num1", required = false) Float num1,
                       @RequestParam(value = "num2", required = false) Float num2) {
        if (num1 == null || num2 == null) {
            return "Вы забыли ввести число";
        } else {
            return  lineOutput(num1,num2,"+") + calculatorServiceImpl.addition(num1, num2);
        }

    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) Float num1,
                        @RequestParam(value = "num2", required = false) Float num2) {
        if (num1 == null || num2 == null) {
            return "Вы забыли ввести число";
        } else {
            return  lineOutput(num1,num2,"-") + calculatorServiceImpl.subtraction(num1, num2);
        }

    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Float num1,
                           @RequestParam(value = "num2", required = false) Float num2) {
        if (num1 == null || num2 == null) {
            return "Вы забыли ввести число";
        } else {
            return  lineOutput(num1,num2,"*") + calculatorServiceImpl.multiply(num1, num2);
        }
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) Float num1,
                         @RequestParam(value = "num2", required = false) Float num2) {
        if (num1 == null || num2 == null) {
            return "Вы забыли ввести число";
        } else {
            return lineOutput(num1,num2,"/") + calculatorServiceImpl.division(num1, num2);
        }
    }



}



