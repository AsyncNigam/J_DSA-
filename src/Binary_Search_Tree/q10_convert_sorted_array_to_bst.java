package Binary_Search_Tree;


//here we are going like low high and mid
//something likely binary search
public class q10_convert_sorted_array_to_bst {
    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            int n=nums.length;
            return convert(nums,0,n-1);
        }

        TreeNode convert(int[] arr, int low,int high){
            if(low>high)return null;
            int mid=(low+high)/2;
            TreeNode root=new TreeNode(arr[mid]);
            root.left=convert(arr,low,mid-1);
            root.right=convert(arr,mid+1,high);
            return root;

        }
    }
}
