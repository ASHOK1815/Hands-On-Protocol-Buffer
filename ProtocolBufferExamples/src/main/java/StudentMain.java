import proto.example.Schema.Students;
import com.example.tutorial.protos.Students.StudentInfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class StudentMain {


    public static void main(String[] args) throws IOException {

        BufferedReader stdin =new BufferedReader(new InputStreamReader(System.in));
        ArrayList<StudentInfo.Builder> arrayList = new ArrayList<>();

        StudentInfo.Builder studentInfo = StudentInfo.newBuilder();
        Students.Builder studenT = Students.newBuilder();
        studentInfo .setFirstName("Ashok")
                    .setLastName("kumawat")
                    .setCgpa(8.85)
                    .setRollNumber(6735);

        StudentInfo message=studentInfo.build();
        studentInfo.setFirstName("Ashok")
                .setLastName("kumawat")
                .setCgpa(8.85)
                .setRollNumber(6715);



        arrayList.add(0,message.toBuilder());
        arrayList.add(1,studentInfo);

        System.out.println(arrayList.toString());
    }
}