
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Type Your name: ");
        String name1=reader.nextLine();
        System.out.println("Type your age: ");
        int a=Integer.parseInt(reader.nextLine());
        
        System.out.println("Type Your name: ");
        String name2=reader.nextLine();
        System.out.println("Type your age: ");
        int b=Integer.parseInt(reader.nextLine());
        
        int sum=a+b;
        System.out.println(name1+" and "+name2+" are "+sum+" years old in total.");
        
        
        
        

        // Implement your program here
    }
}
