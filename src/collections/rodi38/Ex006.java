package collections.rodi38;

import java.util.ArrayList;

/*
Write a Java program to remove the third element from a array list
 */
public class Ex006 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rodrigo");
        lista.add("Jose");
        lista.add("Lula");
        System.out.println(lista);
        lista.remove(2);
        System.out.println(lista);
    }
}
