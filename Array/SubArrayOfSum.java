package Array;

public class SubArrayOfSum {

    static int subArrayOfSum(int[] arr, int sum) {
        int res = 0;

        for(int i=0; i<arr.length; i++) {
            res = arr[i];
            for(int j=i+1; j<arr.length; j++) {                 
                if(res == sum) {
                    System.out.println("Sum found between indexes " + i + " and " + (j-1));
                    return 1;
                } 
                
                if(res > sum || j == arr.length){
                    break;
                }

                res = res + arr[j];        
            }
        }

        System.out.println("No subarray found");
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 20, 3, 10, 5};
        int sum = 33;

        // time complexity = 0(n^2);
        // space complexity = 0(1) 
        subArrayOfSum(arr, sum); 

        // time complecity = 0(n)
        // space complexity = 0(1)
        subArraySum(arr, sum);
    }

    static int subArraySum(int[] arr, int sum) {
        int i = 0, start = 0, tempSum = arr[0];
        for(i=1; i<=arr.length; i++) {
        
            //tempSum will greater than sum then subtract first index value from tempSum and increase index
            while(tempSum > sum && start < i-1) {
                tempSum = tempSum - arr[start];
                start++;
            }

            while(tempSum == sum) {
                System.out.println("Sum found between indexes " + start + " and " + (i - 1));
                return 1;
            }

            if(start < i)
                tempSum = tempSum + arr[i];
        }

        System.out.println("No subarray found");
        return 0;
    }
}
