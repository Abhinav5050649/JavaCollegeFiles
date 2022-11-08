import java.io.*;
import java.util.*;

class Employee{
    public
    int empID;
    String name;

    Employee()
    {
        this.empID = 0;
        this.name = "";
    }

    Employee(int id, String nameE)
    {
        this.empID = id;
        this.name = nameE;
    }

    public void printDetails()
    {
        System.out.println("Employee Id = " + this.empID + "\nEmployee Name = " + this.name);
    }
}

class Professor extends Employee
{
    public
    String subject;

    Professor()
    {
        super();
        this.subject = "";
    }

    Professor(int id, String nameE, String sub)
    {
        super(id, nameE);
        this.subject = sub;
    }

    public void printDetails()
    {
        System.out.println("Employee Id = " + this.empID + "\nEmployee Name = " + this.name + "\nSubject Employee Teaches = " + this.subject);
    }
}

class Engineer extends Employee
{
    public
    String specialization;

    Engineer()
    {
        super();
        this.specialization = "";
    }


    Engineer(int id, String nameE, String s)
    {
        super(id, nameE);
        this.specialization = s;
    }
}

class AssitantProfessor extends Professor
{
    public
    String guide;

    AssitantProfessor()
    {
        super();
        this.guide = "";
    }

    AssitantProfessor(int id, String nameE, String sub, String G)
    {
        super(id, nameE, sub);
        this.guide = G;
    }

    public void printDetails()
    {
        System.out.println("Employee Id = " + this.empID + "\nEmployee Name = " + this.name + "\nSubject Employee Teaches = " + this.subject + "\nGuide of Employee = " + this.guide);
    }
}

public class java9To11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Professor p = new Professor(1, "XYZ", "DS");
        AssitantProfessor asp = new AssitantProfessor(2, "XYZ_J", "A", "XYZ");
        Engineer en = new Engineer(3, "Ku", "CS");
        
        p.printDetails();
        asp.printDetails();
        en.printDetails();
        
        sc.close();
    }
}
