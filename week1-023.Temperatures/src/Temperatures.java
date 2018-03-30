import java.util.Scanner;
//import java.util.Scanner;

public class Temperatures {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double a;
        //System.out.println("Input float values b/w -30 & 40");
        //a = Double.parseDouble(reader.nextLine());
        boolean chk=true;
        while (chk){
            System.out.println("Input float values b/w -30 & 40");
            a = Double.parseDouble(reader.nextLine());
            //Graph.addNumber(a);
            if (a>=-30.0&&a<=40.0)
                Graph.addNumber(a);
            
        }
        
        
    }
   /* public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 

        // Graph is used as follows:
        Graph.addNumber(7);
        double value = 13.5;
        Graph.addNumber(value);
        value = 3;
        Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }*/
}
