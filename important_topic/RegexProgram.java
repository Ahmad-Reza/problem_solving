package important_topic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular Expressions or Regex (in short) is an API for defining String patterns that can be used for searching, 
 * manipulating, and editing a string in Java. 
 * Email validation and passwords are a few areas of strings where Regex is widely used to define the constraints. 
 * Regular Expressions are provided under java.util.regex package. 
 * This consists of 3 classes and 1 interface. java.util.regex package primarily consists of these three classes
 * util.regex.Pattern - Used for defining patterns
 * util.regex.Matcher -	Used for performing match operations on text using patterns
 * PatternSyntaxException -	Used for indicating syntax error in a regular expression pattern
 */

public class RegexProgram {
    public static void main(String[] args) {
        /**
         * Pattern Class: This class is a compilation of regular expressions that can be used to define various 
         * types of patterns, providing no public constructors. 
         * This can be created by invoking the compile() method which accepts a regular expression as the first argument, 
         * thus returns a pattern after execution.
         * compile(String regex) -> It is used to compile the given regular expression into a pattern.
         * compile(String regex, int flags) -> It is used to compile the given regular expression into a pattern with the given flags.
         * flags() -> It is used to return this pattern’s match flags.
         * matcher(CharSequence input) -> It is used to create a matcher that will match the given input against this pattern.
         * matches(String regex, CharSequence input) ->	It is used to compile the given regular expression and attempts to 
         * match the given input against it.
         * pattern() ->	It is used to return the regular expression from which this pattern was compiled.
         * quote(String s) -> It is used to return a literal pattern String for the specified String.
         * split(CharSequence input) -> It is used to split the given input sequence around matches of this pattern.
         * split(CharSequence input, int limit) -> It is used to split the given input sequence around matches of this pattern. 
         * The limit parameter controls the number of times the pattern is applied.
         * toString() -> It is used to return the string representation of this pattern.
         * 
         */
        
        // text "geeksforgeeks" matches pattern "geeksforge*ks" so return true.
        System.out.println(Pattern.matches("geeksforge*ks", "geeksforgeeks"));
 
        // text "geeksfor" doesn't match pattern "g*geeks*" so return false.
        System.out.println(Pattern.matches("g*geeks*", "geeksfor"));

        /**
         * Matcher class: This object is used to perform match operations for an input string in java, 
         * thus interpreting the previously explained patterns. This too defines no public constructors. 
         * This can be implemented by invoking a matcher() on any pattern object.
         * 
         * find(): It is mainly used for searching multiple occurrences of the regular expressions in the text.
         * find(int start):	It is used for searching occurrences of the regular expressions in the text starting from the given index.
         * start():	It is used for getting the start index of a match that is being found using find() method.
         * end(): It is used for getting the end index of a match that is being found using find() method. 
         * It returns index of character next to last matching character.
         * groupCount(): It is used to find the total number of the matched subsequence.
         * group():	It is used to find the matched subsequence.
         * matches(): It is used to test whether the regular expression matches the pattern.
         * 
         * Note: that Pattern.matches() checks if the whole text matches with a pattern or not. 
         * Other methods (demonstrated below) are mainly used to find multiple occurrences of patterns in the text.
         * 
         */

        // Create a pattern to be searched Custom pattern
        Pattern pattern = Pattern.compile("geeks");
 
        // Search above pattern in "geeksforgeeks.org"
        Matcher m = pattern.matcher("geeksforgeeks.org");
 
        // Finding string using find() method
        while (m.find()) {
            // Print starting and ending indexes of the pattern in the text using this functionality of this class
            System.out.println("Pattern found from " + m.start() + " to " + (m.end() - 1));
        }    
        //o/p: Pattern found from 0 to 4
        //     Pattern found from 8 to 12

        //example 3:
        // Creating a pattern to be searched Custom pattern to be searched
        Pattern pattern1 = Pattern.compile("ge*");
        Matcher m1 = pattern1.matcher("geeksforgeeks.org");
 
        // Checking whether the pattern is there or not using find() method
        while (m1.find()) {
            System.out.println("Pattern found from " + m.start() + " to " + (m.end() - 1));
        }

        //o/p: Pattern found from 0 to 2
        //     Pattern found from 8 to 10
        //     Pattern found from 16 to 16

        //Example 4: split() method to split a text based on a delimiter pattern.
        
        String text = "geeks1for2geeks3";
 
        // Specifies the string pattern which is to be searched
        String delimiter = "\\d";
        Pattern pattern2 = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);
 
        // Used to perform case insensitive search of the
        // string
        String[] result = pattern2.split(text);
 
        // Iterating using for each loop
        for (String temp : result) {
            System.out.println(temp); 
        } 
        //o/p: geeks
        //     for
        //     geeks
    }
}
