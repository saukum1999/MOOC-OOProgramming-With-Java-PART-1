
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float div;
        System.out.println("Type a number: ");
        int a=Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int b=Integer.parseInt(reader.nextLine());
        div=(float)a/b;
        System.out.println("Division: "+a+" / "+b+"= "+div);
        

        // Implement your program here. Remember to ask the input from user.
    }
}
