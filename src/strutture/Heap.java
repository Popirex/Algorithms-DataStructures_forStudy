package strutture;

import java.util.Arrays;

public class Heap {

    private int[] VAL;
    private int heapsize;
    private int length;

    public Heap(int heapsize){
        this.VAL = new int[heapsize + 1];
        this.heapsize = 0;
        this.length = heapsize;
    }

    public Heap(int[] array){
        this.VAL = new int[array.length + 1];
        for(int i = 1; i <= array.length; i++) this.VAL[i] = array[i-1];
        this.heapsize = array.length;
        this.length = array.length;
    }

    // Important Functions

    public void MinHeapify(int i){
        int l = Left(i);
        int r = Right(i);
        int smallest = i;

        if( ( l <= this.heapsize) && (this.VAL[l] < this.VAL[i])) smallest = l;
        if((r <= this.heapsize) && (this.VAL[r] < this.VAL[smallest])) smallest = r;
        if(smallest != i){
            SwapValue(i, smallest);
            MinHeapify(smallest);
        }
    }

    public void BuildMinHeap(){
        this.heapsize = this.length;
        for(int i = (int) Math.floor(this.length / 2) ; i >= 1; i--) MinHeapify(i);
    }


    public void MaxHeapify(int i){
        int l = Left(i);
        int r = Right(i);
        int biggest = i;

        if( ( l <= this.heapsize) && (this.VAL[l] > this.VAL[i])) biggest = l;
        if((r <= this.heapsize) && (this.VAL[r] > this.VAL[biggest])) biggest = r;
        if(biggest != i){
            SwapValue(i, biggest);
            MaxHeapify(biggest);
        }
    }

    public void BuildMaxHeap(){
        this.heapsize = this.length;
        for(int i = (int) Math.floor(this.length / 2) ; i >= 1; i--) MaxHeapify(i);

    }

    public void HeapSort(){
        this.BuildMaxHeap();
        for(int i = this.length; i >= 2; i--){
            this.SwapValue(i, 1);
            this.heapsize--;
            this.MaxHeapify(1);
        }
    }

    // Helper Functions
    private int Parent(int i){
        return (int) Math.floor(i/2);
    }

    private int Left(int i){
        return 2 * i;
    }

    private int Right(int i){
        return  2 * i + 1;
    }

    public void PrintAll(){
        System.out.println(Arrays.toString(this.VAL));
    }

    public void PrintInfo(){
        System.out.println("Heap Values: " + Arrays.toString(this.VAL));
        System.out.println("Heap size: " + this.heapsize);
        System.out.println("Heap length " + this.length);
    }

    private void SwapValue(int i, int j){
        int val = this.VAL[i];
        this.VAL[i] = this.VAL[j];
        this.VAL[j] = val;
    }

}
