package Binary_tree.video2;

public class q8_flatten_bTree_to_LL {


//    by extra arrayList
//    class Solution {
//        public void flatten(TreeNode root) {
//            if(root==null)return;
//            ArrayList<TreeNode> list=new ArrayList<TreeNode>();
//            preOrder(root,list);
//            TreeNode temp=root;
//            for(int i=1;i<list.size();i++){ // here i starts from 1 to avoid cycle
//                temp.right=list.get(i);
//                temp.left=null;
//                temp=temp.right;
//            }
//
//        }
//
//        void preOrder(TreeNode root,ArrayList<TreeNode> list){
//            if(root==null)return;
//            list.add(root);
//            preOrder(root.left,list);
//            preOrder(root.right,list);
//        }
//    }

//    with recursion
class Solution {
    public void flatten(TreeNode root) {
        if(root==null)return;
        TreeNode rst=root.right;
        TreeNode lst=root.left;
        root.left=null;
        root.right=null;
        flatten(rst);
        flatten(lst);

        if(lst!=null){
            root.right=lst;
            while(lst.right!=null)lst=lst.right;
            lst.right=rst;
        }
//        if lst is null then directly connect root to rst
        else root.right=rst;
    }
}
}
