import java.util.Scanner;
//import java.util.Scanner;

public class Password {

    public static void main(String[] args){
      Scanner reader = new Scanner (System.in);
      boolean check=true;
      String password = "carrot",pass;
      while (check){
          System.out.println("Type the password: ");
          pass=reader.nextLine();
          if (pass.equals(password)){
              check=false;
              System.out.println("Right!");
              System.out.println("\nThe secret is: jeyy qbar !");
              
          }
          else {
              System.out.println("Wrong!");
              //break;       
          }
              
              
      }
      
        
        
      
    }
    
}
