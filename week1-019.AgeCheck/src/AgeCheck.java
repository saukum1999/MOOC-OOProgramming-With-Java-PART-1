//import java.util.Scanner;
import java.util.Scanner;

public class AgeCheck {
    
    public static void main(String[] args){
        
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you?");
        int a;
        a=Integer.parseInt(reader.nextLine());
        if (a>=0&&a<=120)
            System.out.println("OK");
        else
            System.out.println("Impossible!");
           
        
    
            
            
            
            
    
    }
}
