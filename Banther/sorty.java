import java.util.Random;

public class sorty
{
    void merge(int arr[], int l, int m, int r){
// Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];

        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
        if (L[i] <= R[j]){
            arr[k] = L[i];
            i++;
        }
        else{
            arr[k] = R[j];
            j++;
        }
            k++;
        }
        /* Copy remaining elements of L[] if any */
        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r){
            if (l < r)
        {
        // Find the middle point
        int m = (l+r)/2;

        // Sort first and second halves
        sort(arr, l, m);
        sort(arr , m+1, r);

        // Merge the sorted halves
        merge(arr, l, m, r);
        }
    }

    /* l is for left index and r is right index of the
    sub-array of arr to be sorted */
    void mergeSort(int arr[], int l, int r){
    if (l < r)
        {
        // Same as (l+r)/2, but avoids overflow for
        // large l and h
        int m = l+(r-l)/2;

        // Sort first and second halves
        mergeSort(arr, l, m);
        mergeSort(arr, m+1, r);

        merge(arr, l, m, r);
        }
    }
    public static void main (String [] args){
        sorty me = new sorty();
        Random Make = new Random();
        int [] ary = new int[10000000];
        for (int i =0; i<ary.length; i++)
        {
            ary[i] = Make.nextInt(10000000);
        }
        for (int i =9999000; i<ary.length; i++)
        {
            System.out.println(ary[i]);
        }
        long startTime = System.nanoTime();
        me.mergeSort(ary, 0, ary.length-1);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime)/1000000 ;
        for (int i =9999000; i<ary.length; i++)
        {
            System.out.println(ary[i]);
        }
        System.out.println("this method took " + duration +" milliseconds");
    }
}
