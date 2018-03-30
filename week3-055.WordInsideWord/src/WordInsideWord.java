
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String a, b;

        System.out.println("Type the first word: ");
        a = reader.nextLine();
        System.out.println("Type the second word: ");
        b = reader.nextLine();

        if (a.indexOf(b) != -1) {
            System.out.println("The word '" + b + "' is found in the word '" + a + "'.");
        } else {
            System.out.println("The word '" + b + "' is not found in the word '" + a + "'.");
        }

    }
}
