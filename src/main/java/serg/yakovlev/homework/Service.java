package serg.yakovlev.homework;

@org.springframework.stereotype.Service
public class Service {
    public static String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    public static String sum(Double number1, Double number2) {
        if (number1 == null || number2 == null) {
            return "Ошибка: нужно ввести оба числа";
        } else {
            Double sum = number1 + number2;
            return number1 + " + " + number2 + " = " + sum;
        }
    }

    public static String minus(Double number1, Double number2) {
        if (number1 == null || number2 == null) {
            return "Ошибка: нужно ввести оба числа";
        } else {
            Double min = number1 + number2;
            return number1 + " - " + number2 + " = " + min;
        }
    }

    public static String multiply(Double number1, Double number2) {
        if (number1 == null || number2 == null) {
            return "Ошибка: нужно ввести оба числа";
        } else {
            Double mult = number1 * number2;
            return number1 + " * " + number2 + " = " + mult;
        }
    }

    public static String divide(Double number1, Double number2) {
        if (number1 == null || number2 == null) {
            return "Ошибка: нужно ввести оба числа";
        } else if (number2 == 0) {
            return "Делить на ноль нельзя";
        } else {
            Double div = number1 / number2;
            return number1 + " / " + number2 + " = " + div;
        }
    }
}
//