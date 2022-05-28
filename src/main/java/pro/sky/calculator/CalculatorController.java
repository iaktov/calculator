package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {


    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping(path = "/calculator")
    public String welcome() {
        return calculatorService.welcome();
    }
    @GetMapping(path = "/calculator/plus")
    public Float plus(@RequestParam("num1") Float num1, @RequestParam("num2") Float num2) {
        return calculatorService.addition(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public Float minus(@RequestParam("num1") Float num1, @RequestParam("num2") Float num2) {
        return calculatorService.subtraction(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public Float multiply(@RequestParam("num1") Float num1, @RequestParam("num2") Float num2) {
        return calculatorService.multiply(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public Float divide(@RequestParam("num1") Float num1, @RequestParam("num2") Float num2) {
        return calculatorService.division(num1, num2);
    }

}
