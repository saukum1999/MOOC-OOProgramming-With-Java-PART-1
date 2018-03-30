import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        // create here an ArrayList
        String alf;
        boolean flag = true;
        
        while (flag) {
            System.out.println("Type a word: ");
            alf = reader.nextLine();
            if (alf.isEmpty()) {
                flag = false;
                break;
            }
            else
                words.add(alf);
        }
        Collections.reverse(words);
        System.out.println("You typed the following words:");
        for (String get : words) {
            System.out.println(get);
        }
    }
}
