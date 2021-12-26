package Sorting;

/*
 * Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order. 
 * 
 */

public class BubbleSort {

    private static void bubbleSort(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            int flag = 0;
            for(int j = 0; j<arr.length - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }

            if(flag == 0) {
                break;
            }
        }

        System.out.print("\nafter sort :");
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 36, 19, 29, 12, 5};

        System.out.print("Before sort :");
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        bubbleSort(arr);

        //for String sort: compareTo() method is used for comparision two strings lexicographically each character of 
        //both the string is converted into a unicode value for comparision.
        //if both string is equal then return '0', if string is lexicographically greater then return positive else negative.

        String str[] = {"Ram", "Ram", "Shyam", "Mohan", "Ramesh", "Ganesh"};
        System.out.print("\nString sort :");
        for(int i=0; i<str.length - 1; i++) {
            System.out.print(str[i].compareTo(str[i+1]));
        }
    }
}
