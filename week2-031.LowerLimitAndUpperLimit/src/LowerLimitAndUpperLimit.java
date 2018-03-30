import java.util.Scanner;
//import java.util.Scanner;

public class LowerLimitAndUpperLimit {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        int f,l;
            System.out.println("First:");
            f = Integer.parseInt(reader.nextLine());
            System.out.println("Last:");
            l = Integer.parseInt(reader.nextLine());
            while (f<l+1) {
                System.out.println(f);
                f++;
            }
            
    }
}
/*
public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here

    }
}
*/