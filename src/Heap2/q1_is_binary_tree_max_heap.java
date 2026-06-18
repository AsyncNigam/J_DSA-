package Heap2;

public class q1_is_binary_tree_max_heap {
    class Node {
        int data;
        Node left, right;
        Node(int d) {
            data = d;
            left = right = null;
        }
    }
    class Solution {
        static int size;
        public boolean isHeap(Node root) {
            size=size(root);
            return isMaxHeap(root) && isCBT(root,1);
        }

        int size(Node root){
            if(root==null)return 0;
            return 1+size(root.left)+size(root.right);
        }

        boolean isCBT(Node root, int idx){
            if(root==null)return true;
            if(idx>size)return false;
            return isCBT(root.left, 2*idx) && isCBT(root.right, 2*idx+1);

        }

        boolean isMaxHeap(Node root) {
            if (root == null)return true;
            int leftVal = (root.left != null) ? root.left.data : Integer.MIN_VALUE;
            int rightVal = (root.right != null) ? root.right.data : Integer.MIN_VALUE;
            if (root.data <= leftVal || root.data <= rightVal)return false;
            return isMaxHeap(root.left) && isMaxHeap(root.right);
        }
    }
}
