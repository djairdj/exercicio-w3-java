package arrays;

import java.text.NumberFormat;
import java.util.Locale;

public class Test {
    public static void main(String args[]) {
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(new Locale(Locale.ITALIAN.getCountry(), "IT"));
        double a = 270961.2345;
        System.out.println(dinheiro.format(a));
    }

}
