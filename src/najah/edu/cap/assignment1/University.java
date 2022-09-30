package najah.edu.cap.assignment1;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class University {
    public LinkedList listOfStudents = new LinkedList();
    public int count =0;
    Scanner scanner = new Scanner(System.in);
    public void add(){
        count++;
        System.out.println("1. If you need to add a normal student ");
        System.out.println("2. If you need to add a master student ");
        System.out.println("3. If you need to add a medical student ");
        System.out.println("4. If you need to add an engineering student ");
        int choice  = scanner.nextInt();

        System.out.print("Enter id for the student: ");
        int id = scanner.nextInt();
        System.out.print("Enter name for the student: ");
        String name = scanner.next();
        System.out.print("Enter year of birth : ");
        int year;
        year = scanner.nextInt();
        System.out.print("Enter month of birth : ");
        int month = scanner.nextInt();
        System.out.print("Enter day of birth : ");
        int day = scanner.nextInt();
        LocalDate dob = LocalDate.of(year,month,day);
        switch(choice){
            case 1:
            {
                Student st = new Student(id,name,dob);
                listOfStudents.add(st);
                break;
            }
            case 2:
            {
                System.out.print("Enter BA degree for the student : ");
                int BAdegree= scanner.nextInt();
                System.out.print("Enter the supervisor for the student : ");
                String supervisor= scanner.next();
                Student Masetr = new MasterStudent(id,name,dob,BAdegree,supervisor);
                listOfStudents.add(Masetr);
                break;
            }
            case 3:
            {
                Student Engineering = new EngineeringStudent(id,name,dob);
                listOfStudents.add(Engineering);
                break;
            }
            case 4:
            {
                System.out.print("Enter the hospital for the student : ");
                String hospital= scanner.next();
                Student Medical = new MedicalStudent(id,name,dob,hospital);
                listOfStudents.add(Medical);
                break;
            }
        }
        System.out.println("");
        System.out.println("The add operation is successful .");
    }

    public Student retreive(int id ){
        count++;
        Student Stu = new Student() ;
        //Student stu = new Student() ;
        for (int i = 0; i < listOfStudents.size(); i++) {
            Stu = (Student) listOfStudents.get(i);
            if(id == Stu.getId())
            {
                System.out.println("this student is found . ");
                return Stu;
            }
        }

        System.out.println("No student have this id .");
        return null;
    }

    public void remove(int id) {
        count++;
        Student stu = new Student();
        for (int i = 0; i < listOfStudents.size(); i++) {
            stu = (Student) listOfStudents.get(i);
            if (id == stu.getId()) {
                listOfStudents.remove();
                System.out.println("the student is deleted");
            } else {
                System.out.println("the student doesn't found");
            }
        }
    }
    public boolean checkStudent(int id){
        Student stu = new Student();
        for (int i = 0; i < listOfStudents.size(); i++) {
            stu = (Student) listOfStudents.get(i);
            if (id == stu.getId()) {
                return true;
            }
        }
        return false;
    }
}
