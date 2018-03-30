//import java.util.Scanner;
import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader =new Scanner (System.in);
        int a,b;
        System.out.println("Type the first number: ");
        a=Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        b=Integer.parseInt(reader.nextLine());
        
        if (a<b)
            System.out.println("Greater number: "+b);
        else if  (a==b)
            System.out.println("The numbers are equal!");
        else
            System.out.println("Greater number: "+a);
        
        
        
        
    }
}
