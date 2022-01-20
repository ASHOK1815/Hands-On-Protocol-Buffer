

import proto.example.Schema.Students;
import proto.example.Schema.Student;

import java.util.ArrayList;


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


        Student.Builder student = Student.newBuilder();

        student.setUid(6735)
                .setDepartment("cse")
                .setName("ashok");

        ArrayList<Students.Builder> arrayList = new ArrayList<>();
        arrayList.add(Students.newBuilder().addStudents(student));

        System.out.println("Array list ");
        System.out.println(arrayList.toString());


        System.out.println("Printing in message");
        Students message =students.build();

        System.out.println(message);

    }
}
