package Array;

public class ArrayRotation {

    public void rotationArray(int array[], int d, int length) {
        int arr1[] = new int[d];
        for(int i=0; i<d; i++) {
           arr1[i] = array[i];
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

        //First method 
        //obj.rotationArray(array, 2, array.length);

        //Second method with 
        //Time complexity: O(n)
        //Auxiliary Space: O(1)

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int rotationArray[] = obj.getRotationArray(arr, 3, arr.length);

        System.out.print("Rotation array: ");
        for(int val: rotationArray)
            System.out.print(val + " ");
    }

    private int[] getRotationArray(int[] arr, int d, int length) {
        
        if(d > 0 && d < length) {
            int gcd = getGCD(d, length);
            
            for(int i = 0; i<gcd; i++) {
                int temp = arr[i];
                int j = i;

                while(true) {
                    //k carry last index of every set(according to gcd)  
                    int k = j + d; 

                    if(k >= length) k = k - length;
                    if(k == i) break;

                    arr[j] = arr[k];
                    j = k; 
                }

                arr[j] = temp;
            }
        }
        
        return arr;
    }

    private int getGCD(int d, int length) {
        int gcd = 1;
        for(int i = 1; i <= d && i <= length; i++) {
            if(d % i == 0 && length % i == 0)
                gcd = i;                
        }

        return gcd;
    }
}
