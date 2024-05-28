public class BinaryTreeArray29 {
    int[] data;
    int idxLast;

    public BinaryTreeArray29(int size) {
        data = new int[10];
    }

    void populateData(int[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInorder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInorder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInorder(2 * idxStart + 2);
        }
    }
}


