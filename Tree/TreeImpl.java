package Tree;

public class TreeImpl {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BuildTree {
        int index = -1;

        Node buildTree(int[] nodes) {
            index++;

            if(nodes[index] == -1) return null;

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }

        public void preOrderTraversal(Node root) {
            //base case to avoid stackOverFlow exception
            if(root == null) return;

            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

        public void inOrderTraversal(Node root) {
            if(root == null) return;

            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }

        public void postOrderTraversal(Node root) {
            if(root == null) return;

            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }
    
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1}; // -1 means null value

        BuildTree tree = new BuildTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        //Tree Traversal...
        //a) PreOrder traverse -> root, left subtree, right subtree
        System.out.print("PreOrder traversal: ");
        tree.preOrderTraversal(root);

        //b) InOrder traverse -> left subtree, root, right subtree
        System.out.print("\nInOrder traversal: ");
        tree.inOrderTraversal(root);

        //b) InOrder traverse -> left subtree, right subtree, root
        System.out.print("\nPostOrder traversal: ");
        tree.postOrderTraversal(root);
    }
}
