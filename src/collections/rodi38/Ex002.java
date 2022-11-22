package collections.rodi38;

import java.util.ArrayList;

/*
Write a Java program to iterate through all elements in a array list
 */
public class Ex002 {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        cores.add("Red");
        cores.add("Blue");
        cores.add("Green");
        cores.add("Yellow");
        cores.add("Pink");
        for (int i = 0; i < cores.size(); i++) {
            System.out.println(cores.get(i));
        }
    }
}
