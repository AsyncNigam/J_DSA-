package Binary_tree.video2;

//https://www.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/1
class Node {
   Node left;
    Node right;
    int data;

    Node(int val) {
        this.data = val;
    }
}
public class minimu_distance_between_2_nodes_btree {
    class GfG {
        int findDist(Node root, int a, int b) {
            Node lca=lca(root,a,b);

            int[] dis={0,0};

            getPath(lca,0,a,b,dis);
            return dis[0]+dis[1];
        }

        void getPath(Node root,int depth,int a,int b,int[] dis){
            if(root==null)return;

            if(root.data==a)dis[0]=depth;
            if(root.data==b)dis[1]=depth;
            getPath(root.left,depth+1,a,b,dis);
            getPath(root.right,depth+1,a,b,dis);

        }


        Node lca(Node root,int a,int b){
            if(root==null)return null;
            if(root.data==a || root.data==b)return root;
            Node left=lca(root.left,a,b);
            Node right=lca(root.right,a,b);
            if(left!=null && right!=null)return root;
            if(left!=null) return left;
            if(right!=null) return right;
            return null;
        }
    }
}
