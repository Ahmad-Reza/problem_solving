package String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "ahmadreza";

        char[] strArr = str.toCharArray();
        int len = strArr.length;

        for(int i = 0, j = len - 1; i<j; i++, j--) {
            if(strArr[i] != strArr[j]) {
                char temp = strArr[i];
                strArr[i] = strArr[j];
                strArr[j] = temp;

            } else continue;
        }
        
        System.out.println(new String(strArr));
    }
}
