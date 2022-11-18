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

    @Test
    public void ex007Test(){
        /*Write a Java program that takes a number as input and prints its multiplication table upto 10. */
        String expected = """
                8 X 0 = 0
                8 X 1 = 8
                8 X 2 = 16
                8 X 3 = 24
                8 X 4 = 32
                8 X 5 = 40
                8 X 6 = 48
                8 X 7 = 56
                8 X 8 = 64
                8 X 9 = 72
                8 X 10 = 80
                """;
        assertEquals(expected, Strings.ex007(8));
    }

    @Test
    public void ex008Test(){
        /*Write a Java program to display the following pattern */
        String expected = """
            J    a   v     v  a
            J   a a   v   v  a a
         J  J  aaaaa   V V  aaaaa
          JJ  a     a   V  a     a""";
        assertEquals(expected, Strings.ex008());
    }

    @Test
    public void ex009Test(){
        /*Write a Java program to compute the specified expressions and print the output. */
        double expected = 2.138888888888889;
        assertEquals(expected, Strings.ex009((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }

    @Test
    public void ex010(){
        /*Write a Java program to compute a specified formula */
        double expected = 2.9760461760461765;
        assertEquals(expected, Strings.ex010(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))));
    }


}
