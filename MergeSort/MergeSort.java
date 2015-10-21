/*
 * Java Program to Implement Merge Sort
 */
 
public class MergeSort 
{
    /* Merge Sort function */
    public static void sort(int[] a, int low, int high) 
    {
        int N = high - low;         
        if (N <= 1) 
            return; 
        int mid = low + N/2; 
        // recursively sort 
        sort(a, low, mid); 
        sort(a, mid, high); 
        // merge two sorted subarrays
        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++) 
        {
            if (i == mid)  
                temp[k] = a[j++];
            else if (j == high) 
                temp[k] = a[i++];
            else if (a[j]<a[i]) 
                temp[k] = a[j++];
            else 
                temp[k] = a[i++];
        }    
        for (int k = 0; k < N; k++) 
            a[low + k] = temp[k];         
    }
    /* Main method */
    public static void main(String[] args) 
    {    

        System.out.println("\n** Merge Sort Demo **");

        int[] arr = {100,25,60,3,13};

        /* Print unsorted Array */
        System.out.println("\nElements before sorting "); 
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();

        sort(arr, 0, arr.length);

        /* Print sorted Array */
        System.out.println("\nElements after sorting ");        
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");            
        System.out.println();            
    }    
}