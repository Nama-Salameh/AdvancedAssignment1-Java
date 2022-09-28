package najah.edu.cap.assignment1;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {


        menu options =new menu();
        options.printMenu();

        University najah = new University();

        //System.out.print("To add student must enter date of birth in YYYY-MM-DD format: ");
        Scanner scanner = new Scanner(System.in);
        //String date = scanner.nextLine();
        LocalDate dob = LocalDate.of(2003,01,19);

        Student Masetr = new MasterStudent(10, "Nama'" , dob ,3 ,"Amjad");
        Student Medical = new MedicalStudent(12,"Sama",dob,"Najah hospital");
        Student Engineering = new EngineeringStudent(15,"Ahmad",dob);
        Student st = new Student(19 , "Nama'",dob);

        System.out.print("Enter your choice : ");
        int choice = scanner.nextInt();
        //= scanner.nextInt();
        int id;
        Student stu;
        while (choice != 100){
            switch(choice){
                case 1://add students
                {
                    najah.add();
                    break;
                }
                case 2://delete student
                {
                    System.out.print("Enter id for the student to delete him/her : ");
                    id = scanner.nextInt();
                    najah.remove(id);
                    break;
                }
                case 3:{//retrieve student
                    System.out.print("Enter id for the student to delete him/her : ");
                    id = scanner.nextInt();
                    najah.retreive(id);
                    break;
                }
                case 4:{
                    System.out.print("The number of add, remove, retrieve operations = " + najah.count);
                    break;
                }
                case 5 :// print age
                {
                    System.out.print("Enter id for the student to get the age : ");
                    id = scanner.nextInt();
                    if(najah.checkStudent(id)){
                        Student s = najah.retreive(id);
                        int age = s.getAge();
                        System.out.println("the age is : " + age);
                        }else
                            System.out.println("There is no student with this id .");
                    break;
                    }
                case 6 : {
                    System.out.print("Enter id for the student to get all information for this student : ");
                    id = scanner.nextInt();
                    if (najah.checkStudent(id)) {
                        Student s = najah.retreive(id);
                        s.printInfo();
                    } else
                        System.out.println("There is no student with this id .");
                    break;
                }
                case 7:{
                    System.out.print("Enter id for the student to compare two students: ");
                    id = scanner.nextInt();
                    if (najah.checkStudent(id)) {
                        Student s = najah.retreive(id);
                        if(s.equals(st)) {
                            System.out.println("It's the same student .");
                        }else
                            System.out.println("There is no student with this id .");
                    } else
                        System.out.println("There is no student with this id .");
                    break;
                }
                case 8:
                {
                    int degree = ((MasterStudent)Masetr).getBAdegree();
                    System.out.println("The degree is : " + degree);
                    break;
                }
                case 9: {
                    ((MasterStudent) Masetr).submitResearch();
                    String Masresearch = (((MasterStudent) Masetr).getResearch());
                    System.out.println("the research is " + Masresearch);
                    break;
                }
                case 10: {
                    //((MasterStudent) Masetr).getSupervisor();
                    String supervisor = ((MasterStudent) Masetr).getSupervisor();
                    System.out.println("the research is " + supervisor);
                    break;
                }
               /** case 11: {
                    //((MasterStudent) Masetr).submitResearch();
                    String Masresearch = ((MasterStudent) Masetr).getResearch();
                    System.out.println("the research is " + Masresearch);
                    break;
                }**/
                case 11: {
                    ((MedicalStudent) Medical).getHospital();
                    String hospital = ((MedicalStudent) Medical).getHospital();
                    System.out.println("the hospital is " + hospital);
                    break;
                }
                case 12: {
                    ((MedicalStudent) Medical).submitResearch();
                    String Mresearch = ((MedicalStudent) Medical).getMresearch();
                    System.out.println("the research is " + Mresearch);
                    break;
                }
                case 13: {
                    ((EngineeringStudent) Engineering).submitReport();
                    String report = ((EngineeringStudent) Engineering).getLabReport();
                    System.out.println("the report is " + report);
                    break;
                }
                case 14 :
                    return;
                default:
                    break;
            }
            System.out.println("");
            System.out.print("Enter your choice : ");
            choice = scanner.nextInt();
        }
    }
}
