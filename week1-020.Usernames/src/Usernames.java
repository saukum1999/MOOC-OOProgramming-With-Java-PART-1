import java.util.Scanner;
//import java.util.Scanner;

public class Usernames {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String user,pass;
        System.out.println("Type your username:");
        user=reader.nextLine();
        System.out.println("Type your password:");
        pass=reader.nextLine();
        
        if (user.equals("alex"))
            if (pass.equals("mightyducks"))
                System.out.println("You are logged into the system!");
            else 
                System.out.println("You username or password was invalid!");
                
        else if (user.equals("emily"))
            if (pass.equals("cat"))
                System.out.println("You sre logged into the system!");
            else
                System.out.println("You username or password was invalid!");
        else
                System.out.println("You username or password was invalid!");
    }

}
