import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int passLength;
    Random random = new Random();
    String all = "abcdefghijklmnopqrstuvwxyz";

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passLength = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String pass = "";
        while ( i < this.passLength) {
            pass = pass +all.charAt(random.nextInt(all.length()));
            i++;
        }
        
        return pass;
    }
}
