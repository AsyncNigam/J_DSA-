package Binary_tree.video1;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    Node left;
    Node right;
    int val;

    Node(int val) {
        this.val = val;
    }
}

//this pair we have created for linewise level order printing of the tree
class Pair {
    Node node;
    int level;

    Pair(Node node,int level) {
        this.node = node;
        this.level=level;
    }
}


public class implementation {
    static void main(String[] args) {
        //      3
        //    /   \
        //   -4     2
        //  / \   / \
        // 1  1 6   9

        Node a = new Node(3);
        Node b = new Node(-4);
        Node c = new Node(2);
        Node d = new Node(1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
//        display(a);

//        System.out.println(size(a));
//        System.out.println(sum_of_nodes_Btree(a));
//        System.out.println(product_of_nodes(a));
//        System.out.println(pro_non0(a));
//        System.out.println(max_val(a));
//        System.out.println(min_val(a));

//        display(a);

//        System.out.println(levels(a));
//        levelOrder(a);

        level_Order_Linewise(a);
    }



    private static void display(Node root){
        if(root==null)return;

//        this is preOrder
//        System.out.print(root.val+" ");
//        display(root.left);
//        display(root.right);

//        for inOrder
        display(root.left);
        System.out.print(root.val+" ");
        display(root.right);

//        for postOrder
//        display(root.left);
//        display(root.right);
//        System.out.print(root.val+" ");

    }

//    size of the binary tree
    static int size(Node root){
        if(root==null)return 0;
        return 1+size(root.left)+size(root.right);
    }

//    sum of values of nodes
    static int sum_of_nodes_Btree(Node root){
        if(root==null)return 0;
        return root.val+sum_of_nodes_Btree(root.left)+sum_of_nodes_Btree(root.right);
    }

//    for the product of nodes value
    static int product_of_nodes(Node root){
        if(root==null)return 1;
        return root.val*product_of_nodes(root.left)*product_of_nodes(root.right);
    }

//    for the product of non zero elements

    static int pro_non0(Node root){
        if(root==null)return 1;
        if(root.val==0) return pro_non0(root.left)*pro_non0(root.right);
        return root.val*pro_non0(root.left)*pro_non0(root.right);
    }

//    for maximum value in b tree
    static int max_val(Node root){
        if(root==null)return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max_val(root.left),max_val(root.right)));
    }

//    for minimum value in Binary tree
    static int min_val(Node root){
        if(root==null)return Integer.MAX_VALUE;
        return Math.min(root.val, Math.min(min_val(root.left),min_val(root.right)));
    }

//    for the levels of binary tree
    static int levels(Node root){
        if(root==null)return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }


//    levelOrder Breadth First Search
    static void levelOrder(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Node front=q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null)q.add(front.left);
            if(front.right!=null)q.add(front.right);
        }
        System.out.println();
    }

//    levelOrder linewise printing
    static void level_Order_Linewise(Node root){
        Queue<Pair> q=new LinkedList<>();
        int current_level=0;
        q.add(new Pair(root,0));
        while(q.size()>0){
            Pair front=q.remove();

            if(front.level!=current_level){ // this adds the new line
                current_level++;  // or we can do current_level=front.level same thing
                System.out.println();
            }

            System.out.print(front.node.val+" ");
            if(front.node.left!=null)q.add(new Pair(front.node.left,front.level+1));
            if(front.node.right!=null)q.add(new Pair(front.node.right,front.level+1));
        }
        System.out.println();
    }

}
