public class BinaryTreeArrayMain29 {
    public static void main(String[] args) {
        BinaryTreeArray29 bta = new BinaryTreeArray29(10);
        int[] data = { 6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.println("\nInorder traversal: ");
        bta.traverseInorder(0);
        System.out.println("\n");
    }
}
