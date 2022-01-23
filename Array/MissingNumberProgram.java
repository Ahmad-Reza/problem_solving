package Array;

public class MissingNumberProgram {

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 3, 7, 8};
        int missingVal = getMissingVal(arr, arr.length);
        System.out.println("Missing number : " + missingVal);
    }

    private static int getMissingVal(int[] arr, int length) {
        //find sum of first natural number till greates/last value of arr. n*(n+1)/2
        int n = length + 1;
        int sum = n*(n+1)/2;

        for(int i = 0; i<length; i++) {
            sum = sum - arr[i];
        }

        //Time complexity: 0(n)
        //Space complexity: 0(1)

        return sum;
    }
}
