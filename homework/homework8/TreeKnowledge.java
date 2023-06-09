import java.util.*;

public class TreeKnowledge {
    // tree node
    public class BinaryTreeNode {
        String label;
        BinaryTreeNode left;
        BinaryTreeNode right;
        // constructor BinaryTreeNode
        public BinaryTreeNode(String label, BinaryTreeNode left, BinaryTreeNode right) {
            this.label = label;
            this.left = left;
            this.right = right;
        }
    }

    // fields 
    Scanner sc;
    BinaryTreeNode root;
    // constructor TreeKnowledge
    TreeKnowledge(Scanner sc) {
        this.sc = sc;
        root = new BinaryTreeNode("Komputer", null, null);
    }

    // input y/n
    public boolean YorN() {
        while (true) {
            String s = sc.next();
            if (s.startsWith("y")) return true;
            else if (s.startsWith("n")) return false;
        }
    }

    // print binary tree
    public void printBinaryTree(String prefix, BinaryTreeNode n, boolean isLeft) { 
        if (n != null) {
            System.out.println (prefix + (isLeft ? "├──── " : "└──── ") + n.label); // print label
            printBinaryTree(prefix + (isLeft ? "│     " : "      "), n.left, true); // print left child
            printBinaryTree(prefix + (isLeft ? "│     " : "      "), n.right, false); // print right child
        }
    }

    public void run() {
        while (true) {
            BinaryTreeNode x = root;
            System.out.println("Pikirkan sebuah benda! ");
            while (true) {
                if (x.left == null && x.right == null) {
                    System.out.println("Apakah benda tersebut " + x.label + " (y/n)? "); // program menebak
                    if (YorN()) {
                        System.out.println("Saya menang!"); // program menang jika tebakan benar lalu break
                        break;
                    }
                    else{
                        // input jawaban jika tebakan salah
                        System.out.println("Beritahu jawabanya");
                        sc.nextLine();
                        String jawaban = sc.nextLine();

                        // input pertanyaan 
                        System.out.println("Masukkan pertanyaan yang jika dijawab YES adalah " + jawaban + " dan jika dijawab NO adalah " + x.label);
                        String pertanyaan = sc.nextLine();
                        
                        // update tree
                        BinaryTreeNode kananBaru = new BinaryTreeNode(x.label, null, null); // child kanan, tebakan awal
                        BinaryTreeNode kiriBaru = new BinaryTreeNode(jawaban, null, null); // child kiri, jawaban 
                        x.label = pertanyaan; // update label 
                        x.left = kiriBaru; // update child kiri 
                        x.right = kananBaru; // update child kanan 
                        break;
                    }
                }
                System.out.println(x.label + " (y/n)? ");
                if (YorN()) x = x.left;
                else x = x.right;
            }
            System.out.println("Lanjut (y/n)? ");
            if (!YorN()) {
                System.out.println("Tree yang dihasilkan: ");
                printBinaryTree("", root, false);
                break;
            }
        }
    }

    public static void main(String[] args) {
        TreeKnowledge tk = new TreeKnowledge(new Scanner(System.in));
        tk.run();
    }
}

