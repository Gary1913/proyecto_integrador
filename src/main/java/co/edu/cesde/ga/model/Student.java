package co.edu.cesde.ga.model;

public class Student  extends  Person
{
   private String birthday;
    public Student(){

    }
    public Student(long userId, String code, String documentNumber, String firstName, String lastName, String status, String birthday) {
        super(userId, code, documentNumber, firstName, lastName, status);
        this.birthday = birthday;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}


