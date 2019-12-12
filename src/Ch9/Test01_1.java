package Ch9;

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