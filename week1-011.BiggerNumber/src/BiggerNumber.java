
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int b = Integer.parseInt(reader.nextLine());

        if (a > b) {
            System.out.println("The bigger number of the two numbers given was: " + a);
        } else {
            System.out.println("The bigger number of the two numbers given was: " + b);
        }

        // Implement your program here. Remember to ask the input from user
    }
}
