public class SSLMain29 {
    public static void main(String[] args) {
        LinkedList29 myLinkedList29 = new LinkedList29();

        myLinkedList29.print();
        myLinkedList29.addFirst(800);
        myLinkedList29.print();
        myLinkedList29.addFirst(700);
        myLinkedList29.print();
        myLinkedList29.addLast(500);  
        myLinkedList29.print();
        myLinkedList29.insertAfter(700, 300);
        myLinkedList29.print(); 

        System.out.println("Data pada index ke-1 : " + myLinkedList29.getData(1));
        System.out.println("Data 300 berada pada index ke-" + myLinkedList29.indexOf(300));
        myLinkedList29.remove(300);
        myLinkedList29.print();
        myLinkedList29.removeFirst();
        myLinkedList29.print();
        myLinkedList29.removeLast();    
        myLinkedList29.print();
    }
}
