import java.util.Date;

public class User extends Human
{
    private String Name;
    private String Surname;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    private int Age;
    private Date DateOfBirth;
    public  User(String name, String surname, int age)
    {
        this.Name = name;
        this.Surname = surname;
        this.Age = age;
        this.DateOfBirth = getDateOfBirthByAge(age);
    }

    @Override
    boolean isAdult(int age)
    {
        if (age >= 18)
        {
            return true;
        }
        return false;
    }
}
