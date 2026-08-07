package sorting;

public class MySort {
    
    public int[] InsertionSort(int[] a){

        int key, i;

        for( int j = 1; j < a.length; j++){
            key = a[j];
            i = j-1;
            while( (i >= 0) && (a[i] > key)){
                a[i+1] = a[i];
                i -= 1;
            }
            a[i+1] = key;
        }

        return a;
    }


    public int[] SelectionSort(int[] a){
        int min;
        for( int j = 0; j < a.length; j++){
            min = j;
            for( int i = j + 1; i < a.length; i++){
                if(a[i] < a[min]){
                    min = i;
                }
            }

            SwapValue(a, min, j);
        }

        return a;
    }

    

    // class of helper funtions that i need for some sorting algorithms:

    public void SwapValue(int[] a, int i, int j){
        int val = a[i];
        a[i] = a[j];
        a[j] = val;
    }

}
