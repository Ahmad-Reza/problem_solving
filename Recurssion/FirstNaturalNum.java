/**
 * WAP to calculate first natural number n(n+1)/2
 * 
 */

public class FirstNaturalNum {
    public static void main(String[] args) {
        int i = 1, n = 5, sum = 0;

        calFirstNaturalNum(i, n, sum);
    }

    private static void calFirstNaturalNum(int i, int n, int result) {
        if(i == n) {
            result += i;
            System.out.println("first natural number: " + result);
            
            return;
        }

        result += i;
        calFirstNaturalNum(i+1, n, result);
    }
}
