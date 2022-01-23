package Array;

public class ArrayRotation {

    public void rotationArray(int array[], int d, int length) {
        
        // 1st method 
        int arr1[] = new int[d];
        for(int i=0; i<d; i++) {
           arr1[i] = array[i];
          // System.out.print(arr1[i] + " ");
        }

        
        for(int j=0; j<length; j++) {
            array[j] = arr1[j];
        }

        System.out.println("\n second: " + array);
    }

    public static void main(String[] args) {
        
        ArrayRotation obj = new ArrayRotation();
        int array[] = {1, 2, 3,  4, 5, 6, 7};
        
        System.out.println("Before :");
        for(int numbers : array) {
            System.out.print(numbers +" ");
        }
        obj.rotationArray(array, 2, array.length);
    }
}
