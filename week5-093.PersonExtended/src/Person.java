
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;
    private MyDate current;
    

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
        //this.i = Calendar.getInstance().get(Calendar.DATE);
        //this.j = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        //this.k =  Calendar.getInstance().get(Calendar.YEAR);
        this.current = new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));

    }
    
    public Person (String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
        this.current = new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));
    }
    
    public Person (String name) {
        this.name = name;
        this.current = new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));
        this.birthday = this.current;
    }

    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        return birthday.differenceInYears(current);
    }

    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        return this.birthday.earlier(compared.birthday);
        //return false;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
