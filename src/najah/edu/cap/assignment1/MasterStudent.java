package najah.edu.cap.assignment1;

import java.time.LocalDate;
import java.util.Scanner;

public class MasterStudent extends Student{
    public int getBAdegree() {
        return BAdegree;
    }

    public int BAdegree;
    public String getResearch() {
        return labResearch;
    }

    public String labResearch = null;
    public String getSupervisor() {
        return supervisor;
    }

    public String supervisor;
    public MasterStudent(int id, String name, LocalDate DateOfBirth , int degree, String supervisor) {
        super(id, name, DateOfBirth);
        this.BAdegree = degree;
        this.supervisor = supervisor;
    }
    public void submitResearch(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your research: ");
        String research= scanner.nextLine();
        labResearch = research;
    }

    @Override
    protected void printInfo(){
        super.printInfo();
        System.out.println(", degree is : " + BAdegree + ", supervisor is : " + supervisor +", research is : "+labResearch);
    }

}
