package String;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class ReverseWord {

    private static void reverseWord(String str) {
        Stack<Character> charStr = new Stack<>();

        System.out.print("After reverse: ");
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) != ' ') {
                charStr.push(str.charAt(i));

            } else {
                while(!charStr.isEmpty()) System.out.print(charStr.pop());
                System.out.print(" ");
            }
        }

        while(!charStr.isEmpty()) System.out.print(charStr.pop());
    }

    public static void main(String[] args) {
        String str = "Happy Birthday";

        //Using stack data structure
        System.out.println("Before reverse: " + str);
        reverseWord(str);

        String str1 = "Thank you";
        //Using Java8 stream
        String reverseStr = Arrays.asList(str.split(" "))
                        .stream()
                        .map(s -> new StringBuilder(str1).reverse())
                        .collect(Collectors.joining(" "));
        
        System.out.print("\n\n reverse string: " + reverseStr);
    }
}
