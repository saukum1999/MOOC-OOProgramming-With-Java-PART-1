
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int len;
        String name;
        System.out.println("Type your name: ");
        name = reader.nextLine();
        len = calculateCharacters(name);
        System.out.println("Number of characters: " + len);
        
        
        // call your method from here
    }
    
    public static int calculateCharacters(String text) {
        int count = text.length();
        return count;
    }
    // do here the method
    // public static int calculateCharacters(String text)
    
}
