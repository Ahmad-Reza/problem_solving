package Array;

public class SubArrayOfSum {

    static int subArrayOfSum(int[] arr, int sum) {
        // int res = 0;
        // int startIndes = 0, endIndex = 0;

        // for(int i=0; i<arr.length; i++) {
        //     res = arr[i];
        //     for(int j=1; j<arr.length; j++) { 
        //         res = res + arr[j];        
                
        //         if(res == sum) {
        //             startIndes = i;
        //             endIndex = j;

        //             System.out.println(i +" "+ j);
        //             System.out.println(startIndes +" "+ endIndex);
        //         } 
                
        //         if(res > sum){
        //             break;
        //         }
        //     }

        //     if(res == sum) break;
        // }

        // System.out.println("Sum found between indexes " + startIndes + " and " + endIndex);
        
        int curr_sum, i, j;
 
        // Pick a starting point
        for (i = 0; i < arr.length; i++) {
            curr_sum = arr[i];
 
            // try all subarrays starting with 'i'
            for (j = i + 1; j <= arr.length; j++) {
                if (curr_sum == sum) {
                    int p = j - 1;
                    System.out.println(
                        "Sum found between indexes " + i
                        + " and " + p);
                    return 1;
                }
                if (curr_sum > sum || j == arr.length)
                    break;
                curr_sum = curr_sum + arr[j];
            }
        }
 
        System.out.println("No subarray found");
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 20, 3, 10, 5};
        int sum = 33;

        subArrayOfSum(arr, sum);
    }
}
