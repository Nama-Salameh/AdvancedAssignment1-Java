package najah.edu.cap.assignment1;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    public int getId() {
        return id;
    }

    public int id ;
    public String name ;
    public LocalDate DateOfBirth ;

    public Student(){
        id =0 ;
        name = " ";
        DateOfBirth = LocalDate.now();
    }
    public Student(int id, String name, LocalDate DateOfBirth){
        this.id = id;
        this.name=name;
        this.DateOfBirth = DateOfBirth;
    }
    protected void printInfo(){
        System.out.println("Id : " + id + ", Name : " + name + ", date of birth is : " + DateOfBirth);
    }
    public int getAge(){
        LocalDate currentDate = LocalDate.now();
        if((DateOfBirth != null) && (currentDate != null)){
            return Period.between(DateOfBirth, currentDate).getYears();
        } else {
            return 0;
        }
    }
    @Override
    public boolean equals(Object obj){
        //casting
        Student st = (Student) obj;
        if(!(st.id == this.id)){
            //System.out.println("The two students don't have same values. ");
            return false;
        }
        if(!(st.name == this.name)){
            //System.out.println("The two students don't have same values. ");
            return false;
        }
        if(!(st.DateOfBirth == this.DateOfBirth)){
            //System.out.println("The two students don't have same values. ");
            return false;
        }
            //System.out.println("The two students have same values.  ");
        return true;
    }

}
