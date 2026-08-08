import java.util.Arrays;
import java.util.Random;
import sorting.MySort;

public class SortingTest {
    
    public static void main(String[] args) {
        int size = 10;
        Random r = new Random();
        
        MySort sorter = new MySort(); // the sorter, an object that sorts arrays.

        int[] a = new int[size];

        for(int i = 0; i < size; i++){
            a[i] = abs(r.nextInt() % 100);
        }

        System.out.println(Arrays.toString(a));

        sorter.MergeSort(a, 0, a.length - 1);

        System.out.println(Arrays.toString(a));



    }

    public static int abs(int x){
        if(x < 0) x = -x;
        return x;
    }

}
