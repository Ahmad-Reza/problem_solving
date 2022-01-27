package String;

public class RemoveSpace {
    public static void main(String[] args) {
        String str = "This is Ahmad Reza ";

        //str = str.replace(" ", "");
        System.out.println(str.replace(" ", ""));
        
        String str1 = "  beautiful  days ";
        System.out.println(str1.replaceAll("\\s", ""));

    }
    
}
