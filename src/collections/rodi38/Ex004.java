package collections.rodi38;
import java.util.ArrayList;
/*
 Write a Java program to retrieve an element (at a specified index) from a given array list.
 */

public class Ex004 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rodrigo");
        lista.add("Jose");
        lista.add("Lula");
        String elemento = lista.get(2);
        System.out.println(elemento);
    }
}
