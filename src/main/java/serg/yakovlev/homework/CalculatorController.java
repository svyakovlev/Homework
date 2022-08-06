package serg.yakovlev.homework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping(path = "/calculator")
    public String welcome() {
        return Service.welcome();
    }

    @GetMapping(path = "/calculator/plus")
    public String sum(@RequestParam(value = "num1", required = false) Double number1, @RequestParam(value = "num2", required = false) Double number2) {
        return Service.sum(number1, number2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam(value = "num1", required = false) Double number1, @RequestParam(value = "num2", required = false) Double number2) {
        return Service.minus(number1, number2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Double number1, @RequestParam(value = "num2", required = false) Double number2) {
        return Service.multiply(number1, number2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam(value = "num1", required = false) Double number1, @RequestParam(value = "num2", required = false) Double number2) {
        return Service.divide(number1, number2);
    }

}
