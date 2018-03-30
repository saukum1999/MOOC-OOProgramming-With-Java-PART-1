
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int a,count=1;
        boolean flag=true;
        while (flag) {
            System.out.println("Guess a numner: ");
            a = Integer.parseInt(reader.nextLine());
            if (a<numberDrawn)
                System.out.println("The number is greater, guesses made: " + count++);
            else if (a>numberDrawn) 
                System.out.println("The number is lesser, guesses made: " + count++);
            else if (a==numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                flag=false;
            }
        }

        // program your solution here. Do not touch the above lines!
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
