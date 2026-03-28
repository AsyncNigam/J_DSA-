package Binary_tree.video1;

public class maximum_level_sum_bTree {
//    my approach by direct implementation of levelOrder traversal


//    class Solution {
//     class Pair {
//        TreeNode node;
//        int level;
//        Pair(TreeNode node,int level) {
//            this.node = node;
//            this.level=level;
//        }
//    }
//
//    public int maxLevelSum(TreeNode root) {
//        List<List<Integer>> arr=levelOrder(root);
//        int sum=Integer.MIN_VALUE;
//        int idx=0;
//        for(int i=0;i<arr.size();i++){
//            int s=0;
//            for(int j=0;j<arr.get(i).size();j++){
//                s+=arr.get(i).get(j);
//            }
//            if(sum<s){
//                sum=s;
//                idx=i+1;
//            }
//        }
//        return idx;
//    }
//     public List<List<Integer>> levelOrder(TreeNode root) {
//            if (root == null) return new ArrayList<>();
//            List<List<Integer>> list=new ArrayList<>(levels(root));
//            for(int i=0;i<levels(root);i++){
//                list.add(new ArrayList<>());
//            }
//            Queue<Pair> q=new LinkedList<>();
//
//            q.add(new Pair(root,0));
//            while(q.size()>0){
//                Pair front=q.remove();
//                list.get(front.level).add(front.node.val);
//                if(front.node.left!=null)q.add(new Pair(front.node.left,front.level+1));
//                if(front.node.right!=null)q.add(new Pair(front.node.right,front.level+1));
//            }
//            return list;
//        }
//        int levels(TreeNode root){
//            if(root==null)return 0;
//            return 1+Math.max(levels(root.left),levels(root.right));
//        }
//}



}
