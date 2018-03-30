
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a;
        System.out.println("Type a number: ");
        a=Integer.parseInt(reader.nextLine());
        
        if (a>0)
            System.out.println("The number is positive.");
        else
            System.out.println("The number is not positive.");

        // Type your program here:
    }
}
