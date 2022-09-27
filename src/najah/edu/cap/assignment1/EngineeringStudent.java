package najah.edu.cap.assignment1;

import java.time.LocalDate;
import java.util.Scanner;

public class EngineeringStudent extends Student{

    public String getLabReport() {
        return labReport;
    }
    public String labReport = null;

    public EngineeringStudent(int id, String name, LocalDate DateOfBirth) {
        super(id, name, DateOfBirth);
    }
    public void submitReport(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your lab report : ");
        String report= scanner.nextLine();
        labReport = report;
    }
    protected void printInfo(){
        super.printInfo();
        System.out.println(", report is: " + labReport);
    }
}
