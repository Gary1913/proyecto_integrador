package co.edu.cesde.ga.app;
import co.edu.cesde.ga.model.Person;
import co.edu.cesde.ga.model.Student;
import co.edu.cesde.ga.model.Teacher;


public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setUserId(1);
        person.setCode("12345");
        person.setDocumentNumber("112233");
        person.setFirstName("Luis");
        person.setLastName("Suarez");
        person.setStatus("ACTIVE");

        Teacher teacher = new Teacher();

        teacher.setUserId(2);
        teacher.setCode("12345");
        teacher.setDocumentNumber("112233");
        teacher.setFirstName("Miguel");
        teacher.setLastName("Ocampo");
        teacher.setStatus("ACTIVE");

        Student student = new Student();
        student.setUserId(3);
        student.setCode("4567");
        student.setDocumentNumber("0001");
        student.setFirstName("Nancy");
        student.setLastName("Vergara");
        student.setStatus("ACTIVE");


        System.out.println(person);
        System.out.println( "User id : " + person.getUserId());
        System.out.println( "Document number " + person.getDocumentNumber());
        System.out.println( "Code : " + person.getCode());
        System.out.println( "First name : " + person.getFirstName());
        System.out.println( "Last name : " + person.getLastName());
        System.out.println("Status : " + person.getStatus());



        System.out.println(teacher);
        System.out.println( "User id : " + teacher.getUserId());
        System.out.println( "Code : " + teacher.getCode());
        System.out.println("Document number : " + teacher.getDocumentNumber());
        System.out.println( "First name : " + teacher.getFirstName());
        System.out.println( "Last name : " + teacher.getLastName());
        System.out.println("Status : " + teacher.getStatus());

        System.out.println(student);
        System.out.println("user id : " + student.getUserId());
        System.out.println("code : " + student.getCode());
        System.out.println("Document number : " + student.getDocumentNumber());
        System.out.println("first name : " + student.getFirstName());
        System.out.println("last name : " + student.getLastName());
        System.out.println("status : " + student.getStatus());
        System.out.println(Student.getBirthDate());





    }


}
