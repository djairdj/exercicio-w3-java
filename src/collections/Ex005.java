package collections;
import java.util.ArrayList;

/*
Write a Java program to update specific array element by given element.
 */
public class Ex005 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rodrigo");
        lista.add("Jose");
        lista.add("Lula");
        System.out.println(lista);
        lista.set(2, "Robertinho");
        System.out.println(lista);
    }
}
