
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String a;
        int i;
        System.out.println("Type a word: ");
        a = reader.nextLine();
        System.out.println("Length of the first part: ");
        i = Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + a.substring(0,i));
    }
}
