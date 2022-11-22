package collections.rodi38;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
Write a Java program to sort a given array list
 */
public class Ex008 {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        cores.add("Red");
        cores.add("Blue");
        cores.add("Green");
        cores.add("Yellow");
        cores.add("Pink");
        System.out.println(cores);
        Collections.sort(cores);
        System.out.println(cores);
    }
}
