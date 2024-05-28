public class BinaryTree29 {
    Node29 root;

    boolean isEmpty() {
        return root == null; // Corrected here
    }

    void add(int data) {
        if (isEmpty()) { // If tree is empty
            root = new Node29(data);
        } else {
            Node29 current = root;
            while (true) {
                if (data < current.data) { // Corrected here
                    if (current.left == null) {
                        current.left = new Node29(data); // Corrected here
                        break;
                    } else {
                        current = current.left; // Corrected here
                    }
                } else if (data > current.data) { // Corrected here
                    if (current.right == null) {
                        current.right = new Node29(data); // Corrected here
                        break;
                    } else {
                        current = current.right; // Corrected here
                    }
                } else { //data is already exist
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        Node29 current = root;
        while (current != null) {
            if (current.data == data) {
                return true;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    void traversePreOrder(Node29 node) {//method traverse digunakan untuk mengunjungi dan menampilkan data dari setiap node secara berurutan
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node29 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node29 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node29 getSuccessor(Node29 deleteNode) { //digunakan ketika proses penghapusan node yang memiliki 2 child
        Node29 successor = deleteNode.right;
        Node29 successorParent = deleteNode;
        while(successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != deleteNode.right) {
            successorParent.left = successor.right;
            successor.right = deleteNode.right;
        }
        return successor;
    }

    void delete(int data) {
        if(isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        // find node (current) that will be deleted
        Node29 parent = root;
        Node29 current = root;
        boolean isLeftChild = false;
        while(current != null) {
            if(current.data == data) {
                break;
            } else if(data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if(data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        } //proses penghapusan didalam method delete() terhadap node current yang telah ditemukan
        if(current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            //if there is no child, simply delete it
            if(current.left == null && current.right == null) {
                if(current == root) {
                    root = null;
                } else {
                    if(isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if(current.left == null) { //if there is 1 child again
                if(current == root) {
                    root = current.right;
                } else {
                    if(isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if(current.right == null) { //if there is 1 child left
                if(current == root) {
                    root = current.left;
                } else {
                    if(isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { //if there are 2 children
                Node29 successor = getSuccessor(current);
                if(current == root) {
                    root = successor;
                } else {
                    if(isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
}
