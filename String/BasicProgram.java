package String;

import java.util.Scanner;

//Write	a	basic	program	to	take	input	(String)	from	User	and	just	print	it.
public class BasicProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Type input here: ");
        String inputStr = scan.nextLine();
        System.out.println(inputStr);

        scan.close();
    }
}
