package Queue.video2;


// here we are creating a circular array with initial capacity, then if we add more than that capacity it will show error , there will be 2 pointers f , r . f will point to the starting of the Queue , r will point to the end of the Queue . add we add element add in array indexed position and then r++ , if we want to remove() then f++, then again to fill the previous indexes before the f , we maintain a variable size to know the size of the queue , if size is not equals with capacity but the r is last index of array t means we have removed some elements . for that the f has been increased . for that we bring again r to initial then again r++ will be done when elements are being added .

class CircularQueue {
    int[] arr;
    int f;
    int r;
    int size;
    CircularQueue(int capacity){
        arr=new int[capacity];
    }
    void add(int val){
        if(size== arr.length){
            System.out.println("Queue is full !");
            return;
        }
        arr[r++]=val;
        if(r== arr.length)r=0;
        size++;
    }

    int remove(){
        if(size==0){
            System.out.println("Queue is Empty");
            return -1;
        }
        int frontVal=arr[f];
        f++;
        if(f== arr.length) f=0;
        size--;
        return frontVal;
    }

    int peek(){
        if(size==0){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[f];
    }

    void display(){
        if(size==0)return;
        if(f>=r){
            for(int i=f;i<arr.length;i++) System.out.print(arr[i]+" ");
            for(int i=0;i<r;i++) System.out.print(arr[i]+" ");
        }
        else for(int i=f;i<r;i++) System.out.print(arr[i]+" ");

        System.out.println();
    }
}

public class CircularArray{
    static void main() {
        CircularQueue q=new CircularQueue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(44);
        q.add(25);

        q.display();
        q.remove();
        q.display();
        q.remove();
        q.display();

        q.add(25);
        q.add(36);
        System.out.println(q.remove());
        q.add(89);
        q.display();
        System.out.println(q.peek());
    }
}
