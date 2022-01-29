package String;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";

        boolean notPalindrome = false;
        char[] charArr = str.toCharArray();

        for(int i=0, j = str.length()-1; i<j; i++, --j) {
            if(charArr[i] == charArr[j]) {
                continue;
            } else {
                System.out.println("Not palindrome word");
                notPalindrome = true;
                break;
            }
        }

        if(!notPalindrome) System.out.println("Palindrome word");
    }
}
