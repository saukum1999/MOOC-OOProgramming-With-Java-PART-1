import java.util.Scanner;
//import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int year,i;
        System.out.println("Type a year: ");
        year=Integer.parseInt(reader.nextLine());
        i=year%400;
        if(i==0)
            System.out.println("The year is a leap year.");
        else {
            i=i%100;
            if (i==0)
                System.out.println("The year is not a leap year.");
            else {
                i=i%4;
                if (i==0)
                    System.out.println("The year is a leap year.");
                else
                    System.out.println("The year is not a leap year.");
                }
        }
                    
    }

}
