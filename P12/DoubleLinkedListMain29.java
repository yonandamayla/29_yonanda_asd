import java.util.NoSuchElementException;

public class DoubleLinkedListMain29 {
    public static void main(String[] args) {
        DoubleLinkedLists29 dll = new DoubleLinkedLists29();
        // dll.print();
        // System.out.println("Size: " + dll.size());
        // System.out.println("=========================");
        // dll.addFirst(3);
        // dll.addLast(4);
        // dll.addFirst(7);
        // dll.print();
        // System.out.println("Size: " + dll.size());
        // System.out.println("=========================");
        // try {
        //     dll.add(40, 1);
        // } catch (IndexOutOfBoundsException e) {
        //     System.out.println("Error: " + e.getMessage());
        // } catch (Exception e) {
        //     System.out.println("Unexpected error: " + e.getMessage());
        // }
        // dll.print();
        // System.out.println("Size: " + dll.size());
        // System.out.println("=========================");
        // dll.clear();
        // dll.print();
        // System.out.println("Size: " + dll.size());
        // System.out.println("========================================");

        // dll.addLast(50);
        // dll.addLast(40);
        // dll.addLast(10);
        // dll.addLast(20);
        // dll.print();
        // System.out.println("Size: " + dll.size()); 
        // System.out.println("=========================");
        // try {
        //     dll.removeFirst();
        // } catch (NoSuchElementException e) {
        //     System.out.println("Error: " + e.getMessage());
        // } catch (Exception e) {
        //     System.out.println("Unexpected error: " + e.getMessage());
        // }
        // dll.print();
        // System.out.println("Size: " + dll.size()); 
        // System.out.println("=========================");
        // try {
        //     dll.removeFirst();
        // } catch (NoSuchElementException e) {
        //     System.out.println("Error: " + e.getMessage());
        // } catch (Exception e) {
        //     System.out.println("Unexpected error: " + e.getMessage());
        // }
        // dll.print();
        // System.out.println("Size: " + dll.size()); 
        // System.out.println("=========================");
        // try {
        //     dll.remove(1); 
        // } catch (IndexOutOfBoundsException e) {
        //     System.out.println("Error: " + e.getMessage());
        // } catch (Exception e) {
        //     System.out.println("Unexpected error: " + e.getMessage());
        // }
        // dll.print();
        // System.out.println("Size: " + dll.size());

        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("=========================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("=========================");
        try {
            dll.add(40, 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("=========================");
        try {
            System.out.println("Data awal pada linked list adalah : " + dll.getFirst());
        } catch (NoSuchElementException e) {
            System.out.println("Linked list is empty. No first element.");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        try {
            System.out.println("Data akhir pada linked list adalah : " + dll.getLast());
        } catch (NoSuchElementException e) {
            System.out.println("Linked list is empty. No last element.");
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        try {
            System.out.println("Data indeks ke-1 pada linked list adalah : " + dll.get(1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}
