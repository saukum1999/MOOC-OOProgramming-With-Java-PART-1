
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        //Scanner reader = new Scanner(System.in);
        Scanner reader=new Scanner(System.in);
        int a;
        System.out.println("How old are you?");
        a=Integer.parseInt(reader.nextLine ());
        
        if(a<18)
            System.out.println("You have not reached the age of maturity yet!");
        else
            System.out.println("You have reached the age of maturity!");
        
        

        // Type your program here 
    }
}
