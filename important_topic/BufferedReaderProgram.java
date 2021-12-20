package important_topic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Java BufferedReader class is used to read the text from a character-based input stream. 
 * It can be used to read data line by line by readLine() method. It makes the performance fast. It inherits Reader class
 * 
 */

public class BufferedReaderProgram {
    public static void main(String[] args) throws IOException {
        //eg: we are reading the data from the text file testout.txt using Java BufferedReader class.
        FileReader fr=new FileReader("D:\\testout.txt");    
        BufferedReader br=new BufferedReader(fr);   
  
        int i;    
        while((i=br.read())!=-1){  
          System.out.print((char)i);  
        }

        br.close();    
        fr.close();    
        
        //Reading data from console by InputStreamReader and BufferedReader
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br1 =new BufferedReader(r);            
        System.out.println("Enter your name");    
        String name=br1.readLine(); // suppose i type Ahmad Reza
        System.out.println("Welcome "+name);  // welcome Ahmad Reza  

        //we are reading and printing the data until the user prints stop.
        br1=new BufferedReader(r);           
        String name1="";

        while(!name1.equals("stop")){    
            System.out.println("Enter data: ");    
            name1=br.readLine();    
            System.out.println("data is: "+name1);    
        }              

        br1.close();    
        r.close();    
    }
}
