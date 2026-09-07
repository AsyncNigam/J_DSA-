package Binary_tree.video3;

public class q2_construct_btree_pre_post {
    class Solution {
        public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
            int n=preorder.length;
            return build(0,n-1,0,n-1,preorder,postorder);
        }
        TreeNode build(int preLow,int preHigh, int postLow,int postHigh,int[] preorder, int[] postorder){
            if(preLow>preHigh || postLow>postHigh)return null;
            int val=preorder[preLow];
            TreeNode root=new TreeNode(val);
            if (preLow == preHigh) return root;
            int r=-1;
            for(int i=postLow;i<=postHigh;i++){
                if(postorder[i]==preorder[preLow+1]){r=i;break;}
            }
            int count=r-postLow;
            root.left=build(preLow+1,preLow+count+1,postLow,r,preorder,postorder);
            root.right=build(preLow+count+2,preHigh,r+1,postHigh,preorder,postorder);
            return root;
        }
    }
}
