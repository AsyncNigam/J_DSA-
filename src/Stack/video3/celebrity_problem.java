package Stack.video3;

import java.util.Stack;

public class celebrity_problem {
    public int celebrity(int mat[][]) {
        // code here

        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<mat.length;i++)st.push(i);

        while(st.size()>1){
            int a=st.pop();
            int b=st.pop();
            boolean aflag=true;
            boolean bflag=true;
            if(mat[a][b]==1){ // a is not celeb
                aflag=false;
            }
            else{ // b is not celeb
                bflag=false;
            }
            if(mat[b][a]==1){ //b is not celeb
                bflag=false;
            }
            else{   //a is not celeb
                aflag=false;
            }
            if(aflag)st.push(a);
            if(bflag)st.push(b);

        }

        if(st.isEmpty())return -1;

        int ele=st.pop();
        for(int j=0;j<mat.length;j++){
            if(j==ele)continue;
            if(mat[ele][j]==1)return -1;
        }
        for(int i=0;i<mat.length;i++){
            if(i==ele)continue;
            if(mat[i][ele]==0)return -1;
        }
        return ele;


    }
}
