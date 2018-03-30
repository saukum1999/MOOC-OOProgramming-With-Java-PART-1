import java.util.Scanner;
//import java.util.Scanner;

public class TheSumOfSetOfNumbers {
    
    public static void main (String[] args) {
        Scanner reader = new Scanner (System.in);
        int j,i = 0, sum = 0;
        System.out.println("Until what? ");
        j = Integer.parseInt(reader.nextLine());
        while (i<j+1) {
            sum +=i;
            i++;
        }
        System.out.println("Sum is " + sum); 
    }
}
/*
public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

    }
}
*/
