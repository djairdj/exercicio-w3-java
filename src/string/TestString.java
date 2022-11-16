package string;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestString {
    @Test
    public void ex001Test() {
        String nome = "Alexandra Abramov";
        String expected = "Hello\nAlexandra Abramov";
        Assertions.assertEquals(expected, Strings.ex001(nome));
    }

    @Test
    public void ex002Test() {
        /* Write a Java program to print the sum of two numbers. */
        int a = 74, b = 36, expected = 110;
        Assertions.assertEquals(expected, Strings.ex002(a, b));
    }

    @Test
    public void ex003Test() {
        /* Write a Java program to divide two numbers and print on the screen */
        int a = 300, b = 10, expected = 30;
        assertEquals(expected, Strings.ex003(a, b));
        assertThrows(ArithmeticException.class, () -> {
            Strings.ex003(b, 0);
        });
    }

    @Test
    public void ex004Test() {
        /*
         * Write a Java program to print the result of the following operations
         * a. -5 + 8 * 6
         * b. (55+9) % 9
         * c. 20 + -3*5 / 8
         * d. 5 + 15 / 3 * 2 - 8 % 3
         */
        int a = 43, b = 1, c = 19, d = 13;
        assertEquals(a, Strings.ex004(-5 + 8 * 6));
        assertEquals(b, Strings.ex004((55 + 9) % 9));
        assertEquals(c, Strings.ex004(20 + -3 * 5 / 8));
        assertEquals(d, Strings.ex004(5 + 15 / 3 * 2 - 8 % 3));
        assertThrows(ArithmeticException.class, () -> {
            Strings.ex004(3 / 0);
        });
    }

    @Test
    public void ex005Test() {
        /*
         * Write a Java program that takes two numbers as input and display the product
         * of two numbers
         */
        int a = 25, b = 5, expected = 125;
        assertEquals(expected, Strings.ex005(a, b));
    }

    @Test
    public void ex006Test() {
        /*
         * Write a Java program to print the sum (addition), multiply, subtract, divide
         * and remainder of two numbers.
         */
        int a = 125, b = 24;
        String expected = String.format("%d + %d = %d\n%d - %d = %d\n%d x %d = %d\n" +
                "%d / %d = %d\n%d mod %d = %d", a, b, a + b, a, b, a - b, a, b, a * b, a, b, a / b, a, b, a % b);
        assertEquals(expected, Strings.ex006(a, b));
    }

}
