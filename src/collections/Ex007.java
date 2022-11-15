package collections;
import java.util.ArrayList;

/*
7. Write a Java program to search an element in a array list.

 */
public class Ex007 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Rodrigo");
        lista.add("Jose");
        lista.add("Lula");
        lista.add("Copa");
        System.out.println(lista);
        if (lista.contains("Copa")){
            System.out.println("A copa está na lista no indice " + lista.indexOf("Copa"));
        } else {
            System.out.println("A copa não está na lista");
        }
    }
}
