import strutture.Heap;

public class HeapTest {

    public static void main(String[] args) {

        int[] a = {90, 66, 57, 31, 26, 32, 3, 59, 63, 58};

        Heap h = new Heap(a);
        h.PrintAll();
        h.BuildMinHeap();
        h.PrintInfo();
        h.BuildMaxHeap();
        h.PrintInfo();
        h.HeapSort();
        h.PrintInfo();
    }

}
