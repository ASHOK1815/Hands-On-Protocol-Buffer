

import com.example.protobuff.Employee;
import com.example.protobuff.EmployeeList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EmployeeMain {


    public static Employee.PhoneNumber check(String phoneNumber,String phoneType)
    {
        Employee.PhoneNumber.Builder phoneNumber1 = Employee.PhoneNumber.newBuilder();
        phoneNumber1.setNumber(phoneNumber);

        switch (phoneType)
        {
            case "mobile":
                phoneNumber1.setType(Employee.PhoneType.MOBILE);
                break;
            case "home":
                phoneNumber1.setType(Employee.PhoneType.HOME);
                break;

            case "work":
                phoneNumber1.setType(Employee.PhoneType.WORK);
                break;

            default:
                phoneNumber1.setType(Employee.PhoneType.MOBILE);
        }

        return phoneNumber1.build();

    }


    public static void main(String[] args) throws IOException {

        BufferedReader stdin  = new BufferedReader(new InputStreamReader(System.in));
        EmployeeList.Builder employeeList = EmployeeList.newBuilder();
        Employee.Builder employee = Employee.newBuilder();

        System.out.println("Enter the employee Name");
        employee.setName(stdin.readLine());
        System.out.println("Enter the employee Salary");
        employee.setSalary(Integer.valueOf(stdin.readLine()));
        System.out.println("Enter the employee id");
        employee.setEmpId(Integer.valueOf(stdin.readLine()));
        System.out.println("Enter the address of the employee");
        employee.setAddress(stdin.readLine());
        System.out.println("Enter the Department of the employee");
        employee.setDepartment(stdin.readLine());
        System.out.println("Enter the email of the employee");
        employee.setEmail(stdin.readLine());
        System.out.println("Enter the age of the employee");
        employee.setAge(Integer.valueOf(stdin.readLine()));

        while (true) {
            System.out.print("Enter a phone number (or leave blank to finish): ");
            String number = stdin.readLine();
            if (number.length() == 0) {
                break;
            }

            System.out.print("Is this a mobile, home, or work phone? ");
            String type = stdin.readLine();
            Employee.PhoneNumber phoneNumber = check(number,type);
            employee.addPhones(phoneNumber);
        }


        for(Employee employeeList1:employeeList.getEmployeeList())
        {
            System.out.println(employeeList1.toString());
        }

        stdin.close();
    }
}
