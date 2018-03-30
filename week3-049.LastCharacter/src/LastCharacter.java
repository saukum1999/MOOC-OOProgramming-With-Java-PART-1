
import java.util.Scanner;

public class LastCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name;
        char last;
        System.out.println("Type your name: ");
        name = reader.nextLine();
        last = lastCharacter(name);
        System.out.println("Last character: " + last);
    }
    public static char lastCharacter(String text) {
        char l;
        l = text.charAt(text.length()-1);
        return l;
    }
}
