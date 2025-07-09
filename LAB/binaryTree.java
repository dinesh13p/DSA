class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class binaryTree {
    Node root;

    // Constructor to initialize the tree
    public binaryTree() {
        root = null;
    }

    // Insert a new node
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // A helper method for inserting data recursively
    public Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    // In-order traversal to display the tree structure
    public void inorder() {
        printHeading("In-order Traversal");
        inorderRec(root);
        System.out.println();
    }

    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    // Find a node
    public boolean find(int data) {
        return findRec(root, data);
    }

    public boolean findRec(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        if (data < root.data) {
            return findRec(root.left, data);
        } else {
            return findRec(root.right, data);
        }
    }

    // Find the minimum value
    public int findMin() {
        return findMin(root);
    }

    public int findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    // Find the maximum value
    public int findMax() {
        return findMax(root);
    }

    public int findMax(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    // Print heading for better clarity
    public void printHeading(String heading) {
        System.out.println("\n=============================");
        System.out.println(heading);
        System.out.println("=============================");
    }

    // Main method to test the binaryTree class
    public static void main(String[] args) {
        binaryTree tree = new binaryTree();

        // Inserting nodes into the tree
        tree.printHeading("Inserting nodes into the tree...");
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.inorder();

        // Find node 40
        tree.printHeading("Searching for node 40...");
        System.out.println("Find 40: " + (tree.find(40) ? "Found" : "Not Found"));

        // Find node 25
        tree.printHeading("Searching for node 25...");
        System.out.println("Find 25: " + (tree.find(25) ? "Found" : "Not Found"));

        // Find minimum value
        tree.printHeading("Finding the minimum value...");
        System.out.println("Minimum value: " + tree.findMin());

        // Find maximum value
        tree.printHeading("Finding the maximum value...");
        System.out.println("Maximum value: " + tree.findMax());
    }
}