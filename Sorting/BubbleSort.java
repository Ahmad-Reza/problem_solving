package Sorting;

/*
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order. 
 * 
 */

public class BubbleSort {

    private static void bubbleSort(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("\n after sort :");
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {36, 19, 29, 12, 5};

        System.out.println("Before sort :");
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        bubbleSort(arr);
    }
}
