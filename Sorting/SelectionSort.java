package Sorting;

// In selection sort find minimum number and swap with first element and i++, so on till sort.
public class SelectionSort {
    private static void insertionSort(int[] arr) {
        int minValPos = 0, temp= 0;

        for(int j=0; j<arr.length; j++) {
            minValPos = j;
            for(int i=j+1; i<arr.length; i++) {
                if(arr[minValPos] > arr[i]) {
                    minValPos = i;
                }
            }
            
            temp = arr[j];
            arr[j] = arr[minValPos];
            arr[minValPos] = temp;
             
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
