
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable
        System.out.println("Enter three numbers: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;

        // Write your program here
        // Use only variables sum and read
        System.out.println("Sum: " + sum);
    }
}
