package co.edu.cesde.ga.model;

public class Student  extends  Person
{
   private static String birthDate;
    public Student(){

    }
    public Student(long userId, String code, String documentNumber, String firstName, String lastName, String status, String birthday) {
        super(userId, code, documentNumber, firstName, lastName, status);
        this.birthDate = birthDate;
    }

    public static String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}


