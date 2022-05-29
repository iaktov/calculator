package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {


    private final CalculatorService calculatorService;
    private String lineOutput(Float a, Float b, String operation) {
        return a + " " + operation + " " + b + " = ";
    }

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping
    public String welcome() {

        return calculatorService.welcome();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam(value = "num1", required = false) Float num1,
                       @RequestParam(value = "num2", required = false) Float num2) {
        if (num1 == null || num2 == null) {
            return "Вы забыли ввести число";
        } else {
            return  lineOutput(num1,num2,"+") + calculatorService.addition(num1, num2);
        }

    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam(value = "num1", required = false) Float num1,
                        @RequestParam(value = "num2", required = false) Float num2) {
        if (num1 == null || num2 == null) {
            return "Вы забыли ввести число";
        } else {
            return  lineOutput(num1,num2,"-") + calculatorService.subtraction(num1, num2);
        }

    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Float num1,
                           @RequestParam(value = "num2", required = false) Float num2) {
        if (num1 == null || num2 == null) {
            return "Вы забыли ввести число";
        } else {
            return  lineOutput(num1,num2,"*") + calculatorService.multiply(num1, num2);
        }
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam(value = "num1", required = false) Float num1,
                         @RequestParam(value = "num2", required = false) Float num2) {
        if (num1 == null || num2 == null) {
            return "Вы забыли ввести число";
        } else if (Float.compare(num2, 0) == 0) {
            return "Делить на ноль нельзя, попробуйте ввести другое число";
        } else {
            return lineOutput(num1,num2,"/") + calculatorService.division(num1, num2);
        }
    }



}



