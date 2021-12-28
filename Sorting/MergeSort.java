package Sorting;

/**
 * Like QuickSort, Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves, 
 * calls itself for the two halves, and then merges the two sorted halves.
 */

public class MergeSort {
    private static void divideArray(int[] arr, int low, int high) {
        //call again n again until lower index equal to higher index
        if(low<high) {
            int mid = low + (high-low)/2;

            //divide left side of array.. recursion call 
            divideArray(arr, low, mid);
            //divide right side of array
            divideArray(arr, mid+1, high);

            //merge array
            mergeArray(arr, low, mid, high);
        }
    }

    private static void mergeArray(int[] arr, int low, int mid, int high) {
        int[] mergeArr = new int[high-low+1];
        
        int index1 = low;
        int index2 = mid+1;
        int i = 0;

        while(index1 <= mid && index2 <= high) {
            if(arr[index1] <= arr[index2]) {
                mergeArr[i++] = arr[index1++];
            } else {
                mergeArr[i++] = arr[index2++];
            }
        }

        while(index1 <= mid) {
            mergeArr[i++] = arr[index1++];
        }

        while(index2 <= high) {
            mergeArr[i++] = arr[index2++];
        }

        for(int j = 0, k = low; j<mergeArr.length; j++, k++) {
            arr[k] = mergeArr[j];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        System.out.print("Before sort :");
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        divideArray(arr, 0, arr.length-1);

        System.out.print("Before sort :");
        for(int l = 0; l<arr.length; l++) {
            System.out.print(arr[l] + " ");
        }
    }
}
