import java.util.Calendar;
import java.util.Date;

public abstract class Human
{
    abstract boolean isAdult(int age);

    public Date getDateOfBirthByAge(int age)
    {
        Calendar cal = Calendar.getInstance();
        Date today = cal.getTime();
        cal.add(Calendar.YEAR, -age); // to get previous year add -1
        return cal.getTime();
    }
}
