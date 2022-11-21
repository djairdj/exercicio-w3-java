package string;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Locale;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestString {
    @Test
    public void ex001Test() {
        /*
         * Write a Java program to print 'Hello' on screen and then print some name on a
         * separate line.
         */
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
        /* Write a Java program to divide two numbers and print on the screen. */
        int a = 300, b = 10, expected = 30;
        assertEquals(expected, Strings.ex003(a, b));
        assertThrows(ArithmeticException.class, () -> {
            Strings.ex003(b, 0);
        });
    }

    @Test
    public void ex004Test() {
        /*
         * Write a Java program to print the result of the following operations:
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
         * of two numbers.
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
    public void ex007Test() {
        /*
         * Write a Java program that takes a number as input and prints its
         * multiplication table upto 10.
         */
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
    public void ex008Test() {
        /* Write a Java program to display the following pattern: */
        String expected = """
                   J    a   v     v  a
                   J   a a   v   v  a a
                J  J  aaaaa   V V  aaaaa
                 JJ  a     a   V  a     a""";
        assertEquals(expected, Strings.ex008());
    }

    @Test
    public void ex009Test() {
        /*
         * Write a Java program to compute the specified expressions and print the
         * output.
         */
        double expected = 2.138888888888889;
        assertEquals(expected, Strings.ex009((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }

    @Test
    public void ex010Test() {
        /* Write a Java program to compute a specified formula: */
        double expected = 2.9760461760461765;
        assertEquals(expected, Strings.ex010(4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11))));
    }

    @Test
    public void ex011Test() {
        /* Write a Java program to print the area and perimeter of a circle. */
        double radius = 7.5;
        String expected = "Perimeter is = 47.12388980384689\nArea is = 176.71458676442586";
        assertEquals(expected, Strings.ex011(radius));
    }

    @Test
    public void ex012Test() {
        /*
         * Write a Java program that takes
         * three numbers as input to calculate and print the average of the numbers.
         */
        double a = 20;
        double b = 80;
        double c = 50;
        double m = (a + b + c) / 3;
        assertEquals(m, Strings.ex012(a, b, c));
    }

    @Test
    public void ex013Test() {
        /* Write a Java program to print the area and perimeter of a rectangle. */
        Locale.setDefault(Locale.US);
        String expected = """
                Area is 5.6 * 8.5 = 47.60
                Perimeter is 2 * (5.6 + 8.5) = 28.20
                """;
        double a = 5.6;
        double b = 8.5;
        assertEquals(expected, Strings.ex013(a, b));
    }

    @Test
    public void ex014Test() {
        /* Write a Java program to print an American flag on the screen. */
        String flag = """
                * * * * * * ==================================
                 * * * * *  ==================================
                * * * * * * ==================================
                 * * * * *  ==================================
                * * * * * * ==================================
                 * * * * *  ==================================
                * * * * * * ==================================
                 * * * * *  ==================================
                * * * * * * ==================================
                ==============================================
                ==============================================
                ==============================================
                ==============================================
                ==============================================
                ==============================================
                """;
        assertEquals(flag, Strings.ex014());
    }

    @Test
    public void ex015Test() {
        /* Write a Java program to swap two variables. */
        int n1 = 3;
        int n2 = 7;
        String f = "";
        f += "n1 vale " + n1;
        f += "\nn2 vale " + n2;
        f += "\nn1 vale " + n2;
        f += "\nn2 vale " + n1;
        assertEquals(f, Strings.ex015(n1, n2));
    }

    @Test
    public void ex016Test() {
        /* Write a Java program to print a face. */
        String f = """
                 +""\"""+
                [| o o |]
                 |  ^  |
                 | '-' |
                 +-----+
                    """;
        assertEquals(f, Strings.ex016());
    }

    @Test
    public void ex017Test() {
        /* Write a Java program to add two binary numbers. */
        String b1 = "10";
        String b2 = "11";
        String expected = "Sum of two binary numbers: 101";
        assertEquals(expected, Strings.ex017(b1, b2));
        // Other test:
        b1 = "102";
        b2 = "1";
        expected = "primeiro argumento não binario";
        assertEquals(expected, Strings.ex017(b1, b2));
        // Other test:
        b1 = "10";
        b2 = "12";
        expected = "segundo argumento não binario";
        assertEquals(expected, Strings.ex017(b1, b2));
    }

    @Test
    public void ex018Test() {
        /* Write a Java program to multiply two binary numbers. */
        String expected = "Product of two binary numbers: 110";
        String b1 = "10";
        String b2 = "11";
        assertEquals(expected, Strings.ex018(b1, b2));
        // Other test:
        b1 = "102";
        b2 = "1";
        expected = "primeiro argumento não binario";
        assertEquals(expected, Strings.ex017(b1, b2));
        // Other test:
        b1 = "10";
        b2 = "12";
        expected = "segundo argumento não binario";
        assertEquals(expected, Strings.ex018(b1, b2));

    }

    @Test
    public void ex019Test() {
        /* Write a Java program to convert a decimal number to binary number. */
        int n = 5;
        String expected = "Binary number is: 101";
        assertEquals(expected, Strings.ex019(n));
    }

    @Test
    public void ex020Test() {
        /* Write a Java program to convert a decimal number to hexadecimal number. */
        int n = 15;
        String expectet = "Hexadecimal number is : F";
        assertEquals(expectet, Strings.ex020(n));
    }

    @Test
    public void ex021test() {
        /* Write a Java program to convert a decimal number to octal number. */
        int dec = 15;
        String expected = "Octal number is: 17";
        assertEquals(expected, Strings.ex021(dec));
    }

    @Test
    public void ex022test() {
        /* Write a Java program to convert a binary number to decimal number. */
        String b = "100";
        String expected = "Decimal number is: 4";
        assertEquals(expected, Strings.ex022(b));
        // Other test:
        b = "021";
        expected = "argumento não binario";
        assertEquals(expected, Strings.ex022(b));
    }

    @Test
    public void ex023test() {
        /* Write a Java program to convert a binary number to hexadecimal number. */
        String b = "1101";
        String expected = "HexaDecimal value: D";
        assertEquals(expected, Strings.ex023(b));
        // Other test:
        b = "021";
        expected = "argumento não binario";
        assertEquals(expected, Strings.ex023(b));
    }

    @Test
    public void ex024test() {
        /* Write a Java program to convert a binary number to a Octal number. */
        String b = "111";
        String expected = "Octal number: 7";
        assertEquals(expected, Strings.ex024(b));
        // Other test:
        b = "021";
        expected = "argumento não binario";
        assertEquals(expected, Strings.ex024(b));
    }

    @Test
    public void ex025test() {
        /* Write a Java program to convert a octal number to a decimal number. */
        String oct = "10";
        String expected = "Equivalent decimal number: 8";
        assertEquals(expected, Strings.ex025(oct));
        // Other test:
        oct = "18";
        expected = "argumento não octal";
        assertEquals(expected, Strings.ex025(oct));
    }

    @Test
    public void ex026test() {
        /* Write a Java program to convert a octal number to a binary number. */
        String oct = "7";
        String expected = "Equivalent binary number: 111";
        assertEquals(expected, Strings.ex026(oct));
        // Other test:
        oct = "18";
        expected = "argumento não octal";
        assertEquals(expected, Strings.ex026(oct));
    }

    @Test
    public void ex027test() {
        /* Write a Java program to convert a octal number to a hexadecimal number. */
        String oct = "100";
        String expected = "Equivalent hexadecimal number: 40";
        assertEquals(expected, Strings.ex027(oct));
        // Other test:
        oct = "18";
        expected = "argumento não octal";
        assertEquals(expected, Strings.ex027(oct));
    }

    @Test
    public void ex028test() {
        /* Write a Java program to convert a hexadecimal to a decimal number. */
        String ex = "25";
        String expected = "Equivalent decimal number is: 37";
        assertEquals(expected, Strings.ex028(ex));
        // Other test:
        ex = "18g";
        expected = "argumento não exadecimal";
        assertEquals(expected, Strings.ex028(ex));
    }

    @Test
    public void ex029test() {
        /* Write a Java program to convert a hexadecimal to a binary number. */
        String ex = "37";
        String expected = "Equivalent Binary Number is: 110111";
        assertEquals(expected, Strings.ex029(ex));
        // Other test:
        ex = "18y";
        expected = "argumento não exadecimal";
        assertEquals(expected, Strings.ex029(ex));
    }

    @Test
    public void ex030test() {
        /* Write a Java program to convert a hexadecimal to a octal number. */
        String ex = "40";
        String expected = "Equivalent of octal number is: 100";
        assertEquals(expected, Strings.ex030(ex));
        // Other test:
        ex = "18y";
        expected = "argumento não exadecimal";
        assertEquals(expected, Strings.ex030(ex));
    }

}
