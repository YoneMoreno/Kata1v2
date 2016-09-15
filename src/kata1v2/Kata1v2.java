package kata1v2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1v2 {
    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1996,11,14);
        
        Person myperson = new Person("Mario", date);
        System.out.println(myperson.getName() + " tiene " + myperson.getAge() + " años");
    }
}
