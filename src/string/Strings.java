package string;

public class Strings {
    public static String ex001(String name) {
        /*
         * Write a Java program to print 'Hello' on screen and then print your name on a
         * separate line.
         */
        return "Hello\n" + name;
    }

    public static int ex002(int n1, int n2) {
        /* Write a Java program to print the sum of two numbers. */
        return n1 + n2;
    }

    public static int ex003(int n1, int n2) throws ArithmeticException {
        /* Write a Java program to divide two numbers and print on the screen */
        return n1 / n2;
    }

    public static int ex004(int n) {
        /* Write a Java program to print the result of the following operations */
        return n;
    }

    public static int ex005(int n1, int n2) {
        /*
         * Write a Java program that takes two numbers as input and display the product
         * of two numbers
         */
        return n1 * n2;
    }

    public static String ex006(int n1, int n2) {
        /*
         * Write a Java program to print the sum (addition), multiply, subtract, divide
         * and remainder of two numbers.
         */
        return String.format("%d + %d = %d\n%d - %d = %d\n%d x %d = %d\n" +
                "%d / %d = %d\n%d mod %d = %d", n1, n2, n1 + n2, n1, n2, n1 - n2, n1, n2, n1 * n2, n1, n2, n1 / n2, n1,
                n2, n1 % n2);
    }

    public static String ex007(int n) {
        /*
         * Write a Java program that takes a number as input and prints its
         * multiplication table upto 10.
         */
        String result = "";
        for (int x = 0; x <= 10; x++) {
            int r = n * x;
            result += String.format("%d X %d = %d\n", n, x, r);
        }
        return result;
    }

    public static String ex008() {
        /*Write a Java program to display the following pattern */
        String r = """
                   J    a   v     v  a
                   J   a a   v   v  a a
                J  J  aaaaa   V V  aaaaa
                 JJ  a     a   V  a     a""";
        return r;
    }

    public static double ex009(double n) {
        /* Write a Java program to compute the specified expressions and print the output */
        return n;
    }

    public static double ex010(double n){
        /*Write a Java program to compute a specified formula */
        return n;
    }

}
