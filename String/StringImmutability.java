package String;

public class StringImmutability {
    public static void main(String[] args) {
        // This is how String works:
        String str = "knowledge";

        // This, as usual, creates a string containing "knowledge" and assigns it a reference str. Simple enough?
        // assigns a new reference to the same string "knowledge"
        
        String s = str;    
        str = str.concat(" base");
        
        //This appends a string " base" to str. But wait, how is this possible, since String objects are immutable? 
        //Well to your surprise, it is. When the above statement is executed, the VM takes the value of String str,
        //i.e. "knowledge" and appends " base", giving us the value "knowledge base". 
        //Now, since Strings are immutable, the VM can’t assign this value to str, so it creates a new String object,
        //gives it a value "knowledge base", and gives it a reference str.
        
        //An important point to note here is that, while the String object is immutable, 
        //its reference variable is not. So that’s why, in the above example, the reference was made to refer to a 
        //newly formed String object. At this point in the example above, 
        //we have two String objects: the first one we created with value "knowledge", pointed to by s, and the 
        //second one "knowledge base", pointed to by str. But, technically, we have three String objects, 
        //the third one being the literal "base" in the concat statement.

    }
}
