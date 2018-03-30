
import java.util.Scanner;

public class TheEndPart {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String a;
        int length, i;
        System.out.println("Type a word: ");
        a = reader.nextLine();
        length = a.length();
        System.out.println("Length of the end part: ");
        i = Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + a.substring(length - i));
    }
}
