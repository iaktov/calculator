package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {


    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }
    @GetMapping(path = "/plus")
    public String  plus(@RequestParam("num1") Float num1, @RequestParam("num2") Float num2) {
        return calculatorService.addition(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") Float num1, @RequestParam("num2") Float num2) {
        return calculatorService.subtraction(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") Float num1, @RequestParam("num2") Float num2) {
        return calculatorService.multiply(num1, num2);
    }
    @GetMapping(path = "/divide")
    public String divide(@RequestParam("num1") Float num1, @RequestParam("num2") Float num2) {
        return calculatorService.division(num1, num2);
    }

}
