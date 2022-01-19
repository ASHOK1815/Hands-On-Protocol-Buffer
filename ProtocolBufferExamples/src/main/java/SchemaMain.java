

import proto.example.Schema.Students;
import proto.example.Schema.Student;


public class SchemaMain {
    public static void main(String[] args) {

        Students.Builder students = Students.newBuilder();

        students.addStudents(Student.newBuilder()
                .setName("ASHOK")
                .setDepartment("CSE")
                .setUid(6735));

        students.addStudents(Student.newBuilder()
                .setName("SUNIL")
                .setDepartment("CSE")
                .setUid(2467));



        Students message =students.build();

        System.out.println(message);

    }
}
