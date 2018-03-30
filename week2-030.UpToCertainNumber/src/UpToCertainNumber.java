import java.util.Scanner;
//import java.util.Scanner;

public class UpToCertainNumber {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        int a,i=1;
        System.out.println("Up to what number? ");
        a = Integer.parseInt(reader.nextLine());
        while (i<=a) {
            System.out.println(i);
            i++;
        }
        
    }
}
/*public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        
    }
}*/
