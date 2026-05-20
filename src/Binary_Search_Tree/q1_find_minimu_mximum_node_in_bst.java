package Binary_Search_Tree;

public class q1_find_minimu_mximum_node_in_bst {
    static void main() {
        TreeNode a=new TreeNode(5);
        TreeNode b=new TreeNode(10);
        TreeNode c=new TreeNode(15);
        TreeNode d=new TreeNode(4);
        TreeNode e=new TreeNode(6);

        a.right=b;
        b.right=c;
        a.left=d;
        b.left=e;

//              a
//             / \
//            d   b
//               / \
//              e   c

        TreeNode min=min_BST(a);
        TreeNode max=max_BST(a);

        System.out.println(min.val);
        System.out.println(max.val);

    }

    static TreeNode min_BST(TreeNode a){
        TreeNode temp=a;
        while(temp.left!=null){
            temp=temp.left;
        }
        return a;
    }
    static TreeNode max_BST(TreeNode a){
        TreeNode temp=a;
        while(temp.right!=null){
            temp=temp.right;
        }
        return a;
    }
}
