package String;

/**
 * anagram means a word or phrase made by transposing the letters of another word or phrase 
 * The word "secure" is an anagram of "rescue."
 * 
 */
public class AnagramProgram {

    private static boolean checkAnagram(char[] str1Arr, char[] str2Arr) {

        if(str1Arr.length != str2Arr.length) return false;

        int[] count = new int[256];
        for(int i = 0; i < str1Arr.length; i++) {
            count[str1Arr[i]]++;
            count[str2Arr[i]]--;
        }

        for(int i = 0; i<256; i++) {
            if(count[i] != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "rescue";
        String str2 = "secure";

        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();

        if(checkAnagram(str1Arr, str2Arr)) {
            System.out.println("Yes, inputs are Anagram!");
        } else {
            System.out.println("Oops sorry, inputs are not Anagram!");
        }
    }
}
