public class BinaryTreeArrayMain29 {
    public static void main(String[] args) {
        BinaryTreeArray29 bta = new BinaryTreeArray29(10);
        int[] data = { 6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.println("\nInorder traversal: ");
        bta.traverseInorder(0);
        int min = bta.findMin(0);
        int max = bta.findMax(0);
        System.out.println("\nMinimum value in the tree: " + min);
        System.out.println("Maximum value in the tree: " + max);
        System.out.println("\nLeaf nodes: ");
        bta.printLeaves(0);
        int leafCount = bta.countLeaves(0);
        System.out.println("\nNumber of leaf nodes: " + leafCount);
        System.out.println("\nAdding new data to the tree: ");
        bta.add(10);
        System.out.println("\nPreOrder traversal after adding new data: ");
        bta.traversePreOrder(0);
        System.out.println("\nPostOrder traversal after adding new data: ");
        bta.traversePostOrder(0);
        System.out.println("\n");
    }
}