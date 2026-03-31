package Binary_tree.video3;

public class construct_binary_tree_pre_in {
    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            int n=preorder.length;
            return build(0,n-1,0,n-1,preorder,inorder);

        }
        TreeNode build(int preLow,int preHigh, int inLow,int inHigh,int[] preorder, int[] inorder){
            if(preLow>preHigh || inLow>inHigh)return null;
            int val=preorder[preLow];
            TreeNode root=new TreeNode(val);
            int r=-1;
            for(int i=inLow;i<=inHigh;i++){
                if(inorder[i]==val){r=i;break;}
            }
            int count=r-inLow;
            root.left=build(preLow+1,preLow+count,inLow,r-1,preorder,inorder);
            root.right=build(preLow+count+1,preHigh,r+1,inHigh,preorder,inorder);
            return root;
        }
    }
}
