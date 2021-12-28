package Sorting;

/**
 * Like Merge Sort, QuickSort is a Divide and Conquer algorithm. 
 * It picks an element as pivot and partitions the given array around the picked pivot. 
 * There are many different versions of quickSort that pick pivot in different ways. 
 * 
 * Worst case - 0(n^2)
 * Average case - 0(nlogn)
 */
public class QuickSort {
    private static void quickSort(int[] arr, int low, int high) {
        if(low<high) {
            int pivotPos = partition(arr, low, high);
            quickSort(arr, low, pivotPos-1);
            quickSort(arr, pivotPos+1, high);
        }
    }
    private static int partition(int[] arr, int low, int high) {
        int pivotPos = low-1, pivot = arr[high];

        for(int i=low; i<high; i++) {
            if(arr[i]<pivot) {
                pivotPos++;
                int temp = arr[pivotPos];
                arr[pivotPos] = arr[i];
                arr[i] = temp;
            }
        }

        pivotPos++;
        int temp = arr[pivotPos];
        arr[pivotPos] = arr[high];
        arr[high] = temp;
    
        return pivotPos;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        System.out.print("Before sort :");
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        quickSort(arr, 0, arr.length-1);

        System.out.print("Before sort :");
        for(int l = 0; l<arr.length; l++) {
            System.out.print(arr[l] + " ");
        }

        //Worst case occurs when pivot is always the smallest or the largest element
    }
}
