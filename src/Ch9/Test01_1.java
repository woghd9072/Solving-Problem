package Ch9;

import java.util.LinkedList;

public class Test01_1 {
    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();
        int n[]={50,20,70,10,30,5,15,25,60,90,62,65,64,35};
        for (int i = 0; i < n.length; i++) tree.add(n[i]);
        System.out.println(tree.search(30));
        System.out.println(tree.search(33));
        System.out.println(tree);
        System.out.println(BinarySearchTree.inorder(tree.root));
    }
}
class BinarySearchTree {
    class BinaryTree {

        int key;
        BinaryTree left, right;
        public BinaryTree(int key) {
            this.key = key;
        }

        @Override
        public String toString() {
            return Integer.toString(key);
        }

    }
    BinaryTree root;

    public void add(int key) {
        BinaryTree newNode = new BinaryTree(key);
        if (root == null) root = newNode;
        else {
            BinaryTree tree = root;
            BinaryTree parent = null;

            while (true) {
                parent = tree;

                if (tree.key < key) {
                    tree = tree.right;
                    if (tree == null) {
                        parent.right = newNode;
                        return;
                    }
                }
                else if (tree.key > key) {
                    tree = tree.left;
                    if (tree == null) {
                        parent.left = newNode;
                        return;
                    }
                }
            }
        }
    }

    private BinaryTree add(BinaryTree tree, int key) {
        if (tree == null) return new BinaryTree(key);
        if (tree.key < key) tree.right = add(tree.right, key);
        else if (tree.key > key) tree.left = add(tree.left, key);
        else ; // value 삽입 시 else tree.value=value;
        return tree;
    }

    public BinaryTree search(int key) {
        return searchRecur(root, key);
    }

    public BinaryTree searchRecur(BinaryTree node, int key) {
        if (node == null) return null;
        if (node.key == key) return node;
        if (node.key < key) return searchRecur(node.right, key);
        else return searchRecur(node.left, key);
    }

    public static String inorder(BinaryTree root) {
        if (root == null) return "";
        return inorder(root.left) + " " + root.key + " " + inorder(root.right);
    }

    @Override
    public String toString() {
        return levelOrder().toString();
    }

    private LinkedList<BinaryTree> levelOrder() {
        LinkedList<BinaryTree> list = new LinkedList<>();
        LinkedList<BinaryTree> queue = new LinkedList<>();
        if (root != null) queue.addLast(root);
        while (!queue.isEmpty()) {
            BinaryTree node = queue.removeFirst();
            list.add(node);
            if (node.left != null) queue.addLast(node.left);
            if (node.right != null) queue.addLast(node.right);
        }
        return list;
    }
}
