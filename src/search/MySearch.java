package search;

public class MySearch {

//TODO: fix RBS
    public Integer RecursiveBinarySearch(Integer[] a, int low, int high, int k){
        if( low > high) return null;

        int mid = (high + low) / 2;

        if(a[mid] == k) return mid;

        if(a[mid] < k) RecursiveBinarySearch(a , mid + 1, high, k);

        if(a[mid] > k) RecursiveBinarySearch(a, low, mid - 1, k);
        return null;

    }

}
