package All_Contests.Weekly.contest5;

//https://leetcode.com/problems/find-root-of-a-colored-tree/

public class q3 {
    class Solution {
        boolean isParent(char cu, char cv){
            return (cu=='R' && cv=='B') || (cu=='B' && cv=='W') || (cu=='W' && cv=='R');
        }

        public int findColoredRoot(int[][] edges, String colors) {
            int n=colors.length();
            int[] inDegree=new int[n];
            int[] outDegree=new int[n];

            for(int[] edge:edges){
                int u=edge[0];
                int v=edge[1];

                char cu=colors.charAt(u);
                char cv=colors.charAt(v);

                if(cu==cv)return -1;

                if(isParent(cu,cv)){
                    outDegree[u]++;
                    inDegree[v]++;
                }
                else {
                    outDegree[v]++;
                    inDegree[u]++;
                }

            }

            int root=-1;
            for(int i=0;i<n;i++){
                if(inDegree[i]>1 || outDegree[i]>2)return -1;
                if(inDegree[i]==0)root=i;
            }
            return root;
        }
    }
}
