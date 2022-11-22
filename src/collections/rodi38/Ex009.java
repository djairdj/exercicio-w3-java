package collections.rodi38;
import java.util.ArrayList;

/*
Write a Java program to copy one array list into another.
 */
public class Ex009 {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        ArrayList<String> copiaArray = new ArrayList<>();
        cores.add("Red");
        cores.add("Blue");
        cores.add("Green");
        cores.add("Yellow");
        cores.add("Pink");
        System.out.println("Array original: " + cores);
        System.out.println("Array copia: " + copiaArray);
        copiaArray = cores;
        System.out.println("Array copia após a cópiar o original: " + copiaArray);
        System.out.printf("Array original: %s \n Array copia: %s", cores, copiaArray);

    }
}
