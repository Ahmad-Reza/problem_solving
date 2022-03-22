public class CalculateFactorial {
    public static void main(String[] args) {
        int n = 5;

        int ans = calcFact(n);
        System.out.println("Factorial of 5: " + ans);
    }

    private static int calcFact(int n) {
        if(n == 1 || n == 0) return 1;

        int decendingNo = calcFact(n-1);
        int ans = n * decendingNo;

        return ans;
    }
}
