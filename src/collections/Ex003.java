package collections;

import java.util.ArrayList;

/*
Write a Java program to insert an element into the array list at the first position
 */
public class Ex003 {
    public static void main(String[] args) {
        ArrayList<String> pessoas = new ArrayList<>();

        pessoas.add("Rodrigo");
        pessoas.add("Jose");
        pessoas.add("Lula");
        System.out.println(pessoas);
        pessoas.add(0, "Rocha");
        System.out.println(pessoas);
    }
}
