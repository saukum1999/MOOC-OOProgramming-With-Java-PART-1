import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0,num,sum = 0,e = 0,o = 0;
        float avg;
        
        System.out.println("Type numbers:");
        num = Integer.parseInt(reader.nextLine());
        
        while (num != -1) {
            sum += num;

            if (num % 2 == 0 )
                e++;
            else
                o++;
            i++;
            num = Integer.parseInt(reader.nextLine());
            if (num == -1) {
                avg = (float)sum / i;
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " + i);
                System.out.println("Average: " + avg);
                System.out.println("Even numbers: " + e);
                System.out.println("Odd numbers: " + o);
                break;
            }
            
            
            
        }
    }
}
            
            