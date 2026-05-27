package Binary_Search_Tree;

public class q9_convert_bst_to_gst {
//  by inOrder store in arraylist then from last index of arraylist update     O(n)
//    class Solution {
//        public TreeNode convertBST(TreeNode root) {
//            List<TreeNode> ans=new ArrayList<>();
//            inOrder(root,ans);
//            int sum=0;
//            for(int i=ans.size()-1;i>=0;i--){
//                sum += ans.get(i).val;
//                ans.get(i).val = sum;
//            }
//            return root;
//        }
//        void inOrder(TreeNode root, List<TreeNode> ans){
//            if(root==null)return;
//            inOrder(root.left, ans);
//            ans.add(root);
//            inOrder(root.right, ans);
//        }
//    }



//    instead of going inorder and then reversing the arraylist then printing or starting from the end of the arraylist we can do like
//    *** reverse inorder , in inorder we go left then doing then right , but in reverse inorder let's go 1st right , then doing then left
//    By this reverse inorder , things will get stored in arraylist in descending order , so we will do not need to reverse the array or start from last

//    O(n)

//    class Solution {
//        public TreeNode convertBST(TreeNode root) {
//            List<TreeNode> ans=new ArrayList<>();
//            rev_inOrder(root,ans);
//            int sum=0;
//            for(int i=0;i<ans.size();i++){
//                sum += ans.get(i).val;
//                ans.get(i).val = sum;
//            }
//            return root;
//        }
//        void rev_inOrder(TreeNode root, List<TreeNode> ans){
//            if(root==null)return;
//            rev_inOrder(root.right, ans);
//            ans.add(root);
//            rev_inOrder(root.left, ans);
//        }
//    }


//    without any extra arraylist


//    this  approach will give you error because int is pass by value that's why if we make sum as global variable that can be the answer

//    class Solution {
//    public TreeNode convertBST(TreeNode root) {
//            int sum=0;
//            rev_inOrder(root,sum);
//            return root;
//    }
//    void rev_inOrder(TreeNode root,int sum){
//        if(root==null)return;
//        rev_inOrder(root.right, sum);
//        sum+=root.val;
//        root.val=sum;
//        rev_inOrder(root.left, sum);
//    }
//}



//    by making global variable

//        class Solution {
//            int sum=0;
//            public TreeNode convertBST(TreeNode root) {
//                rev_inOrder(root);
//                return root;
//            }
//            void rev_inOrder(TreeNode root){
//                if(root==null)return;
//                rev_inOrder(root.right);
//                sum+=root.val;
//                root.val=sum;
//                rev_inOrder(root.left);
//            }
//        }

//        without making global variable and without making extra arraylist
//        we can store like this

    class Solution {
        public TreeNode convertBST(TreeNode root) {
            rev_inOrder(root, 0);
            return root;
        }

        // Change return type to int to pass the sum back up the chain
        int rev_inOrder(TreeNode root, int currentSum) {
            if (root == null) return currentSum;

            // 1. Go right, and catch the updated sum returning from the right subtree
            currentSum = rev_inOrder(root.right, currentSum);

            // 2. Process the current node
            currentSum += root.val;
            root.val = currentSum;

            // 3. Go left, passing the new sum down, and return the final result
            return rev_inOrder(root.left, currentSum);
        }
    }

}
