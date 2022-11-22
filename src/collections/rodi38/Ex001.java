package collections.rodi38;
import java.util.ArrayList;
import java.util.Scanner;

/*
1. Write a Java program to create a new array list,
 add some colors (string) and print out the collection.
 */
public class Ex001 {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        cores.add("Red");
        cores.add("Blue");
        cores.add("Green");
        cores.add("Yellow");
        cores.add("Pink");
        System.out.println(cores);

        /*System.out.println("Digite quantas cores quer adicionar: ");
        int quantidadeCores = sc.nextInt();


        for (int i = 0; i < quantidadeCores ; i++) {
            System.out.printf("Digite a cor de numero %d: ", i+1);
            cores.add(sc.next());
        }

        System.out.println(cores);*/
    }
}
