package collections;
import java.util.ArrayList;
import java.util.Collections;

public class Ex010 {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();
        cores.add("Red");
        cores.add("Blue");
        cores.add("Green");
        cores.add("Yellow");
        cores.add("Pink");
        System.out.println("Array original: " + cores);
        Collections.shuffle(cores);
        System.out.println("Array embaralhado: " + cores);


    }
}
