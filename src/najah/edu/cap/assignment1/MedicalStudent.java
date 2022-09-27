package najah.edu.cap.assignment1;

import java.time.LocalDate;

public class MedicalStudent extends Student{
    public String Hospital;

    public MedicalStudent(int id, String name, LocalDate DateOfBirth, String hospital) {
        super(id, name, DateOfBirth);
        this.Hospital = hospital;
    }
    protected void printInfo(){
        super.printInfo();
        System.out.println(", hospital is : " + Hospital);
    }
}
