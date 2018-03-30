
import java.util.Scanner;

public class FirstCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name;
        System.out.println("Type your name: ");
        name = reader.nextLine();
        character(name);

    }

    public static void character(String text) {
        int i = 0;
        if (text.length() < 3) {
            
        } else {
            for (i = 0; i < 3; i++) {
                System.out.println(i+1 + ". character: " + text.charAt(i));

            }
        }

    }

}
