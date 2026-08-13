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


    // recursive MergeSort
    public void MergeSort(int[] a,int  p,int  r){

        if( p < r){
            int q = ( (p + r) / 2);
            MergeSort(a, p, q);
            MergeSort(a, q+1, r);
            Merge(a, p, q, r);
        }

    }


    public void QuickSort(int[] A, int p, int r){
        if( p < r){
            int q = Partition(A, p, r);
            QuickSort(A, p, q - 1);
            QuickSort(A, q + 1, r);
        }
    }

    

    // class of helper funtions that i need for some sorting algorithms:

    public void SwapValue(int[] a, int i, int j){
        int val = a[i];
        a[i] = a[j];
        a[j] = val;
    }

    public void Merge(int[] a , int p, int q, int r){
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i = 0; i < n1; i++) L[i] = a[p + i] ;
        for(int j = 0; j < n2; j++) R[j] = a[q  +1 + j] ;
        int i = 0;
        int j = 0;

        for(int k = p; k <= r; k++){

            if(i < n1){
                if( j < n2){
                    if(L[i] <= R[j]){
                        CopyFromL(a, L, i, k);
                        i++;
                    }
                    else{
                        CopyFromR(a, R, j, k);
                        j++;
                    }
                }
                else{CopyFromL(a, L, i, k);
                    i++;
                }
            }
            else{
                CopyFromR(a, R, j, k);
                j++;
            }

        }

    }

    public void CopyFromR(int[] A,int[] R, int j,int k){
        A[k] = R[j];
    }

    public void CopyFromL(int[] A , int[] L, int i , int k){
        A[k] = L[i];
    }

    public int Partition(int[] A, int p, int r){
        int x = A[r];
        int i = p - 1;

        for(int j = p; j <= r - 1; j++){
            if(A[j] <= x){
                i++;
                SwapValue(A, i, j);
            }
        }
        SwapValue(A, i + 1, r);
        return i + 1;

    }

}
