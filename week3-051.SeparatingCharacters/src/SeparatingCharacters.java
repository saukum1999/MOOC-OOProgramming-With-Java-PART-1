
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name;
        int i;
        boolean flag = true;
        System.out.println("Type your name: ");
        name = reader.nextLine();

        for (i = 0; i < name.length(); i++) {
            System.out.println(i + 1 + ". character: " + name.charAt(i));
        }

    }
}
