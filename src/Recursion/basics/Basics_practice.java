package Recursion.basics;

public class Basics_practice {

//    print n to 1
    static void print(int n){
        if(n==0)return;
        System.out.print(n+" ");
        print(n-1);
    }

//    print 1 to n
static void print_for(int n){
    if(n==0)return;
    print_for(n-1);
    System.out.print(n+" ");
}

// print 1 to n with extra parameter
    static void print_xtra(int s,int n){
        if(s>n)return;
        System.out.print(s+" ");
        print_xtra(s+1,n);
    }

//    print sum of n elements
    static int sum(int n){
        if(n==0)return 0;
        return n+sum(n-1);
    }

//    traversing an array using recursion
    static void traverse(int[] arr,int i){
        if(i==arr.length)return;
        System.out.print(arr[i++]+" ");
        traverse(arr,i);
    }

    static void main() {

//        print(5);
//        print_for(34);
//        print_xtra(1,50);
//        System.out.println(sum(10));
        traverse(new int[]{12,14,1,5,16},0);
    }
}
