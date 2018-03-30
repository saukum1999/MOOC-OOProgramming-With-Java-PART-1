import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum =  0;
        for (Integer a : list) {
            sum = sum + a;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return ((float)sum(list)/list.size());
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double var;
        double total = 0;
        double avg = average(list);
        for (Integer a: list ) {
            var = Math.pow((a - avg),2);
            total += var;
        }
        total = total/(list.size()-1);
        return total;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
