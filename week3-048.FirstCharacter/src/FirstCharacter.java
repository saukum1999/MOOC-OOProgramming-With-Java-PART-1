import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name;
        char f;
        System.out.println("Type your name: ");
        name = reader.nextLine();
        f = firstCharacter(name);
        System.out.println("First character: " + f);
        
        
    }
    
    public static char firstCharacter(String text) {
        char first = text.charAt(0);
        return first;
    }
}
