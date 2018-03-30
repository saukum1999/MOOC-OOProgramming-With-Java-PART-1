
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        // create here the ArrayList 
        String alf;
        boolean flag = true;
        
        while (flag) {
            System.out.println("Type a word: ");
            alf = reader.nextLine();
            for (String word : words) {
                if (alf.equals(word)){
                    flag = false;
                    break;
                }
            }
            if (flag)
                words.add(alf);
            else {
                System.out.println("You gave the word " + alf + " twice");
                break;
            }
            
        }
        
    }
}
