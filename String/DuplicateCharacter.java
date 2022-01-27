package String;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String str = "goodday";

        System.out.print("Duplicates character are: ");

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            boolean isDuplicate = false;

            for(int j=i+1; j<str.length(); j++) {
                if(ch == str.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            if(isDuplicate) 
                System.out.print(ch + " ");            
        }
    }
}
