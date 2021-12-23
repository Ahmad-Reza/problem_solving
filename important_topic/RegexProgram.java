package important_topic;

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
    }
}
