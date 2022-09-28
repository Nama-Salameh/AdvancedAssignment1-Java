package najah.edu.cap.assignment1;

import java.time.LocalDate;
import java.util.Scanner;

public class MedicalStudent extends Student{
    public String getHospital() {
        return Hospital;
    }

    public String Hospital;

    public String getMresearch() {
        return Mresearch;
    }

    public String Mresearch;

    public MedicalStudent(int id, String name, LocalDate DateOfBirth, String hospital) {
        super(id, name, DateOfBirth);
        this.Hospital = hospital;
    }
    public void submitResearch(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your research: ");
        String research= scanner.nextLine();
        Mresearch = research;}
    protected void printInfo(){
        super.printInfo();
        System.out.println(", hospital is : " + Hospital);
    }
}
