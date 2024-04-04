public class StackDemo29 {
    public static void main(String[] args) {
        Stack29 stack29 = new Stack29(10);
        stack29.push(8);
        stack29.push(12);
        stack29.push(18);
        stack29.print();
        stack29.pop();
        stack29.peek();
        stack29.pop();
        stack29.push(-5);
        stack29.print();
    }
}
