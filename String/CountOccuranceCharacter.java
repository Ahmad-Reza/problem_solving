package String;

public class CountOccuranceCharacter {
    public static void main(String[] args) {
        String inputStr = "this is ahmad reza";

        //The standard ASCII has 7 bits, 128 distinguish characters. 
        //The extended ASCII has 8 bits, 256 distinguish characters.
        int count[] = new int[256];
        
        for(int i=0; i<inputStr.length(); i++) {
            //count same occurence character in inputStr
            count[inputStr.charAt(i)]++;
        }

        for(int i=0; i<inputStr.length(); i++) {
            int find = 0;
            char ch = inputStr.charAt(i);

            for(int j=i; j<inputStr.length(); j++) {
                if(ch == inputStr.charAt(j))
                    find++;
            }

            if(find == 1) {
                System.out.println("Occurence of " + ch + " is " + count[inputStr.charAt(i)]);
            }
        }
    }
}
