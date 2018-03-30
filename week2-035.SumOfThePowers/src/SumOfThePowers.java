import java.util.Scanner;
//import java.util.Scanner;

public class SumOfThePowers {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int a,i=0;
        double sum=0;
        
        System.out.println("Type a number: ");
        a = Integer.parseInt(reader.nextLine());
        
        while (i<a+1) {
            sum = sum + Math.pow(2, i);
            i++;
            
        }
        System.out.println("The result is " + (int)sum);
        
        
        
    }
}
/*
public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

    }
}
*/
