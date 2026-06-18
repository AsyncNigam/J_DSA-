package Heap2;

class MinHeap {
    private int[] arr;
    private int idx;

    public MinHeap(int size) {
// Extra space to ignore index 0 for 1-based indexing
        this.arr = new int[size + 1];
        this.idx = 1;
    }

    // Peek: Returns the minimum element
    public int peek() {
        return arr[1];
    }

    // Add: Inserts value and performs up-heapify
    public void add(int val) {
        arr[idx] = val;
        int i = idx;
        idx++;
// Up-heapify logic
        while (i > 1 && arr[i] < arr[i / 2]) {
            swap(i, i / 2);
            i = i / 2;
        }
    }

    // Remove: Removes root and performs down-heapify
    public int remove() {
        int min = arr[1];
        idx--;
        arr[1] = arr[idx];
        downHeapify(1);
        return min;
    }

    private void downHeapify(int i) {
        while (2 * i < idx) {
            int left = 2 * i;
            int right = 2 * i + 1;
            int smallest = left;

            if (right < idx && arr[right] < arr[left]) {
                smallest = right;
            }

            if (arr[i] > arr[smallest]) {
                swap(i, smallest);
                i = smallest;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

public class q3_Minheap_implementation {
    static void main() {

    }
}




