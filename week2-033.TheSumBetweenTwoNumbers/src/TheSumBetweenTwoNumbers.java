import java.util.Scanner;
//import java.util.Scanner;

public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int f,l,sum = 0;
        System.out.println("First: ");
        f = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        l = Integer.parseInt(reader.nextLine());
        while (f<l+1) {
            sum += f;
            f++;
            
        }
        System.out.println("The sum: " + sum);
    }
}
/*
public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
    }
}
*/
