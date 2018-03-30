import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String alf;
        
        boolean flag = true;
        while (flag) {
            System.out.println("Type a word: ");
            alf = reader.nextLine();
            if (alf.isEmpty())
                break;
            else
                words.add(alf);
        }
        for (String word : words) {
            System.out.println(word);
        }
        
    }
}
