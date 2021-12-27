package Sorting;

//In this sort algo we start from i+1 and check with previous element is right place or not
// if not on the place then swap...

public class InsertionSort {
    private static void insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
           int tempVal = arr[i], j=i;

            while(j>0 && arr[j-1] > tempVal) {
                arr[j] = arr[j-1];
                j--;
            }

            arr[j] = tempVal;
        }

        System.out.print("\nafter sort :");
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {36, 19, 2, 29, 12, 5};

        System.out.print("Before sort :");
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        insertionSort(arr);
    }
}
