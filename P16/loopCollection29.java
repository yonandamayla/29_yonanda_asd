import java.util.Stack;
import java.util.Collections;
import java.util.Iterator;

public class loopCollection29 {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.push("Orange");
        fruits.push("Watermelon");
        fruits.push("Leci");
        fruits.push("Salak");

        // Menambahkan "Mango", "Guava", dan "Avocado"
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Avocado");

        // Melakukan sorting
        Collections.sort(fruits);

        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());

        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }
        
        fruits.add("Melon");
        fruits.add("Durian");
        
        // Mengganti elemen terakhir dengan "Strawberry"
        if (!fruits.isEmpty()) {
            fruits.set(fruits.size() - 1, "Strawberry");
        }
        
        System.out.println("");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");

        /*fruits.push("Melon");
        fruits.push("Durian");
        System.out.println("");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");8*/
        
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
    }
};

// hasil modifikasi no 4 praktikum 2
/*import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());

        while (!fruits.isEmpty()) {
            System.out.printf("%s ", fruits.remove(fruits.size() - 1));
        }

        fruits.add("Melon");
        fruits.add("Durian");
        System.out.println("");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
    }
};*/
