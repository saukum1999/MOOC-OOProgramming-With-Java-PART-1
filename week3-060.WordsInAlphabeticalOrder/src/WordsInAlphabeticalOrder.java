
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
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
        Collections.sort(words);
        System.out.println("You typed the following words: ");
        for (String print : words) {
            System.out.println(print);
        }
    }
}
