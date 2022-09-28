package najah.edu.cap.assignment1;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {


        menu options =new menu();
        options.printMenu();
        System.out.print("Enter date of birth in YYYY-MM-DD format: ");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        //scanner.close();
        LocalDate dob = LocalDate.parse(date);

        Student st = new Student(19 , "Nama'",dob);

        University najah = new University();
        najah.add(st);
        //Student s =najah.retreive(110);
        //s.printInfo();


        //najah.remove(19);
        //najah.retreive(19);

        System.out.print("Enter your choice : ");
        int choice = scanner.nextInt();
        int id;
        Student stu;
        //public void enterChoice(int choice){
            switch(choice){
                case 1://add students
                {

                }
                case 2://delete student
                {
                    System.out.print("Enter id for the student to delete him/her : ");
                    id = scanner.nextInt();
                    najah.remove(id);
                    /**stu = new Student();
                    for (int i = 0; i < najah.listOfStudents.size(); i++) {
                        stu = (Student) najah.listOfStudents.get(i);
                        if (id == stu.getId()) {
                            najah.remove(id);
                        }
                        }**/
                        break;
                }
                case 3:{//retrieve student
                    System.out.print("Enter id for the student to delete him/her : ");
                    id = scanner.nextInt();
                    najah.retreive(id);
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
                        if(s.equals(st))
                            System.out.println("It's the same student .");
                    } else
                        System.out.println("There is no student with this id .");
                    break;
                }
                case 8:
                {

                }
                default:
                    System.out.println("Exit");
                }
        //    }
        //najah.createList();
        //String NumberOfStudents = scanner.nextLine();
        //createList(NumberOfStudents);

        /**
        Student st2 = new Student(190, "Nama'",dob);
        st.equals(st2);
        st.printInfo();
        int age= st.getAge();
        System.out.println("your age is : " + age);

        Student Masetr = new MasterStudent(19, "Nama'" , dob ,3 ,"Amjad");
        //System.out.print("Enter a string: ");
        //Scanner scanner2= new Scanner(System.in); //System.in is a standard input stream
        //String paper= scanner.nextLine();
        //scanner2.close();//reads string
        //System.out.print("You have entered: "+paper);
        //String ff =((MasterStudent) Masetr).submitResearch(paper);
        //String ff =((MasterStudent) Masetr).submitResearch();
        //System.out.println(ff);
        ((MasterStudent) Masetr).submitResearch();
        System.out.println("your research is : " + ((MasterStudent) Masetr).getResearch());

        st.equals(((MasterStudent) Masetr));

        Student eng = new EngineeringStudent(19,"farha",dob);
        ((EngineeringStudent) eng).submitReport();
        System.out.println("your research is : " + ((EngineeringStudent)eng).getLabReport());

        ((EngineeringStudent) eng).printInfo();**/
    }
}
