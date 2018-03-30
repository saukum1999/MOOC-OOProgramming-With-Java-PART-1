import java.util.Scanner;
//import java.util.Scanner;

public class Factorial {
    public static void main (String[] args ) {
        Scanner reader = new Scanner(System.in);
        int i, sum = 1;
        System.out.println("Type a number: ");
        i = Integer.parseInt(reader.nextLine());
        while (i>0) {
            sum *=i;
            i--;
        }
        System.out.println("Factorial is " + sum);
    }
}
/*
public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

    }
}
*/
