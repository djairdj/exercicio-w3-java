package basic.i.djair;

public class Strings {
    public static String ex001(String name) {
        /*
         * Write a Java program to print 'Hello' on screen and then print some name on a
         * separate line.
         */
        return "Hello\n" + name;
    }

    public static int ex002(int n1, int n2) {
        /* Write a Java program to print the sum of two numbers. */
        return n1 + n2;
    }

    public static int ex003(int n1, int n2) throws ArithmeticException {
        /* Write a Java program to divide two numbers and print on the screen. */
        return n1 / n2;
    }

    public static int ex004(int n) {
        /* Write a Java program to print the result of the following operations. */
        return n;
    }

    public static int ex005(int n1, int n2) {
        /*
         * Write a Java program that takes two numbers as input and display the product
         * of two numbers.
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
        /* Write a Java program to display the following pattern: */
        String r = """
                   J    a   v     v  a
                   J   a a   v   v  a a
                J  J  aaaaa   V V  aaaaa
                 JJ  a     a   V  a     a""";
        return r;
    }

    public static double ex009(double n) {
        /*
         * Write a Java program to compute the specified expressions and print the
         * output.
         */
        return n;
    }

    public static double ex010(double n) {
        /* Write a Java program to compute a specified formula: */
        return n;
    }

    private static double areaCirculo(double raio) {
        return Math.PI * (raio * raio);
    }

    private static double areaRetangulo(double lado1, double lado2) {
        return lado1 * lado2;
    }

    private static double perimetroCirculo(double raio) {
        return Math.PI * 2 * raio;
    }

    private static double perimetroRetangulo(double lado1, double lado2) {
        return 2 * (lado1 + lado2);
    }

    public static String ex011(double radius) {
        /* Write a Java program to print the area and perimeter of a circle. */
        double p = perimetroCirculo(radius);
        double a = areaCirculo(radius);

        String per = "Perimeter is = " + p + "\n";
        String ar = "Area is = " + a;
        return per + ar;
    }

    public static double ex012(double n1, double n2, double n3) {
        /*
         * Write a Java program that takes three numbers as input
         * to calculate and print the average of the numbers.
         */
        return (n1 + n2 + n3) / 3;
    }

    public static String ex013(double l1, double l2) {
        /* Write a Java program to print the area and perimeter of a rectangle. */
        double a = areaRetangulo(l1, l2);
        double p = perimetroRetangulo(l1, l2);
        String ar = "Area is " + String.format("%.1f * %.1f = %.2f\n", l1, l2, a);
        String per = "Perimeter is " + String.format("%d * (%.1f + %.1f) = %.2f\n", 2, l1, l2, p);
        return ar + per;
    }

    public static String ex014() {
        /* Write a Java program to print an American flag on the screen. */
        return """
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
    }

    public static String ex015(int n1, int n2) {
        /* Write a Java program to swap two variables. */
        String f = "";
        f += "n1 vale " + n1;
        f += "\nn2 vale " + n2;
        n1 = n2 + n1;
        n2 = n1 - n2;
        n1 -= n2;
        f += "\nn1 vale " + n1;
        f += "\nn2 vale " + n2;
        return f;
    }

    public static String ex016() {
        /* Write a Java program to print a face. */
        return """
                 +""\"""+
                [| o o |]
                 |  ^  |
                 | '-' |
                 +-----+
                    """;
    }

