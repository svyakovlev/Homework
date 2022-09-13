package serg.yakovlev.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ServiceTest {

    public static final Double FIRST_NUMBER = 4.0;
    public static final Double SECOND_NUMBER = 2.0;

    public static final String ERROR_MESSAGE = "Ошибка: нужно ввести оба числа";

    @Test
    public void shouldReturnWelcome() {
        String expected = "Добро пожаловать в калькулятор";
        String out = Service.welcome();
        Assertions.assertEquals(expected, out);
    }

    @Test
    public void testingSum() {
        Double sum = FIRST_NUMBER + SECOND_NUMBER;
        String expected = FIRST_NUMBER + " + " + SECOND_NUMBER + " = " + sum;
        String out = Service.sum(FIRST_NUMBER, SECOND_NUMBER);
        Assertions.assertEquals(expected, out);
    }

    @Test
    public void testingMinus() {
        Double min = FIRST_NUMBER - SECOND_NUMBER;
        String expected = FIRST_NUMBER + " - " + SECOND_NUMBER + " = " + min;
        String out = Service.minus(FIRST_NUMBER, SECOND_NUMBER);
        Assertions.assertEquals(expected, out);
    }

    @Test
    public void testingMultiply() {
        Double mult = FIRST_NUMBER * SECOND_NUMBER;
        String expected = FIRST_NUMBER + " * " + SECOND_NUMBER + " = " + mult;
        String out = Service.multiply(FIRST_NUMBER, SECOND_NUMBER);
        Assertions.assertEquals(expected, out);
    }

    @Test
    public void testingDivide() {
        Double div = FIRST_NUMBER / SECOND_NUMBER;
        String expected = FIRST_NUMBER + " / " + SECOND_NUMBER + " = " + div;
        String out = Service.divide(FIRST_NUMBER, SECOND_NUMBER);
        Assertions.assertEquals(expected, out);
    }

    @Test
    public void shouldReturnExceptionDivideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Service.divide(FIRST_NUMBER, 0D));
    }

    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(FIRST_NUMBER, null, ERROR_MESSAGE),
                Arguments.of(null, SECOND_NUMBER, ERROR_MESSAGE),
                Arguments.of(null, null, ERROR_MESSAGE)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldReturnErrorNeedBothNumbers(Double number1, Double number2, String message) {
        String errorMessageSum = Service.sum(number1, number2);
        String errorMessageMinus = Service.minus(number1, number2);
        String errorMessageMulty = Service.multiply(number1, number2);
        String errorMessageDivide = Service.divide(number1, number2);
        Assertions.assertEquals(message, errorMessageSum);
        Assertions.assertEquals(message, errorMessageMinus);
        Assertions.assertEquals(message, errorMessageMulty);
        Assertions.assertEquals(message, errorMessageDivide);
    }
}
