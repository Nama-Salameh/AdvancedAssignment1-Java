package najah.edu.cap.assignment1;

import java.time.LocalDate;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        System.out.print("Enter date of birth in YYYY-MM-DD format: ");
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        //scanner.close();
        LocalDate dob = LocalDate.parse(date);

        Student st = new Student(19 , "Nama'",dob);


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
