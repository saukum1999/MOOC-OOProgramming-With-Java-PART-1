
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        //Student a;
        boolean flag = true;
        String naam, num, sr;

        while (flag) {
            System.out.println("name: ");
            naam = reader.nextLine();
            if (naam.equals(null)||naam.equals("")) {
                flag = false;
                break;
            } else {
                System.out.println("studentNumber: ");
                num = reader.nextLine();
            }
            students.add(new Student(naam, num));
        }
        for (Student a: students) {
            System.out.println(a);
        }
        System.out.println("\nGive search term: ");
        sr = reader.nextLine();
        System.out.println("Result: ");
        for (Student b: students) {
            if (b.getName().contains(sr))
                System.out.println(b);
        }

    }
}