    /**
     * Esse método julga se uma String é composta por apenas '0' e/ou '1'
     * 
     * @param bin String informada para análise se ela está em formato binário
     * @return True caso a String informada seja composta por elementos binários,
     *         False caso contrário.
     */
    public static boolean isBinary(String bin) {
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) != '0' && bin.charAt(i) != '1') {
                return false;
            }
        }
        return true;
    }

    public static String ex017(String bin1, String bin2) {
        /* Write a Java program to add two binary numbers. */
        if (!isBinary(bin1))
            return "primeiro argumento não binario";
        if (!isBinary(bin2))
            return "segundo argumento não binario";

        String r = "Sum of two binary numbers: ";
        int soma = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        String b = Integer.toBinaryString(soma);
        return r + b;
    }

    public static String ex018(String bin1, String bin2) {
        /* Write a Java program to multiply two binary numbers. */
        if (!isBinary(bin1))
            return "primeiro argumento não binario";
        if (!isBinary(bin2))
            return "segundo argumento não binario";

        String r = "Product of two binary numbers: ";
        int mult = Integer.parseInt(bin1, 2) * Integer.parseInt(bin2, 2);
        String b = Integer.toBinaryString(mult);
        return r + b;
    }

    public static String ex019(int dec) {
        /* Write a Java program to convert a decimal number to binary number. */
        return "Binary number is: " + Integer.toBinaryString(dec);
    }

    public static String ex020(int dec) {
        /* Write a Java program to convert a decimal number to hexadecimal number. */
        return "Hexadecimal number is : " + Integer.toHexString(dec).toUpperCase();
    }

    public static String ex021(int dec) {
        /* Write a Java program to convert a decimal number to octal number. */
        return "Octal number is: " + Integer.toOctalString(dec).toUpperCase();
    }

    public static String ex022(String binary) {
        /* Write a Java program to convert a binary number to decimal number. */
        if (!isBinary(binary))
            return "argumento não binario";
        return "Decimal number is: " + Integer.parseInt(binary, 2);
    }

    public static String ex023(String binary) {
        /* Write a Java program to convert a binary number to hexadecimal number. */
        if (!isBinary(binary))
            return "argumento não binario";
        return "HexaDecimal value: " + Integer.toHexString(Integer.parseInt(binary, 2)).toUpperCase();
    }

    public static String ex024(String binary) {
        /* Write a Java program to convert a binary number to a Octal number. */
        if (!isBinary(binary))
            return "argumento não binario";
        return "Octal number: " + Integer.toOctalString(Integer.parseInt(binary, 2)).toUpperCase();
    }
    
    /**
     * Esse método julga se uma String está com formato octal
     * 
     * @param octal String informada para análise se ela está em formato octal
     * @return True caso a String informada seja composta por elementos octais,
     *         False caso contrário.
     */
    public static boolean isOctal(String octal) {
        String oct = "01234567";
        for (int i = 0; i < octal.length(); i++) {
            if (!oct.contains("" + octal.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static String ex025(String octal) {
        /* Write a Java program to convert a octal number to a decimal number. */
        if (!isOctal(octal))
            return "argumento não octal";
        return "Equivalent decimal number: " + Integer.parseInt(octal, 8);
    }

    public static String ex026(String octal) {
        /* Write a Java program to convert a octal number to a binary number. */
        if (!isOctal(octal))
            return "argumento não octal";
        return "Equivalent binary number: " + Integer.toBinaryString(Integer.parseInt(octal, 8));
    }

    public static String ex027(String octal) {
        /* Write a Java program to convert a octal number to a hexadecimal number. */
        if (!isOctal(octal))
            return "argumento não octal";
        return "Equivalent hexadecimal number: " + Integer.toHexString(Integer.parseInt(octal, 8));
    }

    public static String ex028(String exa) {
        /* Write a Java program to convert a hexadecimal to a decimal number. */
        try {
            return "Equivalent decimal number is: " + Integer.parseInt(exa, 16);
        } catch (NumberFormatException ignoredException) {
            return "argumento não exadecimal";
        }
    }

    public static String ex029(String exa) {
        /* Write a Java program to convert a hexadecimal to a binary number. */
        try {
            return "Equivalent Binary Number is: " + Integer.toBinaryString(Integer.parseInt(exa, 16));
        } catch (NumberFormatException ignoredException) {
            return "argumento não exadecimal";
        }

    }

    public static String ex030(String exa) {
        /* Write a Java program to convert a hexadecimal to a octal number. */
        try {
            return "Equivalent of octal number is: " + Integer.toOctalString(Integer.parseInt(exa, 16));
        } catch (NumberFormatException ignoredException) {
            return "argumento não exadecimal";
        }
    }

}
